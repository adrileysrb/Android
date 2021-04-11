import android.support.annotation.NonNull; 
import android.support.design.widget.BottomNavigationView; 
import android.support.v7.app.AppCompatActivity; 
import android.os.Bundle; 
import android.view.MenuItem; 
import android.widget.TextView; 
 
 
public class MainActivity extends AppCompatActivity { 
	 
    BottomNavigationView bottomNavigationView; 
    TextView textView; 
	 
    @Override 
    public void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
 
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation); 
        textView = (TextView) findViewById(R.id.textView); 
	 
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() { 
            @Override 
            public boolean onNavigationItemSelected(@NonNull MenuItem item) { 
                switch(item.getItemId()){ 
 
                    case R.id.home: 
                        textView.setText("Home Activity"); 
                        break; 
 
                    case R.id.camera: 
                        textView.setText("Camera Activity"); 
                        break; 
 
                    case R.id.profile: 
                        textView.setText("Profile Activity"); 
                        break; 
                } 
                return true; 
            } 
        }); 
 
    } 
}