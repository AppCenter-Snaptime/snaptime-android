package co.kr.snaptime.data.repository;

import android.util.Log;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import co.kr.snaptime.data.PreferencesKeys;
import co.kr.snaptime.data.api.UserApiService;
import co.kr.snaptime.data.model.login_dto.SignInReqDto;
import co.kr.snaptime.data.model.login_dto.SignUpReqDto;
import kotlinx.coroutines.flow.Flow;
import java.io.IOException;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lco/kr/snaptime/data/repository/UserRepository;", "", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "userApi", "Lco/kr/snaptime/data/api/UserApiService;", "(Landroidx/datastore/core/DataStore;Lco/kr/snaptime/data/api/UserApiService;)V", "signInTokenKey", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "getSignInToken", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveSignInToken", "", "token", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signIn", "Lretrofit2/Response;", "Lco/kr/snaptime/data/model/login_dto/SignInResDto;", "signInReqDto", "Lco/kr/snaptime/data/model/login_dto/SignInReqDto;", "(Lco/kr/snaptime/data/model/login_dto/SignInReqDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "Lco/kr/snaptime/data/model/login_dto/SignUpResDto;", "signUpReqDto", "Lco/kr/snaptime/data/model/login_dto/SignUpReqDto;", "(Lco/kr/snaptime/data/model/login_dto/SignUpReqDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UserRepository {
    private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore = null;
    private final co.kr.snaptime.data.api.UserApiService userApi = null;
    private final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> signInTokenKey = null;
    
    @javax.inject.Inject
    public UserRepository(@org.jetbrains.annotations.NotNull
    androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore, @org.jetbrains.annotations.NotNull
    co.kr.snaptime.data.api.UserApiService userApi) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object signUp(@org.jetbrains.annotations.NotNull
    co.kr.snaptime.data.model.login_dto.SignUpReqDto signUpReqDto, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<co.kr.snaptime.data.model.login_dto.SignUpResDto>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object signIn(@org.jetbrains.annotations.NotNull
    co.kr.snaptime.data.model.login_dto.SignInReqDto signInReqDto, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<co.kr.snaptime.data.model.login_dto.SignInResDto>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveSignInToken(@org.jetbrains.annotations.NotNull
    java.lang.String token, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getSignInToken(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.String>> continuation) {
        return null;
    }
}