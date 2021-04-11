// add following dependency to your app's build.gradle(Module: app) 
// implementation 'com.google.android.material:material:1.2.1' 
 
import androidx.appcompat.app.AppCompatActivity; 

import android.os.Bundle; 
import android.view.View; 
import android.widget.Toast; 
 
import com.google.android.material.floatingactionbutton.FloatingActionButton; 
 
 
public class MainActivity extends AppCompatActivity{ 
 
    FloatingActionButton floatingActionButton; 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
 
        floatingActionButton = findViewById(R.id.fab); 

        floatingActionButton.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
 
                Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_SHORT).show(); 
            } 
        }); 
    } 
} 
 
