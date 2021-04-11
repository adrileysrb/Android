import androidx.appcompat.app.AppCompatActivity; 
	 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
import android.widget.RatingBar; 
import android.widget.Toast; 
 
public class MainActivity extends AppCompatActivity { 
	 
    RatingBar ratingBar; 
    Button button; 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
	 
        ratingBar = findViewById(R.id.rating1); 
        button = findViewById(R.id.button4); 
	 
        button.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
                float rattingvlue = ratingBar.getRating(); 
                Toast.makeText(MainActivity.this, "Rating: " + rattingvlue, Toast.LENGTH_SHORT).show(); 
            } 
        }); 
    } 
} 