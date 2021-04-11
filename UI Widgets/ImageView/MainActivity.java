import androidx.appcompat.app.AppCompatActivity; 
	 
import android.os.Bundle; 
import android.view.View; 
import android.widget.ImageView; 
import android.widget.Toast; 
	 
public class MainActivity extends AppCompatActivity { 
	 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
	 
        ImageView imageView = findViewById(R.id.image_view); 
 
        imageView.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
                Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show(); 
            } 
        }); 
    } 
} 