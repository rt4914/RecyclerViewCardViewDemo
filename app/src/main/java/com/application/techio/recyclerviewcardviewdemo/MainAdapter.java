package com.application.techio.recyclerviewcardviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by demon on 7/23/2016.
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainModelHolder> {

    ArrayList<MainModel> arrayList = null;
    Context myContext;

    public MainAdapter(ArrayList<MainModel> arrayList, Context myContext) {
        this.arrayList = arrayList;
        this.myContext = myContext;
    }

    @Override
    public MainModelHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main,parent,false);
        MainModelHolder mainModelHolder = new MainModelHolder(v);
        return mainModelHolder;
    }

    @Override
    public void onBindViewHolder(MainModelHolder holder, int position) {

        holder.tvName.setText(arrayList.get(position).getVersionName());
        holder.tvCode.setText(arrayList.get(position).getVersionCode());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MainModelHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView tvName;
        TextView tvCode;

        public MainModelHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.tvName);
            tvCode = (TextView) itemView.findViewById(R.id.tvCode);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(myContext,"Item Number "+ getAdapterPosition(),Toast.LENGTH_SHORT).show();
        }
    }
}
