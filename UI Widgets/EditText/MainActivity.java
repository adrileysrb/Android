import androidx.appcompat.app.AppCompatActivity; 
	 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.Toast; 
	 
public class MainActivity extends AppCompatActivity { 
	 
    EditText userName,userEmail,userPassword; 
    Button submitBtn; 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
	 
        userName = findViewById(R.id.name); 
        userEmail = findViewById(R.id.email); 
        userPassword = findViewById(R.id.password); 
        submitBtn = findViewById(R.id.submit_btn); 
	 
        submitBtn.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) { 
                String name = userName.getText().toString().trim(); 
                String email = userEmail.getText().toString().trim(); 
                String password = userPassword.getText().toString().trim(); 
 
                Toast.makeText(MainActivity.this, "Name: "+name+"\n\n Email: "+email+ 
                        "\n\n Password: "+password, Toast.LENGTH_LONG).show(); 
            } 
        }); 
    } 
} 
	 
