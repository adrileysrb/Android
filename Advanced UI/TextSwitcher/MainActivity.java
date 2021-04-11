import android.app.Activity; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
import android.widget.TextSwitcher; 
import android.widget.TextView; 
import android.widget.ViewSwitcher; 
 
	 
public class MainActivity extends Activity implements View.OnClickListener { 
	 
    TextSwitcher textSwitcher; 
    Button btnPrevios, btnNext; 
    String[] QUOTES = { 
            "Let go of anything that brings you stress and sorrow.", 
            "Be like the flower that gives its fragrance even to the hand that crushes it.", 
            "The tongue is like a lion. if you let it loose , it will wound someone.", 
            "It is easier to turn a mountain into dust than to create love in a heart that filled with hatred.", 
            "Anger is like a ball of fire, but if you swallow it, it’s sweeter than honey.", 
            "Forgiveness is the best revenge.", 
            "Conquer your lustful desires and your wisdom will be perfected.", 
            "There are two ways to live a pleasant life, either in someone’s heart or in someones’s prayer.", 
            "Evil doers never think well of anyone because they see others in their own nature.", 
            "Do not be a slave to others when Allah has created you free." 
    }; 
    int currentIndex = -1; 
	 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
 
        btnPrevios = (Button) findViewById(R.id.btnPrevious); 
        btnNext = (Button) findViewById(R.id.btnNext); 
        btnPrevios.setOnClickListener(this); 
        btnPrevios.setOnClickListener(this); 
	 
        textSwitcher = (TextSwitcher) findViewById(R.id.textSwitcher); 

        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() { 
            @Override 
            public View makeView() { 
                TextView text = new TextView(getApplicationContext()); 
                text.setTextSize(26); 
                text.setTextAlignment(View.TEXT_ALIGNMENT_CENTER); 
                text.setTextColor(getResources().getColor(R.color.white)); 
                return text; 
            } 
        }); 
    } 
 
    public void onClick(View view) { 
        switch (view.getId()){ 
            case R.id.btnNext: 
                if(currentIndex<QUOTES.length-1){ 
                    currentIndex = currentIndex+1; 
                    textSwitcher.setText(QUOTES[currentIndex]); 
                } 
                break; 
 
            case R.id.btnPrevious: 
                if (currentIndex>0){ 
                    currentIndex = currentIndex-1; 
                    textSwitcher.setText(QUOTES[currentIndex]); 
                } 
                break; 
        } 
    } 
}