import java.text.NumberFormat;

class RekeningBank{
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    private int saldo;

    RekeningBank(int saldo) {
        this.saldo = saldo;
        this.display();
    }

    public void simpanUang(int uang) {
        System.out.println("Anda menyimpan uang sebesar " + currency.format(uang));
        this.saldo += uang;
        this.display();
    }

    public void ambilUang(int uang) {
        if (this.saldo > uang) {
            System.out.println("Anda mengambil uang sebesar " + currency.format(uang));
            this.saldo -= uang;

        } else {
            System.out.println("Saldo anda tidak mencukupi");
        }
        this.display();
    } 

    public int getSaldo() {
        return saldo;
    }

    public String toString() {
        return "Saldo anda saat ini : " + currency.format(this.saldo);
    }

    public void display() {
        System.out.println(this);
    }
}

public class Quiz_4 {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("Selamat datang di Bank ABC!");
        RekeningBank BankBeraksi = new RekeningBank(100000);
        BankBeraksi.simpanUang(500000);
        BankBeraksi.ambilUang(150000);
        System.out.println(currency.format(BankBeraksi.getSaldo()));
    }
}
