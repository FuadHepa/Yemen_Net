package com.FuadPro.yemennet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_adsl_web.*
import kotlinx.android.synthetic.main.activity_foor_gweb_view.*
import kotlinx.android.synthetic.main.activity_main.*

class FoorGwebView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foor_gweb_view)

        webView4G.webViewClient = WebViewClient()
        webView4G.loadUrl("https://yemen.net.ye/section/services/internet/yemen-4g")

        webView4G.settings.javaScriptEnabled = true
        webView4G.settings.setSupportZoom(true)

    }

    override fun onBackPressed() {
        // if your webview can go back it will go back
        if (webView4G.canGoBack())
            webView4G.goBack()
        // if your webview cannot go back
        // it will exit the application
        else
            super.onBackPressed()
    }
}