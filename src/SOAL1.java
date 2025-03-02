public class SOAL1 {

    private float HargaBarang;
    private float JumlahBarang;
    private float Jumlah;


    public SOAL1(float HargaBarang, float JumlahBarang, float Jumlah) {
        this.HargaBarang = HargaBarang;
        this.JumlahBarang = JumlahBarang;
        this.Jumlah = Jumlah;
    }


    public float jawaban() {

        float totalHarga = HargaBarang * JumlahBarang;


        float diskon = totalHarga * Jumlah / 100;


        float totalSetelahDiskon = totalHarga - diskon;

        return totalSetelahDiskon;
    }


    public float getHargaBarang() {
        return HargaBarang;
    }

    public void setHargaBarang(float hargaBarang) {
        HargaBarang = hargaBarang;
    }


    public float getJumlahBarang() {
        return JumlahBarang;
    }

    public void setJumlahBarang(float jumlahBarang) {
        JumlahBarang = jumlahBarang;
    }


    public float getJumlah() {
        return Jumlah;
    }

    public void setJumlah(float jumlah) {
        Jumlah = jumlah;
    }


    public static void main(String[] args) {

        SOAL1 belanja1 = new SOAL1(100000, 5, 20);
        SOAL1 belanja2 = new SOAL1(1570000, 8, 55);
        SOAL1 belanja3 = new SOAL1(350000, 7, 3);
        SOAL1 belanja4 = new SOAL1(123456, 80, 7);
        SOAL1 belanja5 = new SOAL1(670005, 15, 7);
        SOAL1 belanja6 = new SOAL1(678900, 15, 5);


        System.out.println("Total belanja setelah diskon: " + belanja1.jawaban());
        System.out.println("Total belanja setelah diskon: " + belanja2.jawaban());
        System.out.println("Total belanja setelah diskon: " + belanja3.jawaban());
        System.out.println("Total belanja setelah diskon: " + belanja4.jawaban());
        System.out.println("Total belanja setelah diskon: " + belanja5.jawaban());
        System.out.println("Total belanja setelah diskon: " + belanja6.jawaban());

    }
}
