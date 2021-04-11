import android.os.Bundle; 
 
import androidx.fragment.app.Fragment; 
 
import android.view.LayoutInflater; 
import android.view.View; 
import android.view.ViewGroup; 
import android.widget.TextView; 
 
public class MyFragment extends Fragment { 
	 
    String name; 
	 
    public MyFragment(String name) { 
        this.name = name; 
    } 
	 
    @Override 
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) { 
        View view = inflater.inflate(R.layout.fragment_my, container, false); 
 
        TextView myName = view.findViewById(R.id.get_name); 
        myName.setText(name); 
 
        return view; 
    } 
} 
