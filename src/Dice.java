/**
 * Created by student5 on 4/6/17.
 */
public class Dice {
    public static int d4(){
        double number = Math.random() * 4 + 1;
        return (int)(number);
    }
    public static int d6(){
        double number = Math.random() * 6 + 1;
        return (int)(number);
    }
    public static int d8(){
        double number = Math.random() * 8 + 1;
        return (int)(number);
    }
    public static int d10(){
        double number = Math.random() * 10 + 1;
        return (int)(number);
    }
    public static int d12(){
        double number = Math.random() * 12 + 1;
        return (int)(number);
    }
    public static int d20(){
        double number = Math.random() * 20 + 1;
        return (int)(number);
    }
    public static int d100(){
        double number = Math.random() * 100 + 1;
        return (int)(number);
    }
}
