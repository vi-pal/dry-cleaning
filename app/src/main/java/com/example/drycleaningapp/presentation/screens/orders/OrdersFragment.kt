package com.example.drycleaningapp.presentation.screens.orders

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.drycleaningapp.databinding.FragmentOrdersBinding
import com.example.drycleaningapp.db.DbManager
import com.example.drycleaningapp.model.entity.Order
import com.example.drycleaningapp.presentation.adapters.OrdersAdapter
import com.example.drycleaningapp.utils.showToast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OrdersFragment : Fragment() {

    private val ordersViewModel: OrdersViewModel by viewModels()
    private lateinit var binding: FragmentOrdersBinding

    private val mAdapter = OrdersAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentOrdersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getOrders()

    }

    private fun subscribeData() {
        ordersViewModel.orders.observe(viewLifecycleOwner, Observer {
            //binding..text = it.toString()
        })
    }


    private fun getOrders() {
        try {
            mAdapter.update(
                DbManager.getInstance(requireContext()).getAllOrdersAsc() as MutableList<Order>
            )
            binding.rvOrders.adapter = mAdapter
        } catch (ex: Exception) {
            throw Error("cant update")
        }
    }


}