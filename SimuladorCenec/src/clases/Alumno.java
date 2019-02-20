/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Date;

/**
 *  Clase que representa a un alumno de un centro educativo
 * @author Miguel Páramos
 */
public class Alumno {
        private String nombre; //Nombre del alumno
        private String primerApellido; //Primer apellido del alumno
        private String dni; //Su dni
        private String segundoApellido; //Segundo apellido, null si no es hispano
        private Date fechaNacimiento; //La fecha en que nació esta persona
        private Asignatura[] matriculado;  //Asignaturas en las que estoy matriculado
        private CentroEducativo centroEstudios; //El centro donde estudia
        
}
