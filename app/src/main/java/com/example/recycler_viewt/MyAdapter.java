package com.example.recycler_viewt;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    private List<Item> itemList;


    public MyAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // Responsible for creating new vieholders for your items
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        // Binds the data from your dataset to the views within the view holder
        Item item=itemList.get(position);
        holder.title.setText(item.getItemName());
        holder.discription.setText(item.getItemDesc());
        holder.imageView.setImageResource(item.getItemImage());


    }

    @Override
    public int getItemCount() {
        // Return the total number of items in your dataset
        return itemList.size();
    }




    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView title;
        TextView discription;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageview);
            title= itemView.findViewById(R.id.title_txt);
            discription=itemView.findViewById(R.id.discription_txt);

        }
    }
}
