package co.kr.snaptime.di;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import co.kr.snaptime.data.api.HeaderInterceptor;
import co.kr.snaptime.data.api.RetrofitBuilder;
import co.kr.snaptime.data.api.UserApiService;
import co.kr.snaptime.data.repository.UserRepository;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\rH\u0007J\u001e\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0014\u001a\u00020\u0004H\u0007\u00a8\u0006\u0015"}, d2 = {"Lco/kr/snaptime/di/NetworkModule;", "", "()V", "provideApiService", "Lco/kr/snaptime/data/api/UserApiService;", "retrofit", "Lretrofit2/Retrofit;", "provideDataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "context", "Landroid/content/Context;", "provideOkhttpClient", "Lokhttp3/OkHttpClient;", "userRepository", "Lco/kr/snaptime/data/repository/UserRepository;", "provideRetrofit", "okHttpClient", "provideUserRepository", "dataStore", "userApi", "app_debug"})
@dagger.Module
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull
    public static final co.kr.snaptime.di.NetworkModule INSTANCE = null;
    
    private NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> provideDataStore(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final co.kr.snaptime.data.repository.UserRepository provideUserRepository(@org.jetbrains.annotations.NotNull
    androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore, @org.jetbrains.annotations.NotNull
    co.kr.snaptime.data.api.UserApiService userApi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final okhttp3.OkHttpClient provideOkhttpClient(@org.jetbrains.annotations.NotNull
    co.kr.snaptime.data.repository.UserRepository userRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final co.kr.snaptime.data.api.UserApiService provideApiService(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
}