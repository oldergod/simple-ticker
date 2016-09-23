package io.oldergod.sample.ticker;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class Counter extends BaseObservable {
    private int count = 0;

    @Bindable
    public String getCount() {
        return String.valueOf(count);
    }

    public void incrementeByOne() {
        this.count = ++count;
        notifyPropertyChanged(BR.count);
    }

    public void reset() {
        this.count = 0;
        notifyPropertyChanged(BR.count);
    }
}
