package com.example.demo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NewAdapter extends RecyclerView.Adapter<NewAdapter.NewViewHolder> {

    private List<Country> items;

    public NewAdapter(List<Country> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public NewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { // cellforrow
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_demo, parent, false);
        return new NewViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull NewViewHolder holder, int position) { // update values with model
        holder.title.setText(items.get(position).getTitle());
    }

    @Override
    public int getItemCount() { //no of rows
        return items.size();
    }

    public static class NewViewHolder extends RecyclerView.ViewHolder {

        public TextView title;

        public NewViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.textView);
        }
    }
}
