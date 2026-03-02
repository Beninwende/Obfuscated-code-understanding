/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Main$FastScanner
 */
import java.io.PrintWriter;

public class Main {
    static int K;
    static int S;
    static final FastScanner sc;
    static PrintWriter writer;
    private static int[] IlllllIIll;

    public Main() {
        Main lIlIlIlIlIIIlll;
    }

    public static void main(String[] stringArray) {
        K = sc.nextInt();
        S = sc.nextInt();
        writer.println(Main.g(S, K));
        writer.flush();
    }

    /*
     * WARNING - void declaration
     */
    private static int f(int IIIIlIlIlIIIlll, int llllIIlIlIIIlll) {
        void var2_2;
        if (Main.llIIIIllllIl(IIIIlIlIlIIIlll)) {
            return IlllllIIll[0];
        }
        int IlllIIlIlIIIlll = IlllllIIll[0];
        int lIllIIlIlIIIlll = IlllllIIll[0];
        while (Main.IIlIIIllllIl(lIllIIlIlIIIlll, llllIIlIlIIIlll)) {
            if (Main.IIlIIIllllIl(IIIIlIlIlIIIlll - lIllIIlIlIIIlll, llllIIlIlIIIlll) && Main.lIlIIIllllIl(IIIIlIlIlIIIlll - lIllIIlIlIIIlll)) {
                ++IlllIIlIlIIIlll;
            }
            ++lIllIIlIlIIIlll;
            "".length();
            if (" ".length() << (" ".length() << " ".length()) >= "   ".length()) continue;
            return "   ".length() << (0x35 ^ 0x30) & ~("   ".length() << (0x12 ^ 0x17));
        }
        return (int)var2_2;
    }

    /*
     * WARNING - void declaration
     */
    private static int g(int IIIlIIlIlIIIlll, int lllIIIlIlIIIlll) {
        void var2_2;
        int IllIIIlIlIIIlll = IlllllIIll[0];
        int lIlIIIlIlIIIlll = IlllllIIll[0];
        while (Main.IIlIIIllllIl(lIlIIIlIlIIIlll, lllIIIlIlIIIlll)) {
            IllIIIlIlIIIlll += Main.f(IIIlIIlIlIIIlll - lIlIIIlIlIIIlll, lllIIIlIlIIIlll);
            ++lIlIIIlIlIIIlll;
            "".length();
            if (-"  ".length() < 0) continue;
            return (0x10 ^ 0x35) & ~(0x15 ^ 0x30);
        }
        return (int)var2_2;
    }

    static {
        Main.IlIIIIllllIl();
        sc = new FastScanner(System.in);
        writer = new PrintWriter(System.out);
    }

    private static void IlIIIIllllIl() {
        IlllllIIll = new int[1];
        Main.IlllllIIll[0] = (130 + 126 - 158 + 83 ^ (0x3F ^ 0x34) << (" ".length() << (" ".length() << " ".length()))) << (" ".length() << " ".length()) & ((96 + 175 - 267 + 191 ^ (0x45 ^ 0x26) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length());
    }

    private static boolean IIlIIIllllIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean lIlIIIllllIl(int n) {
        return n >= 0;
    }

    private static boolean llIIIIllllIl(int n) {
        return n < 0;
    }
}

