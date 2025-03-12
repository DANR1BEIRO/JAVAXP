package Conditions;

/*
* Loops are used in programming to repeat a block of code multiple times.
* They help automate repetitive tasks, making code more efficient and readable*/

public class Loops {
    public static void main(String[] args) {

        int cloneNumbers = 0;
        int maxCloneNumbers = 5;

        /*
              while (if condition is true) {
                   execute this code
          }
          */

        System.out.println("WHILE LOOP:");
        while (cloneNumbers < maxCloneNumbers) {
            cloneNumbers++;
            if (cloneNumbers == 1) {
                System.out.println("Naruto made a clone");
            } else {
                System.out.println("Naruto made " + cloneNumbers + " clones");
            }
        }

        /*
            for (initialization; condition; update {
                code to execute in each iteration
           }
           */

        System.out.println("\nFOR LOOP:");
        for (int i = 1; i <= maxCloneNumbers ; i++) {
            if (i == 1) {
                System.out.println("Naruto made a clone");
            } else {
                System.out.println("Naruto made " + i + " clones");
            }
        }
    }
}
