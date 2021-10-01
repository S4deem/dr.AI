package com.dr.ai.drai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class doctorsScreen extends AppCompatActivity {
    private Button patientDoctorButton;
    private Button doctorProfileButton;
    private Button doctorAppointmentBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors_screen);
        patientDoctorButton = (Button) findViewById(R.id.patientDoctorButton);
        patientDoctorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpatientDoctorPage();
            }
        });
        doctorProfileButton = (Button) findViewById(R.id.doctorProfileButton);
        doctorProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                opendoctorProfilePage();
            }
        });
        doctorAppointmentBtn = (Button) findViewById(R.id.doctorAppointmentBtn);
        doctorAppointmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opendoctorAppointmentPage();
            }
        });
    }
    public void openpatientDoctorPage(){
        Intent intent = new Intent(this, doctorsPatientScreen.class);
        startActivity(intent);
    }
    public void opendoctorProfilePage(){
        Intent intent = new Intent(this, doctorsProfile.class);
        startActivity(intent);
    }
    public void opendoctorAppointmentPage(){
        Intent intent = new Intent(this, doctorsAppointments.class);
        startActivity(intent);
    }
}