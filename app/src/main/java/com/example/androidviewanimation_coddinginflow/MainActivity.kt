package com.example.androidviewanimation_coddinginflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun animat_Onclick(view: View) {
        YoYo.with(Techniques.Tada)
            .duration(700)
            .repeat(1)
            .playOn(text_view)
    }
}
