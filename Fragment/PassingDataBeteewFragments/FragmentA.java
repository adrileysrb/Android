import android.os.Bundle; 

import androidx.fragment.app.Fragment; 
 
import android.view.LayoutInflater; 
import android.view.View; 
import android.view.ViewGroup; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.Toast; 
 
	 
public class FragmentA extends Fragment { 
	 
    EditText userName; 
    Button button; 
	 
    @Override 
    public View onCreateView(LayoutInflater inflater, ViewGroup container, 
                             Bundle savedInstanceState) { 
        View view = inflater.inflate(R.layout.fragment_a, container, false); 
 
        userName = view.findViewById(R.id.user_name); 
        button = view.findViewById(R.id.button); 
	 
        button.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) { 
                String name = userName.getText().toString().trim(); 
                if (name.equals("")){ 
                    Toast.makeText(getActivity(), "Please fill the field", Toast.LENGTH_SHORT).show(); 
                }else{ 
                    getActivity().getSupportFragmentManager().beginTransaction() 
                                 .replace(R.id.frame_layout,new FragmentB(name)).commit(); 
                } 
            } 
        }); 
        return view; 
    } 
} 
	 