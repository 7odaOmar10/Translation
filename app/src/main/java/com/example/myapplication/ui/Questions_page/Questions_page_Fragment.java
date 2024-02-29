package com.example.myapplication.ui.Questions_page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentQuistionsBinding;

public class Questions_page_Fragment extends Fragment {

    private FragmentQuistionsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Questions_page_ViewModel homeViewModel =
                new ViewModelProvider(this).get(Questions_page_ViewModel.class);

        binding = FragmentQuistionsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}