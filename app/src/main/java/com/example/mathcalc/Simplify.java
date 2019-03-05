package com.example.mathcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Simplify extends AppCompatActivity {

    private TextView header, explain, operation, add, addexplain, subtract, subtractexplain, multiply, multiplyexplain, divide, divideexplain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simplify);
        wireWidgets();
    }

    private void wireWidgets() {
        header = findViewById(R.id.textView_simplify_header);
        explain = findViewById(R.id.textView_simplify_explain);
        operation = findViewById(R.id.textView_simplify_operation);
        add = findViewById(R.id.textView_simplify_add);
        addexplain = findViewById(R.id.textView_simplify_addexplain);
        subtract = findViewById(R.id.textView_simplify_subtract);
        subtractexplain = findViewById(R.id.textView_simplify_subtractexplain);
        multiply = findViewById(R.id.textView_simplify_multiply);
        multiplyexplain = findViewById(R.id.textView_simplify_multiplyexplain);
        divide = findViewById(R.id.textView_simplify_divide);
        divideexplain = findViewById(R. id.textView_simplify_divideexplain);
    }
}
