import java.util.Scanner;

public class TotalNilai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = sc.nextInt();

        int[] data = new int[N];

        for (int i = N - 1; i >= 0; i--) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            data[i] = sc.nextInt();
        }

        int totalRekursif = totalRekursif(data, N - 1);
        int totalIteratif = totalIteratif(data);

        System.out.println("Total dari " + N + " angka yang dimasukkan adalah: " + totalRekursif);

    }

    static int totalRekursif(int[] arr, int index) {
        if (index == 0) {
            return 0;
        } else {
            return arr[index] + totalRekursif(arr, index - 1);
        }
    }

    static int totalIteratif(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
}
