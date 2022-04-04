package com.example.yallajomla.ui.adpters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;

import com.example.yallajomla.R;
import com.example.yallajomla.databinding.ItemSlider2Binding;
import com.example.yallajomla.databinding.ItemSliderBinding;
import com.example.yallajomla.db.models.SliderItem;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.ArrayList;
import java.util.List;
public class SilderAdapter2 extends SliderViewAdapter<SilderAdapter2.SliderAdapterVH> {
    private Context context;
    private List<SliderItem> list = new ArrayList<>();

    public SilderAdapter2(Context context) {
        this.context = context;
    }

    public void renewItems(List<SliderItem> sliderItems) {
        this.list = sliderItems;
        notifyDataSetChanged();
    }

    public void deleteItem(int position) {
        this.list.remove(position);
        notifyDataSetChanged();
    }

    public void addItem(SliderItem sliderItem) {
        this.list.add(sliderItem);
        notifyDataSetChanged();
    }

    public void setList(List<SliderItem> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        ItemSlider2Binding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.item_slider2, parent, false);
        return new SilderAdapter2.SliderAdapterVH(binding);
    }

    @Override
    public void onBindViewHolder(SliderAdapterVH holder, final int position) {
        SliderItem item = list.get(position);
        holder.binding.title.setText(item.getDescription());
        holder.binding.mainImage.setImageResource(item.getImage());
    }

    @Override
    public int getCount() {
        return list.size();
    }

    class SliderAdapterVH extends SliderViewAdapter.ViewHolder {
        ItemSlider2Binding binding;

        public SliderAdapterVH(ItemSlider2Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }


}
