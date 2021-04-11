// add following dependency to your app's build.gradle(Module: app) 
// implementation 'com.google.android.material:material:1.2.1' 
 
import androidx.appcompat.app.AppCompatActivity; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
 
import com.google.android.material.bottomsheet.BottomSheetBehavior; 
	 
public class MainActivity extends AppCompatActivity{ 
 
    BottomSheetBehavior bottomSheetBehavior; 
    Button expandBtn,collapseBtn,hideBtn; 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
 
        View bottomSheet=findViewById(R.id.bottom_sheet); 
 
        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet); 
        expandBtn = findViewById(R.id.expand_btn); 
        collapseBtn = findViewById(R.id.collapse_btn); 
        hideBtn = findViewById(R.id.hide_btn); 

        expandBtn.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED); 
            } 
        }); 
        collapseBtn.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED); 
            } 
        }); 
        hideBtn.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN); 
            } 
        }); 
    } 
} 