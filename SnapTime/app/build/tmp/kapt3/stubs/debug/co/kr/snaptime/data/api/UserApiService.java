package co.kr.snaptime.data.api;

import co.kr.snaptime.data.model.login_dto.SignInReqDto;
import co.kr.snaptime.data.model.login_dto.SignInResDto;
import co.kr.snaptime.data.model.login_dto.SignUpReqDto;
import co.kr.snaptime.data.model.login_dto.SignUpResDto;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lco/kr/snaptime/data/api/UserApiService;", "", "signIn", "Lretrofit2/Response;", "Lco/kr/snaptime/data/model/login_dto/SignInResDto;", "requestBody", "Lco/kr/snaptime/data/model/login_dto/SignInReqDto;", "(Lco/kr/snaptime/data/model/login_dto/SignInReqDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "Lco/kr/snaptime/data/model/login_dto/SignUpResDto;", "Lco/kr/snaptime/data/model/login_dto/SignUpReqDto;", "(Lco/kr/snaptime/data/model/login_dto/SignUpReqDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface UserApiService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "users/sign-up")
    public abstract java.lang.Object signUp(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    co.kr.snaptime.data.model.login_dto.SignUpReqDto requestBody, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<co.kr.snaptime.data.model.login_dto.SignUpResDto>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "users/sign-in")
    public abstract java.lang.Object signIn(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    co.kr.snaptime.data.model.login_dto.SignInReqDto requestBody, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<co.kr.snaptime.data.model.login_dto.SignInResDto>> continuation);
}