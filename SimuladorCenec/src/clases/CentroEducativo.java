/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import personas.Director;
import personas.Profesor;
import personas.Alumno;
import personas.Limpiador;
import personas.Tecnico;
import personas.Administrativo;

/**
 *  Representa un centro educativo español 
 * @author Malkien
 */
public class CentroEducativo extends Elemento{
    private String dirección; //Calle número código postal y ciudad
    private String id; //Código de centro de la junta (Podría tener letras)
    private Alumno[] alumnos; //Alumnos matriculados en el centro
    private Aula[] aulas; //Aulas del centro
    private Ciclo[] ciclos; //Ciclos que se imparten (DAM / DAW)
    private Profesor[] profesores; //Los profesores en plantilla
    private Administrativo[] administracion; //Los trabajadores de administración
    private Director director; //El director del centro
    private Limpiador[] personalLimpieza; //Las personas que limpian
    private Tecnico tecnico; //El que arregla ordenadores
}
