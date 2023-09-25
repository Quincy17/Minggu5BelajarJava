import java.util.Scanner;

public class PemilihanPercobaan220{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String predikat;
        System.out.print("Nilai uas : ");
        float uas = input.nextFloat();
        System.out.print("Nilai uts : ");
        float uts = input.nextFloat();
        System.out.print("Nilai kuis : ");
        float kuis = input.nextFloat();
        System.out.print("Nilai tugas : ");
        float tugas = input.nextFloat();

        float total = (uas *0.4F) + (uts *0.3F) + (kuis * 0.1F) + (tugas*0.2F);

        String message = total <65 ? "Remidi" : "Tidak Remidi";

        if(total>80 && total<=100){
            predikat="A";
        }
        else if (total>73 && total<=80){
            predikat="B+";
            }
        else if (total>65 && total<=73){
            predikat="B";
            }
        else if (total>60 && total<=65){
            predikat="C+";
            }
        else if (total>50 && total<=60){
            predikat="C";
            }
        else if (total>39 && total<=50){
            predikat="D";
            }
        else{
            predikat="E";
        }

        System.out.println("Nilai Akhir = " + total + " Dengan Predikat " + predikat + " Sehingga " + message);
    }
}