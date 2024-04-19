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
        System.out.print("Ingrese un numero mayor a 4 para el tamaño de la matriz: ");
        int tamaño = scanner.nextInt();

        // Tamaño de la matrizi sea un numero mayor a 4
        while (tamaño <= 4 || tamaño % 2 == 0) {
            System.out.println("El tamaño de la matriz debe de ser un numero mayor a 4:");
            tamaño = scanner.nextInt();
        }

        // Generar una matriz con numero randoms
        int[][] matriz = new int[tamaño][tamaño];
        Random numerito = new Random();
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                matriz[i][j] = numerito.nextInt(10);
            }
        }

        // Imprimir Matriz
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
     public static void bubbleSort(int[] arr, int l, int r) {
        if (l < r) {
            int i = bubbleSortUtil(arr, l, r);
            bubbleSort(arr, l, i - 1);
            bubbleSort(arr, i + 1, r);
        }
    }

    public static int bubbleSortUtil(int[] arr, int l, int r) {
        int i, j, temp;
        for (i = l, j = l + 1; j <= r; i++, j++) {
            if (arr[i] > arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return i - 1;
    }
}//Fin clase.