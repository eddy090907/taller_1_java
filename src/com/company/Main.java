package com.company;

import clases.CapacidadEndedudamiento;
import clases.Mensajes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Mensajes msg = new Mensajes();
        CapacidadEndedudamiento endedudamiento = new CapacidadEndedudamiento();

        String entrada = "SI";
        boolean paso1 = false, paso2 = false, paso3 = false;

        while (entrada.equals("SI")) {

            if (!paso1) {
                //Se valida que que el usuario ingrese los ingresos mensuales como valor numerico
                System.out.println(msg.getMsgIngresosMensuales());
                String iM = in.next();
                if (isNumeric(iM)) {
                    int ingMesuales = Integer.parseInt(iM);
                    //Se asigna el valor de entrada al atributo ingresosTotales de la clase capacidadEndedudamiento
                    endedudamiento.setIngresosTotales(ingMesuales);
                    paso1 = true;
                }
            }

            if (paso1 && !paso2) {
                System.out.println(msg.getMsgGastosFijos());
                String gF = in.next();
                //Se valida que que el usuario ingrese los gastos fijos como valor numerico
                if (isNumeric(gF)) {
                    int gastosFijos = Integer.parseInt(gF);
                    //Se asigna el valor de entrada al atributo gastosFijos de la clase capacidadEndedudamiento
                    endedudamiento.setGastosFijos(gastosFijos);
                    paso2 = true;
                }
            }

            if (paso1 && paso2 && !paso3) {
                System.out.println(msg.getMsgGastosVariables());
                String gV = in.next();
                //Se valida que que el usuario ingrese los gastos variables como valor numerico
                if (isNumeric(gV)) {
                    int gastosVariables = Integer.parseInt(gV);
                    //Se asigna el valor de entrada al atributo gastosVariables de la clase capacidadEndedudamiento
                    endedudamiento.setGastoVaribales(gastosVariables);
                    paso3 = true;
                }
            }

            //Se valida si no hubo error con los datos de entrada de lo contrario se muestra error
            if (paso1 && paso2 && paso3) {
                System.out.println(endedudamiento.getCapacidadEndeudamiento());
                entrada = "NO";
            } else {
                System.out.println(msg.getMsgErrorDatos());
            }

        }
        System.out.println("Ejecución terminada");
    }

    public static boolean isNumeric(String value) {
        boolean numeric;

        //Se verifica si el valor ingresado es numérico o no (se retorna true o false)
        try {
            Double.parseDouble(value);
            numeric = true;
        } catch (NumberFormatException e) {
            numeric = false;
        }

        return numeric;

    }
}
