import androidx.appcompat.app.AppCompatActivity; 
 
import android.graphics.Color; 
import android.os.Bundle; 
import android.os.Handler; 
import android.view.View; 
import android.widget.Button; 
import android.widget.ProgressBar; 
import android.widget.RelativeLayout; 
import android.widget.TextView; 
	 
public class MainActivity extends AppCompatActivity { 
	 
    TextView textView; 
    ProgressBar progressBar; 
    Button buttonStart; 
	 
    Handler handler; 
    int progress=0; 
	 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
 
        textView = findViewById(R.id.text_view); 
        progressBar = findViewById(R.id.progess_bar); 
        buttonStart = findViewById(R.id.progress_button1); 
 
        buttonStart.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
 
                handler = new Handler(); 
                handler.postDelayed(new Runnable() { 
                    @Override 
                    public void run() { 
                        if (progressBar.getProgress() < 100) { 
                            progressBar.setProgress(progress); 
                            progress++; 
                            handler.postDelayed(this, 100); 
                            textView.setText("Wait..."); 
                        } else textView.setText("finished"); 
                    } 
 
                },100); 
            } 
        }); 
    } 
} 
	 