package com.example.gebetszeitenprojektsyntax.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gebetszeitenprojektsyntax.R
import com.example.gebetszeitenprojektsyntax.databinding.FragmentGebetszeitenTagesansichtBinding


class GebetszeitenTagesansichtFragment : Fragment() {


    private lateinit var binding: FragmentGebetszeitenTagesansichtBinding
    override fun onCreateView(
        inflater : LayoutInflater, container : ViewGroup?,
        savedInstanceState : Bundle?
    ) : View? {
        binding = FragmentGebetszeitenTagesansichtBinding.inflate(layoutInflater)
        return binding.root
    }

}