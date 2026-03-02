/*
 * Decompiled with CFR 0.152.
 */
public class Main {
    private static int[] llIIIIl;

    public Main() {
        Main llIllllllIlIlIl;
    }

    public static void main(String[] stringArray) throws Exception {
        FastScanner IllIlllllIlIlIl = new FastScanner(System.in);
        long lIlIlllllIlIlIl = IllIlllllIlIlIl.nextLong();
        int IIlIlllllIlIlIl = llIIIIl[0];
        double llIIlllllIlIlIl = 100.0;
        while (Main.lllIllIl(Main.IllIllIl(llIIlllllIlIlIl, lIlIlllllIlIlIl))) {
            llIIlllllIlIlIl *= 1.01;
            llIIlllllIlIlIl = Math.floor(llIIlllllIlIlIl);
            ++IIlIlllllIlIlIl;
            "".length();
            if ("   ".length() > -" ".length()) continue;
            return;
        }
        System.out.println(IIlIlllllIlIlIl);
    }

    static {
        Main.lIlIllIl();
    }

    private static void lIlIllIl() {
        llIIIIl = new int[1];
        Main.llIIIIl[0] = (0xA7 ^ 0xBC) & ~(0x80 ^ 0x9B);
    }

    private static boolean lllIllIl(int n) {
        return n < 0;
    }

    private static int IllIllIl(double d, double d2) {
        return d == d2 ? 0 : (d < d2 ? -1 : 1);
    }
}

