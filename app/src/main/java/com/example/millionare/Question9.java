package com.example.millionare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Question9 extends AppCompatActivity {

    RadioGroup radioGroup;
    TextView textView;
    private Button buttonApply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question9);


        radioGroup = findViewById(R.id.radiogroup);
        textView = findViewById(R.id.text_view_selected);
        buttonApply = findViewById(R.id.button_apply);

        buttonApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedRadioButtonID = radioGroup.getCheckedRadioButtonId();
                RadioButton selectedRadioButton = findViewById(selectedRadioButtonID);
                String selectedRadioButtonText = selectedRadioButton.getText().toString();

                if (selectedRadioButtonText.equals("Fresca")) {
                    Toast.makeText(Question9.this, "Correct! Just one more question", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Question9.this, Question10.class);
                    startActivity(intent);
                }

                else {
                    Toast.makeText(Question9.this, "Wrong!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(Question9.this, youLost.class);
                    startActivity(intent);
                }
            }
        });

    }
}

