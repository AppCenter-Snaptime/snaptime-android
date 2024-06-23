package co.kr.snaptime.data.api

import android.content.Context
import co.kr.snaptime.data.repository.UserRepository
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitBuilder {
    private const val BASE_URL = "http://na2ru2.me:6308/"
    private lateinit var userRepo: UserRepository

    fun init(context: Context) {
        userRepo = UserRepository(context)
    }

    private val okHttpClient: OkHttpClient by lazy {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)
        OkHttpClient.Builder()
            .addInterceptor(HeaderInterceptor(userRepo))
            .addInterceptor(httpLoggingInterceptor)
            .build()
    }

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
    }

    fun getUserApiService(): UserApiService {
        return getRetrofit().create(UserApiService::class.java)
    }
}