import java.util.Scanner;

public class PemilihanPercobaan120{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int angka = input.nextInt();
        
        String hasil = (angka%2==0) ? "Bilangan Genap" : "Bilangan Ganjil";
        System.out.println("Angka " + angka + " Merupakan " + hasil);
}
}