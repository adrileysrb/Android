import android.app.Dialog; 
import android.content.DialogInterface; 
import android.os.Bundle; 
import android.widget.Toast; 
 
import androidx.annotation.NonNull; 
import androidx.annotation.Nullable; 
import androidx.appcompat.app.AlertDialog; 
import androidx.fragment.app.DialogFragment; 
	 
import java.util.ArrayList; 
import java.util.List; 
 
public class MyDialogFragment extends DialogFragment { 
	 
    List<String> fruits; 
 
    @NonNull 
    @Override 
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) { 
 
        fruits = new ArrayList<>(); 
        fruits.add("Apple"); 
        fruits.add("Banana"); 
        fruits.add("Blackberry"); 
        fruits.add("Cherries"); 
        fruits.add("Mango"); 
        fruits.add("Papaya"); 
        fruits.add("Orange"); 
	 
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity()); 
        builder.setTitle("Fruits"); 
        builder.setItems(fruits.toArray(new String[0]), new DialogInterface.OnClickListener() { 
            @Override 
            public void onClick(DialogInterface dialog, int which) { 
                Toast.makeText(getActivity(), "I want "+ fruits.get(which), Toast.LENGTH_SHORT).show(); 
                //if you get compile time error on fruits 
                // select 'fruits' then alt+enter after that click on 'replace with list access' 
            } 
        }); 
        return builder.create(); 
 
    } 
} 