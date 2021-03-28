package com.example.applicationworkapi.model

import com.google.gson.annotations.SerializedName

/*model Product que é responsável pelo mapeamento de retorno da API.
* e do tipo
Data Class, pois faz o get e o set automaticamente.*/
/*aqui começamos a mapear os objetos que retornam da API*/


data class Product (
    @SerializedName("id")
    val id : String,
    @SerializedName("prname")
    val prName : String,
    @SerializedName("primage")
    val prImage : String,
    @SerializedName("prprice")
    val prPrice:String
)