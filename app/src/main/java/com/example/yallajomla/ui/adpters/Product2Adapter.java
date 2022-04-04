package com.example.yallajomla.ui.adpters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yallajomla.databinding.ItemProduct2Binding;
import com.example.yallajomla.databinding.ItemProductBinding;
import com.example.yallajomla.db.models.Product;

import java.util.List;

public class Product2Adapter extends RecyclerView.Adapter<Product2Adapter.mVH> {
    private List<Product> list;
    private Context context;

    public Product2Adapter(Context context) {
        this.context = context;
    }

    public void setList(List<Product> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public mVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemProduct2Binding binding = ItemProduct2Binding.inflate(LayoutInflater.from(context), parent, false);
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
        ItemProduct2Binding binding;

        public mVH(@NonNull ItemProduct2Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
