package com.example.infoseries.presenters.adapters.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.infoseries.databinding.EpisodeRowBinding
import com.example.infoseries.domain.model.SerieModel


class SerieViewHolder(private val binding: EpisodeRowBinding) :
    RecyclerView.ViewHolder(binding.root) {

        fun bind(showEpisode: SerieModel){
            binding
        }
}