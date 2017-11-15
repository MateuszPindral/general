package pl.sda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String option = "";
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;

        while (true) {
            option = sc.nextLine();
            switch (option) {

                case "add": {
                    a = sc.nextInt();
                    sc.nextLine();
                    b = sc.nextInt();
                    sc.nextLine();
                    System.out.println(Calculate.add(a, b));
                    break;
                }
                case "end": {
                    return;
                }
                default:
                    System.out.println("Wrong argument.");


            }
        }
    }
}
