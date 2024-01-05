/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maleandfemalepercentages;
import java.util.Scanner;


/**
 *
 * @author orlandomarin
 */

/*
Write a program that asks the user for the number of males and the number of 
females registered in a class. The program should display the percentage of 
males and females in the class.
Hint: Suppose there are 8 males and 12 females in a class. 
There are 20 students in the class. The percentage of males can be calculated 
as  or 40%. The percentage of females can be calculated as  or 60%
*/

public class MaleAndFemalePercentages {

    public static void main(String[] args) 
    {
        // add variables here
        int numberOfMales;
        int numberOfFemales;
        double totalNumberOfStudents;
        double malePercentage;
        double femalePercentage;
        
        // create Scanner object called "keyboard" to read user input
        Scanner keyboard = new Scanner(System.in);

        // ask user how many males are registered in a class
        System.out.println("How many males are registered for your class?");
        
        // read user's input for number of males in a class
        numberOfMales = keyboard.nextInt();
        
        // ask user how many females are registered in a class
        System.out.println("How many females are registered for your class?");
        
        // read user's input for number of females in a class
        numberOfFemales = keyboard.nextInt();
        
        // calculate the total number of  students  in class (males + females)
        totalNumberOfStudents = numberOfMales + numberOfFemales;
        
        // calculate the percentage of males in a class
        malePercentage = ((numberOfMales / totalNumberOfStudents) * 100);
        
        // calculate the percentage of females in a class
        femalePercentage = ((numberOfFemales / totalNumberOfStudents) * 100);
        
        // display the percentage of males and females in class
        System.out.printf("In Orlando Marin's class, %.2f percent of the "
                + "class is male, and %.2f percent of the class "
                + "is female.", malePercentage, femalePercentage);
    }
}
