import androidx.appcompat.app.ActionBar; 
import androidx.appcompat.app.AppCompatActivity; 
	 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
import android.widget.ImageSwitcher; 
import android.widget.ImageView; 
import android.widget.ViewSwitcher; 
	 
	 
public class MainActivity extends AppCompatActivity { 
	 
    ImageSwitcher imageSwitcher; 
    Button buttonNext, buttonPrevious; 
	 
    int[] images = {R.drawable.ic_wifi,R.drawable.ic_storage,R.drawable.ic_wallpaper,R.drawable.ic_screen_rotation, 
            R.drawable.ic_bluetooth,R.drawable.ic_battery_full,R.drawable.ic_access_alarm}; 
    int position = -1; 
	 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
	 
        imageSwitcher = findViewById(R.id.image_switcher); 
        buttonNext = findViewById(R.id.button_next); 
        buttonPrevious = findViewById(R.id.button_previous); 
	 
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() { 
            @Override 
            public View makeView() { 
                ImageView imageView = new ImageView(MainActivity.this); 
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER); 
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT, 
                                          ActionBar.LayoutParams.WRAP_CONTENT)); 
                return imageView; 
            } 
        }); 
	 
        buttonNext.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
                if(position<images.length-1){ 
                    position=position+1; 
                    imageSwitcher.setBackgroundResource(images[position]); 
                } 
            } 
        }); 
 
        buttonPrevious.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
                if(position>0){ 
                    position=position-1; 
                    imageSwitcher.setBackgroundResource(images[position]); 
                } 
            } 
        }); 
    } 
} 
	 