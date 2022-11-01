package com.epam.rd.autotasks.pizzasplit;
import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = scanner.nextInt();
        int numberOfPieces = scanner.nextInt();
        int numberOfPizza = 1;
        int fixPieces = numberOfPieces;
        while (true) {
            numberOfPieces = fixPieces;
            numberOfPieces *= numberOfPizza;
            if(numberOfPieces % numberOfPeople == 0){
                break;
            }
            numberOfPizza++;
        }
        System.out.println(numberOfPizza);
    }
}
