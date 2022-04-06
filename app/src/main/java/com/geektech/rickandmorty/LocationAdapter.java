package com.geektech.rickandmorty;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.rickandmorty.databinding.ItemLocationBinding;

import java.util.ArrayList;

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.LocationViewHolder> {

    private ArrayList<Character> characters;
    private Click click;

    public LocationAdapter(ArrayList<Character> characters,Click click) {
        this.click = click;
        this.characters = characters;
    }

    @NonNull
    @Override
    public LocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LocationViewHolder(ItemLocationBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public int getItemCount() {
        return characters.size();
    }

    @Override
    public void onBindViewHolder(@NonNull LocationViewHolder holder, int position) {
        holder.bind(characters.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click.click(characters.get(position));
            }
        });
    }

    class LocationViewHolder extends RecyclerView.ViewHolder{

        private ItemLocationBinding binding;
        public LocationViewHolder(ItemLocationBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(Character character) {
            binding.txtOne.setText(character.getDetail());
            binding.txtTwo.setText(character.getName());
        }
    }
}
