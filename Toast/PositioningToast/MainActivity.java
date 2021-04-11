import androidx.appcompat.app.AppCompatActivity; 
	 
import android.os.Bundle; 
import android.view.Gravity; 
import android.view.View; 
import android.widget.Toast; 
 
	 
public class MainActivity extends AppCompatActivity { 
	 
    Toast toast; 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
    } 
    public void buttonClick(View view) { 
	 
        switch (view.getId()){ 
            case R.id.simple_toast: 
                Toast.makeText(this, "Simple Toast", Toast.LENGTH_SHORT).show(); 
                break; 
 
            case R.id.top_toast: 
                toast= Toast.makeText(this,"Top",Toast.LENGTH_SHORT); 
                toast.setGravity(Gravity.TOP,0,0); 
                toast.show(); 
                break; 
	 
            case R.id.botton_toast: 
                toast= Toast.makeText(this,"Bottom",Toast.LENGTH_SHORT); 
                toast.setGravity(Gravity.BOTTOM,0,0); 
                toast.show(); 
                break; 
 
            case R.id.center_toast: 
                toast= Toast.makeText(this,"center",Toast.LENGTH_SHORT); 
                toast.setGravity(Gravity.CENTER,0,0); 
                toast.show(); 
                break; 
	 
            case R.id.left_toast: 
                toast= Toast.makeText(this,"Left",Toast.LENGTH_SHORT); 
                toast.setGravity(Gravity.START,0,0); 
                toast.show(); 
                break; 
	 
            case R.id.right_toast: 
                toast= Toast.makeText(this,"Right",Toast.LENGTH_SHORT); 
                toast.setGravity(Gravity.END,0,0); 
                toast.show(); 
                break; 
	 
            case R.id.top_left_toast: 
                toast= Toast.makeText(this,"Top-left",Toast.LENGTH_SHORT); 
                toast.setGravity(Gravity.TOP | Gravity.START,0,0); 
                toast.show(); 
                break; 
	 
            case R.id.top_right_toast: 
                toast= Toast.makeText(this,"Top-right",Toast.LENGTH_SHORT); 
                toast.setGravity(Gravity.TOP | Gravity.END,0,0); 
                toast.show(); 
                break; 
	 
            case R.id.bottom_left_toast: 
                toast= Toast.makeText(this,"Bottom-left",Toast.LENGTH_SHORT); 
                toast.setGravity(Gravity.BOTTOM | Gravity.START,0,0); 
                toast.show(); 
                break; 
	 
            case R.id.bottom_right_toast: 
                toast= Toast.makeText(this,"Bottom-right",Toast.LENGTH_SHORT); 
                toast.setGravity(Gravity.BOTTOM | Gravity.END,0,0); 
                toast.show(); 
                break; 
        } 
	 
    } 
} 