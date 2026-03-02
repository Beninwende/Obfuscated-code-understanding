/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Main$FastReader
 */
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
    private static int[] IlIlIllll;

    public Main() {
        Main IlIIIllIIIIIIl;
    }

    /*
     * WARNING - void declaration
     */
    static long gcd(long lllllIlIIIIIIl, long IllllIlIIIIIIl) {
        long l;
        void var2_1;
        if (Main.IIIlIIllIll(Main.lllIIIllIll(lllllIlIIIIIIl, 0L))) {
            return IllllIlIIIIIIl;
        }
        return Main.gcd((long)(var2_1 % l), l);
    }

    /*
     * WARNING - void declaration
     */
    static long lcm(long llIllIlIIIIIIl, long IlIllIlIIIIIIl) {
        long l;
        void var2_1;
        return llIllIlIIIIIIl * var2_1 / Main.gcd(l, (long)var2_1);
    }

    /*
     * WARNING - void declaration
     */
    static long func(long[] llIIlIlIIIIIIl, long IlIIlIlIIIIIIl, int lIIIlIlIIIIIIl) {
        void var4_3;
        long IIIIlIlIIIIIIl = llIIlIlIIIIIIl[lIIIlIlIIIIIIl];
        long llllIIlIIIIIIl = llIIlIlIIIIIIl[lIIIlIlIIIIIIl];
        int IlllIIlIIIIIIl = lIIIlIlIIIIIIl + IlIlIllll[0];
        while (Main.IlIlIIllIll(Main.lIIlIIllIll(IlllIIlIIIIIIl, IlIIlIlIIIIIIl))) {
            llllIIlIIIIIIl = Math.max(llIIlIlIIIIIIl[IlllIIlIIIIIIl], llllIIlIIIIIIl + llIIlIlIIIIIIl[IlllIIlIIIIIIl]);
            IIIIlIlIIIIIIl = Math.max(llllIIlIIIIIIl, IIIIlIlIIIIIIl);
            ++IlllIIlIIIIIIl;
            "".length();
            if (((0x5E ^ 0x3D) & ~(0x2A ^ 0x49)) >= -" ".length()) continue;
            return 0L;
        }
        return (long)var4_3;
    }

    public static void main(String[] stringArray) {
        InputStream IIlIIIlIIIIIIl = System.in;
        PrintStream llIIIIlIIIIIIl = System.out;
        FastReader IlIIIIlIIIIIIl = new FastReader(IIlIIIlIIIIIIl);
        PrintWriter lIIIIIlIIIIIIl = new PrintWriter(llIIIIlIIIIIIl);
        int IIIIIIlIIIIIIl = IlIIIIlIIIIIIl.nextInt();
        int llllllIIIIIIIl = IlIIIIlIIIIIIl.nextInt();
        int[] IlllllIIIIIIIl = new int[IIIIIIlIIIIIIl];
        int lIllllIIIIIIIl = IlIlIllll[1];
        int IIllllIIIIIIIl = IlIlIllll[1];
        while (Main.llIlIIllIll(IIllllIIIIIIIl, IIIIIIlIIIIIIl)) {
            IlllllIIIIIIIl[IIllllIIIIIIIl] = IlIIIIlIIIIIIl.nextInt();
            ++IIllllIIIIIIIl;
            "".length();
            if (" ".length() << (" ".length() << " ".length()) > -" ".length()) continue;
            return;
        }
        Arrays.sort(IlllllIIIIIIIl);
        IIllllIIIIIIIl = IlIlIllll[1];
        while (Main.llIlIIllIll(IIllllIIIIIIIl, llllllIIIIIIIl)) {
            lIllllIIIIIIIl += IlllllIIIIIIIl[IIllllIIIIIIIl];
            ++IIllllIIIIIIIl;
            "".length();
            if (((153 + 140 - 171 + 73 ^ (0x6A ^ 0x2F) << " ".length()) & ((0xB3 ^ 0x84) << (" ".length() << " ".length()) ^ 111 + 48 - 58 + 48 ^ -" ".length())) == ((0x2F ^ 2 ^ (0x3B ^ 0x30) << " ".length()) & (0x3B ^ 0x48 ^ (0x30 ^ 0x39) << "   ".length() ^ -" ".length()))) continue;
            return;
        }
        lIIIIIlIIIIIIl.println(lIllllIIIIIIIl);
        lIIIIIlIIIIIIl.close();
    }

    static {
        Main.IllIIIllIll();
    }

    private static void IllIIIllIll() {
        IlIlIllll = new int[2];
        Main.IlIlIllll[0] = " ".length();
        Main.IlIlIllll[1] = (2 ^ 7) << " ".length() & ~((0x3E ^ 0x3B) << " ".length());
    }

    private static boolean llIlIIllIll(int n, int n2) {
        return n < n2;
    }

    private static boolean IIIlIIllIll(int n) {
        return n == 0;
    }

    private static boolean IlIlIIllIll(int n) {
        return n < 0;
    }

    private static int lllIIIllIll(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static int lIIlIIllIll(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

