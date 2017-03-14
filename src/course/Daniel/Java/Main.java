package course.Daniel.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a radius:");
        int radius = scan.nextInt();

        try {
            Circle c = new Circle(radius);
        } catch (Exception e) {
            System.out.println("invalid radius!");
            System.out.println("Enter a new value:");
            radius = scan.nextInt();

        }
//        int[] arr = {1,2,3};
//        try {
//            for (int i = 0; i <= arr.length ; i++) {
//                System.out.println(arr[i]);
//
//            }
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }

    }
}
