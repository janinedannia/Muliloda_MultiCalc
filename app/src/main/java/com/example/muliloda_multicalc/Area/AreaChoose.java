package com.example.muliloda_multicalc.Area;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AreaChoose {

    Button btnSquare;
    Button btnRectangle;
    Button btnCircle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.area_choose);
        btnSquare = (Button) findViewbyId(R.id.btnSquare);
        btnRectangle = (Button) findViewById(R.id.btnRectangle);
        btnCircle = (Button) findViewById(R.id.btnCircle);

        btnSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AreaChoose.this, Square.class));
            }

        });
        btnRectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AreaChoose.this, Rectangle.class));
            }
        });
        btnCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AreaChoose.this, Circle.class));
            }
        });}}

