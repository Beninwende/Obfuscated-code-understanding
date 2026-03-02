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
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private FastScanner in = new FastScanner(System.in);
    private PrintWriter out = new PrintWriter(System.out);
    final int MOD = IIlllIIIIl[0];
    private static int[] IIlllIIIIl;

    public Main() {
        Main lIIllllIllIll;
    }

    /*
     * WARNING - void declaration
     */
    long ceil(long IllIlllIllIll, long lIlIlllIllIll) {
        void var3_2;
        return (IllIlllIllIll + var3_2 - 1L) / var3_2;
    }

    void solve() throws Exception {
        Main IlllIllIllIll;
        int lIllIllIllIll = IlllIllIllIll.in.nextInt();
        long IIllIllIllIll = 0L;
        long llIlIllIllIll = 0L;
        int[] IlIlIllIllIll = new int[lIllIllIllIll];
        int lIIlIllIllIll = IIlllIIIIl[1];
        while (Main.lIIIIllIlll(lIIlIllIllIll, lIllIllIllIll)) {
            IlIlIllIllIll[lIIlIllIllIll] = IlllIllIllIll.in.nextInt();
            IIllIllIllIll += (long)IlIlIllIllIll[lIIlIllIllIll];
            llIlIllIllIll += (long)(IlIlIllIllIll[lIIlIllIllIll] * IlIlIllIllIll[lIIlIllIllIll]);
            ++lIIlIllIllIll;
            "".length();
            if (null == null) continue;
            return;
        }
        IlllIllIllIll.out.println((IIllIllIllIll * IIllIllIllIll - llIlIllIllIll) / 2L);
    }

    public static void main(String[] stringArray) throws Exception {
        new Main().m();
    }

    private void m() throws Exception {
        Main lllIIllIllIll;
        lllIIllIllIll.solve();
        lllIIllIllIll.out.flush();
    }

    static {
        Main.IIIIIllIlll();
    }

    private static void IIIIIllIlll() {
        IIlllIIIIl = new int[2];
        Main.IIlllIIIIl[0] = (66004549 + 84213605 - 60364499 + 867902 << " ".length()) + (68546776 + 123101287 - 158355380 + 123972050) - -(145437815 + 37672784 - 129731148 + 98408535) + (224005862 + 253792379 - 400280307 + 177234153 << " ".length());
        Main.IIlllIIIIl[1] = (0x91 ^ 0x94) & ~(0x53 ^ 0x56);
    }

    private static boolean lIIIIllIlll(int n, int n2) {
        return n < n2;
    }

    static class FastScanner {
        Reader input;
        private static String[] lIlllIIIIl;
        private static int[] IllllIIIIl;

        FastScanner() {
            lIIIIllIllIll(System.in);
            FastScanner lIIIIllIllIll;
        }

        /*
         * WARNING - void declaration
         */
        FastScanner(InputStream lIlllIlIllIll) {
            void var1_1;
            FastScanner IllllIlIllIll;
            this.input = new BufferedReader(new InputStreamReader((InputStream)var1_1));
        }

        int nextInt() {
            FastScanner llIllIlIllIll;
            return (int)llIllIlIllIll.nextLong();
        }

        long nextLong() {
            try {
                FastScanner IllIlIlIllIll;
                int lIlIlIlIllIll = IllllIIIIl[0];
                int IIlIlIlIllIll = IllIlIlIllIll.input.read();
                while ((!FastScanner.lIlIIllIlll(IIlIlIlIllIll, IllllIIIIl[1]) || FastScanner.IllIIllIlll(IllllIIIIl[2], IIlIlIlIllIll)) && FastScanner.lllIIllIlll(IIlIlIlIllIll, IllllIIIIl[3]) && FastScanner.lllIIllIlll(IIlIlIlIllIll, IllllIIIIl[4])) {
                    IIlIlIlIllIll = IllIlIlIllIll.input.read();
                    "".length();
                    if (((0x54 ^ 0x65) & ~(0x39 ^ 8)) <= " ".length() << " ".length()) continue;
                    return 0L;
                }
                if (FastScanner.IIIlIllIlll(IIlIlIlIllIll, IllllIIIIl[3])) {
                    lIlIlIlIllIll = IllllIIIIl[5];
                    IIlIlIlIllIll = IllIlIlIllIll.input.read();
                    "".length();
                    if ("   ".length() == " ".length() << (" ".length() << " ".length())) {
                        return 0L;
                    }
                } else if (FastScanner.IIIlIllIlll(IIlIlIlIllIll, IllllIIIIl[4])) {
                    IIlIlIlIllIll = IllIlIlIllIll.input.read();
                }
                long llIIlIlIllIll = IIlIlIlIllIll - IllllIIIIl[1];
                do {
                    if (!FastScanner.lIlIIllIlll(IIlIlIlIllIll = IllIlIlIllIll.input.read(), IllllIIIIl[1]) || FastScanner.IllIIllIlll(IllllIIIIl[2], IIlIlIlIllIll)) {
                        return llIIlIlIllIll * (long)lIlIlIlIllIll;
                    }
                    llIIlIlIllIll *= 10L;
                    llIIlIlIllIll += (long)(IIlIlIlIllIll - IllllIIIIl[1]);
                    "".length();
                } while (((0x4E ^ 0x41) << " ".length() & ~((0x2D ^ 0x22) << " ".length())) <= 0);
                return 0L;
            }
            catch (IOException lIlIlIlIllIll) {
                lIlIlIlIllIll.printStackTrace();
                return -1L;
            }
        }

        double nextDouble() {
            try {
                FastScanner lIllIIlIllIll;
                double IIllIIlIllIll = 1.0;
                int llIlIIlIllIll = lIllIIlIllIll.input.read();
                while ((!FastScanner.lIlIIllIlll(llIlIIlIllIll, IllllIIIIl[1]) || FastScanner.IllIIllIlll(IllllIIIIl[2], llIlIIlIllIll)) && FastScanner.lllIIllIlll(llIlIIlIllIll, IllllIIIIl[3]) && FastScanner.lllIIllIlll(llIlIIlIllIll, IllllIIIIl[4])) {
                    llIlIIlIllIll = lIllIIlIllIll.input.read();
                    "".length();
                    if ((" ".length() << (" ".length() << " ".length()) & (" ".length() << (" ".length() << " ".length()) ^ -" ".length())) == (((0xA2 ^ 0xB1) << (" ".length() << " ".length()) ^ (0x12 ^ 0x51)) & ((0xBE ^ 0x83) << " ".length() ^ (0xE2 ^ 0x97) ^ -" ".length()))) continue;
                    return 0.0;
                }
                if (FastScanner.IIIlIllIlll(llIlIIlIllIll, IllllIIIIl[3])) {
                    IIllIIlIllIll = -1.0;
                    llIlIIlIllIll = lIllIIlIllIll.input.read();
                    "".length();
                    if (-" ".length() >= 0) {
                        return 0.0;
                    }
                } else if (FastScanner.IIIlIllIlll(llIlIIlIllIll, IllllIIIIl[4])) {
                    llIlIIlIllIll = lIllIIlIllIll.input.read();
                }
                double IlIlIIlIllIll = llIlIIlIllIll - IllllIIIIl[1];
                while (FastScanner.lIlIIllIlll(llIlIIlIllIll = lIllIIlIllIll.input.read(), IllllIIIIl[1])) {
                    if (FastScanner.IllIIllIlll(IllllIIIIl[2], llIlIIlIllIll)) {
                        "".length();
                        if (" ".length() << (" ".length() << " ".length()) >= " ".length() << " ".length()) break;
                        return 0.0;
                    }
                    IlIlIIlIllIll *= 10.0;
                    IlIlIIlIllIll += (double)(llIlIIlIllIll - IllllIIIIl[1]);
                    "".length();
                    if ((((0xA4 ^ 0xA9) << (" ".length() << (" ".length() << " ".length())) ^ 54 + 11 - -43 + 89) << " ".length() & (((0xA1 ^ 0xAC) << (" ".length() << (" ".length() << " ".length())) ^ 47 + 89 - -20 + 41) << " ".length() ^ -" ".length())) > -" ".length()) continue;
                    return 0.0;
                }
                if (FastScanner.lllIIllIlll(llIlIIlIllIll, IllllIIIIl[6])) {
                    return IIllIIlIllIll * IlIlIIlIllIll;
                }
                double lIIlIIlIllIll = 1.0;
                llIlIIlIllIll = lIllIIlIllIll.input.read();
                while (FastScanner.lIIlIllIlll(IllllIIIIl[1], llIlIIlIllIll) && FastScanner.lIIlIllIlll(llIlIIlIllIll, IllllIIIIl[2])) {
                    IlIlIIlIllIll *= 10.0;
                    IlIlIIlIllIll += (double)(llIlIIlIllIll - IllllIIIIl[1]);
                    lIIlIIlIllIll *= 10.0;
                    llIlIIlIllIll = lIllIIlIllIll.input.read();
                    "".length();
                    if (" ".length() <= "   ".length()) continue;
                    return 0.0;
                }
                return IIllIIlIllIll * IlIlIIlIllIll / lIIlIIlIllIll;
            }
            catch (IOException IIllIIlIllIll) {
                IIllIIlIllIll.printStackTrace();
                return Double.NaN;
            }
        }

        char nextChar() {
            try {
                FastScanner IllIIIlIllIll;
                int lIlIIIlIllIll = IllIIIlIllIll.input.read();
                while (FastScanner.IlIlIllIlll(Character.isWhitespace(lIlIIIlIllIll) ? 1 : 0)) {
                    lIlIIIlIllIll = IllIIIlIllIll.input.read();
                    "".length();
                    if ("   ".length() >= 0) continue;
                    return (char)((0x99 ^ 0x9E ^ (0xB2 ^ 0xB5) << " ".length()) & ((0x26 ^ 0x37) << " ".length() ^ (0x85 ^ 0xAE) ^ -" ".length()));
                }
                return (char)lIlIIIlIllIll;
            }
            catch (IOException lIlIIIlIllIll) {
                lIlIIIlIllIll.printStackTrace();
                return IllllIIIIl[7];
            }
        }

        String nextStr() {
            try {
                FastScanner lIIIIIlIllIll;
                StringBuilder IIIIIIlIllIll = new StringBuilder();
                int llllllIIllIll = lIIIIIlIllIll.input.read();
                while (FastScanner.IlIlIllIlll(Character.isWhitespace(llllllIIllIll) ? 1 : 0)) {
                    llllllIIllIll = lIIIIIlIllIll.input.read();
                    "".length();
                    if (" ".length() << " ".length() > 0) continue;
                    return null;
                }
                while (FastScanner.lllIIllIlll(llllllIIllIll, IllllIIIIl[5]) && FastScanner.llIlIllIlll(Character.isWhitespace(llllllIIllIll) ? 1 : 0)) {
                    IIIIIIlIllIll.append((char)llllllIIllIll);
                    "".length();
                    llllllIIllIll = lIIIIIlIllIll.input.read();
                    "".length();
                    if (-" ".length() <= 0) continue;
                    return null;
                }
                return String.valueOf(IIIIIIlIllIll);
            }
            catch (IOException IIIIIIlIllIll) {
                IIIIIIlIllIll.printStackTrace();
                return lIlllIIIIl[IllllIIIIl[7]];
            }
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray(int lIIlllIIllIll) {
            void var2_2;
            int[] IIIlllIIllIll = new int[lIIlllIIllIll];
            int lllIllIIllIll = IllllIIIIl[7];
            while (FastScanner.IllIIllIlll(lllIllIIllIll, lIIlllIIllIll)) {
                FastScanner IlIlllIIllIll;
                IIIlllIIllIll[lllIllIIllIll] = IlIlllIIllIll.nextInt();
                ++lllIllIIllIll;
                "".length();
                if (-" ".length() <= 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArrayDec(int lIIIllIIllIll) {
            void var2_2;
            int[] IIIIllIIllIll = new int[lIIIllIIllIll];
            int llllIlIIllIll = IllllIIIIl[7];
            while (FastScanner.IllIIllIlll(llllIlIIllIll, lIIIllIIllIll)) {
                FastScanner IlIIllIIllIll;
                IIIIllIIllIll[llllIlIIllIll] = IlIIllIIllIll.nextInt() - IllllIIIIl[0];
                ++llllIlIIllIll;
                "".length();
                if (" ".length() << " ".length() != 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray1Index(int lIIlIlIIllIll) {
            void var2_2;
            int[] IIIlIlIIllIll = new int[lIIlIlIIllIll + IllllIIIIl[0]];
            int lllIIlIIllIll = IllllIIIIl[7];
            while (FastScanner.IllIIllIlll(lllIIlIIllIll, lIIlIlIIllIll)) {
                FastScanner IlIlIlIIllIll;
                IIIlIlIIllIll[lllIIlIIllIll + FastScanner.IllllIIIIl[0]] = IlIlIlIIllIll.nextInt();
                ++lllIIlIIllIll;
                "".length();
                if (null == null) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray(int lIIIIlIIllIll) {
            void var2_2;
            long[] IIIIIlIIllIll = new long[lIIIIlIIllIll];
            int lllllIIIllIll = IllllIIIIl[7];
            while (FastScanner.IllIIllIlll(lllllIIIllIll, lIIIIlIIllIll)) {
                FastScanner IlIIIlIIllIll;
                IIIIIlIIllIll[lllllIIIllIll] = IlIIIlIIllIll.nextLong();
                ++lllllIIIllIll;
                "".length();
                if (((0x7F ^ 0x62 ^ (0xB5 ^ 0xB0) << (" ".length() << " ".length())) << " ".length() & ((29 + 28 - -20 + 94 ^ (0xC9 ^ 0x98) << " ".length()) << " ".length() ^ -" ".length())) == 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArrayDec(int lIIllIIIllIll) {
            void var2_2;
            long[] IIIllIIIllIll = new long[lIIllIIIllIll];
            int lllIlIIIllIll = IllllIIIIl[7];
            while (FastScanner.IllIIllIlll(lllIlIIIllIll, lIIllIIIllIll)) {
                FastScanner IlIllIIIllIll;
                IIIllIIIllIll[lllIlIIIllIll] = IlIllIIIllIll.nextLong() - 1L;
                ++lllIlIIIllIll;
                "".length();
                if (null == null) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray1Index(int lIIIlIIIllIll) {
            void var2_2;
            long[] IIIIlIIIllIll = new long[lIIIlIIIllIll + IllllIIIIl[0]];
            int llllIIIIllIll = IllllIIIIl[7];
            while (FastScanner.IllIIllIlll(llllIIIIllIll, lIIIlIIIllIll)) {
                FastScanner IlIIlIIIllIll;
                IIIIlIIIllIll[llllIIIIllIll + FastScanner.IllllIIIIl[0]] = IlIIlIIIllIll.nextLong();
                ++llllIIIIllIll;
                "".length();
                if (-"  ".length() <= 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public double[] nextDoubleArray(int lIIlIIIIllIll) {
            void var2_2;
            double[] IIIlIIIIllIll = new double[lIIlIIIIllIll];
            int lllIIIIIllIll = IllllIIIIl[7];
            while (FastScanner.IllIIllIlll(lllIIIIIllIll, lIIlIIIIllIll)) {
                FastScanner IlIlIIIIllIll;
                IIIlIIIIllIll[lllIIIIIllIll] = IlIlIIIIllIll.nextDouble();
                ++lllIIIIIllIll;
                "".length();
                if (" ".length() < " ".length() << " ".length()) continue;
                return null;
            }
            return var2_2;
        }

        static {
            FastScanner.IIlIIllIlll();
            FastScanner.llIIIllIlll();
        }

        private static void llIIIllIlll() {
            lIlllIIIIl = new String[IllllIIIIl[0]];
            FastScanner.lIlllIIIIl[FastScanner.IllllIIIIl[7]] = FastScanner.IlIIIllIlll("HOWCJzqSJr4=", "XuOcX");
        }

        private static String IlIIIllIlll(String IlIIIIIIllIll, String lIIIIIIIllIll) {
            try {
                SecretKeySpec IIIIIIIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIIIIllIll.getBytes(StandardCharsets.UTF_8)), IllllIIIIl[8]), "DES");
                Cipher llllllllIlIll = Cipher.getInstance("DES");
                llllllllIlIll.init(IllllIIIIl[9], IIIIIIIIllIll);
                return new String(llllllllIlIll.doFinal(Base64.getDecoder().decode(IlIIIIIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception IlllllllIlIll) {
                IlllllllIlIll.printStackTrace();
                return null;
            }
        }

        private static void IIlIIllIlll() {
            IllllIIIIl = new int[10];
            FastScanner.IllllIIIIl[0] = " ".length();
            FastScanner.IllllIIIIl[1] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.IllllIIIIl[2] = 7 ^ 0x3E;
            FastScanner.IllllIIIIl[3] = 0xBD ^ 0x90;
            FastScanner.IllllIIIIl[4] = 0x48 ^ 0x43 ^ " ".length() << (0x41 ^ 0x44);
            FastScanner.IllllIIIIl[5] = -" ".length();
            FastScanner.IllllIIIIl[6] = (0xB ^ 0x1C ^ (0xC7 ^ 0xC2) << " ".length() & ~((0x35 ^ 0x30) << " ".length())) << " ".length();
            FastScanner.IllllIIIIl[7] = (149 + 26 - 66 + 56 ^ (0xF8 ^ 0xBF) << " ".length()) << " ".length() & ((0 ^ 0x1B ^ "   ".length() << (" ".length() << (" ".length() << " ".length()))) << " ".length() ^ -" ".length());
            FastScanner.IllllIIIIl[8] = " ".length() << "   ".length();
            FastScanner.IllllIIIIl[9] = " ".length() << " ".length();
        }

        private static boolean IIIlIllIlll(int n, int n2) {
            return n == n2;
        }

        private static boolean lIlIIllIlll(int n, int n2) {
            return n >= n2;
        }

        private static boolean IllIIllIlll(int n, int n2) {
            return n < n2;
        }

        private static boolean lIIlIllIlll(int n, int n2) {
            return n <= n2;
        }

        private static boolean IlIlIllIlll(int n) {
            return n != 0;
        }

        private static boolean llIlIllIlll(int n) {
            return n == 0;
        }

        private static boolean lllIIllIlll(int n, int n2) {
            return n != n2;
        }
    }
}

