import androidx.appcompat.app.AppCompatActivity; 
	 
import android.graphics.Color; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.RelativeLayout; 
import android.widget.ToggleButton; 
 
public class MainActivity extends AppCompatActivity { 
	 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
	 
        final RelativeLayout layout = findViewById(R.id.layout); 
        final ToggleButton toggleButton = findViewById(R.id.toggle_button); 
	 
        toggleButton.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) { 
	 
                if(toggleButton.isChecked()){ 
                    layout.setBackgroundColor(Color.CYAN); 
                }else{ 
                    layout.setBackgroundColor(Color.YELLOW); 
                } 
            } 
        }); 
    } 
} 
	 
