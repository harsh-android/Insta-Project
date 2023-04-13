package com.harsh.instaproject.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.harsh.instaproject.InstaModel;
import com.harsh.instaproject.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.InstaHolder> {

    ArrayList<InstaModel> dataList;
    Context context;
    public StoryAdapter(ArrayList<InstaModel> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public InstaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.story_item,parent,false);
        return new InstaHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InstaHolder holder, int position) {

        Glide.with(context).load(dataList.get(position).dp).into(holder.profile);

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class InstaHolder extends RecyclerView.ViewHolder {
        CircleImageView profile;

        public InstaHolder(@NonNull View itemView) {
            super(itemView);
            profile = itemView.findViewById(R.id.profile);
        }

    }

}
