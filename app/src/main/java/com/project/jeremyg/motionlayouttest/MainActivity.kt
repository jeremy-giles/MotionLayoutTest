package com.project.jeremyg.motionlayouttest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import kotlinx.android.synthetic.main.activity_main_start.*

class MainActivity : AppCompatActivity() {

    var show : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_start)

        btn_test.setOnClickListener {
            show = !show
            when(show) {
                true -> findViewById<MotionLayout>(R.id.motiom_layout).transitionToEnd()
                else -> findViewById<MotionLayout>(R.id.motiom_layout).transitionToStart()
            }
        }
    }
}

