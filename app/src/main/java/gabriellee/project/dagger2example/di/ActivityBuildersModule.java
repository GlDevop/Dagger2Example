package gabriellee.project.dagger2example.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import gabriellee.project.dagger2example.di.auth.AuthModule;
import gabriellee.project.dagger2example.di.auth.AuthViewModelsModule;
import gabriellee.project.dagger2example.ui.auth.AuthActivity;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class})
    abstract AuthActivity contributeAuthActivity();

}