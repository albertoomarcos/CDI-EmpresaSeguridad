package com.example.portatil.cdi_empresaseguridad

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import android.widget.FrameLayout



class UserMainActivity: AppCompatActivity() {

    private lateinit var bottomNavigation: BottomNavigationView

    private var bottomNavIndex = R.id.home_navigationViewMain

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_user)

        this.bottomNavigation = findViewById(R.id.bottomNavigationView)

        with(supportFragmentManager.findFragmentById(R.id.frameLayout_mainActivity)) {
            if(this == null || !this.isVisible)
                bottomNavigation.selectedItemId = bottomNavIndex
        }
    }


    override fun onStart() {
        super.onStart()

        bottomNavigation.setOnNavigationItemSelectedListener { item ->

            when(item.itemId) {
                R.id.home_navigationViewMain -> {
                    with(supportFragmentManager.findFragmentById(R.id.frameLayout_mainActivity)) {
                        if(this == null || !this.isVisible || this !is UserMainFragment) {
                            val mFragment = UserMainFragment.newInstance()
                            goToFragment(mFragment)

                            bottomNavIndex = item.itemId
                        }
                    }
                    true
                }

                R.id.notifications_navigationViewMain -> {
                    with(supportFragmentManager.findFragmentById(R.id.frameLayout_mainActivity)) {
                        if(this == null || !this.isVisible || this !is NotificationsFragment) {
                            val mFragment = NotificationsFragment.newInstance()
                            goToFragment(mFragment)

                            bottomNavIndex = item.itemId
                        }
                    }
                    true
                }
                R.id.domotica_navigationViewMain -> {
                    with(supportFragmentManager.findFragmentById(R.id.frameLayout_mainActivity)) {
                        Toast.makeText(this@UserMainActivity, "TODO", Toast.LENGTH_SHORT).show()
                    }
                    true
                }
                R.id.profile_navigationViewMain -> {
                    with(supportFragmentManager.findFragmentById(R.id.frameLayout_mainActivity)) {
                        if(this == null || !this.isVisible || this !is ProfileFragment) {
                            val mFragment = ProfileFragment.newInstance()
                            goToFragment(mFragment)

                            bottomNavIndex = item.itemId
                        }
                    }
                    true
                }

                else -> false

            }

        }
    }

    override fun onResume() {

        with(supportFragmentManager.findFragmentById(R.id.frameLayout_mainActivity)) {
            if (this == null || !this.isVisible)
                bottomNavigation.selectedItemId = bottomNavIndex
        }
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
        bottomNavIndex = bottomNavigation.selectedItemId
    }



    /**
     * Go to home in case of back pressed
     */
    override fun onBackPressed() {

        if(bottomNavigation.selectedItemId != R.id.home_navigationViewMain)
            bottomNavigation.selectedItemId = R.id.home_navigationViewMain
        else {
            val intent = Intent(Intent.ACTION_MAIN)
            intent.addCategory(Intent.CATEGORY_HOME)
            startActivity(intent)
        }
    }

    /**
     * Go to fragment view
     */
    private fun goToFragment(fragment: Fragment) {

        supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout_mainActivity, fragment)
                .commitAllowingStateLoss()

    }

}

