package com.example.sagomes.bigheadwarriors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity {

    private ImageButton tradingButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        tradingButton = (ImageButton) findViewById(R.id.tradingButton);

    }

    public void goTrading(View view){
        Intent intent = new Intent(this,TradingActivity.class);
        startActivity(intent);
    }
}
