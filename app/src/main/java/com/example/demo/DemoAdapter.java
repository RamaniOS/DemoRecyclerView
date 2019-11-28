package com.example.demo;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class DemoAdapter extends RecyclerView.Adapter<DemoAdapter.DemoViewHolder> {

    private List<Country> countryItems;

    public DemoAdapter(List<Country> items) {
        this.countryItems = items;
    }

    public static class DemoViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;

        public DemoViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }

    @NonNull
    @Override
    public DemoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_demo, parent, false);
        return new DemoViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final DemoViewHolder holder, final int position) {
        System.out.println("Called......");
        holder.textView.setText(countryItems.get(position).getTitle());
        holder.imageView.setImageResource(countryItems.get(position).getFlag());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), HomeActivity.class);
                intent.putExtra("name", countryItems.get(position));
                holder.itemView.getContext().startActivity(intent);
                Toast.makeText(holder.itemView.getContext(), countryItems.get(position).getTitle(), Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return countryItems.size();
    }
}
