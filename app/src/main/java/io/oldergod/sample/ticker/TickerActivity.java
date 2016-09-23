package io.oldergod.sample.ticker;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import io.oldergod.sample.ticker.databinding.ActivityTickerBinding;

public class TickerActivity extends AppCompatActivity {
    private static final String TAG = "TickerActivity";
    private static final String COUNTER_KEY = "COUNTER_KEY";

    ActivityTickerBinding binding;
    private Counter counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            counter = new Counter();
        } else {
            counter = new Counter(savedInstanceState.getInt(COUNTER_KEY, 0));
        }
        binding = DataBindingUtil.setContentView(this, R.layout.activity_ticker);
        binding.setCounter(counter);
        binding.setHandler(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.ticker_menu, menu);
        return true;
    }

    public void onButtonClicked(View view) {
        counter.incrementeByOne();
    }

    public void onResetSelected(MenuItem item) {
        counter.reset();
    }

    public void onGotoSaveSelected(MenuItem item) {
        Intent intent = new Intent(this, SaveActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(COUNTER_KEY, Integer.valueOf(counter.getCount()));
    }
}
