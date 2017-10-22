package com.example.user1.assisgment51blinkingeffect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {
    TextView textView;
    Button button;

    private Animation animfadeIn;
    private Animation animfadeOut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView= (TextView) findViewById(R.id.TextBlink);
        button= (Button) findViewById(R.id.AnimButton);



        animfadeIn= AnimationUtils.loadAnimation(MainActivity.this,R.anim.fadein);
        animfadeOut=AnimationUtils.loadAnimation(MainActivity.this,R.anim.fadeout);

        animfadeIn.setAnimationListener(this);
        animfadeOut.setAnimationListener(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setVisibility(View.VISIBLE);
                textView.startAnimation(animfadeIn);

            }
        });


    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        if (animation==animfadeIn){

            textView.setVisibility(View.VISIBLE);
            textView.startAnimation(animfadeOut);




        }

    }

    @Override
    public void onAnimationRepeat(Animation animation) {





    }
}
