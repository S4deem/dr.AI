package com.dr.ai.drai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class doctorsPatientScreen extends AppCompatActivity {
    private Button trackPatientButton;
    private Button healthRecordBtn;
    private Button checkUpBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors_patient_screen);
        trackPatientButton = (Button) findViewById(R.id.trackPatientButton);
        trackPatientButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTrackPatienPage();
            }
        });

        healthRecordBtn = (Button) findViewById(R.id.healthRecordBtn);
        healthRecordBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHealthRecordPage();
            }
        });

        checkUpBtn = (Button) findViewById(R.id.checkUpBtn);
        checkUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCheckUpPage();
            }
        });
    }
    public void openTrackPatienPage(){
        Intent intent = new Intent(this, patientTracking.class);
        startActivity(intent);
    }

    public void openHealthRecordPage(){
        Intent intent = new Intent(this, patientsHealthRecords.class);
        startActivity(intent);
    }

    public void openCheckUpPage(){
        Intent intent = new Intent(this, checkUpAppointmentsDoctor.class);
        startActivity(intent);
    }
}