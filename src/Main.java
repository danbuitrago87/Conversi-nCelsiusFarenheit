import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.println("Digite el valor en grados Celcius: ");
        String celsius=scanner.nextLine();
        int celsiusInt=Integer.parseInt(celsius);
        double faren=(celsiusInt*1.8)+32;
        //System.out.println(celsiusInt + " Grados Celsius es igual a " + faren + " Grados Farenheit");}
        System.out.println(String.format("%d Grados Celsius es igual a %.2f Grados Farenheit",celsiusInt,faren));
        int farenInt=(int) faren;
        System.out.println("Grados Farenheit en entero: " + farenInt);
    }
}