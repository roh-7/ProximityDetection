package com.estimote.proximity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebViewClient;
import android.webkit.WebView;



public class WebVieww extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new MyBrowser());



        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.loadUrl("https://smartmuseum-5a139.firebaseapp.com/");


    }

}

class MyBrowser extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        view.loadUrl(request.getUrl().toString());
        return true;
    }
}
