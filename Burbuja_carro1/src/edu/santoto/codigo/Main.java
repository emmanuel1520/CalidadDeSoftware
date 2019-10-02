/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.santoto.codigo;

import edu.santoto.codigo.Metodo;

/**
 *
 * @author USUARIO
 */
public class Main {

    public static void main(String[] args) {
        try {
            Metodo Mivectorcito = new Metodo();
            Mivectorcito.inprimir_Datos_tiempo();
            Mivectorcito.Vuelta_mas_lenta();
            Mivectorcito.Vuelta_mas_rapida();
            Mivectorcito.ordenamientoBurbuja();
            Mivectorcito.inprimir_Datos_tiempo();

        } catch (Exception e) {
            System.out.println("Error al digitar los datos, intente nuevamente");
        }
    }
}
