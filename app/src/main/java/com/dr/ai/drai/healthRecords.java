package com.dr.ai.drai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class healthRecords extends AppCompatActivity {

    private Button patientComingButton;
    private Button patientPreviousButton;
    private Button patientPrescriptionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_records);
        patientComingButton = (Button) findViewById(R.id.patientComingButton);
        patientComingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientComingPage();
            }
        });
        patientPreviousButton = (Button) findViewById(R.id.patientPreviousButton);
        patientPreviousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientPreviousPage();
            }
        });
        patientPrescriptionButton = (Button) findViewById(R.id.patientPrescriptionButton);
        patientPrescriptionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientPrescriptionPage();
            }
        });
    }

    public void openPatientComingPage(){
        Intent intent = new Intent(this, comingAppointments.class);
        startActivity(intent);
    }

    public void openPatientPreviousPage(){
        Intent intent = new Intent(this, previousAppointments.class);
        startActivity(intent);
    }

    public void openPatientPrescriptionPage(){
        Intent intent = new Intent(this, prescription.class);
        startActivity(intent);
    }
}