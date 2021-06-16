package com.example.drycleaningapp.presentation.adapters

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.drycleaningapp.R
import com.example.drycleaningapp.databinding.ItemOrderBinding
import com.example.drycleaningapp.model.entity.Order

class OrdersAdapter() : RecyclerView.Adapter<OrdersAdapter.ViewHolder>() {

    private var data: MutableList<Order> = mutableListOf()

    inner class ViewHolder(val binding: ItemOrderBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemOrderBinding
                .inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    fun update(data: MutableList<Order>) {
        this.data = data
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = data.size

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.order = data[position]
        when (data[position].costumer.status.name) {
            "VIP+" -> {
                holder.binding.apply {
                    tvStatus.setTextColor(Color.RED)
                    llOrder.background =
                        llOrder.resources.getDrawable(R.drawable.bg_rounded_stroke_gold, null)
                }
            }
        }
    }
}

