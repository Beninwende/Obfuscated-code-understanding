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
    private static int[] IllllllIIl;

    public Main() {
        Main IlIIlIllIIll;
    }

    public static void main(String[] stringArray) {
        InputStream lIIlIIllIIll = System.in;
        PrintStream IIIlIIllIIll = System.out;
        FastReader lllIIIllIIll = new FastReader(lIIlIIllIIll);
        PrintWriter IllIIIllIIll = new PrintWriter(IIIlIIllIIll);
        int lIlIIIllIIll = lllIIIllIIll.nextInt();
        int[] IIlIIIllIIll = new int[lIlIIIllIIll];
        int IlIIIIllIIll = IllllllIIl[0];
        int llIIIIllIIll = IllllllIIl[1];
        while (Main.IlIIIlllIIIl(llIIIIllIIll, lIlIIIllIIll)) {
            IIlIIIllIIll[llIIIIllIIll] = lllIIIllIIll.nextInt();
            if (Main.llIIIlllIIIl(IIlIIIllIIll[llIIIIllIIll], IlIIIIllIIll)) {
                ++IlIIIIllIIll;
            }
            ++llIIIIllIIll;
            "".length();
            if (null == null) continue;
            return;
        }
        if (Main.IIlIIlllIIIl(lIlIIIllIIll - IlIIIIllIIll + IllllllIIl[0], lIlIIIllIIll - IllllllIIl[0])) {
            IllIIIllIIll.println(IllllllIIl[2]);
            "".length();
            if ("   ".length() == " ".length() << (" ".length() << " ".length())) {
                return;
            }
        } else {
            IllIIIllIIll.println(lIlIIIllIIll - IlIIIIllIIll + IllllllIIl[0]);
        }
        IllIIIllIIll.close();
    }

    static {
        Main.lIIIIlllIIIl();
    }

    private static void lIIIIlllIIIl() {
        IllllllIIl = new int[3];
        Main.IllllllIIl[0] = " ".length();
        Main.IllllllIIl[1] = ((0x74 ^ 0x67) << (" ".length() << " ".length()) ^ (0x6A ^ 0x2F)) << (" ".length() << " ".length()) & ((" ".length() << " ".length() & ~(" ".length() << " ".length()) ^ (0x62 ^ 0x6B)) << (" ".length() << " ".length()) ^ -" ".length());
        Main.IllllllIIl[2] = -" ".length();
    }

    private static boolean llIIIlllIIIl(int n, int n2) {
        return n == n2;
    }

    private static boolean IlIIIlllIIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IIlIIlllIIIl(int n, int n2) {
        return n > n2;
    }

    public static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[lIIIIIIlIl[0]];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private static String[] IIIIIIIlIl;
        private static int[] lIIIIIIlIl;

        public FastReader(InputStream IlIIIlIlIIll) {
            FastReader IIlIIlIlIIll;
            IIlIIlIlIIll.stream = IlIIIlIlIIll;
        }

        public int read() {
            block5: {
                FastReader IIIllIIlIIll;
                if (FastReader.llIlIlllIIIl(IIIllIIlIIll.numChars, lIIIIIIlIl[1])) {
                    throw new InputMismatchException();
                }
                if (!FastReader.IIllIlllIIIl(IIIllIIlIIll.curChar, IIIllIIlIIll.numChars)) break block5;
                IIIllIIlIIll.curChar = lIIIIIIlIl[2];
                try {
                    IIIllIIlIIll.numChars = IIIllIIlIIll.stream.read(IIIllIIlIIll.buf);
                    "".length();
                }
                catch (IOException lllIlIIlIIll) {
                    throw new InputMismatchException();
                }
                if ("   ".length() < 0) {
                    return (0x64 ^ 3 ^ (0x16 ^ 0x21) << " ".length()) << " ".length() & (((0x53 ^ 0x1E) << " ".length() ^ 31 + 104 - 101 + 113) << " ".length() ^ -" ".length());
                }
                if (FastReader.lIllIlllIIIl(IIIllIIlIIll.numChars)) {
                    return lIIIIIIlIl[1];
                }
            }
            int n = this.curChar;
            this.curChar = n + lIIIIIIlIl[3];
            return this.buf[n];
        }

        /*
         * WARNING - void declaration
         */
        public String nextLine() {
            void var2_2;
            BufferedReader lIIlIIIlIIll = new BufferedReader(new InputStreamReader(System.in));
            String IIIlIIIlIIll = IIIIIIIlIl[lIIIIIIlIl[2]];
            try {
                IIIlIIIlIIll = lIIlIIIlIIll.readLine();
                "".length();
            }
            catch (IOException lllIIIIlIIll) {
                lllIIIIlIIll.printStackTrace();
            }
            if (((0x5B ^ 0x3A) & ~(0x7F ^ 0x1E)) < 0) {
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
            FastReader lIlIlllIIIll;
            int IIlIlllIIIll = lIlIlllIIIll.read();
            while (FastReader.IlllIlllIIIl(lIlIlllIIIll.isSpaceChar(IIlIlllIIIll) ? 1 : 0)) {
                IIlIlllIIIll = lIlIlllIIIll.read();
                "".length();
                if (-" ".length() <= 0) continue;
                return (0xC3 ^ 0xC6) << "   ".length() & ~((0xE ^ 0xB) << "   ".length());
            }
            int llIIlllIIIll = lIIIIIIlIl[3];
            if (FastReader.llIlIlllIIIl(IIlIlllIIIll, lIIIIIIlIl[4])) {
                llIIlllIIIll = lIIIIIIlIl[1];
                IIlIlllIIIll = lIlIlllIIIll.read();
            }
            int IlIIlllIIIll = lIIIIIIlIl[2];
            do {
                if (!FastReader.IIllIlllIIIl(IIlIlllIIIll, lIIIIIIlIl[5]) || FastReader.llllIlllIIIl(IIlIlllIIIll, lIIIIIIlIl[6])) {
                    throw new InputMismatchException();
                }
                IlIIlllIIIll *= lIIIIIIlIl[7];
                IlIIlllIIIll += IIlIlllIIIll - lIIIIIIlIl[5];
            } while (!FastReader.IlllIlllIIIl(lIlIlllIIIll.isSpaceChar(IIlIlllIIIll = lIlIlllIIIll.read()) ? 1 : 0));
            return (int)(var3_3 * var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public long nextLong() {
            void var2_2;
            void var3_3;
            FastReader lIllIllIIIll;
            int IIllIllIIIll = lIllIllIIIll.read();
            while (FastReader.IlllIlllIIIl(lIllIllIIIll.isSpaceChar(IIllIllIIIll) ? 1 : 0)) {
                IIllIllIIIll = lIllIllIIIll.read();
                "".length();
                if (" ".length() << (" ".length() << " ".length()) >= ((0x94 ^ 0x99) << (" ".length() << " ".length()) & ~((0x14 ^ 0x19) << (" ".length() << " ".length())))) continue;
                return 0L;
            }
            int llIlIllIIIll = lIIIIIIlIl[3];
            if (FastReader.llIlIlllIIIl(IIllIllIIIll, lIIIIIIlIl[4])) {
                llIlIllIIIll = lIIIIIIlIl[1];
                IIllIllIIIll = lIllIllIIIll.read();
            }
            long IlIlIllIIIll = 0L;
            do {
                if (!FastReader.IIllIlllIIIl(IIllIllIIIll, lIIIIIIlIl[5]) || FastReader.llllIlllIIIl(IIllIllIIIll, lIIIIIIlIl[6])) {
                    throw new InputMismatchException();
                }
                IlIlIllIIIll *= 10L;
                IlIlIllIIIll += (long)(IIllIllIIIll - lIIIIIIlIl[5]);
            } while (!FastReader.IlllIlllIIIl(lIllIllIIIll.isSpaceChar(IIllIllIIIll = lIllIllIIIll.read()) ? 1 : 0));
            return (long)(var3_3 * (long)var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public double nextDouble() {
            void var2_2;
            void var3_3;
            FastReader IIlIIllIIIll;
            int llIIIllIIIll = IIlIIllIIIll.read();
            while (FastReader.IlllIlllIIIl(IIlIIllIIIll.isSpaceChar(llIIIllIIIll) ? 1 : 0)) {
                llIIIllIIIll = IIlIIllIIIll.read();
                "".length();
                if (" ".length() >= " ".length()) continue;
                return 0.0;
            }
            int IlIIIllIIIll = lIIIIIIlIl[3];
            if (FastReader.llIlIlllIIIl(llIIIllIIIll, lIIIIIIlIl[4])) {
                IlIIIllIIIll = lIIIIIIlIl[1];
                llIIIllIIIll = IIlIIllIIIll.read();
            }
            double lIIIIllIIIll = 0.0;
            while (FastReader.IIIIllllIIIl(IIlIIllIIIll.isSpaceChar(llIIIllIIIll) ? 1 : 0) && FastReader.lIIIllllIIIl(llIIIllIIIll, lIIIIIIlIl[8])) {
                if (!FastReader.lIIIllllIIIl(llIIIllIIIll, lIIIIIIlIl[9]) || FastReader.llIlIlllIIIl(llIIIllIIIll, lIIIIIIlIl[10])) {
                    return lIIIIllIIIll * Math.pow(10.0, IIlIIllIIIll.nextInt());
                }
                if (!FastReader.IIllIlllIIIl(llIIIllIIIll, lIIIIIIlIl[5]) || FastReader.llllIlllIIIl(llIIIllIIIll, lIIIIIIlIl[6])) {
                    throw new InputMismatchException();
                }
                lIIIIllIIIll *= 10.0;
                lIIIIllIIIll += (double)(llIIIllIIIll - lIIIIIIlIl[5]);
                llIIIllIIIll = IIlIIllIIIll.read();
                "".length();
                if (" ".length() << (" ".length() << " ".length()) >= -" ".length()) continue;
                return 0.0;
            }
            if (FastReader.llIlIlllIIIl(llIIIllIIIll, lIIIIIIlIl[8])) {
                llIIIllIIIll = IIlIIllIIIll.read();
                double IIIIIllIIIll = 1.0;
                while (FastReader.IIIIllllIIIl(IIlIIllIIIll.isSpaceChar(llIIIllIIIll) ? 1 : 0)) {
                    if (!FastReader.lIIIllllIIIl(llIIIllIIIll, lIIIIIIlIl[9]) || FastReader.llIlIlllIIIl(llIIIllIIIll, lIIIIIIlIl[10])) {
                        return lIIIIllIIIll * Math.pow(10.0, IIlIIllIIIll.nextInt());
                    }
                    if (!FastReader.IIllIlllIIIl(llIIIllIIIll, lIIIIIIlIl[5]) || FastReader.llllIlllIIIl(llIIIllIIIll, lIIIIIIlIl[6])) {
                        throw new InputMismatchException();
                    }
                    lIIIIllIIIll += (double)(llIIIllIIIll - lIIIIIIlIl[5]) * (IIIIIllIIIll /= 10.0);
                    llIIIllIIIll = IIlIIllIIIll.read();
                    "".length();
                    if (-" ".length() <= 0) continue;
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
            FastReader lIlllIlIIIll;
            int IIlllIlIIIll = lIlllIlIIIll.read();
            while (FastReader.IlllIlllIIIl(lIlllIlIIIll.isSpaceChar(IIlllIlIIIll) ? 1 : 0)) {
                IIlllIlIIIll = lIlllIlIIIll.read();
                "".length();
                if (" ".length() << " ".length() > 0) continue;
                return (char)(((0x6B ^ 0x54) << " ".length() ^ (0xCF ^ 0x90)) & (79 + 71 - 59 + 82 ^ (0xB6 ^ 0x95) << (" ".length() << " ".length()) ^ -" ".length()));
            }
            return (char)var1_1;
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var2_2;
            FastReader IIIllIlIIIll;
            int lllIlIlIIIll = IIIllIlIIIll.read();
            while (FastReader.IlllIlllIIIl(IIIllIlIIIll.isSpaceChar(lllIlIlIIIll) ? 1 : 0)) {
                lllIlIlIIIll = IIIllIlIIIll.read();
                "".length();
                if (((0x32 ^ 0x29) & ~(0x32 ^ 0x29)) == 0) continue;
                return null;
            }
            StringBuilder IllIlIlIIIll = new StringBuilder();
            do {
                IllIlIlIIIll.appendCodePoint(lllIlIlIIIll);
                "".length();
            } while (!FastReader.IlllIlllIIIl(IIIllIlIIIll.isSpaceChar(lllIlIlIIIll = IIIllIlIIIll.read()) ? 1 : 0));
            return String.valueOf(var2_2);
        }

        public boolean isSpaceChar(int IlIIlIlIIIll) {
            int n;
            FastReader llIIlIlIIIll;
            if (FastReader.llIIllllIIIl(llIIlIlIIIll.filter)) {
                return llIIlIlIIIll.filter.isSpaceChar(IlIIlIlIIIll);
            }
            if (!(FastReader.lIIIllllIIIl(IlIIlIlIIIll, lIIIIIIlIl[11]) && FastReader.lIIIllllIIIl(IlIIlIlIIIll, lIIIIIIlIl[7]) && FastReader.lIIIllllIIIl(IlIIlIlIIIll, lIIIIIIlIl[12]) && FastReader.lIIIllllIIIl(IlIIlIlIIIll, lIIIIIIlIl[13]) && !FastReader.llIlIlllIIIl(IlIIlIlIIIll, lIIIIIIlIl[1]))) {
                n = lIIIIIIlIl[3];
                "".length();
                if ("   ".length() <= -" ".length()) {
                    return (((0x6B ^ 0x78) << (" ".length() << " ".length()) ^ (0x78 ^ 0x3D)) << (" ".length() << " ".length()) & ((104 + 172 - 160 + 73 ^ (0x54 ^ 0x79) << (" ".length() << " ".length())) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
                }
            } else {
                n = lIIIIIIlIl[2];
            }
            return n != 0;
        }

        static {
            FastReader.IlIlIlllIIIl();
            FastReader.lllIIlllIIIl();
        }

        private static void lllIIlllIIIl() {
            IIIIIIIlIl = new String[lIIIIIIlIl[3]];
            FastReader.IIIIIIIlIl[FastReader.lIIIIIIlIl[2]] = FastReader.IllIIlllIIIl("mBXrDp3rZQk=", "VYGhl");
        }

        private static String IllIIlllIIIl(String lIllIIlIIIll, String IIllIIlIIIll) {
            try {
                SecretKeySpec llIlIIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIllIIlIIIll.getBytes(StandardCharsets.UTF_8)), lIIIIIIlIl[14]), "DES");
                Cipher IlIlIIlIIIll = Cipher.getInstance("DES");
                IlIlIIlIIIll.init(lIIIIIIlIl[15], llIlIIlIIIll);
                return new String(IlIlIIlIIIll.doFinal(Base64.getDecoder().decode(lIllIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lIIlIIlIIIll) {
                lIIlIIlIIIll.printStackTrace();
                return null;
            }
        }

        private static void IlIlIlllIIIl() {
            lIIIIIIlIl = new int[16];
            FastReader.lIIIIIIlIl[0] = " ".length() << ((5 ^ 0) << " ".length());
            FastReader.lIIIIIIlIl[1] = -" ".length();
            FastReader.lIIIIIIlIl[2] = (112 + 110 - 137 + 48 ^ (0x2C ^ 0x7B) << " ".length()) << " ".length() & ((34 + 21 - -79 + 19 ^ (0x72 ^ 0x2B) << " ".length()) << " ".length() ^ -" ".length());
            FastReader.lIIIIIIlIl[3] = " ".length();
            FastReader.lIIIIIIlIl[4] = 94 + 126 - 203 + 164 ^ (0x4D ^ 0x5E) << "   ".length();
            FastReader.lIIIIIIlIl[5] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastReader.lIIIIIIlIl[6] = 240 + 206 - 430 + 237 ^ (0x4B ^ 0x7A) << (" ".length() << " ".length());
            FastReader.lIIIIIIlIl[7] = (0x71 ^ 0x74) << " ".length();
            FastReader.lIIIIIIlIl[8] = ((0x9B ^ 0xC4) << " ".length() ^ 68 + 3 - -33 + 65) << " ".length();
            FastReader.lIIIIIIlIl[9] = 0xFB ^ 0x9E;
            FastReader.lIIIIIIlIl[10] = " ".length() << "   ".length() ^ (0xCE ^ 0x83);
            FastReader.lIIIIIIlIl[11] = " ".length() << (2 ^ 7);
            FastReader.lIIIIIIlIl[12] = (0x56 ^ 0x41) << "   ".length() ^ 84 + 51 - 58 + 104;
            FastReader.lIIIIIIlIl[13] = (0xD4 ^ 0x95) << " ".length() ^ 23 + 61 - 36 + 91;
            FastReader.lIIIIIIlIl[14] = " ".length() << "   ".length();
            FastReader.lIIIIIIlIl[15] = " ".length() << " ".length();
        }

        private static boolean llIlIlllIIIl(int n, int n2) {
            return n == n2;
        }

        private static boolean IIllIlllIIIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean llllIlllIIIl(int n, int n2) {
            return n > n2;
        }

        private static boolean llIIllllIIIl(Object object) {
            return object != null;
        }

        private static boolean IlllIlllIIIl(int n) {
            return n != 0;
        }

        private static boolean IIIIllllIIIl(int n) {
            return n == 0;
        }

        private static boolean lIllIlllIIIl(int n) {
            return n <= 0;
        }

        private static boolean lIIIllllIIIl(int n, int n2) {
            return n != n2;
        }

        public static interface SpaceCharFilter {
            public boolean isSpaceChar(int var1);
        }
    }
}

