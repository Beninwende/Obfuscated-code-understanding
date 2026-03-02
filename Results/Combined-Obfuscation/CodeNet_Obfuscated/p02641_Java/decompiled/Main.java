/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int[] lIl;

    public Main() {
        Main IllIIIIIIllllIl;
    }

    public static void main(String[] stringArray) {
        Scanner llIllllllIlllIl = new Scanner(System.in);
        int IlIllllllIlllIl = llIllllllIlllIl.nextInt();
        int lIIllllllIlllIl = llIllllllIlllIl.nextInt();
        int[] IIIllllllIlllIl = new int[lIIllllllIlllIl];
        int lllIlllllIlllIl = lIl[0];
        int IllIlllllIlllIl = lIl[0];
        int lIlIlllllIlllIl = lIl[0];
        while (Main.lIlIl(lIlIlllllIlllIl, lIIllllllIlllIl)) {
            IIIllllllIlllIl[lIlIlllllIlllIl] = llIllllllIlllIl.nextInt();
            if (Main.IllIl(IIIllllllIlllIl[lIlIlllllIlllIl], IlIllllllIlllIl)) {
                lllIlllllIlllIl = lIl[1];
                IllIlllllIlllIl = lIl[1];
            }
            ++lIlIlllllIlllIl;
            "".length();
            if (-(0x70 ^ 0x74) <= 0) continue;
            return;
        }
        lIlIlllllIlllIl = IlIllllllIlllIl;
        int IIlIlllllIlllIl = lIl[1];
        Arrays.sort(IIIllllllIlllIl);
        int llIIlllllIlllIl = lIl[0];
        while (Main.lIlIl(llIIlllllIlllIl, lIIllllllIlllIl) && Main.IllIl(lllIlllllIlllIl, lIl[1]) && Main.IllIl(IIlIlllllIlllIl, lIl[1])) {
            IIlIlllllIlllIl = lIl[0];
            lllIlllllIlllIl = lIl[0];
            int IlIIlllllIlllIl = lIIllllllIlllIl - lIl[1];
            while (Main.lllIl(IlIIlllllIlllIl) && Main.IIIll(lllIlllllIlllIl)) {
                if (Main.IllIl(IIIllllllIlllIl[IlIIlllllIlllIl], IlIllllllIlllIl + llIIlllllIlllIl)) {
                    IIlIlllllIlllIl = lIl[1];
                    lIlIlllllIlllIl = IIIllllllIlllIl[IlIIlllllIlllIl];
                }
                if (Main.IllIl(IIIllllllIlllIl[IlIIlllllIlllIl], IlIllllllIlllIl - llIIlllllIlllIl)) {
                    lllIlllllIlllIl = lIl[1];
                    lIlIlllllIlllIl = IIIllllllIlllIl[IlIIlllllIlllIl];
                }
                --IlIIlllllIlllIl;
                "".length();
                if (" ".length() << " ".length() >= " ".length()) continue;
                return;
            }
            ++llIIlllllIlllIl;
            "".length();
            if (" ".length() << (" ".length() << " ".length()) != -" ".length()) continue;
            return;
        }
        if (Main.lIIll(lIlIlllllIlllIl, IlIllllllIlllIl) && Main.IllIl(IllIlllllIlllIl, lIl[1]) && Main.IIIll(IIlIlllllIlllIl)) {
            System.out.println(lIl[2] * IlIllllllIlllIl - lIlIlllllIlllIl - lIl[1]);
        }
        if (Main.lIIll(lIlIlllllIlllIl, IlIllllllIlllIl) && Main.IllIl(IllIlllllIlllIl, lIl[1]) && Main.IllIl(IIlIlllllIlllIl, lIl[1])) {
            System.out.println(lIl[2] * IlIllllllIlllIl - lIlIlllllIlllIl);
        }
        if (Main.lIlIl(lIlIlllllIlllIl, IlIllllllIlllIl) && Main.IllIl(IllIlllllIlllIl, lIl[1]) && Main.IIIll(lllIlllllIlllIl)) {
            System.out.println(lIlIlllllIlllIl - lIl[1]);
        }
        if (Main.lIlIl(lIlIlllllIlllIl, IlIllllllIlllIl) && Main.IllIl(IllIlllllIlllIl, lIl[1]) && Main.IllIl(lllIlllllIlllIl, lIl[1]) && Main.IIIll(IIlIlllllIlllIl)) {
            System.out.println(lIl[2] * IlIllllllIlllIl - lIlIlllllIlllIl);
        }
        if (Main.IllIl(lIlIlllllIlllIl, IlIllllllIlllIl) && Main.IllIl(IllIlllllIlllIl, lIl[1])) {
            System.out.println(lIlIlllllIlllIl - lIl[1]);
        }
        if (Main.IIIll(IllIlllllIlllIl)) {
            System.out.println(IlIllllllIlllIl);
        }
    }

    static {
        Main.IIlIl();
    }

    private static void IIlIl() {
        lIl = new int[3];
        Main.lIl[0] = " ".length() << (" ".length() << " ".length()) & ~(" ".length() << (" ".length() << " ".length()));
        Main.lIl[1] = " ".length();
        Main.lIl[2] = " ".length() << " ".length();
    }

    private static boolean IllIl(int n, int n2) {
        return n == n2;
    }

    private static boolean lIlIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIll(int n, int n2) {
        return n > n2;
    }

    private static boolean IIIll(int n) {
        return n == 0;
    }

    private static boolean lllIl(int n) {
        return n >= 0;
    }
}

