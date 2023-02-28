import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        int jumlahNegara;
        ArrayList<Integer> daftarIndeks = new ArrayList<Integer>();
        String[] potonganNama, daftarNama;
        String nama;
        Scanner input = new Scanner(System.in);
        jumlahNegara = input.nextInt();
        input.nextLine();
        nama = input.nextLine().toLowerCase();
        potonganNama = nama.split(", ");
        for (int i = 0 ; i < jumlahNegara ; i++) {
            daftarNama = input.nextLine().split(", ");
            boolean ketemu = false;
            System.out.println(Arrays.toString(daftarNama));
            for (int j = 0 ; j < daftarNama.length ; j++) {
                for (int k = 0 ; k < potonganNama.length ; k++) {
                    if (daftarNama[j].toLowerCase().contains(potonganNama[k])) {
                        daftarIndeks.add(j);
                        System.out.println("menemukan potongan " + potonganNama[k] + " di indeks " + daftarNama[j]);
                        ketemu = true;
                        break;
                    }
                }
            if (ketemu) {
                break;
                }
            }
        }
    System.out.println(daftarIndeks);
    }
}
