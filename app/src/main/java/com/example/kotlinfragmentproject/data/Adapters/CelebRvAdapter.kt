package com.example.kotlinfragmentproject.data.Adapters

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinfragmentproject.MainActivity
import com.example.kotlinfragmentproject.R
import com.example.kotlinfragmentproject.data.Celeb

import kotlinx.android.synthetic.main.celeb_item.view.*

class CelebRvAdapter(val celebList: List<Celeb>, val clickListener: (Celeb) -> Unit)
    : RecyclerView.Adapter<CelebRvAdapter.CelebViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CelebViewHolder =
     CelebViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.celeb_item, parent, false))



    override fun getItemCount(): Int {
        return celebList.size
    }



    override fun onBindViewHolder(holder: CelebViewHolder, position: Int) {

        (holder as CelebViewHolder).bindViews(celebList[position],clickListener)
    }





    class CelebViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
       fun bindViews(celeb :Celeb, clickListener: (Celeb) -> Unit){
           itemView.tvFirstName.text = celeb.firstName
           itemView.tvLastName.text = celeb.lastName


           itemView.setOnClickListener {
               clickListener(celeb)

               //Toast.makeText(itemView.context,""+ celeb.firstName, Toast.LENGTH_SHORT).show()
           }






           }






           }





           }
















