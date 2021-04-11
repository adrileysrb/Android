import androidx.appcompat.app.AppCompatActivity; 
	 
import android.content.Context; 
import android.content.SharedPreferences; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.TextView; 
import android.widget.Toast; 
 
	 
public class MainActivity extends AppCompatActivity{ 
 
    EditText editTextMessage; 
    Button buttonSave, buttonDisplay; 
    TextView textView; 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
 
        editTextMessage = findViewById(R.id.edit_message); 
        buttonSave = findViewById(R.id.button_save); 
        buttonDisplay = findViewById(R.id.button_display); 
        textView = findViewById(R.id.message_display); 
	 
        buttonSave.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
                SharedPreferences sharedPreferences = getSharedPreferences("userMassage", Context.MODE_PRIVATE); 
                SharedPreferences.Editor editor = sharedPreferences.edit(); 
                editor.putString("message", editTextMessage.getText().toString().trim()); 
                editor.apply(); 
                Toast.makeText(getApplicationContext(), "Saved Successfully", Toast.LENGTH_SHORT).show(); 
            } 
        }); 
 
        buttonDisplay.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
                SharedPreferences sharedPreferences = getSharedPreferences("userMassage", Context.MODE_PRIVATE); 
                String message = sharedPreferences.getString("message", ""); 
                textView.setText("Message: "+message); 
            } 
        }); 
    } 
} 