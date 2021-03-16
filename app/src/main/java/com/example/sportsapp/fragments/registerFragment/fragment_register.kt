package com.example.sportsapp.fragments.registerFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.sportsapp.R
import kotlinx.android.synthetic.main.fragment_register.*

class fragment_register : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_register, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        floatingActionButton.setOnClickListener{
            findNavController().navigate(R.id.action_fragment_register_to_fragment_login)
        }
    }
}