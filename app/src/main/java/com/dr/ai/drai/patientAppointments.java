package com.dr.ai.drai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class patientAppointments extends AppCompatActivity {

    private Button onlineButton;
    private Button inPersonButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_appointments);

        onlineButton = (Button) findViewById(R.id.onlineButton);
        onlineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openOnlinePage();
            }
        });

        inPersonButton = (Button) findViewById(R.id.inPersonButton);
        inPersonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openInPersonPage();
            }
        });
    }
    public void openOnlinePage() {
        Intent intent = new Intent(this, onlineAppointments.class);
        startActivity(intent);
    }

    public void openInPersonPage() {
        Intent intent = new Intent(this, inPersonAppointments.class);
        startActivity(intent);
    }
}