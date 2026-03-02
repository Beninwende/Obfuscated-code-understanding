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
    final int MOD = 1000000007;
    private static String[] lllllIl;
    private static int[] IlIIIll;

    public Main() {
        Main lllIIlIIllllIIl;
        lllIIlIIllllIIl.in = new FastScanner(lllIIlIIllllIIl, System.in);
        lllIIlIIllllIIl.out = new PrintWriter(System.out);
        this.MOD = IlIIIll[0];
    }

    void printlnYN(boolean llIIIlIIllllIIl) {
        String string;
        Main IIlIIlIIllllIIl;
        PrintWriter printWriter = IIlIIlIIllllIIl.out;
        if (Main.lIlIIIlIl(llIIIlIIllllIIl ? 1 : 0)) {
            string = lllllIl[IlIIIll[1]];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) == 0) {
                return;
            }
        } else {
            string = lllllIl[IlIIIll[2]];
        }
        printWriter.println(string);
    }

    void solve() throws Exception {
        Main lIlllIIIllllIIl;
        int IIlllIIIllllIIl = lIlllIIIllllIIl.in.nextInt();
        int llIllIIIllllIIl = IlIIIll[1];
        int IlIllIIIllllIIl = IlIIIll[2];
        while (Main.lIIlIIlIl(IlIllIIIllllIIl, IIlllIIIllllIIl)) {
            String lIIllIIIllllIIl = "" + IlIllIIIllllIIl;
            if (Main.IlIlIIlIl(lIIllIIIllllIIl.length() % IlIIIll[3], IlIIIll[2])) {
                ++llIllIIIllllIIl;
            }
            ++IlIllIIIllllIIl;
            "".length();
            if ((8 ^ 0xD) > 0) continue;
            return;
        }
        lIlllIIIllllIIl.out.println(llIllIIIllllIIl);
    }

    public static void main(String[] stringArray) throws Exception {
        new Main().m();
    }

    void m() throws Exception {
        Main lllIlIIIllllIIl;
        lllIlIIIllllIIl.solve();
        lllIlIIIllllIIl.out.flush();
    }

    static {
        Main.llIIIIlIl();
        Main.IlIIIIlIl();
    }

    private static void IlIIIIlIl() {
        lllllIl = new String[IlIIIll[3]];
        Main.lllllIl[Main.IlIIIll[1]] = Main.llllllIIl("Dggq", "WmYfH");
        Main.lllllIl[Main.IlIIIll[2]] = Main.llllllIIl("HCU=", "RJfQe");
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String llllllIIl(String lIllIIIIllllIIl, String IIllIIIIllllIIl) {
        lIllIIIIllllIIl = new String(Base64.getDecoder().decode(lIllIIIIllllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlIIIIllllIIl = new StringBuilder();
        char[] IlIlIIIIllllIIl = IIllIIIIllllIIl.toCharArray();
        int lIIlIIIIllllIIl = IlIIIll[1];
        char[] llllllllIlllIIl = lIllIIIIllllIIl.toCharArray();
        int IIIIIIIIllllIIl = llllllllIlllIIl.length;
        int lIIIIIIIllllIIl = IlIIIll[1];
        "".length();
        while (!Main.IIllIIlIl(lIIIIIIIllllIIl, IIIIIIIIllllIIl)) {
            char IIIlIIIIllllIIl = llllllllIlllIIl[lIIIIIIIllllIIl];
            llIlIIIIllllIIl.append((char)(IIIlIIIIllllIIl ^ IlIlIIIIllllIIl[lIIlIIIIllllIIl % IlIlIIIIllllIIl.length]));
            "".length();
            ++lIIlIIIIllllIIl;
            ++lIIIIIIIllllIIl;
        }
        return String.valueOf(llIlIIIIllllIIl);
    }

    private static void llIIIIlIl() {
        IlIIIll = new int[4];
        Main.IlIIIll[0] = (14037000 + 18093223 - 32007090 + 19827426 << "   ".length()) + (61439236 + 18119161 - 0x5B33B3 + 34584699 << " ".length()) - (4505116 + 14544630 - 9802910 + 9172409 << "   ".length()) + (158523650 + 253651287 - -69533485 + 289708903);
        Main.IlIIIll[1] = (0x22 ^ 0x11) & ~(0x13 ^ 0x20);
        Main.IlIIIll[2] = " ".length();
        Main.IlIIIll[3] = " ".length() << " ".length();
    }

    private static boolean IlIlIIlIl(int n, int n2) {
        return n == n2;
    }

    private static boolean IIllIIlIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIIlIIlIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean lIlIIIlIl(int n) {
        return n != 0;
    }

    class FastScanner {
        Reader input;
        private static String[] IIIIIll;
        private static int[] lIIIIll;

        /*
         * WARNING - void declaration
         */
        FastScanner(Main IIllIlllIlllIIl) {
            lIllIlllIlllIIl((Main)var1_1, System.in);
            void var1_1;
            FastScanner lIllIlllIlllIIl;
        }

        /*
         * WARNING - void declaration
         */
        FastScanner(Main main, InputStream IllIIlllIlllIIl) {
            void var2_2;
            FastScanner lllIIlllIlllIIl;
            this.input = new BufferedReader(new InputStreamReader((InputStream)var2_2));
        }

        int nextInt() {
            FastScanner IIlIIlllIlllIIl;
            return (int)IIlIIlllIlllIIl.nextLong();
        }

        long nextLong() {
            try {
                FastScanner lllllIllIlllIIl;
                int IllllIllIlllIIl = lIIIIll[0];
                int lIlllIllIlllIIl = lllllIllIlllIIl.input.read();
                while ((!FastScanner.IllIIIlIl(lIlllIllIlllIIl, lIIIIll[1]) || FastScanner.lllIIIlIl(lIIIIll[2], lIlllIllIlllIIl)) && FastScanner.IIIlIIlIl(lIlllIllIlllIIl, lIIIIll[3]) && FastScanner.IIIlIIlIl(lIlllIllIlllIIl, lIIIIll[4])) {
                    lIlllIllIlllIIl = lllllIllIlllIIl.input.read();
                    "".length();
                    if ("   ".length() != ((0x52 ^ 0x5D) & ~(0xF ^ 0))) continue;
                    return 0L;
                }
                if (FastScanner.llIlIIlIl(lIlllIllIlllIIl, lIIIIll[3])) {
                    IllllIllIlllIIl = lIIIIll[5];
                    lIlllIllIlllIIl = lllllIllIlllIIl.input.read();
                    "".length();
                    if ((3 ^ 0x14 ^ (0x76 ^ 0x7F) << " ".length()) == 0) {
                        return 0L;
                    }
                } else if (FastScanner.llIlIIlIl(lIlllIllIlllIIl, lIIIIll[4])) {
                    lIlllIllIlllIIl = lllllIllIlllIIl.input.read();
                }
                long IIlllIllIlllIIl = lIlllIllIlllIIl - lIIIIll[1];
                do {
                    if (!FastScanner.IllIIIlIl(lIlllIllIlllIIl = lllllIllIlllIIl.input.read(), lIIIIll[1]) || FastScanner.lllIIIlIl(lIIIIll[2], lIlllIllIlllIIl)) {
                        return IIlllIllIlllIIl * (long)IllllIllIlllIIl;
                    }
                    IIlllIllIlllIIl *= 10L;
                    IIlllIllIlllIIl += (long)(lIlllIllIlllIIl - lIIIIll[1]);
                    "".length();
                } while ("   ".length() != -" ".length());
                return 0L;
            }
            catch (IOException IllllIllIlllIIl) {
                IllllIllIlllIIl.printStackTrace();
                return -1L;
            }
        }

        double nextDouble() {
            try {
                FastScanner IllIlIllIlllIIl;
                double lIlIlIllIlllIIl = 1.0;
                int IIlIlIllIlllIIl = IllIlIllIlllIIl.input.read();
                while ((!FastScanner.IllIIIlIl(IIlIlIllIlllIIl, lIIIIll[1]) || FastScanner.lllIIIlIl(lIIIIll[2], IIlIlIllIlllIIl)) && FastScanner.IIIlIIlIl(IIlIlIllIlllIIl, lIIIIll[3]) && FastScanner.IIIlIIlIl(IIlIlIllIlllIIl, lIIIIll[4])) {
                    IIlIlIllIlllIIl = IllIlIllIlllIIl.input.read();
                    "".length();
                    if (null == null) continue;
                    return 0.0;
                }
                if (FastScanner.llIlIIlIl(IIlIlIllIlllIIl, lIIIIll[3])) {
                    lIlIlIllIlllIIl = -1.0;
                    IIlIlIllIlllIIl = IllIlIllIlllIIl.input.read();
                    "".length();
                    if (((0x3F ^ 0x34 ^ (0x15 ^ 0x1A) << " ".length()) << (" ".length() << " ".length()) & ((124 + 78 - 56 + 7 ^ (1 ^ 0x22) << (" ".length() << " ".length())) << (" ".length() << " ".length()) ^ -" ".length())) != ((11 + 66 - -3 + 51 ^ (0x59 ^ 0x7E) << (" ".length() << " ".length())) << " ".length() & ((0x41 ^ 0x78 ^ (0xC ^ 0x1F) << " ".length()) << " ".length() ^ -" ".length()))) {
                        return 0.0;
                    }
                } else if (FastScanner.llIlIIlIl(IIlIlIllIlllIIl, lIIIIll[4])) {
                    IIlIlIllIlllIIl = IllIlIllIlllIIl.input.read();
                }
                double llIIlIllIlllIIl = IIlIlIllIlllIIl - lIIIIll[1];
                while (FastScanner.IllIIIlIl(IIlIlIllIlllIIl = IllIlIllIlllIIl.input.read(), lIIIIll[1])) {
                    if (FastScanner.lllIIIlIl(lIIIIll[2], IIlIlIllIlllIIl)) {
                        "".length();
                        if (" ".length() << (" ".length() << " ".length()) > " ".length() << " ".length()) break;
                        return 0.0;
                    }
                    llIIlIllIlllIIl *= 10.0;
                    llIIlIllIlllIIl += (double)(IIlIlIllIlllIIl - lIIIIll[1]);
                    "".length();
                    if (" ".length() << " ".length() == " ".length() << " ".length()) continue;
                    return 0.0;
                }
                if (FastScanner.IIIlIIlIl(IIlIlIllIlllIIl, lIIIIll[6])) {
                    return lIlIlIllIlllIIl * llIIlIllIlllIIl;
                }
                double IlIIlIllIlllIIl = 1.0;
                IIlIlIllIlllIIl = IllIlIllIlllIIl.input.read();
                while (FastScanner.lIllIIlIl(lIIIIll[1], IIlIlIllIlllIIl) && FastScanner.lIllIIlIl(IIlIlIllIlllIIl, lIIIIll[2])) {
                    llIIlIllIlllIIl *= 10.0;
                    llIIlIllIlllIIl += (double)(IIlIlIllIlllIIl - lIIIIll[1]);
                    IlIIlIllIlllIIl *= 10.0;
                    IIlIlIllIlllIIl = IllIlIllIlllIIl.input.read();
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) >= " ".length()) continue;
                    return 0.0;
                }
                return lIlIlIllIlllIIl * llIIlIllIlllIIl / IlIIlIllIlllIIl;
            }
            catch (IOException lIlIlIllIlllIIl) {
                lIlIlIllIlllIIl.printStackTrace();
                return Double.NaN;
            }
        }

        char nextChar() {
            try {
                FastScanner llllIIllIlllIIl;
                int IlllIIllIlllIIl = llllIIllIlllIIl.input.read();
                while (FastScanner.IlllIIlIl(Character.isWhitespace(IlllIIllIlllIIl) ? 1 : 0)) {
                    IlllIIllIlllIIl = llllIIllIlllIIl.input.read();
                    "".length();
                    if (null == null) continue;
                    return (char)(((0x12 ^ 0x17) << (" ".length() << " ".length()) & ~((0x68 ^ 0x6D) << (" ".length() << " ".length())) ^ (0x86 ^ 0x8F)) << "   ".length() & ((0x21 ^ 0x6A ^ (0x34 ^ 0x15) << " ".length()) << "   ".length() ^ -" ".length()));
                }
                return (char)IlllIIllIlllIIl;
            }
            catch (IOException IlllIIllIlllIIl) {
                IlllIIllIlllIIl.printStackTrace();
                return lIIIIll[7];
            }
        }

        String nextStr() {
            try {
                FastScanner IlIlIIllIlllIIl;
                StringBuilder lIIlIIllIlllIIl = new StringBuilder();
                int IIIlIIllIlllIIl = IlIlIIllIlllIIl.input.read();
                while (FastScanner.IlllIIlIl(Character.isWhitespace(IIIlIIllIlllIIl) ? 1 : 0)) {
                    IIIlIIllIlllIIl = IlIlIIllIlllIIl.input.read();
                    "".length();
                    if ("   ".length() > " ".length() << " ".length()) continue;
                    return null;
                }
                while (FastScanner.IIIlIIlIl(IIIlIIllIlllIIl, lIIIIll[5]) && FastScanner.llllIIlIl(Character.isWhitespace(IIIlIIllIlllIIl) ? 1 : 0)) {
                    lIIlIIllIlllIIl.append((char)IIIlIIllIlllIIl);
                    "".length();
                    IIIlIIllIlllIIl = IlIlIIllIlllIIl.input.read();
                    "".length();
                    if (null == null) continue;
                    return null;
                }
                return String.valueOf(lIIlIIllIlllIIl);
            }
            catch (IOException lIIlIIllIlllIIl) {
                lIIlIIllIlllIIl.printStackTrace();
                return IIIIIll[lIIIIll[7]];
            }
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray(int IlIIIIllIlllIIl) {
            void var2_2;
            int[] lIIIIIllIlllIIl = new int[IlIIIIllIlllIIl];
            int IIIIIIllIlllIIl = lIIIIll[7];
            while (FastScanner.lllIIIlIl(IIIIIIllIlllIIl, IlIIIIllIlllIIl)) {
                FastScanner llIIIIllIlllIIl;
                lIIIIIllIlllIIl[IIIIIIllIlllIIl] = llIIIIllIlllIIl.nextInt();
                ++IIIIIIllIlllIIl;
                "".length();
                if (((0x8F ^ 0xBC) & ~(0x67 ^ 0x54)) == 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArrayDec(int IlIlllIlIlllIIl) {
            void var2_2;
            int[] lIIlllIlIlllIIl = new int[IlIlllIlIlllIIl];
            int IIIlllIlIlllIIl = lIIIIll[7];
            while (FastScanner.lllIIIlIl(IIIlllIlIlllIIl, IlIlllIlIlllIIl)) {
                FastScanner llIlllIlIlllIIl;
                lIIlllIlIlllIIl[IIIlllIlIlllIIl] = llIlllIlIlllIIl.nextInt() - lIIIIll[0];
                ++IIIlllIlIlllIIl;
                "".length();
                if (-"   ".length() <= 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray1Index(int IlIIllIlIlllIIl) {
            void var2_2;
            int[] lIIIllIlIlllIIl = new int[IlIIllIlIlllIIl + lIIIIll[0]];
            int IIIIllIlIlllIIl = lIIIIll[7];
            while (FastScanner.lllIIIlIl(IIIIllIlIlllIIl, IlIIllIlIlllIIl)) {
                FastScanner llIIllIlIlllIIl;
                lIIIllIlIlllIIl[IIIIllIlIlllIIl + FastScanner.lIIIIll[0]] = llIIllIlIlllIIl.nextInt();
                ++IIIIllIlIlllIIl;
                "".length();
                if ((((0x32 ^ 0x39) << (" ".length() << " ".length()) ^ (0xC ^ 5)) << " ".length() & ((68 + 122 - 184 + 173 ^ (0x68 ^ 0x23) << " ".length()) << " ".length() ^ -" ".length())) == 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray(int IlIlIlIlIlllIIl) {
            void var2_2;
            long[] lIIlIlIlIlllIIl = new long[IlIlIlIlIlllIIl];
            int IIIlIlIlIlllIIl = lIIIIll[7];
            while (FastScanner.lllIIIlIl(IIIlIlIlIlllIIl, IlIlIlIlIlllIIl)) {
                FastScanner llIlIlIlIlllIIl;
                lIIlIlIlIlllIIl[IIIlIlIlIlllIIl] = llIlIlIlIlllIIl.nextLong();
                ++IIIlIlIlIlllIIl;
                "".length();
                if (" ".length() << (" ".length() << " ".length()) >= (" ".length() << (0xB8 ^ 0xBD) & ~(" ".length() << (0x82 ^ 0x87)))) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArrayDec(int IlIIIlIlIlllIIl) {
            void var2_2;
            long[] lIIIIlIlIlllIIl = new long[IlIIIlIlIlllIIl];
            int IIIIIlIlIlllIIl = lIIIIll[7];
            while (FastScanner.lllIIIlIl(IIIIIlIlIlllIIl, IlIIIlIlIlllIIl)) {
                FastScanner llIIIlIlIlllIIl;
                lIIIIlIlIlllIIl[IIIIIlIlIlllIIl] = llIIIlIlIlllIIl.nextLong() - 1L;
                ++IIIIIlIlIlllIIl;
                "".length();
                if (-" ".length() < 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray1Index(int IlIllIIlIlllIIl) {
            void var2_2;
            long[] lIIllIIlIlllIIl = new long[IlIllIIlIlllIIl + lIIIIll[0]];
            int IIIllIIlIlllIIl = lIIIIll[7];
            while (FastScanner.lllIIIlIl(IIIllIIlIlllIIl, IlIllIIlIlllIIl)) {
                FastScanner llIllIIlIlllIIl;
                lIIllIIlIlllIIl[IIIllIIlIlllIIl + FastScanner.lIIIIll[0]] = llIllIIlIlllIIl.nextLong();
                ++IIIllIIlIlllIIl;
                "".length();
                if (-" ".length() <= " ".length() << " ".length()) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public double[] nextDoubleArray(int IlIIlIIlIlllIIl) {
            void var2_2;
            double[] lIIIlIIlIlllIIl = new double[IlIIlIIlIlllIIl];
            int IIIIlIIlIlllIIl = lIIIIll[7];
            while (FastScanner.lllIIIlIl(IIIIlIIlIlllIIl, IlIIlIIlIlllIIl)) {
                FastScanner llIIlIIlIlllIIl;
                lIIIlIIlIlllIIl[IIIIlIIlIlllIIl] = llIIlIIlIlllIIl.nextDouble();
                ++IIIIlIIlIlllIIl;
                "".length();
                if (" ".length() << " ".length() < "   ".length()) continue;
                return null;
            }
            return var2_2;
        }

        static {
            FastScanner.IIlIIIlIl();
            FastScanner.lIIIIIlIl();
        }

        private static void lIIIIIlIl() {
            IIIIIll = new String[lIIIIll[0]];
            FastScanner.IIIIIll[FastScanner.lIIIIll[7]] = FastScanner.IIIIIIlIl("", "DQAfi");
        }

        /*
         * Unable to fully structure code
         */
        private static String IIIIIIlIl(String IllIIIIlIlllIIl, String lIlIIIIlIlllIIl) {
            IllIIIIlIlllIIl = new String(Base64.getDecoder().decode(IllIIIIlIlllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            IIlIIIIlIlllIIl = new StringBuilder();
            llIIIIIlIlllIIl = lIlIIIIlIlllIIl.toCharArray();
            IlIIIIIlIlllIIl = FastScanner.lIIIIll[7];
            IIIllllIIlllIIl = IllIIIIlIlllIIl.toCharArray();
            lIIllllIIlllIIl = IIIllllIIlllIIl.length;
            IlIllllIIlllIIl = FastScanner.lIIIIll[7];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) >= "   ".length()) ** GOTO lbl19
            return null;
lbl-1000:
            // 1 sources

            {
                lIIIIIIlIlllIIl = IIIllllIIlllIIl[IlIllllIIlllIIl];
                IIlIIIIlIlllIIl.append((char)(lIIIIIIlIlllIIl ^ llIIIIIlIlllIIl[IlIIIIIlIlllIIl % llIIIIIlIlllIIl.length]));
                "".length();
                ++IlIIIIIlIlllIIl;
                ++IlIllllIIlllIIl;
lbl19:
                // 2 sources

                ** while (!FastScanner.IllIIIlIl((int)IlIllllIIlllIIl, (int)lIIllllIIlllIIl))
            }
lbl20:
            // 1 sources

            return String.valueOf(IIlIIIIlIlllIIl);
        }

        private static void IIlIIIlIl() {
            lIIIIll = new int[8];
            FastScanner.lIIIIll[0] = " ".length();
            FastScanner.lIIIIll[1] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.lIIIIll[2] = 0x3D ^ 4;
            FastScanner.lIIIIll[3] = 0x47 ^ 0x6A;
            FastScanner.lIIIIll[4] = 13 + 100 - 23 + 37 ^ (0xB1 ^ 0xA4) << (" ".length() << " ".length());
            FastScanner.lIIIIll[5] = -" ".length();
            FastScanner.lIIIIll[6] = (0x78 ^ 0x6F) << " ".length();
            FastScanner.lIIIIll[7] = (0x56 ^ 7) & ~(0x68 ^ 0x39);
        }

        private static boolean llIlIIlIl(int n, int n2) {
            return n == n2;
        }

        private static boolean IllIIIlIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean lllIIIlIl(int n, int n2) {
            return n < n2;
        }

        private static boolean lIllIIlIl(int n, int n2) {
            return n <= n2;
        }

        private static boolean IlllIIlIl(int n) {
            return n != 0;
        }

        private static boolean llllIIlIl(int n) {
            return n == 0;
        }

        private static boolean IIIlIIlIl(int n, int n2) {
            return n != n2;
        }
    }
}

