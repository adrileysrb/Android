import androidx.appcompat.app.AppCompatActivity; 
	 
import android.os.Bundle; 
import android.widget.ArrayAdapter; 
import android.widget.AutoCompleteTextView; 
 
import java.util.ArrayList; 
import java.util.List; 
 
	 
public class MainActivity extends AppCompatActivity { 
	 
    AutoCompleteTextView autoCompleteTextView; 
    List<String> fruitsList; 
	 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
	 
	 
        autoCompleteTextView = findViewById(R.id.autocomplete_tv); 
        fruitsList = new ArrayList<>(); 
 
        fruitsList.add("Apples"); 
        fruitsList.add("Apricots"); 
        fruitsList.add("Bananas"); 
        fruitsList.add("Blackberry"); 
        fruitsList.add("Blueberry"); 
        fruitsList.add("Cherries"); 
        fruitsList.add("Cranberry"); 
        fruitsList.add("Sugar-apple"); 
        fruitsList.add("Pitaya"); 
        fruitsList.add("Common fig"); 
        fruitsList.add("Cranberry"); 
        fruitsList.add("Jackfruit"); 
        fruitsList.add("Mangos"); 
        fruitsList.add("Papayas"); 
	 
 
        ArrayAdapter<String> adapter = new ArrayAdapter <>(this, 
                R.layout.support_simple_spinner_dropdown_item,fruitsList); 
        autoCompleteTextView.setAdapter(adapter); 
    } 
} 
	 