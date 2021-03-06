package com.sconzo.hackathon_park_mobile.fTicket

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sconzo.hackathon_park_mobile.R
import moxy.MvpAppCompatFragment
import moxy.presenter.InjectPresenter


class TicketFragment : MvpAppCompatFragment(), TicketView {

    @InjectPresenter
    lateinit var ticketPresenter: TicketPresenter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ticket, container, false)
    }


}