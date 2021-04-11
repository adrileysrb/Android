import androidx.appcompat.app.AppCompatActivity; 
	 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
import android.widget.EditText; 
 
	 
public class MainActivity extends AppCompatActivity{ 
	 
    Button button; 
    EditText userName; 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
 
        button = findViewById(R.id.button); 
        userName = findViewById(R.id.user_name); 
 
        button.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
	 
                String name = userName.getText().toString().trim(); 
                getSupportFragmentManager().beginTransaction() 
                                   .replace(R.id.frame_layout,new MyFragment(name)).commit(); 
            } 
        }); 
    } 
} 