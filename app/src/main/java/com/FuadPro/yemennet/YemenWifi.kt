package com.FuadPro.yemennet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_yemen_wifi.*

class YemenWifi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yemen_wifi)

        yemenWifiWebView.webViewClient = WebViewClient()

        yemenWifiWebView.loadUrl("https://yemen.net.ye/section/services/internet/yemen-wifi")
        yemenWifiWebView.settings.javaScriptEnabled =true
        yemenWifiWebView.settings.setSupportZoom(true)

    }

    override fun onBackPressed() {
        if (yemenWifiWebView.canGoBack())
            yemenWifiWebView.goBack()

        else
             super.onBackPressed()
    }
}