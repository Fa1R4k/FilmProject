package com.example.filmproject

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class FilmViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun onBind(item: FilmData) {
        val number = itemView.findViewById<TextView>(R.id.tvNumber)
        val image = itemView.findViewById<ImageView>(R.id.ivPosterImg)
        val name = itemView.findViewById<TextView>(R.id.tvFilmName)
        val rating = itemView.findViewById<TextView>(R.id.tvRating)
        val oskarImage = itemView.findViewById<ImageView>(R.id.ivIsOskar)

        number.text = item.id.toString()
        Glide.with(image).load(item.imageLink).into(image)
        name.text = item.name
        rating.text = "${item.rating}/10"
        oskarImage.isVisible = item.isOskar
    }
}
