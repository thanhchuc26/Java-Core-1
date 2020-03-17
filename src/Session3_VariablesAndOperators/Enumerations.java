/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session3_VariablesAndOperators;

/**
 *
 * @author June
 */
public class Enumerations {

    enum Directions {
        East, West, North, South
    }

    public static void main(String[] args) {
        Directions direction;
        //Instantiate the Enum Direction
        direction = Directions.East;
        //Print the value of Enum
        System.out.println("Value: " + direction);
        if (direction != Directions.North) {
            System.out.println("Not North");
        } else {
            System.out.println("North");
        }
        switch (direction) {
            case East:
                System.out.println("East");
                break;
            default:
                System.out.println("Not East");
        }

    }
}
