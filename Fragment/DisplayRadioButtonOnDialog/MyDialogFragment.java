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
    String fruit; 
	 
    @NonNull 
    @Override 
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) { 
 
        fruits = new ArrayList<>(); 
        fruits.add("Apple"); 
        fruits.add("Banana"); 
        fruits.add("Cherries"); 
        fruits.add("Mango"); 
        fruits.add("Papaya"); 
        fruits.add("Orange"); 
	 
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity()); 
        builder.setTitle("Fruits"); 
        builder.setCancelable(false); 
 
        builder.setSingleChoiceItems(fruits.toArray(new String[0]), -1, new DialogInterface.OnClickListener() { 
            @Override 
            public void onClick(DialogInterface dialog, int which) { 
                fruit = fruits.get(which); 
                //if you get compile time error on fruits 
                // select 'fruits' then alt+enter after that click on 'replace with list access' 
            } 
        }); 
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() { 
            @Override 
            public void onClick(DialogInterface dialog, int which) { 
                Toast.makeText(getActivity(), "selected: "+fruit, Toast.LENGTH_SHORT).show(); 
            } 
        }); 
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() { 
            @Override 
            public void onClick(DialogInterface dialog, int which) { 
                dialog.cancel(); 
            } 
        }); 
        return builder.create(); 
    } 
} 