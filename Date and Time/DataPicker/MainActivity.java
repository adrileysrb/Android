import androidx.appcompat.app.AppCompatActivity; 
	 
import android.os.Bundle; 
import android.widget.DatePicker; 
import android.widget.Toast; 
 
import java.util.Calendar; 
 
	 
public class MainActivity extends AppCompatActivity { 
	 
    DatePicker datePicker; 
	 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
	 
        datePicker = findViewById(R.id.date_picker); 
	 
        Calendar calendar = Calendar.getInstance(); 
        datePicker.init(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), 
                new DatePicker.OnDateChangedListener() { 
            @Override 
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) { 
                monthOfYear = monthOfYear + 1; 
                String date = dayOfMonth + "/" + monthOfYear + "/" + year; 
                Toast.makeText(MainActivity.this, date, Toast.LENGTH_SHORT).show(); 
            } 
        }); 
    } 
} 
	 
