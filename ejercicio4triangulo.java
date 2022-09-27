import java.util.Scanner;

public class ejercicio4triangulo {
    public static void main(String[] args) {
        //GASPAR PAUCAR WILBER ANDRIHU
        //VARIABLES
        int b,h,l,m,n,p,a;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Inserte la base:");
        b=teclado.nextInt();
        System.out.println("Inserte la altura:");
        h=teclado.nextInt();
        System.out.println("Inserte el lado 1:");
        l=teclado.nextInt();
        System.out.println("Inserte el lado 2:");
        m=teclado.nextInt();
        System.out.println("Inserte el lado 3:");
        n=teclado.nextInt();
        
        //PROCESO
        p=l+m+n; 
        a=b*h/2;
        //SALIDA
        System.out.println("El perímetro del triángulo es:"+p);
        System.out.println("El área del triángulo es:"+a);
    }
}
