/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *  Una asignatura de un ciclo
 * @author Miguel Páramos
 */
public class Asignatura {
        private String nombre; //El nombre de la asignatura
        private String temario; //La descripción del temario
        private int horasSemanales; //Las horas que se imparten a la semana
        private Profesor profesor; //El profesor de la asignatura
        private Ciclo miCiclo; //El ciclo al que pertenece
        private float precioMatricula; //El precio por matricularse en la asignatura
}
