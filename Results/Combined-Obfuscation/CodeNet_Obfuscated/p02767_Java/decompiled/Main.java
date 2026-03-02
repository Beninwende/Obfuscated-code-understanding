/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Main {
    FastScanner in;
    PrintWriter out;
    int MOD = IIIlllllIl[0];
    private static int[] IIIlllllIl;

    public Main() {
        Main llllIIIlIIlllll;
    }

    /*
     * WARNING - void declaration
     */
    long ceil(long IIllIIIlIIlllll, long llIlIIIlIIlllll) {
        void var3_2;
        return (IIllIIIlIIlllll + var3_2 - 1L) / var3_2;
    }

    long gcd(long IllIIIIlIIlllll, long lIlIIIIlIIlllll) {
        long l;
        if (Main.IIIIllIlIlIl(Main.llllIlIlIlIl(lIlIIIIlIIlllll, 0L))) {
            l = IllIIIIlIIlllll;
            "".length();
            if (" ".length() << (" ".length() << " ".length()) < " ".length() << " ".length()) {
                return 0L;
            }
        } else {
            Main lllIIIIlIIlllll;
            l = lllIIIIlIIlllll.gcd(lIlIIIIlIIlllll, IllIIIIlIIlllll % lIlIIIIlIIlllll);
        }
        return l;
    }

    /*
     * WARNING - void declaration
     */
    long lcm(long IIIIIIIlIIlllll, long lllllllIIIlllll) {
        void var3_2;
        void var1_1;
        return IIIIIIIlIIlllll / this.gcd((long)var1_1, (long)var3_2) * var3_2;
    }

    void solve() {
        Main lllIlllIIIlllll;
        int IllIlllIIIlllll = lllIlllIIIlllll.in.nextInt();
        int[] lIlIlllIIIlllll = lllIlllIIIlllll.in.nextIntArray(IllIlllIIIlllll);
        long IIlIlllIIIlllll = Long.MAX_VALUE;
        int llIIlllIIIlllll = IIIlllllIl[1];
        while (Main.lIIIllIlIlIl(llIIlllIIIlllll, IIIlllllIl[2])) {
            long IlIIlllIIIlllll = 0L;
            int lIIIlllIIIlllll = IIIlllllIl[3];
            while (Main.IlIIllIlIlIl(lIIIlllIIIlllll, IllIlllIIIlllll)) {
                IlIIlllIIIlllll += (long)((lIlIlllIIIlllll[lIIIlllIIIlllll] - llIIlllIIIlllll) * (lIlIlllIIIlllll[lIIIlllIIIlllll] - llIIlllIIIlllll));
                ++lIIIlllIIIlllll;
                "".length();
                if (null == null) continue;
                return;
            }
            IIlIlllIIIlllll = Math.min(IIlIlllIIIlllll, IlIIlllIIIlllll);
            ++llIIlllIIIlllll;
            "".length();
            if (" ".length() < "   ".length()) continue;
            return;
        }
        lllIlllIIIlllll.out.println(IIlIlllIIIlllll);
    }

    public static void main(String[] stringArray) {
        new Main().m();
    }

    private void m() {
        Main llllIllIIIlllll;
        llllIllIIIlllll.in = new FastScanner(System.in);
        llllIllIIIlllll.out = new PrintWriter(System.out);
        llllIllIIIlllll.solve();
        llllIllIIIlllll.out.flush();
        llllIllIIIlllll.in.close();
        llllIllIIIlllll.out.close();
    }

    static {
        Main.IlllIlIlIlIl();
    }

    private static void IlllIlIlIlIl() {
        IIIlllllIl = new int[4];
        Main.IIIlllllIl[0] = 138347373 + 362949976 - 312356275 + 428088067 + (66663062 + 45075643 - 54068771 + 52145865 << " ".length()) - (240163104 + 134636954 - 115809838 + 99617751) + (11485392 + 173015305 - -8846395 + 328600147);
        Main.IIIlllllIl[1] = " ".length();
        Main.IIIlllllIl[2] = (0xE1 ^ 0xBC ^ (0x85 ^ 0x94) << (" ".length() << " ".length())) << (" ".length() << " ".length());
        Main.IIIlllllIl[3] = (0x2B ^ 0x32) & ~(0x18 ^ 1);
    }

    private static boolean IlIIllIlIlIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIIllIlIlIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean IIIIllIlIlIl(int n) {
        return n == 0;
    }

    private static int llllIlIlIlIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    static class FastScanner {
        private Reader input;
        private static String[] lIIlllllIl;
        private static int[] IlIlllllIl;

        public FastScanner() {
            llIIIllIIIlllll(System.in);
            FastScanner llIIIllIIIlllll;
        }

        /*
         * WARNING - void declaration
         */
        public FastScanner(InputStream lllllIlIIIlllll) {
            void var1_1;
            FastScanner IIIIIllIIIlllll;
            this.input = new BufferedReader(new InputStreamReader((InputStream)var1_1));
        }

        public void close() {
            try {
                FastScanner IIlllIlIIIlllll;
                IIlllIlIIIlllll.input.close();
                "".length();
            }
            catch (IOException llIllIlIIIlllll) {
                llIllIlIIIlllll.printStackTrace();
            }
            if (-" ".length() < -" ".length()) {
                return;
            }
        }

        public int nextInt() {
            FastScanner lIIllIlIIIlllll;
            return (int)lIIllIlIIIlllll.nextLong();
        }

        public long nextLong() {
            try {
                FastScanner IIlIlIlIIIlllll;
                int llIIlIlIIIlllll = IlIlllllIl[0];
                int IlIIlIlIIIlllll = IIlIlIlIIIlllll.input.read();
                while ((!FastScanner.IllIllIlIlIl(IlIIlIlIIIlllll, IlIlllllIl[1]) || FastScanner.lllIllIlIlIl(IlIlllllIl[2], IlIIlIlIIIlllll)) && FastScanner.IIIlllIlIlIl(IlIIlIlIIIlllll, IlIlllllIl[3]) && FastScanner.IIIlllIlIlIl(IlIIlIlIIIlllll, IlIlllllIl[4])) {
                    IlIIlIlIIIlllll = IIlIlIlIIIlllll.input.read();
                    "".length();
                    if (("   ".length() & ~"   ".length()) == 0) continue;
                    return 0L;
                }
                if (FastScanner.lIIlllIlIlIl(IlIIlIlIIIlllll, IlIlllllIl[3])) {
                    llIIlIlIIIlllll = IlIlllllIl[5];
                    IlIIlIlIIIlllll = IIlIlIlIIIlllll.input.read();
                    "".length();
                    if ("   ".length() <= " ".length()) {
                        return 0L;
                    }
                } else if (FastScanner.lIIlllIlIlIl(IlIIlIlIIIlllll, IlIlllllIl[4])) {
                    IlIIlIlIIIlllll = IIlIlIlIIIlllll.input.read();
                }
                long lIIIlIlIIIlllll = IlIIlIlIIIlllll - IlIlllllIl[1];
                do {
                    if (!FastScanner.IllIllIlIlIl(IlIIlIlIIIlllll = IIlIlIlIIIlllll.input.read(), IlIlllllIl[1]) || FastScanner.lllIllIlIlIl(IlIlllllIl[2], IlIIlIlIIIlllll)) {
                        return lIIIlIlIIIlllll * (long)llIIlIlIIIlllll;
                    }
                    lIIIlIlIIIlllll *= 10L;
                    lIIIlIlIIIlllll += (long)(IlIIlIlIIIlllll - IlIlllllIl[1]);
                    "".length();
                } while (((0x54 ^ 0x75) & ~(0xA9 ^ 0x88)) == 0);
                return 0L;
            }
            catch (IOException llIIlIlIIIlllll) {
                llIIlIlIIIlllll.printStackTrace();
                return -1L;
            }
        }

        public double nextDouble() {
            try {
                FastScanner llIlIIlIIIlllll;
                double IlIlIIlIIIlllll = 1.0;
                int lIIlIIlIIIlllll = llIlIIlIIIlllll.input.read();
                while ((!FastScanner.IllIllIlIlIl(lIIlIIlIIIlllll, IlIlllllIl[1]) || FastScanner.lllIllIlIlIl(IlIlllllIl[2], lIIlIIlIIIlllll)) && FastScanner.IIIlllIlIlIl(lIIlIIlIIIlllll, IlIlllllIl[3]) && FastScanner.IIIlllIlIlIl(lIIlIIlIIIlllll, IlIlllllIl[4])) {
                    lIIlIIlIIIlllll = llIlIIlIIIlllll.input.read();
                    "".length();
                    if ((((0x87 ^ 0x8A) << " ".length() ^ " ".length()) & (" ".length() << (" ".length() << " ".length()) ^ (0xB3 ^ 0xAC) ^ -" ".length())) < "   ".length()) continue;
                    return 0.0;
                }
                if (FastScanner.lIIlllIlIlIl(lIIlIIlIIIlllll, IlIlllllIl[3])) {
                    IlIlIIlIIIlllll = -1.0;
                    lIIlIIlIIIlllll = llIlIIlIIIlllll.input.read();
                    "".length();
                    if (-"  ".length() >= 0) {
                        return 0.0;
                    }
                } else if (FastScanner.lIIlllIlIlIl(lIIlIIlIIIlllll, IlIlllllIl[4])) {
                    lIIlIIlIIIlllll = llIlIIlIIIlllll.input.read();
                }
                double IIIlIIlIIIlllll = lIIlIIlIIIlllll - IlIlllllIl[1];
                while (FastScanner.IllIllIlIlIl(lIIlIIlIIIlllll = llIlIIlIIIlllll.input.read(), IlIlllllIl[1])) {
                    if (FastScanner.lllIllIlIlIl(IlIlllllIl[2], lIIlIIlIIIlllll)) {
                        "".length();
                        if ((((0x68 ^ 0x6D) << " ".length() ^ (0xB6 ^ 0x85)) & (0xC5 ^ 0x9C ^ "   ".length() << (4 ^ 1) ^ -" ".length())) >= 0) break;
                        return 0.0;
                    }
                    IIIlIIlIIIlllll *= 10.0;
                    IIIlIIlIIIlllll += (double)(lIIlIIlIIIlllll - IlIlllllIl[1]);
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) > " ".length() << " ".length()) continue;
                    return 0.0;
                }
                if (FastScanner.IIIlllIlIlIl(lIIlIIlIIIlllll, IlIlllllIl[6])) {
                    return IlIlIIlIIIlllll * IIIlIIlIIIlllll;
                }
                double lllIIIlIIIlllll = 1.0;
                lIIlIIlIIIlllll = llIlIIlIIIlllll.input.read();
                while (FastScanner.IlIlllIlIlIl(IlIlllllIl[1], lIIlIIlIIIlllll) && FastScanner.IlIlllIlIlIl(lIIlIIlIIIlllll, IlIlllllIl[2])) {
                    IIIlIIlIIIlllll *= 10.0;
                    IIIlIIlIIIlllll += (double)(lIIlIIlIIIlllll - IlIlllllIl[1]);
                    lllIIIlIIIlllll *= 10.0;
                    lIIlIIlIIIlllll = llIlIIlIIIlllll.input.read();
                    "".length();
                    if (null == null) continue;
                    return 0.0;
                }
                return IlIlIIlIIIlllll * IIIlIIlIIIlllll / lllIIIlIIIlllll;
            }
            catch (IOException IlIlIIlIIIlllll) {
                IlIlIIlIIIlllll.printStackTrace();
                return Double.NaN;
            }
        }

        public char nextChar() {
            try {
                FastScanner IIlIIIlIIIlllll;
                int llIIIIlIIIlllll = IIlIIIlIIIlllll.input.read();
                while (FastScanner.llIlllIlIlIl(Character.isWhitespace(llIIIIlIIIlllll) ? 1 : 0)) {
                    llIIIIlIIIlllll = IIlIIIlIIIlllll.input.read();
                    "".length();
                    if (((0xD0 ^ 0xC3) << (" ".length() << " ".length()) & ~((0x32 ^ 0x21) << (" ".length() << " ".length()))) == 0) continue;
                    return (char)((0x9F ^ 0x90) << " ".length() & ~((0x9A ^ 0x95) << " ".length()));
                }
                return (char)llIIIIlIIIlllll;
            }
            catch (IOException llIIIIlIIIlllll) {
                llIIIIlIIIlllll.printStackTrace();
                return IlIlllllIl[7];
            }
        }

        public String nextStr() {
            try {
                FastScanner llllllIIIIlllll;
                StringBuilder IlllllIIIIlllll = new StringBuilder();
                int lIllllIIIIlllll = llllllIIIIlllll.input.read();
                while (FastScanner.llIlllIlIlIl(Character.isWhitespace(lIllllIIIIlllll) ? 1 : 0)) {
                    lIllllIIIIlllll = llllllIIIIlllll.input.read();
                    "".length();
                    if (null == null) continue;
                    return null;
                }
                while (FastScanner.IIIlllIlIlIl(lIllllIIIIlllll, IlIlllllIl[5]) && FastScanner.IIllllIlIlIl(Character.isWhitespace(lIllllIIIIlllll) ? 1 : 0)) {
                    IlllllIIIIlllll.append((char)lIllllIIIIlllll);
                    "".length();
                    lIllllIIIIlllll = llllllIIIIlllll.input.read();
                    "".length();
                    if (" ".length() << " ".length() > 0) continue;
                    return null;
                }
                return String.valueOf(IlllllIIIIlllll);
            }
            catch (IOException IlllllIIIIlllll) {
                IlllllIIIIlllll.printStackTrace();
                return lIIlllllIl[IlIlllllIl[7]];
            }
        }

        public String nextLine() {
            try {
                FastScanner lIIlllIIIIlllll;
                StringBuilder IIIlllIIIIlllll = new StringBuilder();
                int lllIllIIIIlllll = lIIlllIIIIlllll.input.read();
                while (FastScanner.IIIlllIlIlIl(lllIllIIIIlllll, IlIlllllIl[5]) && FastScanner.IIIlllIlIlIl(lllIllIIIIlllll, IlIlllllIl[8])) {
                    IIIlllIIIIlllll.append((char)lllIllIIIIlllll);
                    "".length();
                    lllIllIIIIlllll = lIIlllIIIIlllll.input.read();
                    "".length();
                    if (-"   ".length() <= 0) continue;
                    return null;
                }
                return String.valueOf(IIIlllIIIIlllll);
            }
            catch (IOException IIIlllIIIIlllll) {
                IIIlllIIIIlllll.printStackTrace();
                return lIIlllllIl[IlIlllllIl[0]];
            }
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray(int lIIIllIIIIlllll) {
            void var2_2;
            int[] IIIIllIIIIlllll = new int[lIIIllIIIIlllll];
            int llllIlIIIIlllll = IlIlllllIl[7];
            while (FastScanner.lllIllIlIlIl(llllIlIIIIlllll, lIIIllIIIIlllll)) {
                FastScanner IlIIllIIIIlllll;
                IIIIllIIIIlllll[llllIlIIIIlllll] = IlIIllIIIIlllll.nextInt();
                ++llllIlIIIIlllll;
                "".length();
                if (" ".length() << (" ".length() << " ".length()) >= 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArrayDec(int lIIlIlIIIIlllll) {
            void var2_2;
            int[] IIIlIlIIIIlllll = new int[lIIlIlIIIIlllll];
            int lllIIlIIIIlllll = IlIlllllIl[7];
            while (FastScanner.lllIllIlIlIl(lllIIlIIIIlllll, lIIlIlIIIIlllll)) {
                FastScanner IlIlIlIIIIlllll;
                IIIlIlIIIIlllll[lllIIlIIIIlllll] = IlIlIlIIIIlllll.nextInt() - IlIlllllIl[0];
                ++lllIIlIIIIlllll;
                "".length();
                if (" ".length() << (" ".length() << " ".length()) > (((0xAC ^ 0xAB) << (" ".length() << " ".length()) ^ (0x87 ^ 0xC6)) & ((0x53 ^ 0x22) << " ".length() ^ 144 + 46 - 82 + 83 ^ -" ".length()))) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray1Index(int lIIIIlIIIIlllll) {
            void var2_2;
            int[] IIIIIlIIIIlllll = new int[lIIIIlIIIIlllll + IlIlllllIl[0]];
            int lllllIIIIIlllll = IlIlllllIl[7];
            while (FastScanner.lllIllIlIlIl(lllllIIIIIlllll, lIIIIlIIIIlllll)) {
                FastScanner IlIIIlIIIIlllll;
                IIIIIlIIIIlllll[lllllIIIIIlllll + FastScanner.IlIlllllIl[0]] = IlIIIlIIIIlllll.nextInt();
                ++lllllIIIIIlllll;
                "".length();
                if (null == null) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray(int lIIllIIIIIlllll) {
            void var2_2;
            long[] IIIllIIIIIlllll = new long[lIIllIIIIIlllll];
            int lllIlIIIIIlllll = IlIlllllIl[7];
            while (FastScanner.lllIllIlIlIl(lllIlIIIIIlllll, lIIllIIIIIlllll)) {
                FastScanner IlIllIIIIIlllll;
                IIIllIIIIIlllll[lllIlIIIIIlllll] = IlIllIIIIIlllll.nextLong();
                ++lllIlIIIIIlllll;
                "".length();
                if (-" ".length() == -" ".length()) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArrayDec(int lIIIlIIIIIlllll) {
            void var2_2;
            long[] IIIIlIIIIIlllll = new long[lIIIlIIIIIlllll];
            int llllIIIIIIlllll = IlIlllllIl[7];
            while (FastScanner.lllIllIlIlIl(llllIIIIIIlllll, lIIIlIIIIIlllll)) {
                FastScanner IlIIlIIIIIlllll;
                IIIIlIIIIIlllll[llllIIIIIIlllll] = IlIIlIIIIIlllll.nextLong() - 1L;
                ++llllIIIIIIlllll;
                "".length();
                if (((0xF ^ 0x1A) << " ".length() & ~((0x12 ^ 7) << " ".length())) < " ".length()) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray1Index(int lIIlIIIIIIlllll) {
            void var2_2;
            long[] IIIlIIIIIIlllll = new long[lIIlIIIIIIlllll + IlIlllllIl[0]];
            int lllIIIIIIIlllll = IlIlllllIl[7];
            while (FastScanner.lllIllIlIlIl(lllIIIIIIIlllll, lIIlIIIIIIlllll)) {
                FastScanner IlIlIIIIIIlllll;
                IIIlIIIIIIlllll[lllIIIIIIIlllll + FastScanner.IlIlllllIl[0]] = IlIlIIIIIIlllll.nextLong();
                ++lllIIIIIIIlllll;
                "".length();
                if ("   ".length() > 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public double[] nextDoubleArray(int lIIIIIIIIIlllll) {
            void var2_2;
            double[] IIIIIIIIIIlllll = new double[lIIIIIIIIIlllll];
            int llllllllllIllll = IlIlllllIl[7];
            while (FastScanner.lllIllIlIlIl(llllllllllIllll, lIIIIIIIIIlllll)) {
                FastScanner IlIIIIIIIIlllll;
                IIIIIIIIIIlllll[llllllllllIllll] = IlIIIIIIIIlllll.nextDouble();
                ++llllllllllIllll;
                "".length();
                if ("   ".length() > 0) continue;
                return null;
            }
            return var2_2;
        }

        static {
            FastScanner.lIlIllIlIlIl();
            FastScanner.IIlIllIlIlIl();
        }

        private static void IIlIllIlIlIl() {
            lIIlllllIl = new String[IlIlllllIl[9]];
            FastScanner.lIIlllllIl[FastScanner.IlIlllllIl[7]] = FastScanner.llIIllIlIlIl("", "sGaip");
            FastScanner.lIIlllllIl[FastScanner.IlIlllllIl[0]] = FastScanner.llIIllIlIlIl("", "HRuUr");
        }

        /*
         * Unable to fully structure code
         */
        private static String llIIllIlIlIl(String lIlIllllllIllll, String IIlIllllllIllll) {
            lIlIllllllIllll = new String(Base64.getDecoder().decode(lIlIllllllIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            llIIllllllIllll = new StringBuilder();
            IlIIllllllIllll = IIlIllllllIllll.toCharArray();
            lIIIllllllIllll = FastScanner.IlIlllllIl[7];
            lllIIlllllIllll = lIlIllllllIllll.toCharArray();
            IIIlIlllllIllll = lllIIlllllIllll.length;
            lIIlIlllllIllll = FastScanner.IlIlllllIl[7];
            "".length();
            if (" ".length() >= 0) ** GOTO lbl19
            return null;
lbl-1000:
            // 1 sources

            {
                IIIIllllllIllll = lllIIlllllIllll[lIIlIlllllIllll];
                llIIllllllIllll.append((char)(IIIIllllllIllll ^ IlIIllllllIllll[lIIIllllllIllll % IlIIllllllIllll.length]));
                "".length();
                ++lIIIllllllIllll;
                ++lIIlIlllllIllll;
lbl19:
                // 2 sources

                ** while (!FastScanner.IllIllIlIlIl((int)lIIlIlllllIllll, (int)IIIlIlllllIllll))
            }
lbl20:
            // 1 sources

            return String.valueOf(llIIllllllIllll);
        }

        private static void lIlIllIlIlIl() {
            IlIlllllIl = new int[10];
            FastScanner.IlIlllllIl[0] = " ".length();
            FastScanner.IlIlllllIl[1] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.IlIlllllIl[2] = (0x8B ^ 0xA4) << (" ".length() << " ".length()) ^ 19 + 10 - -14 + 90;
            FastScanner.IlIlllllIl[3] = 0x98 ^ 0xB5;
            FastScanner.IlIlllllIl[4] = 0x1D ^ 0x42 ^ (0x50 ^ 0x4D) << (" ".length() << " ".length());
            FastScanner.IlIlllllIl[5] = -" ".length();
            FastScanner.IlIlllllIl[6] = (0x18 ^ 0xF) << " ".length();
            FastScanner.IlIlllllIl[7] = (5 ^ 0x24) << " ".length() & ~((0xA5 ^ 0x84) << " ".length());
            FastScanner.IlIlllllIl[8] = (0x1E ^ 0x1B) << " ".length();
            FastScanner.IlIlllllIl[9] = " ".length() << " ".length();
        }

        private static boolean lIIlllIlIlIl(int n, int n2) {
            return n == n2;
        }

        private static boolean IllIllIlIlIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean lllIllIlIlIl(int n, int n2) {
            return n < n2;
        }

        private static boolean IlIlllIlIlIl(int n, int n2) {
            return n <= n2;
        }

        private static boolean llIlllIlIlIl(int n) {
            return n != 0;
        }

        private static boolean IIllllIlIlIl(int n) {
            return n == 0;
        }

        private static boolean IIIlllIlIlIl(int n, int n2) {
            return n != n2;
        }
    }
}

