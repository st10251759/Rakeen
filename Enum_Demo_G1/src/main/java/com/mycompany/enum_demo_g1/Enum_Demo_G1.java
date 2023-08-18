

package com.mycompany.enum_demo_g1;
import javax.swing.*;

enum Size{SMALL, MEDIUM, LARGE, EXTRALARGE}

public class Enum_Demo_G1 {

    public static void main(String[] args) {
        //Display a welcome message using JOptionPane
        JOptionPane.showMessageDialog(null, "Welcome to Pizza Size Capturing App!");
    
        //Create a String of available pizzas
        //Store the options for task Status in an array
String[] choices = { "SMALL", "MEDIUM", "LARGE", "EXTRALARGE"};
        

        String sizes = (String) JOptionPane.showInputDialog(null, "Choose the size of the pizza...",
        "Select Task Status", JOptionPane.QUESTION_MESSAGE, null, // Use
                                                                        // default
                                                                        // icon
        choices, // Array of choices
        choices[1]); // Initial choice
    
       
        Pizza pizza = new Pizza(Size.SMALL);
    
        
    }
}
