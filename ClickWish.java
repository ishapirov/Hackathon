package com.example.thatssewyou;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ClickWish extends AppCompatActivity {

    double x1;
    double x2;
    double y1;
    double y2;
    int counter = 1;
    ImageView plzWork;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wishlist);
        plzWork = (ImageView) findViewById(R.id.imageWork1);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            if(counter == 1) {
                int resid = bundle.getInt("resId");
                plzWork.setImageResource(R.drawable.bluesweater);
            }
            if(counter == 2) {
                int resid = bundle.getInt("resId");
                plzWork.setImageResource(R.drawable.spongebobshorts);
            }
            if(counter == 3) {
                int resid = bundle.getInt("resId");
                plzWork.setImageResource(R.drawable.bluejeans);
            }
            if(counter == 4) {
                int resid = bundle.getInt("resId");
                plzWork.setImageResource(R.drawable.greenjacoat);
            }
            if(counter == 5) {
                int resid = bundle.getInt("resId");
                plzWork.setImageResource(R.drawable.greyblouse);
            }
            if(counter == 6) {
                int resid = bundle.getInt("resId");
                plzWork.setImageResource(R.drawable.greysweatshirt);
            }
            if(counter == 7) {
                int resid = bundle.getInt("resId");
                plzWork.setImageResource(R.drawable.redskirt);
            }
            if(counter == 8) {
                int resid = bundle.getInt("resId");
                plzWork.setImageResource(R.drawable.flannelshirt);
            }
            if(counter == 9) {
                int resid = bundle.getInt("resId");
                plzWork.setImageResource(R.drawable.jeans2);
            }
            if(counter == 10) {
                int resid = bundle.getInt("resId");
                plzWork.setImageResource(R.drawable.rippedjeans);
            }
            if(counter == 11) {
                int resid = bundle.getInt("resId");
                plzWork.setImageResource(R.drawable.trenchcoat);
            }
            if(counter == 12) {
                int resid = bundle.getInt("resId");
                plzWork.setImageResource(R.drawable.cardigan);
            }
            counter++;
        }
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
                if(x1 < x2){
                    Intent i = new Intent(ClickWish.this, MainActivity.class);
                    startActivity(i);
                }
                break;
        }
        return false;
    }

}
