package com.example.sportsapp.fragments.selectSportFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sportsapp.R
import kotlinx.android.synthetic.main.fragment_select_sport.*

class fragment_select_sport : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_select_sport, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fabSelectSport.setOnClickListener{
            findNavController().navigate(R.id.action_fragment_select_sport_to_fragment_players_recyclerView)
        }
    }
}