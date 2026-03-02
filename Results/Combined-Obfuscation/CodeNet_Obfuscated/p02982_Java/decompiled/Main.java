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
    FastScanner in;
    PrintWriter out;
    final int MOD = 1000000007;
    private static int[] IIIlllIIIl;

    public Main() {
        Main IIIIIlIlIllIl;
        IIIIIlIlIllIl.in = new FastScanner(IIIIIlIlIllIl, System.in);
        IIIIIlIlIllIl.out = new PrintWriter(System.out);
        this.MOD = IIIlllIIIl[0];
    }

    void solve() throws Exception {
        int IlIIlIIlIllIl;
        Main lllIlIIlIllIl;
        int IllIlIIlIllIl = lllIlIIlIllIl.in.nextInt();
        int lIlIlIIlIllIl = lllIlIIlIllIl.in.nextInt();
        int[][] IIlIlIIlIllIl = new int[IllIlIIlIllIl][lIlIlIIlIllIl];
        int llIIlIIlIllIl = IIIlllIIIl[1];
        while (Main.IlIllIlllll(llIIlIIlIllIl, IllIlIIlIllIl)) {
            IlIIlIIlIllIl = IIIlllIIIl[1];
            while (Main.IlIllIlllll(IlIIlIIlIllIl, lIlIlIIlIllIl)) {
                IIlIlIIlIllIl[llIIlIIlIllIl][IlIIlIIlIllIl] = lllIlIIlIllIl.in.nextInt();
                ++IlIIlIIlIllIl;
                "".length();
                if (-" ".length() < " ".length() << " ".length()) continue;
                return;
            }
            ++llIIlIIlIllIl;
            "".length();
            if (-" ".length() <= 0) continue;
            return;
        }
        llIIlIIlIllIl = IIIlllIIIl[1];
        IlIIlIIlIllIl = IIIlllIIIl[1];
        while (Main.IlIllIlllll(IlIIlIIlIllIl, IllIlIIlIllIl - IIIlllIIIl[2])) {
            int lIIIlIIlIllIl = IlIIlIIlIllIl + IIIlllIIIl[2];
            while (Main.IlIllIlllll(lIIIlIIlIllIl, IllIlIIlIllIl)) {
                long IIIIlIIlIllIl = lllIlIIlIllIl.calc(IIlIlIIlIllIl[IlIIlIIlIllIl], IIlIlIIlIllIl[lIIIlIIlIllIl]);
                if (Main.llIllIlllll(Main.lIIllIlllll(Math.sqrt(IIIIlIIlIllIl), (long)Math.sqrt(IIIIlIIlIllIl)))) {
                    ++llIIlIIlIllIl;
                }
                ++lIIIlIIlIllIl;
                "".length();
                if (-" ".length() < " ".length()) continue;
                return;
            }
            ++IlIIlIIlIllIl;
            "".length();
            if (" ".length() << " ".length() > " ".length()) continue;
            return;
        }
        lllIlIIlIllIl.out.println(llIIlIIlIllIl);
    }

    /*
     * WARNING - void declaration
     */
    long calc(int[] llIlIIIlIllIl, int[] IlIlIIIlIllIl) {
        void var3_3;
        long lIIlIIIlIllIl = 0L;
        int IIIlIIIlIllIl = IIIlllIIIl[1];
        while (Main.IlIllIlllll(IIIlIIIlIllIl, llIlIIIlIllIl.length)) {
            lIIlIIIlIllIl += (long)((llIlIIIlIllIl[IIIlIIIlIllIl] - IlIlIIIlIllIl[IIIlIIIlIllIl]) * (llIlIIIlIllIl[IIIlIIIlIllIl] - IlIlIIIlIllIl[IIIlIIIlIllIl]));
            ++IIIlIIIlIllIl;
            "".length();
            if ((" ".length() << (0x81 ^ 0x84) & ~(" ".length() << (0xB4 ^ 0xB1))) < " ".length()) continue;
            return 0L;
        }
        return (long)var3_3;
    }

    public static void main(String[] stringArray) throws Exception {
        new Main().m();
    }

    void m() throws Exception {
        Main IllIIIIlIllIl;
        IllIIIIlIllIl.solve();
        IllIIIIlIllIl.out.flush();
    }

    static {
        Main.IIIllIlllll();
    }

    private static void IIIllIlllll() {
        IIIlllIIIl = new int[3];
        Main.IIIlllIIIl[0] = (99316853 + 179293761 - 39750470 + 19341345 << " ".length()) + (55696513 + 46020023 - 2398 + 71806513) - (8739968 + 8618553 - 9771124 + 2834034 << ("   ".length() << " ".length())) + (466628724 + 49290289 - 300296762 + 272901730 << " ".length());
        Main.IIIlllIIIl[1] = ((0xED ^ 0xAE) << " ".length() ^ 67 + 26 - -4 + 40) << " ".length() & ((0xA0 ^ 0xBF ^ " ".length() << (" ".length() << (" ".length() << " ".length()))) << " ".length() ^ -" ".length());
        Main.IIIlllIIIl[2] = " ".length();
    }

    private static boolean IlIllIlllll(int n, int n2) {
        return n < n2;
    }

    private static boolean llIllIlllll(int n) {
        return n == 0;
    }

    private static int lIIllIlllll(double d, double d2) {
        return d == d2 ? 0 : (d > d2 ? 1 : -1);
    }

    class FastScanner {
        Reader input;
        private static String[] IlIlllIIIl;
        private static int[] llIlllIIIl;

        /*
         * WARNING - void declaration
         */
        FastScanner(Main llIllllIIllIl) {
            IIlllllIIllIl((Main)var1_1, System.in);
            void var1_1;
            FastScanner IIlllllIIllIl;
        }

        /*
         * WARNING - void declaration
         */
        FastScanner(Main main, InputStream lIlIlllIIllIl) {
            void var2_2;
            FastScanner IllIlllIIllIl;
            this.input = new BufferedReader(new InputStreamReader((InputStream)var2_2));
        }

        int nextInt() {
            FastScanner llIIlllIIllIl;
            return (int)llIIlllIIllIl.nextLong();
        }

        long nextLong() {
            try {
                FastScanner IlllIllIIllIl;
                int lIllIllIIllIl = llIlllIIIl[0];
                int IIllIllIIllIl = IlllIllIIllIl.input.read();
                while ((!FastScanner.llIIIllllll(IIllIllIIllIl, llIlllIIIl[1]) || FastScanner.IIlIIllllll(llIlllIIIl[2], IIllIllIIllIl)) && FastScanner.lIlIIllllll(IIllIllIIllIl, llIlllIIIl[3]) && FastScanner.lIlIIllllll(IIllIllIIllIl, llIlllIIIl[4])) {
                    IIllIllIIllIl = IlllIllIIllIl.input.read();
                    "".length();
                    if ("   ".length() > " ".length()) continue;
                    return 0L;
                }
                if (FastScanner.IllIIllllll(IIllIllIIllIl, llIlllIIIl[3])) {
                    lIllIllIIllIl = llIlllIIIl[5];
                    IIllIllIIllIl = IlllIllIIllIl.input.read();
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) < ("   ".length() << (" ".length() << (" ".length() << " ".length())) & ~("   ".length() << (" ".length() << (" ".length() << " ".length()))))) {
                        return 0L;
                    }
                } else if (FastScanner.IllIIllllll(IIllIllIIllIl, llIlllIIIl[4])) {
                    IIllIllIIllIl = IlllIllIIllIl.input.read();
                }
                long llIlIllIIllIl = IIllIllIIllIl - llIlllIIIl[1];
                do {
                    if (!FastScanner.llIIIllllll(IIllIllIIllIl = IlllIllIIllIl.input.read(), llIlllIIIl[1]) || FastScanner.IIlIIllllll(llIlllIIIl[2], IIllIllIIllIl)) {
                        return llIlIllIIllIl * (long)lIllIllIIllIl;
                    }
                    llIlIllIIllIl *= 10L;
                    llIlIllIIllIl += (long)(IIllIllIIllIl - llIlllIIIl[1]);
                    "".length();
                } while (" ".length() << (" ".length() << " ".length()) > "   ".length());
                return 0L;
            }
            catch (IOException lIllIllIIllIl) {
                lIllIllIIllIl.printStackTrace();
                return -1L;
            }
        }

        double nextDouble() {
            try {
                FastScanner lIlIIllIIllIl;
                double IIlIIllIIllIl = 1.0;
                int llIIIllIIllIl = lIlIIllIIllIl.input.read();
                while ((!FastScanner.llIIIllllll(llIIIllIIllIl, llIlllIIIl[1]) || FastScanner.IIlIIllllll(llIlllIIIl[2], llIIIllIIllIl)) && FastScanner.lIlIIllllll(llIIIllIIllIl, llIlllIIIl[3]) && FastScanner.lIlIIllllll(llIIIllIIllIl, llIlllIIIl[4])) {
                    llIIIllIIllIl = lIlIIllIIllIl.input.read();
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) > " ".length() << " ".length()) continue;
                    return 0.0;
                }
                if (FastScanner.IllIIllllll(llIIIllIIllIl, llIlllIIIl[3])) {
                    IIlIIllIIllIl = -1.0;
                    llIIIllIIllIl = lIlIIllIIllIl.input.read();
                    "".length();
                    if (((0xAF ^ 0xAA) << "   ".length() & ~((0x77 ^ 0x72) << "   ".length())) != 0) {
                        return 0.0;
                    }
                } else if (FastScanner.IllIIllllll(llIIIllIIllIl, llIlllIIIl[4])) {
                    llIIIllIIllIl = lIlIIllIIllIl.input.read();
                }
                double IlIIIllIIllIl = llIIIllIIllIl - llIlllIIIl[1];
                while (FastScanner.llIIIllllll(llIIIllIIllIl = lIlIIllIIllIl.input.read(), llIlllIIIl[1])) {
                    if (FastScanner.IIlIIllllll(llIlllIIIl[2], llIIIllIIllIl)) {
                        "".length();
                        if (" ".length() << (" ".length() << " ".length()) >= "   ".length()) break;
                        return 0.0;
                    }
                    IlIIIllIIllIl *= 10.0;
                    IlIIIllIIllIl += (double)(llIIIllIIllIl - llIlllIIIl[1]);
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) >= " ".length() << " ".length()) continue;
                    return 0.0;
                }
                if (FastScanner.lIlIIllllll(llIIIllIIllIl, llIlllIIIl[6])) {
                    return IIlIIllIIllIl * IlIIIllIIllIl;
                }
                double lIIIIllIIllIl = 1.0;
                llIIIllIIllIl = lIlIIllIIllIl.input.read();
                while (FastScanner.lllIIllllll(llIlllIIIl[1], llIIIllIIllIl) && FastScanner.lllIIllllll(llIIIllIIllIl, llIlllIIIl[2])) {
                    IlIIIllIIllIl *= 10.0;
                    IlIIIllIIllIl += (double)(llIIIllIIllIl - llIlllIIIl[1]);
                    lIIIIllIIllIl *= 10.0;
                    llIIIllIIllIl = lIlIIllIIllIl.input.read();
                    "".length();
                    if (-" ".length() == -" ".length()) continue;
                    return 0.0;
                }
                return IIlIIllIIllIl * IlIIIllIIllIl / lIIIIllIIllIl;
            }
            catch (IOException IIlIIllIIllIl) {
                IIlIIllIIllIl.printStackTrace();
                return Double.NaN;
            }
        }

        char nextChar() {
            try {
                FastScanner IllllIlIIllIl;
                int lIlllIlIIllIl = IllllIlIIllIl.input.read();
                while (FastScanner.IIIlIllllll(Character.isWhitespace(lIlllIlIIllIl) ? 1 : 0)) {
                    lIlllIlIIllIl = IllllIlIIllIl.input.read();
                    "".length();
                    if (-" ".length() < " ".length() << " ".length()) continue;
                    return (char)((0x2D ^ 0x62 ^ (0x62 ^ 0x47) << " ".length()) & (0xC5 ^ 0x96 ^ (0x5E ^ 0x75) << " ".length() ^ -" ".length()));
                }
                return (char)lIlllIlIIllIl;
            }
            catch (IOException lIlllIlIIllIl) {
                lIlllIlIIllIl.printStackTrace();
                return llIlllIIIl[7];
            }
        }

        String nextStr() {
            try {
                FastScanner lIIllIlIIllIl;
                StringBuilder IIIllIlIIllIl = new StringBuilder();
                int lllIlIlIIllIl = lIIllIlIIllIl.input.read();
                while (FastScanner.IIIlIllllll(Character.isWhitespace(lllIlIlIIllIl) ? 1 : 0)) {
                    lllIlIlIIllIl = lIIllIlIIllIl.input.read();
                    "".length();
                    if (null == null) continue;
                    return null;
                }
                while (FastScanner.lIlIIllllll(lllIlIlIIllIl, llIlllIIIl[5]) && FastScanner.lIIlIllllll(Character.isWhitespace(lllIlIlIIllIl) ? 1 : 0)) {
                    IIIllIlIIllIl.append((char)lllIlIlIIllIl);
                    "".length();
                    lllIlIlIIllIl = lIIllIlIIllIl.input.read();
                    "".length();
                    if (null == null) continue;
                    return null;
                }
                return String.valueOf(IIIllIlIIllIl);
            }
            catch (IOException IIIllIlIIllIl) {
                IIIllIlIIllIl.printStackTrace();
                return IlIlllIIIl[llIlllIIIl[7]];
            }
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray(int lIIIlIlIIllIl) {
            void var2_2;
            int[] IIIIlIlIIllIl = new int[lIIIlIlIIllIl];
            int llllIIlIIllIl = llIlllIIIl[7];
            while (FastScanner.IIlIIllllll(llllIIlIIllIl, lIIIlIlIIllIl)) {
                FastScanner IlIIlIlIIllIl;
                IIIIlIlIIllIl[llllIIlIIllIl] = IlIIlIlIIllIl.nextInt();
                ++llllIIlIIllIl;
                "".length();
                if (" ".length() << (" ".length() << " ".length()) >= 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArrayDec(int lIIlIIlIIllIl) {
            void var2_2;
            int[] IIIlIIlIIllIl = new int[lIIlIIlIIllIl];
            int lllIIIlIIllIl = llIlllIIIl[7];
            while (FastScanner.IIlIIllllll(lllIIIlIIllIl, lIIlIIlIIllIl)) {
                FastScanner IlIlIIlIIllIl;
                IIIlIIlIIllIl[lllIIIlIIllIl] = IlIlIIlIIllIl.nextInt() - llIlllIIIl[0];
                ++lllIIIlIIllIl;
                "".length();
                if (-"  ".length() < 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray1Index(int lIIIIIlIIllIl) {
            void var2_2;
            int[] IIIIIIlIIllIl = new int[lIIIIIlIIllIl + llIlllIIIl[0]];
            int llllllIIIllIl = llIlllIIIl[7];
            while (FastScanner.IIlIIllllll(llllllIIIllIl, lIIIIIlIIllIl)) {
                FastScanner IlIIIIlIIllIl;
                IIIIIIlIIllIl[llllllIIIllIl + FastScanner.llIlllIIIl[0]] = IlIIIIlIIllIl.nextInt();
                ++llllllIIIllIl;
                "".length();
                if (-"   ".length() <= 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray(int lIIlllIIIllIl) {
            void var2_2;
            long[] IIIlllIIIllIl = new long[lIIlllIIIllIl];
            int lllIllIIIllIl = llIlllIIIl[7];
            while (FastScanner.IIlIIllllll(lllIllIIIllIl, lIIlllIIIllIl)) {
                FastScanner IlIlllIIIllIl;
                IIIlllIIIllIl[lllIllIIIllIl] = IlIlllIIIllIl.nextLong();
                ++lllIllIIIllIl;
                "".length();
                if (null == null) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArrayDec(int lIIIllIIIllIl) {
            void var2_2;
            long[] IIIIllIIIllIl = new long[lIIIllIIIllIl];
            int llllIlIIIllIl = llIlllIIIl[7];
            while (FastScanner.IIlIIllllll(llllIlIIIllIl, lIIIllIIIllIl)) {
                FastScanner IlIIllIIIllIl;
                IIIIllIIIllIl[llllIlIIIllIl] = IlIIllIIIllIl.nextLong() - 1L;
                ++llllIlIIIllIl;
                "".length();
                if (((0x98 ^ 0xB1) << " ".length() ^ (0x57 ^ 0)) > 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray1Index(int lIIlIlIIIllIl) {
            void var2_2;
            long[] IIIlIlIIIllIl = new long[lIIlIlIIIllIl + llIlllIIIl[0]];
            int lllIIlIIIllIl = llIlllIIIl[7];
            while (FastScanner.IIlIIllllll(lllIIlIIIllIl, lIIlIlIIIllIl)) {
                FastScanner IlIlIlIIIllIl;
                IIIlIlIIIllIl[lllIIlIIIllIl + FastScanner.llIlllIIIl[0]] = IlIlIlIIIllIl.nextLong();
                ++lllIIlIIIllIl;
                "".length();
                if (" ".length() << " ".length() > 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public double[] nextDoubleArray(int lIIIIlIIIllIl) {
            void var2_2;
            double[] IIIIIlIIIllIl = new double[lIIIIlIIIllIl];
            int lllllIIIIllIl = llIlllIIIl[7];
            while (FastScanner.IIlIIllllll(lllllIIIIllIl, lIIIIlIIIllIl)) {
                FastScanner IlIIIlIIIllIl;
                IIIIIlIIIllIl[lllllIIIIllIl] = IlIIIlIIIllIl.nextDouble();
                ++lllllIIIIllIl;
                "".length();
                if (((0xA0 ^ 0x93) & ~(0x2C ^ 0x1F)) >= 0) continue;
                return null;
            }
            return var2_2;
        }

        static {
            FastScanner.IlIIIllllll();
            FastScanner.IIIIIllllll();
        }

        private static void IIIIIllllll() {
            IlIlllIIIl = new String[llIlllIIIl[0]];
            FastScanner.IlIlllIIIl[FastScanner.llIlllIIIl[7]] = FastScanner.lllllIlllll("xpuo1uBTxHk=", "WSCsX");
        }

        private static String lllllIlllll(String IlIllIIIIllIl, String lIIllIIIIllIl) {
            try {
                SecretKeySpec IIIllIIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllIIIIllIl.getBytes(StandardCharsets.UTF_8)), llIlllIIIl[8]), "DES");
                Cipher lllIlIIIIllIl = Cipher.getInstance("DES");
                lllIlIIIIllIl.init(llIlllIIIl[9], IIIllIIIIllIl);
                return new String(lllIlIIIIllIl.doFinal(Base64.getDecoder().decode(IlIllIIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception IllIlIIIIllIl) {
                IllIlIIIIllIl.printStackTrace();
                return null;
            }
        }

        private static void IlIIIllllll() {
            llIlllIIIl = new int[10];
            FastScanner.llIlllIIIl[0] = " ".length();
            FastScanner.llIlllIIIl[1] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.llIlllIIIl[2] = 125 + 5 - 106 + 103 << " ".length() ^ 185 + 120 - 201 + 95;
            FastScanner.llIlllIIIl[3] = 0x12 ^ 0x39 ^ "   ".length() << " ".length();
            FastScanner.llIlllIIIl[4] = 0x1C ^ 0x37;
            FastScanner.llIlllIIIl[5] = -" ".length();
            FastScanner.llIlllIIIl[6] = (0x33 ^ 0x24) << " ".length();
            FastScanner.llIlllIIIl[7] = (0x74 ^ 0x43 ^ "   ".length() << (" ".length() << (" ".length() << " ".length()))) & (0xE ^ 0x3D ^ (0x2A ^ 0x27) << (" ".length() << " ".length()) ^ -" ".length());
            FastScanner.llIlllIIIl[8] = " ".length() << "   ".length();
            FastScanner.llIlllIIIl[9] = " ".length() << " ".length();
        }

        private static boolean IllIIllllll(int n, int n2) {
            return n == n2;
        }

        private static boolean llIIIllllll(int n, int n2) {
            return n >= n2;
        }

        private static boolean IIlIIllllll(int n, int n2) {
            return n < n2;
        }

        private static boolean lllIIllllll(int n, int n2) {
            return n <= n2;
        }

        private static boolean IIIlIllllll(int n) {
            return n != 0;
        }

        private static boolean lIIlIllllll(int n) {
            return n == 0;
        }

        private static boolean lIlIIllllll(int n, int n2) {
            return n != n2;
        }
    }
}

