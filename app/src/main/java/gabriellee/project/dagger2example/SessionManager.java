package gabriellee.project.dagger2example;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;

import javax.inject.Inject;

import gabriellee.project.dagger2example.models.User;
import gabriellee.project.dagger2example.ui.auth.AuthResource;

public class SessionManager {

    private static final String TAG = "SessionManager";

    private MediatorLiveData<AuthResource<User>> cachedUser = new MediatorLiveData<>();

    @Inject
    public SessionManager() {

    }

    public void authenticeWithId(final LiveData<AuthResource<User>> source) {
        if(cachedUser != null) {
            cachedUser.setValue(AuthResource.loading((User)null));
            cachedUser.addSource(source, new Observer<AuthResource<User>>() {
                @Override
                public void onChanged(AuthResource<User> userAuthResource) {
                    cachedUser.setValue(userAuthResource);
                    cachedUser.removeSource(source);
                }
            });
        }

        else {
            Log.d(TAG, "authenticeWithId: previous session detected. Retrieving from cache");
        }
    }

    public void logOut() {
        Log.d(TAG, "logOut: logging out...");
        cachedUser.setValue(AuthResource.<User>logout());
    }

    public LiveData<AuthResource<User>> getAuthUser() {
        return cachedUser;
    }
}
