package com.example.oraimunkapotlas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout relativeLayout;
    private TextView szamTextView;
    private Button kivonasG;
    private Button hozzaadasG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();



        hozzaadasG.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View view) {
                int ideiglenes;
                ideiglenes = Integer.valueOf(szamTextView.getText().toString());
                szamTextView.setText(Integer.toString(ideiglenes + 1));
                if (Integer.parseInt(szamTextView.getText().toString()) < 0){
                    szamTextView.setTextColor(getResources().getColor( R.color.red));
                }else if (Integer.parseInt(szamTextView.getText().toString()) > 0){
                    szamTextView.setTextColor(getResources().getColor( R.color.green));
                }else{
                    szamTextView.setTextColor(getResources().getColor( R.color.blue));
                }
            }
        }
        );
        kivonasG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ideiglenes;
                ideiglenes = Integer.valueOf(szamTextView.getText().toString());
                szamTextView.setText(Integer.toString(ideiglenes - 1));
                if (Integer.parseInt(szamTextView.getText().toString()) < 0){
                    szamTextView.setTextColor(getResources().getColor( R.color.red));
                }else if (Integer.parseInt(szamTextView.getText().toString()) > 0){
                    szamTextView.setTextColor(getResources().getColor( R.color.green));
                }else{ szamTextView.setTextColor(getResources().getColor( R.color.blue)); }

            }


        }

        );
    }
    public void init(){

        this.relativeLayout = findViewById(R.id.relativeLayout);

        this.szamTextView = findViewById(R.id.szamTextView);

        this.kivonasG = findViewById(R.id.kivonasG);

        this.hozzaadasG = findViewById(R.id.hozzaadasG);
    }
}