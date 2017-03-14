package course.Daniel.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        getInt("Enter a number:");

        int x = getInteger("Enter a number:");
        System.out.println(x);

        System.out.println("Enter full name");
        String line = scan.nextLine();
        System.out.println(line);

    }

    public static int getInt(String prompt){
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in);

        try {

            int result = scan.nextInt();
            return result;
        }
        catch (Exception e){
            System.out.println("Bad input, try again:");
            return getInt(prompt);
        }
    }

    public static int getInteger(String prompt){

        Scanner scan = new Scanner(System.in);

        while (true)
        try {
            System.out.println(prompt);
//            int result = scan.nextInt();
//            scan.nextLine();
            String input = scan.nextLine();
            return Integer.valueOf(input);
        }
        catch (Exception e){
            System.out.println("Bad input, try again:");
        }
    }
}
