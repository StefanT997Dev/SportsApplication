package com.example.sportsapp.fragments.playersRecyclerViewFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sportsapp.R
import kotlinx.android.synthetic.main.fragment_players_recycler_view.*

class fragment_players_recyclerView : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_players_recycler_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fabAddPlayer.setOnClickListener{
            findNavController().navigate(R.id.action_fragment_players_recyclerView_to_fragment_enter_player)
        }
    }
}