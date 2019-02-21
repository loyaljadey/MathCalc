package com.example.mathcalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CalcActivityResult extends AppCompatActivity {

    private TextView operationTextView, expressionTextView, resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_result);

        wireWidgets();

        Intent intent = getIntent();
        String operation = intent.getStringExtra("operation");
        String expression = intent.getStringExtra("expression");
        calculateExpression(operation, expression);

        operationTextView.setText(operation);
        expressionTextView.setText(expression);
    }

    private void wireWidgets() {
        operationTextView = findViewById(R.id.textView_calcActivityResult_operation);
        expressionTextView = findViewById(R.id.textView_calcActivityResult_expression);
        resultTextView = findViewById(R.id.textView_calcActivityResult_result);
    }

    private void calculateExpression(String operation, String expression) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://newton.now.sh/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CalculateService service = retrofit.create(CalculateService.class);

        Call<CalculateResponse> calculateResponseCall = service.calculateMath(operation, expression);

        calculateResponseCall.enqueue(new Callback<CalculateResponse>() {
            @Override
            public void onResponse(Call<CalculateResponse> call, Response<CalculateResponse> response) {
                String result = response.body().getResult();
                Log.d("ENQUEUE",result);
                resultTextView.setText(result);
            }

            @Override
            public void onFailure(Call<CalculateResponse> call, Throwable t) {
                Log.d("ENQUEUE","onFailure:"+ t.getMessage());
            }
        });

    }

}
