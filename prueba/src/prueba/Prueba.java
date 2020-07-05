package prueba;
import java.util.Scanner;
public class Prueba {

    public static void main(String[] args) {
          Scanner entrada=new Scanner(System.in);
double n;
System.out.println("Ingresa un numero"); 
n=entrada.nextDouble();
      double ra=Math.cbrt(n);
      System.out.printf("El numero es cubico \n"+ra);
    } 
    
}
