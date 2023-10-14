import javax.swing.*;
import java.util.Arrays;
import java.lang.System;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

// Parametresi ile aldığı int türden 3 sayıdan ortancasına geri dönen mid isimli metodu yazınız ve test ediniz.
    public static int mid(int a, int b, int c) {
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        return arr[1];
    }

    public static int signum(int a) {
        int sign=-1;
        if (a>0){
            sign= 1;
        } else if (a==0) {
            sign=0;}
        return sign;
    }
    public static void main(String[] args) {

        /* long negative = -2147483648; // integer literallerin sınırını aştığı için math.abs negatif çıktı veriyordu
        // fakat long tipi literallerin sınırı daha geniş olduğundan pozitif çıktı veriyor.

        System.out.println(Math.abs(negative));
        for (int i = 1; i <= 10; i++) {
            System.out.println("Merhaba");
        }

// String değişkeni olarak girdi almak
        String input1 = JOptionPane.showInputDialog("Birinci sayıyı girin:");
        String input2 = JOptionPane.showInputDialog("İkinci sayıyı girin:");
        String operator = JOptionPane.showInputDialog("Yapmak istediğiniz işlemin sembolünü giriniz:");

// Girdileri integer tipine çevirme
        char opt = operator.charAt(0); // İşlem sembolünü al
        int num1 = Integer.parseInt(input1); // İlk sayıyı tamsayıya çevir
        int num2 = Integer.parseInt(input2); // İkinci sayıyı tamsayıya çevir
        int msg = 0; // Sonucu saklamak için değişken

// İşlem sembolüne göre işlemi yap
        if (opt == '+') {
            msg = Math.addExact(num1, num2); // Toplama işlemi
        } else if (opt == '-') {
            msg = Math.subtractExact(num1, num2); // Çıkarma işlemi
        } else if (opt == '*') {
            msg = Math.multiplyExact(num1, num2); // Çarpma işlemi
        } else if (opt == '/') {
            msg = Math.divideExact(num1, num2); // Bölme işlemi
        } else {
            JOptionPane.showMessageDialog(null, "Geçersiz işlem sembolü", "Hata", JOptionPane.ERROR_MESSAGE);
            System.exit(0); // Hata durumunda programı sonlandır
        }

// Alınan girdiyi kullanıcıya göster
        JOptionPane.showMessageDialog(null, msg);

// Kullanıcıdan üç tamsayı girişi almak için JOptionPane kullanılır.
        int a = Integer.parseInt(JOptionPane.showInputDialog("Birinci sayiyi girin:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Ikinci sayiyi girin:"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Ucuncu sayiyi girin:"));

// Kullanıcı girdileri int türünde değişkenlere dönüştürülür ve diziye atanır.
        int[] arr = {a, b, c};

// Girilen sayıları küçükten büyüğe sıralamak için Arrays.sort kullanılır.
        Arrays.sort(arr);

// Sıralanmış sayılar, ekrana küçükten büyüğe doğru sıralanmış şekilde yazdırılır.
        System.out.println(arr[0] + "<" + arr[1] + "<" + arr[2]);

// Parametresi ile aldığı int türden 3 sayıdan ortancasına geri dönen mid isimli metodu yazınız ve test ediniz.
        int result = Main.mid(5, 2, 7);
        System.out.println(result);

//Parametresi ile aldığı int türden bir sayının negatif mi, 0(sıfır) mı, pozitif mi olduğunu test eden signum isimli
// metodu yazınız ve test ediniz. Metot pozitif için 1(bir), negatif için -1(eksi bir) ve sıfır için 0(sıfır)döndürecektir.
        int sign= Main.signum(5);
        System.out.println(sign);

         */
        String hgt =JOptionPane.showInputDialog("Yükseklik giriniz:");
        String wdt =JOptionPane.showInputDialog("Genişlik giriniz:");

        int height= Integer.parseInt(hgt);
        int width= Integer.parseInt(wdt);
        for (int i = 0; i < height; i++) {

            System.out.print("|");
            /*h=15 w=5

            |*    |  i=0 i=h  j=1         j=i-1       k=w-i k=1
            | *   |  i=1 i=h  j=1         j=i-1       k=w-i k=1
            |  *  |  i=2 i=h  j=1         j=i-1       k=w-i k=1
            |   * |  i=3 i=h  j=1         j=i-1       k=w-i k=1
            |    *|  i=4 i=h  j=w-(i%w)-1 j=1         k=1 k=i%w
            |   * |  i=5 i=h  j=w-(i%w)-1 j=1         k=1 k=i%w
            |  *  |  i=6 i=h  j=w-(i%w)-1 j=1         k=1 k=i%w
            | *   |  i=7 i=h  j=1         j=w-(i%w)-2 k=i%w k=1
            |*    |  i=8 i=h  j=1         j=w-(i%w)-2 k=i%w k=1
            | *   |  i=9 i=h  j=1        j=w-(i%w)-2 k=i%w k=1
            |  *  |  i=10 i=h  j=1        j=w-(i%w)-2 k=i%w k=1
            |   * |  i=11 i=h  j=1        j=w-(i%w)-2 k=i%w k=1
            |    *|  i=12 i=h  j=1        j=w-(i%w)-2 k=i%w k=1
            |   * |  i=13 i=h  j=1        j=w-(i%w)-2 k=i%w k=1
            |  *  |  i=14 i=h  j=1        j=w-(i%w)-2 k=i%w k=1

             */
            if ((i/width)%2==0) {
                {
                    for (int j = 1; j <= i % width; j++) {
                        System.out.print(" ");
                    }
                }
                System.out.print("*");
                for (int k = width - (i % width); k >= 1; k--) {
                    System.out.print(" ");
                }
            }else if((i/width)%2!=0){
                for (int j = 1; j <= width-(i % width); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int k =(i % width)+1; k > 1; k--) {
                    System.out.print(" ");
                }
            }

            System.out.print("|");
            System.out.println(i);
        }
    }
}

