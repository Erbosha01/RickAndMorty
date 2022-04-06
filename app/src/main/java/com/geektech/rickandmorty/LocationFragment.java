package com.geektech.rickandmorty;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.GridLayoutManager;

import android.provider.BlockedNumberContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

import com.geektech.rickandmorty.databinding.FragmentLocationBinding;

import java.util.ArrayList;

public class LocationFragment extends Fragment {

    private FragmentLocationBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLocationBinding.inflate(LayoutInflater.from(getContext()),container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArrayList<Character> characters = new ArrayList<>();
        characters.add(new Character(R.drawable.galaxy,"Earth (C-137)","Planet"));
        characters.add(new Character(R.drawable.galaxy,"Earth (C-137)","Planet"));
        characters.add(new Character(R.drawable.galaxy,"Earth (C-137)","Planet"));
        characters.add(new Character(R.drawable.galaxy,"Earth (C-137)","Planet"));
        characters.add(new Character(R.drawable.galaxy,"Earth (C-137)","Planet"));
        characters.add(new Character(R.drawable.galaxy,"Earth (C-137)","Planet"));
        characters.add(new Character(R.drawable.galaxy,"Earth (C-137)","Planet"));
        characters.add(new Character(R.drawable.galaxy,"Earth (C-137)","Planet"));
        characters.add(new Character(R.drawable.galaxy,"Earth (C-137)","Planet"));
        characters.add(new Character(R.drawable.galaxy,"Earth (C-137)","Planet"));
        characters.add(new Character(R.drawable.galaxy,"Earth (C-137)","Planet"));
        characters.add(new Character(R.drawable.galaxy,"Earth (C-137)","Planet"));
        characters.add(new Character(R.drawable.galaxy,"Earth (C-137)","Planet"));
        characters.add(new Character(R.drawable.galaxy,"Earth (C-137)","Planet"));
        characters.add(new Character(R.drawable.galaxy,"Earth (C-137)","Planet"));
        characters.add(new Character(R.drawable.galaxy,"Earth (C-137)","Planet"));
        characters.add(new Character(R.drawable.galaxy,"Earth (C-137)","Planet"));
        characters.add(new Character(R.drawable.galaxy,"Earth (C-137)","Planet"));
        characters.add(new Character(R.drawable.galaxy,"Earth (C-137)","Planet"));
        characters.add(new Character(R.drawable.galaxy,"Earth (C-137)","Planet"));
        LocationAdapter adapter = new LocationAdapter(characters, new Click() {
            @Override
            public void click(Character character) {
                LocationFragmentDirections.ActionLocationFragmentToDetailsFragment directions = LocationFragmentDirections.actionLocationFragmentToDetailsFragment(new Character(character.getImage(),character.getDetail(),character.getName()));
                NavHostFragment.findNavController(LocationFragment.this).navigate(directions);
            }
        });
        binding.recycler.setAdapter(adapter);
    }
}