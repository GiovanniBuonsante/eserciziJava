package com.company.esercizio4;

import java.util.Scanner;

public class es4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int radius = 0, check = 0;
        do {
            System.out.print("Enter the radius of the circle: ");
            try {
                radius = input.nextInt();
                check = 1;
            } catch (Exception e) {
                input.next();
            }
        } while (check != 1);
        System.out.printf("Diametro: %d\nArea: %f\nCirconferenza: %f",2*radius,Math.PI*(radius*radius),2*Math.PI*radius);
        input.close();
    }
}
