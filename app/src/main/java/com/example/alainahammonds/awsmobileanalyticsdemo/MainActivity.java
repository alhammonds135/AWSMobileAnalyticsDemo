package com.example.alainahammonds.awsmobileanalyticsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1;
    TextView textView;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
    }

    public void onButtonClick(View view) {
        count++;
        textView.setText("Clicked " + count + " times");
    }
}
