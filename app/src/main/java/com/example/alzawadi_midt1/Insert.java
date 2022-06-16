package com.example.alzawadi_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Insert extends AppCompatActivity {

    EditText idET,fnameET, snameET, nidET, mphoneET, lphoneET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        idET = (EditText)findViewById(R.id.ID);
        fnameET = (EditText)findViewById(R.id.FName);
        snameET = (EditText)findViewById(R.id.SName);
        nidET = (EditText)findViewById(R.id.NID);
        mphoneET = (EditText)findViewById(R.id.MPhone);
        lphoneET = (EditText)findViewById(R.id.LPhone);

        Button insert = (Button)findViewById(R.id.insert);

        /*
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = Integer.parseInt(idET.getText().toString());
                String fname = fnameET.getText().toString();
                String sname = snameET.getText().toString();
                String nid = nidET.getText().toString();
                String mphone = mphoneET.getText().toString();
                String lphone = lphoneET.getText().toString();


        });
*/
    }
}