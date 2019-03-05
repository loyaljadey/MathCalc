package com.example.mathcalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalcActivityHelp extends AppCompatActivity {

    private TextView header, instruct;
    private Button simplify, factor, derive, integrate, zeroes, tangentLine, area, cos, sin, tan, arccos, arcsin, arctan, abs, log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_help);
        wireWidgets();

        //onclick to intent for all the methods
        simplify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalcActivityHelp.this, Simplify.class);
                startActivity(intent);
            }
        });
        factor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalcActivityHelp.this, Factor.class);
                startActivity(intent);
            }
        });
        derive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalcActivityHelp.this, Derive.class);
                startActivity(intent);
            }
        });
        integrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalcActivityHelp.this, Integrate.class);
                startActivity(intent);
            }
        });
        zeroes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalcActivityHelp.this, FindZeros.class);
                startActivity(intent);
            }
        });
        tangentLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalcActivityHelp.this, FindTangentLine.class);
                startActivity(intent);
            }
        });
        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalcActivityHelp.this, AreaUnderCurve.class);
                startActivity(intent);
            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalcActivityHelp.this, Cosine.class);
                startActivity(intent);
            }
        });
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalcActivityHelp.this, Sine.class);
                startActivity(intent);
            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalcActivityHelp.this, Tangent.class);
                startActivity(intent);
            }
        });
        arccos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalcActivityHelp.this, InverseCosine.class);
                startActivity(intent);
            }
        });
        arcsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalcActivityHelp.this, InverseSine.class);
                startActivity(intent);
            }
        });
        arctan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalcActivityHelp.this, InverseTangent.class);
                startActivity(intent);
            }
        });
        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalcActivityHelp.this, AbsoluteValue.class);
                startActivity(intent);
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalcActivityHelp.this, Logarithm.class);
                startActivity(intent);
            }
        });

    }

    private void wireWidgets() {
        header = findViewById(R.id.textView_header);
        instruct = findViewById(R.id.textView_CalcActivityHelp_instruct);
        simplify = findViewById(R.id.button_simplify);
        factor = findViewById(R.id.button_factor);
        derive = findViewById(R.id.button_derive);
        integrate = findViewById(R.id.button_integrate);
        zeroes = findViewById(R.id.button_zeroes);
        tangentLine = findViewById(R.id.button_tangentLine);
        area = findViewById(R.id.button_area);
        cos = findViewById(R.id.button_cosine);
        sin = findViewById(R.id.button_sine);
        tan = findViewById(R.id.button_tangent);
        arccos = findViewById(R.id.button_inverseCosine);
        arcsin = findViewById(R.id.button_inverseSine);
        arctan = findViewById(R.id.button_inverseTangent);
        abs = findViewById(R.id.button_absoluteValue);
        log = findViewById(R.id.button_log);
    }
}
