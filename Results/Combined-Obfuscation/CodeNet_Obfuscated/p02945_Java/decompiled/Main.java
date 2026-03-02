/*
 * Decompiled with CFR 0.152.
 */
import java.util.Scanner;

public class Main {
    private static int[] IIIlIIll;

    public Main() {
        Main lIllllllllIIIIl;
    }

    /*
     * WARNING - void declaration
     */
    public static long gcm(long lllIllllllIIIIl, long IllIllllllIIIIl) {
        void var4_2;
        long lIlIllllllIIIIl = lllIllllllIIIIl;
        long IIlIllllllIIIIl = 0L;
        long llIIllllllIIIIl = IllIllllllIIIIl;
        do {
            IIlIllllllIIIIl = lIlIllllllIIIIl % llIIllllllIIIIl;
            lIlIllllllIIIIl = llIIllllllIIIIl;
            llIIllllllIIIIl = IIlIllllllIIIIl;
        } while (!Main.llllIIIlIl(Main.IlllIIIlIl(IIlIllllllIIIIl, 0L)));
        return (long)var4_2;
    }

    /*
     * WARNING - void declaration
     */
    public static long lcm(long llllIlllllIIIIl, long IlllIlllllIIIIl) {
        void var2_1;
        void var4_2;
        long l;
        long lIllIlllllIIIIl = Main.gcm(llllIlllllIIIIl, IlllIlllllIIIIl);
        return l / var4_2 * var2_1;
    }

    /*
     * WARNING - void declaration
     */
    static long gcd(long lIIlIlllllIIIIl, long IIIlIlllllIIIIl) {
        void var2_1;
        long lllIIlllllIIIIl;
        while (Main.lIIIlIIlIl(Main.IIIIlIIlIl(lllIIlllllIIIIl = lIIlIlllllIIIIl % IIIlIlllllIIIIl, 0L))) {
            lIIlIlllllIIIIl = IIIlIlllllIIIIl;
            IIIlIlllllIIIIl = lllIIlllllIIIIl;
            "".length();
            if (("   ".length() << "   ".length() & ("   ".length() << "   ".length() ^ -" ".length())) == 0) continue;
            return 0L;
        }
        return (long)var2_1;
    }

    static boolean isPrime(int llIIIlllllIIIIl) {
        if (Main.llIIlIIlIl(llIIIlllllIIIIl, IIIlIIll[0])) {
            return IIIlIIll[1];
        }
        if (!Main.IIlIlIIlIl(llIIIlllllIIIIl, IIIlIIll[0]) || Main.llllIIIlIl(llIIIlllllIIIIl % IIIlIIll[0])) {
            return IIIlIIll[2];
        }
        double IlIIIlllllIIIIl = Math.sqrt(llIIIlllllIIIIl);
        int lIIIIlllllIIIIl = IIIlIIll[3];
        while (Main.lIlIlIIlIl(Main.IlIIlIIlIl(lIIIIlllllIIIIl, IlIIIlllllIIIIl))) {
            if (Main.llllIIIlIl(llIIIlllllIIIIl % lIIIIlllllIIIIl)) {
                return IIIlIIll[2];
            }
            lIIIIlllllIIIIl += 2;
            "".length();
            if (null == null) continue;
            return ((0x23 ^ 0x3A) << " ".length() & ~((0x90 ^ 0x89) << " ".length())) != 0;
        }
        return IIIlIIll[1];
    }

