package com.example.franciscofranco.sevenkingdoms;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class CurrentRuler extends Activity {

    private String currentRuler;
    private TextView textView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_ruler);

        textView = (TextView) findViewById(R.id.textView);
        imageView = (ImageView) findViewById(R.id.imageView);

        Intent intent = getIntent();
        String currentRuler = intent.getStringExtra(SevenKingdomsFragment.CURRENT_RULER);
        textView.setText(currentRuler);

        Picasso.with(this)
                .load(BannerImages.hashMap.get(currentRuler))
                .into(imageView);
    }

}
