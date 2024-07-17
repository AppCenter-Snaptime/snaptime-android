package co.kr.snaptime.ui.viewmodel;

import androidx.lifecycle.ViewModel;
import co.kr.snaptime.data.model.login_dto.SignInReqDto;
import co.kr.snaptime.data.model.login_dto.SignUpReqDto;
import co.kr.snaptime.data.repository.UserRepository;
import kotlinx.coroutines.flow.StateFlow;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lco/kr/snaptime/ui/viewmodel/UserViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepo", "Lco/kr/snaptime/data/repository/UserRepository;", "(Lco/kr/snaptime/data/repository/UserRepository;)V", "_code", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_signInResponse", "", "_signUpResponse", "_token", "code", "Lkotlinx/coroutines/flow/StateFlow;", "getCode", "()Lkotlinx/coroutines/flow/StateFlow;", "signInResponse", "getSignInResponse", "signUpResponse", "getSignUpResponse", "token", "getToken", "signIn", "", "signInReqDto", "Lco/kr/snaptime/data/model/login_dto/SignInReqDto;", "signUp", "signUpReqDto", "Lco/kr/snaptime/data/model/login_dto/SignUpReqDto;", "app_debug"})
public final class UserViewModel extends androidx.lifecycle.ViewModel {
    private final co.kr.snaptime.data.repository.UserRepository userRepo = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _signUpResponse = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> signUpResponse = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _signInResponse = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> signInResponse = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _code = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> code = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _token = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> token = null;
    
    public UserViewModel(@org.jetbrains.annotations.NotNull
    co.kr.snaptime.data.repository.UserRepository userRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getSignUpResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getSignInResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getToken() {
        return null;
    }
    
    public final void signUp(@org.jetbrains.annotations.NotNull
    co.kr.snaptime.data.model.login_dto.SignUpReqDto signUpReqDto) {
    }
    
    public final void signIn(@org.jetbrains.annotations.NotNull
    co.kr.snaptime.data.model.login_dto.SignInReqDto signInReqDto) {
    }
}