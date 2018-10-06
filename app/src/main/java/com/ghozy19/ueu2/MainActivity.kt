package com.ghozy19.ueu2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("ini method on Create")

        btnPindah.setOnClickListener {
            toast("fungsi button")

            startActivity<Main2Activity>()

        }

    }


    override fun onStart() {
        super.onStart()
        println("ini method on Start")
    }

    override fun onPause() {
        super.onPause()
        println("ini method on Pause")
    }

    override fun onStop() {
        super.onStop()
        println("ini method on Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("ini method on Destroy")
    }
}
