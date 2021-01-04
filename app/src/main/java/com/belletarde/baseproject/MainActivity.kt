package com.belletarde.baseproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.belletarde.baseproject.ui.profile.ProfileFragment
import com.belletarde.baseproject.ui.start.StartFragment

class MainActivity : AppCompatActivity(), StartFragment.OnButtonClicked {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.mainContainer, StartFragment.newInstance())
            .commit()
    }

    override fun buttonClicked() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.mainContainer, ProfileFragment.newInstance())
            .commit()
    }
}