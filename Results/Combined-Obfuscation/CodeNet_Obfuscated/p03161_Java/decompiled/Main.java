/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Main$Foster
 */
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
    static int[] minCostFrom;
    private static int[] IIllllIIll;

    public Main() {
        Main llIIIIIllIIIlll;
    }

    /*
     * WARNING - void declaration
     */
    static int solve(int llIllllIlIIIlll, int[] IlIllllIlIIIlll, int lIIllllIlIIIlll) {
        void var4_4;
        int IIIllllIlIIIlll = IlIllllIlIIIlll.length;
        if (Main.lIllllIlllIl(llIllllIlIIIlll, IIIllllIlIIIlll)) {
            return IIllllIIll[0];
        }
        if (Main.IlllllIlllIl(llIllllIlIIIlll, IIIllllIlIIIlll - IIllllIIll[1])) {
            return IIllllIIll[2];
        }
        if (Main.llllllIlllIl(minCostFrom[llIllllIlIIIlll], IIllllIIll[3])) {
            return minCostFrom[llIllllIlIIIlll];
        }
        int lllIlllIlIIIlll = IIllllIIll[0];
        int IllIlllIlIIIlll = IIllllIIll[1];
        while (Main.IIIIIIllllIl(IllIlllIlIIIlll, lIIllllIlIIIlll)) {
            int lIlIlllIlIIIlll = IIllllIIll[0];
            if (Main.lIIIIIllllIl(llIllllIlIIIlll + IllIlllIlIIIlll, IIIllllIlIIIlll)) {
                lIlIlllIlIIIlll = Math.abs(IlIllllIlIIIlll[llIllllIlIIIlll] - IlIllllIlIIIlll[llIllllIlIIIlll + IllIlllIlIIIlll]) + Main.solve(llIllllIlIIIlll + IllIlllIlIIIlll, IlIllllIlIIIlll, lIIllllIlIIIlll);
            }
            lllIlllIlIIIlll = Math.min(lIlIlllIlIIIlll, lllIlllIlIIIlll);
            ++IllIlllIlIIIlll;
            "".length();
            if ((((0x2B ^ 0x26) << (" ".length() << " ".length()) ^ (0x37 ^ 0x12)) & (0xF8 ^ 0xBD ^ (0x7F ^ 0x6A) << (" ".length() << " ".length()) ^ -" ".length())) == ((245 + 215 - 248 + 43 ^ (5 ^ 0x2A) << (" ".length() << " ".length())) & (0x32 ^ 0x11 ^ "   ".length() << (1 ^ 4) ^ -" ".length()))) continue;
            return (68 + 54 - 15 + 88 ^ " ".length() << (0x92 ^ 0x95)) & (" ".length() << "   ".length() ^ (0x4E ^ 5) ^ -" ".length());
        }
        Main.minCostFrom[var0] = var4_4;
        return Main.minCostFrom[var0];
    }

    public static void main(String[] stringArray) throws Exception {
        Foster llllIllIlIIIlll = new Foster();
        PrintWriter IlllIllIlIIIlll = new PrintWriter(System.out);
        int lIllIllIlIIIlll = llllIllIlIIIlll.nextInt();
        int IIllIllIlIIIlll = llllIllIlIIIlll.nextInt();
        minCostFrom = new int[lIllIllIlIIIlll];
        Arrays.fill(minCostFrom, IIllllIIll[3]);
        int[] llIlIllIlIIIlll = llllIllIlIIIlll.intArray(lIllIllIlIIIlll);
        IlllIllIlIIIlll.println(Main.solve(IIllllIIll[2], llIlIllIlIIIlll, IIllIllIlIIIlll));
        IlllIllIlIIIlll.close();
    }

    static {
        Main.IIllllIlllIl();
    }

    private static void IIllllIlllIl() {
        IIllllIIll = new int[4];
        Main.IIllllIIll[0] = 230582320 + 1628981221 - -80112434 + 207807672;
        Main.IIllllIIll[1] = " ".length();
        Main.IIllllIIll[2] = "   ".length() << (" ".length() << " ".length()) & ("   ".length() << (" ".length() << " ".length()) ^ -" ".length());
        Main.IIllllIIll[3] = -" ".length();
    }

    private static boolean IlllllIlllIl(int n, int n2) {
        return n == n2;
    }

    private static boolean lIllllIlllIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIIIIIllllIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IIIIIIllllIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean llllllIlllIl(int n, int n2) {
        return n != n2;
    }
}

