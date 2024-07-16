package com.example.idgs9a11ma24fragments.ui.room;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RoomViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public RoomViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("Room");
    }
    public LiveData<String> getText() { return  mText; }
}