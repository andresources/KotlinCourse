package com.kotlincourse.animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import com.kotlincourse.R
/*XML ATTRIBUTES	            DESCRIPTION
android:duration	            It is used to specify the duration of animation to run
android:fromAlpha	            It is the starting alpha value for the animation,where 1.0 means fully opaque and 0.0 means fully transparent
android:toAlpha	                It is the ending alpha value
android:id	                    Sets unique id of the view
android:fromYDelta	            It is the change in Y coordinate to be applied at the start of the animation
android:toYDelta	            It is the change in Y coordinate to be applied at the end of the animation
android:startOffset	            Delay occur when an animation runs (in milliseconds), once start time is reached.
android:pivotX	                It represents the X-axis coordinates to zoom from starting point.
android:pivotY	                It represents the Y-axis coordinates to zoom from starting point.
android:fromXScale	            Starting X size offset,
android:fromYScale	            Starting Y size offset,
android:toXScale	            Ending of X size offset
android:toYScale	            Ending of Y size offset
android:fromDegrees	            Starting angular position, in degrees.
android:toDegrees	            Ending angular position, in degrees.
android:interpolator	        An interpolator defines the rate of change of an animation*/
class AnimationActivity : AppCompatActivity() {
    lateinit var fade_in: Button
    lateinit var fade_out: Button
    lateinit var zoom_in: Button
    lateinit var zoom_out: Button
    lateinit var slide_down: Button
    lateinit var slide_up: Button
    lateinit var bounce: Button
    lateinit var rotate: Button
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)
        fade_in = findViewById(R.id.fade_in)
        fade_out = findViewById(R.id.fade_out)
        zoom_in = findViewById(R.id.zoom_in)
        zoom_out = findViewById(R.id.zoom_out)
        slide_down = findViewById(R.id.slide_down)
        slide_up = findViewById(R.id.slide_up)
        bounce = findViewById(R.id.bounce)
        rotate = findViewById(R.id.rotate)
        textView = findViewById(R.id.textView)
        fade_in.setOnClickListener {
            textView.visibility = View.VISIBLE
            val animationFadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            textView.startAnimation(animationFadeIn)
        }
        fade_out.setOnClickListener {
            val animationFadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out)
            textView.startAnimation(animationFadeOut)
            Handler().postDelayed({
                textView.visibility = View.GONE
            }, 1000)
        }
        zoom_in.setOnClickListener {
            val animationZoomIn = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
            textView.startAnimation(animationZoomIn)
        }
        zoom_out.setOnClickListener {
            val animationZoomOut = AnimationUtils.loadAnimation(this, R.anim.zoom_out)
            textView.startAnimation(animationZoomOut)
        }
        slide_down.setOnClickListener {
            val animationSlideDown = AnimationUtils.loadAnimation(this, R.anim.slide_down)
            textView.startAnimation(animationSlideDown)
        }
        slide_up.setOnClickListener {
            val animationSlideUp = AnimationUtils.loadAnimation(this, R.anim.slide_up)
            textView.startAnimation(animationSlideUp)
        }
        bounce.setOnClickListener {
            val animationBounce = AnimationUtils.loadAnimation(this, R.anim.bounce)
            textView.startAnimation(animationBounce)
        }
        rotate.setOnClickListener {
            val animationRotate = AnimationUtils.loadAnimation(this, R.anim.rotate)
            textView.startAnimation(animationRotate)
        }

    }
}