public class Exercise4_2 {

  // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

    public static void main(String[] args) {
        zippo("rattle", 13); //1
    }

    public static void baffle(String blimp) {
        System.out.println(blimp);//4
        zippo("ping", -5);//5
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {
            System.out.println(quince + " zoop");//6
        } else {
            System.out.println("ik");//2
            baffle(quince);//3
            System.out.println("boo-wa-ha-ha");//7
        }
    }
}
