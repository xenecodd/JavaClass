import javax.swing.*;
import java.util.Arrays;
import java.lang.System;

public class Comf {
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
    private static void displayDuration(long saniye) {
        int saat = (int) (saniye / 3600); // Saat hesaplanır
        int dakka = (int) ((saniye % 3600) / 60); // Dakika hesaplanır
        int saniye1 = (int) (saniye % 60); // Saniye hesaplanır
        if (saat == 0 && dakka == 0 && saniye1 == 0) { // Eğer saat, dakika ve saniye değeri sıfırsa
            System.out.println("Baska bir deger giriniz"); // Kullanıcıya yeni bir değer girmesi gerektiğini bildirir
        }else{System.out.println("Saat: " + saat + "\nDakika: " + dakka + "\nSaniye: " + saniye1);};// Zamanı ekrana yazdırır
    }
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Lütfen yapmak istediğiniz görevin numarasını girin (1-12 arası):");
        int choice = Integer.parseInt(input);

        if (choice == 1) {
            long negative = -2147483648; // integer literallerin sınırını aştığı için math.abs negatif çıktı veriyordu
            // fakat long tipi literallerin sınırı daha geniş olduğundan pozitif çıktı veriyor.
            System.out.println(Math.abs(negative));
        } else if (choice == 3) {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Merhaba");
            }
        } else if (choice == 4) {
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
        } else if (choice == 5) {
// Kullanıcıdan üç tamsayı girişi almak için JOptionPane kullanılır.
            int a = Integer.parseInt(JOptionPane.showInputDialog("Birinci sayiyi girin:"));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Ikinci sayiyi girin:"));
            int c = Integer.parseInt(JOptionPane.showInputDialog("Ucuncu sayiyi girin:"));

// Kullanıcı girdileri int türünde değişkenlere dönüştürülür ve diziye atanır.
            int[] arr = {a, b, c};

// Girilen sayıları küçükten büyüğe sıralamak için Arrays.sort kullanılır.
            Arrays.sort(arr);
            System.out.print(arr[0]);
            if (arr[0]<arr[1]) {
                System.out.print("<");
            }else{
                System.out.print("=");
            }
            System.out.print(arr[1]);
            if (arr[1]<arr[2]) {
                System.out.print("<");
            }else{
                System.out.print("=");
            }
            System.out.print(arr[2]);
        } else if (choice == 6) {
            // Parametresi ile aldığı int türden 3 sayıdan ortancasına geri dönen mid isimli metodu yazınız ve test ediniz.
            int result = Comf.mid(5, 2, 7);
            System.out.println(result);
        } else if (choice == 7) {
            //Parametresi ile aldığı int türden bir sayının negatif mi, 0(sıfır) mı, pozitif mi olduğunu test eden signum isimli
            // metodu yazınız ve test ediniz. Metot pozitif için 1(bir), negatif için -1(eksi bir) ve sıfır için 0(sıfır)döndürecektir.
            int sign= Comf.signum(5);
            System.out.println(sign);
        } else if (choice == 8) {
            //12345*678901  1 1
            //1234***78901
            String number =JOptionPane.showInputDialog("Sayi giriniz:");

            int n= Integer.parseInt(number);
            int odd = 1; // İlk başta odd değişkeni 1 olarak başlatılır

            for (int i = 1; i <= n; i++) {
                for (int k = 1; k <= (n * 2 - odd) / 2; k++) {
                    System.out.print(" ");
                }
                for (int s = 1; s <= odd; s++) {
                    System.out.print("*");
                }
                for (int k = 1; k <= (n * 2 - odd) / 2; k++) {
                    System.out.print(" ");
                }
                System.out.println(" ");
                odd += 2;
            }
            odd-=2;
            for (int i = 1; i <= n; i++) {
                odd-=2;
                for (int k = 1; k <= (n * 2 - odd) / 2; k++) {
                    System.out.print(" ");
                }
                for (int s = 1; s <= odd; s++) {
                    System.out.print("*");
                }
                for (int k = 1; k <= (n * 2 - odd) / 2; k++) {
                    System.out.print(" ");
                }
                System.out.println(" ");
            }

        } else if (choice == 9) {
            String number = JOptionPane.showInputDialog("Sayı giriniz:");// Kullanıcıdan bir sayı girmesini isteyen iletişim kutusu açılır

            long saniye = Long.parseLong(number); // Kullanıcının girdiği değer long türüne dönüştürülür

            displayDuration(saniye); // Kullanıcının girdiği değer long türüne dönüştürülür

        } else if (choice == 10) {
            int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
                    73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163,
                    167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257,
                    263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359,
                    367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461,
                    463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577,
                    587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677,
                    683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809,
                    811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911, 919,
                    929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997
            };
            int[] mull = new int[arr.length * 2];
            String number = JOptionPane.showInputDialog("Sayı giriniz:");// Kullanıcıdan bir sayı girmesini isteyen iletişim kutusu açılır

            int n = Integer.parseInt(number); // Kullanıcının girdiği değer int türüne dönüştürülür
            int j = 0;

// Asal çarpanları hesaplamak için döngü başlar
            for (int i = 0; i < arr.length; i++) {
                // Eğer n, mevcut asal sayıya bölünebiliyorsa
                if (n % arr[j] == 0) {
                    // Bu asal sayıyı mull dizisine ekler
                    mull[i] = arr[j];
                    // n değerini bu asal sayıya böler
                    n = n / arr[j];
                } else {
                    // n, mevcut asal sayıya bölünemiyorsa bir sonraki asal sayıya geçer
                    j = j + 1;
                }
            }

// mull dizisini dolaşarak sıfır olmayan değerleri yazdırır
            for (int k = 0; k < mull.length; k++) {
                if (mull[k] != 0) {
                    System.out.print(mull[k] + " ");
                }
            }
        } else if((choice == 11)){
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
        } else if ((choice == 12)) {
            String number = JOptionPane.showInputDialog("Çift Sayı Girin:");
            int first = 0;
            int second = 0;
            int n = Integer.parseInt(number);
            int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
                    89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179,
                    181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277,
                    281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389,
                    397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499,
                    503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601, 607, 613, 617,
                    619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727, 733, 739,
                    743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859,
                    863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997
            };
            for (int i : arr) {

                for (int j : arr) {
                    if ((n - i) == j) {
                        first = i;
                        second = n - i;
                    }
                }
            }
            System.out.print(first);
            System.out.print('+');
            System.out.print(second);

        }else{
            JOptionPane.showMessageDialog(null, "Geçersiz görev numarası", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }


}
