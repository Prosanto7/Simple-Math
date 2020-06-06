package com.example.simplemathematicaloperation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edit_text1,edit_text2;
    private Button sum_button,sub_button,mul_button,div_button;
    private TextView result_text_view;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_text1 = (EditText) findViewById(R.id.edit_text_1_id);
        edit_text2 = (EditText) findViewById(R.id.edit_text_2_id);

        sum_button = (Button) findViewById(R.id.sum_button_id);
        sub_button = (Button) findViewById(R.id.sub_button_id);
        mul_button = (Button) findViewById(R.id.mul_button_id);
        div_button = (Button) findViewById(R.id.div_button_id);

        result_text_view = (TextView) findViewById(R.id.result_textview);

        sum_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,"Summation is Done",Toast.LENGTH_SHORT).show();
                result_text_view.setText(""+(Double.parseDouble(edit_text1.getText().toString())+Double.parseDouble(edit_text2.getText().toString())));
            }
        });

        sub_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,"Substraction is Done",Toast.LENGTH_SHORT).show();
                result_text_view.setText(""+(Double.parseDouble(edit_text1.getText().toString())-Double.parseDouble(edit_text2.getText().toString())));
            }
        });

        mul_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,"Multiplication is Done",Toast.LENGTH_SHORT).show();
               result_text_view.setText(""+(Double.parseDouble(edit_text1.getText().toString())*Double.parseDouble(edit_text2.getText().toString())));
            }
        });

        div_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Division is Done",Toast.LENGTH_SHORT).show();
                result_text_view.setText(""+(Double.parseDouble(edit_text1.getText().toString())/Double.parseDouble(edit_text2.getText().toString())));
            }
        });




    }
}