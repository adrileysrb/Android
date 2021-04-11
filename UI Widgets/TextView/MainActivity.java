import androidx.appcompat.app.AppCompatActivity; 

import android.os.Bundle; 
import android.view.View; 
import android.widget.TextView; 
import android.widget.Toast; 

public class MainActivity extends AppCompatActivity implements View.OnClickListener { 

	TextView textView1, textView2, textView3, textView4; 

	@Override 
	protected void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState); 
		setContentView(R.layout.activity_main); 

		textView1 = findViewById(R.id.textview_1); 
		textView2 = findViewById(R.id.textview_2); 
		textView3 = findViewById(R.id.textview_3); 
		textView4 = findViewById(R.id.textview_4); 

		textView1.setOnClickListener(this); 
		textView2.setOnClickListener(this); 
		textView3.setOnClickListener(this); 
		textView4.setOnClickListener(this); 
	} 

	@Override 
	public void onClick(View view) { 

		switch (view.getId()){ 

			case R.id.textview_1: 
			Toast.makeText(this, "This is First Text", Toast.LENGTH_SHORT).show(); 
			break; 

			case R.id.textview_2: 
			Toast.makeText(this, "This is Second Text", Toast.LENGTH_SHORT).show(); 
			break; 

			case R.id.textview_3: 
			Toast.makeText(this, "This is Third Text", Toast.LENGTH_SHORT).show(); 
			break; 

			case R.id.textview_4: 
			Toast.makeText(this, "This is Fourth Text", Toast.LENGTH_SHORT).show(); 
			break; 
		}
	} 
} 

