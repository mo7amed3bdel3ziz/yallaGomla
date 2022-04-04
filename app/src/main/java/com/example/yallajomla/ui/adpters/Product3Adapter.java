package com.example.yallajomla.ui.adpters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yallajomla.databinding.ItemProduct3Binding;
import com.example.yallajomla.db.models.Product;

import java.util.List;

public class Product3Adapter extends RecyclerView.Adapter<Product3Adapter.mVH> {
    private List<Product> list;
    private Context context;

    public Product3Adapter(Context context) {
        this.context = context;
    }

    public void setList(List<Product> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public mVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemProduct3Binding binding = ItemProduct3Binding.inflate(LayoutInflater.from(context), parent, false);
        return new mVH(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull mVH holder, int position) {
        Product item = list.get(position);
        holder.binding.title.setText(item.getDescription());
        holder.binding.mainImage.setImageResource(item.getImage());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class mVH extends RecyclerView.ViewHolder {
        ItemProduct3Binding binding;

        public mVH(@NonNull ItemProduct3Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
