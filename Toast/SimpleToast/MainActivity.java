import androidx.appcompat.app.AppCompatActivity; 
	 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
import android.widget.Toast; 
 
	 
public class MainActivity extends AppCompatActivity { 
	 
    Button buttonSort, buttonLong; 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
	 
        buttonSort = findViewById(R.id.short_toast); 
        buttonLong = findViewById(R.id.long_toast); 
	 
        buttonSort.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
                Toast.makeText(MainActivity.this, "Short Toast", Toast.LENGTH_SHORT).show(); 
            } 
        }); 
 
        buttonLong.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
                Toast.makeText(MainActivity.this, "Long Toast", Toast.LENGTH_LONG).show(); 
            } 
        }); 
    } 
} 
	 
