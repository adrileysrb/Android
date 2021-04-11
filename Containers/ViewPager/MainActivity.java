import android.support.v4.app.Fragment; 
import android.support.v4.app.FragmentManager; 
import android.support.v4.app.FragmentPagerAdapter; 
import android.support.v4.view.ViewPager; 
import android.support.v7.app.AppCompatActivity; 
import android.support.design.widget.TabLayout; 
import android.os.Bundle; 
import java.util.ArrayList; 
import java.util.List; 
	 
	 
public class MainActivity extends AppCompatActivity { 
	 
    @Override 
    public void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
 
        setupViewPager(); 
    } 
 
    private void setupViewPager (){ 
        //adapter for the viewpager 
        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager()); 
        //add fragments to your adapter 
        adapter.addFragment(new FragmentOne()); 
        adapter.addFragment(new FragmentTwo()); 
        //init viewpager 
        ViewPager vp = (ViewPager) findViewById(R.id.viewpager); 
        //set adapter 
        vp.setAdapter(adapter); 
 
        //init tablayout 
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs); 
        //pass the viewpager to the tab layout 
        tabLayout.setupWithViewPager(vp); 
        tabLayout.setBackgroundColor(getResources().getColor(R.color.codeblue)); 
        tabLayout.setTabTextColors(getResources().getColor(R.color.white),getResources().getColor(R.color.black)); 
 
        //set the tabs index and set text, icon etc for your tabs 
        tabLayout.getTabAt(0).setText("Page One"); 
        tabLayout.getTabAt(1).setText("Page Two"); 
    } 
 
    class SectionsPagerAdapter extends FragmentPagerAdapter { 
 
        private final List<Fragment> mFragmentList = new ArrayList<>(); 
 
        public SectionsPagerAdapter(FragmentManager fm) { 
            super(fm); 
        } 
 
        @Override 
        public Fragment getItem(int position) { 
            return mFragmentList.get(position); 
        } 
	 
        @Override 
        public int getCount() { 
            return mFragmentList.size(); 
        } 
	 
        public void addFragment(Fragment fragment){ 
            mFragmentList.add(fragment); 
        } 
    } 
} 