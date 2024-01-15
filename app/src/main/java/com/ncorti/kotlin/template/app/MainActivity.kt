package com.ncorti.kotlin.template.app

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.github.appintro.AppIntro2
import com.github.appintro.AppIntroCustomLayoutFragment
import com.github.appintro.AppIntroFragment

class MainActivity : AppIntro2() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setBarColor(0xfff)

        addSlide(
            AppIntroFragment.createInstance(
                title = "Testing Page",
                description = "This is the description of the first page"
            )
        )
        addSlide(
            AppIntroCustomLayoutFragment.newInstance(R.layout.custom_fragment_layout)
        )
    }

    override fun onSkipPressed(currentFragment: Fragment?) {
        super.onSkipPressed(currentFragment)
        // Decide what to do when the user clicks on "Skip"
        finish()
    }

    override fun onDonePressed(currentFragment: Fragment?) {
        super.onDonePressed(currentFragment)
        // Decide what to do when the user clicks on "Done"
        finish()
    }
}
