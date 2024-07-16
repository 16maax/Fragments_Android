package com.example.idgs9a11ma24fragments.ui.maximiliano;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MaximilianoViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public MaximilianoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Me llamo Maximiliano Casillas Carrillo, tengo 21 años me gusta salir en moto con mis amigos. " +
                "A mis 20 años compre la moto que era mi primer meta a cumplir.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}