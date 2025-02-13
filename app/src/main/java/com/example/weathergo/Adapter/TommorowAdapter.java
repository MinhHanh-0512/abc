package com.example.weathergo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.weathergo.Domains.Hourly;
import com.example.weathergo.Domains.TommorowDomain;
import com.example.weathergo.R;

import java.util.ArrayList;


public class TommorowAdapter extends RecyclerView.Adapter<TommorowAdapter.ViewHolder>{
    ArrayList<TommorowDomain> items;
    Context context;


    public TommorowAdapter(ArrayList<TommorowDomain> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_tommorow, parent, false);
        context= parent.getContext();
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

holder.dayTxt.setText(items.get(position).getDay());
holder.statusTxt.setText(items.get(position).getStatus());
holder.hightTxt.setText(items.get(position).getHightTemp());
holder.lowTxt.setText(items.get(position).getLowTemp());

        int drawableResourceId=holder.itemView.getResources()
                .getIdentifier(items.get(position).getPicPath(),"drawable",holder.itemView.getContext().getPackageName());

        Glide.with(context)
                .load(drawableResourceId)
                .into(holder.pic);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView dayTxt, statusTxt, lowTxt, hightTxt;
        ImageView pic;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            dayTxt= itemView.findViewById(R.id.dayTxt);
            statusTxt= itemView.findViewById(R.id.statusTxt);
            lowTxt=itemView.findViewById(R.id.lowTxt);
            hightTxt= itemView.findViewById(R.id.hightTxt);

            pic=itemView.findViewById(R.id.pic);
        }
    }
}