package com.tutoriales.calculadora;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // Creamos las referencias para los botones y para editar el texto
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual;
    EditText barraDeTexto;

    // Valores que utilizaremos
    float Valor1, Valor2;

    boolean Suma, Resta, Multiplicacion, Division;

    // Inicializamos nuestra calculadora
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        barraDeTexto = (EditText) findViewById(R.id.edt1);

        // BOTONES PARA NUESTROS NÚMEROS
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                barraDeTexto.setText(barraDeTexto.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                barraDeTexto.setText(barraDeTexto.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                barraDeTexto.setText(barraDeTexto.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                barraDeTexto.setText(barraDeTexto.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                barraDeTexto.setText(barraDeTexto.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                barraDeTexto.setText(barraDeTexto.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                barraDeTexto.setText(barraDeTexto.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                barraDeTexto.setText(barraDeTexto.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                barraDeTexto.setText(barraDeTexto.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                barraDeTexto.setText(barraDeTexto.getText() + "0");
            }
        });

        // FUNCIÓN SUMA
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (barraDeTexto == null) {
                    barraDeTexto.setText("");
                } else {
                    Valor1 = Float.parseFloat(barraDeTexto.getText() + "");
                    Suma = true;
                    barraDeTexto.setText(null);
                }
            }
        });

        // FUNCIÓN RESTA
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Valor1 = Float.parseFloat(barraDeTexto.getText() + "");
                Resta = true;
                barraDeTexto.setText(null);
            }
        });

        // FUNCIÓN MULTIPLICAR
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Valor1 = Float.parseFloat(barraDeTexto.getText() + "");
                Multiplicacion = true;
                barraDeTexto.setText(null);
            }
        });

        // FUNCIÓN DIVIDIR
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Valor1 = Float.parseFloat(barraDeTexto.getText() + "");
                Division = true;
                barraDeTexto.setText(null);
            }
        });

        // FUNCIÓN RESULTADO
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Valor2 = Float.parseFloat(barraDeTexto.getText() + "");

                if (Suma == true) {
                    barraDeTexto.setText(Valor1 + Valor2 + "");
                    Suma = false;
                }

                if (Resta == true) {
                    barraDeTexto.setText(Valor1 - Valor2 + "");
                    Resta = false;
                }

                if (Multiplicacion == true) {
                    barraDeTexto.setText(Valor1 * Valor2 + "");
                    Multiplicacion = false;
                }

                if (Division == true) {
                    barraDeTexto.setText(Valor1 / Valor2 + "");
                    Division = false;
                }
            }
        });

        // BOTON PARA LIMPIAR
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                barraDeTexto.setText("");
            }
        });

        // PUNTO
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                barraDeTexto.setText(barraDeTexto.getText() + ".");
            }
        });
    }
}
