/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *  Modela un trabajador del centro
 * @author Miguel Páramos
 */
public class Profesor {
        private String nombre;  //El nombre del trabajador
        private String primerApellido; //El primer apellido
        private String segundoApellido; //El segundo apellido
        private String puesto; //El puesto de trabajo
        private String dni; //Su dni
        private int horasSemanales; //Cuánto se lo curra
        private float sueldo; //Cuanto gana al mes en euros
        private Asignatura[] asignaturasQueImparte; //Las asignaturas que da el profesor
        private CentroEducativo centro; //El centro donde curra
}
