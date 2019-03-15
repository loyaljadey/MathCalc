package com.example.mathcalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CalcActivity extends AppCompatActivity {

    private TextView title;
    private EditText operationEditText;
    private EditText expressionEditText;
    private Button calculate;
    private Button help;
    private ArrayList<String> listOperations = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        wireWidgets();

        //fill in the list and set elements
        listOperations.add(0, "simplify");
        listOperations.add(1, "factor");
        listOperations.add(2, "derive");
        listOperations.add(3, "integrate");
        listOperations.add(4, "zeroes");
        listOperations.add(5, "tangent");
        listOperations.add(6, "area");
        listOperations.add(7, "cos");
        listOperations.add(8, "sin");
        listOperations.add(9, "tan");
        listOperations.add(10, "arccos");
        listOperations.add(11, "arcsin");
        listOperations.add(12, "arctan");
        listOperations.add(13, "abs");
        listOperations.add(14, "log");


        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkEditText(operationEditText,expressionEditText) == true) {
                    Intent intent = new Intent(CalcActivity.this, CalcActivityResult.class);
                    intent.putExtra("operation", operationEditText.getText().toString());
                    intent.putExtra("expression", expressionEditText.getText().toString());
                    startActivity(intent);
                }
                else{
                    Toast.makeText(CalcActivity.this, "Please refer to the help page and retype the operation or expression.", Toast.LENGTH_LONG).show();
                }
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalcActivity.this, CalcActivityHelp.class);
                startActivity(intent);
            }
        });
    }

    private boolean checkEditText(EditText operation, EditText expression) {
        boolean ifMatch = false;
        if (operation.getText().toString() != null || expression.getText().toString() != null) {
            for (int i = 0; i < listOperations.size(); i++) {
                if(listOperations.get(i).equals(operationEditText.getText().toString())) {
                    ifMatch = true;
                    break;
                }
            }
        }
        return ifMatch;
    }

    private void wireWidgets() {
        title = findViewById(R.id.textView_calcActivity_Title);
        operationEditText = findViewById(R.id.editText_calcActivity_operation);
        expressionEditText = findViewById(R.id.editText_calcActivity_expression);
        calculate = findViewById(R.id.button_calcActivity_calculate);
        help = findViewById(R.id.button_calcActivity_help);
    }
}
