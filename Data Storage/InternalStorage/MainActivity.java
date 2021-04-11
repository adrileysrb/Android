import androidx.appcompat.app.AppCompatActivity; 
	 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.TextView; 
import android.widget.Toast; 
 
import java.io.BufferedReader; 
import java.io.FileInputStream; 
import java.io.FileOutputStream; 
import java.io.InputStreamReader; 
 
 
public class MainActivity extends AppCompatActivity{ 
 
    EditText editTextMessage; 
    Button buttonSave, buttonDisplay; 
    TextView textView; 
    String file = "myFile"; 
	 
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
 
                String message = editTextMessage.getText().toString().trim(); 

                try{ 
                    FileOutputStream stream = openFileOutput(file, MODE_PRIVATE); 
                    stream.write(message.getBytes()); 
                    stream.close(); 
                    Toast.makeText(getApplicationContext(), "Saved Successfully", Toast.LENGTH_LONG).show(); 
                } 
                catch (Exception e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
        }); 
 
        buttonDisplay.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
 
                try{ 
                    FileInputStream inputStream = openFileInput(file); 
                    InputStreamReader streamReader = new InputStreamReader(inputStream); 
                    BufferedReader bufferedReader = new BufferedReader(streamReader); 
                    String message; 
                    StringBuilder stringBuilder = new StringBuilder(); 
 
                    while ((message = bufferedReader.readLine()) != null){ 
                        stringBuilder.append(message); 
                    } 
                    textView.setText("Message: " +stringBuilder.toString()); 
                } 
                catch (Exception e){ 
                    e.printStackTrace(); 
                } 
            } 
        }); 
    } 
} 
	 