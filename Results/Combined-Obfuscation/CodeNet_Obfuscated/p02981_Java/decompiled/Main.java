/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;

public class Main {
    static final int mod;
    static long[] fac;
    static long[] inv;
    static long[] finv;
    private static int[] llIIIIlIl;

    public Main() {
        Main llIlIIIIlIlIll;
    }

    public static void main(String[] stringArray) {
        int lIIIIIIIlIlIll;
        int IlIIIIIIlIlIll;
        FastScanner lIlIIIIIlIlIll = new FastScanner();
        PrintWriter IIlIIIIIlIlIll = new PrintWriter(System.out);
        int llIIIIIIlIlIll = lIlIIIIIlIlIll.nextInt();
        if (Main.llIlIIlIIIl(llIIIIIIlIlIll * (IlIIIIIIlIlIll = lIlIIIIIlIlIll.nextInt()), lIIIIIIIlIlIll = lIlIIIIIlIlIll.nextInt())) {
            IIlIIIIIlIlIll.println(llIIIIIIlIlIll * IlIIIIIIlIlIll);
            "".length();
            if (null != null) {
                return;
            }
        } else {
            IIlIIIIIlIlIll.print(lIIIIIIIlIlIll);
        }
        IIlIIIIIlIlIll.flush();
    }

    static void calcNumOfCombinationInit(int IlllllllIIlIll) {
        fac = new long[IlllllllIIlIll];
        inv = new long[IlllllllIIlIll];
        finv = new long[IlllllllIIlIll];
        Main.fac[Main.llIIIIlIl[0]] = 1L;
        Main.fac[Main.llIIIIlIl[1]] = 1L;
        Main.finv[Main.llIIIIlIl[0]] = 1L;
        Main.finv[Main.llIIIIlIl[1]] = 1L;
        Main.inv[Main.llIIIIlIl[1]] = 1L;
        int lIllllllIIlIll = llIIIIlIl[2];
        while (Main.llIlIIlIIIl(lIllllllIIlIll, IlllllllIIlIll)) {
            Main.fac[lIllllllIIlIll] = fac[lIllllllIIlIll - llIIIIlIl[1]] * (long)lIllllllIIlIll % 1000000007L;
            Main.inv[lIllllllIIlIll] = 1000000007L - inv[llIIIIlIl[3] % lIllllllIIlIll] * (long)(llIIIIlIl[3] / lIllllllIIlIll) % 1000000007L;
            Main.finv[lIllllllIIlIll] = finv[lIllllllIIlIll - llIIIIlIl[1]] * inv[lIllllllIIlIll] % 1000000007L;
            ++lIllllllIIlIll;
            "".length();
            if ("   ".length() == "   ".length()) continue;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    static long calcNumOfCombination(int IlIlllllIIlIll, int lIIlllllIIlIll) {
        void var1_1;
        int n;
        if (!Main.IIllIIlIIIl(IlIlllllIIlIll, lIIlllllIIlIll) || !Main.lIllIIlIIIl(IlIlllllIIlIll) || Main.IlllIIlIIIl(lIIlllllIIlIll)) {
            return 0L;
        }
        return fac[n] * (finv[var1_1] * finv[n - var1_1] % 1000000007L) % 1000000007L;
    }

    static {
        Main.IlIlIIlIIIl();
        mod = llIIIIlIl[3];
    }

    private static void IlIlIIlIIIl() {
        llIIIIlIl = new int[4];
        Main.llIIIIlIl[0] = (0x40 ^ 0x13) & ~(0xFC ^ 0xAF);
        Main.llIIIIlIl[1] = " ".length();
        Main.llIIIIlIl[2] = " ".length() << " ".length();
        Main.llIIIIlIl[3] = 941576617 + 884069565 - 1005687141 + 180040966;
    }

    private static boolean IIllIIlIIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean llIlIIlIIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lIllIIlIIIl(int n) {
        return n >= 0;
    }

    private static boolean IlllIIlIIIl(int n) {
        return n < 0;
    }
}

