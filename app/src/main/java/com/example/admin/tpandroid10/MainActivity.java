package com.example.admin.tpandroid10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Déclaration des boutons
    Button bouton1;
    Button bouton2;
    Button bouton3;
    Button bouton4;
    Button bouton5;
    Button bouton6;
    Button bouton7;
    Button bouton8;
    Button bouton9;
    Button bouton_plus;
    Button bouton_moins;
    Button bouton_diviser;
    Button bouton_enter;
    Button bouton_swap;
    Button bouton_pop;
    Button bouton_clear;

    //Déclaration des TextViews
    TextView text_Courant;
    TextView text_Pile4;
    TextView text_Pile3;
    TextView text_Pile2;
    TextView text_Pile1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Récupération des boutons
        bouton1 = ((Button) findViewById(R.id.touche1));
        bouton2 = ((Button) findViewById(R.id.touche2));
        bouton3 = ((Button) findViewById(R.id.touche3));
        bouton4 = ((Button) findViewById(R.id.touche4));
        bouton5 = ((Button) findViewById(R.id.touche5));
        bouton6 = ((Button) findViewById(R.id.touche6));
        bouton7 = ((Button) findViewById(R.id.touche7));
        bouton8 = ((Button) findViewById(R.id.touche8));
        bouton9 = ((Button) findViewById(R.id.touche9));
        bouton_plus = ((Button) findViewById(R.id.touche_plus));
        bouton_moins = ((Button) findViewById(R.id.touche_moins));
        bouton_diviser = ((Button) findViewById(R.id.touche_slash));
        bouton_enter = ((Button) findViewById(R.id.touche_enter));
        bouton_swap = ((Button) findViewById(R.id.touche_swap));
        bouton_pop = ((Button) findViewById(R.id.touche_pop));
        bouton_clear = ((Button) findViewById(R.id.touche_clear));

        //Ajout des Listener sur les boutons 1 à 9
        bouton1.setOnClickListener(this);
        bouton2.setOnClickListener(this);
        bouton3.setOnClickListener(this);
        bouton4.setOnClickListener(this);
        bouton5.setOnClickListener(this);
        bouton6.setOnClickListener(this);
        bouton7.setOnClickListener(this);
        bouton8.setOnClickListener(this);
        bouton9.setOnClickListener(this);

        //Récupération des TextView
        text_Courant = ((TextView) findViewById(R.id.text_courant));
        text_Pile1 = ((TextView) findViewById(R.id.Pile1));
        text_Pile2 = ((TextView) findViewById(R.id.Pile2));
        text_Pile3 = ((TextView) findViewById(R.id.Pile3));
        text_Pile4 = ((TextView) findViewById(R.id.Pile4));


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.touche1:
                text_Courant.setText(text_Courant.getText()+"1");
                break;
            case R.id.touche2:
                text_Courant.setText(text_Courant.getText()+"2");
                break;
            case R.id.touche3:
                text_Courant.setText(text_Courant.getText()+"3");
                break;
            case R.id.touche4:
                text_Courant.setText(text_Courant.getText()+"4");
                break;
            case R.id.touche5:
                text_Courant.setText(text_Courant.getText()+"5");
                break;
            case R.id.touche6:
                text_Courant.setText(text_Courant.getText()+"6");
                break;
            case R.id.touche7:
                text_Courant.setText(text_Courant.getText()+"7");
                break;
            case R.id.touche8:
                text_Courant.setText(text_Courant.getText()+"8");
                break;
            case R.id.touche9:
                text_Courant.setText(text_Courant.getText()+"9");
                break;
        }
    }
}
