package com.example.infoseries.ui.view.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.infoseries.databinding.ShowRowBinding
import com.example.infoseries.domain.model.SerieModel

class HomeViewHolder(private val binding: ShowRowBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(showItem: SerieModel) {
        binding.serieTitle.text = showItem.title
        binding.serieGenre.text = showItem.genre.toString()
       // binding.wallpaper.setImageResource(showItem.cover)
        //binding.textRating.text = showItem.rating
        // Aqui, você pode adicionar mais elementos do layout e definir os dados do showItem conforme necessário.
    }
}
