package com.example.basicpervasive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button selectbutton;
    private TextView display;
    private RadioButton Individual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        radioGroup=(RadioGroup) findViewById(R.id.radiogroupid);
        selectbutton=(Button) findViewById(R.id.btnr);
        display=(TextView) findViewById(R.id.tv);

        selectbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                Individual = (RadioButton) findViewById(selectedId);

                String value = Individual.getText().toString();
                display.setText(" You selected : "+value);


            }
        });
    }
}
