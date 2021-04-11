import androidx.appcompat.app.AppCompatActivity; 
	 
import android.app.TimePickerDialog; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.EditText; 
import android.widget.TimePicker; 
	 
import java.util.Calendar; 
	 
	 
public class MainActivity extends AppCompatActivity { 
	 
    EditText editTextTime; 
	 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
	 
        editTextTime = findViewById(R.id.edit_time_view); 
	 
        editTextTime.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
                Calendar calendar = Calendar.getInstance(); 
                int hour = calendar.get(Calendar.HOUR_OF_DAY); 
                int minute = calendar.get(Calendar.MINUTE); 
	 
                TimePickerDialog timePickerDialog; 
                timePickerDialog = new TimePickerDialog(MainActivity.this, 
                        new TimePickerDialog.OnTimeSetListener() { 
                            @Override 
                            public void onTimeSet(TimePicker view, int hourOfDay, int minute) { 
                                editTextTime.setText(hourOfDay + ":"+minute); 
                            } 
                        }, hour,minute,true); 
                timePickerDialog.setTitle("Choose Time"); 
                timePickerDialog.show(); 
            } 
        }); 
    } 
} 