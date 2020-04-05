
public class LukujenKeskiarvo {

    // toteuta tähän uudelleen aiemmin tekemäsi summametodi
    public static int summa(int luku1, int luku2, int luku3, int luku4) {
        // kirjoita koodia tähän
        int summarum = luku1+luku2+luku3+luku4;
        return summarum;
    }

    public static double keskiarvo(int luku1, int luku2, int luku3, int luku4) {
        double joku = summa(luku1, luku2, luku3, luku4);
        double se = joku /4;
        return se;
    }

    public static void main(String[] args) {
        double vastaus = keskiarvo(4, 3, 6, 1);
        System.out.println("Keskiarvo: " + vastaus);
    }
}
