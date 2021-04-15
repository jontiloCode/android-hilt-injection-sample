package com.example.latihanhilt.mvvm.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.latihanhilt.R
import com.example.latihanhilt.mvvm.data.model.User
import kotlinx.android.synthetic.main.item_user.view.*

class MyAdapter(private val users: ArrayList<User>) :
    RecyclerView.Adapter<MyAdapter.DataViewHolder>() {


    class DataViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind(user: User) {

            itemView.txt_item_name.text = user.name
            itemView.txt_item_email.text = user.email
            Glide.with(itemView.imageView.context).load(user.avatar).into(itemView.imageView)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
      return DataViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent ,false))
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(users[position])
    }

    override fun getItemCount(): Int  = users.size

    fun addData(list: ArrayList<User>) {
        users.addAll(list)
        notifyDataSetChanged()
    }
}