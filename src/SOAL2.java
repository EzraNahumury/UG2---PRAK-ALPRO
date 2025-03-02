public class SOAL2 {
    private  double x;

    public  SOAL2(double x){
        this.x = x;
    }

    public double jawaban(){
        double hasil = (double) (2 * Math.pow(getX(), 3) + 2 * getX() + (getX() / 15.0));
        return hasil;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public static void main(String[] args) {
        SOAL2 fungsi = new SOAL2(3);
        SOAL2 fungsi2 = new SOAL2(10);
        SOAL2 fungsi3 = new SOAL2(15);
        SOAL2 fungsi4 = new SOAL2(20.5);
        SOAL2 fungsi5 = new SOAL2(0.5);
        SOAL2 fungsi6 = new SOAL2(1000);
        System.out.println("jawaban fungsi: " + fungsi.jawaban());
        System.out.println("jawaban fungsi: " + fungsi2.jawaban());
        System.out.println("jawaban fungsi: " + fungsi3.jawaban());
        System.out.println("jawaban fungsi: " + fungsi4.jawaban());
        System.out.println("jawaban fungsi: " + fungsi5.jawaban());
        System.out.println("jawaban fungsi: " + fungsi6.jawaban());
    }

}
