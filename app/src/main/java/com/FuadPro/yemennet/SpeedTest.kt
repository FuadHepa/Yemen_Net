package com.FuadPro.yemennet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_speed_test.*

class SpeedTest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_speed_test)

        speedTest.webViewClient= WebViewClient()
        speedTest.loadUrl("https://speedtest.yemen.net.ye/")

        speedTest.settings.javaScriptEnabled = true
        speedTest.settings.setSupportZoom(true)
    }

    override fun onBackPressed() {
        if (speedTest.canGoBack())
            speedTest.goBack()

        else
            super.onBackPressed()

    }
}