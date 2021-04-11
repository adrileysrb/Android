import androidx.appcompat.app.AppCompatActivity; 
 
import android.os.Bundle; 
import android.view.Gravity; 
import android.view.View; 
import android.widget.Button; 
import android.widget.TextSwitcher; 
import android.widget.TextView; 
import android.widget.ViewSwitcher; 
	 
 
public class MainActivity extends AppCompatActivity { 
	 
    TextSwitcher textSwitcher; 
    Button buttonPrivious ,buttonNext; 
 
    String[] lists ={ 
            "Nobody can hurt me without my permission.", 
            "Live as if you were to die tomorrow. Learn as if you were to live forever.", 
            "The future depends on what you do today.", 
            "Be the change that you want to see in the world.", 
            "I will not let anyone walk through my mind with their dirty feet.", 
            "You don’t know who is important to you until you actually lose them."}; 
 
    int position = -1; 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
 
        textSwitcher= findViewById(R.id.text_switcher); 
        buttonNext= findViewById(R.id.button_next); 
        buttonPrivious= findViewById(R.id.button_previous); 
	 
        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() { 
            @Override 
            public View makeView() { 
                TextView textView=new TextView(getApplicationContext()); 
                textView.setTextSize(18); 
                textView.setTextColor(getResources().getColor(R.color.colorPrimary)); 
                textView.setGravity(Gravity.CENTER); 
                return textView; 
            } 
        }); 
 
        buttonNext.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
                if(position<lists.length-1) { 
                    position = position + 1; 
                    textSwitcher.setText(lists[position]); 
                } 
            } 
        }); 
 
        buttonPrivious.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
                if(position>0){ 
                    position=position-1; 
                    textSwitcher.setText(lists[position]); 
                } 
            } 
        }); 
    } 
} 
	 
