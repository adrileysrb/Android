import androidx.appcompat.app.AppCompatActivity; 
	 
import android.os.Bundle; 
import android.view.View; 
import android.widget.CheckedTextView; 
import android.widget.Toast; 
 
	 
public class MainActivity extends AppCompatActivity { 
	 
    CheckedTextView checkedTextView; 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
 
        checkedTextView = findViewById(R.id.checked_textview); 
 
        checkedTextView.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
 
                checkedTextView.toggle(); 
 
                if(checkedTextView.isChecked()){ 
                    Toast.makeText(MainActivity.this, "Checked", Toast.LENGTH_SHORT).show(); 
                }else{ 
                    Toast.makeText(MainActivity.this, "Unchecked", Toast.LENGTH_SHORT).show(); 
                } 
            } 
        }); 
    } 
} 
	 
