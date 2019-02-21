/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

import clases.Asignatura;
import clases.CentroEducativo;
import java.sql.Date;

/**
 *  Clase que representa a un alumno de un centro educativo
 * @author Malkien
 */
public class Alumno extends Persona{
    private Date fechaNacimiento; //La fecha en que nació esta persona
    private Asignatura[] matriculado;  //Asignaturas en las que estoy matriculado
    private CentroEducativo centroEstudios; //El centro donde estudia
        
}
