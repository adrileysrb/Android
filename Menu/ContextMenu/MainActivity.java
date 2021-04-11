import androidx.appcompat.app.AppCompatActivity; 
 
import android.os.Bundle; 
import android.view.ContextMenu; 
import android.view.MenuItem; 
import android.view.View; 
import android.widget.TextView; 
import android.widget.Toast; 
	 
	 
public class MainActivity extends AppCompatActivity { 
 
    TextView textView; 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
 
        textView = findViewById(R.id.text_context); 
        registerForContextMenu(textView); 
	 
    } 
    @Override 
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) { 
        super.onCreateContextMenu(menu, v, menuInfo); 
        menu.setHeaderTitle("Choose your Item"); 
        getMenuInflater().inflate(R.menu.menu_item, menu); 
 
    } 
    @Override 
    public boolean onContextItemSelected(MenuItem item) { 
 
        switch ((item.getItemId())){ 
            case R.id.item1: 
                Toast.makeText(this, "Item 1 selected", Toast.LENGTH_SHORT).show(); 
                return true; 
 
            case R.id.item2: 
                Toast.makeText(this, "Item 2 selected", Toast.LENGTH_SHORT).show(); 
                return true; 
 
            case R.id.item3: 
                Toast.makeText(this, "Item 3 selected", Toast.LENGTH_SHORT).show(); 
                return true; 
 
            case R.id.item4: 
                Toast.makeText(this, "Item 4 selected", Toast.LENGTH_SHORT).show(); 
                return true; 
 
            default: 
                return super.onContextItemSelected(item); 
        } 
    } 
} 
	 
