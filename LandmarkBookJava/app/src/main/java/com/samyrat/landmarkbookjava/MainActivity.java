package com.samyrat.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.samyrat.landmarkbookjava.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    ArrayList<Landmark> landmarkArrayList;

    /*static Landmark chosenLandmark;   yalnis kullanmak guwenilir degil.*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);



        landmarkArrayList = new ArrayList<>();
        //Data

        Landmark ashgabat = new Landmark
                ("ASHGABAT","TURKMENISTAN",R.drawable.ashgabat);
        Landmark eskishehir = new Landmark
                ("ESKISHEHIR","TURKEY",R.drawable.eskishehir);
        Landmark pisa = new Landmark
                ("PISA","ITALY",R.drawable.pisa);
        Landmark eifel = new Landmark
                ("EIFEL","FRANCE",R.drawable.eyfel);
        Landmark colosseo = new Landmark
                ("COLOSSEO","ITALY",R.drawable.colosseo);

        landmarkArrayList.add(ashgabat);
        landmarkArrayList.add(eskishehir);
        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eifel);
        landmarkArrayList.add(colosseo);


        //Not Efficient
        //Bitmap
        Bitmap pisaBitmap = BitmapFactory.decodeResource(getResources(),R.drawable.pisa);


        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);

        /*
        //Adapter
        //ListView
        //mapping

        ArrayAdapter arrayAdapter = new ArrayAdapter
                (this, android.R.layout.simple_list_item_1,
                        landmarkArrayList.stream().map(landmark -> landmark.city).
                                collect(Collectors.toList())
                );
        binding.listView.setAdapter(arrayAdapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText (MainActivity.this,landmarkArrayList.get(position).city,Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("landmark",landmarkArrayList.get(position));
                startActivity(intent);
            }
        });
        */
    }
}