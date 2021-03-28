package com.example.applicationworkapi.model

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.annotation.GlideExtension
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.annotation.GlideOption
import com.bumptech.glide.annotation.GlideType
import com.example.applicationworkapi.R

class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val productName: TextView = itemView.findViewById(R.id.product_name) as TextView
        val productImage: ImageView = itemView.findViewById(R.id.prod_image) as ImageView
        val productPrice: TextView = itemView.findViewById(R.id.product_price) as TextView
}

class ProductAdapter(
    private val context: Context,
    private val productList : List<Product>
): RecyclerView.Adapter<ProductViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder =
        ProductViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.product_item,parent,false))

    override fun getItemCount(): Int = productList.size
/*biblioteca glide é para imagens, carregamento e gerenciamento de imagens.
Carrega em background e não interfere no primeiro plano do aplicativo*/

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val item  = productList[position]
        holder.productName.text = item.prName
        holder.productPrice.text = item.prPrice
        Glide.with(context).load(item.prImage).into(holder.productImage)
    }

}