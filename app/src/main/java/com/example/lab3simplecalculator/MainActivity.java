package com.example.lab3simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private enum Operator {none, add, minus, multiply, divide};
    private double data1 = 0,  data2 = 0;
    private Operator optr = Operator.none;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void btn00Click(View v){
        TextView textBox = findViewById(R.id.resultEdit);
        textBox.setText(textBox.getText()+"0");
    }

    public void btn01Click(View v){
        TextView textBox = findViewById(R.id.resultEdit);
        textBox.setText(textBox.getText()+"1");
    }

    public void btn02Click(View v){
        TextView textBox = findViewById(R.id.resultEdit);
        textBox.setText(textBox.getText()+"2");
    }

    public void btn03Click(View v){
        TextView textBox = findViewById(R.id.resultEdit);
        textBox.setText(textBox.getText()+"3");
    }

    public void btn04Click(View v){
        TextView textBox = findViewById(R.id.resultEdit);
        textBox.setText(textBox.getText()+"4");
    }


    public void btn05Click(View v){
        TextView textBox = findViewById(R.id.resultEdit);
        textBox.setText(textBox.getText()+"5");
    }

    public void btn06Click(View v){
        TextView textBox = findViewById(R.id.resultEdit);
        textBox.setText(textBox.getText()+"6");
    }


    public void btn07Click(View v){
        TextView textBox = findViewById(R.id.resultEdit);
        textBox.setText(textBox.getText()+"7");
    }

    public void btn08Click(View v){
        TextView textBox = findViewById(R.id.resultEdit);
        textBox.setText(textBox.getText()+"8");
    }

    public void btn09Click(View v){
        TextView textBox = findViewById(R.id.resultEdit);
        textBox.setText(textBox.getText()+"9");
    }

    public void btnAddClick(View v){
        optr=Operator.add;
        TextView textBox = findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(textBox.getText().toString());
        textBox.setText("");
    }

    public void btnSubClick(View v){
        optr=Operator.minus;
        TextView textBox = findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(textBox.getText().toString());
        textBox.setText("");
    }

    public void btnMultClick(View v) {
        optr = Operator.multiply;
        TextView textBox = findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(textBox.getText().toString());
        textBox.setText("");
    }

    public void btnDivClick(View v) {
        optr = Operator.divide;
        TextView textBox = findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(textBox.getText().toString());
        textBox.setText("");
    }

    public void btnCEClick(View v){
        TextView textBox = findViewById(R.id.resultEdit);
        textBox.setText("");
    }

    public void btnDotClick(View v){
        TextView textBox = findViewById(R.id.resultEdit);
        textBox.setText(textBox.getText()+".");
    }

    public void btnEqClick(View v){
        if(optr != Operator.none){
            TextView textBox = findViewById(R.id.resultEdit);
            data2 = Double.parseDouble(textBox.getText().toString());
            double result=0;

            if(optr == Operator.add){
                result = data1 + data2;
            }
            else if(optr==Operator.minus){
                result = data1 - data2;
            }
            else if(optr==Operator.multiply){
                result = data1 * data2;
            }
            else if(optr==Operator.divide){
                result = data1 / data2;

            }

            optr=Operator.none;
            data1=result;
            if((result-(int)result)!=0){
                textBox.setText(String.valueOf(result));
            }else{
                textBox.setText(String.valueOf((int)result));
            }
        }
    }
}