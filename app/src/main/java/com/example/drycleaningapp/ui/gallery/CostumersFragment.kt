package com.example.drycleaningapp.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.drycleaningapp.databinding.FragmentCostumersBinding

class CostumersFragment : Fragment() {

    private lateinit var costumersViewModel: CostumersViewModel
    private lateinit var binding: FragmentCostumersBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        costumersViewModel =
            ViewModelProvider(this).get(CostumersViewModel::class.java)
        binding = FragmentCostumersBinding.inflate(inflater, container, false)
        return binding.root
    }

    private fun subscribeUI() {
        costumersViewModel.text.observe(viewLifecycleOwner, Observer {
            binding.textGallery.text = it
        })
    }
}