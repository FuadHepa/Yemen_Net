package com.FuadPro.yemennet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_adsl_web.*

class AdslwebActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adsl_web)

        webVadsl.webViewClient = WebViewClient()

        webVadsl.loadUrl("https://adsl.yemen.net.ye/")

        webVadsl.settings.javaScriptEnabled = true
        webVadsl.settings.setSupportZoom(true)

    }

    override fun onBackPressed() {
        // if your webview can go back it will go back
        if (webVadsl.canGoBack())
            webVadsl.goBack()
        // if your webview cannot go back
        // it will exit the application
        else
            super.onBackPressed()
    }
}