package com.example.jerryminotta.jerryminottatrikis9;

import android.graphics.drawable.Icon;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton[] imgbtn = new ImageButton[9];
    boolean isTurno;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgbtn[0]= findViewById(R.id.ib_uno);
        imgbtn[1]= findViewById(R.id.ib_dos);
        imgbtn[2]= findViewById(R.id.ib_tres);
        imgbtn[3]= findViewById(R.id.ib_cuatro);
        imgbtn[4]= findViewById(R.id.ib_cinco);
        imgbtn[5]= findViewById(R.id.ib_seis);
        imgbtn[6]= findViewById(R.id.ib_siete);
        imgbtn[7]= findViewById(R.id.ib_ocho);
        imgbtn[8]= findViewById(R.id.ib_nueve);



        for (int i = 0; i<imgbtn.length; i++ ){
            imgbtn[i].setOnClickListener(this);
        }

        int random = (int) (Math.random()*5);

        if(random%2==0){
            isTurno=true;
        }else{
            isTurno=false;
        }

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.ib_uno:


                if(isTurno){
                    Toast.makeText(this, "turnoUno", Toast.LENGTH_LONG).show();
                    imgbtn[0].setImageResource(R.drawable.circle);
                }else{
                    Toast.makeText(this, "turnoDos", Toast.LENGTH_LONG).show();
                    imgbtn[0].setImageResource(R.drawable.equis);
                }

                break;

            case R.id.ib_dos:
                if(isTurno){
                    imgbtn[0].setImageResource(R.drawable.circle);
                }else{
                    imgbtn[0].setImageResource(R.drawable.equis);
                }

                break;

            case R.id.ib_tres:
                if(isTurno){
                    imgbtn[0].setImageResource(R.drawable.circle);
                }else{
                    imgbtn[0].setImageResource(R.drawable.equis);
                }

                break;

                case R.id.ib_cuatro:
                    if(isTurno){
                        imgbtn[0].setImageResource(R.drawable.circle);
                    }else{
                        imgbtn[0].setImageResource(R.drawable.equis);
                    }

                break;

            case R.id.ib_cinco:
                if(isTurno){
                    imgbtn[0].setImageResource(R.drawable.circle);
                }else{
                    imgbtn[0].setImageResource(R.drawable.equis);
                }

                break;

            case R.id.ib_seis:
                if(isTurno){
                    imgbtn[0].setImageResource(R.drawable.circle);
                }else{
                    imgbtn[0].setImageResource(R.drawable.equis);
                }
                break;

            case R.id.ib_siete:

                break;


            case R.id.ib_ocho:

                break;


            case R.id.ib_nueve:

                break;


        }
    }


}
