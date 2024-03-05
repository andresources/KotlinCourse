package com.kotlincourse.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.kotlincourse.R

class WebviewActivity : AppCompatActivity() {
    lateinit var wv: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)
        wv = findViewById(R.id.wv)
        var webSettings = wv.getSettings()
        webSettings.setJavaScriptEnabled(true)
        wv.loadUrl("https://info.eenadu.net/csr-policy.htm");
    }
}