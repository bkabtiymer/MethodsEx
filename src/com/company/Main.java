package com.company;



import java.util.*;

public class Main {
    public static Scanner input= new Scanner(System.in);

    public static void main(String[] args) {
//        double num1,num2=0;
//
//        System.out.println("Enter 1st number: ");
//        num1=input.nextInt();
//        System.out.println("Enter 2nd number: ");
//        num2=input.nextInt();
//
//        average(num1,num2); //calculates average of number
        fiveLetter();

    }
    public static void average(double x, double y){
        double average=0;

        if(y==0){
            System.out.println("Undefined");
        }
        else {
            average=x/y;
            System.out.println("The average of the two numbers are: " + average);
        }
    }
    public static void fiveLetter(){
        char letterImp;
        System.out.println("Enter five letters: ");
        ArrayList<Character> chars=new ArrayList<Character>();
        for(int i=0;i<5;i++){
            System.out.print("Letter: ");
            letterImp=input.nextLine().charAt(0);
            chars.add(letterImp);
        }
//        System.out.println(chars);
        Collections.sort(chars);

        for(char r : chars){
            System.out.print(r + " ");
        }

    }


}