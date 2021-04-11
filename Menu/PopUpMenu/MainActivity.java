import androidx.appcompat.app.AppCompatActivity; 
	 
import android.os.Bundle; 
import android.view.MenuItem; 
import android.view.View; 
import android.widget.Button; 
import android.widget.PopupMenu; 
import android.widget.Toast; 
	 
	 
public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{ 
	 
    Button button; 
	 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
	 
        button = findViewById(R.id.button_popup); 
	 
        button.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
	 
                PopupMenu popupMenu=new PopupMenu(getApplicationContext(),button); 
                popupMenu.inflate(R.menu.menu_item); 
                popupMenu.show(); 
                popupMenu.setOnMenuItemClickListener(MainActivity.this); 
            } 
        }); 
    } 
    @Override 
    public boolean onMenuItemClick(MenuItem item) { 
 
        switch (item.getItemId()){ 
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
            case R.id.item5: 
                Toast.makeText(this, "Item 5 selected", Toast.LENGTH_SHORT).show(); 
                return true; 
            default: 
                return false; 
        } 
    } 
} 