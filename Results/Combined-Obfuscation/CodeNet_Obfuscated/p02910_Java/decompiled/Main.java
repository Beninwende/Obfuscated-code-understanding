/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.InputMismatchException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static String[] IllllllIll;
    private static int[] IIIIIIIlll;

    public Main() {
        Main lIIlIIIIIllIIll;
    }

    /*
     * WARNING - void declaration
     */
    static int gcd(int IllIIIIIIllIIll, int lIlIIIIIIllIIll) {
        int n;
        void var1_1;
        if (Main.llllIlllIIll(IllIIIIIIllIIll)) {
            return lIlIIIIIIllIIll;
        }
        return Main.gcd((int)(var1_1 % n), n);
    }

    /*
     * WARNING - void declaration
     */
    static int lcm(int IlIIIIIIIllIIll, int lIIIIIIIIllIIll) {
        int n;
        void var1_1;
        return IlIIIIIIIllIIll * var1_1 / Main.gcd(n, (int)var1_1);
    }

    public static void main(String[] stringArray) {
        InputStream IlIllllllIlIIll = System.in;
        PrintStream lIIllllllIlIIll = System.out;
        FastReader IIIllllllIlIIll = new FastReader(IlIllllllIlIIll);
        PrintWriter lllIlllllIlIIll = new PrintWriter(lIIllllllIlIIll);
        String IllIlllllIlIIll = IIIllllllIlIIll.next();
        int lIlIlllllIlIIll = IIIIIIIlll[0];
        while (Main.IIIIllllIIll(lIlIlllllIlIIll, IllIlllllIlIIll.length())) {
            if (Main.llllIlllIIll(lIlIlllllIlIIll % IIIIIIIlll[1]) && Main.lIIIllllIIll(IllIlllllIlIIll.charAt(lIlIlllllIlIIll), IIIIIIIlll[2])) {
                lllIlllllIlIIll.println(IllllllIll[IIIIIIIlll[0]]);
                lllIlllllIlIIll.close();
                return;
            }
            if (Main.lIIIllllIIll(lIlIlllllIlIIll % IIIIIIIlll[1], IIIIIIIlll[3]) && Main.lIIIllllIIll(IllIlllllIlIIll.charAt(lIlIlllllIlIIll), IIIIIIIlll[4])) {
                lllIlllllIlIIll.println(IllllllIll[IIIIIIIlll[3]]);
                lllIlllllIlIIll.close();
                return;
            }
            ++lIlIlllllIlIIll;
            "".length();
            if (null == null) continue;
            return;
        }
        lllIlllllIlIIll.println(IllllllIll[IIIIIIIlll[1]]);
        lllIlllllIlIIll.close();
    }

    static {
        Main.IlllIlllIIll();
        Main.llIlIlllIIll();
    }

    private static void llIlIlllIIll() {
        IllllllIll = new String[IIIIIIIlll[5]];
        Main.IllllllIll[Main.IIIIIIIlll[0]] = Main.lIIlIlllIIll("VVo4K4UjOwY=", "MbxWL");
        Main.IllllllIll[Main.IIIIIIIlll[3]] = Main.IlIlIlllIIll("ISs=", "oDzRQ");
        Main.IllllllIll[Main.IIIIIIIlll[1]] = Main.IlIlIlllIIll("FC4g", "MKSGy");
    }

    private static String lIIlIlllIIll(String IIIIlllllIlIIll, String llllIllllIlIIll) {
        try {
            SecretKeySpec IlllIllllIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIllllIlIIll.getBytes(StandardCharsets.UTF_8)), IIIIIIIlll[6]), "DES");
            Cipher lIllIllllIlIIll = Cipher.getInstance("DES");
            lIllIllllIlIIll.init(IIIIIIIlll[1], IlllIllllIlIIll);
            return new String(lIllIllllIlIIll.doFinal(Base64.getDecoder().decode(IIIIlllllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIllIllllIlIIll) {
            IIllIllllIlIIll.printStackTrace();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String IlIlIlllIIll(String IllllIlllIlIIll, String lIlllIlllIlIIll) {
        IllllIlllIlIIll = new String(Base64.getDecoder().decode(IllllIlllIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        IIlllIlllIlIIll = new StringBuilder();
        llIllIlllIlIIll = lIlllIlllIlIIll.toCharArray();
        IlIllIlllIlIIll = Main.IIIIIIIlll[0];
        IIIIlIlllIlIIll = IllllIlllIlIIll.toCharArray();
        lIIIlIlllIlIIll = IIIIlIlllIlIIll.length;
        IlIIlIlllIlIIll = Main.IIIIIIIlll[0];
        "".length();
        if (" ".length() << (" ".length() << " ".length()) > "   ".length()) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            lIIllIlllIlIIll = IIIIlIlllIlIIll[IlIIlIlllIlIIll];
            IIlllIlllIlIIll.append((char)(lIIllIlllIlIIll ^ llIllIlllIlIIll[IlIllIlllIlIIll % llIllIlllIlIIll.length]));
            "".length();
            ++IlIllIlllIlIIll;
            ++IlIIlIlllIlIIll;
lbl19:
            // 2 sources

            ** while (!Main.IlIIllllIIll((int)IlIIlIlllIlIIll, (int)lIIIlIlllIlIIll))
        }
lbl20:
        // 1 sources

        return String.valueOf(IIlllIlllIlIIll);
    }

    private static void IlllIlllIIll() {
        IIIIIIIlll = new int[7];
        Main.IIIIIIIlll[0] = (1 ^ 0x2A) & ~(0x4E ^ 0x65);
        Main.IIIIIIIlll[1] = " ".length() << " ".length();
        Main.IIIIIIIlll[2] = (107 + 82 - 167 + 153 ^ (0x8C ^ 0xA3) << (" ".length() << " ".length())) << (" ".length() << " ".length());
        Main.IIIIIIIlll[3] = " ".length();
        Main.IIIIIIIlll[4] = (0xF1 ^ 0xA2 ^ (0x8D ^ 0xB0) << " ".length()) << " ".length();
        Main.IIIIIIIlll[5] = "   ".length();
        Main.IIIIIIIlll[6] = " ".length() << "   ".length();
    }

    private static boolean lIIIllllIIll(int n, int n2) {
        return n == n2;
    }

    private static boolean IlIIllllIIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIIIllllIIll(int n, int n2) {
        return n < n2;
    }

    private static boolean llllIlllIIll(int n) {
        return n == 0;
    }

    public static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[llIIIIIlll[0]];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private static String[] lllllllIll;
        private static int[] llIIIIIlll;

        public FastReader(InputStream IlllllIllIlIIll) {
            FastReader llllllIllIlIIll;
            llllllIllIlIIll.stream = IlllllIllIlIIll;
        }

        public int read() {
            block5: {
                FastReader llIlllIllIlIIll;
                if (FastReader.lllIllllIIll(llIlllIllIlIIll.numChars, llIIIIIlll[1])) {
                    throw new InputMismatchException();
                }
                if (!FastReader.IIIlllllIIll(llIlllIllIlIIll.curChar, llIlllIllIlIIll.numChars)) break block5;
                llIlllIllIlIIll.curChar = llIIIIIlll[2];
                try {
                    llIlllIllIlIIll.numChars = llIlllIllIlIIll.stream.read(llIlllIllIlIIll.buf);
                    "".length();
                }
                catch (IOException IlIlllIllIlIIll) {
                    throw new InputMismatchException();
                }
                if (" ".length() == " ".length() << (" ".length() << " ".length())) {
                    return " ".length() << " ".length() & ~(" ".length() << " ".length());
                }
                if (FastReader.lIIlllllIIll(llIlllIllIlIIll.numChars)) {
                    return llIIIIIlll[1];
                }
            }
            int n = this.curChar;
            this.curChar = n + llIIIIIlll[3];
            return this.buf[n];
        }

        /*
         * WARNING - void declaration
         */
        public String nextLine() {
            void var2_2;
            BufferedReader IllIllIllIlIIll = new BufferedReader(new InputStreamReader(System.in));
            String lIlIllIllIlIIll = lllllllIll[llIIIIIlll[2]];
            try {
                lIlIllIllIlIIll = IllIllIllIlIIll.readLine();
                "".length();
            }
            catch (IOException IIlIllIllIlIIll) {
                IIlIllIllIlIIll.printStackTrace();
            }
            if (" ".length() << " ".length() != " ".length() << " ".length()) {
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public int nextInt() {
            void var2_2;
            void var3_3;
            FastReader llllIlIllIlIIll;
            int IlllIlIllIlIIll = llllIlIllIlIIll.read();
            while (FastReader.IlIlllllIIll(llllIlIllIlIIll.isSpaceChar(IlllIlIllIlIIll) ? 1 : 0)) {
                IlllIlIllIlIIll = llllIlIllIlIIll.read();
                "".length();
                if (" ".length() << " ".length() > " ".length()) continue;
                return (0xCA ^ 0xA7 ^ (0x36 ^ 0x19) << " ".length()) & (0x3D ^ 0xA ^ " ".length() << (" ".length() << " ".length()) ^ -" ".length());
            }
            int lIllIlIllIlIIll = llIIIIIlll[3];
            if (FastReader.lllIllllIIll(IlllIlIllIlIIll, llIIIIIlll[4])) {
                lIllIlIllIlIIll = llIIIIIlll[1];
                IlllIlIllIlIIll = llllIlIllIlIIll.read();
            }
            int IIllIlIllIlIIll = llIIIIIlll[2];
            do {
                if (!FastReader.IIIlllllIIll(IlllIlIllIlIIll, llIIIIIlll[5]) || FastReader.llIlllllIIll(IlllIlIllIlIIll, llIIIIIlll[6])) {
                    throw new InputMismatchException();
                }
                IIllIlIllIlIIll *= llIIIIIlll[7];
                IIllIlIllIlIIll += IlllIlIllIlIIll - llIIIIIlll[5];
            } while (!FastReader.IlIlllllIIll(llllIlIllIlIIll.isSpaceChar(IlllIlIllIlIIll = llllIlIllIlIIll.read()) ? 1 : 0));
            return (int)(var3_3 * var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public long nextLong() {
            void var2_2;
            void var3_3;
            FastReader lllIIlIllIlIIll;
            int IllIIlIllIlIIll = lllIIlIllIlIIll.read();
            while (FastReader.IlIlllllIIll(lllIIlIllIlIIll.isSpaceChar(IllIIlIllIlIIll) ? 1 : 0)) {
                IllIIlIllIlIIll = lllIIlIllIlIIll.read();
                "".length();
                if (" ".length() << (" ".length() << " ".length()) >= ((0xE9 ^ 0xC4 ^ (0xD ^ 8) << " ".length()) << " ".length() & ((0x51 ^ 0x2C ^ (0xA1 ^ 0x8C) << " ".length()) << " ".length() ^ -" ".length()))) continue;
                return 0L;
            }
            int lIlIIlIllIlIIll = llIIIIIlll[3];
            if (FastReader.lllIllllIIll(IllIIlIllIlIIll, llIIIIIlll[4])) {
                lIlIIlIllIlIIll = llIIIIIlll[1];
                IllIIlIllIlIIll = lllIIlIllIlIIll.read();
            }
            long IIlIIlIllIlIIll = 0L;
            do {
                if (!FastReader.IIIlllllIIll(IllIIlIllIlIIll, llIIIIIlll[5]) || FastReader.llIlllllIIll(IllIIlIllIlIIll, llIIIIIlll[6])) {
                    throw new InputMismatchException();
                }
                IIlIIlIllIlIIll *= 10L;
                IIlIIlIllIlIIll += (long)(IllIIlIllIlIIll - llIIIIIlll[5]);
            } while (!FastReader.IlIlllllIIll(lllIIlIllIlIIll.isSpaceChar(IllIIlIllIlIIll = lllIIlIllIlIIll.read()) ? 1 : 0));
            return (long)(var3_3 * (long)var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public double nextDouble() {
            void var2_2;
            void var3_3;
            FastReader IllllIIllIlIIll;
            int lIlllIIllIlIIll = IllllIIllIlIIll.read();
            while (FastReader.IlIlllllIIll(IllllIIllIlIIll.isSpaceChar(lIlllIIllIlIIll) ? 1 : 0)) {
                lIlllIIllIlIIll = IllllIIllIlIIll.read();
                "".length();
                if (-" ".length() < "   ".length()) continue;
                return 0.0;
            }
            int IIlllIIllIlIIll = llIIIIIlll[3];
            if (FastReader.lllIllllIIll(lIlllIIllIlIIll, llIIIIIlll[4])) {
                IIlllIIllIlIIll = llIIIIIlll[1];
                lIlllIIllIlIIll = IllllIIllIlIIll.read();
            }
            double llIllIIllIlIIll = 0.0;
            while (FastReader.IIllllllIIll(IllllIIllIlIIll.isSpaceChar(lIlllIIllIlIIll) ? 1 : 0) && FastReader.lIllllllIIll(lIlllIIllIlIIll, llIIIIIlll[8])) {
                if (!FastReader.lIllllllIIll(lIlllIIllIlIIll, llIIIIIlll[9]) || FastReader.lllIllllIIll(lIlllIIllIlIIll, llIIIIIlll[10])) {
                    return llIllIIllIlIIll * Math.pow(10.0, IllllIIllIlIIll.nextInt());
                }
                if (!FastReader.IIIlllllIIll(lIlllIIllIlIIll, llIIIIIlll[5]) || FastReader.llIlllllIIll(lIlllIIllIlIIll, llIIIIIlll[6])) {
                    throw new InputMismatchException();
                }
                llIllIIllIlIIll *= 10.0;
                llIllIIllIlIIll += (double)(lIlllIIllIlIIll - llIIIIIlll[5]);
                lIlllIIllIlIIll = IllllIIllIlIIll.read();
                "".length();
                if (" ".length() < " ".length() << (" ".length() << " ".length())) continue;
                return 0.0;
            }
            if (FastReader.lllIllllIIll(lIlllIIllIlIIll, llIIIIIlll[8])) {
                lIlllIIllIlIIll = IllllIIllIlIIll.read();
                double IlIllIIllIlIIll = 1.0;
                while (FastReader.IIllllllIIll(IllllIIllIlIIll.isSpaceChar(lIlllIIllIlIIll) ? 1 : 0)) {
                    if (!FastReader.lIllllllIIll(lIlllIIllIlIIll, llIIIIIlll[9]) || FastReader.lllIllllIIll(lIlllIIllIlIIll, llIIIIIlll[10])) {
                        return llIllIIllIlIIll * Math.pow(10.0, IllllIIllIlIIll.nextInt());
                    }
                    if (!FastReader.IIIlllllIIll(lIlllIIllIlIIll, llIIIIIlll[5]) || FastReader.llIlllllIIll(lIlllIIllIlIIll, llIIIIIlll[6])) {
                        throw new InputMismatchException();
                    }
                    llIllIIllIlIIll += (double)(lIlllIIllIlIIll - llIIIIIlll[5]) * (IlIllIIllIlIIll /= 10.0);
                    lIlllIIllIlIIll = IllllIIllIlIIll.read();
                    "".length();
                    if (((0xB3 ^ 0xA2) << " ".length() & ~((0xB7 ^ 0xA6) << " ".length())) == 0) continue;
                    return 0.0;
                }
            }
            return (double)(var3_3 * (double)var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public char nextChar() {
            void var1_1;
            FastReader lllIlIIllIlIIll;
            int IllIlIIllIlIIll = lllIlIIllIlIIll.read();
            while (FastReader.IlIlllllIIll(lllIlIIllIlIIll.isSpaceChar(IllIlIIllIlIIll) ? 1 : 0)) {
                IllIlIIllIlIIll = lllIlIIllIlIIll.read();
                "".length();
                if (((0xDD ^ 0x96) << " ".length() ^ 78 + 104 - 159 + 124) > 0) continue;
                return (char)((" ".length() ^ (0x9C ^ 0x99) << (" ".length() << " ".length())) & (0x1B ^ 0x7A ^ (0x98 ^ 0x85) << (" ".length() << " ".length()) ^ -" ".length()));
            }
            return (char)var1_1;
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var2_2;
            FastReader IlIIlIIllIlIIll;
            int lIIIlIIllIlIIll = IlIIlIIllIlIIll.read();
            while (FastReader.IlIlllllIIll(IlIIlIIllIlIIll.isSpaceChar(lIIIlIIllIlIIll) ? 1 : 0)) {
                lIIIlIIllIlIIll = IlIIlIIllIlIIll.read();
                "".length();
                if (" ".length() == " ".length()) continue;
                return null;
            }
            StringBuilder IIIIlIIllIlIIll = new StringBuilder();
            do {
                IIIIlIIllIlIIll.appendCodePoint(lIIIlIIllIlIIll);
                "".length();
            } while (!FastReader.IlIlllllIIll(IlIIlIIllIlIIll.isSpaceChar(lIIIlIIllIlIIll = IlIIlIIllIlIIll.read()) ? 1 : 0));
            return String.valueOf(var2_2);
        }

        public boolean isSpaceChar(int IIllIIIllIlIIll) {
            int n;
            FastReader lIllIIIllIlIIll;
            if (FastReader.IlllllllIIll(lIllIIIllIlIIll.filter)) {
                return lIllIIIllIlIIll.filter.isSpaceChar(IIllIIIllIlIIll);
            }
            if (!(FastReader.lIllllllIIll(IIllIIIllIlIIll, llIIIIIlll[11]) && FastReader.lIllllllIIll(IIllIIIllIlIIll, llIIIIIlll[7]) && FastReader.lIllllllIIll(IIllIIIllIlIIll, llIIIIIlll[12]) && FastReader.lIllllllIIll(IIllIIIllIlIIll, llIIIIIlll[13]) && !FastReader.lllIllllIIll(IIllIIIllIlIIll, llIIIIIlll[1]))) {
                n = llIIIIIlll[3];
                "".length();
                if ("   ".length() != "   ".length()) {
                    return ((0xAD ^ 0xBC) << " ".length() & ~((0x8D ^ 0x9C) << " ".length())) != 0;
                }
            } else {
                n = llIIIIIlll[2];
            }
            return n != 0;
        }

        static {
            FastReader.IllIllllIIll();
            FastReader.lIllIlllIIll();
        }

        private static void lIllIlllIIll() {
            lllllllIll = new String[llIIIIIlll[3]];
            FastReader.lllllllIll[FastReader.llIIIIIlll[2]] = FastReader.IIllIlllIIll("ZhNK6ZjWPXM=", "WiAkd");
        }

        private static String IIllIlllIIll(String lllIIIIllIlIIll, String IllIIIIllIlIIll) {
            try {
                SecretKeySpec lIlIIIIllIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IllIIIIllIlIIll.getBytes(StandardCharsets.UTF_8)), llIIIIIlll[14]), "DES");
                Cipher IIlIIIIllIlIIll = Cipher.getInstance("DES");
                IIlIIIIllIlIIll.init(llIIIIIlll[15], lIlIIIIllIlIIll);
                return new String(IIlIIIIllIlIIll.doFinal(Base64.getDecoder().decode(lllIIIIllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llIIIIIllIlIIll) {
                llIIIIIllIlIIll.printStackTrace();
                return null;
            }
        }

        private static void IllIllllIIll() {
            llIIIIIlll = new int[16];
            FastReader.llIIIIIlll[0] = " ".length() << ((0x55 ^ 0x50) << " ".length());
            FastReader.llIIIIIlll[1] = -" ".length();
            FastReader.llIIIIIlll[2] = "   ".length() << ("   ".length() << (0x67 ^ 0x62) ^ (0x64 ^ 1)) & ("   ".length() << (" ".length() ^ " ".length() << (" ".length() << " ".length())) ^ -" ".length());
            FastReader.llIIIIIlll[3] = " ".length();
            FastReader.llIIIIIlll[4] = 59 + 102 - 119 + 117 ^ (0x10 ^ 0x49) << " ".length();
            FastReader.llIIIIIlll[5] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastReader.llIIIIIlll[6] = 0x66 ^ 0x5F;
            FastReader.llIIIIIlll[7] = (0xFB ^ 0x8E ^ (0xAC ^ 0xAB) << (" ".length() << (" ".length() << " ".length()))) << " ".length();
            FastReader.llIIIIIlll[8] = (0x86 ^ 0xAD ^ (0x58 ^ 0x57) << (" ".length() << " ".length())) << " ".length();
            FastReader.llIIIIIlll[9] = 0xDB ^ 0xBE;
            FastReader.llIIIIIlll[10] = 0x37 ^ 0x72;
            FastReader.llIIIIIlll[11] = " ".length() << ((0x1E ^ 0x45) << " ".length() ^ 163 + 40 - 191 + 167);
            FastReader.llIIIIIlll[12] = " ".length() << (" ".length() << (" ".length() << " ".length())) ^ (0x91 ^ 0x8C);
            FastReader.llIIIIIlll[13] = (0x13 ^ 0x14) << "   ".length() ^ (0xAC ^ 0x9D);
            FastReader.llIIIIIlll[14] = " ".length() << "   ".length();
            FastReader.llIIIIIlll[15] = " ".length() << " ".length();
        }

        private static boolean lllIllllIIll(int n, int n2) {
            return n == n2;
        }

        private static boolean IIIlllllIIll(int n, int n2) {
            return n >= n2;
        }

        private static boolean llIlllllIIll(int n, int n2) {
            return n > n2;
        }

        private static boolean IlllllllIIll(Object object) {
            return object != null;
        }

        private static boolean IlIlllllIIll(int n) {
            return n != 0;
        }

        private static boolean IIllllllIIll(int n) {
            return n == 0;
        }

        private static boolean lIIlllllIIll(int n) {
            return n <= 0;
        }

        private static boolean lIllllllIIll(int n, int n2) {
            return n != n2;
        }

        public static interface SpaceCharFilter {
            public boolean isSpaceChar(int var1);
        }
    }
}

