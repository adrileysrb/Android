import androidx.appcompat.app.AppCompatActivity; 
import androidx.core.app.NotificationCompat; 
import androidx.core.app.NotificationManagerCompat; 
 
import android.app.NotificationChannel; 
import android.app.NotificationManager; 
import android.graphics.Bitmap; 
import android.graphics.BitmapFactory; 
import android.os.Build; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
 
public class MainActivity extends AppCompatActivity{ 
 
    Button button; 
 
    private final String CHANNEL_ID = "big_picture_style_notification"; 
    private final int NOTIFICATION_ID = 1; 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
 
        button = findViewById(R.id.big_picture_notification); 
 
        button.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
 
                createNotificationChannel(); 
                Bitmap bigPicture = BitmapFactory.decodeResource(getResources(), R.drawable.logo); 
                NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this, CHANNEL_ID); 
                builder.setSmallIcon(R.drawable.logo); 
                builder.setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.logo)); 
                builder.setContentTitle("My Logo"); 
                builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bigPicture)); 
                builder.setPriority(NotificationCompat.PRIORITY_DEFAULT); 
	 
                NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(MainActivity.this); 
                notificationManagerCompat.notify(NOTIFICATION_ID, builder.build()); 
            } 
        }); 
    } 
    //create notification channel if you target android 8.0 or higher version 
    private void createNotificationChannel(){ 
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){ 
 
            CharSequence name = "BigPictureStyle Notification"; 
            String description = "Include all the BigPictureStyle notification"; 
            int importance = NotificationManager.IMPORTANCE_DEFAULT; 
 
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID,name,importance); 
            notificationChannel.setDescription(description); 
 
            NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE); 
            notificationManager.createNotificationChannel(notificationChannel); 
        } 
    } 
}