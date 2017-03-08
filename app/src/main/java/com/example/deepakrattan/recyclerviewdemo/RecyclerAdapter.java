package com.example.deepakrattan.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Deepak Rattan on 05-Mar-17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private String[] title, desc;
    private int[] image;
    private ArrayList<ListItem> listItemArrayList;

    public RecyclerAdapter(String[] title, String[] desc, int[] image) {
        this.title = title;
        this.desc = desc;
        this.image = image;
    }

    public RecyclerAdapter(ArrayList<ListItem> listItemArrayList) {
        this.listItemArrayList = listItemArrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //Getting data from ArrayList
        ListItem listItem = listItemArrayList.get(position);
        String title = listItem.getTitile();
        String desc = listItem.getDesc();
        int image = listItem.getImage();

        //Setting data in the ViewHolder
        holder.txtTitle.setText(title);
        holder.txtDesc.setText(desc);
        holder.imageView.setImageResource(image);

        /*holder.txtTitle.setText(title[position]);
        holder.txtDesc.setText(desc[position]);
        holder.imageView.setImageResource(image[position]);*/
    }

    @Override
    public int getItemCount() {
        return listItemArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView txtTitle, txtDesc;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.image);
            txtTitle = (TextView) itemView.findViewById(R.id.title);
            txtDesc = (TextView) itemView.findViewById(R.id.desc);
        }
    }


}
