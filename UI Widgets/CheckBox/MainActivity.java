import androidx.appcompat.app.AppCompatActivity; 
	 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
import android.widget.CheckBox; 
import android.widget.Toast; 
 
public class MainActivity extends AppCompatActivity { 
	 
    CheckBox ch1,ch2,ch3; 
    Button button; 
	 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
	 
        ch1 = findViewById(R.id.checkb1); 
        ch2 = findViewById(R.id.checkb2); 
        ch3 = findViewById(R.id.checkb3); 
        button = findViewById(R.id.button_submit); 
	 
        button.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) { 
	 
                StringBuffer result = new StringBuffer(); 
	 
                if (ch1.isChecked()){ 
                    result.append(ch1.getText()); 
                }if (ch2.isChecked()){ 
                    result.append("\n"+ch2.getText()); 
                }if(ch3.isChecked()){ 
                    result.append("\n"+ch3.getText()); 
                } 
                if (ch1.isChecked() || ch2.isChecked() || ch3.isChecked()){ 
                    Toast.makeText(MainActivity.this, ""+result, Toast.LENGTH_SHORT).show(); 
                } 
            } 
        }); 
    } 
} 