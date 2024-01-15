package com.ncorti.kotlin.template.app

import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import com.github.appintro.AppIntro
import com.github.appintro.AppIntroCustomLayoutFragment

class MainActivity : AppIntro() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        isSkipButtonEnabled = true
        setBarColor(
            ResourcesCompat.getColor(resources, R.color.barColor, theme)
        )

        addSlide(
            AppIntroCustomLayoutFragment.newInstance(R.layout.custom_fragment_layout)
        )
    }

    override fun onDonePressed(currentFragment: Fragment?) {
        super.onDonePressed(currentFragment)
        // Decide what to do when the user clicks on "Done"
        finish()
    }
}
