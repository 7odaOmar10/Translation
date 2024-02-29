package com.example.myapplication.ui.Words_page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentWordsBinding;

public class Words_page_Fragment extends Fragment {

    private FragmentWordsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Words_page_ViewModel wordspageViewModel =
                new ViewModelProvider(this).get(Words_page_ViewModel.class);

        binding = FragmentWordsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}