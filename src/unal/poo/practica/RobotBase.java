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
            
            //Base de datos.
            int[][] BD = {{1,0,0,0,0,0}, {1,1,0,0,0,0}, {1,0,0,0,0,1}, {1,0,0,0,1,1}, {1,0,0,0,1,0}, {1,1,0,0,0,1}, {1,1,0,0,1,1}, {1,1,0,0,1,0}, {0,1,0,0,0,1}, {0,1,0,0,1,1}, {1,0,1,0,0,0}, {1,1,1,0,0,0}, {1,0,1,0,0,1}, {1,0,1,0,1,1}, {1,0,1,0,1,0}, {1,1,1,0,0,1}, {1,1,1,0,1,1}, {1,1,1,0,1,0}, {0,1,1,0,0,1}, {0,1,1,0,1,1}, {1,0,1,1,0,0}, {1,1,1,1,0,0}, {0,1,0,1,1,1}, {1,0,1,1,0,1}, {1,0,1,1,1,1}, {1,0,1,1,1,0}, {0,0,1,1,1,1}, {0,0,1,1,1,0}, {0,1,0,0,0,0}, {0,1,1,0,0,0}, {0,1,0,0,1,0}, {0,1,0,1,1,0}, {0,1,0,1,0,0}, {0,1,1,0,1,0}, {0,1,1,1,1,0}, {0,1,1,1,0,0}, {0,0,1,0,1,0}};
            
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,0, 1, Direction.SOUTH,40);
            
            int l;
            int[] array = new int [6];
            String frase = "";
            
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
                        else
                        {
                            array[l] = 0;
                        }
                    }
                    
                    estudiante.turnLeft();
                    estudiante.move();
                    if(estudiante.canPickThing() == true)
                    {
                        array[3] = 1;
                    }
                    else
                    {
                        array[3] = 0;
                    }
                    estudiante.turnLeft();
                    for(int r = 4; r <= 5; r++)
                    {
                        estudiante.move();
                        if(estudiante.canPickThing() == true)
                        {
                            array[r] = 1;
                        }
                        else
                        {
                            array[r] = 0;
                        }
                    }
                    estudiante.move();
                    estudiante.turnLeft();
                    estudiante.turnLeft();
                    estudiante.turnLeft();
                    estudiante.move();
                    estudiante.turnLeft();
                    estudiante.turnLeft();
                    estudiante.turnLeft();
                    
                    for(int y = 0; y <= 36; y++)
                    {
                        //System.out.println(array[y]);
                        if(BD[y][0] == array [0] && BD[y][1] == array [1] && BD[y][2] == array [2] && BD[y][3] == array [3] && BD[y][4] == array [4] && BD[y][5] == array [5])
                        {
                            switch(y+1)
                            {
                                case 1: frase = frase + "A";
                                break;
                                case 2: frase = frase + "B";
                                break;
                                case 3: frase = frase + "C";
                                break;
                                case 4: frase = frase + "D";
                                break;
                                case 5: frase = frase + "E";
                                break;
                                case 6: frase = frase + "F";
                                break;
                                case 7: frase = frase + "G";
                                break;
                                case 8: frase = frase + "H";
                                break;
                                case 9: frase = frase + "I";
                                break;
                                case 10: frase = frase + "J";
                                break;
                                case 11: frase = frase + "K";
                                break;
                                case 12: frase = frase + "L";
                                break;
                                case 13: frase = frase + "M";
                                break;
                                case 14: frase = frase + "N";
                                break;
                                case 15: frase = frase + "O";
                                break;
                                case 16: frase = frase + "P";
                                break;
                                case 17: frase = frase + "Q";
                                break;
                                case 18: frase = frase + "R";
                                break;
                                case 19: frase = frase + "S";
                                break;
                                case 20: frase = frase + "T";
                                break;
                                case 21: frase = frase + "U";
                                break;
                                case 22: frase = frase + "V";
                                break;
                                case 23: frase = frase + "W";
                                break;
                                case 24: frase = frase + "X";
                                break;
                                case 25: frase = frase + "Y";
                                break;
                                case 26: frase = frase + "Z";
                                break;
                                case 27: frase = frase + "#";
                                break;
                                case 28: frase = frase + "0";
                                break;
                                case 29: frase = frase + "1";
                                break;
                                case 30: frase = frase + "2";
                                break;
                                case 31: frase = frase + "3";
                                break;
                                case 32: frase = frase + "4";
                                break;
                                case 33: frase = frase + "5";
                                break;
                                case 34: frase = frase + "6";
                                break;
                                case 35: frase = frase + "7";
                                break;
                                case 36: frase = frase + "8";
                                break;
                                case 37: frase = frase + "9";
                                break;
                            }
                        }
                    }
                }
            }
        }
}

