import java.util.Scanner;

public class Percobaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung : ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat : ");
        pangkat = sc.nextInt();
        
        System.out.print("Proses: ");
        cetakDeret(bilangan, pangkat);

        int hasil = hitungPangkat(bilangan, pangkat);
        System.out.println(" = " + hasil);
    }
    
    static int hitungPangkat (int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }

    static void cetakDeret (int x, int y) {
         for (int i = 0; i < y; i++) {
            System.out.print(x + "x");
        }
        System.out.print("1"); // bagian akhir deret
    }
}
