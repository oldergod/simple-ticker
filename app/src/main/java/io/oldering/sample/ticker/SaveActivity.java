package io.oldering.sample.ticker;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import io.oldering.sample.ticker.databinding.ActivitySaveBinding;

public class SaveActivity extends AppCompatActivity {
    ActivitySaveBinding binding;
    Profile profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.profile = new Profile();
        binding = DataBindingUtil.setContentView(this, R.layout.activity_save);
        binding.setHandler(this);
        binding.setProfile(profile);
    }

    public void onSaveClicked(View view) {
        Toast.makeText(this, "「" + profile.getName() + "」を保存した。たぶん。", Toast.LENGTH_LONG).show();
        finish();
    }
}
