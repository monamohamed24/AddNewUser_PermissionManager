package Pages;

import java.util.Random;

public class Data {
    public static String FirstName = "mona";
    public static String SecondName = "mohamed";

    static Random random = new Random();
    static int randomInt  = random.nextInt(800)+100;
    public static String Email = "user"+randomInt +"@gmail.com";

    public static String Password = "12345678";


    static int answer = random.nextInt(999) + 100;
    public static String phoneNumber = "+2011"+ answer + "12024";
    public static String nationaID = "123"+randomInt+"12";


}
