package com.myapp.theagrim.torguo;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.bumptech.glide.Glide;

import jp.wasabeef.glide.transformations.BlurTransformation;

import static com.bumptech.glide.request.RequestOptions.bitmapTransform;

public class Page4 extends Fragment {

    public Page4(){

    }

    int arr[]={R.drawable.charitya,R.drawable.charityc,R.drawable.charityd,R.drawable.charityb};
    ViewFlipper viewFlipper;
    ImageView imageView;



    @Override
    @TargetApi(21)
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_page4, container, false);
        viewFlipper=rootView.findViewById(R.id.viewflipper);



        for(int i=0;i<4;++i){
            setViewFlipper(i);
        }


        return rootView;
    }

    public void setViewFlipper(int val){
        ImageView imageView=new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Glide.with(getActivity()).load(arr[val])
                .apply(bitmapTransform(new BlurTransformation(30)))
                .into(imageView);

        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(8000);
        viewFlipper.setAutoStart(true);
        viewFlipper.setInAnimation(getContext(),R.anim.anim);
        viewFlipper.setOutAnimation(getContext(),R.anim.anim1);
    }
}
