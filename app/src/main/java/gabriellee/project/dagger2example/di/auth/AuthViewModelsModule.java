package gabriellee.project.dagger2example.di.auth;

import androidx.lifecycle.ViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import gabriellee.project.dagger2example.di.ViewModelKey;
import gabriellee.project.dagger2example.ui.auth.AuthViewModel;

@Module
public abstract class AuthViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthViewModel(AuthViewModel viewModel);
}