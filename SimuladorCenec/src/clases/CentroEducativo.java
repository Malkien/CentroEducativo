/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *  Representa un centro educativo español 
 * @author Miguel Páramos
 */
public class CentroEducativo {
        private String nombre;  //Nombre del centro
        private String dirección; //Calle número código postal y ciudad
        private String id; //Código de centro de la junta (Podría tener letras)
        private Alumno[] alumnos; //Alumnos matriculados en el centro
        private Aula[] aulas; //Aulas del centro
        private Ciclo[] ciclos; //Ciclos que se imparten (DAM / DAW)
        private Profesor[] profesores; //Los profesores en plantilla
        private Profesor[] administracion; //Los trabajadores de administración
        private Profesor director; //El director del centro
        private Profesor[] personalLimpieza; //Las personas que limpian
        private Profesor tecnico; //El que arregla ordenadores
}