    static boolean isMultiple(String llIllIllllIIIIl, int IlIllIllllIIIIl, int lIIllIllllIIIIl) {
        int IIIllIllllIIIIl = IIIlIIll[2];
        int lllIlIllllIIIIl = IIIlIIll[2];
        while (Main.IllIlIIlIl(lllIlIllllIIIIl, llIllIllllIIIIl.length())) {
            IIIllIllllIIIIl = (IIIllIllllIIIIl * IlIllIllllIIIIl + Character.getNumericValue(llIllIllllIIIIl.charAt(lllIlIllllIIIIl))) % lIIllIllllIIIIl;
            ++lllIlIllllIIIIl;
            "".length();
            if ((((0x4B ^ 4) << " ".length() ^ 65 + 13 - 1 + 86) & (79 + 72 - 149 + 125 << " ".length() ^ 134 + 70 - 123 + 114 ^ -" ".length())) < " ".length() << (" ".length() << " ".length())) continue;
            return ((0x24 ^ 0x6F ^ (0x6E ^ 0x41) << " ".length()) << (" ".length() << " ".length()) & ((0xBD ^ 0x8A ^ (0x57 ^ 0x46) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
        }
        if (Main.llllIIIlIl(IIIllIllllIIIIl)) {
            return IIIlIIll[1];
        }
        return IIIlIIll[2];
    }

    static long factorial(int lIlIlIllllIIIIl) {
        int n;
        if (Main.llIIlIIlIl(lIlIlIllllIIIIl, IIIlIIll[1])) {
            return 1L;
        }
        return (long)n * Main.factorial(n - IIIlIIll[1]);
    }

    /*
     * WARNING - void declaration
     */
    static String toNbase(String lIIIlIllllIIIIl, int IIIIlIllllIIIIl, int llllIIllllIIIIl) {
        void var2_2;
        void var1_1;
        return Long.toString(Long.parseLong(lIIIlIllllIIIIl, (int)var1_1), (int)var2_2);
    }

    /*
     * WARNING - void declaration
     */
    public static final long gcd_n(long[] IlIlIIllllIIIIl) {
        void var2_2;
        int lIIlIIllllIIIIl = IlIlIIllllIIIIl.length;
        long IIIlIIllllIIIIl = Main.gcd(IlIlIIllllIIIIl[IIIlIIll[2]], IlIlIIllllIIIIl[IIIlIIll[1]]);
        int lllIIIllllIIIIl = IIIlIIll[1];
        while (Main.IllIlIIlIl(lllIIIllllIIIIl, lIIlIIllllIIIIl - IIIlIIll[1])) {
            IIIlIIllllIIIIl = Main.gcd(IIIlIIllllIIIIl, IlIlIIllllIIIIl[lllIIIllllIIIIl + IIIlIIll[1]]);
            ++lllIIIllllIIIIl;
            "".length();
            if (-" ".length() <= ((0x70 ^ 0x43) & ~(0xA9 ^ 0x9A))) continue;
            return 0L;
        }
        return (long)var2_2;
    }

    /*
     * WARNING - void declaration
     */
    public static long lcm_n(long[] llIIIIllllIIIIl) {
        void var1_1;
        long IlIIIIllllIIIIl = llIIIIllllIIIIl[IIIlIIll[2]];
        int lIIIIIllllIIIIl = IIIlIIll[1];
        while (Main.IllIlIIlIl(lIIIIIllllIIIIl, llIIIIllllIIIIl.length)) {
            IlIIIIllllIIIIl = Main.lcm(IlIIIIllllIIIIl, llIIIIllllIIIIl[lIIIIIllllIIIIl]);
            ++lIIIIIllllIIIIl;
            "".length();
            if (((" ".length() << (0x32 ^ 0x35) ^ 131 + 137 - 185 + 56) << (" ".length() << " ".length()) & (((0x19 ^ 0x16) << " ".length() ^ (0xA1 ^ 0xB4)) << (" ".length() << " ".length()) ^ -" ".length())) <= 0) continue;
            return 0L;
        }
        return (long)var1_1;
    }

    public static void main(String[] stringArray) {
        int llIlllIlllIIIIl;
        Scanner lIllllIlllIIIIl = new Scanner(System.in);
        int IIllllIlllIIIIl = lIllllIlllIIIIl.nextInt();
        if (Main.IIlIlIIlIl(IIllllIlllIIIIl + (llIlllIlllIIIIl = lIllllIlllIIIIl.nextInt()), IIllllIlllIIIIl - llIlllIlllIIIIl) && Main.IIlIlIIlIl(IIllllIlllIIIIl - llIlllIlllIIIIl, IIllllIlllIIIIl * llIlllIlllIIIIl)) {
            System.out.println(IIllllIlllIIIIl + llIlllIlllIIIIl);
            "".length();
            if ("   ".length() == " ".length() << (" ".length() << " ".length())) {
                return;
            }
        } else if (Main.IIlIlIIlIl(IIllllIlllIIIIl + llIlllIlllIIIIl, IIllllIlllIIIIl * llIlllIlllIIIIl) && Main.IIlIlIIlIl(IIllllIlllIIIIl * llIlllIlllIIIIl, IIllllIlllIIIIl - llIlllIlllIIIIl)) {
            System.out.println(IIllllIlllIIIIl + llIlllIlllIIIIl);
            "".length();
            if (" ".length() << " ".length() != " ".length() << " ".length()) {
                return;
            }
        } else if (Main.IIlIlIIlIl(IIllllIlllIIIIl - llIlllIlllIIIIl, IIllllIlllIIIIl + llIlllIlllIIIIl) && Main.IIlIlIIlIl(IIllllIlllIIIIl + llIlllIlllIIIIl, IIllllIlllIIIIl * llIlllIlllIIIIl)) {
            System.out.println(IIllllIlllIIIIl - llIlllIlllIIIIl);
            "".length();
            if ((((0xC ^ 0x35) << (" ".length() << " ".length()) ^ 151 + 75 - 78 + 13) & (171 + 154 - 99 + 5 ^ (0xDC ^ 0x8D) << " ".length() ^ -" ".length())) < -" ".length()) {
                return;
            }
        } else if (Main.IIlIlIIlIl(IIllllIlllIIIIl - llIlllIlllIIIIl, IIllllIlllIIIIl * llIlllIlllIIIIl) && Main.IIlIlIIlIl(IIllllIlllIIIIl * llIlllIlllIIIIl, IIllllIlllIIIIl + llIlllIlllIIIIl)) {
            System.out.println(IIllllIlllIIIIl - llIlllIlllIIIIl);
            "".length();
            if (null != null) {
                return;
            }
        } else if (Main.IIlIlIIlIl(IIllllIlllIIIIl * llIlllIlllIIIIl, IIllllIlllIIIIl + llIlllIlllIIIIl) && Main.IIlIlIIlIl(IIllllIlllIIIIl + llIlllIlllIIIIl, IIllllIlllIIIIl - llIlllIlllIIIIl)) {
            System.out.println(IIllllIlllIIIIl * llIlllIlllIIIIl);
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        } else if (Main.IIlIlIIlIl(IIllllIlllIIIIl * llIlllIlllIIIIl, IIllllIlllIIIIl - llIlllIlllIIIIl) && Main.IIlIlIIlIl(IIllllIlllIIIIl - llIlllIlllIIIIl, IIllllIlllIIIIl + llIlllIlllIIIIl)) {
            System.out.println(IIllllIlllIIIIl * llIlllIlllIIIIl);
        }
    }

    static {
        Main.lIllIIIlIl();
    }

    private static void lIllIIIlIl() {
        IIIlIIll = new int[4];
        Main.IIIlIIll[0] = " ".length() << " ".length();
        Main.IIIlIIll[1] = " ".length();
        Main.IIIlIIll[2] = ((0x17 ^ 0x1E) << " ".length() ^ (0x15 ^ 0xE)) << " ".length() & (((0x46 ^ 0x4D) << "   ".length() ^ (0x49 ^ 0x18)) << " ".length() ^ -" ".length());
        Main.IIIlIIll[3] = "   ".length();
    }

    private static boolean llIIlIIlIl(int n, int n2) {
        return n == n2;
    }

    private static boolean IIlIlIIlIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IllIlIIlIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIIlIIlIl(int n) {
        return n != 0;
    }

    private static boolean llllIIIlIl(int n) {
        return n == 0;
    }

    private static boolean lIlIlIIlIl(int n) {
        return n <= 0;
    }

    private static int IlllIIIlIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static int IIIIlIIlIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static int IlIIlIIlIl(double d, double d2) {
        return d == d2 ? 0 : (d < d2 ? -1 : 1);
    }
}

