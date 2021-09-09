import java.util.Scanner;
public class Prime {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("masukkan angka: ");
        int angka = scan.nextInt();
        
        int prima = 0;

        for (int faktor = 2; faktor <= angka; faktor++){
            if (angka % faktor == 0){
                prima++;
            }
        }

        if (prima == 1){
            System.out.println(angka + " adalah bilangan prima");
        } else{
            System.out.println(angka + " bukan bilangan prima");
        }
    }

}

        