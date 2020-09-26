package com.sconzo.hackathon_park_mobile.fMap

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sconzo.hackathon_park_mobile.R
import kotlinx.android.synthetic.main.fragment_map.*
import kotlinx.android.synthetic.main.row_attraction.*


class MapFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_map, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        map_btn_back.setOnClickListener {

        }
    }


}