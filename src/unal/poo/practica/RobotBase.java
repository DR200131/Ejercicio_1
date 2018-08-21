package unal.poo.practica;

import becker.robots.*;
import java.util.Scanner;
/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,0, 1, Direction.SOUTH,40);
            
            int l;
            int[] array = new int [6];
            String frase = "/0";
            
            for(int c = 0; c <= 4; c++)
            {
                if(estudiante.canPickThing() == true)
                {
                    System.out.println(frase);
                }
                else
                {
                    for(l = 0; l <= 2; l++)
                    {
                        estudiante.move();
                        if(estudiante.canPickThing() == true)
                        {
                            array[l] = 1;
                        }
                    }
                    
                    estudiante.turnLeft();
                    estudiante.move();
                    if(estudiante.canPickThing() == true)
                    {
                        array[1 + l] = 1;
                    }
                    estudiante.turnLeft();
                    
                    for(int r = 4; r <= 6; r++)
                    {
                        estudiante.move();
                        if(estudiante.canPickThing() == true)
                        {
                            array[r] = 1;
                        }
                    }
                    estudiante.turnLeft();
                    estudiante.turnLeft();
                    estudiante.turnLeft();
                    estudiante.move();
                }
            }
        }
}

