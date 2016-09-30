package io.oldergod.sample.ticker;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class Counter extends BaseObservable {
    private int count = 0;

    Counter() {
    }

    Counter(int count) {
        this.setCount(count);
    }

    @Bindable
    public int getCount() {
        return count;
    }

    void incrementeByOne() {
        this.count = ++count;
        notifyPropertyChanged(BR.count);
    }

    public void setCount(int count) {
        this.count = count;
        notifyPropertyChanged(BR.count);
    }

    void reset() {
        setCount(0);
    }
}
