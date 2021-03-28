package com.example.applicationworkapi.api

import retrofit2.Call
import com.example.applicationworkapi.model.Product
import retrofit2.http.GET

/*Essa interface tem como objetivo ter também uma Data Annotation, que é */

interface ProductApi {
    @GET("getdata.php")                                          /*Aqui passamos o método da API para cá*/
    fun getProductApi(): Call<List<Product>>                           /*Aqui fazemos um método para receber essa Annotation
                                                                        A função Call é do retrofit*/
}