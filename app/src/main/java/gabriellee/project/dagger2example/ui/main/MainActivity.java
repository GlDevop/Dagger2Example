package gabriellee.project.dagger2example.ui.main;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;

import gabriellee.project.dagger2example.BaseActivity;
import gabriellee.project.dagger2example.R;

public class MainActivity extends BaseActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Main Activity", Toast.LENGTH_SHORT).show();
    }
}
