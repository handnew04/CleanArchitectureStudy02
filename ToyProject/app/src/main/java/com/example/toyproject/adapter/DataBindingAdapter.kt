package com.example.toyproject.adapter

import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.toyproject.data.entity.SearchMovieData
import com.example.toyproject.ui.main.MainMoviePostingRecyclerAdapter

@BindingAdapter("bind:replace")
fun RecyclerView.replaceAll(item: List<SearchMovieData>?) {
    if (!item.isNullOrEmpty()) {
        (adapter as? MainMoviePostingRecyclerAdapter)?.setItemList(item as ArrayList<SearchMovieData>)
    }
}

@BindingAdapter("bind:bindImage")
fun ImageView.bindImage(imageUri: String) {
    if (imageUri.isNotEmpty()) {
        Glide.with(this.context).load(imageUri).into(this)
    }
}

@BindingAdapter("bind:bindLoading")
fun ProgressBar.bindLoading(isLoading : Boolean) {
    if(isLoading) {
        this.visibility = View.VISIBLE
    } else {
        this.visibility = View.GONE
    }
}