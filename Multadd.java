//öğrenci no:250541039
//adı-soyadı: Nehir KÖKTEN
public class Multadd {

    /**
     * Adim 2: a * b + c islemini gerceklestiren metot.
     */
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    /**
     * Adim 5: expSum metodunu yazin.
     * Formul: x * e^(-x) + sqrt(1 - e^(-x))
     */
    public static double expSum(double x) {
        // e uzeri -x ifadesini hesaplayip degiskene atiyoruz
        double exponentialPart = Math.exp(-x); 
        
        // Formulu multadd yapisina (a * b + c) uyduruyoruz:
        double a = x;
        double b = exponentialPart;
        // Karekok icinde 1.0 - ...
        double c = Math.sqrt(1.0 - exponentialPart);
        
        return multadd(a, b, c);
    }

    public static void main(String[] args) {
        
        // --- Adim 3: Basit Test ---
        System.out.println("1. Basit Test (1.0, 2.0, 3.0):");
        
        double simpleResult = multadd(1.0, 2.0, 3.0);
        System.out.println("Sonuc: " + simpleResult);
        System.out.println("----------------------------");

        // --- Adim 4a: sin(pi/4) + cos(pi/4)/2 ---
        // a * b + c formati: (1/2 * cos(pi/4)) + sin(pi/4)
        // a = 0.5
        // b = cos(pi/4)
        // c = sin(pi/4)
        double sinCosResult = multadd(0.5, Math.cos(Math.PI / 4), Math.sin(Math.PI / 4));
        
        System.out.println("2. Islem: sin(pi/4) + cos(pi/4)/2");
        System.out.println("Sonuc: " + sinCosResult);
        System.out.println("----------------------------");

        // --- Adim 4b: log(10) + log(20) ---
        // a * b + c formati: 1.0 * log(10) + log(20)
        double logResult = multadd(1.0, Math.log10(10), Math.log10(20));

        System.out.println("3. Islem: log(10) + log(20)");
        System.out.println("Sonuc: " + logResult);
        System.out.println("----------------------------");

        // --- Adim 5: expSum Testi ---
        double xValue = 1.0;
        double expSumResult = expSum(xValue);
        
        System.out.println("4. expSum(1.0) Testi:");
        System.out.println("Sonuc: " + expSumResult);
    }
}
