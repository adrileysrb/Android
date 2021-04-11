import androidx.appcompat.app.AppCompatActivity; 
	 
import android.os.Bundle; 
import android.os.SystemClock; 
import android.view.View; 
import android.widget.Button; 
import android.widget.Chronometer; 
	 
 
public class MainActivity extends AppCompatActivity { 
	 
    Chronometer chronometer; 
    Button buttonStart, buttonStop, buttonRestart; 
	 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
	 
        chronometer = findViewById(R.id.chronometer1); 
	 
        buttonStart = findViewById(R.id.start_chronometer); 
        buttonStop = findViewById(R.id.stop_chronometer); 
        buttonRestart = findViewById(R.id.restart_chronometer); 
	 
        buttonStart.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
                chronometer.start(); 
            } 
        }); 
 
        buttonStop.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
                chronometer.stop(); 
            } 
        }); 
 
        buttonRestart.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
                chronometer.setBase(SystemClock.elapsedRealtime()); 
            } 
        }); 
    } 
} 