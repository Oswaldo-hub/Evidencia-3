package com.example.myapplication.ui.AgregarEliminar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentAgregarEliminarBinding;

public class Agregar_EliminarFragment extends Fragment {

    private FragmentAgregarEliminarBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Agregar_EliminarViewModel slideshowViewModel =
                new ViewModelProvider(this).get(Agregar_EliminarViewModel.class);

        binding = FragmentAgregarEliminarBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.Agregar;
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}