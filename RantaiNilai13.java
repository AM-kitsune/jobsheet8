
import java.util.Scanner;
public class RantaiNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j;
        int i =0;
        int u = 1;
       int totalNilai = 0;
       int nilaiMhs;
       int rataNilai;

            i = 1;
            while (i<=5){
                totalNilai=0;
                System.out.println("MASUKAN NILAI MAHASISWA KE - " +u);
                for (j=1;j<=5;j++){
                    System.out.print("Nilai ke-" +j + " - ");
                    nilaiMhs=sc.nextInt();
                    totalNilai+=nilaiMhs;
                }
                rataNilai=totalNilai/5;
                i++;
                System.out.println("Nilai Rata rata mahasiswa ke-"+ u + " Adalah " + rataNilai);
                u++;
            }

        }
    }

