package com.example.getir_recycleview_project

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class CategoryCardAdapter(var dataSet:List<Category>,var mContext: Context)
    :RecyclerView.Adapter<CategoryCardAdapter.CategoryCardViewHolder>()
{

    inner class CategoryCardViewHolder(view: View):RecyclerView.ViewHolder(view){

        var categoryImageView:ImageView
        var categoryCard:CardView
        var categoryNameTextView:TextView

        init {

            categoryCard=view.findViewById(R.id.categoryCard)
            categoryImageView=view.findViewById(R.id.categoryImageView)
            categoryNameTextView=view.findViewById(R.id.categoryNameTextView)


        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryCardViewHolder {
        val tasarim=LayoutInflater.from(mContext).inflate(R.layout.category_item_card,parent,false)
        return CategoryCardViewHolder(tasarim)
    }

    override fun onBindViewHolder(holder: CategoryCardViewHolder, position: Int)
    {
       val category=dataSet[position]

        holder.categoryNameTextView.text=category.categoryname
        holder.categoryImageView.setImageResource(mContext.resources.getIdentifier(category.categryImage,"drawable",mContext.packageName))




    }

    override fun getItemCount(): Int {
        return dataSet.size
    }


}