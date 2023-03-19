package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5;
    Button button6, button7, button8, button9, buttonnokta;
    Button buttonarti, buttoneksi, buttonbolu, buttoncarpi;
    Button buttonC, buttonyuzde, buttonsil, buttonbos, buttonesit;

    TextView sonuc,toplama;
    boolean arti, bolu , carpi, eksi,yuzde,sil;

    float sayi1, sayi2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       sonuc=findViewById(R.id.sonuc);
       toplama=findViewById(R.id.toplama);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonarti = (Button) findViewById(R.id.buttonarti);
        buttoncarpi = (Button) findViewById(R.id.buttoncarpi);
        buttoneksi = (Button) findViewById(R.id.buttoneksi);
        buttonbolu = (Button) findViewById(R.id.buttonbolu);
        buttonesit = (Button) findViewById(R.id.buttonesit);
        buttonyuzde = (Button) findViewById(R.id.buttonyuzde);
        buttonsil = (Button) findViewById(R.id.buttonsil);
        buttonbos = (Button) findViewById(R.id.buttonbos);
        buttonnokta = (Button) findViewById(R.id.buttonvirgul);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText() + "0");
                toplama.setText(sonuc.getText());

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText() + "1");
                toplama.setText(sonuc.getText());

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText() + "2");
                toplama.setText(sonuc.getText());

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText() + "3");
                toplama.setText(sonuc.getText());

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText() + "4");
                toplama.setText(sonuc.getText());


            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText() + "5");
                toplama.setText(sonuc.getText());

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText() + "6");
                toplama.setText(sonuc.getText());

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText() + "7");
                toplama.setText(sonuc.getText());

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText() + "8");
                toplama.setText(sonuc.getText());

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText() + "9");
                toplama.setText(sonuc.getText());

            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText("");
                toplama.setText("");
            }
        });
        buttonbos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText("-"+sonuc.getText());
            }
        });
        buttonnokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sonuc.setText(sonuc.getText()+".");



            }
        });
        buttonsil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = sonuc.getText().toString();
                val = val.substring(0,val.length()-1);
                sonuc.setText(val);
                String val2 = toplama.getText().toString();
                val2 = val2.substring(0,val2.length()-1);
                toplama.setText(val2);
            }
        });
        buttonarti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc == null) {
                    sonuc.setText("");
                }
                else {
                    sayi1 = Float.parseFloat(sonuc.getText()+"");
                    arti=true;
                    sonuc.setText(null);

                }
            }
        });
        buttoncarpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc == null) {
                    sonuc.setText("");
                } else {
                    sayi1 = Float.parseFloat(sonuc.getText() +  "");
                    carpi = true;
                    sonuc.setText(null);

                }
            }
        });
        buttonbolu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc == null) {
                    sonuc.setText("");
                } else {
                    sayi1 = Float.parseFloat(sonuc.getText() +   "");
                    bolu = true;
                    sonuc.setText(null);

                }
            }
        });
        buttoneksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc == null) {
                    sonuc.setText("");
                } else {
                    sayi1 = Float.parseFloat(sonuc.getText() + "");
                    eksi = true;
                    sonuc.setText(null);
                }

            }
        });
        buttonyuzde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sonuc==null)
                {
                    sonuc.setText("");
                }
                else {
                    sayi1=Float.parseFloat(sonuc.getText()+"");
                       sonuc.setText(+sayi1/100+"");
                        toplama.setText(sayi1+"/100");
                        yuzde = false;

                }
            }
        });


        buttonesit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi2 = Float.parseFloat(sonuc.getText() + "");
                if (arti == true) {
                    sonuc.setText(sayi1 + sayi2 + "");
                    toplama.setText(sayi1+"+"+sayi2);
                    arti = false;

                }
                if (eksi == true) {
                    sonuc.setText(sayi1 - sayi2 + "");
                    toplama.setText(sayi1+"-"+sayi2);
                    eksi = false;

                }
                if (carpi == true) {
                    sonuc.setText(sayi1 * sayi2 + "");
                    toplama.setText(sayi1+"*"+sayi2);
                    carpi = false;


                }
                if (bolu == true) {
                    sonuc.setText(sayi1 / sayi2 + "");
                    toplama.setText(sayi1+"/"+sayi2);
                    bolu = false;


                }


            }


        });
    }
}