import java.util.Scanner;
public class ModifHargaBayar07 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int harga, jumlah, jumlahHalaman;
        double dis=0.1, total, bayar, jmlDis;
        String merkBuku;

        System.out.println("Masukkan merk buku");
        merkBuku=input.next();
        System.out.println("Masukkan halaman buku");
        jumlahHalaman=input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan Jumlah jumlah barang yang dibeli ");
        jumlah=input.nextInt();
        System.out.println("Masukkan besar diskon (0.1 sebagai 10%)");
        dis=input.nextDouble();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;
        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);
    }
}