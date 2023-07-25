package com.example.infoseries.presenters.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.infoseries.databinding.ShowRowBinding
import com.example.infoseries.domain.model.SerieModel
import com.example.infoseries.presenters.adapters.viewholder.HomeViewHolder

class SeriesAdapter(private val showItems: List<SerieModel>) :
    RecyclerView.Adapter<HomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val binding = ShowRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HomeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.bind(showItems[position])
    }

    override fun getItemCount(): Int = showItems.size

}




