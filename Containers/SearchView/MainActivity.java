import androidx.appcompat.app.AppCompatActivity; 
	 
import android.os.Bundle; 
import android.widget.ArrayAdapter; 
5	import android.widget.ListView; 
import android.widget.SearchView; 
 
import java.util.ArrayList; 
import java.util.List; 
	 
 
public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener { 
 
    ListView listView; 
    SearchView searchView; 
    ArrayAdapter<String> adapter; 
    List<String> fruitsList; 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
 
        searchView = findViewById(R.id.search_view); 
        listView = findViewById(R.id.search_list); 
 
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
	 
        adapter = new ArrayAdapter <>(this, R.layout.support_simple_spinner_dropdown_item,fruitsList); 
        listView.setAdapter(adapter); 
 
 
        searchView.setOnQueryTextListener(this); 
    } 
    @Override 
    public boolean onQueryTextSubmit(String query) { 
        return false; 
    } 
 
    @Override 
    public boolean onQueryTextChange(String newText) { 
        adapter.getFilter().filter(newText); 
        return false; 
    } 
} 