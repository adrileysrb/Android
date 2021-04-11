import androidx.appcompat.app.AppCompatActivity; 
	 
import android.graphics.Color; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.RelativeLayout; 
import android.widget.Switch; 
	 
public class MainActivity extends AppCompatActivity { 
	 
    RelativeLayout layout; 
    Switch aSwitch; 
	 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
	 
	 
        layout = findViewById(R.id.layout); 
        aSwitch = findViewById(R.id.switch_btn); 
	 
        aSwitch.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) { 
	 
                if(aSwitch.isChecked()){ 
                    layout.setBackgroundColor(Color.YELLOW); 
                }else{ 
                    layout.setBackgroundColor(Color.CYAN); 
                } 
            } 
        }); 
    } 
} 
	 
