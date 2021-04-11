import androidx.appcompat.app.AppCompatActivity; 
	 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
 
 
public class MainActivity extends AppCompatActivity{ 
 
    Button button; 
    boolean status = false; 
	 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
	 
        button = findViewById(R.id.button); 
 
        button.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
 
                if(!status){ 
                    getSupportFragmentManager().beginTransaction() 
                                    .replace(R.id.frame_layout,new FragmentA()).commit(); 
                    button.setText("Load Fragment Two"); 
                    status =true; 
                }else { 
                    getSupportFragmentManager().beginTransaction() 
                                    .replace(R.id.frame_layout,new FragmentB()).commit(); 
                    button.setText("Load Fragment One"); 
                    status = false; 
                } 
            } 
        }); 
    } 
} 
	 
