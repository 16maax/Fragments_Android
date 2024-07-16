package com.example.idgs9a11ma24fragments.ui.maximiliano;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.idgs9a11ma24fragments.databinding.FragmentMaximilianoBinding;

public class MaximilianoFragment extends Fragment {

    private FragmentMaximilianoBinding binding;
    private MaximilianoViewModel maximilianoViewModel;

    public static MaximilianoFragment newInstance() {
        return new MaximilianoFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentMaximilianoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Inicializar MaximilianoViewModel
        maximilianoViewModel = new ViewModelProvider(this).get(MaximilianoViewModel.class);

        final TextView textView = binding.tvMaximiliano;
        maximilianoViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
