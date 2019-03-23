package com.example.court_counter_clonefragment;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.content.ClipData;

public class SharedViewModel extends ViewModel {
    private final MutableLiveData country= new MutableLiveData();

    public void select(String item) {
        country.setValue(item);
    }

    public MutableLiveData getSelected() {
        return country;
    }
}
