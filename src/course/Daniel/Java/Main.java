package course.Daniel.Java;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        try {
            for (int i = 0; i <= arr.length ; i++) {
                System.out.println(arr[i]);

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
