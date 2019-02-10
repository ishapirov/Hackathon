package com.example.thatssewyou;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.widget.ImageButton;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.view.MotionEvent;


public class MainActivity extends AppCompatActivity{

    private TextView mTextMessage;
    double x1;
    double x2;
    double y1;
    double y2;
    private ImageButton thumbsUp,thumbsDown,thumbsSide;
    private ImageView clothes;
    private Intent main;
    private int counter = 1;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        thumbsUp = findViewById(R.id.upThumb);
        thumbsDown = findViewById(R.id.downThumb);
        thumbsSide = findViewById(R.id.sideThumb);
        clothes = findViewById(R.id.Clothes);


        thumbsUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                main = new Intent(MainActivity.this,ClickWish.class);

                if(counter == 1) {
                    counter++;
                    clothes.setImageResource(R.drawable.spongebobshorts);
                    main.putExtra("resId",R.drawable.bluesweater);
                    startActivity(main);
                }
                if(counter == 2)
                {
                    counter++;
                    clothes.setImageResource(R.drawable.bluejeans);
                    main.putExtra("resId",R.drawable.spongebobshorts);
                    startActivity(main);
                }
                if(counter == 3)
                {
                    counter++;
                    clothes.setImageResource(R.drawable.greenjacoat);
                    main.putExtra("resId",R.drawable.bluejeans);
                    startActivity(main);
                }
                if(counter == 4)
                {
                    counter++;
                    clothes.setImageResource(R.drawable.greyblouse);
                    main.putExtra("resId",R.drawable.greenjacoat);
                    startActivity(main);
                }
                if(counter == 5)
                {
                    counter++;
                    clothes.setImageResource(R.drawable.greysweatshirt);
                    main.putExtra("resId",R.drawable.greyblouse);
                    startActivity(main);
                }
                if(counter == 6)
                {
                    counter++;
                    clothes.setImageResource(R.drawable.redskirt);
                    main.putExtra("resId",R.drawable.greysweatshirt);
                    startActivity(main);
                }
                if(counter == 7)
                {
                    counter++;
                    clothes.setImageResource(R.drawable.flannelshirt);
                    main.putExtra("resId",R.drawable.redskirt);
                    startActivity(main);
                }
                if(counter == 8)
                {
                    counter++;
                    clothes.setImageResource(R.drawable.jeans2);
                    main.putExtra("resId",R.drawable.flannelshirt);
                    startActivity(main);
                }
                if(counter == 9)
                {
                    counter++;
                    clothes.setImageResource(R.drawable.rippedjeans);
                    main.putExtra("resId",R.drawable.jeans2);
                    startActivity(main);
                }
                if(counter == 10)
                {
                    counter++;
                    clothes.setImageResource(R.drawable.bluehoodie);
                    main.putExtra("resId",R.drawable.rippedjeans);
                    startActivity(main);
                }
                if(counter ==11)
                {
                    counter++;
                    clothes.setImageResource(R.drawable.trenchcoat);
                    main.putExtra("resId",R.drawable.bluehoodie);
                    startActivity(main);
                }
                if(counter == 12)
                {
                    counter++;
                    clothes.setImageResource(R.drawable.cardigan);
                    main.putExtra("resId",R.drawable.trenchcoat);
                    startActivity(main);
                }
                if(counter == 13)
                {
                    counter++;
                    clothes.setImageResource(0);
                    main.putExtra("resId",R.drawable.cardigan);
                    startActivity(main);
                }

            }

        });


        thumbsDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(counter == 1) {
                    clothes.setImageResource(R.drawable.spongebobshorts);
                }
                if(counter == 2)
                {
                    clothes.setImageResource(R.drawable.bluejeans);
                }
                if(counter == 3)
                {
                    clothes.setImageResource(R.drawable.greenjacoat);
                }
                if(counter == 4)
                {
                    clothes.setImageResource(R.drawable.greyblouse);
                }
                if(counter == 5)
                {
                    clothes.setImageResource(R.drawable.greysweatshirt);
                }
                if(counter == 6)
                {
                    clothes.setImageResource(R.drawable.redskirt);
                }
                if(counter == 7)
                {
                    clothes.setImageResource(R.drawable.flannelshirt);
                }
                if(counter == 8)
                {
                    clothes.setImageResource(R.drawable.jeans2);
                }
                if(counter == 9)
                {
                    clothes.setImageResource(R.drawable.rippedjeans);
                }
                if(counter == 10)
                {
                    clothes.setImageResource(R.drawable.bluehoodie);
                }
                if(counter ==11)
                {
                    clothes.setImageResource(R.drawable.trenchcoat);
                }
                if(counter == 12)
                {
                    clothes.setImageResource(R.drawable.cardigan);
                }
                counter++;
            }
        });

        thumbsSide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(counter == 1) {
                    clothes.setImageResource(R.drawable.spongebobshorts);
                }
                if(counter == 2)
                {
                    clothes.setImageResource(R.drawable.bluejeans);
                }
                if(counter == 3)
                {
                    clothes.setImageResource(R.drawable.greenjacoat);
                }
                if(counter == 4)
                {
                    clothes.setImageResource(R.drawable.greyblouse);
                }
                if(counter == 5)
                {
                    clothes.setImageResource(R.drawable.greysweatshirt);
                }
                if(counter == 6)
                {
                    clothes.setImageResource(R.drawable.redskirt);
                }
                if(counter == 7)
                {
                    clothes.setImageResource(R.drawable.flannelshirt);
                }
                if(counter == 8)
                {
                    clothes.setImageResource(R.drawable.jeans2);
                }
                if(counter == 9)
                {
                    clothes.setImageResource(R.drawable.rippedjeans);
                }
                if(counter == 10)
                {
                    clothes.setImageResource(R.drawable.bluehoodie);
                }
                if(counter == 11)
                {
                    clothes.setImageResource(R.drawable.trenchcoat);
                }
                if(counter == 12)
                {
                    clothes.setImageResource(R.drawable.cardigan);
                }
                counter++;
            }
        });


    }


    public boolean onTouchEvent(MotionEvent touchEvent){
        switch(touchEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();
                if(x1 > x2){
                    Intent i = new Intent(MainActivity.this, ClickWish.class);
                    startActivity(i);
                }
                break;
        }
        return false;
    }



}
