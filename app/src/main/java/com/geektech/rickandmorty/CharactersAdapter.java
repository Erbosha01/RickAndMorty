package com.geektech.rickandmorty;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.rickandmorty.databinding.ItemCardBinding;

import java.util.ArrayList;

public class CharactersAdapter extends RecyclerView.Adapter<CharactersAdapter.CharactersViewHolder> {

    private ArrayList<Character> characters;
    private Click click;

    public CharactersAdapter(ArrayList<Character> characters, Click click) {
        this.characters = characters;
        this.click = click;
    }

    @NonNull
    @Override
    public CharactersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CharactersViewHolder(ItemCardBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CharactersViewHolder holder, int position) {
        holder.bind(characters.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click.click(characters.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return characters.size();
    }

    class CharactersViewHolder extends RecyclerView.ViewHolder {
        private ItemCardBinding binding;

        public CharactersViewHolder(ItemCardBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(Character character) {
            binding.img.setImageResource(character.getImage());
            binding.txtOne.setText(character.getDetail());
            binding.txtTwo.setText(character.getName());
        }
    }
}
