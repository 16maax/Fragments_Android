package com.example.idgs9a11ma24fragments.ui.room;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.idgs9a11ma24fragments.databinding.FragmentRoomBinding;

public class RoomFragment extends Fragment {

    private FragmentRoomBinding binding;
    private RoomViewModel roomViewModel;

    public static RoomFragment newInstance() {
        return new RoomFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentRoomBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Inicializar RoomViewModel
        roomViewModel = new ViewModelProvider(this).get(RoomViewModel.class);

        final TextView textView = binding.tvRoom;
        roomViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
