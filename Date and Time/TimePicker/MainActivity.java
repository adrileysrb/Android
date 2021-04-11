import androidx.appcompat.app.AppCompatActivity; 
	 
import android.os.Bundle; 
import android.widget.TimePicker; 
import android.widget.Toast; 
	 
	 
public class MainActivity extends AppCompatActivity { 
 
    TimePicker timePicker; 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
	 
        timePicker = findViewById(R.id.time_picker); 
 
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() { 
            @Override 
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) { 
                Toast.makeText(MainActivity.this, hourOfDay+":"+minute, Toast.LENGTH_SHORT).show(); 
            } 
        }); 
    } 
} 
	 
