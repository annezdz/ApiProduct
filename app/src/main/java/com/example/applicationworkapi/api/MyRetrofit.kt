package com.example.applicationworkapi.api

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/*Retrofit é um Framework desenvolvido pela square e possibilita a facilidade na questão de conexão
* com uma API que esteja via http. O Retrofit é uma das apis mais utilizadas no Android.*/
class MyRetrofit {
    private val retrofit : Retrofit
    fun productApi() : ProductApi{
        return retrofit.create(ProductApi::class.java)
    }

    /*Aqui vamos passar a URL que está no navegador*/

    companion object{
        private const val BASE_URL = "https://uniqueandrocode.000webhostapp.com/hiren/androidtutorial/mycart/"

        var myRetrofit: MyRetrofit? = null
        @get:Synchronized /*essa annotation serve para fazer uma requisição dela do retrofit em segundo plano*/
        val instance: MyRetrofit?
        get(){
            if(myRetrofit == null){
                myRetrofit = MyRetrofit()
            }
            return myRetrofit
        }
    }
    init{
        /*Converte a URL, que é um Json em Product*/
        retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
    }


}