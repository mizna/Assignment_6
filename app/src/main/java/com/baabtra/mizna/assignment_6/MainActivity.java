package com.baabtra.mizna.assignment_6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonclicked(View v){
        TextView mytext=(TextView)findViewById(R.id.textView);
        EditText myedit=(EditText)findViewById(R.id.editText);
        mytext.setText(myedit.getText().toString());
    }
}
