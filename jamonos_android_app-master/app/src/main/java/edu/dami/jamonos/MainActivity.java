package edu.dami.jamonos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.net.Inet4Address;

public class MainActivity extends AppCompatActivity {

    TextView tvBienvenida;
    EditText etNombres;
    EditText etApellidos;
    EditText etCorreo;
   // EditText etContraseña;
   // EditText etRepcontraseña;
    Button btnRegistrarse;
    Button btnDuda;

    private String nombre = "";
    private String apellido = "";
    private String correo = "";
   // private String contraseña = "";
    // private String repcontraseña = "";
    private String msg = "";

    private String[] test = new String[4];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        viewconfig();

        TextView versionombre = findViewById(R.id.tv_version);
        versionombre.setText("version "  + BuildConfig.VERSION_NAME);

    }

    private void viewconfig() {tvBienvenida = findViewById(R.id.tv_bienvenida);
        etNombres = findViewById(R.id.et_nombres);
        etApellidos = findViewById(R.id.et_apellido);
        etCorreo = findViewById(R.id.et_correo);
       // etContraseña = findViewById(R.id.et_contraseña);
        // etRepcontraseña = findViewById(R.id.et_repcontraseña);
        btnRegistrarse = findViewById(R.id.btn_registrar);


       // btnDuda = findViewById(R.id.btn_duda);


        /*btnDuda.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                duda();
            }

            private void duda() {

            }
        }) ;*/


        btnRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*validacion();*/
                registrarse();

            }

            private void registrarse() {

                Toast toast = Toast.makeText(getApplicationContext(),
                        "Bienvenido", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();

                test[0] = etNombres.getText().toString();
                test[1] = etApellidos.getText().toString();
                test[2] = etCorreo.getText().toString();

                Intent i = new Intent(MainActivity.this, MainActivity2.class);

                Bundle fmercury = new Bundle();
                fmercury.putStringArray("info", test);
                /*fmercury.putString("Nombre", etNombres.getText().toString());
                fmercury.putString("Apellidos", etApellidos.getText().toString());
                fmercury.putString("Correo", etCorreo.getText().toString());*/
                i.putExtras(fmercury);
                startActivity(i);


            }

           /* private void validacion() {

                TextView tv_excepcion = (TextView) findViewById(R.id.tv_excepcion);
                nombre = etNombres.getText().toString();
                apellido = etApellidos.getText().toString();
                correo = etCorreo.getText().toString();
                contraseña = etContraseña.getText().toString();
                repcontraseña = etRepcontraseña.getText().toString();


            }

            //if (nombre.equals("")){
              /*msg = "¿Y tu licencia?";*/
            //Toast toast = Toast.makeText(getApplicationContext(),
              //      "¿Y tu licencia?", Toast.LENGTH_SHORT);
                //toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                //toast.show();
                //tv_excepcion.setText(msg);
                //tv_excepcion.setText(msg);




        });

    }


    }
    