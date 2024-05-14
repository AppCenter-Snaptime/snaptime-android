package co.kr.snaptime

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {
    private const val BASE_URL = "http://na2ru2.me:6308/swagger-ui/index.html"

    var instance: Retrofit? = null

    fun getInstanceFor() : Retrofit {
        if (instance == null) {
            instance = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return instance ?: throw NullPointerException("retrofit instance is null")
    }
}