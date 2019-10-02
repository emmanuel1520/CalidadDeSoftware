/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.santoto.codigo;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author USUARIO
 */
public class Metodo {

    int tamano_vector;
    double Myvector[];
    Scanner elteclado;

    public Metodo() {
        elteclado = new Scanner(System.in);

        System.out.println("ingrese el maximo de vueltas");

        tamano_vector = elteclado.nextInt();

        Myvector = new double[tamano_vector];

    }

    public void DatosRandom() {

        for (int i = 0; i < tamano_vector; i++) {

            Random r = new Random();
            double val = r.nextDouble();
            double result = 10 + (val * 10);

            Myvector[i] = result;

        }
    }

    public void inprimir_Datos_tiempo() {

        System.out.println("**** visualizacion  de  datos****");
        for (int i = 0; i < tamano_vector; i++) {
            Random r = new Random();
            double val = r.nextDouble();
            double result = 10 + (val * 10);

            Myvector[i] = result;

            System.out.println("#vuelta[" + i + "]=" + Myvector[i]);

        }

    }

    public void ordenamientoBurbuja() {
        for (int i = 0; i < tamano_vector - 1; i++) {
            for (int j = 0; j < tamano_vector - 1; j++) {
                if (Myvector[j] < Myvector[j + 1]) {
                    double tmp = Myvector[j + 1];
                    Myvector[j + 1] = Myvector[j];
                    Myvector[j] = tmp;
                }
            }
        }

    }

    public void Vuelta_mas_lenta() {
        int vuelta_maslenta = 0;

        double tiempo_mas_lento = 0;

        for (int i = 0; i < tamano_vector; i++) {
            if (Myvector[i] > tiempo_mas_lento) {
                tiempo_mas_lento = Myvector[i];
                vuelta_maslenta = i;
            }
        }
        System.out.println("LA VUELTA MAS LENTA ES " + vuelta_maslenta + ", CON LOS TIEMPOS " + tiempo_mas_lento);

    }

    public void Vuelta_mas_rapida() {
        int vuelta_masrapida = 0;

        double tiempo_mas_rapida = Myvector[0];

        for (int i = 0; i < tamano_vector; i++) {
            if (Myvector[i] < tiempo_mas_rapida) {
                tiempo_mas_rapida = Myvector[i];
                vuelta_masrapida = i;
            }
        }
        System.out.println("LA VUELTA MAS RAPIDA ES " + vuelta_masrapida + ", CON LOS TIEMPOS " + tiempo_mas_rapida);

    }
}
