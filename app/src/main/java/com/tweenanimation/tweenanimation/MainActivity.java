package com.tweenanimation.tweenanimation;

import android.graphics.drawable.Animatable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtAndroid;
    ImageView imgAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtAndroid =findViewById(R.id.txt_android);
        imgAndroid=findViewById(R.id.img_android);

        txtAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation rotate=AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                txtAndroid.startAnimation(rotate);

            }
        });

        imgAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation rotate=AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
               imgAndroid.startAnimation(rotate);

            }
        });

        txtAndroid.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return true;
            }
        });
        imgAndroid.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return true;
            }
        });

    }
}
