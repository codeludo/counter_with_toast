package com.codeludo.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mCount = 0
        val btnGreeting : Button = findViewById(R.id.button_toast)
        val btnCount : Button = findViewById(R.id.button_counter)
        val mShowCount : TextView = findViewById(R.id.text_count)

        btnCount.setOnClickListener{
                mCount++
                mShowCount.text = mCount.toString()
        }

        btnGreeting.setOnClickListener {
            val toast : Toast = Toast.makeText(this,"Hello to this counter!", Toast.LENGTH_LONG)
            toast.show()
        }
    }

    override fun onStart() {
        super.onStart()

        val onStartToast : Toast = Toast.makeText(this, "On Start", Toast.LENGTH_SHORT)
        onStartToast.show()
    }

    override fun onResume() {
        super.onResume()

        val onResumeToast : Toast = Toast.makeText(this, "On Resume", Toast.LENGTH_SHORT)
        onResumeToast.show()
    }

    override fun onPause() {
        super.onPause()

        val onPauseToast : Toast = Toast.makeText(this, "On Pause", Toast.LENGTH_SHORT)
        onPauseToast.show()
    }

    override fun onStop() {
        super.onStop()

        val onStopToast : Toast = Toast.makeText(this, "On Stop", Toast.LENGTH_SHORT)
        onStopToast.show()
    }


    override fun onDestroy() {
        super.onDestroy()

        val onDestroyToast : Toast = Toast.makeText(this, "On Destroy", Toast.LENGTH_SHORT)
        onDestroyToast.show()
    }
}