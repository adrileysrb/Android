import androidx.appcompat.app.AppCompatActivity; 
	 
import android.app.DatePickerDialog; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.DatePicker; 
import android.widget.EditText; 
 
import java.util.Calendar; 
	 
	 
public class MainActivity extends AppCompatActivity { 
	 
    EditText editTextDate; 
    DatePickerDialog.OnDateSetListener onDateSetListener; 
	 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
	 
        editTextDate = findViewById(R.id.edit_date_view); 
 
        editTextDate.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
                Calendar calendar = Calendar.getInstance(); 
                int year= calendar.get(Calendar.YEAR); 
                int month = calendar.get(Calendar.MONTH); 
                int day = calendar.get(Calendar.DAY_OF_MONTH); 
 
                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, 
                        onDateSetListener,year,month,day); 
 
                datePickerDialog.show(); 
            } 
        }); 
        onDateSetListener = new DatePickerDialog.OnDateSetListener() { 
            @Override 
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) { 
                month =month+1; 
                String date = dayOfMonth +"/"+month+"/"+year; 
                editTextDate.setText(date); 
            } 
        }; 
    } 
} 