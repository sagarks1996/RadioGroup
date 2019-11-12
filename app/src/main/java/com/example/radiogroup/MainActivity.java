package com.example.radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton male,female;
    Button button;
    String gender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        button = findViewById(R.id.submit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (male.isChecked()){
                    gender = male.getText().toString();

                }
                else if (female.isChecked()){
                    gender = female.getText().toString();
                }

                Toast.makeText(getApplicationContext(),"Gender :"+gender,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
