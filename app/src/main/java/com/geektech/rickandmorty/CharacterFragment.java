package com.geektech.rickandmorty;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.rickandmorty.databinding.FragmentCharacterBinding;

import java.util.ArrayList;

public class CharacterFragment extends Fragment {
private FragmentCharacterBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCharacterBinding.inflate(LayoutInflater.from(getContext()),container,false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArrayList<Character> characters = new ArrayList<>();
        characters.add(new Character(R.drawable.rick, "Alive", "Rick Sanchez"));
        characters.add(new Character(R.drawable.morty, "Alive", "Morty Smith"));
        characters.add(new Character(R.drawable.albert, "Dead", "Albert Einstein"));
        characters.add(new Character(R.drawable.smith, "Alive", "Jerry Smith"));
        CharactersAdapter adapter = new CharactersAdapter(characters, new Click() {
            @Override
            public void click(Character character) {
                @NonNull NavDirections directions = CharacterFragmentDirections.actionCharacterFragmentToDetailsFragment(new Character(character.getImage(),character.getDetail(),character.getName()));
                NavHostFragment.findNavController(CharacterFragment.this).navigate(directions);
            }
        });
        binding.recycler.setAdapter(adapter);

    }
}