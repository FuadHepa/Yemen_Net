package com.FuadPro.yemennet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_wimax_web_view.*

class WimaxWebView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wimax_web_view)

        webViewWimax.webViewClient = WebViewClient()

        webViewWimax.loadUrl("https://yemen.net.ye/section/services/internet/wimax")


        webViewWimax.settings.javaScriptEnabled  =true

        webViewWimax.settings.setSupportZoom(true)
    }

    override fun onBackPressed() {
        if (webViewWimax.canGoBack())
            webViewWimax.goBack()
        else
           super.onBackPressed()
    }
}