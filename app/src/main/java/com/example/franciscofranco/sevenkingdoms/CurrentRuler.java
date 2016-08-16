package com.example.franciscofranco.sevenkingdoms;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CurrentRuler extends Activity {

    private String currentRuler;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_ruler);
        textView = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        String currentRuler = intent.getStringExtra(SevenKingdomsFragment.CURRENT_RULER);
        textView.setText(currentRuler);
    }
}
