package com.example.mathcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FindZeroes extends AppCompatActivity {

    private TextView header,explain,operation,body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_zeroes);
        wireWidgets();
    }

    private void wireWidgets() {
        header = findViewById(R.id.textView_findzeroes_header);
        explain = findViewById(R.id.textView_findzeroes_explain);
        operation = findViewById(R.id.textView_findzeroes_operation);
        body = findViewById(R.id.textView_findzeroes_body);
    }
}
