package io.oldergod.sample.ticker;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import io.oldergod.sample.ticker.databinding.ActivitySaveBinding;

public class SaveActivity extends AppCompatActivity {
    ActivitySaveBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_save);
        binding.setHandler(this);
    }

    public void onSaveClicked(View view) {
        Toast.makeText(this, "保存した。たぶん。", Toast.LENGTH_LONG).show();
        finish();
    }
}
