package com.dr.ai.drai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class doctorsAccountManagement extends AppCompatActivity {
    private Button doctorsForm;
    private Button doctorsForm1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors_account_management);
        doctorsForm = (Button) findViewById(R.id.doctorsForm);
        doctorsForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openDoctorPage();
            }
        });
        doctorsForm1 = (Button) findViewById(R.id.doctorsForm1);
        doctorsForm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openDoctorPage();
            }
        });
    }
    public void openDoctorPage(){
        Intent intent = new Intent(this, doctorsAccountManagement1.class);
        startActivity(intent);
    }
}