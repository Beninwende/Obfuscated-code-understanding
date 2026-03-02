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
    static final long INF = 0x3FFFFFFFFFFFFFFFL;
    private static String[] IllIIIIIl;
    private static int[] IIIlIIIIl;
    private static int[] lIIlIIIIl;

    public Main() {
        Main lIlIIlIlllIlll;
    }

    void solve() {
        String string;
        Main IIlllIIlllIlll;
        int llIllIIlllIlll = IIlllIIlllIlll.in.nextInt();
        int IlIllIIlllIlll = IIlllIIlllIlll.in.nextInt();
        long lIIllIIlllIlll = 0L;
        int[] IIIllIIlllIlll = IIlllIIlllIlll.in.nextIntArray(llIllIIlllIlll);
        int lllIlIIlllIlll = IIIlIIIIl[lIIlIIIIl[0]];
        while (Main.IllIIIIlll(Main.IlIIIIIlll((int)lllIlIIlllIlll, (int)llIllIIlllIlll) ? 1 : 0)) {
            lIIllIIlllIlll += (long)IIIllIIlllIlll[lllIlIIlllIlll];
            ++lllIlIIlllIlll;
            "".length();
            "".length();
            if (!Main.lllIIIIlll("   ".length())) continue;
            return;
        }
        lllIlIIlllIlll = IIIlIIIIl[lIIlIIIIl[0]];
        int IllIlIIlllIlll = IIIlIIIIl[lIIlIIIIl[0]];
        while (Main.IllIIIIlll(Main.IlIIIIIlll((int)IllIlIIlllIlll, (int)llIllIIlllIlll) ? 1 : 0)) {
            if (Main.IllIIIIlll(Main.llIIIIIlll((int)Main.lIIIIIIlll((long)IIlllIIlllIlll.ceil(lIIllIIlllIlll, IIIlIIIIl[lIIlIIIIl[1]] * IlIllIIlllIlll), (long)IIIllIIlllIlll[IllIlIIlllIlll])) ? 1 : 0)) {
                ++lllIlIIlllIlll;
            }
            ++IllIlIIlllIlll;
            "".length();
            "".length();
            if (!Main.IIIlIIIlll(null)) continue;
            return;
        }
        PrintWriter printWriter = IIlllIIlllIlll.out;
        if (Main.IllIIIIlll(Main.IIlIIIIlll((int)lllIlIIlllIlll, (int)IlIllIIlllIlll) ? 1 : 0)) {
            string = IllIIIIIl[IIIlIIIIl[lIIlIIIIl[0]]];
            "".length();
            "".length();
            if (Main.lllIIIIlll("   ".length())) {
                return;
            }
        } else {
            string = IllIIIIIl[IIIlIIIIl[lIIlIIIIl[2]]];
        }
        printWriter.println(string);
    }

    /*
     * WARNING - void declaration
     */
    long ceil(long IIllIIIlllIlll, long llIlIIIlllIlll) {
        void var3_2;
        return (IIllIIIlllIlll + var3_2 - 1L) / var3_2;
    }

    public static void main(String[] stringArray) {
        new Main().m();
    }

    private void m() {
        Main lllIIIIlllIlll;
        lllIIIIlllIlll.in = new FastScanner(System.in);
        lllIIIIlllIlll.out = new PrintWriter(System.out);
        lllIIIIlllIlll.solve();
        lllIIIIlllIlll.out.flush();
        lllIIIIlllIlll.in.close();
        lllIIIIlllIlll.out.close();
    }

    static {
        Main.lIlIIIIlll();
        Main.IIIIIIIlll();
        Main.lllllllIll();
        MOD = IIIlIIIIl[lIIlIIIIl[3]];
    }

    private static void lllllllIll() {
        IIIlIIIIl = new int[lIIlIIIIl[4]];
        Main.IIIlIIIIl[Main.lIIlIIIIl[0]] = ((lIIlIIIIl[5] ^ lIIlIIIIl[6]) << "   ".length() ^ lIIlIIIIl[7] + lIIlIIIIl[8] - lIIlIIIIl[9] + lIIlIIIIl[10]) << (" ".length() << " ".length()) & ((" ".length() << "   ".length() ^ (lIIlIIIIl[11] ^ lIIlIIIIl[12])) << (" ".length() << " ".length()) ^ -" ".length());
        Main.IIIlIIIIl[Main.lIIlIIIIl[1]] = " ".length() << (" ".length() << " ".length());
        Main.IIIlIIIIl[Main.lIIlIIIIl[2]] = " ".length();
        Main.IIIlIIIIl[Main.lIIlIIIIl[3]] = lIIlIIIIl[13] + lIIlIIIIl[14] - lIIlIIIIl[15] + lIIlIIIIl[16];
    }

    private static void IIIIIIIlll() {
        IllIIIIIl = new String[lIIlIIIIl[2]];
        Main.IllIIIIIl[Main.lIIlIIIIl[0]] = Main.IIlllllIll("cmH2l9Lr5mg=", "iwjka");
        Main.IllIIIIIl[Main.lIIlIIIIl[1]] = Main.IIlllllIll("kAPIYgQPCMo=", "lDgmN");
    }

    private static String IIlllllIll(String lIIIIIIlllIlll, String IIIIIIIlllIlll) {
        try {
            SecretKeySpec lllllllIllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIIIIIIlllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IllllllIllIlll = Cipher.getInstance("Blowfish");
            IllllllIllIlll.init(lIIlIIIIl[2], lllllllIllIlll);
            return new String(IllllllIllIlll.doFinal(Base64.getDecoder().decode(lIIIIIIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllllIllIlll) {
            lIlllllIllIlll.printStackTrace();
            return null;
        }
    }

    private static void lIlIIIIlll() {
        lIIlIIIIl = new int[17];
        Main.lIIlIIIIl[0] = (0xA6 ^ 0x89) << " ".length() & ~((0x46 ^ 0x69) << " ".length());
        Main.lIIlIIIIl[1] = " ".length();
        Main.lIIlIIIIl[2] = " ".length() << " ".length();
        Main.lIIlIIIIl[3] = "   ".length();
        Main.lIIlIIIIl[4] = " ".length() << (" ".length() << " ".length());
        Main.lIIlIIIIl[5] = 0xF ^ 0x66;
        Main.lIIlIIIIl[6] = ((0x23 ^ 0x36) << (" ".length() << " ".length()) ^ (0xCB ^ 0xA2)) << " ".length();
        Main.lIIlIIIIl[7] = (0x46 ^ 0x65) << (" ".length() << " ".length());
        Main.lIIlIIIIl[8] = 0xA ^ 0x6D;
        Main.lIIlIIIIl[9] = (0xEB ^ 0x9E) << " ".length();
        Main.lIIlIIIIl[10] = (0x67 ^ 0x46) << (" ".length() << " ".length());
        Main.lIIlIIIIl[11] = ((0x5D ^ 0x7A) << " ".length() ^ (0x3F ^ 0x66)) << (" ".length() << " ".length());
        Main.lIIlIIIIl[12] = 76 + 54 - 86 + 87 ^ (0x25 ^ 0x44) << " ".length();
        Main.lIIlIIIIl[13] = 1708237 + 30046427 - 16862999 + 21910764 << (" ".length() << (" ".length() << " ".length()));
        Main.lIIlIIIIl[14] = 55470512 + 42146789 - 25290821 + 118851271 << " ".length();
        Main.lIIlIIIIl[15] = (7772 + 157353 - 58658 + 274934 << (" ".length() << (" ".length() << " ".length()))) + (68292 + 89542 - 152636 + 650305 << (" ".length() << " ".length())) - (827208 + 610233 - 1253253 + 1002099) + (745336 + 597806 - 461116 + 163229 << " ".length()) << ("   ".length() << " ".length());
        Main.lIIlIIIIl[16] = 249590168 + 273434022 - 306790264 + 81545201 + (6371974 + 4121748 - 8611199 + 7680108 << ("   ".length() << " ".length())) - (831453 + 14490527 - -121182089 + 5949672 << (" ".length() << " ".length())) + (124955056 + 29746772 - 153379688 + 151211239 << " ".length());
    }

    private static boolean IIIlIIIlll(Object object) {
        return object != null;
    }

    private static boolean IllIIIIlll(int n) {
        return n != 0;
    }

    private static boolean lllIIIIlll(int n) {
        return n <= 0;
    }

    static class FastScanner {
        private Reader input;
        private static String[] lIlIIIIIl;
        private static int[] IlIlIIIIl;

        public FastScanner() {
            IIlllIllllIlll(System.in);
            FastScanner IIlllIllllIlll;
        }

        /*
         * WARNING - void declaration
         */
        public FastScanner(InputStream IIIllIllllIlll) {
            void var1_1;
            FastScanner lIIllIllllIlll;
            this.input = new BufferedReader(new InputStreamReader((InputStream)var1_1));
        }

        public void close() {
            try {
                FastScanner lIlIlIllllIlll;
                lIlIlIllllIlll.input.close();
                "".length();
            }
            catch (IOException IIlIlIllllIlll) {
                IIlIlIllllIlll.printStackTrace();
            }
            if (" ".length() << " ".length() <= 0) {
                return;
            }
        }

        public int nextInt() {
            FastScanner IlIIlIllllIlll;
            return (int)IlIIlIllllIlll.nextLong();
        }

        public long nextLong() {
            try {
                FastScanner lIllIIllllIlll;
                int IIllIIllllIlll = IlIlIIIIl[0];
                int llIlIIllllIlll = lIllIIllllIlll.input.read();
                while ((!FastScanner.IlIlIIIlll(llIlIIllllIlll, IlIlIIIIl[1]) || FastScanner.llIlIIIlll(IlIlIIIIl[2], llIlIIllllIlll)) && FastScanner.IIllIIIlll(llIlIIllllIlll, IlIlIIIIl[3]) && FastScanner.IIllIIIlll(llIlIIllllIlll, IlIlIIIIl[4])) {
                    llIlIIllllIlll = lIllIIllllIlll.input.read();
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) > " ".length() << " ".length()) continue;
                    return 0L;
                }
                if (FastScanner.lIllIIIlll(llIlIIllllIlll, IlIlIIIIl[3])) {
                    IIllIIllllIlll = IlIlIIIIl[5];
                    llIlIIllllIlll = lIllIIllllIlll.input.read();
                    "".length();
                    if (null != null) {
                        return 0L;
                    }
                } else if (FastScanner.lIllIIIlll(llIlIIllllIlll, IlIlIIIIl[4])) {
                    llIlIIllllIlll = lIllIIllllIlll.input.read();
                }
                long IlIlIIllllIlll = llIlIIllllIlll - IlIlIIIIl[1];
                do {
                    if (!FastScanner.IlIlIIIlll(llIlIIllllIlll = lIllIIllllIlll.input.read(), IlIlIIIIl[1]) || FastScanner.llIlIIIlll(IlIlIIIIl[2], llIlIIllllIlll)) {
                        return IlIlIIllllIlll * (long)IIllIIllllIlll;
                    }
                    IlIlIIllllIlll *= 10L;
                    IlIlIIllllIlll += (long)(llIlIIllllIlll - IlIlIIIIl[1]);
                    "".length();
                } while ((" ".length() << (" ".length() << " ".length()) ^ " ".length()) != 0);
                return 0L;
            }
            catch (IOException IIllIIllllIlll) {
                IIllIIllllIlll.printStackTrace();
                return -1L;
            }
        }

        public double nextDouble() {
            try {
                FastScanner IIlIIIllllIlll;
                double llIIIIllllIlll = 1.0;
                int IlIIIIllllIlll = IIlIIIllllIlll.input.read();
                while ((!FastScanner.IlIlIIIlll(IlIIIIllllIlll, IlIlIIIIl[1]) || FastScanner.llIlIIIlll(IlIlIIIIl[2], IlIIIIllllIlll)) && FastScanner.IIllIIIlll(IlIIIIllllIlll, IlIlIIIIl[3]) && FastScanner.IIllIIIlll(IlIIIIllllIlll, IlIlIIIIl[4])) {
                    IlIIIIllllIlll = IIlIIIllllIlll.input.read();
                    "".length();
                    if (-" ".length() <= ((0x91 ^ 0xB8) << " ".length() & ~((0xA1 ^ 0x88) << " ".length()))) continue;
                    return 0.0;
                }
                if (FastScanner.lIllIIIlll(IlIIIIllllIlll, IlIlIIIIl[3])) {
                    llIIIIllllIlll = -1.0;
                    IlIIIIllllIlll = IIlIIIllllIlll.input.read();
                    "".length();
                    if ((0xAB ^ 0xAE) <= 0) {
                        return 0.0;
                    }
                } else if (FastScanner.lIllIIIlll(IlIIIIllllIlll, IlIlIIIIl[4])) {
                    IlIIIIllllIlll = IIlIIIllllIlll.input.read();
                }
                double lIIIIIllllIlll = IlIIIIllllIlll - IlIlIIIIl[1];
                while (FastScanner.IlIlIIIlll(IlIIIIllllIlll = IIlIIIllllIlll.input.read(), IlIlIIIIl[1])) {
                    if (FastScanner.llIlIIIlll(IlIlIIIIl[2], IlIIIIllllIlll)) {
                        "".length();
                        if ("   ".length() > -" ".length()) break;
                        return 0.0;
                    }
                    lIIIIIllllIlll *= 10.0;
                    lIIIIIllllIlll += (double)(IlIIIIllllIlll - IlIlIIIIl[1]);
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) != 0) continue;
                    return 0.0;
                }
                if (FastScanner.IIllIIIlll(IlIIIIllllIlll, IlIlIIIIl[6])) {
                    return llIIIIllllIlll * lIIIIIllllIlll;
                }
                double IIIIIIllllIlll = 1.0;
                IlIIIIllllIlll = IIlIIIllllIlll.input.read();
                while (FastScanner.IlllIIIlll(IlIlIIIIl[1], IlIIIIllllIlll) && FastScanner.IlllIIIlll(IlIIIIllllIlll, IlIlIIIIl[2])) {
                    lIIIIIllllIlll *= 10.0;
                    lIIIIIllllIlll += (double)(IlIIIIllllIlll - IlIlIIIIl[1]);
                    IIIIIIllllIlll *= 10.0;
                    IlIIIIllllIlll = IIlIIIllllIlll.input.read();
                    "".length();
                    if (" ".length() << " ".length() == " ".length() << " ".length()) continue;
                    return 0.0;
                }
                return llIIIIllllIlll * lIIIIIllllIlll / IIIIIIllllIlll;
            }
            catch (IOException llIIIIllllIlll) {
                llIIIIllllIlll.printStackTrace();
                return Double.NaN;
            }
        }

        public char nextChar() {
            try {
                FastScanner lIllllIlllIlll;
                int IIllllIlllIlll = lIllllIlllIlll.input.read();
                while (FastScanner.llllIIIlll(Character.isWhitespace(IIllllIlllIlll) ? 1 : 0)) {
                    IIllllIlllIlll = lIllllIlllIlll.input.read();
                    "".length();
                    if (-(0x35 ^ 0x31) < 0) continue;
                    return (char)(" ".length() << " ".length() & ~(" ".length() << " ".length()));
                }
                return (char)IIllllIlllIlll;
            }
            catch (IOException IIllllIlllIlll) {
                IIllllIlllIlll.printStackTrace();
                return IlIlIIIIl[7];
            }
        }

        public String nextStr() {
            try {
                FastScanner IIIlllIlllIlll;
                StringBuilder lllIllIlllIlll = new StringBuilder();
                int IllIllIlllIlll = IIIlllIlllIlll.input.read();
                while (FastScanner.llllIIIlll(Character.isWhitespace(IllIllIlllIlll) ? 1 : 0)) {
                    IllIllIlllIlll = IIIlllIlllIlll.input.read();
                    "".length();
                    if (((0xA ^ 0x2F ^ " ".length() << (" ".length() << " ".length())) & (0xA ^ 5 ^ (0x55 ^ 0x42) << " ".length() ^ -" ".length())) >= 0) continue;
                    return null;
                }
                while (FastScanner.IIllIIIlll(IllIllIlllIlll, IlIlIIIIl[5]) && FastScanner.IIIIlIIlll(Character.isWhitespace(IllIllIlllIlll) ? 1 : 0)) {
                    lllIllIlllIlll.append((char)IllIllIlllIlll);
                    "".length();
                    IllIllIlllIlll = IIIlllIlllIlll.input.read();
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) != 0) continue;
                    return null;
                }
                return String.valueOf(lllIllIlllIlll);
            }
            catch (IOException lllIllIlllIlll) {
                lllIllIlllIlll.printStackTrace();
                return lIlIIIIIl[IlIlIIIIl[7]];
            }
        }

        public String nextLine() {
            try {
                FastScanner IlIIllIlllIlll;
                StringBuilder lIIIllIlllIlll = new StringBuilder();
                int IIIIllIlllIlll = IlIIllIlllIlll.input.read();
                while (FastScanner.IIllIIIlll(IIIIllIlllIlll, IlIlIIIIl[5]) && FastScanner.IIllIIIlll(IIIIllIlllIlll, IlIlIIIIl[8])) {
                    lIIIllIlllIlll.append((char)IIIIllIlllIlll);
                    "".length();
                    IIIIllIlllIlll = IlIIllIlllIlll.input.read();
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) > 0) continue;
                    return null;
                }
                return String.valueOf(lIIIllIlllIlll);
            }
            catch (IOException lIIIllIlllIlll) {
                lIIIllIlllIlll.printStackTrace();
                return lIlIIIIIl[IlIlIIIIl[0]];
            }
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray(int IlIlIlIlllIlll) {
            void var2_2;
            int[] lIIlIlIlllIlll = new int[IlIlIlIlllIlll];
            int IIIlIlIlllIlll = IlIlIIIIl[7];
            while (FastScanner.llIlIIIlll(IIIlIlIlllIlll, IlIlIlIlllIlll)) {
                FastScanner llIlIlIlllIlll;
                lIIlIlIlllIlll[IIIlIlIlllIlll] = llIlIlIlllIlll.nextInt();
                ++IIIlIlIlllIlll;
                "".length();
                if (((0x41 ^ 0x14) & ~(0x40 ^ 0x15)) > -" ".length()) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArrayDec(int lllIIllIllIlll) {
            void var2_2;
            int[] IllIIllIllIlll = new int[lllIIllIllIlll];
            int lIlIIllIllIlll = IlIlIIIIl[7];
            while (FastScanner.llIlIIIlll(lIlIIllIllIlll, lllIIllIllIlll)) {
                FastScanner IIIlIllIllIlll;
                IllIIllIllIlll[lIlIIllIllIlll] = IIIlIllIllIlll.nextInt() - IlIlIIIIl[0];
                ++lIlIIllIllIlll;
                "".length();
                if (-(7 ^ 0x7E ^ (0x31 ^ 0x4C)) <= 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray1Index(int lllllIlIllIlll) {
            void var2_2;
            int[] IllllIlIllIlll = new int[lllllIlIllIlll + IlIlIIIIl[0]];
            int lIlllIlIllIlll = IlIlIIIIl[7];
            while (FastScanner.llIlIIIlll(lIlllIlIllIlll, lllllIlIllIlll)) {
                FastScanner IIIIIllIllIlll;
                IllllIlIllIlll[lIlllIlIllIlll + FastScanner.IlIlIIIIl[0]] = IIIIIllIllIlll.nextInt();
                ++lIlllIlIllIlll;
                "".length();
                if (" ".length() << (" ".length() << " ".length()) != 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray(int lllIlIlIllIlll) {
            void var2_2;
            long[] IllIlIlIllIlll = new long[lllIlIlIllIlll];
            int lIlIlIlIllIlll = IlIlIIIIl[7];
            while (FastScanner.llIlIIIlll(lIlIlIlIllIlll, lllIlIlIllIlll)) {
                FastScanner IIIllIlIllIlll;
                IllIlIlIllIlll[lIlIlIlIllIlll] = IIIllIlIllIlll.nextLong();
                ++lIlIlIlIllIlll;
                "".length();
                if ((((0xA2 ^ 0x8D) << (" ".length() << " ".length()) ^ 146 + 102 - 208 + 143) << "   ".length() & ((91 + 68 - 83 + 103 ^ (0x53 ^ 0x44) << "   ".length()) << "   ".length() ^ -" ".length())) == (((0x33 ^ 0x3A) << " ".length() ^ (0xAF ^ 0xB6)) << (" ".length() << " ".length()) & ((0xC2 ^ 0x87 ^ (0x13 ^ 0x34) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length()))) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArrayDec(int llllIIlIllIlll) {
            void var2_2;
            long[] IlllIIlIllIlll = new long[llllIIlIllIlll];
            int lIllIIlIllIlll = IlIlIIIIl[7];
            while (FastScanner.llIlIIIlll(lIllIIlIllIlll, llllIIlIllIlll)) {
                FastScanner IIIIlIlIllIlll;
                IlllIIlIllIlll[lIllIIlIllIlll] = IIIIlIlIllIlll.nextLong() - 1L;
                ++lIllIIlIllIlll;
                "".length();
                if (" ".length() > 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray1Index(int lllIIIlIllIlll) {
            void var2_2;
            long[] IllIIIlIllIlll = new long[lllIIIlIllIlll + IlIlIIIIl[0]];
            int lIlIIIlIllIlll = IlIlIIIIl[7];
            while (FastScanner.llIlIIIlll(lIlIIIlIllIlll, lllIIIlIllIlll)) {
                FastScanner IIIlIIlIllIlll;
                IllIIIlIllIlll[lIlIIIlIllIlll + FastScanner.IlIlIIIIl[0]] = IIIlIIlIllIlll.nextLong();
                ++lIlIIIlIllIlll;
                "".length();
                if (-" ".length() >= -" ".length()) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public double[] nextDoubleArray(int llllllIIllIlll) {
            void var2_2;
            double[] IlllllIIllIlll = new double[llllllIIllIlll];
            int lIllllIIllIlll = IlIlIIIIl[7];
            while (FastScanner.llIlIIIlll(lIllllIIllIlll, llllllIIllIlll)) {
                FastScanner IIIIIIlIllIlll;
                IlllllIIllIlll[lIllllIIllIlll] = IIIIIIlIllIlll.nextDouble();
                ++lIllllIIllIlll;
                "".length();
                if (-((0x39 ^ 0x68) << " ".length() ^ 105 + 43 - 138 + 157) < 0) continue;
                return null;
            }
            return var2_2;
        }

        static {
            FastScanner.lIIlIIIlll();
            FastScanner.IllllllIll();
        }

        private static void IllllllIll() {
            lIlIIIIIl = new String[IlIlIIIIl[9]];
            FastScanner.lIlIIIIIl[FastScanner.IlIlIIIIl[7]] = FastScanner.llIllllIll("SaCYBFWssug=", "PqmsC");
            FastScanner.lIlIIIIIl[FastScanner.IlIlIIIIl[0]] = FastScanner.lIlllllIll("49+3gdLsjAY=", "kkHZQ");
        }

        private static String llIllllIll(String IIIlllIIllIlll, String lllIllIIllIlll) {
            try {
                SecretKeySpec IllIllIIllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIllIIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                Cipher lIlIllIIllIlll = Cipher.getInstance("Blowfish");
                lIlIllIIllIlll.init(IlIlIIIIl[9], IllIllIIllIlll);
                return new String(lIlIllIIllIlll.doFinal(Base64.getDecoder().decode(IIIlllIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception IIlIllIIllIlll) {
                IIlIllIIllIlll.printStackTrace();
                return null;
            }
        }

        private static String lIlllllIll(String llIlIlIIllIlll, String IlIlIlIIllIlll) {
            try {
                SecretKeySpec lIIlIlIIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlIlIlIIllIlll.getBytes(StandardCharsets.UTF_8)), IlIlIIIIl[10]), "DES");
                Cipher IIIlIlIIllIlll = Cipher.getInstance("DES");
                IIIlIlIIllIlll.init(IlIlIIIIl[9], lIIlIlIIllIlll);
                return new String(IIIlIlIIllIlll.doFinal(Base64.getDecoder().decode(llIlIlIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllIIlIIllIlll) {
                lllIIlIIllIlll.printStackTrace();
                return null;
            }
        }

        private static void lIIlIIIlll() {
            IlIlIIIIl = new int[11];
            FastScanner.IlIlIIIIl[0] = " ".length();
            FastScanner.IlIlIIIIl[1] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.IlIlIIIIl[2] = (0x3C ^ 0x2B) << "   ".length() ^ 28 + 51 - -42 + 8;
            FastScanner.IlIlIIIIl[3] = (0x1B ^ 0x20) << " ".length() ^ (0xD1 ^ 0x8A);
            FastScanner.IlIlIIIIl[4] = 0x20 ^ 0xB;
            FastScanner.IlIlIIIIl[5] = -" ".length();
            FastScanner.IlIlIIIIl[6] = (0x43 ^ 0x54) << " ".length();
            FastScanner.IlIlIIIIl[7] = (0x4A ^ 0x7B) & ~(0x55 ^ 0x64);
            FastScanner.IlIlIIIIl[8] = ((0x1C ^ 1) << " ".length() ^ (0x2C ^ 0x13)) << " ".length();
            FastScanner.IlIlIIIIl[9] = " ".length() << " ".length();
            FastScanner.IlIlIIIIl[10] = " ".length() << "   ".length();
        }

        private static boolean lIllIIIlll(int n, int n2) {
            return n == n2;
        }

        private static boolean IlIlIIIlll(int n, int n2) {
            return n >= n2;
        }

        private static boolean llIlIIIlll(int n, int n2) {
            return n < n2;
        }

        private static boolean IlllIIIlll(int n, int n2) {
            return n <= n2;
        }

        private static boolean llllIIIlll(int n) {
            return n != 0;
        }

        private static boolean IIIIlIIlll(int n) {
            return n == 0;
        }

        private static boolean IIllIIIlll(int n, int n2) {
            return n != n2;
        }
    }
}

