import android.os.Bundle; 
	 
import androidx.fragment.app.Fragment; 
 
import android.view.LayoutInflater; 
import android.view.View; 
import android.view.ViewGroup; 
import android.widget.Button; 
import android.widget.TextView; 
	 
public class FragmentB extends Fragment { 
 
    String name; 
    public FragmentB(String name) { 
        this.name = name; 
    } 
 
    @Override 
    public View onCreateView(LayoutInflater inflater, ViewGroup container, 
                             Bundle savedInstanceState) { 
        View view = inflater.inflate(R.layout.fragment_b, container, false); 
 
        TextView myName = view.findViewById(R.id.get_name); 
        Button backBtn = view.findViewById(R.id.back_button); 
 
        myName.setText(name); 
 
        backBtn.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) { 
                getActivity().getSupportFragmentManager().beginTransaction() 
                                   .replace(R.id.frame_layout,new FragmentA()).commit(); 
            } 
        }); 
        return view; 
    } 
} 
	 
