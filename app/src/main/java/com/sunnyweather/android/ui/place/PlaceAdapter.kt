package com.sunnyweather.android.ui.place

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sunnyweather.android.R
import com.sunnyweather.android.entity.Place

class PlaceAdapter(val context: Context, var data: List<Place>) :
    RecyclerView.Adapter<PlaceAdapter.MyHolder>() {

    inner class MyHolder(val view: View) : RecyclerView.ViewHolder(view) {
     var placeName:TextView=view.findViewById(R.id.placeName)
     var placeAdress:TextView=view.findViewById(R.id.placeAdress)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.place_item, parent, false)
        return MyHolder(view)
    }

    override fun getItemCount(): Int {
       return data.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val place=data.get(position)
        holder.placeAdress.text = place.address
        holder.placeName.text = place.name
    }
}