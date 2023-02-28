class Titik {
    private int x, y;

    Titik() {
    }

    Titik(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void naik()  {
        this.y++;
        this.display();
    }

    public void turun() {
        this.y--;
        this.display();
    }

    public void kanan() {
        this.x++;
        this.display();
    }

    public void kiri()  {
        this.x--;
        this.display();
    }

    public String toString() {
        return "X : " + x + ", Y : " + y;
    }

    private void display() {
        System.out.println(this);
    }
}

public class Quiz_2 {
    public static void main(String[] args) throws Exception {
        Titik koordinat1 = new Titik();
        koordinat1.naik();
        koordinat1.kiri();
        koordinat1.turun();
        koordinat1.kanan();
    }
}
