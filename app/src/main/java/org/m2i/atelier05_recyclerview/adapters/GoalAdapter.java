package org.m2i.atelier05_recyclerview.adapters;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.m2i.atelier05_recyclerview.R;

import java.util.ArrayList;

public class GoalAdapter extends RecyclerView.Adapter<GoalAdapter.GoalViewHolder> {
    ArrayList<String> list ;

    public GoalAdapter(ArrayList<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public GoalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        return new GoalViewHolder(viewItem);
    }

    @Override
    public void onBindViewHolder(@NonNull GoalViewHolder holder, int position) {
        holder.goal_txt.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class GoalViewHolder extends RecyclerView.ViewHolder{
        TextView goal_txt;
        public GoalViewHolder(View itemView){ // itemView ?? => row_item.xml => Java (adapter L 24)
            super(itemView);
            goal_txt = itemView.findViewById(R.id.goal_title_txt);
        }
    }

}
