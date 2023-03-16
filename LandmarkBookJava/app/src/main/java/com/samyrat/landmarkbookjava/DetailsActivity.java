package com.samyrat.landmarkbookjava;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.samyrat.landmarkbookjava.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //ViewBinding

        Intent intent = getIntent();


        /*Landmark selectedLandmark = chosenLandmark;yalnis kullanmak guwenilir degil.*/


        //Casting

        Landmark selectedLandmark  =(Landmark) intent.getSerializableExtra
                ("landmark");



        /*Singleton singleton = Singleton.getInstance();
        Landmark selectedLandmak = singleton.getSentLandmark();*/

        binding.nameCity.setText(selectedLandmark.city);
        binding.countryCity.setText(selectedLandmark.countryCity);
        binding.imageView.setImageResource(selectedLandmark.image);
    }
}