package com.dr.ai.drai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class adminScreen extends AppCompatActivity {

    private Button doctorsManagementButton;
    private Button patientsManagementButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_screen);

        doctorsManagementButton = (Button) findViewById(R.id.doctorsManagementButton);
        doctorsManagementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDoctorsManagementPage();
            }
        });

        patientsManagementButton = (Button) findViewById(R.id.patientsManagementButton);
        patientsManagementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientsManagementPage();
            }
        });

    }
    public void openDoctorsManagementPage(){
        Intent intent = new Intent(this, doctorsAccountManagement.class);
        startActivity(intent);
    }
    public void openPatientsManagementPage(){
        Intent intent = new Intent(this, patientsAccountManagment.class);
        startActivity(intent);
    }
}