package com.silvereyes.miner;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("SilverEyes Miner\nMobile Version is Active.\nMining initialized...");
        textView.setTextSize(18);
        setContentView(textView);
    }
}
