//Add the following dependencies in your app gradle module 
//compile "com.android.support:recyclerview-v7:26.1.0" 
//compile "com.android.support:cardview-v7:26.1.0" 
import android.content.Context; 
import android.support.v7.app.AppCompatActivity; 
import android.os.Bundle; 
import android.support.v7.widget.CardView; 
import android.support.v7.widget.LinearLayoutManager; 
import android.support.v7.widget.RecyclerView; 
import android.view.LayoutInflater; 
import android.view.View; 
import android.view.ViewGroup; 
import android.widget.ImageView; 
import android.widget.TextView; 
import java.util.ArrayList; 
import java.util.List; 
 
 
public class MainActivity extends AppCompatActivity { 
	 
    RecyclerView recyclerView; 
    Context context; 
    private List<Club> clubs; 
 
    @Override 
    public void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
 
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView); 
 
        recyclerView.setHasFixedSize(true); 
 
        LinearLayoutManager layoutManager = new LinearLayoutManager(context); 
        recyclerView.setLayoutManager(layoutManager); 
 
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(clubs); 
 
        initializeData(); 
        initializeAdapter(); 
 
    } 
 
    private void initializeData(){ 
        clubs = new ArrayList<>(); 
        clubs.add(new Club("Chelsea", R.drawable.chelsea)); 
        clubs.add(new Club("Liverpool", R.drawable.liverpool)); 
        clubs.add(new Club("Real Madrid", R.drawable.real)); 
        clubs.add(new Club("Barcelona", R.drawable.barca)); 
        clubs.add(new Club("Bayern Munich", R.drawable.bayern)); 
        clubs.add(new Club("PSG", R.drawable.psg)); 
    } 
	 
    private void initializeAdapter(){ 
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(clubs); 
        recyclerView.setAdapter(adapter); 
    } 
} 
	 
class Club { 
    String name; 
    int logoId; 
 
    Club(String name, int logoId) { 
        this.name = name; 
        this.logoId = logoId; 
    } 
} 