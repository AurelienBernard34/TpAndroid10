package com.example.admin.tpandroid10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

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

    //Creation stack
    Stack<Integer> Pile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pile = new Stack<>();

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

        //Ajout des Listener sur les boutons 1 à 9 + enter + fonctionnalités
        bouton1.setOnClickListener(this);
        bouton2.setOnClickListener(this);
        bouton3.setOnClickListener(this);
        bouton4.setOnClickListener(this);
        bouton5.setOnClickListener(this);
        bouton6.setOnClickListener(this);
        bouton7.setOnClickListener(this);
        bouton8.setOnClickListener(this);
        bouton9.setOnClickListener(this);
        bouton_enter.setOnClickListener(this);
        bouton_clear.setOnClickListener(this);
        bouton_pop.setOnClickListener(this);
        bouton_swap.setOnClickListener(this);
        bouton_plus.setOnClickListener(this);
        bouton_moins.setOnClickListener(this);
        //bouton_diviser.setOnClickListener(this); //A revoir

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
            case R.id.touche_enter:
                entrer();
                    break;
            case R.id.touche_clear:
                clearEcran();
                Pile.clear();
                break;
            case R.id.touche_pop:
                pop();
                break;
            case R.id.touche_swap:
                swap();
                break;
            case R.id.touche_plus:
                ajouter();
                break;
            case R.id.touche_moins:
                soustraire();
                break;
            case R.id.touche_slash:
                diviser();
                break;

        }
    }

    public void ActualiserPile(Stack<Integer> pile){
        if (pile.size()>=1) {
            text_Pile1.setText(pile.get((pile.size() - 1)).toString());
        }
        if (pile.size()>=2){
            text_Pile2.setText(pile.get((pile.size()-2)).toString());
        }
        if (pile.size()>=3){
            text_Pile3.setText(pile.get((pile.size()-3)).toString());
        }
        if (pile.size()>=4){
            text_Pile4.setText(pile.get((pile.size()-4)).toString());
        }
    }

    public void clearEcran() {
        text_Courant.setText("");
        text_Pile1.setText("");
        text_Pile2.setText("");
        text_Pile3.setText("");
        text_Pile4.setText("");
    }

    public void pop(){
        if(!Pile.empty()) {
            Pile.pop();
            clearEcran();
            ActualiserPile(Pile);
        }
    }

    public void swap(){
        int number1, number2;
        number1 = Pile.peek();
        Pile.pop();
        number2 = Pile.peek();
        Pile.pop();

        Pile.push(number1);
        Pile.push(number2);

        clearEcran();
        ActualiserPile(Pile);
    }

    public void ajouter(){
            entrer();
        if (Pile.size()>=2) {
            int num1, num2, total;
            num1 = Pile.peek();
            Pile.pop();
            num2 = Pile.peek();
            Pile.pop();
            total = num1 + num2;
            Pile.push(total);
            clearEcran();
            ActualiserPile(Pile);
        }
    }

    public void soustraire() {
            entrer();
        if (Pile.size() >= 2) {
            int num1, num2, total;
            num1 = Pile.peek();
            Pile.pop();
            num2 = Pile.peek();
            Pile.pop();
            total = num1 - num2;
            Pile.push(total);
            clearEcran();
            ActualiserPile(Pile);

        }
    }

    public void diviser(){
        entrer();
        if (Pile.size() >= 2) {
            int num1, num2, total;
            num1 = Pile.peek();
            Pile.pop();
            num2 = Pile.peek();
            Pile.pop();
            total = num1 / num2;
            Pile.push(total);
            clearEcran();
            ActualiserPile(Pile);

        }
    }



    public void entrer() {
        if (!text_Courant.getText().toString().equals("")) {
            int val = Integer.valueOf((text_Courant.getText()).toString());
            Pile.push(val);
            text_Courant.setText("");
            ActualiserPile(Pile);
        }
    }



}
