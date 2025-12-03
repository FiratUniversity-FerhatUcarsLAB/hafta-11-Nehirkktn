//öğrenci no : 250541039
//adı soyadı: Nehir KÖKTEN

import java.util.Scanner;

public class TarihKontrol {

    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println("Amerikan Formati: " + day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println("Avrupa Formati  : " + date + " " + month + " " + year + ", " + day);
    }

    // --- ANA PROGRAM ---
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- Tarih Kontrol Programi ---");

        // Verileri alalim
        System.out.print("Gunu yaziniz (Metin olarak, orn: Monday): ");
        String day = input.next();

        System.out.print("Ayi yaziniz (Metin olarak, orn: July): ");
        String month = input.next();

        System.out.print("Ayin kaci? (Sayi olarak, orn: 22): ");
        int date = input.nextInt();

        System.out.print("Yil kac? (Sayi olarak, orn: 2019): ");
        int year = input.nextInt();
        
        System.out.println("---------------------------");

        // --- KOSUL KISMI (Logic) ---
        
        // Mantik: Tarih 1-31 arasinda VE (&&) Yil 0'dan buyuk olmali
        if (date >= 1 && date <= 31 && year > 0) {
            
            // Eger sartlar uygunsa metotlari calistir
            printAmerican(day, date, month, year);
            printEuropean(day, date, month, year);
            
        } else {
            
            // Sartlar uygun degilse hata mesaji ver
            System.out.println("HATA: Gecersiz bir tarih girdiniz!");
            
            // Hatanin detayini kullaniciya soyleyelim
            if (date < 1 || date > 31) {
                System.out.println("-> Ayin gunu 1 ile 31 arasinda olmalidir. Siz " + date + " girdiniz.");
            }
            if (year <= 0) {
                System.out.println("-> Yil 0'dan buyuk olmalidir. Siz " + year + " girdiniz.");
            }
        }
        
        input.close();
    }
}
