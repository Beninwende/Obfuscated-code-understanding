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
    private static String[] lllllIIIIl;
    private static int[] lIIIIlIIIl;

    public Main() {
        Main IIIIIlllIlIll;
    }

    void solve() {
        Main IIIllIllIlIll;
        int lllIlIllIlIll = IIIllIllIlIll.in.nextInt();
        String[] IllIlIllIlIll = new String[lllIlIllIlIll];
        int lIlIlIllIlIll22 = lIIIIlIIIl[0];
        while (Main.llIIlllIlll(lIlIlIllIlIll22, lllIlIllIlIll)) {
            IllIlIllIlIll[lIlIlIllIlIll22] = IIIllIllIlIll.in.nextStr();
            ++lIlIlIllIlIll22;
            "".length();
            if (" ".length() << (" ".length() << " ".length()) != " ".length()) continue;
            return;
        }
        String[] stringArray = new String[lIIIIlIIIl[1]];
        stringArray[Main.lIIIIlIIIl[0]] = lllllIIIIl[lIIIIlIIIl[0]];
        stringArray[Main.lIIIIlIIIl[2]] = lllllIIIIl[lIIIIlIIIl[2]];
        stringArray[Main.lIIIIlIIIl[3]] = lllllIIIIl[lIIIIlIIIl[3]];
        stringArray[Main.lIIIIlIIIl[4]] = lllllIIIIl[lIIIIlIIIl[4]];
        String[] lIlIlIllIlIll22 = stringArray;
        int[] IIlIlIllIlIll = new int[lIlIlIllIlIll22.length];
        int llIIlIllIlIll = lIIIIlIIIl[0];
        while (Main.llIIlllIlll(llIIlIllIlIll, lllIlIllIlIll)) {
            int IlIIlIllIlIll = lIIIIlIIIl[0];
            while (Main.llIIlllIlll(IlIIlIllIlIll, lIlIlIllIlIll22.length)) {
                if (Main.IIlIlllIlll(IllIlIllIlIll[llIIlIllIlIll].equals(lIlIlIllIlIll22[IlIIlIllIlIll]) ? 1 : 0)) {
                    int n = IlIIlIllIlIll;
                    IIlIlIllIlIll[n] = IIlIlIllIlIll[n] + lIIIIlIIIl[2];
                }
                ++IlIIlIllIlIll;
                "".length();
                if ("   ".length() > " ".length()) continue;
                return;
            }
            ++llIIlIllIlIll;
            "".length();
            if (" ".length() << " ".length() == " ".length() << " ".length()) continue;
            return;
        }
        llIIlIllIlIll = lIIIIlIIIl[0];
        while (Main.llIIlllIlll(llIIlIllIlIll, lIlIlIllIlIll22.length)) {
            IIIllIllIlIll.out.println(lIlIlIllIlIll22[llIIlIllIlIll] + " x " + IIlIlIllIlIll[llIIlIllIlIll]);
            ++llIIlIllIlIll;
            "".length();
            if (-(20 + 68 - 24 + 107 ^ 41 + 121 - 20 + 33) <= 0) continue;
            return;
        }
    }

    public static void main(String[] stringArray) {
        new Main().m();
    }

    private void m() {
        Main IIIIlIllIlIll;
        IIIIlIllIlIll.in = new FastScanner(System.in);
        IIIIlIllIlIll.out = new PrintWriter(System.out);
        IIIIlIllIlIll.solve();
        IIIIlIllIlIll.out.flush();
        IIIIlIllIlIll.in.close();
        IIIIlIllIlIll.out.close();
    }

    static {
        Main.IlIIlllIlll();
        Main.IIIIlllIlll();
        MOD = lIIIIlIIIl[5];
    }

    private static void IIIIlllIlll() {
        lllllIIIIl = new String[lIIIIlIIIl[1]];
        Main.lllllIIIIl[Main.lIIIIlIIIl[0]] = Main.IIllIllIlll("iBWDG+K9CnY=", "DemJw");
        Main.lllllIIIIl[Main.lIIIIlIIIl[2]] = Main.llllIllIlll("fbq5hWIx+jE=", "PZrKi");
        Main.lllllIIIIl[Main.lIIIIlIIIl[3]] = Main.IIllIllIlll("S2mkpA/omSM=", "dVYwm");
        Main.lllllIIIIl[Main.lIIIIlIIIl[4]] = Main.llllIllIlll("j766ehhb+mw=", "RCseo");
    }

    private static String llllIllIlll(String llIlIIllIlIll, String IlIlIIllIlIll) {
        try {
            SecretKeySpec lIIlIIllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlIlIIllIlIll.getBytes(StandardCharsets.UTF_8)), lIIIIlIIIl[6]), "DES");
            Cipher IIIlIIllIlIll = Cipher.getInstance("DES");
            IIIlIIllIlIll.init(lIIIIlIIIl[3], lIIlIIllIlIll);
            return new String(IIIlIIllIlIll.doFinal(Base64.getDecoder().decode(llIlIIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIIllIlIll) {
            lllIIIllIlIll.printStackTrace();
            return null;
        }
    }

    private static String IIllIllIlll(String IlllllIlIlIll, String lIllllIlIlIll) {
        try {
            SecretKeySpec IIllllIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllllIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlllIlIlIll = Cipher.getInstance("Blowfish");
            llIlllIlIlIll.init(lIIIIlIIIl[3], IIllllIlIlIll);
            return new String(llIlllIlIlIll.doFinal(Base64.getDecoder().decode(IlllllIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIlllIlIlIll) {
            IlIlllIlIlIll.printStackTrace();
            return null;
        }
    }

    private static void IlIIlllIlll() {
        lIIIIlIIIl = new int[7];
        Main.lIIIIlIIIl[0] = (0x16 ^ 0x79 ^ (0x19 ^ 0x2A) << " ".length()) << (" ".length() << " ".length()) & (((0x56 ^ 0x73) << (" ".length() << " ".length()) ^ 137 + 125 - 163 + 58) << (" ".length() << " ".length()) ^ -" ".length());
        Main.lIIIIlIIIl[1] = " ".length() << (" ".length() << " ".length());
        Main.lIIIIlIIIl[2] = " ".length();
        Main.lIIIIlIIIl[3] = " ".length() << " ".length();
        Main.lIIIIlIIIl[4] = "   ".length();
        Main.lIIIIlIIIl[5] = 212582527 + 400868468 - -327324126 + 59224886;
        Main.lIIIIlIIIl[6] = " ".length() << "   ".length();
    }

    private static boolean llIIlllIlll(int n, int n2) {
        return n < n2;
    }

    private static boolean IIlIlllIlll(int n) {
        return n != 0;
    }

    static class FastScanner {
        private Reader input;
        private static String[] IIIIIlIIIl;
        private static int[] IlIIIlIIIl;

        public FastScanner() {
            IlllIlIlIlIll(System.in);
            FastScanner IlllIlIlIlIll;
        }

        /*
         * WARNING - void declaration
         */
        public FastScanner(InputStream IlIlIlIlIlIll) {
            void var1_1;
            FastScanner llIlIlIlIlIll;
            this.input = new BufferedReader(new InputStreamReader((InputStream)var1_1));
        }

        public void close() {
            try {
                FastScanner lllIIlIlIlIll;
                lllIIlIlIlIll.input.close();
                "".length();
            }
            catch (IOException IllIIlIlIlIll) {
                IllIIlIlIlIll.printStackTrace();
            }
            if (((0x3B ^ 0x20) & ~(0xA1 ^ 0xBA)) < 0) {
                return;
            }
        }

        /*
         * WARNING - void declaration
         */
        public int nextInt() {
            void var1_1;
            FastScanner llIIIlIlIlIll;
            long IlIIIlIlIlIll = llIIIlIlIlIll.nextLong();
            if (!FastScanner.lllIlllIlll(FastScanner.IllIlllIlll(IlIIIlIlIlIll, Integer.MIN_VALUE)) || FastScanner.IIIllllIlll(FastScanner.IllIlllIlll(IlIIIlIlIlIll, Integer.MAX_VALUE))) {
                throw new NumberFormatException();
            }
            return (int)var1_1;
        }

        public long nextLong() {
            try {
                FastScanner lIlllIIlIlIll;
                int IIlllIIlIlIll = IlIIIlIIIl[0];
                int llIllIIlIlIll = lIlllIIlIlIll.input.read();
                while ((!FastScanner.lIIllllIlll(llIllIIlIlIll, IlIIIlIIIl[1]) || FastScanner.IlIllllIlll(IlIIIlIIIl[2], llIllIIlIlIll)) && FastScanner.llIllllIlll(llIllIIlIlIll, IlIIIlIIIl[3]) && FastScanner.llIllllIlll(llIllIIlIlIll, IlIIIlIIIl[4])) {
                    llIllIIlIlIll = lIlllIIlIlIll.input.read();
                    "".length();
                    if ("   ".length() != " ".length()) continue;
                    return 0L;
                }
                if (FastScanner.IIlllllIlll(llIllIIlIlIll, IlIIIlIIIl[3])) {
                    IIlllIIlIlIll = IlIIIlIIIl[5];
                    llIllIIlIlIll = lIlllIIlIlIll.input.read();
                    "".length();
                    if (null != null) {
                        return 0L;
                    }
                } else if (FastScanner.IIlllllIlll(llIllIIlIlIll, IlIIIlIIIl[4])) {
                    llIllIIlIlIll = lIlllIIlIlIll.input.read();
                }
                long IlIllIIlIlIll = llIllIIlIlIll - IlIIIlIIIl[1];
                do {
                    if (!FastScanner.lIIllllIlll(llIllIIlIlIll = lIlllIIlIlIll.input.read(), IlIIIlIIIl[1]) || FastScanner.IlIllllIlll(IlIIIlIIIl[2], llIllIIlIlIll)) {
                        return IlIllIIlIlIll * (long)IIlllIIlIlIll;
                    }
                    IlIllIIlIlIll *= 10L;
                    IlIllIIlIlIll += (long)(llIllIIlIlIll - IlIIIlIIIl[1]);
                    "".length();
                } while (-" ".length() <= " ".length() << " ".length());
                return 0L;
            }
            catch (IOException IIlllIIlIlIll) {
                IIlllIIlIlIll.printStackTrace();
                return -1L;
            }
        }

        public double nextDouble() {
            try {
                FastScanner IIlIlIIlIlIll;
                double llIIlIIlIlIll = 1.0;
                int IlIIlIIlIlIll = IIlIlIIlIlIll.input.read();
                while ((!FastScanner.lIIllllIlll(IlIIlIIlIlIll, IlIIIlIIIl[1]) || FastScanner.IlIllllIlll(IlIIIlIIIl[2], IlIIlIIlIlIll)) && FastScanner.llIllllIlll(IlIIlIIlIlIll, IlIIIlIIIl[3]) && FastScanner.llIllllIlll(IlIIlIIlIlIll, IlIIIlIIIl[4])) {
                    IlIIlIIlIlIll = IIlIlIIlIlIll.input.read();
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) == " ".length() << (" ".length() << " ".length())) continue;
                    return 0.0;
                }
                if (FastScanner.IIlllllIlll(IlIIlIIlIlIll, IlIIIlIIIl[3])) {
                    llIIlIIlIlIll = -1.0;
                    IlIIlIIlIlIll = IIlIlIIlIlIll.input.read();
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return 0.0;
                    }
                } else if (FastScanner.IIlllllIlll(IlIIlIIlIlIll, IlIIIlIIIl[4])) {
                    IlIIlIIlIlIll = IIlIlIIlIlIll.input.read();
                }
                double lIIIlIIlIlIll = IlIIlIIlIlIll - IlIIIlIIIl[1];
                while (FastScanner.lIIllllIlll(IlIIlIIlIlIll = IIlIlIIlIlIll.input.read(), IlIIIlIIIl[1])) {
                    if (FastScanner.IlIllllIlll(IlIIIlIIIl[2], IlIIlIIlIlIll)) {
                        "".length();
                        if (-" ".length() < 0) break;
                        return 0.0;
                    }
                    lIIIlIIlIlIll *= 10.0;
                    lIIIlIIlIlIll += (double)(IlIIlIIlIlIll - IlIIIlIIIl[1]);
                    "".length();
                    if (-(0x7B ^ 0x7E) < 0) continue;
                    return 0.0;
                }
                if (FastScanner.llIllllIlll(IlIIlIIlIlIll, IlIIIlIIIl[6])) {
                    return llIIlIIlIlIll * lIIIlIIlIlIll;
                }
                double IIIIlIIlIlIll = 1.0;
                IlIIlIIlIlIll = IIlIlIIlIlIll.input.read();
                while (FastScanner.lIlllllIlll(IlIIIlIIIl[1], IlIIlIIlIlIll) && FastScanner.lIlllllIlll(IlIIlIIlIlIll, IlIIIlIIIl[2])) {
                    lIIIlIIlIlIll *= 10.0;
                    lIIIlIIlIlIll += (double)(IlIIlIIlIlIll - IlIIIlIIIl[1]);
                    IIIIlIIlIlIll *= 10.0;
                    IlIIlIIlIlIll = IIlIlIIlIlIll.input.read();
                    "".length();
                    if (-" ".length() <= " ".length()) continue;
                    return 0.0;
                }
                return llIIlIIlIlIll * lIIIlIIlIlIll / IIIIlIIlIlIll;
            }
            catch (IOException llIIlIIlIlIll) {
                llIIlIIlIlIll.printStackTrace();
                return Double.NaN;
            }
        }

        public char nextChar() {
            try {
                FastScanner lIllIIIlIlIll;
                int IIllIIIlIlIll = lIllIIIlIlIll.input.read();
                while (FastScanner.IllllllIlll(Character.isWhitespace(IIllIIIlIlIll) ? 1 : 0)) {
                    IIllIIIlIlIll = lIllIIIlIlIll.input.read();
                    "".length();
                    if (" ".length() != 0) continue;
                    return (char)(" ".length() << (" ".length() << (" ".length() << " ".length())) & (" ".length() << (" ".length() << (" ".length() << " ".length())) ^ -" ".length()));
                }
                return (char)IIllIIIlIlIll;
            }
            catch (IOException IIllIIIlIlIll) {
                IIllIIIlIlIll.printStackTrace();
                return IlIIIlIIIl[7];
            }
        }

        public String nextStr() {
            try {
                FastScanner IIIlIIIlIlIll;
                StringBuilder lllIIIIlIlIll = new StringBuilder();
                int IllIIIIlIlIll = IIIlIIIlIlIll.input.read();
                while (FastScanner.IllllllIlll(Character.isWhitespace(IllIIIIlIlIll) ? 1 : 0)) {
                    IllIIIIlIlIll = IIIlIIIlIlIll.input.read();
                    "".length();
                    if (" ".length() > -" ".length()) continue;
                    return null;
                }
                while (FastScanner.llIllllIlll(IllIIIIlIlIll, IlIIIlIIIl[5]) && FastScanner.lllllllIlll(Character.isWhitespace(IllIIIIlIlIll) ? 1 : 0)) {
                    lllIIIIlIlIll.append((char)IllIIIIlIlIll);
                    "".length();
                    IllIIIIlIlIll = IIIlIIIlIlIll.input.read();
                    "".length();
                    if (-(0xC ^ 8) <= 0) continue;
                    return null;
                }
                return String.valueOf(lllIIIIlIlIll);
            }
            catch (IOException lllIIIIlIlIll) {
                lllIIIIlIlIll.printStackTrace();
                return IIIIIlIIIl[IlIIIlIIIl[7]];
            }
        }

        public String nextLine() {
            try {
                FastScanner IlIIIIIlIlIll;
                StringBuilder lIIIIIIlIlIll = new StringBuilder();
                int IIIIIIIlIlIll = IlIIIIIlIlIll.input.read();
                while (FastScanner.llIllllIlll(IIIIIIIlIlIll, IlIIIlIIIl[5]) && FastScanner.llIllllIlll(IIIIIIIlIlIll, IlIIIlIIIl[8])) {
                    lIIIIIIlIlIll.append((char)IIIIIIIlIlIll);
                    "".length();
                    IIIIIIIlIlIll = IlIIIIIlIlIll.input.read();
                    "".length();
                    if (null == null) continue;
                    return null;
                }
                return String.valueOf(lIIIIIIlIlIll);
            }
            catch (IOException lIIIIIIlIlIll) {
                lIIIIIIlIlIll.printStackTrace();
                return IIIIIlIIIl[IlIIIlIIIl[0]];
            }
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray(int IlIllllIIlIll) {
            void var2_2;
            int[] lIIllllIIlIll = new int[IlIllllIIlIll];
            int IIIllllIIlIll = IlIIIlIIIl[7];
            while (FastScanner.IlIllllIlll(IIIllllIIlIll, IlIllllIIlIll)) {
                FastScanner llIllllIIlIll;
                lIIllllIIlIll[IIIllllIIlIll] = llIllllIIlIll.nextInt();
                ++IIIllllIIlIll;
                "".length();
                if (" ".length() < " ".length() << " ".length()) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArrayDec(int IlIIlllIIlIll) {
            void var2_2;
            int[] lIIIlllIIlIll = new int[IlIIlllIIlIll];
            int IIIIlllIIlIll = IlIIIlIIIl[7];
            while (FastScanner.IlIllllIlll(IIIIlllIIlIll, IlIIlllIIlIll)) {
                FastScanner llIIlllIIlIll;
                lIIIlllIIlIll[IIIIlllIIlIll] = llIIlllIIlIll.nextInt() - IlIIIlIIIl[0];
                ++IIIIlllIIlIll;
                "".length();
                if ("   ".length() != " ".length()) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray1Index(int IlIlIllIIlIll) {
            void var2_2;
            int[] lIIlIllIIlIll = new int[IlIlIllIIlIll + IlIIIlIIIl[0]];
            int IIIlIllIIlIll = IlIIIlIIIl[7];
            while (FastScanner.IlIllllIlll(IIIlIllIIlIll, IlIlIllIIlIll)) {
                FastScanner llIlIllIIlIll;
                lIIlIllIIlIll[IIIlIllIIlIll + FastScanner.IlIIIlIIIl[0]] = llIlIllIIlIll.nextInt();
                ++IIIlIllIIlIll;
                "".length();
                if (null == null) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray(int IlIIIllIIlIll) {
            void var2_2;
            long[] lIIIIllIIlIll = new long[IlIIIllIIlIll];
            int IIIIIllIIlIll = IlIIIlIIIl[7];
            while (FastScanner.IlIllllIlll(IIIIIllIIlIll, IlIIIllIIlIll)) {
                FastScanner llIIIllIIlIll;
                lIIIIllIIlIll[IIIIIllIIlIll] = llIIIllIIlIll.nextLong();
                ++IIIIIllIIlIll;
                "".length();
                if (" ".length() << " ".length() >= " ".length() << " ".length()) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArrayDec(int IlIllIlIIlIll) {
            void var2_2;
            long[] lIIllIlIIlIll = new long[IlIllIlIIlIll];
            int IIIllIlIIlIll = IlIIIlIIIl[7];
            while (FastScanner.IlIllllIlll(IIIllIlIIlIll, IlIllIlIIlIll)) {
                FastScanner llIllIlIIlIll;
                lIIllIlIIlIll[IIIllIlIIlIll] = llIllIlIIlIll.nextLong() - 1L;
                ++IIIllIlIIlIll;
                "".length();
                if (-(163 + 111 - 163 + 58 ^ 128 + 5 - 22 + 62) < 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray1Index(int IlIIlIlIIlIll) {
            void var2_2;
            long[] lIIIlIlIIlIll = new long[IlIIlIlIIlIll + IlIIIlIIIl[0]];
            int IIIIlIlIIlIll = IlIIIlIIIl[7];
            while (FastScanner.IlIllllIlll(IIIIlIlIIlIll, IlIIlIlIIlIll)) {
                FastScanner llIIlIlIIlIll;
                lIIIlIlIIlIll[IIIIlIlIIlIll + FastScanner.IlIIIlIIIl[0]] = llIIlIlIIlIll.nextLong();
                ++IIIIlIlIIlIll;
                "".length();
                if (-" ".length() <= (((0x63 ^ 0x54) << " ".length() ^ 97 + 41 - 51 + 40) & ((0x5D ^ 0x78) << (" ".length() << " ".length()) ^ 83 + 87 - 62 + 25 ^ -" ".length()))) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public double[] nextDoubleArray(int IlIlIIlIIlIll) {
            void var2_2;
            double[] lIIlIIlIIlIll = new double[IlIlIIlIIlIll];
            int IIIlIIlIIlIll = IlIIIlIIIl[7];
            while (FastScanner.IlIllllIlll(IIIlIIlIIlIll, IlIlIIlIIlIll)) {
                FastScanner llIlIIlIIlIll;
                lIIlIIlIIlIll[IIIlIIlIIlIll] = llIlIIlIIlIll.nextDouble();
                ++IIIlIIlIIlIll;
                "".length();
                if ((("   ".length() << "   ".length() ^ (0xA2 ^ 0x91)) & (38 + 129 - 116 + 106 ^ (0x46 ^ 0x1D) << " ".length() ^ -" ".length())) < "   ".length()) continue;
                return null;
            }
            return var2_2;
        }

        static {
            FastScanner.lIlIlllIlll();
            FastScanner.lIIIlllIlll();
        }

        private static void lIIIlllIlll() {
            IIIIIlIIIl = new String[IlIIIlIIIl[9]];
            FastScanner.IIIIIlIIIl[FastScanner.IlIIIlIIIl[7]] = FastScanner.lIllIllIlll("", "Ywqcg");
            FastScanner.IIIIIlIIIl[FastScanner.IlIIIlIIIl[0]] = FastScanner.IlllIllIlll("//u9jdjYXYw=", "ibrcy");
        }

        /*
         * Unable to fully structure code
         */
        private static String lIllIllIlll(String IlllllIIIlIll, String lIllllIIIlIll) {
            IlllllIIIlIll = new String(Base64.getDecoder().decode(IlllllIIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            IIllllIIIlIll = new StringBuilder();
            llIlllIIIlIll = lIllllIIIlIll.toCharArray();
            IlIlllIIIlIll = FastScanner.IlIIIlIIIl[7];
            IIIIllIIIlIll = IlllllIIIlIll.toCharArray();
            lIIIllIIIlIll = IIIIllIIIlIll.length;
            IlIIllIIIlIll = FastScanner.IlIIIlIIIl[7];
            "".length();
            if (-"  ".length() <= 0) ** GOTO lbl19
            return null;
lbl-1000:
            // 1 sources

            {
                lIIlllIIIlIll = IIIIllIIIlIll[IlIIllIIIlIll];
                IIllllIIIlIll.append((char)(lIIlllIIIlIll ^ llIlllIIIlIll[IlIlllIIIlIll % llIlllIIIlIll.length]));
                "".length();
                ++IlIlllIIIlIll;
                ++IlIIllIIIlIll;
lbl19:
                // 2 sources

                ** while (!FastScanner.lIIllllIlll((int)IlIIllIIIlIll, (int)lIIIllIIIlIll))
            }
lbl20:
            // 1 sources

            return String.valueOf(IIllllIIIlIll);
        }

        private static String IlllIllIlll(String llIlIlIIIlIll, String IlIlIlIIIlIll) {
            try {
                SecretKeySpec lIIlIlIIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlIlIlIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                Cipher IIIlIlIIIlIll = Cipher.getInstance("Blowfish");
                IIIlIlIIIlIll.init(IlIIIlIIIl[9], lIIlIlIIIlIll);
                return new String(IIIlIlIIIlIll.doFinal(Base64.getDecoder().decode(llIlIlIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllIIlIIIlIll) {
                lllIIlIIIlIll.printStackTrace();
                return null;
            }
        }

        private static void lIlIlllIlll() {
            IlIIIlIIIl = new int[10];
            FastScanner.IlIIIlIIIl[0] = " ".length();
            FastScanner.IlIIIlIIIl[1] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.IlIIIlIIIl[2] = 0xF3 ^ 0xAE ^ (0x51 ^ 0x48) << (" ".length() << " ".length());
            FastScanner.IlIIIlIIIl[3] = 0x28 ^ 5;
            FastScanner.IlIIIlIIIl[4] = 0x7F ^ 0x54;
            FastScanner.IlIIIlIIIl[5] = -" ".length();
            FastScanner.IlIIIlIIIl[6] = (0x61 ^ 0x76) << " ".length();
            FastScanner.IlIIIlIIIl[7] = (3 ^ 8) << " ".length() & ~((0xAB ^ 0xA0) << " ".length());
            FastScanner.IlIIIlIIIl[8] = (0xC ^ 9) << " ".length();
            FastScanner.IlIIIlIIIl[9] = " ".length() << " ".length();
        }

        private static boolean IIlllllIlll(int n, int n2) {
            return n == n2;
        }

        private static boolean lIIllllIlll(int n, int n2) {
            return n >= n2;
        }

        private static boolean IlIllllIlll(int n, int n2) {
            return n < n2;
        }

        private static boolean lIlllllIlll(int n, int n2) {
            return n <= n2;
        }

        private static boolean IllllllIlll(int n) {
            return n != 0;
        }

        private static boolean lllllllIlll(int n) {
            return n == 0;
        }

        private static boolean lllIlllIlll(int n) {
            return n >= 0;
        }

        private static boolean IIIllllIlll(int n) {
            return n > 0;
        }

        private static boolean llIllllIlll(int n, int n2) {
            return n != n2;
        }

        private static int IllIlllIlll(long l, long l2) {
            return l == l2 ? 0 : (l < l2 ? -1 : 1);
        }
    }
}

