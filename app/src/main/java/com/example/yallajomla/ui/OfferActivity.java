package com.example.yallajomla.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.yallajomla.R;
import com.example.yallajomla.databinding.ActivityMainBinding;
import com.example.yallajomla.databinding.ActivityOfferBinding;
import com.example.yallajomla.db.models.SliderItem;
import com.example.yallajomla.ui.adpters.SliderAdapter;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class OfferActivity extends AppCompatActivity {
    private ActivityOfferBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil. setContentView(this,R.layout.activity_offer);
      /*  SliderAdapter sliderAdapter1 = new SliderAdapter(this);
        List<SliderItem> list1 = new ArrayList<>();
        ImageView imageView=findViewById(R.id.imageSlider55);
        list1.add(new SliderItem("Text1", R.drawable.clothes));
        list1.add(new SliderItem("Text2", R.drawable.boys));
        list1.add(new SliderItem("Text3", R.drawable.phone));
        slider(sliderAdapter1, list1, binding.);*/
    }
/*
    private void slider(SliderAdapter sliderAdapter, List<SliderItem> list, SliderView sliderView) {
        sliderAdapter.setList(list);
        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM); //set indicator animation by using IndicatorAnimationType. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(R.color.orange1);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
        sliderView.startAutoCycle();
    }*/
}