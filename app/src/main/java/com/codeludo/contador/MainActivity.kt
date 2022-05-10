package com.codeludo.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // Counter
    var mCount = 0
    // text counter
    lateinit var mShowCount : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mShowCount = findViewById(com.codeludo.contador.R.id.text_count)

        val btnGreeting : Button = findViewById(R.id.button_toast)
        val btnCount : Button = findViewById(R.id.button_counter)

        btnCount.setOnClickListener{
                mCount++
                mShowCount.text = mCount.toString()
        }

        btnGreeting.setOnClickListener {
            val toast : Toast = Toast.makeText(this,"Hello to this counter!", Toast.LENGTH_LONG)
            toast.show()
        }
    }

    // Android App Life Cycle

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

    // save simple state

    override fun onSaveInstanceState(outState: Bundle) {
        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(outState)
        // Save the user's current counter state
        outState.run {
            putInt(NUM, mCount)
        }
    }

    companion object {
        val NUM = "COUNTER_NUMBER"
    }

    // restore state

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        savedInstanceState.run {
            mCount = getInt(NUM)
            mShowCount.text = mCount.toString()
        }
    }
}