import java.util.Arrays;

public class odev1 {
    public static void main(String[] args) {

        int[] notlar = {50,45,74,36,93,25,34};
        System.out.println("Notlar: "+ Arrays.toString(notlar));
        System.out.println("Not Ortalaması: "+ortalama(notlar));
        Arrays.sort(notlar);

    }

    public static double ortalama(int[] notlar) {
        int ortalama = 0;
        for(int i=0; i<notlar.length; i++) {
            ortalama = ortalama+notlar[i];
        }
        ortalama = ortalama/notlar.length;
        return (double) ortalama;
    }
    public static void ters(String[] args) {
        int[] notlar = {50,45,74,36,93,25,34};
        for(int i=0; i<notlar.length/2; i++) {
            int gecici = notlar[i];
            notlar[i] = notlar[notlar.length - i - 1];
            notlar[notlar.length - i - 1] = gecici;
        }
    }
    public static void buyuk(String[] args) {
        int en;
        int[] notlar = {50,45,74,36,93,25,34};
        en = notlar[0];
        for(int i = 0; i < notlar.length; i++) {
            if (notlar[i] > en) {
                en = notlar[i];
            }
        }
        System.out.println("Notlardaki en büyük değer: " + en);
    }
    public static void kucuk(String[] args) {
        double enk;
        double[] notlar = {50, 45, 74, 36, 93, 25, 34};
        enk = notlar[0];
        for (double sayi : notlar) {
            if (enk > sayi)
                enk = sayi;
        }
        System.out.format("Dizideki En Küçük Sayı = %.2f \n", enk);
    }
    public static void Yazdir(int notlar[]){
        System.out.print("Not: ");
        for (int i=0;i<notlar.length;i++){
            System.out.print(notlar[i] + "\t");
        }
    }
    public static void Sirala(int notlar[]){
        for(int i=0;i<notlar.length - 1;i++){
            for(int j=0;j<notlar.length - (i+1);j++){
                if(notlar[j]>notlar[j+1]){
                    int tmp = notlar[j];
                    notlar[j] = notlar[j+1];
                    notlar[j+1] = tmp;
                }
            }
        }
    }
}
