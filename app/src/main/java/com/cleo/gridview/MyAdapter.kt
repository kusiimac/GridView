package com.cleo.gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(val context:Context, val list:ArrayList<SellModel>) : BaseAdapter(){
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(p0: Int): Any {
        return list[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.grid_item_layout,null)

        val image = view.findViewById<ImageView>(R.id.image)
        val description = view.findViewById<TextView>(R.id.description)
        val price = view.findViewById<TextView>(R.id.price)

        image.setImageResource(list[p0].image)
        description.text = list[p0].description
        price.text = list[p0].price

        return view
    }

}