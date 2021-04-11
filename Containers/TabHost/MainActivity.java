import android.support.v7.app.AppCompatActivity; 
import android.os.Bundle; 
import android.widget.TabHost; 
 
 
public class MainActivity extends AppCompatActivity { 
	 
    TabHost host; 
	 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
 
        host = (TabHost)findViewById(R.id.tabHost); 
        host.setup(); 
 
        //Tab 1 
        TabHost.TabSpec spec = host.newTabSpec("Tab One"); 
        //set the content for the tab as we set content for an activity in the oncreate method 
		//you can pass an intent to this as well to load an activity or load a fragment 
		//since we have defined our content in the activity_main.xml 
		// we will pass the tab1 id to our setcontent method 
	 
        spec.setContent(R.id.tab1); 
        spec.setIndicator("Tab One"); 
        host.addTab(spec); 
	 
        //Tab 2 
        spec = host.newTabSpec("Tab Two"); 
        spec.setContent(R.id.tab2); 
        spec.setIndicator("Tab Two"); 
        host.addTab(spec); 
 
        //Tab 3 
        spec = host.newTabSpec("Tab Three"); 
        spec.setContent(R.id.tab3); 
        spec.setIndicator("Tab Three"); 
        host.addTab(spec); 
	 
    } 
} 