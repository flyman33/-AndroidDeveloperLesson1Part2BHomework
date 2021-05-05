package com.example.helloconstraint

import android.graphics.Color
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.Sampler
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    private var mCount: Int = 0
    private lateinit var mShowCount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            mShowCount = findViewById(R.id.show_count)
    }

    fun showToast(view: View) {
        val toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT)
        toast.show()
    }

    fun countUp(view: View) {
        mCount++

        mShowCount.setText(mCount.toString())

        if(mCount % 2 == 0) {
            //view.setBackgroundColor(Color.parseColor("#FFFFFF"))
            view.setBackgroundColor(Color.GREEN)
        } else view.setBackgroundColor(Color.RED)

        val zeroButton: Button = findViewById(R.id.button_zero)
        zeroButton.setBackgroundColor(Color.CYAN)
    }

    fun decreaseToZero(view: View) {
        mCount = 0
        mShowCount.setText(mCount.toString())
        view.setBackgroundColor(Color.LTGRAY)
    }
}