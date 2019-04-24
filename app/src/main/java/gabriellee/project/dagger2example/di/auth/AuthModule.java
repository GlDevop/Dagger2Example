package gabriellee.project.dagger2example.di.auth;

import dagger.Module;
import dagger.Provides;
import gabriellee.project.dagger2example.network.auth.AuthApi;
import retrofit2.Retrofit;

@Module
public class AuthModule {

    @Provides
    static AuthApi provideAuthApi(Retrofit retrofit){
        return retrofit.create(AuthApi.class);
    }
}
