package com.example.tae_kotlin_rxjava2_starwars.view.fragmentview


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.tae_kotlin_rxjava2_starwars.R

/**
 * A simple [Fragment] subclass.
 */
class StarFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_star, container, false)
    }


}