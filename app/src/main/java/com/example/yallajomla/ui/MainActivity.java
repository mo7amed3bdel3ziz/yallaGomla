package com.example.yallajomla.ui;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.yallajomla.R;
import com.example.yallajomla.databinding.ActivityMainBinding;
import com.example.yallajomla.db.models.Product;
import com.example.yallajomla.db.models.SliderItem;
import com.example.yallajomla.ui.adpters.Product2Adapter;
import com.example.yallajomla.ui.adpters.Product3Adapter;
import com.example.yallajomla.ui.adpters.ProductAdapter;
import com.example.yallajomla.ui.adpters.SilderAdapter2;
import com.example.yallajomla.ui.adpters.SliderAdapter;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        SliderAdapter sliderAdapter1 = new SliderAdapter(this);
        SliderAdapter sliderAdapter2 = new SliderAdapter(this);
        SilderAdapter2 sliderAdapter3 = new SilderAdapter2(this);
        List<SliderItem> list0 = new ArrayList<>();

        list0.add(new SliderItem("", R.drawable.clothes));
        list0.add(new SliderItem("", R.drawable.boys));
        list0.add(new SliderItem("", R.drawable.phone));
        slider(sliderAdapter1, list0, binding.imageSlider);
        slider(sliderAdapter2, list0, binding.imageSlider2);
        slider(sliderAdapter3, list0, binding.imageSlider3);

        List<Product> list2 = new ArrayList<>();
        list2.add(new Product("Text1", R.drawable.download));
        list2.add(new Product("Text2", R.drawable.boys));
        list2.add(new Product("Text3", R.drawable.phone));
        list2.add(new Product("Text4", R.drawable.clothes));

        ProductAdapter productAdapter1 = new ProductAdapter(this);
        Product2Adapter productAdapter2 = new Product2Adapter(this);
        Product3Adapter productAdapter3 = new Product3Adapter(this);
        productAdapter1.setList(list2);
        productAdapter2.setList(list2);
        productAdapter3.setList(list2);
        binding.recyclerView.setAdapter(productAdapter1);
        binding.recyclerView2.setAdapter(productAdapter2);
        binding.recyclerView3.setAdapter(productAdapter3);


        binding.header2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,OfferActivity.class);
                startActivity(intent);
            }
        });

    }

    private void slider(SliderAdapter sliderAdapter, List<SliderItem> list, SliderView sliderView) {
        sliderAdapter.setList(list);
        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM); //set indicator animation by using IndicatorAnimationType. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(R.color.orange2);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
        sliderView.startAutoCycle();
    }
    private void slider(SilderAdapter2 sliderAdapter, List<SliderItem> list, SliderView sliderView) {
        sliderAdapter.setList(list);
        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM); //set indicator animation by using IndicatorAnimationType. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(R.color.orange2);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
        sliderView.startAutoCycle();
    }
}