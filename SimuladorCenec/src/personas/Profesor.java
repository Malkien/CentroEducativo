/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

import clases.Asignatura;
import clases.CentroEducativo;

/**
 *  Modela un trabajador del centro
 * @author Malkien
 */
public class Profesor extends Asalariado{
    private Asignatura[] asignaturasQueImparte; //Las asignaturas que da el profesor
    private CentroEducativo centro; //Los centros donde trabaja
}
