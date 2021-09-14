package com.example.images;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean flag = true;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
    }

    public void changeImage(View view){

        if(flag){
          imageView.setImageResource(R.drawable.image1);
        }
        else{
            imageView.setImageResource(R.drawable.image2);
        }
        flag = !flag;
    }
}