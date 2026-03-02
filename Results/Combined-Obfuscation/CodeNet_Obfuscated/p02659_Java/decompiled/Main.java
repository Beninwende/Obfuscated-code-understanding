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
    private static String[] IlIIlIIIll;
    private static int[] IIlIlIIIll;

    public Main() {
        Main llllIIlllIlIlll;
    }

    void solve() {
        Main llIlIIlllIlIlll;
        long IlIlIIlllIlIlll = llIlIIlllIlIlll.in.nextLong();
        long lIIlIIlllIlIlll = Long.valueOf(llIlIIlllIlIlll.in.nextStr().replace(IlIIlIIIll[IIlIlIIIll[0]], IlIIlIIIll[IIlIlIIIll[1]]));
        llIlIIlllIlIlll.out.println(IlIlIIlllIlIlll * lIIlIIlllIlIlll / 100L);
    }

    public static void main(String[] stringArray) {
        new Main().m();
    }

    private void m() {
        Main lllIIIlllIlIlll;
        lllIIIlllIlIlll.in = new FastScanner(System.in);
        lllIIIlllIlIlll.out = new PrintWriter(System.out);
        lllIIIlllIlIlll.solve();
        lllIIIlllIlIlll.out.flush();
        lllIIIlllIlIlll.in.close();
        lllIIIlllIlIlll.out.close();
    }

    static {
        Main.lIIlllIIllIl();
        Main.IIIlllIIllIl();
        MOD = IIlIlIIIll[2];
    }

    private static void IIIlllIIllIl() {
        IlIIlIIIll = new String[IIlIlIIIll[3]];
        Main.IlIIlIIIll[Main.IIlIlIIIll[0]] = Main.lIlIllIIllIl("6LHulgoXiCE=", "oFJfk");
        Main.IlIIlIIIll[Main.IIlIlIIIll[1]] = Main.lIlIllIIllIl("2mYj7iX4pfc=", "DXhEv");
    }

    private static String lIlIllIIllIl(String IlIIIIlllIlIlll, String lIIIIIlllIlIlll) {
        try {
            SecretKeySpec IIIIIIlllIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIIlllIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllIllIlIlll = Cipher.getInstance("Blowfish");
            llllllIllIlIlll.init(IIlIlIIIll[3], IIIIIIlllIlIlll);
            return new String(llllllIllIlIlll.doFinal(Base64.getDecoder().decode(IlIIIIlllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlllllIllIlIlll) {
            IlllllIllIlIlll.printStackTrace();
            return null;
        }
    }

    private static void lIIlllIIllIl() {
        IIlIlIIIll = new int[4];
        Main.IIlIlIIIll[0] = (0xA6 ^ 0xB7 ^ (0x99 ^ 0xB2) << " ".length()) & ((0xAE ^ 0xA7) << (" ".length() << " ".length()) ^ (0xE3 ^ 0x80) ^ -" ".length());
        Main.IIlIlIIIll[1] = " ".length();
        Main.IIlIlIIIll[2] = 523979382 + 266589085 - 195458445 + 0x18222181;
        Main.IIlIlIIIll[3] = " ".length() << " ".length();
    }

    static class FastScanner {
        private Reader input;
        private static String[] llIIlIIIll;
        private static int[] lIlIlIIIll;

        public FastScanner() {
            IIIlllIllIlIlll(System.in);
            FastScanner IIIlllIllIlIlll;
        }

        /*
         * WARNING - void declaration
         */
        public FastScanner(InputStream IIlIllIllIlIlll) {
            void var1_1;
            FastScanner lIlIllIllIlIlll;
            this.input = new BufferedReader(new InputStreamReader((InputStream)var1_1));
        }

        public void close() {
            try {
                FastScanner lIIIllIllIlIlll;
                lIIIllIllIlIlll.input.close();
                "".length();
            }
            catch (IOException IIIIllIllIlIlll) {
                IIIIllIllIlIlll.printStackTrace();
            }
            if (-(0x3B ^ 0x3F) > 0) {
                return;
            }
        }

        /*
         * WARNING - void declaration
         */
        public int nextInt() {
            void var1_1;
            FastScanner lIllIlIllIlIlll;
            long IIllIlIllIlIlll = lIllIlIllIlIlll.nextLong();
            if (!FastScanner.IIllllIIllIl(FastScanner.llIlllIIllIl(IIllIlIllIlIlll, Integer.MIN_VALUE)) || FastScanner.lIllllIIllIl(FastScanner.llIlllIIllIl(IIllIlIllIlIlll, Integer.MAX_VALUE))) {
                throw new NumberFormatException();
            }
            return (int)var1_1;
        }

        public long nextLong() {
            try {
                FastScanner lllIIlIllIlIlll;
                int IllIIlIllIlIlll = lIlIlIIIll[0];
                int lIlIIlIllIlIlll = lllIIlIllIlIlll.input.read();
                while ((!FastScanner.IlllllIIllIl(lIlIIlIllIlIlll, lIlIlIIIll[1]) || FastScanner.llllllIIllIl(lIlIlIIIll[2], lIlIIlIllIlIlll)) && FastScanner.IIIIIIlIllIl(lIlIIlIllIlIlll, lIlIlIIIll[3]) && FastScanner.IIIIIIlIllIl(lIlIIlIllIlIlll, lIlIlIIIll[4])) {
                    lIlIIlIllIlIlll = lllIIlIllIlIlll.input.read();
                    "".length();
                    if (null == null) continue;
                    return 0L;
                }
                if (FastScanner.lIIIIIlIllIl(lIlIIlIllIlIlll, lIlIlIIIll[3])) {
                    IllIIlIllIlIlll = lIlIlIIIll[5];
                    lIlIIlIllIlIlll = lllIIlIllIlIlll.input.read();
                    "".length();
                    if (null != null) {
                        return 0L;
                    }
                } else if (FastScanner.lIIIIIlIllIl(lIlIIlIllIlIlll, lIlIlIIIll[4])) {
                    lIlIIlIllIlIlll = lllIIlIllIlIlll.input.read();
                }
                long IIlIIlIllIlIlll = lIlIIlIllIlIlll - lIlIlIIIll[1];
                do {
                    if (!FastScanner.IlllllIIllIl(lIlIIlIllIlIlll = lllIIlIllIlIlll.input.read(), lIlIlIIIll[1]) || FastScanner.llllllIIllIl(lIlIlIIIll[2], lIlIIlIllIlIlll)) {
                        return IIlIIlIllIlIlll * (long)IllIIlIllIlIlll;
                    }
                    IIlIIlIllIlIlll *= 10L;
                    IIlIIlIllIlIlll += (long)(lIlIIlIllIlIlll - lIlIlIIIll[1]);
                    "".length();
                } while (("   ".length() << (" ".length() << (" ".length() << " ".length())) & ("   ".length() << (" ".length() << (" ".length() << " ".length())) ^ -" ".length())) == 0);
                return 0L;
            }
            catch (IOException IllIIlIllIlIlll) {
                IllIIlIllIlIlll.printStackTrace();
                return -1L;
            }
        }

        public double nextDouble() {
            try {
                FastScanner IllllIIllIlIlll;
                double lIlllIIllIlIlll = 1.0;
                int IIlllIIllIlIlll = IllllIIllIlIlll.input.read();
                while ((!FastScanner.IlllllIIllIl(IIlllIIllIlIlll, lIlIlIIIll[1]) || FastScanner.llllllIIllIl(lIlIlIIIll[2], IIlllIIllIlIlll)) && FastScanner.IIIIIIlIllIl(IIlllIIllIlIlll, lIlIlIIIll[3]) && FastScanner.IIIIIIlIllIl(IIlllIIllIlIlll, lIlIlIIIll[4])) {
                    IIlllIIllIlIlll = IllllIIllIlIlll.input.read();
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) == " ".length() << (" ".length() << " ".length())) continue;
                    return 0.0;
                }
                if (FastScanner.lIIIIIlIllIl(IIlllIIllIlIlll, lIlIlIIIll[3])) {
                    lIlllIIllIlIlll = -1.0;
                    IIlllIIllIlIlll = IllllIIllIlIlll.input.read();
                    "".length();
                    if (-" ".length() >= 0) {
                        return 0.0;
                    }
                } else if (FastScanner.lIIIIIlIllIl(IIlllIIllIlIlll, lIlIlIIIll[4])) {
                    IIlllIIllIlIlll = IllllIIllIlIlll.input.read();
                }
                double llIllIIllIlIlll = IIlllIIllIlIlll - lIlIlIIIll[1];
                while (FastScanner.IlllllIIllIl(IIlllIIllIlIlll = IllllIIllIlIlll.input.read(), lIlIlIIIll[1])) {
                    if (FastScanner.llllllIIllIl(lIlIlIIIll[2], IIlllIIllIlIlll)) {
                        "".length();
                        if (((0xC2 ^ 0x89) << " ".length() ^ 32 + 22 - -84 + 9) != 0) break;
                        return 0.0;
                    }
                    llIllIIllIlIlll *= 10.0;
                    llIllIIllIlIlll += (double)(IIlllIIllIlIlll - lIlIlIIIll[1]);
                    "".length();
                    if (" ".length() << " ".length() == " ".length() << " ".length()) continue;
                    return 0.0;
                }
                if (FastScanner.IIIIIIlIllIl(IIlllIIllIlIlll, lIlIlIIIll[6])) {
                    return lIlllIIllIlIlll * llIllIIllIlIlll;
                }
                double IlIllIIllIlIlll = 1.0;
                IIlllIIllIlIlll = IllllIIllIlIlll.input.read();
                while (FastScanner.IlIIIIlIllIl(lIlIlIIIll[1], IIlllIIllIlIlll) && FastScanner.IlIIIIlIllIl(IIlllIIllIlIlll, lIlIlIIIll[2])) {
                    llIllIIllIlIlll *= 10.0;
                    llIllIIllIlIlll += (double)(IIlllIIllIlIlll - lIlIlIIIll[1]);
                    IlIllIIllIlIlll *= 10.0;
                    IIlllIIllIlIlll = IllllIIllIlIlll.input.read();
                    "".length();
                    if ((((0x8E ^ 0x9B) << "   ".length() ^ 94 + 67 - 134 + 156) & (0x97 ^ 0x9E ^ (0x42 ^ 0x49) << " ".length() ^ -" ".length())) == 0) continue;
                    return 0.0;
                }
                return lIlllIIllIlIlll * llIllIIllIlIlll / IlIllIIllIlIlll;
            }
            catch (IOException lIlllIIllIlIlll) {
                lIlllIIllIlIlll.printStackTrace();
                return Double.NaN;
            }
        }

        public char nextChar() {
            try {
                FastScanner lllIlIIllIlIlll;
                int IllIlIIllIlIlll = lllIlIIllIlIlll.input.read();
                while (FastScanner.llIIIIlIllIl(Character.isWhitespace(IllIlIIllIlIlll) ? 1 : 0)) {
                    IllIlIIllIlIlll = lllIlIIllIlIlll.input.read();
                    "".length();
                    if (((0x8E ^ 0xBD) & ~(0x88 ^ 0xBB)) == 0) continue;
                    return (char)((0x44 ^ 0x4B) << " ".length() & ~((0x69 ^ 0x66) << " ".length()));
                }
                return (char)IllIlIIllIlIlll;
            }
            catch (IOException IllIlIIllIlIlll) {
                IllIlIIllIlIlll.printStackTrace();
                return lIlIlIIIll[7];
            }
        }

        public String nextStr() {
            try {
                FastScanner IlIIlIIllIlIlll;
                StringBuilder lIIIlIIllIlIlll = new StringBuilder();
                int IIIIlIIllIlIlll = IlIIlIIllIlIlll.input.read();
                while (FastScanner.llIIIIlIllIl(Character.isWhitespace(IIIIlIIllIlIlll) ? 1 : 0)) {
                    IIIIlIIllIlIlll = IlIIlIIllIlIlll.input.read();
                    "".length();
                    if (" ".length() << " ".length() >= 0) continue;
                    return null;
                }
                while (FastScanner.IIIIIIlIllIl(IIIIlIIllIlIlll, lIlIlIIIll[5]) && FastScanner.IIlIIIlIllIl(Character.isWhitespace(IIIIlIIllIlIlll) ? 1 : 0)) {
                    lIIIlIIllIlIlll.append((char)IIIIlIIllIlIlll);
                    "".length();
                    IIIIlIIllIlIlll = IlIIlIIllIlIlll.input.read();
                    "".length();
                    if (" ".length() << " ".length() == " ".length() << " ".length()) continue;
                    return null;
                }
                return String.valueOf(lIIIlIIllIlIlll);
            }
            catch (IOException lIIIlIIllIlIlll) {
                lIIIlIIllIlIlll.printStackTrace();
                return llIIlIIIll[lIlIlIIIll[7]];
            }
        }

        public String nextLine() {
            try {
                FastScanner IIllIIIllIlIlll;
                StringBuilder llIlIIIllIlIlll = new StringBuilder();
                int IlIlIIIllIlIlll = IIllIIIllIlIlll.input.read();
                while (FastScanner.IIIIIIlIllIl(IlIlIIIllIlIlll, lIlIlIIIll[5]) && FastScanner.IIIIIIlIllIl(IlIlIIIllIlIlll, lIlIlIIIll[8])) {
                    llIlIIIllIlIlll.append((char)IlIlIIIllIlIlll);
                    "".length();
                    IlIlIIIllIlIlll = IIllIIIllIlIlll.input.read();
                    "".length();
                    if (null == null) continue;
                    return null;
                }
                return String.valueOf(llIlIIIllIlIlll);
            }
            catch (IOException llIlIIIllIlIlll) {
                llIlIIIllIlIlll.printStackTrace();
                return llIIlIIIll[lIlIlIIIll[0]];
            }
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray(int IIlIIIIllIlIlll) {
            void var2_2;
            int[] llIIIIIllIlIlll = new int[IIlIIIIllIlIlll];
            int IlIIIIIllIlIlll = lIlIlIIIll[7];
            while (FastScanner.llllllIIllIl(IlIIIIIllIlIlll, IIlIIIIllIlIlll)) {
                FastScanner lIlIIIIllIlIlll;
                llIIIIIllIlIlll[IlIIIIIllIlIlll] = lIlIIIIllIlIlll.nextInt();
                ++IlIIIIIllIlIlll;
                "".length();
                if ("   ".length() > ((0x4B ^ 0x4E ^ (0x20 ^ 0x31) << " ".length()) << " ".length() & (((0x56 ^ 0x73) << " ".length() ^ (0xE3 ^ 0x8E)) << " ".length() ^ -" ".length()))) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArrayDec(int IIlllllIlIlIlll) {
            void var2_2;
            int[] llIllllIlIlIlll = new int[IIlllllIlIlIlll];
            int IlIllllIlIlIlll = lIlIlIIIll[7];
            while (FastScanner.llllllIIllIl(IlIllllIlIlIlll, IIlllllIlIlIlll)) {
                FastScanner lIlllllIlIlIlll;
                llIllllIlIlIlll[IlIllllIlIlIlll] = lIlllllIlIlIlll.nextInt() - lIlIlIIIll[0];
                ++IlIllllIlIlIlll;
                "".length();
                if (null == null) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray1Index(int IIlIlllIlIlIlll) {
            void var2_2;
            int[] llIIlllIlIlIlll = new int[IIlIlllIlIlIlll + lIlIlIIIll[0]];
            int IlIIlllIlIlIlll = lIlIlIIIll[7];
            while (FastScanner.llllllIIllIl(IlIIlllIlIlIlll, IIlIlllIlIlIlll)) {
                FastScanner lIlIlllIlIlIlll;
                llIIlllIlIlIlll[IlIIlllIlIlIlll + FastScanner.lIlIlIIIll[0]] = lIlIlllIlIlIlll.nextInt();
                ++IlIIlllIlIlIlll;
                "".length();
                if (((0x3E ^ 9 ^ (0x19 ^ 8) << " ".length()) << " ".length() & ((0x6E ^ 3 ^ (0xAC ^ 0xA3) << "   ".length()) << " ".length() ^ -" ".length())) == 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray(int IIllIllIlIlIlll) {
            void var2_2;
            long[] llIlIllIlIlIlll = new long[IIllIllIlIlIlll];
            int IlIlIllIlIlIlll = lIlIlIIIll[7];
            while (FastScanner.llllllIIllIl(IlIlIllIlIlIlll, IIllIllIlIlIlll)) {
                FastScanner lIllIllIlIlIlll;
                llIlIllIlIlIlll[IlIlIllIlIlIlll] = lIllIllIlIlIlll.nextLong();
                ++IlIlIllIlIlIlll;
                "".length();
                if (((7 ^ 0x2A) << " ".length() & ~((0x8E ^ 0xA3) << " ".length())) >= 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArrayDec(int IIlIIllIlIlIlll) {
            void var2_2;
            long[] llIIIllIlIlIlll = new long[IIlIIllIlIlIlll];
            int IlIIIllIlIlIlll = lIlIlIIIll[7];
            while (FastScanner.llllllIIllIl(IlIIIllIlIlIlll, IIlIIllIlIlIlll)) {
                FastScanner lIlIIllIlIlIlll;
                llIIIllIlIlIlll[IlIIIllIlIlIlll] = lIlIIllIlIlIlll.nextLong() - 1L;
                ++IlIIIllIlIlIlll;
                "".length();
                if (((0x97 ^ 0x92 ^ (0xBD ^ 0xBA) << (" ".length() << " ".length())) & (0x98 ^ 0x8D ^ "   ".length() << (" ".length() << " ".length()) ^ -" ".length())) < "   ".length()) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray1Index(int IIlllIlIlIlIlll) {
            void var2_2;
            long[] llIllIlIlIlIlll = new long[IIlllIlIlIlIlll + lIlIlIIIll[0]];
            int IlIllIlIlIlIlll = lIlIlIIIll[7];
            while (FastScanner.llllllIIllIl(IlIllIlIlIlIlll, IIlllIlIlIlIlll)) {
                FastScanner lIlllIlIlIlIlll;
                llIllIlIlIlIlll[IlIllIlIlIlIlll + FastScanner.lIlIlIIIll[0]] = lIlllIlIlIlIlll.nextLong();
                ++IlIllIlIlIlIlll;
                "".length();
                if ((((0xBE ^ 0xA3) << (" ".length() << " ".length()) ^ (0x1C ^ 0x6D)) << (" ".length() << " ".length()) & ((0x5F ^ 0x28 ^ (0x48 ^ 0x71) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length())) == 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public double[] nextDoubleArray(int IIlIlIlIlIlIlll) {
            void var2_2;
            double[] llIIlIlIlIlIlll = new double[IIlIlIlIlIlIlll];
            int IlIIlIlIlIlIlll = lIlIlIIIll[7];
            while (FastScanner.llllllIIllIl(IlIIlIlIlIlIlll, IIlIlIlIlIlIlll)) {
                FastScanner lIlIlIlIlIlIlll;
                llIIlIlIlIlIlll[IlIIlIlIlIlIlll] = lIlIlIlIlIlIlll.nextDouble();
                ++IlIIlIlIlIlIlll;
                "".length();
                if (" ".length() << " ".length() <= "   ".length()) continue;
                return null;
            }
            return var2_2;
        }

        static {
            FastScanner.IlIlllIIllIl();
            FastScanner.lllIllIIllIl();
        }

        private static void lllIllIIllIl() {
            llIIlIIIll = new String[lIlIlIIIll[9]];
            FastScanner.llIIlIIIll[FastScanner.lIlIlIIIll[7]] = FastScanner.IllIllIIllIl("rF8VNkLr3O4=", "vBFrn");
            FastScanner.llIIlIIIll[FastScanner.lIlIlIIIll[0]] = FastScanner.IllIllIIllIl("gk2QMecEM8s=", "mZdRW");
        }

        private static String IllIllIIllIl(String lIllIIlIlIlIlll, String IIllIIlIlIlIlll) {
            try {
                SecretKeySpec llIlIIlIlIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIllIIlIlIlIlll.getBytes(StandardCharsets.UTF_8)), lIlIlIIIll[10]), "DES");
                Cipher IlIlIIlIlIlIlll = Cipher.getInstance("DES");
                IlIlIIlIlIlIlll.init(lIlIlIIIll[9], llIlIIlIlIlIlll);
                return new String(IlIlIIlIlIlIlll.doFinal(Base64.getDecoder().decode(lIllIIlIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lIIlIIlIlIlIlll) {
                lIIlIIlIlIlIlll.printStackTrace();
                return null;
            }
        }

        private static void IlIlllIIllIl() {
            lIlIlIIIll = new int[11];
            FastScanner.lIlIlIIIll[0] = " ".length();
            FastScanner.lIlIlIIIll[1] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.lIlIlIIIll[2] = 5 ^ 0x3C;
            FastScanner.lIlIlIIIll[3] = 7 ^ 0x2A;
            FastScanner.lIlIlIIIll[4] = 0xB2 ^ 0x99;
            FastScanner.lIlIlIIIll[5] = -" ".length();
            FastScanner.lIlIlIIIll[6] = (0x2A ^ 0x3D) << " ".length();
            FastScanner.lIlIlIIIll[7] = (150 + 30 - 119 + 90 ^ (0xD4 ^ 0x9B) << " ".length()) << " ".length() & ((0x9B ^ 0xC2 ^ (0x89 ^ 0x8C) << (" ".length() << (" ".length() << " ".length()))) << " ".length() ^ -" ".length());
            FastScanner.lIlIlIIIll[8] = (0 ^ 0x25 ^ " ".length() << (0x7A ^ 0x7F)) << " ".length();
            FastScanner.lIlIlIIIll[9] = " ".length() << " ".length();
            FastScanner.lIlIlIIIll[10] = " ".length() << "   ".length();
        }

        private static boolean lIIIIIlIllIl(int n, int n2) {
            return n == n2;
        }

        private static boolean IlllllIIllIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean llllllIIllIl(int n, int n2) {
            return n < n2;
        }

        private static boolean IlIIIIlIllIl(int n, int n2) {
            return n <= n2;
        }

        private static boolean llIIIIlIllIl(int n) {
            return n != 0;
        }

        private static boolean IIlIIIlIllIl(int n) {
            return n == 0;
        }

        private static boolean IIllllIIllIl(int n) {
            return n >= 0;
        }

        private static boolean lIllllIIllIl(int n) {
            return n > 0;
        }

        private static boolean IIIIIIlIllIl(int n, int n2) {
            return n != n2;
        }

        private static int llIlllIIllIl(long l, long l2) {
            return l == l2 ? 0 : (l < l2 ? -1 : 1);
        }
    }
}

