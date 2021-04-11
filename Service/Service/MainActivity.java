import androidx.appcompat.app.AppCompatActivity; 
 
import android.content.Intent; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
 
 
public class MainActivity extends AppCompatActivity{ 
	 
    Button buttonPlay,buttonStop; 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
 
        buttonPlay = findViewById(R.id.button_play); 
        buttonStop = findViewById(R.id.button_stop); 
 
        buttonPlay.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
                Intent intent=new Intent(MainActivity.this,MyService.class); 
                startService(intent); 
            } 
        }); 
 
        buttonStop.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
                Intent intent=new Intent(MainActivity.this,MyService.class); 
                stopService(intent); 
            } 
        }); 
    } 
} 