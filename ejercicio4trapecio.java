import java.util.Scanner;
public class ejercicio4trapecio {
    public static void main(String[] args) {
        //GASPAR PAUCAR WILBER ANDRIHU
        //VARIABLES
            int l,m,n,o,v,b,h,p,ñ,a;
            Scanner teclado=new Scanner(System.in);
            System.out.println("Inserte el lado 1 del trapecio:");
            l=teclado.nextInt();
            System.out.println("Inserte el lado 2 del trapecio:");
            m=teclado.nextInt();
            System.out.println("Inserte el lado 3 del trapecio:");
            n=teclado.nextInt();
            System.out.println("Inserte el lado 4 del trapecio:");
            o=teclado.nextInt();
            System.out.println("Inserte la base menor del trapecio:");
            v=teclado.nextInt();
            System.out.println("Inserte la base mayor del trapecio:");
            b=teclado.nextInt();
            System.out.println("Inserte la altura del trapecio:");
            h=teclado.nextInt();
            //PROCESO
            p=l+m+n+o; 
            ñ=v+b;
            a=h*ñ/2;
            //SALIDA
            System.out.println("El perímetro del trapecio es:"+p);
            System.out.println("El área del trapecio es:"+a);
        }
}
