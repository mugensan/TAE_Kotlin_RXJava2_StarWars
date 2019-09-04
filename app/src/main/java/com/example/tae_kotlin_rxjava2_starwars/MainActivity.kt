package com.example.tae_kotlin_rxjava2_starwars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.tae_kotlin_rxjava2_starwars.view.FragmentActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addFragment()
    }

    override fun onStart() {
        super.onStart()
        Log.i(COMBINED_LIFECYCLE, "$ACTIVITY onStart")
    }

    override fun onPostResume() {
        super.onPostResume()
        Log.i(COMBINED_LIFECYCLE, "$ACTIVITY onPostResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(COMBINED_LIFECYCLE, "$ACTIVITY onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(COMBINED_LIFECYCLE, "$ACTIVITY onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(COMBINED_LIFECYCLE, "$ACTIVITY onDestroy")
    }

    private fun addFragment(){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fl_fragment_layout, FragmentActivity())
            .commit()
    }

    companion object{

        const val COMBINED_LIFECYCLE = "combine_lifeCycle"
        const val ACTIVITY = "MainActivity"
        const val FRAGMENT = "fragmentExample"
    }
}
