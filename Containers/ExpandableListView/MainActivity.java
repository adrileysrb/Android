import android.content.Context; 
import android.support.v7.app.AppCompatActivity; 
import android.os.Bundle; 
import android.view.LayoutInflater; 
import android.view.View; 
import android.view.ViewGroup; 
import android.widget.BaseExpandableListAdapter; 
import android.widget.ExpandableListView; 
import android.widget.TextView; 
import java.util.ArrayList; 
import java.util.HashMap; 
import java.util.List; 
	 
	 
public class MainActivity extends AppCompatActivity { 
	 
    ExpandableListView expandableListView; 
    HashMap<String, List<String>> listChild; 
    List<String> listHeader; 
    CustomAdapter customAdapter; 
 
    @Override 
    public void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
 
        expandableListView = (ExpandableListView) findViewById(R.id.expListView); 
        listChild = ExpandableListData.getData(); 
        listHeader = new ArrayList<String>(listChild.keySet()); 
        customAdapter = new CustomAdapter(this, listHeader, listChild); 
        expandableListView.setAdapter(customAdapter); 
 
    } 
} 
