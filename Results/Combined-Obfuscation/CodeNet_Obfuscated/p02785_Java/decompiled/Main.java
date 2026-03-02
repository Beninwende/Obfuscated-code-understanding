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
    int MOD = llIllllIll[0];
    private static int[] llIllllIll;

    public Main() {
        Main IlIlllIlIllIIll;
    }

    /*
     * WARNING - void declaration
     */
    long ceil(long lllIllIlIllIIll, long IllIllIlIllIIll) {
        void var3_2;
        return (lllIllIlIllIIll + var3_2 - 1L) / var3_2;
    }

    long gcd(long lIIIllIlIllIIll, long IIIIllIlIllIIll) {
        long l;
        if (Main.IllllIllIIll(Main.lIlllIllIIll(IIIIllIlIllIIll, 0L))) {
            l = lIIIllIlIllIIll;
            "".length();
            if (" ".length() << " ".length() <= 0) {
                return 0L;
            }
        } else {
            Main IlIIllIlIllIIll;
            l = IlIIllIlIllIIll.gcd(IIIIllIlIllIIll, lIIIllIlIllIIll % IIIIllIlIllIIll);
        }
        return l;
    }

    /*
     * WARNING - void declaration
     */
    long lcm(long llIlIlIlIllIIll, long IlIlIlIlIllIIll) {
        void var3_2;
        void var1_1;
        return llIlIlIlIllIIll / this.gcd((long)var1_1, (long)var3_2) * var3_2;
    }

    void solve() {
        Main llIIIlIlIllIIll;
        int IlIIIlIlIllIIll = llIIIlIlIllIIll.in.nextInt();
        int lIIIIlIlIllIIll = llIIIlIlIllIIll.in.nextInt();
        int[] IIIIIlIlIllIIll = llIIIlIlIllIIll.in.nextIntArray(IlIIIlIlIllIIll);
        Arrays.sort(IIIIIlIlIllIIll);
        long lllllIIlIllIIll = 0L;
        int IllllIIlIllIIll = llIllllIll[1];
        while (Main.lllllIllIIll(IllllIIlIllIIll, Math.max(llIllllIll[1], IlIIIlIlIllIIll - lIIIIlIlIllIIll))) {
            lllllIIlIllIIll += (long)IIIIIlIlIllIIll[IllllIIlIllIIll];
            ++IllllIIlIllIIll;
            "".length();
            if (-"   ".length() < 0) continue;
            return;
        }
        llIIIlIlIllIIll.out.println(lllllIIlIllIIll);
    }

    public static void main(String[] stringArray) {
        new Main().m();
    }

    private void m() {
        Main IIlllIIlIllIIll;
        IIlllIIlIllIIll.in = new FastScanner(System.in);
        IIlllIIlIllIIll.out = new PrintWriter(System.out);
        IIlllIIlIllIIll.solve();
        IIlllIIlIllIIll.out.flush();
        IIlllIIlIllIIll.in.close();
        IIlllIIlIllIIll.out.close();
    }

    static {
        Main.llIllIllIIll();
    }

    private static void llIllIllIIll() {
        llIllllIll = new int[2];
        Main.llIllllIll[0] = (90729404 + 96315957 - 21992004 + 83155274 << " ".length()) + (228296516 + 72416940 - 137938089 + 100005706 << " ".length()) - (42803481 + 9069982 - 23209501 + 118648563) + (6585238 + 4603325 - 8582400 + 28727118 << (" ".length() << " ".length()));
        Main.llIllllIll[1] = (60 + 25 - 55 + 181 ^ (0x3A ^ 0x33) << (" ".length() << (" ".length() << " ".length()))) & ((0x3B ^ 0x32) << "   ".length() ^ (0x82 ^ 0x89) ^ -" ".length());
    }

    private static boolean lllllIllIIll(int n, int n2) {
        return n < n2;
    }

    private static boolean IllllIllIIll(int n) {
        return n == 0;
    }

    private static int lIlllIllIIll(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    static class FastScanner {
        private Reader input;
        private static String[] IIlllllIll;
        private static int[] lIlllllIll;

        public FastScanner() {
            IIlIlIIlIllIIll(System.in);
            FastScanner IIlIlIIlIllIIll;
        }

        /*
         * WARNING - void declaration
         */
        public FastScanner(InputStream IIIIlIIlIllIIll) {
            void var1_1;
            FastScanner lIIIlIIlIllIIll;
            this.input = new BufferedReader(new InputStreamReader((InputStream)var1_1));
        }

        public void close() {
            try {
                FastScanner lIllIIIlIllIIll;
                lIllIIIlIllIIll.input.close();
                "".length();
            }
            catch (IOException IIllIIIlIllIIll) {
                IIllIIIlIllIIll.printStackTrace();
            }
            if (null != null) {
                return;
            }
        }

        public int nextInt() {
            FastScanner IlIlIIIlIllIIll;
            return (int)IlIlIIIlIllIIll.nextLong();
        }

        public long nextLong() {
            try {
                FastScanner lIlIIIIlIllIIll;
                int IIlIIIIlIllIIll = lIlllllIll[0];
                int llIIIIIlIllIIll = lIlIIIIlIllIIll.input.read();
                while ((!FastScanner.IlIIIlllIIll(llIIIIIlIllIIll, lIlllllIll[1]) || FastScanner.llIIIlllIIll(lIlllllIll[2], llIIIIIlIllIIll)) && FastScanner.IIlIIlllIIll(llIIIIIlIllIIll, lIlllllIll[3]) && FastScanner.IIlIIlllIIll(llIIIIIlIllIIll, lIlllllIll[4])) {
                    llIIIIIlIllIIll = lIlIIIIlIllIIll.input.read();
                    "".length();
                    if ("   ".length() != -" ".length()) continue;
                    return 0L;
                }
                if (FastScanner.lIlIIlllIIll(llIIIIIlIllIIll, lIlllllIll[3])) {
                    IIlIIIIlIllIIll = lIlllllIll[5];
                    llIIIIIlIllIIll = lIlIIIIlIllIIll.input.read();
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) < 0) {
                        return 0L;
                    }
                } else if (FastScanner.lIlIIlllIIll(llIIIIIlIllIIll, lIlllllIll[4])) {
                    llIIIIIlIllIIll = lIlIIIIlIllIIll.input.read();
                }
                long IlIIIIIlIllIIll = llIIIIIlIllIIll - lIlllllIll[1];
                do {
                    if (!FastScanner.IlIIIlllIIll(llIIIIIlIllIIll = lIlIIIIlIllIIll.input.read(), lIlllllIll[1]) || FastScanner.llIIIlllIIll(lIlllllIll[2], llIIIIIlIllIIll)) {
                        return IlIIIIIlIllIIll * (long)IIlIIIIlIllIIll;
                    }
                    IlIIIIIlIllIIll *= 10L;
                    IlIIIIIlIllIIll += (long)(llIIIIIlIllIIll - lIlllllIll[1]);
                    "".length();
                } while (" ".length() << " ".length() >= " ".length() << " ".length());
                return 0L;
            }
            catch (IOException IIlIIIIlIllIIll) {
                IIlIIIIlIllIIll.printStackTrace();
                return -1L;
            }
        }

        public double nextDouble() {
            try {
                FastScanner IIlllllIIllIIll;
                double llIllllIIllIIll = 1.0;
                int IlIllllIIllIIll = IIlllllIIllIIll.input.read();
                while ((!FastScanner.IlIIIlllIIll(IlIllllIIllIIll, lIlllllIll[1]) || FastScanner.llIIIlllIIll(lIlllllIll[2], IlIllllIIllIIll)) && FastScanner.IIlIIlllIIll(IlIllllIIllIIll, lIlllllIll[3]) && FastScanner.IIlIIlllIIll(IlIllllIIllIIll, lIlllllIll[4])) {
                    IlIllllIIllIIll = IIlllllIIllIIll.input.read();
                    "".length();
                    if (" ".length() != ((0xF2 ^ 0xC5) & ~(0x36 ^ 1))) continue;
                    return 0.0;
                }
                if (FastScanner.lIlIIlllIIll(IlIllllIIllIIll, lIlllllIll[3])) {
                    llIllllIIllIIll = -1.0;
                    IlIllllIIllIIll = IIlllllIIllIIll.input.read();
                    "".length();
                    if ((0x67 ^ 0x62) <= 0) {
                        return 0.0;
                    }
                } else if (FastScanner.lIlIIlllIIll(IlIllllIIllIIll, lIlllllIll[4])) {
                    IlIllllIIllIIll = IIlllllIIllIIll.input.read();
                }
                double lIIllllIIllIIll = IlIllllIIllIIll - lIlllllIll[1];
                while (FastScanner.IlIIIlllIIll(IlIllllIIllIIll = IIlllllIIllIIll.input.read(), lIlllllIll[1])) {
                    if (FastScanner.llIIIlllIIll(lIlllllIll[2], IlIllllIIllIIll)) {
                        "".length();
                        if (("   ".length() << (" ".length() << (" ".length() << " ".length())) & ~("   ".length() << (" ".length() << (" ".length() << " ".length())))) <= 0) break;
                        return 0.0;
                    }
                    lIIllllIIllIIll *= 10.0;
                    lIIllllIIllIIll += (double)(IlIllllIIllIIll - lIlllllIll[1]);
                    "".length();
                    if (((0x8E ^ 0x87) << (" ".length() << " ".length()) & ~((0x8C ^ 0x85) << (" ".length() << " ".length()))) == 0) continue;
                    return 0.0;
                }
                if (FastScanner.IIlIIlllIIll(IlIllllIIllIIll, lIlllllIll[6])) {
                    return llIllllIIllIIll * lIIllllIIllIIll;
                }
                double IIIllllIIllIIll = 1.0;
                IlIllllIIllIIll = IIlllllIIllIIll.input.read();
                while (FastScanner.IllIIlllIIll(lIlllllIll[1], IlIllllIIllIIll) && FastScanner.IllIIlllIIll(IlIllllIIllIIll, lIlllllIll[2])) {
                    lIIllllIIllIIll *= 10.0;
                    lIIllllIIllIIll += (double)(IlIllllIIllIIll - lIlllllIll[1]);
                    IIIllllIIllIIll *= 10.0;
                    IlIllllIIllIIll = IIlllllIIllIIll.input.read();
                    "".length();
                    if (((0x39 ^ 0x7C) & ~(0x41 ^ 4)) < " ".length() << (" ".length() << " ".length())) continue;
                    return 0.0;
                }
                return llIllllIIllIIll * lIIllllIIllIIll / IIIllllIIllIIll;
            }
            catch (IOException llIllllIIllIIll) {
                llIllllIIllIIll.printStackTrace();
                return Double.NaN;
            }
        }

        public char nextChar() {
            try {
                FastScanner lIlIlllIIllIIll;
                int IIlIlllIIllIIll = lIlIlllIIllIIll.input.read();
                while (FastScanner.lllIIlllIIll(Character.isWhitespace(IIlIlllIIllIIll) ? 1 : 0)) {
                    IIlIlllIIllIIll = lIlIlllIIllIIll.input.read();
                    "".length();
                    if (-" ".length() <= 0) continue;
                    return (char)((0x20 ^ 0x67) & ~(0x3C ^ 0x7B));
                }
                return (char)IIlIlllIIllIIll;
            }
            catch (IOException IIlIlllIIllIIll) {
                IIlIlllIIllIIll.printStackTrace();
                return lIlllllIll[7];
            }
        }

        public String nextStr() {
            try {
                FastScanner IIIIlllIIllIIll;
                StringBuilder llllIllIIllIIll = new StringBuilder();
                int IlllIllIIllIIll = IIIIlllIIllIIll.input.read();
                while (FastScanner.lllIIlllIIll(Character.isWhitespace(IlllIllIIllIIll) ? 1 : 0)) {
                    IlllIllIIllIIll = IIIIlllIIllIIll.input.read();
                    "".length();
                    if (null == null) continue;
                    return null;
                }
                while (FastScanner.IIlIIlllIIll(IlllIllIIllIIll, lIlllllIll[5]) && FastScanner.IIIlIlllIIll(Character.isWhitespace(IlllIllIIllIIll) ? 1 : 0)) {
                    llllIllIIllIIll.append((char)IlllIllIIllIIll);
                    "".length();
                    IlllIllIIllIIll = IIIIlllIIllIIll.input.read();
                    "".length();
                    if (" ".length() << " ".length() == " ".length() << " ".length()) continue;
                    return null;
                }
                return String.valueOf(llllIllIIllIIll);
            }
            catch (IOException llllIllIIllIIll) {
                llllIllIIllIIll.printStackTrace();
                return IIlllllIll[lIlllllIll[7]];
            }
        }

        public String nextLine() {
            try {
                FastScanner IlIlIllIIllIIll;
                StringBuilder lIIlIllIIllIIll = new StringBuilder();
                int IIIlIllIIllIIll = IlIlIllIIllIIll.input.read();
                while (FastScanner.IIlIIlllIIll(IIIlIllIIllIIll, lIlllllIll[5]) && FastScanner.IIlIIlllIIll(IIIlIllIIllIIll, lIlllllIll[8])) {
                    lIIlIllIIllIIll.append((char)IIIlIllIIllIIll);
                    "".length();
                    IIIlIllIIllIIll = IlIlIllIIllIIll.input.read();
                    "".length();
                    if (" ".length() << " ".length() != " ".length() << (" ".length() << " ".length())) continue;
                    return null;
                }
                return String.valueOf(lIIlIllIIllIIll);
            }
            catch (IOException lIIlIllIIllIIll) {
                lIIlIllIIllIIll.printStackTrace();
                return IIlllllIll[lIlllllIll[0]];
            }
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray(int IlIIIllIIllIIll) {
            void var2_2;
            int[] lIIIIllIIllIIll = new int[IlIIIllIIllIIll];
            int IIIIIllIIllIIll = lIlllllIll[7];
            while (FastScanner.llIIIlllIIll(IIIIIllIIllIIll, IlIIIllIIllIIll)) {
                FastScanner llIIIllIIllIIll;
                lIIIIllIIllIIll[IIIIIllIIllIIll] = llIIIllIIllIIll.nextInt();
                ++IIIIIllIIllIIll;
                "".length();
                if (" ".length() << " ".length() <= " ".length() << (" ".length() << " ".length())) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArrayDec(int IlIllIlIIllIIll) {
            void var2_2;
            int[] lIIllIlIIllIIll = new int[IlIllIlIIllIIll];
            int IIIllIlIIllIIll = lIlllllIll[7];
            while (FastScanner.llIIIlllIIll(IIIllIlIIllIIll, IlIllIlIIllIIll)) {
                FastScanner llIllIlIIllIIll;
                lIIllIlIIllIIll[IIIllIlIIllIIll] = llIllIlIIllIIll.nextInt() - lIlllllIll[0];
                ++IIIllIlIIllIIll;
                "".length();
                if (" ".length() < " ".length() << " ".length()) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray1Index(int IlIIlIlIIllIIll) {
            void var2_2;
            int[] lIIIlIlIIllIIll = new int[IlIIlIlIIllIIll + lIlllllIll[0]];
            int IIIIlIlIIllIIll = lIlllllIll[7];
            while (FastScanner.llIIIlllIIll(IIIIlIlIIllIIll, IlIIlIlIIllIIll)) {
                FastScanner llIIlIlIIllIIll;
                lIIIlIlIIllIIll[IIIIlIlIIllIIll + FastScanner.lIlllllIll[0]] = llIIlIlIIllIIll.nextInt();
                ++IIIIlIlIIllIIll;
                "".length();
                if (" ".length() << (" ".length() << " ".length()) >= 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray(int IlIlIIlIIllIIll) {
            void var2_2;
            long[] lIIlIIlIIllIIll = new long[IlIlIIlIIllIIll];
            int IIIlIIlIIllIIll = lIlllllIll[7];
            while (FastScanner.llIIIlllIIll(IIIlIIlIIllIIll, IlIlIIlIIllIIll)) {
                FastScanner llIlIIlIIllIIll;
                lIIlIIlIIllIIll[IIIlIIlIIllIIll] = llIlIIlIIllIIll.nextLong();
                ++IIIlIIlIIllIIll;
                "".length();
                if (((0x3B ^ 0x2E ^ (0x9E ^ 0x81) << " ".length()) & (0xDD ^ 0x86 ^ (0xB5 ^ 0xB2) << (" ".length() << (" ".length() << " ".length())) ^ -" ".length())) != " ".length() << " ".length()) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArrayDec(int IlIIIIlIIllIIll) {
            void var2_2;
            long[] lIIIIIlIIllIIll = new long[IlIIIIlIIllIIll];
            int IIIIIIlIIllIIll = lIlllllIll[7];
            while (FastScanner.llIIIlllIIll(IIIIIIlIIllIIll, IlIIIIlIIllIIll)) {
                FastScanner llIIIIlIIllIIll;
                lIIIIIlIIllIIll[IIIIIIlIIllIIll] = llIIIIlIIllIIll.nextLong() - 1L;
                ++IIIIIIlIIllIIll;
                "".length();
                if ("   ".length() != -" ".length()) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray1Index(int IlIlllIIIllIIll) {
            void var2_2;
            long[] lIIlllIIIllIIll = new long[IlIlllIIIllIIll + lIlllllIll[0]];
            int IIIlllIIIllIIll = lIlllllIll[7];
            while (FastScanner.llIIIlllIIll(IIIlllIIIllIIll, IlIlllIIIllIIll)) {
                FastScanner llIlllIIIllIIll;
                lIIlllIIIllIIll[IIIlllIIIllIIll + FastScanner.lIlllllIll[0]] = llIlllIIIllIIll.nextLong();
                ++IIIlllIIIllIIll;
                "".length();
                if ("   ".length() > 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public double[] nextDoubleArray(int IlIIllIIIllIIll) {
            void var2_2;
            double[] lIIIllIIIllIIll = new double[IlIIllIIIllIIll];
            int IIIIllIIIllIIll = lIlllllIll[7];
            while (FastScanner.llIIIlllIIll(IIIIllIIIllIIll, IlIIllIIIllIIll)) {
                FastScanner llIIllIIIllIIll;
                lIIIllIIIllIIll[IIIIllIIIllIIll] = llIIllIIIllIIll.nextDouble();
                ++IIIIllIIIllIIll;
                "".length();
                if (" ".length() << (" ".length() << " ".length()) >= 0) continue;
                return null;
            }
            return var2_2;
        }

        static {
            FastScanner.lIIIIlllIIll();
            FastScanner.IIIIIlllIIll();
        }

        private static void IIIIIlllIIll() {
            IIlllllIll = new String[lIlllllIll[9]];
            FastScanner.IIlllllIll[FastScanner.lIlllllIll[7]] = FastScanner.IIlllIllIIll("027UvuDBo/k=", "HljBH");
            FastScanner.IIlllllIll[FastScanner.lIlllllIll[0]] = FastScanner.IIlllIllIIll("a4vHwOoIjdo=", "Dcbvd");
        }

        private static String IIlllIllIIll(String llIlIlIIIllIIll, String IlIlIlIIIllIIll) {
            try {
                SecretKeySpec lIIlIlIIIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlIlIlIIIllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                Cipher IIIlIlIIIllIIll = Cipher.getInstance("Blowfish");
                IIIlIlIIIllIIll.init(lIlllllIll[9], lIIlIlIIIllIIll);
                return new String(IIIlIlIIIllIIll.doFinal(Base64.getDecoder().decode(llIlIlIIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllIIlIIIllIIll) {
                lllIIlIIIllIIll.printStackTrace();
                return null;
            }
        }

        private static void lIIIIlllIIll() {
            lIlllllIll = new int[10];
            FastScanner.lIlllllIll[0] = " ".length();
            FastScanner.lIlllllIll[1] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.lIlllllIll[2] = 0x48 ^ 0x71;
            FastScanner.lIlllllIll[3] = 0x14 ^ 0x39;
            FastScanner.lIlllllIll[4] = (0x52 ^ 0x75) << (" ".length() << " ".length()) ^ 164 + 126 - 264 + 157;
            FastScanner.lIlllllIll[5] = -" ".length();
            FastScanner.lIlllllIll[6] = ((0xA0 ^ 0x85) << " ".length() ^ (0x37 ^ 0x6A)) << " ".length();
            FastScanner.lIlllllIll[7] = (0xDE ^ 0xC5) << " ".length() & ~((0x27 ^ 0x3C) << " ".length());
            FastScanner.lIlllllIll[8] = (0xF3 ^ 0xC6 ^ "   ".length() << (" ".length() << (" ".length() << " ".length()))) << " ".length();
            FastScanner.lIlllllIll[9] = " ".length() << " ".length();
        }

        private static boolean lIlIIlllIIll(int n, int n2) {
            return n == n2;
        }

        private static boolean IlIIIlllIIll(int n, int n2) {
            return n >= n2;
        }

        private static boolean llIIIlllIIll(int n, int n2) {
            return n < n2;
        }

        private static boolean IllIIlllIIll(int n, int n2) {
            return n <= n2;
        }

        private static boolean lllIIlllIIll(int n) {
            return n != 0;
        }

        private static boolean IIIlIlllIIll(int n) {
            return n == 0;
        }

        private static boolean IIlIIlllIIll(int n, int n2) {
            return n != n2;
        }
    }
}

