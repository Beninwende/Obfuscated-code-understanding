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
    private static String[] lIlllllll;
    private static int[] Illllllll;

    public Main() {
        Main IIIIIIllIllll;
        IIIIIIllIllll.in = new FastScanner(IIIIIIllIllll, System.in);
        IIIIIIllIllll.out = new PrintWriter(System.out);
        this.MOD = Illllllll[0];
    }

    void solve() throws Exception {
        Main lIIlllIlIllll;
        long IIIlllIlIllll = lIIlllIlIllll.in.nextLong();
        long lllIllIlIllll = lIIlllIlIllll.in.nextLong();
        if (Main.IlllllllIll(Main.lIllllllIll(lllIllIlIllll - IIIlllIlIllll + 1L, 2019L))) {
            lIIlllIlIllll.out.println(lIlllllll[Illllllll[1]]);
            "".length();
            if (" ".length() << " ".length() != " ".length() << " ".length()) {
                return;
            }
        } else {
            long IllIllIlIllll = 2019L;
            long lIlIllIlIllll = IIIlllIlIllll;
            while (Main.llllllllIll(Main.lIllllllIll(lIlIllIlIllll, lllIllIlIllll))) {
                long IIlIllIlIllll = lIlIllIlIllll + 1L;
                while (Main.IIIIIIIIlll(Main.lIllllllIll(IIlIllIlIllll, lllIllIlIllll))) {
                    IllIllIlIllll = Math.min(IllIllIlIllll, lIlIllIlIllll * IIlIllIlIllll % 2019L);
                    ++IIlIllIlIllll;
                    "".length();
                    if (" ".length() << " ".length() < " ".length() << (" ".length() << " ".length())) continue;
                    return;
                }
                ++lIlIllIlIllll;
                "".length();
                if (" ".length() << (" ".length() << " ".length()) > ((0x17 ^ 0x40 ^ (0x50 ^ 0x6F) << " ".length()) & ((0x1B ^ 0x16) << (" ".length() << " ".length()) ^ (0x78 ^ 0x65) ^ -" ".length()))) continue;
                return;
            }
            lIIlllIlIllll.out.println(IllIllIlIllll);
        }
    }

    public static void main(String[] stringArray) throws Exception {
        new Main().m();
    }

    void m() throws Exception {
        Main IlIIllIlIllll;
        IlIIllIlIllll.solve();
        IlIIllIlIllll.out.flush();
    }

    static {
        Main.IIllllllIll();
        Main.llIlllllIll();
    }

    private static void llIlllllIll() {
        lIlllllll = new String[Illllllll[2]];
        Main.lIlllllll[Main.Illllllll[1]] = Main.IlIlllllIll("8O4/sfl0xlA=", "JWXYr");
    }

    private static String IlIlllllIll(String lIllIlIlIllll, String IIllIlIlIllll) {
        try {
            SecretKeySpec llIlIlIlIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIllIlIlIllll.getBytes(StandardCharsets.UTF_8)), Illllllll[3]), "DES");
            Cipher IlIlIlIlIllll = Cipher.getInstance("DES");
            IlIlIlIlIllll.init(Illllllll[4], llIlIlIlIllll);
            return new String(IlIlIlIlIllll.doFinal(Base64.getDecoder().decode(lIllIlIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIlIlIllll) {
            lIIlIlIlIllll.printStackTrace();
            return null;
        }
    }

    private static void IIllllllIll() {
        Illllllll = new int[5];
        Main.Illllllll[0] = 257765871 + 36776765 - -302330728 + 403126643;
        Main.Illllllll[1] = (0xE1 ^ 0x96 ^ (0xB3 ^ 0x8A) << " ".length()) << (" ".length() << " ".length()) & ((0x73 ^ 0x40 ^ (0x43 ^ 0x58) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length());
        Main.Illllllll[2] = " ".length();
        Main.Illllllll[3] = " ".length() << "   ".length();
        Main.Illllllll[4] = " ".length() << " ".length();
    }

    private static boolean IlllllllIll(int n) {
        return n >= 0;
    }

    private static boolean llllllllIll(int n) {
        return n < 0;
    }

    private static boolean IIIIIIIIlll(int n) {
        return n <= 0;
    }

    private static int lIllllllIll(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    class FastScanner {
        Reader input;
        private static String[] lllllllll;
        private static int[] IIIIIIIIIl;

        /*
         * WARNING - void declaration
         */
        FastScanner(Main IlIllIIlIllll) {
            llIllIIlIllll((Main)var1_1, System.in);
            void var1_1;
            FastScanner llIllIIlIllll;
        }

        /*
         * WARNING - void declaration
         */
        FastScanner(Main main, InputStream IIlIlIIlIllll) {
            void var2_2;
            FastScanner lIlIlIIlIllll;
            this.input = new BufferedReader(new InputStreamReader((InputStream)var2_2));
        }

        int nextInt() {
            FastScanner IlIIlIIlIllll;
            return (int)IlIIlIIlIllll.nextLong();
        }

        long nextLong() {
            try {
                FastScanner lIllIIIlIllll;
                int IIllIIIlIllll = IIIIIIIIIl[0];
                int llIlIIIlIllll = lIllIIIlIllll.input.read();
                while ((!FastScanner.IIlIIIIIlll(llIlIIIlIllll, IIIIIIIIIl[1]) || FastScanner.lIlIIIIIlll(IIIIIIIIIl[2], llIlIIIlIllll)) && FastScanner.IllIIIIIlll(llIlIIIlIllll, IIIIIIIIIl[3]) && FastScanner.IllIIIIIlll(llIlIIIlIllll, IIIIIIIIIl[4])) {
                    llIlIIIlIllll = lIllIIIlIllll.input.read();
                    "".length();
                    if (-"  ".length() <= 0) continue;
                    return 0L;
                }
                if (FastScanner.lllIIIIIlll(llIlIIIlIllll, IIIIIIIIIl[3])) {
                    IIllIIIlIllll = IIIIIIIIIl[5];
                    llIlIIIlIllll = lIllIIIlIllll.input.read();
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) == 0) {
                        return 0L;
                    }
                } else if (FastScanner.lllIIIIIlll(llIlIIIlIllll, IIIIIIIIIl[4])) {
                    llIlIIIlIllll = lIllIIIlIllll.input.read();
                }
                long IlIlIIIlIllll = llIlIIIlIllll - IIIIIIIIIl[1];
                do {
                    if (!FastScanner.IIlIIIIIlll(llIlIIIlIllll = lIllIIIlIllll.input.read(), IIIIIIIIIl[1]) || FastScanner.lIlIIIIIlll(IIIIIIIIIl[2], llIlIIIlIllll)) {
                        return IlIlIIIlIllll * (long)IIllIIIlIllll;
                    }
                    IlIlIIIlIllll *= 10L;
                    IlIlIIIlIllll += (long)(llIlIIIlIllll - IIIIIIIIIl[1]);
                    "".length();
                } while (" ".length() << (" ".length() << " ".length()) != 0);
                return 0L;
            }
            catch (IOException IIllIIIlIllll) {
                IIllIIIlIllll.printStackTrace();
                return -1L;
            }
        }

        double nextDouble() {
            try {
                FastScanner IIlIIIIlIllll;
                double llIIIIIlIllll = 1.0;
                int IlIIIIIlIllll = IIlIIIIlIllll.input.read();
                while ((!FastScanner.IIlIIIIIlll(IlIIIIIlIllll, IIIIIIIIIl[1]) || FastScanner.lIlIIIIIlll(IIIIIIIIIl[2], IlIIIIIlIllll)) && FastScanner.IllIIIIIlll(IlIIIIIlIllll, IIIIIIIIIl[3]) && FastScanner.IllIIIIIlll(IlIIIIIlIllll, IIIIIIIIIl[4])) {
                    IlIIIIIlIllll = IIlIIIIlIllll.input.read();
                    "".length();
                    if (" ".length() << " ".length() < " ".length() << (" ".length() << " ".length())) continue;
                    return 0.0;
                }
                if (FastScanner.lllIIIIIlll(IlIIIIIlIllll, IIIIIIIIIl[3])) {
                    llIIIIIlIllll = -1.0;
                    IlIIIIIlIllll = IIlIIIIlIllll.input.read();
                    "".length();
                    if ("   ".length() <= ((0xB7 ^ 0xBC) & ~(0xC ^ 7))) {
                        return 0.0;
                    }
                } else if (FastScanner.lllIIIIIlll(IlIIIIIlIllll, IIIIIIIIIl[4])) {
                    IlIIIIIlIllll = IIlIIIIlIllll.input.read();
                }
                double lIIIIIIlIllll = IlIIIIIlIllll - IIIIIIIIIl[1];
                while (FastScanner.IIlIIIIIlll(IlIIIIIlIllll = IIlIIIIlIllll.input.read(), IIIIIIIIIl[1])) {
                    if (FastScanner.lIlIIIIIlll(IIIIIIIIIl[2], IlIIIIIlIllll)) {
                        "".length();
                        if (" ".length() << (" ".length() << " ".length()) > 0) break;
                        return 0.0;
                    }
                    lIIIIIIlIllll *= 10.0;
                    lIIIIIIlIllll += (double)(IlIIIIIlIllll - IIIIIIIIIl[1]);
                    "".length();
                    if (" ".length() > -" ".length()) continue;
                    return 0.0;
                }
                if (FastScanner.IllIIIIIlll(IlIIIIIlIllll, IIIIIIIIIl[6])) {
                    return llIIIIIlIllll * lIIIIIIlIllll;
                }
                double IIIIIIIlIllll = 1.0;
                IlIIIIIlIllll = IIlIIIIlIllll.input.read();
                while (FastScanner.IIIlIIIIlll(IIIIIIIIIl[1], IlIIIIIlIllll) && FastScanner.IIIlIIIIlll(IlIIIIIlIllll, IIIIIIIIIl[2])) {
                    lIIIIIIlIllll *= 10.0;
                    lIIIIIIlIllll += (double)(IlIIIIIlIllll - IIIIIIIIIl[1]);
                    IIIIIIIlIllll *= 10.0;
                    IlIIIIIlIllll = IIlIIIIlIllll.input.read();
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) >= " ".length() << (" ".length() << " ".length())) continue;
                    return 0.0;
                }
                return llIIIIIlIllll * lIIIIIIlIllll / IIIIIIIlIllll;
            }
            catch (IOException llIIIIIlIllll) {
                llIIIIIlIllll.printStackTrace();
                return Double.NaN;
            }
        }

        char nextChar() {
            try {
                FastScanner lIlllllIIllll;
                int IIlllllIIllll = lIlllllIIllll.input.read();
                while (FastScanner.lIIlIIIIlll(Character.isWhitespace(IIlllllIIllll) ? 1 : 0)) {
                    IIlllllIIllll = lIlllllIIllll.input.read();
                    "".length();
                    if (" ".length() >= 0) continue;
                    return (char)(" ".length() << " ".length() & (" ".length() << " ".length() ^ -" ".length()));
                }
                return (char)IIlllllIIllll;
            }
            catch (IOException IIlllllIIllll) {
                IIlllllIIllll.printStackTrace();
                return IIIIIIIIIl[7];
            }
        }

        String nextStr() {
            try {
                FastScanner IIIllllIIllll;
                StringBuilder lllIlllIIllll = new StringBuilder();
                int IllIlllIIllll = IIIllllIIllll.input.read();
                while (FastScanner.lIIlIIIIlll(Character.isWhitespace(IllIlllIIllll) ? 1 : 0)) {
                    IllIlllIIllll = IIIllllIIllll.input.read();
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) > ((0x55 ^ 0x5E) << " ".length() & ~((0x87 ^ 0x8C) << " ".length()))) continue;
                    return null;
                }
                while (FastScanner.IllIIIIIlll(IllIlllIIllll, IIIIIIIIIl[5]) && FastScanner.IlIlIIIIlll(Character.isWhitespace(IllIlllIIllll) ? 1 : 0)) {
                    lllIlllIIllll.append((char)IllIlllIIllll);
                    "".length();
                    IllIlllIIllll = IIIllllIIllll.input.read();
                    "".length();
                    if (((143 + 108 - 228 + 126 ^ (0x73 ^ 0x3A) << " ".length()) << (" ".length() << " ".length()) & ((" ".length() << (" ".length() << " ".length()) ^ "   ".length()) << (" ".length() << " ".length()) ^ -" ".length())) == 0) continue;
                    return null;
                }
                return String.valueOf(lllIlllIIllll);
            }
            catch (IOException lllIlllIIllll) {
                lllIlllIIllll.printStackTrace();
                return lllllllll[IIIIIIIIIl[7]];
            }
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray(int IIIIlllIIllll) {
            void var2_2;
            int[] llllIllIIllll = new int[IIIIlllIIllll];
            int IlllIllIIllll = IIIIIIIIIl[7];
            while (FastScanner.lIlIIIIIlll(IlllIllIIllll, IIIIlllIIllll)) {
                FastScanner lIIIlllIIllll;
                llllIllIIllll[IlllIllIIllll] = lIIIlllIIllll.nextInt();
                ++IlllIllIIllll;
                "".length();
                if (" ".length() << (" ".length() << " ".length()) != " ".length() << " ".length()) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArrayDec(int IIIlIllIIllll) {
            void var2_2;
            int[] lllIIllIIllll = new int[IIIlIllIIllll];
            int IllIIllIIllll = IIIIIIIIIl[7];
            while (FastScanner.lIlIIIIIlll(IllIIllIIllll, IIIlIllIIllll)) {
                FastScanner lIIlIllIIllll;
                lllIIllIIllll[IllIIllIIllll] = lIIlIllIIllll.nextInt() - IIIIIIIIIl[0];
                ++IllIIllIIllll;
                "".length();
                if ((((0xA9 ^ 0xB8) << "   ".length() ^ 71 + 155 - 221 + 154) << " ".length() & (((0x53 ^ 0x56) << "   ".length() ^ (0x34 ^ 0xB)) << " ".length() ^ -" ".length())) == 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray1Index(int IIIIIllIIllll) {
            void var2_2;
            int[] lllllIlIIllll = new int[IIIIIllIIllll + IIIIIIIIIl[0]];
            int IllllIlIIllll = IIIIIIIIIl[7];
            while (FastScanner.lIlIIIIIlll(IllllIlIIllll, IIIIIllIIllll)) {
                FastScanner lIIIIllIIllll;
                lllllIlIIllll[IllllIlIIllll + FastScanner.IIIIIIIIIl[0]] = lIIIIllIIllll.nextInt();
                ++IllllIlIIllll;
                "".length();
                if ((((0x37 ^ 0x18) << " ".length() ^ (0x4E ^ 0x17)) << " ".length() & (((0xE ^ 0x49) << " ".length() ^ 46 + 129 - 134 + 96) << " ".length() ^ -" ".length())) >= 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray(int IIIllIlIIllll) {
            void var2_2;
            long[] lllIlIlIIllll = new long[IIIllIlIIllll];
            int IllIlIlIIllll = IIIIIIIIIl[7];
            while (FastScanner.lIlIIIIIlll(IllIlIlIIllll, IIIllIlIIllll)) {
                FastScanner lIIllIlIIllll;
                lllIlIlIIllll[IllIlIlIIllll] = lIIllIlIIllll.nextLong();
                ++IllIlIlIIllll;
                "".length();
                if (-"  ".length() <= 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArrayDec(int IIIIlIlIIllll) {
            void var2_2;
            long[] llllIIlIIllll = new long[IIIIlIlIIllll];
            int IlllIIlIIllll = IIIIIIIIIl[7];
            while (FastScanner.lIlIIIIIlll(IlllIIlIIllll, IIIIlIlIIllll)) {
                FastScanner lIIIlIlIIllll;
                llllIIlIIllll[IlllIIlIIllll] = lIIIlIlIIllll.nextLong() - 1L;
                ++IlllIIlIIllll;
                "".length();
                if (" ".length() << " ".length() > 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray1Index(int IIIlIIlIIllll) {
            void var2_2;
            long[] lllIIIlIIllll = new long[IIIlIIlIIllll + IIIIIIIIIl[0]];
            int IllIIIlIIllll = IIIIIIIIIl[7];
            while (FastScanner.lIlIIIIIlll(IllIIIlIIllll, IIIlIIlIIllll)) {
                FastScanner lIIlIIlIIllll;
                lllIIIlIIllll[IllIIIlIIllll + FastScanner.IIIIIIIIIl[0]] = lIIlIIlIIllll.nextLong();
                ++IllIIIlIIllll;
                "".length();
                if ((0xB1 ^ 0xB4) > 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public double[] nextDoubleArray(int IIIIIIlIIllll) {
            void var2_2;
            double[] llllllIIIllll = new double[IIIIIIlIIllll];
            int IlllllIIIllll = IIIIIIIIIl[7];
            while (FastScanner.lIlIIIIIlll(IlllllIIIllll, IIIIIIlIIllll)) {
                FastScanner lIIIIIlIIllll;
                llllllIIIllll[IlllllIIIllll] = lIIIIIlIIllll.nextDouble();
                ++IlllllIIIllll;
                "".length();
                if (" ".length() << " ".length() != "   ".length()) continue;
                return null;
            }
            return var2_2;
        }

        static {
            FastScanner.llIIIIIIlll();
            FastScanner.IlIIIIIIlll();
        }

        private static void IlIIIIIIlll() {
            lllllllll = new String[IIIIIIIIIl[0]];
            FastScanner.lllllllll[FastScanner.IIIIIIIIIl[7]] = FastScanner.lIIIIIIIlll("", "cjwAe");
        }

        /*
         * Unable to fully structure code
         */
        private static String lIIIIIIIlll(String IIlIllIIIllll, String llIIllIIIllll) {
            IIlIllIIIllll = new String(Base64.getDecoder().decode(IIlIllIIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            IlIIllIIIllll = new StringBuilder();
            lIIIllIIIllll = llIIllIIIllll.toCharArray();
            IIIIllIIIllll = FastScanner.IIIIIIIIIl[7];
            IllIIlIIIllll = IIlIllIIIllll.toCharArray();
            lllIIlIIIllll = IllIIlIIIllll.length;
            IIIlIlIIIllll = FastScanner.IIIIIIIIIl[7];
            "".length();
            if ("   ".length() > 0) ** GOTO lbl19
            return null;
lbl-1000:
            // 1 sources

            {
                llllIlIIIllll = IllIIlIIIllll[IIIlIlIIIllll];
                IlIIllIIIllll.append((char)(llllIlIIIllll ^ lIIIllIIIllll[IIIIllIIIllll % lIIIllIIIllll.length]));
                "".length();
                ++IIIIllIIIllll;
                ++IIIlIlIIIllll;
lbl19:
                // 2 sources

                ** while (!FastScanner.IIlIIIIIlll((int)IIIlIlIIIllll, (int)lllIIlIIIllll))
            }
lbl20:
            // 1 sources

            return String.valueOf(IlIIllIIIllll);
        }

        private static void llIIIIIIlll() {
            IIIIIIIIIl = new int[8];
            FastScanner.IIIIIIIIIl[0] = " ".length();
            FastScanner.IIIIIIIIIl[1] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.IIIIIIIIIl[2] = "   ".length() << (" ".length() << " ".length()) ^ (0x17 ^ 0x22);
            FastScanner.IIIIIIIIIl[3] = (0x2F ^ 2) << (" ".length() << " ".length()) ^ 127 + 99 - 133 + 60;
            FastScanner.IIIIIIIIIl[4] = 0x7E ^ 0x55;
            FastScanner.IIIIIIIIIl[5] = -" ".length();
            FastScanner.IIIIIIIIIl[6] = (0x89 ^ 0x9E) << " ".length();
            FastScanner.IIIIIIIIIl[7] = (0xB8 ^ 0xA7) & ~(0x8F ^ 0x90);
        }

        private static boolean lllIIIIIlll(int n, int n2) {
            return n == n2;
        }

        private static boolean IIlIIIIIlll(int n, int n2) {
            return n >= n2;
        }

        private static boolean lIlIIIIIlll(int n, int n2) {
            return n < n2;
        }

        private static boolean IIIlIIIIlll(int n, int n2) {
            return n <= n2;
        }

        private static boolean lIIlIIIIlll(int n) {
            return n != 0;
        }

        private static boolean IlIlIIIIlll(int n) {
            return n == 0;
        }

        private static boolean IllIIIIIlll(int n, int n2) {
            return n != n2;
        }
    }
}

