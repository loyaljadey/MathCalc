package com.example.mathcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CalcActivityHelp extends AppCompatActivity {

    private TextView header, instruct, methods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_help);
        wireWidgets();
    }

    private void wireWidgets() {
        header = findViewById(R.id.textView_header);
        instruct = findViewById(R.id.textView_CalcActivityHelp_instruct);
        methods = findViewById(R.id.textView_calcActivityHelp_method);
    }
}
