package com.example.infoseries.ui.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.infoseries.databinding.FragmentSerieBinding

class UiSeries : Fragment() {

    private lateinit var _binding: FragmentSerieBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSerieBinding.inflate(inflater, container, false)

        return binding.root
    }
}