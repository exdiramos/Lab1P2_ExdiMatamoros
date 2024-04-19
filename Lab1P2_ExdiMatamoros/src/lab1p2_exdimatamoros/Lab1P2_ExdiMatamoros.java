/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2_exdimatamoros;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
/**
 *Fila3
 *Asiento2
 * @author exdir
 */
public class Lab1P2_ExdiMatamoros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a odd number greater than 4 for the matrix size:");
        int size = scanner.nextInt();

        // Ensure the size is an odd number greater than 4
        while (size <= 4 || size % 2 == 0) {
            System.out.println("The size should be an odd number greater than 4, try again:");
            size = scanner.nextInt();
        }

        // Create a matrix of specified size with random numbers
        int[][] matrix = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }

        // Print the matrix
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}//Fin clase.