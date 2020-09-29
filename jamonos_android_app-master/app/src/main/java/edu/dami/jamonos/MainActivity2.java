package edu.dami.jamonos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity2 extends AppCompatActivity {

    TextView tv_hi;
    TextView tv_hi2;
    TextView tv_hi3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        yaki();

        /*TextView versionombre = findViewById(R.id.tv_version);
        versionombre.setText("version "  + BuildConfig.VERSION_NAME);*/
    }

    private void yaki() {

        tv_hi = findViewById(R.id.tv_hi);
        tv_hi2 = findViewById(R.id.tv_hi2);
        tv_hi3 = findViewById(R.id.tv_hi3);
        Bundle fmercury = this.getIntent().getExtras();

        if(fmercury != null){
             String[] makinola = getIntent().getStringArrayExtra("info");
            assert makinola != null;
            tv_hi.setText(makinola[0]);
             tv_hi2.setText(makinola[1]);
             tv_hi3.setText(makinola[2]);
        }

       /* if (fmercury != null) {
                String hype = fmercury.getString("Nombre");
                tv_hi.setText(hype); }
        if (fmercury != null) {
            String hype1 = fmercury.getString("Apellidos");
            tv_hi2.setText(hype1);
    }
        if (fmercury != null) {
            String hype2 = fmercury.getString("Correo");
            tv_hi3.setText(hype2);
        }*/
}
}