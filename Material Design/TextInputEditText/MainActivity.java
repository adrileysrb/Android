import android.support.design.widget.TextInputEditText; 
import android.support.v7.app.AppCompatActivity; 
import android.os.Bundle; 
import android.text.TextUtils; 
import android.view.View; 
import android.widget.Button; 
import android.widget.Toast; 
 
 
public class MainActivity extends AppCompatActivity { 
 
    TextInputEditText userName, userPassword; 
    Button registerBtn; 
 
    @Override 
    public void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
 
        userName = (TextInputEditText) findViewById(R.id.userName); 
        userPassword = (TextInputEditText) findViewById(R.id.password); 
 
        registerBtn = (Button) findViewById(R.id.registerbtn); 
 
        registerBtn.setOnClickListener(new View.OnClickListener() { 
            @Override 
           public void onClick(View v) { 
                register(); 
            } 
        }); 
 
    } 
 
    private void register() { 
        String username = userName.getText().toString().trim(); 
        String password = userPassword.getText().toString().trim(); 
 
        if(checkUsername(username) && checkPassword(password)){ 
            Toast.makeText(this, "You have been Registerd !", Toast.LENGTH_SHORT).show(); 
        } 
    } 
 
    private boolean checkUsername(String username){ 
 
        if(TextUtils.isEmpty(username)) { 
            userName.setError("Please enter a username"); 
            return false; 
        } 
        return true; 
    } 
 
    private boolean checkPassword(String password){ 
 
        if(TextUtils.isEmpty(password)) { 
            userPassword.setError("Please enter a password"); 
            return false; 
        } 
        else if(password.length() < 6 || password.length() > 10){ 
            userPassword.setError("Password should be between 6 to 10 characters"); 
            return false; 
        } 
        return true; 
    } 
} 
