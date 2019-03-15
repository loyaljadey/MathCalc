package com.example.mathcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Cosine extends AppCompatActivity {

    private TextView header,explain,operation,body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cosine);
        wireWidgets();
    }

    private void wireWidgets() {
        header = findViewById(R.id.textView_cosine_header);
        explain = findViewById(R.id.textView_cosine_explain);
        operation = findViewById(R.id.textView_cosine_operation);
        body = findViewById(R.id.textView_cosine_body);
    }
}
