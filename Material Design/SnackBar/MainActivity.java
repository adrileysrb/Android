// add following dependency to your app's build.gradle(Module: app) 
// implementation 'com.google.android.material:material:1.2.1' 
 
import androidx.appcompat.app.AppCompatActivity; 
import androidx.coordinatorlayout.widget.CoordinatorLayout; 
 
import android.graphics.Color; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
import android.widget.TextView; 
 
import com.google.android.material.snackbar.Snackbar; 
	 
 
public class MainActivity extends AppCompatActivity{ 
	 
    private CoordinatorLayout coordinatorLayout; 
    private Button button; 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
 
        coordinatorLayout=findViewById(R.id.coordinator_layout); 
        button=findViewById(R.id.snack_bar_btn); 
 
        button.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
                showSnackbar(); 
            } 
        }); 
    } 
    public void showSnackbar(){ 
        final Snackbar snackbar=Snackbar.make(coordinatorLayout,"this is a SnackBar",Snackbar.LENGTH_INDEFINITE) 
                .setAction("UNDO", new View.OnClickListener() { 
                    @Override 
                    public void onClick(View v) { 
                        Snackbar snackbar1=Snackbar.make(coordinatorLayout,"Undo successful",Snackbar.LENGTH_SHORT); 
                        View view=snackbar1.getView(); 
                        TextView textView=view.findViewById(R.id.snackbar_text); 
                        textView.setTextColor(Color.GREEN); 
                        snackbar1.show(); 
                    } 
                }) 
                .setActionTextColor(Color.RED); 
        View snackView=snackbar.getView(); 
        TextView textView=snackView.findViewById(R.id.snackbar_text); 
        textView.setTextColor(Color.YELLOW); 
        snackbar.show(); 
    } 
} 