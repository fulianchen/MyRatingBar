package com.myratingbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by fulianchen on 15-12-10.
 */
public class MainActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MyRatingBar mMyRatingBar = (MyRatingBar) findViewById(R.id.my_rating_bar);
        mMyRatingBar.setStarRating(1.5f);
        mMyRatingBar.setIsIndicator(false);
        mMyRatingBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("star rating:" + mMyRatingBar.getStarRating());
            }
        });
    }
}
