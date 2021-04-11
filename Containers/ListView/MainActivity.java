import androidx.appcompat.app.AppCompatActivity; 
 
import android.os.Bundle; 
import android.view.View; 
import android.widget.AdapterView; 
import android.widget.ArrayAdapter; 
import android.widget.ListView; 
import android.widget.Toast; 
 
import java.util.ArrayList; 
import java.util.List; 
	 
	 
public class MainActivity extends AppCompatActivity { 
	 
    ListView listView; 
    List<String> fruitsList; 
	 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
	 
        listView = findViewById(R.id.list_view); 
 
	 
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
        fruitsList.add("Guava"); 
        fruitsList.add("Jackfruit"); 
        fruitsList.add("Orange"); 
        fruitsList.add("Papaya"); 
        fruitsList.add("Pear"); 
        fruitsList.add("Pineapple"); 
	 
        ArrayAdapter<String> adapter = new ArrayAdapter <>(this, 
                R.layout.support_simple_spinner_dropdown_item,fruitsList); 
        listView.setAdapter(adapter); 
	 
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { 
            @Override 
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) { 
                Toast.makeText(getApplicationContext(),"you selected "+ 
                        fruitsList.get(position),Toast.LENGTH_SHORT).show(); 
            } 
        }); 
    } 
} 
	 