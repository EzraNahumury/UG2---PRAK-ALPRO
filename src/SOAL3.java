public class SOAL3 {

    private double d1;
    private double d2;


    public SOAL3(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }


    public double jawaban() {

        double result = 0.5 * getD1() * getD2();
        return result;
    }


    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }


    public double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }


    public static void main(String[] args) {

        SOAL3 soal1 = new SOAL3(5, 10);
        SOAL3 soal2 = new SOAL3(14, 80);
        SOAL3 soal3 = new SOAL3(7, 35);
        SOAL3 soal4 = new SOAL3(66, 35);
        SOAL3 soal5 = new SOAL3(11, 10);
        SOAL3 soal6 = new SOAL3(12, 80);


        System.out.println("Luas Belah Ketupat: " + soal1.jawaban());
        System.out.println("Luas Belah Ketupat: " + soal2.jawaban());
        System.out.println("Luas Belah Ketupat: " + soal3.jawaban());
        System.out.println("Luas Belah Ketupat: " + soal4.jawaban());
        System.out.println("Luas Belah Ketupat: " + soal5.jawaban());
        System.out.println("Luas Belah Ketupat: " + soal6.jawaban());

    }
}
