import java.util.Scanner;
public class ejercicio4cuadrado {
    public static void main(String[] args) {
        //GASPAR PAUCAR WILBER ANDRIHU
        //VARIABLES
            int l,p,a;
            Scanner teclado=new Scanner(System.in);
            System.out.println("Inserte el lado del cuadrado:");
            l=teclado.nextInt();
            
            //PROCESO
            p=l*4; 
            a=l*l;
            //SALIDA
            System.out.println("El perímetro del cuadrado es:"+p);
            System.out.println("El área del cuadrado es:"+a);
        }
}
