package com.example.infoseries.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.infoseries.databinding.FragmentUihomeBinding
import com.example.infoseries.presenters.adapters.SeriesAdapter

class UIHome : Fragment() {

    private lateinit var _binding: FragmentUihomeBinding
    //private lateinit var viewModel:

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentUihomeBinding.inflate(inflater, container, false)



        //val adapter = SeriesAdapter(showItems)
        binding.recyclerView.layoutManager = GridLayoutManager(requireContext(), 3)
        return binding.root
    }


}