package com.example.filmproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FilmAdapter(private val listFilmData: List<FilmData>) : RecyclerView.Adapter<FilmViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item_film, parent, false)
        return FilmViewHolder(view)
    }

    override fun getItemCount(): Int = listFilmData.size


    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        holder.onBind(listFilmData[position])
    }

}