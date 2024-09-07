package com.example.calculator;

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
    EditText txt1;
    EditText txt2;
    TextView  tv;

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
        txt1=(EditText)findViewById(R.id.txt1);
        txt2=(EditText)findViewById(R.id.txt2);
        tv=(TextView)findViewById(R.id.tv);
    }

    public void add(View view) {
        double n1=Double.parseDouble(txt1.getText().toString());
        double n2=Double.parseDouble(txt2.getText().toString());
        double sum=n1+n2;
        tv.setText(Double.toString(sum));
    }

    public void sub(View view) {
        double n1=Double.parseDouble(txt1.getText().toString());
        double n2=Double.parseDouble(txt2.getText().toString());
        double sum=n1-n2;
        tv.setText(Double.toString(sum));
    }

    public void mul(View view) {
        double n1=Double.parseDouble(txt1.getText().toString());
        double n2=Double.parseDouble(txt2.getText().toString());
        double sum=n1*n2;
        tv.setText(Double.toString(sum));
    }

    public void div(View view) {
        double n1=Double.parseDouble(txt1.getText().toString());
        double n2=Double.parseDouble(txt2.getText().toString());
        double sum=n1/n2;
        tv.setText(Double.toString(sum));
    }
}
