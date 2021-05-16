package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterForRecycler extends RecyclerView.Adapter<AdapterForRecycler.ViewHolder> {

    ArrayList<Student> list;

    public AdapterForRecycler(ArrayList<Student> myList)
    {
        list=myList;
    }
    @NonNull
    @Override
    public AdapterForRecycler.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterForRecycler.ViewHolder holder, int position) {

        holder.name.setText(list.get(position).getName());
        holder.age.setText(String.valueOf( list.get(position).getAge()));
        holder.degree.setText(list.get(position).getDegree());

    }

    @Override
    public int getItemCount() {
        if(list.equals(null))
            return 0;
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {

        TextView name, age, degree;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.stdName);
            age=itemView.findViewById(R.id.stdAge);
            degree=itemView.findViewById(R.id.stdDegree);
        }
    }
}
