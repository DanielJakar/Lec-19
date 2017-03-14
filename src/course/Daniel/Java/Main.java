package course.Daniel.Java;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        FileWriter writer = null;
        try {
            writer = new FileWriter("1.txt");
            writer.write("Hello Java.");//security problem -> IO Fails.

        }
        catch (IOException e){
            e.printStackTrace();
            //Show animation for unknown error.
            }
            finally {
            if (writer!=null){
                try {
                    writer.close();
                } catch (IOException e1){
                    e1.printStackTrace();
                }
            }
        }

        //code that tries to read the file....








//        String reddit = "https://www.reddit.com/.json";
//        try {
//            URL url = new URL(reddit);
//            URLConnection con = url.openConnection();
//            InputStream in = con.getInputStream();
//        } catch (MalformedURLException e) {
//            System.out.println("Bad URL");
//        } catch (IOException e) {
//            System.out.println("Please connect to the internet!");
//        } catch (Exception e){
//            writetofile();
//        }


//



    }

    private static void writetofile() {try {
                FileWriter writer = new FileWriter("1.txt");
                writer.write("Hello world");
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
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


}
