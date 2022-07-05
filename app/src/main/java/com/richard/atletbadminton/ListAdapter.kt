package com.richard.atletbadminton

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListAdapter (val list: ArrayList<AtletModel>) : RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    class MyViewHolder(itemview : View) : RecyclerView.ViewHolder(itemview) {
        var tv_nama = itemview.findViewById<TextView>(R.id.tv_item_nama)
        var tv_detail = itemview.findViewById<TextView>(R.id.tv_item_detail)
        var imageView = itemview.findViewById<ImageView>(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder (
        LayoutInflater.from(parent.context).inflate(R.layout.list_data, parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val result = list[position]

        Glide.with(holder.itemView.context).load(result.poto)
            .apply(RequestOptions().override(55,55))
            .into(holder.imageView)

        holder.tv_nama.text = result.nama
        holder.tv_detail.text = result.detail

        holder.itemView.setOnClickListener {
            val pindah = Intent(holder.itemView.context, DetailActivity::class.java)
            pindah.putExtra(DetailActivity.EXTRA_NAMA, result.nama)
            pindah.putExtra(DetailActivity.EXTRA_DETAIL, result.detail)
            pindah.putExtra(DetailActivity.EXTRA_IMG, result.poto)
            pindah.putExtra(DetailActivity.EXTRA_KELAHIRAN, result.kelahiran)
            pindah.putExtra(DetailActivity.EXTRA_TINGGI, result.tinggi)
            pindah.putExtra(DetailActivity.EXTRA_BERAT, result.berat)
            holder.itemView.context.startActivity(pindah)

            Toast.makeText(holder.itemView.context, "Kamu memilih " + list[position].nama, Toast.LENGTH_LONG).show()
        }
    }

    override fun getItemCount() = list.size

}