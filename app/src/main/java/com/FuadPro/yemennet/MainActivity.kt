package com.FuadPro.yemennet

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_speed_test.*
import kotlin.contracts.contract

class MainActivity : AppCompatActivity() {


    //var openAdslA =findViewById<Button>(R.id.iVBuAdsl)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         buttons()



    }

    fun buttons (){
        iVBuAdsl.setOnClickListener(){
            val intent = Intent(this,AdslwebActivity::class.java)
            this.startActivity(intent)
        }

        iV4GBu.setOnClickListener(){
            val intent = Intent(this,FoorGwebView::class.java)
            startActivity(intent)
        }

        iVwimaxBu.setOnClickListener(){
            val intent = Intent(this,WimaxWebView::class.java)
            startActivity(intent)
        }

        iVspeedBu.setOnClickListener(){
            val intent = Intent(this,SpeedTest::class.java)
            startActivity(intent)
        }

        iVyemenWifiBu.setOnClickListener(){
            val intent = Intent(this,YemenWifi::class.java)
            startActivity(intent)
        }

        callBu.setOnClickListener(){
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:01331313")
            startActivity(intent)
        }
    }
}