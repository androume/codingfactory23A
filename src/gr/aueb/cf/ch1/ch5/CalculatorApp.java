package gr.aueb.cf.ch1.ch5;

import java.util.Scanner;

/**
 * υλοποιει εναν απλο calculator που παρεχει τις υπηρεσιες a, sub, mul,div,mod
 * μφανιζει ενα προς τον χρηστη με επιλογες, λαμβανειτη τιμη της επιλογης
 * και στη συνεχεια δυο ακομα τιμες των num1 num2
 * και τελικα εμφανιζει το αποτελεσμα.
 */
public class CalculatorApp {
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        int choice = 0;

        do {
            // printMenu
            printMenu();
            choice = getNextInt("Please insert your choice");

             if (isChoiceInvalid(choice)) {
                 continue;
            }
             if (isChoiceQuit(choice)){
                 break;
             }
            //result = onChoiceGetResult(choice);
            // sout(result)
        } while (true);
    }

    public static void printMenu() {
        System.out.println("Επιλέξτε ένα απο τα παρακάτω.");
        System.out.println("1 Πρόσθεση");
        System.out.println("2 Αφαιρεση");
        System.out.println("3 Πολλαπλασιασμός");
        System.out.println("4 Διαιρεση");
        System.out.println("5 Υπόλοιπο");
        System.out.println("6 Έξοδος");

    }
    public static int getNextInt(String message) {
        System.out.println(message);
        return in.nextInt();
    }
    public static boolean isChoiceInvalid(int choice) {
        return choice < 1 || choice > 6;
    }

    public static boolean isChoiceQuit(int choice){
        return choice == 6;
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int mul(int num1, int num2) {
        return num1 * num2;
    }
    public static int div(int num1, int num2) {
        int value;
        if (num2 == 0) {
            return Integer.MAX_VALUE;
        } else {
            value = num1 / num2;
            return num1 / num2;
        }
    }

    public static int mod(int num1, int num2) {
        //int value;
        if (num2 == 0) {
            return Integer.MAX_VALUE;
        } else {
            //value = num1 / num2;
            return num1 % num2;
        }
    }
       public static int onChoiceGetResult(int choice){
           int num1 = getNextInt("Please insert the first number (int)");
           int num2 = getNextInt("Please insert the second number(int)");
           int result = 0;

           switch (choice) {

               case 1:
                   result = add(num1,num2);
                   break;
               case 2:
                   result = mul(num1,num2);
                   break;
               case 3:
                   result = div(num1,num2);
                   break;
               case 4:
                   result = mod(num1,num2);
                   break;
               case 5:
                   result = mul(num1,num2);
                   break;

           }

           return result;

        }

}
