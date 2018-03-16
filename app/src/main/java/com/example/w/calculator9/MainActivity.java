package com.example.w.calculator9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    Button btnclear,btnadd,btnsub,btnmultiply,btndivide,btnequal,btndecimal;
    TextView display;
    char operator;
    double var1,var2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        set();
          display.setText(null);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"2");
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"9");
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1 = Double.parseDouble(display.getText().toString());
                display.setText(null);
                operator='+';
            }
        });


     btnsub.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             var1 = Double.parseDouble(display.getText().toString());
             display.setText(null);
             operator='-';
         }
     });

        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1 = Double.parseDouble(display.getText().toString());
                display.setText(null);
                operator='*';
            }
        });


        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1 = Double.parseDouble(display.getText().toString());
                display.setText(null);
                operator='/';
            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(null);
            }
        });

        btndecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+".");
            }
        });

        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var2= Double.parseDouble(display.getText().toString());
                switch(operator){
                    case '+' : result= var1+ var2;
                        break;
                    case '-' : result=var1-var2;
                        break;
                    case '*' : result=var1*var2;
                        break;
                    case '/' : result=var1/var2;
                        break;
                }
                display.setText(String.valueOf(result));

            }
        });

    }


    void set(){
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnclear = findViewById(R.id.btnclear);
        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnsubtract);
        btnmultiply = findViewById(R.id.btnmultiply);
        btndivide = findViewById(R.id.btndivide);
        display = findViewById(R.id.display);
        btnequal = findViewById(R.id.btnequal);
        btndecimal = findViewById(R.id.btndecimal);
    }
}
