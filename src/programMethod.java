import java.util.Scanner;

public class programMethod {
    static void depositAkh (int jangka, double depositoAwal){
        double bunga, adm = 120000, depositoAkhir = 0, potongan;
        System.out.print("==================== DEPOSITO ANDA ====================");
        for (int i= 1; i<=jangka; i++){
            potongan = depositoAwal - adm;
            if (jangka>=10){
                bunga =  potongan * 0.25;
            } else {
                bunga = potongan * 0.1;
            }
            depositoAkhir = potongan + bunga;
            depositoAwal=depositoAkhir;
            System.out.printf("\nJumlah Deposito Tahun Ke-"+ i +"      : Rp. %,.2f", depositoAkhir);
        }
        System.out.println("\n");
        System.out.println ("==================== DEPOSITO AKHIR ====================");
        System.out.printf("Deposito Akhir                  : Rp. %,.2f \n", depositoAkhir);
    }

    public static int pascal(int x, int y) {
        if (y == 0 || y == x) {
            return 1;
        } else {
            return pascal(x - 1, y - 1) + pascal(x - 1, y);
        }
    }

    public static void main(String[] args) {
        Scanner isi = new Scanner(System.in);
        int no;
        for(String opsi="y";opsi.equals("y") || opsi.equals("Y");){
            System.out.println("*******************************************************");
            System.out.println("\t\t  == Menu Program ==");
            System.out.println("1. Deposito");
            System.out.println("2. Segitiga Pascal");
            System.out.println("-------------------------------------------------------");
            System.out.print("Anda Memilih Menu No : ");
            no=isi.nextInt();
            System.out.println("*******************************************************");

            switch (no){
                case 1 :
                    System.out.println("==================== DATA DEPOSITO ====================");
                    System.out.printf("Nama Nasabah                    : ");
                    String nama=isi.next();
                    System.out.print("Jumlah Deposito                 : ");
                    double depositoAwal = isi.nextDouble();
                    System.out.print("Jangka Waktu Deposito (tahun)   : ");
                    int jangka=isi.nextInt();
                    System.out.println("=======================================================");
                    depositAkh (jangka, depositoAwal)  ;
                    break;
                case 2:
                    System.out.print("Masukkan bilangan pangkat : ");
                    int bil = isi.nextInt();
                    int N[] = new int[bil];
                    for (int x = 0; x <= N.length; x++) {
                        for (int j = bil ; j > x ; j--) {
                            System.out.print(" ");
                        }
                        for (int y = 0; y <= x; y++) {
                            System.out.print(pascal(x, y) + " ");
                        }
                        System.out.println(" ");
                    }
                    break;
            }
            System.out.println("-------------------------------------------------------");
            System.out.println("Ingin Memilih Menu lagi ?");
            System.out.printf("Tekan 'Y' untuk Ya dan 'N' untuk Tidak :");
            opsi=isi.next();
        }
    }
}

