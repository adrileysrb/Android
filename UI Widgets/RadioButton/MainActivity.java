import androidx.appcompat.app.AppCompatActivity; 
 
import android.os.Bundle; 
import android.widget.RadioButton; 
import android.widget.RadioGroup; 
import android.widget.Toast; 
	 
public class MainActivity extends AppCompatActivity { 
	 
    RadioGroup radioGroup; 
    RadioButton male,female; 
	 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
	 
        radioGroup= findViewById(R.id.radiogp1); 
        male= findViewById(R.id.radiob1); 
        female= findViewById(R.id.radiob2); 
	 
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { 
            @Override 
            public void onCheckedChanged(RadioGroup group, int checkedId) { 
                switch (checkedId) { 
                    case R.id.radiob1: 
                        Toast.makeText(MainActivity.this, "male", Toast.LENGTH_SHORT).show(); 
                        break; 
                    case R.id.radiob2: 
                        Toast.makeText(MainActivity.this, "female", Toast.LENGTH_SHORT).show(); 
                        break; 
                } 
            } 
        }); 
    } 
} 
	 