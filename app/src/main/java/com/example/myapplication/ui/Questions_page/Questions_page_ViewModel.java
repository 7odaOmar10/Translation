package com.example.myapplication.ui.Questions_page;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Questions_page_ViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public Questions_page_ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}