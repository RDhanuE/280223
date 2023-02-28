import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String teks;
        int indeks;
        Scanner input = new Scanner(System.in);
        teks = input.nextLine().toLowerCase();
        indeks = teks.substring(1, teks.length() - 1).indexOf('a');
        while (indeks != -1) {
            teks = teks.substring(0, indeks + 1) + teks.substring(indeks + 2);
            System.out.println(teks);
            indeks = teks.substring(1, teks.length() - 1).indexOf('a');
        }
        System.out.println("teks tersebut setelah menghilangkan huruf a kecuali pada awal dan akhir teks adalah " + teks);
    }
}
