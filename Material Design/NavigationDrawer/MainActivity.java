//When creating an activity select NavigationDrawer Activity in Android Studio 
//All the Java and XML code are generated automatically you just have to put your code for what you want to display in the menu and what you want to do 
 
import android.os.Bundle; 
import android.view.View; 
import android.support.design.widget.NavigationView; 
import android.support.v4.view.GravityCompat; 
import android.support.v4.widget.DrawerLayout; 
import android.support.v7.app.ActionBarDrawerToggle; 
import android.support.v7.app.AppCompatActivity; 
import android.support.v7.widget.Toolbar; 
import android.view.MenuItem; 
 
 
public class MainActivity extends AppCompatActivity 
        implements NavigationView.OnNavigationItemSelectedListener{ 
	 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState); 
		setContentView(R.layout.activity_main); 
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar); 
		setSupportActionBar(toolbar); 
	 
		DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout); 
		ActionBarDrawerToggle toggle = new ActionBarDrawerToggle( 
				this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close); 
		drawer.addDrawerListener(toggle); 
		toggle.syncState(); 
		 
		NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view); 
		navigationView.setNavigationItemSelectedListener(this); 
	} 
	 
	@SuppressWarnings("StatementWithEmptyBody") 
	@Override 
	public boolean onNavigationItemSelected(MenuItem item) { 
		//Handle navigation view item clicks here. 
		int id = item.getItemId(); 
		 
		if (id == R.id.nav_about_us) { 
		   //write your code here for what to do when item clicked 
		} else if (id == R.id.nav_rate_us) { 
	 
		} else if (id == R.id.nav_share) { 
	 
		} else if (id == R.id.nav_send) {
		} 
 
		DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout); 
		drawer.closeDrawer(GravityCompat.START); 
		return true; 
	}
}