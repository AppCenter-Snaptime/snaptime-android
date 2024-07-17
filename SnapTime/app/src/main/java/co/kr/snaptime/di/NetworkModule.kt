package co.kr.snaptime.di

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import co.kr.snaptime.data.api.HeaderInterceptor
import co.kr.snaptime.data.api.RetrofitBuilder
import co.kr.snaptime.data.api.UserApiService
import co.kr.snaptime.data.repository.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import javax.inject.Singleton

private val Context.dataStore by preferencesDataStore("signInToken")

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideDataStore(@ApplicationContext context: Context): DataStore<Preferences> {
        return context.dataStore
    }

    @Provides
    @Singleton
    fun provideUserRepository(
        dataStore: DataStore<Preferences>,
        userApi: UserApiService
    ): UserRepository {
        return UserRepository(dataStore, userApi)
    }

    @Provides
    @Singleton
    fun provideOkhttpClient(userRepository: UserRepository): OkHttpClient {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)
        return OkHttpClient.Builder()
            .addInterceptor(HeaderInterceptor(userRepository))
            .addInterceptor(httpLoggingInterceptor)
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return RetrofitBuilder.getRetrofit(okHttpClient)
    }

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): UserApiService {
        return retrofit.create(UserApiService::class.java)
    }
}