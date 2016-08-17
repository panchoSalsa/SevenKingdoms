package com.example.franciscofranco.sevenkingdoms;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity implements SevenKingdomsFragment.Communicate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onCommunicate(String url) {
        BannerFragment bannerFragment =(BannerFragment) getFragmentManager()
                .findFragmentById(R.id.bannerFragment);
        bannerFragment.setImage(url);

    }
}
