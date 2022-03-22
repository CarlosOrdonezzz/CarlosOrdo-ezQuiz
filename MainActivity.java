package com.uca.examen_carlosordoez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton opcion1, opcion2, opcion3;
    TextView numeropregunta, pregunta;
    Button siguiente, atras;

    int diagnostico = 0; int quepregunta = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        opcion1 = (RadioButton)findViewById(R.id.respuesta1);
        opcion2 = (RadioButton)findViewById(R.id.respuesta2);
        opcion3 = (RadioButton)findViewById(R.id.respuesta3);

        numeropregunta = (TextView)findViewById(R.id.numeropregunta);
        pregunta = (TextView)findViewById(R.id.pregunta);

        siguiente = (Button)findViewById(R.id.siguiente);
        atras = (Button)findViewById(R.id.atras);
    }

    public void siguiente (View v){

        if(opcion1.isChecked() == false && opcion2.isChecked() == false && opcion3.isChecked()==false){
            Toast.makeText(this, "Escoje la opcion", Toast.LENGTH_SHORT).show();
        }else if(quepregunta == 1){

            if(opcion1.isChecked()){
                diagnostico = diagnostico + 2;
            }

            quepregunta = quepregunta + 1;

            numeropregunta.setText("Pregunta 2");
            pregunta.setText("Usted a tenido nauseas o vomito?");
            opcion1.setText("Si");
            opcion2.setText("No");
            opcion3.setText("no me acuerdo");

            opcion1.setChecked(true);
            opcion2.setChecked(false);
            opcion3.setChecked(false);
        }else if(quepregunta == 2) {

            if (opcion1.isChecked()) {
                diagnostico = diagnostico + 2;
            }

            quepregunta = quepregunta + 1;

            numeropregunta.setText("Pregunta 3");
            pregunta.setText("Tiene tos intensa ultimamente?");
            opcion1.setText("Si");
            opcion2.setText("No");
            opcion3.setText("tengo tos desde niño");

            opcion1.setChecked(true);
            opcion2.setChecked(false);
            opcion3.setChecked(false);
        }else if(quepregunta == 3) {

            if (opcion1.isChecked()) {
                diagnostico = diagnostico + 2;
            }

            quepregunta = quepregunta + 1;

            numeropregunta.setText("Pregunta 4");
            pregunta.setText("Tiene un fuerte dolor de garganta?");
            opcion1.setText("Si");
            opcion2.setText("No");
            opcion3.setText("no siento el dolor");

            opcion1.setChecked(true);
            opcion2.setChecked(false);
            opcion3.setChecked(false);
        }else if(quepregunta == 4) {

            if (opcion1.isChecked()) {
                diagnostico = diagnostico + 2;
            }

            quepregunta = quepregunta + 1;

            numeropregunta.setText("Pregunta 5");
            pregunta.setText("Tiene Diarrea?");
            opcion1.setText("Si");
            opcion2.setText("No");
            opcion3.setText("Si, pero es por un problema en el estomago");

            opcion1.setChecked(true);
            opcion2.setChecked(false);
            opcion3.setChecked(false);
        }else if(quepregunta == 5) {

            if (opcion1.isChecked()) {
                diagnostico = diagnostico + 2;
            }

        quepregunta = quepregunta + 1;

        numeropregunta.setText("Pregunta 6");
        pregunta.setText("Tiene fatiga?");
        opcion1.setText("Si");
        opcion2.setText("No");
        opcion3.setText("siempre tengo");

        opcion1.setChecked(true);
        opcion2.setChecked(false);
        opcion3.setChecked(false);
    }else if(quepregunta == 6) {

        if (opcion1.isChecked()) {
            diagnostico = diagnostico + 2;
        }

            quepregunta = quepregunta + 1;

            numeropregunta.setText("Pregunta 7");
            pregunta.setText("tiene escalofrios?");
            opcion1.setText("Si");
            opcion2.setText("No");
            opcion3.setText("solo cuando hay fantasmas");

            opcion1.setChecked(true);
            opcion2.setChecked(false);
            opcion3.setChecked(false);
        }else if(quepregunta == 7) {

            if (opcion1.isChecked()) {
                diagnostico = diagnostico + 1;
            }
            quepregunta = quepregunta + 1;

            numeropregunta.setText("Pregunta 8");
            pregunta.setText("tiene sentido del gusto??");
            opcion1.setText("Si");
            opcion2.setText("No");
            opcion3.setText("todo sabe igual");

            opcion1.setChecked(true);
            opcion2.setChecked(false);
            opcion3.setChecked(false);
        }else if(quepregunta == 8) {

            if (opcion1.isChecked()) {
                diagnostico = diagnostico + 2;
            }
            quepregunta = quepregunta + 1;

            numeropregunta.setText("Pregunta 9");
            pregunta.setText("Tiene Dolores musculares");
            opcion1.setText("Si");
            opcion2.setText("No");
            opcion3.setText("si porque voy al gym");

            opcion1.setChecked(true);
            opcion2.setChecked(false);
            opcion3.setChecked(false);
        }else if(quepregunta == 9) {

            if (opcion1.isChecked()) {
                diagnostico = diagnostico + 2;
            }
            quepregunta = quepregunta + 1;

            numeropregunta.setText("Pregunta 10");
            pregunta.setText("Tiene congestion nasal?");
            opcion1.setText("Si");
            opcion2.setText("No");
            opcion3.setText("Siempre");

            opcion1.setChecked(true);
            opcion2.setChecked(false);
            opcion3.setChecked(false);
        }else if(quepregunta == 10) {

            if (opcion1.isChecked()) {
                diagnostico = diagnostico + 2;
            }

            numeropregunta.setText("de acuerdo con sus resultados "+diagnostico);

            if(diagnostico >= 12){
                pregunta.setText("Usted es sospechoso de covid");
            }else{
                pregunta.setText("Es improbable que tenga covid");
            }

            opcion1.setVisibility(View.GONE);
            opcion2.setVisibility(View.GONE);
            opcion3.setVisibility(View.GONE);
            siguiente.setVisibility(View.GONE);
        }
    }

    public void Salir(View v){
        finish();
    }
}