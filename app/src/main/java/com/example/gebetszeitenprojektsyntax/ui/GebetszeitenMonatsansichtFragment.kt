package com.example.gebetszeitenprojektsyntax.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gebetszeitenprojektsyntax.R
import com.example.gebetszeitenprojektsyntax.databinding.FragmentGebetszeitenMonatsansichtBinding


class GebetszeitenMonatsansichtFragment : Fragment() {

    private lateinit var binding : FragmentGebetszeitenMonatsansichtBinding
    override fun onCreateView(
        inflater : LayoutInflater, container : ViewGroup?,
        savedInstanceState : Bundle?
    ) : View? {
        binding = FragmentGebetszeitenMonatsansichtBinding.inflate(layoutInflater)
        return binding.root
    }

}