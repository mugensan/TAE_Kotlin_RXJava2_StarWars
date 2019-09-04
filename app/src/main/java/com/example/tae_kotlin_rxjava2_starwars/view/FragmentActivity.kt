//package com.example.tae_kotlin_rxjava2_starwars.view
//
//import android.os.Bundle
//import android.util.Log
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.fragment.app.Fragment
//import com.example.tae_kotlin_rxjava2_starwars.MainActivity.Companion.ACTIVITY
//import com.example.tae_kotlin_rxjava2_starwars.MainActivity.Companion.COMBINED_LIFECYCLE
//import com.example.tae_kotlin_rxjava2_starwars.R
//
//
//class FragmentActivity : Fragment() {
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return inflater.inflate(R.layout.fragment_layout)
//    }
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        Log.i(COMBINED_LIFECYCLE, "$ACTIVITY onStart")
//    }
//}