package com.example.muliloda_multicalc.Volume;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.muliloda_multicalc.R;

public class VolumeChoose extends AppCompatActivity  {

    Button btnCone, btnPrism, btnCube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.volume_choose);
        btnCone = (Button) findViewById(R.id.btnCone);
        btnPrism = (Button) findViewById(R.id.btnPrism);
        btnCube = (Button) findViewById(R.id.btnCube);


        btnCone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VolumeChoose.this, Cone.class));
            }

        });
        btnPrism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VolumeChoose.this, Prism.class));
            }
        });
        btnCube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VolumeChoose.this, Cube.class));
            }
        });}};