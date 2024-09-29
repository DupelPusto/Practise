import java.util.Scanner;
import java.text.MessageFormat;

public class Main {

    public static void main(String[] args)
    {

        String infostr = "Тип: {0}\nРозмір: {1}\nЗначення мін: {2}\nЗначення макс: {3}\n";

        System.out.println("Примітивні типи даних в Java:");
        String byteinfo0 = "Byte";
        short byteinfo1 = Byte.SIZE / 8;
        short byteinfo2 = Byte.MIN_VALUE;
        short byteinfo3 = Byte.MAX_VALUE;

        String byteout = MessageFormat.format(infostr,byteinfo0, byteinfo1, byteinfo2, byteinfo3);

        String intinfo0 = "Int";
        int intinfo1 = Integer.SIZE / 8;
        int intinfo2 = Integer.MIN_VALUE;
        int intinfo3 = Integer.MAX_VALUE;
        String intout = MessageFormat.format(infostr,intinfo0,intinfo1,intinfo2,intinfo3);

        String longinfo0 = "Long";
        long longinfo1 = Long.SIZE;
        long longinfo2 = Long.MIN_VALUE;
        long longinfo3 = Long.MAX_VALUE;
        String longout = MessageFormat.format(infostr,longinfo0,longinfo1,longinfo2,longinfo3);

        String floatinfo0 = "Float";
        short floatinfo1 = Float.SIZE / 8;
        float floatinfo2 = Float.MIN_VALUE;
        float floatinfo3 = Float.MAX_VALUE;
        String floatout = MessageFormat.format(infostr,floatinfo0,floatinfo1,floatinfo2,floatinfo3);

        String doubleinfo0 = "Double";
        short doubleinfo1 = Double.SIZE / 8;
        double doubleinfo2 = Double.MIN_VALUE;
        double doubleinfo3 = Double.MAX_VALUE;
        String doubleout = MessageFormat.format(infostr,doubleinfo0,doubleinfo1,doubleinfo2,doubleinfo3);


        System.out.println(byteout);
        System.out.println(intout);
        System.out.println(longout);
        System.out.println(floatout);
        System.out.println(doubleout);



        System.out.println("Input your int value: ");
        Scanner scanner = new Scanner(System.in);
        String usinput = scanner.nextLine();
        Float usout = Float.parseFloat(usinput);
        System.out.println("Your int value in float: " + usout);


        System.out.println("Input your float value: ");
        Scanner scanner1 = new Scanner(System.in);
        String usinput1 = scanner1.nextLine();
        System.out.println("Your float value: " + usinput1);

        scanner.close();
    }
}
