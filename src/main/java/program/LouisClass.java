package program;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
public class LouisClass
{
    static Scanner pasta;
    public static String pickRandomCopypasta()
    {
        String result = "";
        Random rand = new Random();
        int filenumber = rand.nextInt(8);
        try
        {
            File file = new File(("C:\\Users\\lydel\\MavenPractice\\src\\main\\CopyPastas\\" + filenumber + ".txt"));
            pasta = new Scanner(file);
            result = pasta.nextLine();
            pasta.close();
        }
        catch (FileNotFoundException error)
        {
            result = "There was a problem with finding the copypasta!";
            
        }
        
        return result;
        
    }

}