package com.example.infoseries.presenters.adapters.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.infoseries.databinding.ShowRowBinding
import com.example.infoseries.domain.model.SerieModel

class HomeViewHolder(private val binding: ShowRowBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(data: SerieModel) {
        binding.serieTitle.text = data.title
        if (data.genre.isNotEmpty()) {
            var genres = data.genre[0]
            if (data.genre.size > 1)
                genres += ", ${data.genre[1]}"
            binding.serieGenre.text = genres
        }
        binding.textRating.text = data.rating.average.toString()
        if (data.cover?.medium?.isNotEmpty() == true) {
            Glide.with(binding.root)
                .load(data.cover.medium)
                .into(binding.wallpaper)
        }
    }
}
