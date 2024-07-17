package co.kr.snaptime.data.api;

import co.kr.snaptime.data.repository.UserRepository;
import okhttp3.Interceptor;
import okhttp3.Response;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lco/kr/snaptime/data/api/HeaderInterceptor;", "Lokhttp3/Interceptor;", "userRepo", "Lco/kr/snaptime/data/repository/UserRepository;", "(Lco/kr/snaptime/data/repository/UserRepository;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "app_debug"})
public final class HeaderInterceptor implements okhttp3.Interceptor {
    private final co.kr.snaptime.data.repository.UserRepository userRepo = null;
    
    public HeaderInterceptor(@org.jetbrains.annotations.NotNull
    co.kr.snaptime.data.repository.UserRepository userRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
}