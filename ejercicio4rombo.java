import java.util.Scanner;
public class ejercicio4rombo {
    public static void main(String[] args) {
        //GASPAR PAUCAR WILBER ANDRIHU
        //VARIABLES
            int l,dm,dn,p,a;
            Scanner teclado=new Scanner(System.in);
            System.out.println("Inserte el lado del rombo:");
            l=teclado.nextInt();
            System.out.println("Inserte diagonal mayor del rombo:");
            dm=teclado.nextInt();
            System.out.println("Inserte diagonal menor del rombo:");
            dn=teclado.nextInt();
            //PROCESO
            p=4*l; 
            a=dm*dn/2;
            //SALIDA
            System.out.println("El perímetro del rombo es:"+p);
            System.out.println("El área del rombo es:"+a);
        }
}
