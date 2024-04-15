package com.example.gebetszeitenprojektsyntax.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gebetszeitenprojektsyntax.R
import com.example.gebetszeitenprojektsyntax.databinding.FragmentRegistrierungsBinding

class RegistrierungsFragment : Fragment() {


    private lateinit var binding : FragmentRegistrierungsBinding
    override fun onCreateView(
        inflater : LayoutInflater, container : ViewGroup?,
        savedInstanceState : Bundle?
    ) : View? {
        binding = FragmentRegistrierungsBinding.inflate(layoutInflater)
        return binding.root
    }

}