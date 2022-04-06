package com.geektech.rickandmorty;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.rickandmorty.databinding.FragmentDetailsBinding;

public class DetailsFragment extends Fragment {

    private FragmentDetailsBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetailsBinding.inflate(LayoutInflater.from(getContext()),container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String name = DetailsFragmentArgs.fromBundle(getArguments()).getCharacter().getName();
        String alive = DetailsFragmentArgs.fromBundle(getArguments()).getCharacter().getDetail();
        int img = DetailsFragmentArgs.fromBundle(getArguments()).getCharacter().getImage();
        binding.img.setImageResource(img);
        binding.txtOne.setText(alive);
        binding.txtTwo.setText(name);
    }
}