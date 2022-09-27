import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        //GASPAR PAUCAR WILBER ANDRIHU
    //VARIABLES
        int n1,n2,n3,n4,n5,s,p;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Inserte la primera nota:");
        n1=teclado.nextInt();
        System.out.println("Inserte la segunda nota:");
        n2=teclado.nextInt();
        System.out.println("Inserte la tercera nota:");
        n3=teclado.nextInt();
        System.out.println("Inserte la cuarta nota:");
        n4=teclado.nextInt();
        System.out.println("Inserte la quinta nota:");
        n5=teclado.nextInt();
        //PROCESO
        s=n1+n2+n3+n4+n5;
        p=s/5;
        //SALIDA
        System.out.println("El promedio de las notas ingresadas es:"+p);
    }
}
