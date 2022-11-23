package com.example.myapplication.ui.AgregarEliminar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Agregar_EliminarViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public Agregar_EliminarViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Agregar Producto");
    }

    public LiveData<String> getText() {
        return mText;
    }
}