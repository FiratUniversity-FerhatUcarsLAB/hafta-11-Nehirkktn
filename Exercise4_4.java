//öğrenci numarası: 250541039
// adı-soyadı: Nehir KÖKTEN
public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor? 
        //Java'da geriye değer döndüren bir metot çağrıldığında, dönen veriyi yakalamak (bir değişkene atamak) zorunlu değildir. Metot çalışır, dönüş değerini üretir, fakat bu değer kullanılmadığı için hafızada işleme alınmadan yok sayılır. Bu durum sözdizimi (syntax) açısından bir hata teşkil etmez
        getNumber(); 

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        //sayHello() metodu void olarak tanımlanmıştır, bu da metodun geriye herhangi bir veri tipi döndürmediği anlamına gelir. Matematiksel toplama operatörü (+) ise iki değerin toplanmasını bekler. Burada void (değersizlik) ile 7 (tamsayı) toplanmaya çalışıldığı için tür uyuşmazlığı hatası alınmıştır. Java, veri içermeyen bir yapıyı işlemlerde kullanamaz.
        // System.out.println(sayHello() + 7);
        //Hata Mesajı: Error: operator + cannot be applied to void, int
        

        // Cevaplarinizi yorum olarak ekleyin.
    }
}
