package com.sparta.ahmed;

public class Tasks {

    public static void swap(){
        int num1 = 4;
        int num2 = 7;
        int temp;
        Printer.printMessage("Before Swap");
        System.out.println(num1);
        System.out.println(num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        Printer.printMessage("After Swap");
        System.out.println(num1);
        System.out.println(num2);
    }

    public static void sumOfNumbers(){
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int sumOfNumbers = 0;
        int sumOfEven = 0;
        int sumOfOdd = 0;
        for(int value: arr1){

            sumOfNumbers += value;
            if(value%2==0){
                sumOfEven += value;
            }
            else{
                sumOfOdd += value;
            }
        }
        System.out.println(sumOfNumbers);
        System.out.println(sumOfEven);
        System.out.println(sumOfOdd);

    }

    public static void switchStatement(){
        int num = 4;
        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
        }
    }

    public static void fibonacci(){
        //prints out fibonacci sequence
        int n = 10, num1 = 0, num2 = 1;
        System.out.print("The first " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(num1 + " ");

            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }



}
