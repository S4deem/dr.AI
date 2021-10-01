package com.dr.ai.drai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class healthRecord extends AppCompatActivity {
    private Button previousButton;
    private Button comingButton;
    private Button diagnosisButton;
    private Button prescriptionButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_record);
        previousButton = (Button) findViewById(R.id.previousButton);
        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openPreviousPage();
            }
        });

        comingButton = (Button) findViewById(R.id.comingButton);
        comingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openComingPage();
            }
        });

        diagnosisButton = (Button) findViewById(R.id.diagnosisButton);
        diagnosisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openDiagnosisPage();
            }
        });

        prescriptionButton = (Button) findViewById(R.id.prescriptionButton);
        prescriptionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openPrescriptionPage();
            }
        });
    }

    public void openPreviousPage() {
        Intent intent = new Intent(this, healthRecordPrevious.class);
        startActivity(intent);
    }
    public void openComingPage() {
        Intent intent = new Intent(this, healthRecordComing.class);
        startActivity(intent);
    }

    public void openDiagnosisPage() {
        Intent intent = new Intent(this, diagnosis.class);
        startActivity(intent);
    }

    public void openPrescriptionPage() {
        Intent intent = new Intent(this, prescription.class);
        startActivity(intent);
    }

}