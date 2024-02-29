package com.example.myapplication.ui.Words_page;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Words_page_ViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public Words_page_ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}