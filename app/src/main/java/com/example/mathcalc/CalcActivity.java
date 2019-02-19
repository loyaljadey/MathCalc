package com.example.mathcalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalcActivity extends AppCompatActivity {

    private TextView title;
    private EditText operationEditText;
    private EditText expressionEditText;
    private Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        wireWidgets();

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalcActivity.this, CalcActivityResult.class);
                intent.putExtra("operation", operationEditText.getText().toString());
                intent.putExtra("expression", expressionEditText.getText().toString());
                startActivity(intent);
            }
        });
    }

    private void wireWidgets() {
        title = findViewById(R.id.textView_calcActivity_Title);
        operationEditText = findViewById(R.id.editText_calcActivity_operation);
        expressionEditText = findViewById(R.id.editText_calcActivity_expression);
        calculate = findViewById(R.id.button_calcActivity_calculate);
    }
}
