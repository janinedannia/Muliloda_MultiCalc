package com.example.muliloda_multicalc.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.muliloda_multicalc.Area.AreaChoose;
import com.example.muliloda_multicalc.R;
import com.example.muliloda_multicalc.Volume.VolumeChoose;

public class MainActivity extends AppCompatActivity {

    Button btnArea, btnVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose);
        setContentView(R.layout.choose);
        btnVolume = (Button) findViewById(R.id.btnVolume);
        btnArea = (Button) findViewById(R.id.btnArea);

        btnArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AreaChoose.class));
            }

        });
        btnVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, VolumeChoose.class));
            }
        });
    }
}

