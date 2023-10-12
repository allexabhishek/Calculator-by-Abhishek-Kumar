package com.factorial.calculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView resultTv, solutionTv;
    MaterialButton buttonC, getButtonBracket, buttonPercent;
    MaterialButton buttonDivide, buttonMultiple, buttonSum,buttonSubtract, buttonEqual;
    MaterialButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    MaterialButton buttonAC, buttonDot;
    private MaterialButton Multiple;
    private MaterialButton buttonBracket;
    private Object view;
    private MaterialButton btn;
    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTv = findViewById(R.id.result_tv);
        solutionTv = findViewById(R.id.solution_tv);
        assignId(buttonC,R.id.button_c);
        assignId(button1,R.id.button_1);
        assignId(button0,R.id.button_0);
        assignId(button2,R.id.button_2);
        assignId(button3,R.id.button_3);
        assignId(button4,R.id.button_4);
        assignId(button5,R.id.button_5);
        assignId(button6,R.id.button_6);
        assignId(button7,R.id.button_7);
        assignId(button8,R.id.button_8);
        assignId(button9,R.id.button_9);
        assignId(buttonSum,R.id.button_sum);
        assignId(buttonDivide,R.id.button_divide);
        assignId(Multiple,R.id.button_multiple);
        assignId(buttonSubtract,R.id.button_subtract);
        assignId(buttonEqual,R.id.button_equal);
        assignId(buttonDot,R.id.button_dot);
        assignId(buttonBracket,R.id.button_bracket);
        assignId(buttonPercent,R.id.button_percent);
        assignId(buttonAC,R.id.button_ac);




    }

    void assignId(MaterialButton btn,int id) {
        this.btn = btn;
        this.id = id;
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        MaterialButton button = (MaterialButton) view;
        String buttonText = button.getText().toString();
        solutionTv.setText(buttonText);
    }
}
