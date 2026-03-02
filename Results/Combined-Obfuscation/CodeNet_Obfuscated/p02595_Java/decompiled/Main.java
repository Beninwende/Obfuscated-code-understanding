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
    static final int MOD;
    private static int[] IlIIIIIIIl;

    public Main() {
        Main IIllIIIIIllll;
    }

    void solve() {
        Main IIlIIIIIIllll;
        int llIIIIIIIllll = IIlIIIIIIllll.in.nextInt();
        long IlIIIIIIIllll = IIlIIIIIIllll.in.nextLong();
        int lIIIIIIIIllll = IlIIIIIIIl[0];
        int IIIIIIIIIllll = IlIIIIIIIl[0];
        while (Main.lIllIIIIlll(IIIIIIIIIllll, llIIIIIIIllll)) {
            long IllllllllIlll;
            long lllllllllIlll = IIlIIIIIIllll.in.nextLong();
            if (Main.IlllIIIIlll(Main.IIllIIIIlll(lllllllllIlll * lllllllllIlll + (IllllllllIlll = IIlIIIIIIllll.in.nextLong()) * IllllllllIlll, IlIIIIIIIllll * IlIIIIIIIllll))) {
                ++lIIIIIIIIllll;
            }
            ++IIIIIIIIIllll;
            "".length();
            if ("   ".length() > 0) continue;
            return;
        }
        IIlIIIIIIllll.out.println(lIIIIIIIIllll);
    }

    public static void main(String[] stringArray) {
        new Main().m();
    }

    private void m() {
        Main IIlllllllIlll;
        IIlllllllIlll.in = new FastScanner(System.in);
        IIlllllllIlll.out = new PrintWriter(System.out);
        IIlllllllIlll.solve();
        IIlllllllIlll.out.flush();
        IIlllllllIlll.in.close();
        IIlllllllIlll.out.close();
    }

    static {
        Main.llIlIIIIlll();
        MOD = IlIIIIIIIl[1];
    }

    private static void llIlIIIIlll() {
        IlIIIIIIIl = new int[2];
        Main.IlIIIIIIIl[0] = (0xB ^ 0x1C) & ~(4 ^ 0x13);
        Main.IlIIIIIIIl[1] = (228967022 + 264815212 - 123708400 + 40067745 << " ".length()) + (66495667 + 56513551 - -16007477 + 73014182) - (796444579 + 141351556 - 603058823 + 694296015) + (757271842 + 651331076 - 1112752799 + 700869180);
    }

    private static boolean lIllIIIIlll(int n, int n2) {
        return n < n2;
    }

    private static boolean IlllIIIIlll(int n) {
        return n <= 0;
    }

    private static int IIllIIIIlll(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    static class FastScanner {
        private Reader input;
        private static String[] llIIIIIIIl;
        private static int[] IIlIIIIIIl;

        public FastScanner() {
            IIlIlllllIlll(System.in);
            FastScanner IIlIlllllIlll;
        }

        /*
         * WARNING - void declaration
         */
        public FastScanner(InputStream IIIIlllllIlll) {
            void var1_1;
            FastScanner lIIIlllllIlll;
            this.input = new BufferedReader(new InputStreamReader((InputStream)var1_1));
        }

        public void close() {
            try {
                FastScanner lIllIllllIlll;
                lIllIllllIlll.input.close();
                "".length();
            }
            catch (IOException IIllIllllIlll) {
                IIllIllllIlll.printStackTrace();
            }
            if (null != null) {
                return;
            }
        }

        /*
         * WARNING - void declaration
         */
        public int nextInt() {
            void var1_1;
            FastScanner lIIlIllllIlll;
            long IIIlIllllIlll = lIIlIllllIlll.nextLong();
            if (!FastScanner.llIIlIIIlll(FastScanner.IlIIlIIIlll(IIIlIllllIlll, Integer.MIN_VALUE)) || FastScanner.IIlIlIIIlll(FastScanner.IlIIlIIIlll(IIIlIllllIlll, Integer.MAX_VALUE))) {
                throw new NumberFormatException();
            }
            return (int)var1_1;
        }

        public long nextLong() {
            try {
                FastScanner llIIIllllIlll;
                int IlIIIllllIlll = IIlIIIIIIl[0];
                int lIIIIllllIlll = llIIIllllIlll.input.read();
                while ((!FastScanner.lIlIlIIIlll(lIIIIllllIlll, IIlIIIIIIl[1]) || FastScanner.IllIlIIIlll(IIlIIIIIIl[2], lIIIIllllIlll)) && FastScanner.lllIlIIIlll(lIIIIllllIlll, IIlIIIIIIl[3]) && FastScanner.lllIlIIIlll(lIIIIllllIlll, IIlIIIIIIl[4])) {
                    lIIIIllllIlll = llIIIllllIlll.input.read();
                    "".length();
                    if (-"   ".length() < 0) continue;
                    return 0L;
                }
                if (FastScanner.IIIllIIIlll(lIIIIllllIlll, IIlIIIIIIl[3])) {
                    IlIIIllllIlll = IIlIIIIIIl[5];
                    lIIIIllllIlll = llIIIllllIlll.input.read();
                    "".length();
                    if ("   ".length() == 0) {
                        return 0L;
                    }
                } else if (FastScanner.IIIllIIIlll(lIIIIllllIlll, IIlIIIIIIl[4])) {
                    lIIIIllllIlll = llIIIllllIlll.input.read();
                }
                long IIIIIllllIlll = lIIIIllllIlll - IIlIIIIIIl[1];
                do {
                    if (!FastScanner.lIlIlIIIlll(lIIIIllllIlll = llIIIllllIlll.input.read(), IIlIIIIIIl[1]) || FastScanner.IllIlIIIlll(IIlIIIIIIl[2], lIIIIllllIlll)) {
                        return IIIIIllllIlll * (long)IlIIIllllIlll;
                    }
                    IIIIIllllIlll *= 10L;
                    IIIIIllllIlll += (long)(lIIIIllllIlll - IIlIIIIIIl[1]);
                    "".length();
                } while (((0xEF ^ 0xAC) & ~(0x82 ^ 0xC1)) == 0);
                return 0L;
            }
            catch (IOException IlIIIllllIlll) {
                IlIIIllllIlll.printStackTrace();
                return -1L;
            }
        }

        public double nextDouble() {
            try {
                FastScanner IlIllIlllIlll;
                double lIIllIlllIlll = 1.0;
                int IIIllIlllIlll = IlIllIlllIlll.input.read();
                while ((!FastScanner.lIlIlIIIlll(IIIllIlllIlll, IIlIIIIIIl[1]) || FastScanner.IllIlIIIlll(IIlIIIIIIl[2], IIIllIlllIlll)) && FastScanner.lllIlIIIlll(IIIllIlllIlll, IIlIIIIIIl[3]) && FastScanner.lllIlIIIlll(IIIllIlllIlll, IIlIIIIIIl[4])) {
                    IIIllIlllIlll = IlIllIlllIlll.input.read();
                    "".length();
                    if ((0x3B ^ 0x3E) != 0) continue;
                    return 0.0;
                }
                if (FastScanner.IIIllIIIlll(IIIllIlllIlll, IIlIIIIIIl[3])) {
                    lIIllIlllIlll = -1.0;
                    IIIllIlllIlll = IlIllIlllIlll.input.read();
                    "".length();
                    if (((0xFA ^ 0x83 ^ (0x5D ^ 0x44) << (" ".length() << " ".length())) & ((0xB9 ^ 0xA2) << " ".length() ^ (0x90 ^ 0xBB) ^ -" ".length())) != 0) {
                        return 0.0;
                    }
                } else if (FastScanner.IIIllIIIlll(IIIllIlllIlll, IIlIIIIIIl[4])) {
                    IIIllIlllIlll = IlIllIlllIlll.input.read();
                }
                double lllIlIlllIlll = IIIllIlllIlll - IIlIIIIIIl[1];
                while (FastScanner.lIlIlIIIlll(IIIllIlllIlll = IlIllIlllIlll.input.read(), IIlIIIIIIl[1])) {
                    if (FastScanner.IllIlIIIlll(IIlIIIIIIl[2], IIIllIlllIlll)) {
                        "".length();
                        if (-" ".length() != " ".length()) break;
                        return 0.0;
                    }
                    lllIlIlllIlll *= 10.0;
                    lllIlIlllIlll += (double)(IIIllIlllIlll - IIlIIIIIIl[1]);
                    "".length();
                    if ("   ".length() >= -" ".length()) continue;
                    return 0.0;
                }
                if (FastScanner.lllIlIIIlll(IIIllIlllIlll, IIlIIIIIIl[6])) {
                    return lIIllIlllIlll * lllIlIlllIlll;
                }
                double IllIlIlllIlll = 1.0;
                IIIllIlllIlll = IlIllIlllIlll.input.read();
                while (FastScanner.lIIllIIIlll(IIlIIIIIIl[1], IIIllIlllIlll) && FastScanner.lIIllIIIlll(IIIllIlllIlll, IIlIIIIIIl[2])) {
                    lllIlIlllIlll *= 10.0;
                    lllIlIlllIlll += (double)(IIIllIlllIlll - IIlIIIIIIl[1]);
                    IllIlIlllIlll *= 10.0;
                    IIIllIlllIlll = IlIllIlllIlll.input.read();
                    "".length();
                    if (((0x24 ^ 0x15) & ~(4 ^ 0x35)) == 0) continue;
                    return 0.0;
                }
                return lIIllIlllIlll * lllIlIlllIlll / IllIlIlllIlll;
            }
            catch (IOException lIIllIlllIlll) {
                lIIllIlllIlll.printStackTrace();
                return Double.NaN;
            }
        }

        public char nextChar() {
            try {
                FastScanner llIIlIlllIlll;
                int IlIIlIlllIlll = llIIlIlllIlll.input.read();
                while (FastScanner.IlIllIIIlll(Character.isWhitespace(IlIIlIlllIlll) ? 1 : 0)) {
                    IlIIlIlllIlll = llIIlIlllIlll.input.read();
                    "".length();
                    if (-"   ".length() < 0) continue;
                    return (char)((0x6E ^ 0x7F) << (" ".length() << " ".length()) & ~((0x59 ^ 0x48) << (" ".length() << " ".length())));
                }
                return (char)IlIIlIlllIlll;
            }
            catch (IOException IlIIlIlllIlll) {
                IlIIlIlllIlll.printStackTrace();
                return IIlIIIIIIl[7];
            }
        }

        public String nextStr() {
            try {
                FastScanner IlllIIlllIlll;
                StringBuilder lIllIIlllIlll = new StringBuilder();
                int IIllIIlllIlll = IlllIIlllIlll.input.read();
                while (FastScanner.IlIllIIIlll(Character.isWhitespace(IIllIIlllIlll) ? 1 : 0)) {
                    IIllIIlllIlll = IlllIIlllIlll.input.read();
                    "".length();
                    if (" ".length() << " ".length() >= 0) continue;
                    return null;
                }
                while (FastScanner.lllIlIIIlll(IIllIIlllIlll, IIlIIIIIIl[5]) && FastScanner.llIllIIIlll(Character.isWhitespace(IIllIIlllIlll) ? 1 : 0)) {
                    lIllIIlllIlll.append((char)IIllIIlllIlll);
                    "".length();
                    IIllIIlllIlll = IlllIIlllIlll.input.read();
                    "".length();
                    if (" ".length() >= ((0xC3 ^ 0xC4) << " ".length() & ~((0xB0 ^ 0xB7) << " ".length()))) continue;
                    return null;
                }
                return String.valueOf(lIllIIlllIlll);
            }
            catch (IOException lIllIIlllIlll) {
                lIllIIlllIlll.printStackTrace();
                return llIIIIIIIl[IIlIIIIIIl[7]];
            }
        }

        public String nextLine() {
            try {
                FastScanner IIIlIIlllIlll;
                StringBuilder lllIIIlllIlll = new StringBuilder();
                int IllIIIlllIlll = IIIlIIlllIlll.input.read();
                while (FastScanner.lllIlIIIlll(IllIIIlllIlll, IIlIIIIIIl[5]) && FastScanner.lllIlIIIlll(IllIIIlllIlll, IIlIIIIIIl[8])) {
                    lllIIIlllIlll.append((char)IllIIIlllIlll);
                    "".length();
                    IllIIIlllIlll = IIIlIIlllIlll.input.read();
                    "".length();
                    if (null == null) continue;
                    return null;
                }
                return String.valueOf(lllIIIlllIlll);
            }
            catch (IOException lllIIIlllIlll) {
                lllIIIlllIlll.printStackTrace();
                return llIIIIIIIl[IIlIIIIIIl[0]];
            }
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray(int IIIIIIlllIlll) {
            void var2_2;
            int[] llllllIllIlll = new int[IIIIIIlllIlll];
            int IlllllIllIlll = IIlIIIIIIl[7];
            while (FastScanner.IllIlIIIlll(IlllllIllIlll, IIIIIIlllIlll)) {
                FastScanner lIIIIIlllIlll;
                llllllIllIlll[IlllllIllIlll] = lIIIIIlllIlll.nextInt();
                ++IlllllIllIlll;
                "".length();
                if (null == null) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArrayDec(int IIIlllIllIlll) {
            void var2_2;
            int[] lllIllIllIlll = new int[IIIlllIllIlll];
            int IllIllIllIlll = IIlIIIIIIl[7];
            while (FastScanner.IllIlIIIlll(IllIllIllIlll, IIIlllIllIlll)) {
                FastScanner lIIlllIllIlll;
                lllIllIllIlll[IllIllIllIlll] = lIIlllIllIlll.nextInt() - IIlIIIIIIl[0];
                ++IllIllIllIlll;
                "".length();
                if (null == null) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray1Index(int IIIIllIllIlll) {
            void var2_2;
            int[] llllIlIllIlll = new int[IIIIllIllIlll + IIlIIIIIIl[0]];
            int IlllIlIllIlll = IIlIIIIIIl[7];
            while (FastScanner.IllIlIIIlll(IlllIlIllIlll, IIIIllIllIlll)) {
                FastScanner lIIIllIllIlll;
                llllIlIllIlll[IlllIlIllIlll + FastScanner.IIlIIIIIIl[0]] = lIIIllIllIlll.nextInt();
                ++IlllIlIllIlll;
                "".length();
                if (" ".length() << " ".length() <= "   ".length()) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray(int IIIlIlIllIlll) {
            void var2_2;
            long[] lllIIlIllIlll = new long[IIIlIlIllIlll];
            int IllIIlIllIlll = IIlIIIIIIl[7];
            while (FastScanner.IllIlIIIlll(IllIIlIllIlll, IIIlIlIllIlll)) {
                FastScanner lIIlIlIllIlll;
                lllIIlIllIlll[IllIIlIllIlll] = lIIlIlIllIlll.nextLong();
                ++IllIIlIllIlll;
                "".length();
                if (" ".length() != " ".length() << " ".length()) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArrayDec(int IIIIIlIllIlll) {
            void var2_2;
            long[] lllllIIllIlll = new long[IIIIIlIllIlll];
            int IllllIIllIlll = IIlIIIIIIl[7];
            while (FastScanner.IllIlIIIlll(IllllIIllIlll, IIIIIlIllIlll)) {
                FastScanner lIIIIlIllIlll;
                lllllIIllIlll[IllllIIllIlll] = lIIIIlIllIlll.nextLong() - 1L;
                ++IllllIIllIlll;
                "".length();
                if ((" ".length() & (" ".length() ^ -" ".length())) == 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray1Index(int IIIllIIllIlll) {
            void var2_2;
            long[] lllIlIIllIlll = new long[IIIllIIllIlll + IIlIIIIIIl[0]];
            int IllIlIIllIlll = IIlIIIIIIl[7];
            while (FastScanner.IllIlIIIlll(IllIlIIllIlll, IIIllIIllIlll)) {
                FastScanner lIIllIIllIlll;
                lllIlIIllIlll[IllIlIIllIlll + FastScanner.IIlIIIIIIl[0]] = lIIllIIllIlll.nextLong();
                ++IllIlIIllIlll;
                "".length();
                if (" ".length() << (" ".length() << " ".length()) > 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public double[] nextDoubleArray(int IIIIlIIllIlll) {
            void var2_2;
            double[] llllIIIllIlll = new double[IIIIlIIllIlll];
            int IlllIIIllIlll = IIlIIIIIIl[7];
            while (FastScanner.IllIlIIIlll(IlllIIIllIlll, IIIIlIIllIlll)) {
                FastScanner lIIIlIIllIlll;
                llllIIIllIlll[IlllIIIllIlll] = lIIIlIIllIlll.nextDouble();
                ++IlllIIIllIlll;
                "".length();
                if (-" ".length() <= 0) continue;
                return null;
            }
            return var2_2;
        }

        static {
            FastScanner.lIIIlIIIlll();
            FastScanner.IIIIlIIIlll();
        }

        private static void IIIIlIIIlll() {
            llIIIIIIIl = new String[IIlIIIIIIl[9]];
            FastScanner.llIIIIIIIl[FastScanner.IIlIIIIIIl[7]] = FastScanner.llllIIIIlll("22YtbVd9NnU=", "PoNLE");
            FastScanner.llIIIIIIIl[FastScanner.IIlIIIIIIl[0]] = FastScanner.llllIIIIlll("xtz08XS+CYE=", "GNJRk");
        }

        private static String llllIIIIlll(String lIIlIIIllIlll, String IIIlIIIllIlll) {
            try {
                SecretKeySpec lllIIIIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIIlIIIllIlll.getBytes(StandardCharsets.UTF_8)), IIlIIIIIIl[10]), "DES");
                Cipher IllIIIIllIlll = Cipher.getInstance("DES");
                IllIIIIllIlll.init(IIlIIIIIIl[9], lllIIIIllIlll);
                return new String(IllIIIIllIlll.doFinal(Base64.getDecoder().decode(lIIlIIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lIlIIIIllIlll) {
                lIlIIIIllIlll.printStackTrace();
                return null;
            }
        }

        private static void lIIIlIIIlll() {
            IIlIIIIIIl = new int[11];
            FastScanner.IIlIIIIIIl[0] = " ".length();
            FastScanner.IIlIIIIIIl[1] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.IIlIIIIIIl[2] = 0x2C ^ 0xB ^ (0x9E ^ 0x91) << " ".length();
            FastScanner.IIlIIIIIIl[3] = 0x26 ^ 0xB;
            FastScanner.IIlIIIIIIl[4] = (0x6F ^ 0x6A) << (0x10 ^ 0x15) ^ 122 + 129 - 242 + 130;
            FastScanner.IIlIIIIIIl[5] = -" ".length();
            FastScanner.IIlIIIIIIl[6] = ((0x4E ^ 0x27) << " ".length() ^ 23 + 20 - 21 + 175) << " ".length();
            FastScanner.IIlIIIIIIl[7] = (76 + 45 - 113 + 123 ^ (0xF9 ^ 0xAA) << " ".length()) << " ".length() & (((0x4E ^ 0x61) << (" ".length() << " ".length()) ^ 129 + 60 - 68 + 32) << " ".length() ^ -" ".length());
            FastScanner.IIlIIIIIIl[8] = (0x52 ^ 0x57) << " ".length();
            FastScanner.IIlIIIIIIl[9] = " ".length() << " ".length();
            FastScanner.IIlIIIIIIl[10] = " ".length() << "   ".length();
        }

        private static boolean IIIllIIIlll(int n, int n2) {
            return n == n2;
        }

        private static boolean lIlIlIIIlll(int n, int n2) {
            return n >= n2;
        }

        private static boolean IllIlIIIlll(int n, int n2) {
            return n < n2;
        }

        private static boolean lIIllIIIlll(int n, int n2) {
            return n <= n2;
        }

        private static boolean IlIllIIIlll(int n) {
            return n != 0;
        }

        private static boolean llIllIIIlll(int n) {
            return n == 0;
        }

        private static boolean llIIlIIIlll(int n) {
            return n >= 0;
        }

        private static boolean IIlIlIIIlll(int n) {
            return n > 0;
        }

        private static boolean lllIlIIIlll(int n, int n2) {
            return n != n2;
        }

        private static int IlIIlIIIlll(long l, long l2) {
            return l == l2 ? 0 : (l < l2 ? -1 : 1);
        }
    }
}

