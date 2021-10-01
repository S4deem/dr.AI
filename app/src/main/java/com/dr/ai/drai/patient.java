package com.dr.ai.drai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class patient extends AppCompatActivity {
    private Button appointmentSummaryButton;
    private Button healthRecordButton;
    private Button checkUpButton;
    private Button goBackButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient);

        appointmentSummaryButton = (Button) findViewById(R.id.appointmentSummaryButton);
        appointmentSummaryButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                openAppointmentSummaryPage();
            }
        });

        healthRecordButton = (Button) findViewById(R.id.healthRecordButton);
        healthRecordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openHealthRecordPage();
            }
        });

        checkUpButton = (Button) findViewById(R.id.checkUpButton);
        checkUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openCheckUpPage();
            }
        });

        goBackButton = (Button) findViewById(R.id.goBackButton);
        goBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                goBack();
            }
        });
    }
    public void openAppointmentSummaryPage() {
        Intent intent = new Intent(this, patientAppointmentSummary.class);
        startActivity(intent);
    }

    public void openHealthRecordPage() {
        Intent intent = new Intent(this, healthRecord.class);
        startActivity(intent);
    }
    public void openCheckUpPage() {
        Intent intent = new Intent(this, checkUpAppointments.class);
        startActivity(intent);
    }

    public void goBack() {
        Intent intent = new Intent(this, patientScreen.class);
        startActivity(intent);
    }

}