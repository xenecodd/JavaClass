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
    public static void main(String[] args) {

        long negative = -2147483648; // integer literallerin sınırını aştığı için math.abs negatif çıktı veriyordu
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
    }
}

