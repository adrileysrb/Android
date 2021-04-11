import androidx.appcompat.app.AppCompatActivity; 
	 
import android.os.Bundle; 
import android.view.Gravity; 
import android.view.View; 
import android.view.ViewGroup; 
import android.widget.Button; 
import android.widget.Toast; 
 
	 
public class MainActivity extends AppCompatActivity { 
	 
    Button button; 
    Toast toast; 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
 
        button = findViewById(R.id.button_customToast); 
 
        button.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
                toast=Toast.makeText(MainActivity.this,"", Toast.LENGTH_LONG); 
                toast.setGravity(Gravity.CENTER,0,0); 
                View view = getLayoutInflater().inflate(R.layout.custom_toast, 
                                    (ViewGroup)findViewById(R.id.custom_layout)); 
                toast.setView(view); 
                toast.show(); 
            } 
        }); 
    } 
} 