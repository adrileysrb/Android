import androidx.appcompat.app.AppCompatActivity; 
	 
import android.os.Bundle; 
import android.view.Menu; 
import android.view.MenuItem; 
import android.widget.Toast; 
 
	 
public class MainActivity extends AppCompatActivity { 
	 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
 
    } 
    @Override 
    public boolean onCreateOptionsMenu(Menu menu) { 
        getMenuInflater().inflate(R.menu.menu_item,menu); 
        return true; 
    } 
 
    @Override 
    public boolean onOptionsItemSelected(MenuItem item) { 
 
        switch (item.getItemId()){ 
            case R.id.item1: 
                Toast.makeText(this, "Item one selected", Toast.LENGTH_SHORT).show(); 
                return true; 
            case R.id.item2: 
                Toast.makeText(this, "Item two selected", Toast.LENGTH_SHORT).show(); 
                return true; 
            case R.id.item3: 
                Toast.makeText(this, "Item three selected", Toast.LENGTH_SHORT).show(); 
                return true; 
            case R.id.item4: 
                Toast.makeText(this, "Item four selected", Toast.LENGTH_SHORT).show(); 
                return true; 
            case R.id.sub_item1: 
                Toast.makeText(this, "Sub Item one  selected", Toast.LENGTH_SHORT).show(); 
                return true; 
            case R.id.sub_item2: 
                Toast.makeText(this, "Sub Item two selected", Toast.LENGTH_SHORT).show(); 
                return true; 
            default: 
                return super.onOptionsItemSelected(item); 
        } 
    } 
} 