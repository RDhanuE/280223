class Motor{
    private int noPlat, gigi, kecepatan;

    public Motor(int noPlat) {
        this.noPlat = noPlat;
    }

    public void gas() {
        this.kecepatan++;
        this.display();
    }

    public void rem() {
        if (this.kecepatan == 0) {
            this.kecepatan = 0;
        } else {
            this.kecepatan--;
        }
        this.display();
    }

    public void naikGigi() {
        if (this.gigi == 4 && this.kecepatan == 0) {
            this.gigi = 0;
        } else if (this.gigi == 4) {
            this.gigi = 4;
        } else {
            this.gigi++;
        }
        this.display();
    }

    public void turunGigi() {
        if (this.gigi == 0) {
            this.gigi = 0;
        } else {
            this.gigi--;
        }
        this.display();
    }

    public String toString() {
        return "Kecepatan : " + this.kecepatan + ", Gigi : " + this.gigi;
    }

    public void display() {
        System.out.println(this);
    }
}

public class Quiz_3 {
    public static void main(String[] args) {
        Motor bebek = new Motor(1234);
        bebek.gas();
        bebek.gas();
        bebek.naikGigi();
        bebek.gas();
        bebek.gas();
        bebek.naikGigi();
        bebek.rem();
        bebek.rem();
        bebek.rem();
        bebek.rem();
        bebek.naikGigi();
        bebek.naikGigi();
        bebek.naikGigi();
        bebek.naikGigi();
        bebek.turunGigi();
    }    
}
