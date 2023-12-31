package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentMenuBinding


class MenuFragment : Fragment() {


    private lateinit var binding : FragmentMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMenuBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.playVsComputerButton.setOnClickListener {
            val action = MenuFragmentDirections.actionMenuFragmentToGameFragment()
            findNavController().navigate(action)
        }

        binding.player2Button.setOnClickListener {
            val action = MenuFragmentDirections.actionMenuFragmentToRegisterFragment()
            findNavController().navigate(action)
        }
    }


}