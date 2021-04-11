//add internet permission in AndroidManifest.xml 
//<uses-permission android:name="android.permission.INTERNET"/> 

import androidx.appcompat.app.AppCompatActivity; 
 
import android.os.Bundle; 
import android.webkit.WebSettings; 
import android.webkit.WebView; 
import android.webkit.WebViewClient; 
 
 
public class MainActivity extends AppCompatActivity { 
 
    WebView webView; 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
 
        webView = findViewById(R.id.web_view); 
 
        webView.setWebViewClient(new WebViewClient()); 
        webView.loadUrl("https://www.google.com"); 
 
        WebSettings webSettings=webView.getSettings(); 
        webSettings.setJavaScriptEnabled(true); 
    } 
} 