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
import java.util.Base64;
import java.util.InputMismatchException;

class Main {
    private static int[] IIIIlll;

    Main() {
        Main lIIllIlIlIllIIl;
    }

    public static void main(String[] stringArray) {
        InputStream llllIIlIlIllIIl = System.in;
        PrintStream IlllIIlIlIllIIl = System.out;
        FastReader lIllIIlIlIllIIl = new FastReader(llllIIlIlIllIIl);
        PrintWriter IIllIIlIlIllIIl = new PrintWriter(IlllIIlIlIllIIl);
        int lIIlIIlIlIllIIl = IIIIlll[0];
        int llIlIIlIlIllIIl = lIllIIlIlIllIIl.nextInt();
        int[] IIIlIIlIlIllIIl = new int[llIlIIlIlIllIIl];
        int[] lllIIIlIlIllIIl = new int[llIlIIlIlIllIIl];
        int IlIlIIlIlIllIIl = IIIIlll[0];
        while (Main.llIllllIl(IlIlIIlIlIllIIl, llIlIIlIlIllIIl)) {
            IIIlIIlIlIllIIl[IlIlIIlIlIllIIl] = lIllIIlIlIllIIl.nextInt();
            lllIIIlIlIllIIl[IIIlIIlIlIllIIl[IlIlIIlIlIllIIl] - Main.IIIIlll[1]] = ++lIIlIIlIlIllIIl;
            ++IlIlIIlIlIllIIl;
            "".length();
            if (-" ".length() != ((0xAA ^ 0xBF) << (" ".length() << " ".length()) & ~((0x66 ^ 0x73) << (" ".length() << " ".length())))) continue;
            return;
        }
        IlIlIIlIlIllIIl = IIIIlll[0];
        while (Main.llIllllIl(IlIlIIlIlIllIIl, llIlIIlIlIllIIl)) {
            System.out.print(lllIIIlIlIllIIl[IlIlIIlIlIllIIl] + " ");
            ++IlIlIIlIlIllIIl;
            "".length();
            if ("   ".length() != " ".length() << (" ".length() << " ".length())) continue;
            return;
        }
        IIllIIlIlIllIIl.close();
    }

    static {
        Main.IlIllllIl();
    }

    private static void IlIllllIl() {
        IIIIlll = new int[2];
        Main.IIIIlll[0] = (0xF9 ^ 0xA4) & ~(0x27 ^ 0x7A);
        Main.IIIIlll[1] = " ".length();
    }

    private static boolean llIllllIl(int n, int n2) {
        return n < n2;
    }

    public static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[lIIIlll[0]];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private static String[] IlllIll;
        private static int[] lIIIlll;

        public FastReader(InputStream llllllIIlIllIIl) {
            FastReader IIIIIIlIlIllIIl;
            IIIIIIlIlIllIIl.stream = llllllIIlIllIIl;
        }

        public int read() {
            block5: {
                FastReader IIllllIIlIllIIl;
                if (FastReader.IllllllIl(IIllllIIlIllIIl.numChars, lIIIlll[1])) {
                    throw new InputMismatchException();
                }
                if (!FastReader.lllllllIl(IIllllIIlIllIIl.curChar, IIllllIIlIllIIl.numChars)) break block5;
                IIllllIIlIllIIl.curChar = lIIIlll[2];
                try {
                    IIllllIIlIllIIl.numChars = IIllllIIlIllIIl.stream.read(IIllllIIlIllIIl.buf);
                    "".length();
                }
                catch (IOException llIlllIIlIllIIl) {
                    throw new InputMismatchException();
                }
                if (null != null) {
                    return ((0x4A ^ 0x55) << "   ".length() ^ 121 + 83 - 159 + 146) & ("   ".length() << (" ".length() << (" ".length() << " ".length())) ^ (0xCF ^ 0xB8) ^ -" ".length());
                }
                if (FastReader.IIIIIIIll(IIllllIIlIllIIl.numChars)) {
                    return lIIIlll[1];
                }
            }
            int n = this.curChar;
            this.curChar = n + lIIIlll[3];
            return this.buf[n];
        }

        /*
         * WARNING - void declaration
         */
        public String nextLine() {
            void var2_2;
            BufferedReader lllIllIIlIllIIl = new BufferedReader(new InputStreamReader(System.in));
            String IllIllIIlIllIIl = IlllIll[lIIIlll[2]];
            try {
                IllIllIIlIllIIl = lllIllIIlIllIIl.readLine();
                "".length();
            }
            catch (IOException lIlIllIIlIllIIl) {
                lIlIllIIlIllIIl.printStackTrace();
            }
            if (" ".length() == 0) {
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
            FastReader IIIIllIIlIllIIl;
            int llllIlIIlIllIIl = IIIIllIIlIllIIl.read();
            while (FastReader.lIIIIIIll(IIIIllIIlIllIIl.isSpaceChar(llllIlIIlIllIIl) ? 1 : 0)) {
                llllIlIIlIllIIl = IIIIllIIlIllIIl.read();
                "".length();
                if ((" ".length() << " ".length() & ~(" ".length() << " ".length())) == ((0xBF ^ 0xB8) << (" ".length() << " ".length()) & ~((0x34 ^ 0x33) << (" ".length() << " ".length())))) continue;
                return (0x35 ^ 0x28) << " ".length() & ~((0x64 ^ 0x79) << " ".length());
            }
            int IlllIlIIlIllIIl = lIIIlll[3];
            if (FastReader.IllllllIl(llllIlIIlIllIIl, lIIIlll[4])) {
                IlllIlIIlIllIIl = lIIIlll[1];
                llllIlIIlIllIIl = IIIIllIIlIllIIl.read();
            }
            int lIllIlIIlIllIIl = lIIIlll[2];
            do {
                if (!FastReader.lllllllIl(llllIlIIlIllIIl, lIIIlll[5]) || FastReader.IlIIIIIll(llllIlIIlIllIIl, lIIIlll[6])) {
                    throw new InputMismatchException();
                }
                lIllIlIIlIllIIl *= lIIIlll[7];
                lIllIlIIlIllIIl += llllIlIIlIllIIl - lIIIlll[5];
            } while (!FastReader.lIIIIIIll(IIIIllIIlIllIIl.isSpaceChar(llllIlIIlIllIIl = IIIIllIIlIllIIl.read()) ? 1 : 0));
            return (int)(var3_3 * var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public long nextLong() {
            void var2_2;
            void var3_3;
            FastReader IIIlIlIIlIllIIl;
            int lllIIlIIlIllIIl = IIIlIlIIlIllIIl.read();
            while (FastReader.lIIIIIIll(IIIlIlIIlIllIIl.isSpaceChar(lllIIlIIlIllIIl) ? 1 : 0)) {
                lllIIlIIlIllIIl = IIIlIlIIlIllIIl.read();
                "".length();
                if (" ".length() << " ".length() != 0) continue;
                return 0L;
            }
            int IllIIlIIlIllIIl = lIIIlll[3];
            if (FastReader.IllllllIl(lllIIlIIlIllIIl, lIIIlll[4])) {
                IllIIlIIlIllIIl = lIIIlll[1];
                lllIIlIIlIllIIl = IIIlIlIIlIllIIl.read();
            }
            long lIlIIlIIlIllIIl = 0L;
            do {
                if (!FastReader.lllllllIl(lllIIlIIlIllIIl, lIIIlll[5]) || FastReader.IlIIIIIll(lllIIlIIlIllIIl, lIIIlll[6])) {
                    throw new InputMismatchException();
                }
                lIlIIlIIlIllIIl *= 10L;
                lIlIIlIIlIllIIl += (long)(lllIIlIIlIllIIl - lIIIlll[5]);
            } while (!FastReader.lIIIIIIll(IIIlIlIIlIllIIl.isSpaceChar(lllIIlIIlIllIIl = IIIlIlIIlIllIIl.read()) ? 1 : 0));
            return (long)(var3_3 * (long)var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public double nextDouble() {
            void var2_2;
            void var3_3;
            FastReader lllllIIIlIllIIl;
            int IllllIIIlIllIIl = lllllIIIlIllIIl.read();
            while (FastReader.lIIIIIIll(lllllIIIlIllIIl.isSpaceChar(IllllIIIlIllIIl) ? 1 : 0)) {
                IllllIIIlIllIIl = lllllIIIlIllIIl.read();
                "".length();
                if (" ".length() << (" ".length() << " ".length()) != " ".length()) continue;
                return 0.0;
            }
            int lIlllIIIlIllIIl = lIIIlll[3];
            if (FastReader.IllllllIl(IllllIIIlIllIIl, lIIIlll[4])) {
                lIlllIIIlIllIIl = lIIIlll[1];
                IllllIIIlIllIIl = lllllIIIlIllIIl.read();
            }
            double IIlllIIIlIllIIl = 0.0;
            while (FastReader.llIIIIIll(lllllIIIlIllIIl.isSpaceChar(IllllIIIlIllIIl) ? 1 : 0) && FastReader.IIlIIIIll(IllllIIIlIllIIl, lIIIlll[8])) {
                if (!FastReader.IIlIIIIll(IllllIIIlIllIIl, lIIIlll[9]) || FastReader.IllllllIl(IllllIIIlIllIIl, lIIIlll[10])) {
                    return IIlllIIIlIllIIl * Math.pow(10.0, lllllIIIlIllIIl.nextInt());
                }
                if (!FastReader.lllllllIl(IllllIIIlIllIIl, lIIIlll[5]) || FastReader.IlIIIIIll(IllllIIIlIllIIl, lIIIlll[6])) {
                    throw new InputMismatchException();
                }
                IIlllIIIlIllIIl *= 10.0;
                IIlllIIIlIllIIl += (double)(IllllIIIlIllIIl - lIIIlll[5]);
                IllllIIIlIllIIl = lllllIIIlIllIIl.read();
                "".length();
                if (" ".length() << (" ".length() << " ".length()) > " ".length()) continue;
                return 0.0;
            }
            if (FastReader.IllllllIl(IllllIIIlIllIIl, lIIIlll[8])) {
                IllllIIIlIllIIl = lllllIIIlIllIIl.read();
                double llIllIIIlIllIIl = 1.0;
                while (FastReader.llIIIIIll(lllllIIIlIllIIl.isSpaceChar(IllllIIIlIllIIl) ? 1 : 0)) {
                    if (!FastReader.IIlIIIIll(IllllIIIlIllIIl, lIIIlll[9]) || FastReader.IllllllIl(IllllIIIlIllIIl, lIIIlll[10])) {
                        return IIlllIIIlIllIIl * Math.pow(10.0, lllllIIIlIllIIl.nextInt());
                    }
                    if (!FastReader.lllllllIl(IllllIIIlIllIIl, lIIIlll[5]) || FastReader.IlIIIIIll(IllllIIIlIllIIl, lIIIlll[6])) {
                        throw new InputMismatchException();
                    }
                    IIlllIIIlIllIIl += (double)(IllllIIIlIllIIl - lIIIlll[5]) * (llIllIIIlIllIIl /= 10.0);
                    IllllIIIlIllIIl = lllllIIIlIllIIl.read();
                    "".length();
                    if ((((0x88 ^ 0x9F) << "   ".length() ^ 146 + 0 - 77 + 108) << "   ".length() & (((0x31 ^ 0x1E) << (" ".length() << " ".length()) ^ 61 + 63 - 10 + 67) << "   ".length() ^ -" ".length())) == 0) continue;
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
            FastReader IIIllIIIlIllIIl;
            int lllIlIIIlIllIIl = IIIllIIIlIllIIl.read();
            while (FastReader.lIIIIIIll(IIIllIIIlIllIIl.isSpaceChar(lllIlIIIlIllIIl) ? 1 : 0)) {
                lllIlIIIlIllIIl = IIIllIIIlIllIIl.read();
                "".length();
                if (null == null) continue;
                return (char)((0x74 ^ 0x6F) & ~(0x4B ^ 0x50));
            }
            return (char)var1_1;
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var2_2;
            FastReader llIIlIIIlIllIIl;
            int IlIIlIIIlIllIIl = llIIlIIIlIllIIl.read();
            while (FastReader.lIIIIIIll(llIIlIIIlIllIIl.isSpaceChar(IlIIlIIIlIllIIl) ? 1 : 0)) {
                IlIIlIIIlIllIIl = llIIlIIIlIllIIl.read();
                "".length();
                if (null == null) continue;
                return null;
            }
            StringBuilder lIIIlIIIlIllIIl = new StringBuilder();
            do {
                lIIIlIIIlIllIIl.appendCodePoint(IlIIlIIIlIllIIl);
                "".length();
            } while (!FastReader.lIIIIIIll(llIIlIIIlIllIIl.isSpaceChar(IlIIlIIIlIllIIl = llIIlIIIlIllIIl.read()) ? 1 : 0));
            return String.valueOf(var2_2);
        }

        public boolean isSpaceChar(int lIllIIIIlIllIIl) {
            int n;
            FastReader IlllIIIIlIllIIl;
            if (FastReader.lIlIIIIll(IlllIIIIlIllIIl.filter)) {
                return IlllIIIIlIllIIl.filter.isSpaceChar(lIllIIIIlIllIIl);
            }
            if (!(FastReader.IIlIIIIll(lIllIIIIlIllIIl, lIIIlll[11]) && FastReader.IIlIIIIll(lIllIIIIlIllIIl, lIIIlll[7]) && FastReader.IIlIIIIll(lIllIIIIlIllIIl, lIIIlll[12]) && FastReader.IIlIIIIll(lIllIIIIlIllIIl, lIIIlll[13]) && !FastReader.IllllllIl(lIllIIIIlIllIIl, lIIIlll[1]))) {
                n = lIIIlll[3];
                "".length();
                if (null != null) {
                    return ((0xB9 ^ 0xB2) << (" ".length() << " ".length()) & ~((0x3F ^ 0x34) << (" ".length() << " ".length()))) != 0;
                }
            } else {
                n = lIIIlll[2];
            }
            return n != 0;
        }

        static {
            FastReader.lIlllllIl();
            FastReader.IIlllllIl();
        }

        private static void IIlllllIl() {
            IlllIll = new String[lIIIlll[3]];
            FastReader.IlllIll[FastReader.lIIIlll[2]] = FastReader.lIIllllIl("", "wWDIc");
        }

        /*
         * Unable to fully structure code
         */
        private static String lIIllllIl(String llIIIIIIlIllIIl, String IlIIIIIIlIllIIl) {
            llIIIIIIlIllIIl = new String(Base64.getDecoder().decode(llIIIIIIlIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            lIIIIIIIlIllIIl = new StringBuilder();
            IIIIIIIIlIllIIl = IlIIIIIIlIllIIl.toCharArray();
            llllllllIIllIIl = FastReader.lIIIlll[2];
            lIlIllllIIllIIl = llIIIIIIlIllIIl.toCharArray();
            IllIllllIIllIIl = lIlIllllIIllIIl.length;
            lllIllllIIllIIl = FastReader.lIIIlll[2];
            "".length();
            if (("   ".length() << (116 ^ 113) & ~("   ".length() << (37 ^ 32))) < " ".length() << (" ".length() << " ".length())) ** GOTO lbl19
            return null;
lbl-1000:
            // 1 sources

            {
                IlllllllIIllIIl = lIlIllllIIllIIl[lllIllllIIllIIl];
                lIIIIIIIlIllIIl.append((char)(IlllllllIIllIIl ^ IIIIIIIIlIllIIl[llllllllIIllIIl % IIIIIIIIlIllIIl.length]));
                "".length();
                ++llllllllIIllIIl;
                ++lllIllllIIllIIl;
lbl19:
                // 2 sources

                ** while (!FastReader.lllllllIl((int)lllIllllIIllIIl, (int)IllIllllIIllIIl))
            }
lbl20:
            // 1 sources

            return String.valueOf(lIIIIIIIlIllIIl);
        }

        private static void lIlllllIl() {
            lIIIlll = new int[14];
            FastReader.lIIIlll[0] = " ".length() << ((0xA3 ^ 0xA6) << " ".length());
            FastReader.lIIIlll[1] = -" ".length();
            FastReader.lIIIlll[2] = (48 + 73 - 33 + 63 ^ (0x30 ^ 0x27) << "   ".length()) << " ".length() & ((66 + 38 - 41 + 116 ^ (0x48 ^ 0x6F) << (" ".length() << " ".length())) << " ".length() ^ -" ".length());
            FastReader.lIIIlll[3] = " ".length();
            FastReader.lIIIlll[4] = 0xC ^ 0x7F ^ (0x7F ^ 0x50) << " ".length();
            FastReader.lIIIlll[5] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastReader.lIIIlll[6] = 33 + 124 - 119 + 93 ^ (0xC7 ^ 0x9A) << " ".length();
            FastReader.lIIIlll[7] = (0x25 ^ 0x56 ^ (0x7F ^ 0x44) << " ".length()) << " ".length();
            FastReader.lIIIlll[8] = (0x74 ^ 0x63) << " ".length();
            FastReader.lIIIlll[9] = 90 + 8 - -27 + 114 ^ (0xC8 ^ 0x8D) << " ".length();
            FastReader.lIIIlll[10] = (0xA1 ^ 0xA8) << " ".length() ^ (0x4B ^ 0x1C);
            FastReader.lIIIlll[11] = " ".length() << (0xB2 ^ 0xB7);
            FastReader.lIIIlll[12] = 0x78 ^ 0x75;
            FastReader.lIIIlll[13] = 0xA1 ^ 0xA8;
        }

        private static boolean IllllllIl(int n, int n2) {
            return n == n2;
        }

        private static boolean lllllllIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean IlIIIIIll(int n, int n2) {
            return n > n2;
        }

        private static boolean lIlIIIIll(Object object) {
            return object != null;
        }

        private static boolean lIIIIIIll(int n) {
            return n != 0;
        }

        private static boolean llIIIIIll(int n) {
            return n == 0;
        }

        private static boolean IIIIIIIll(int n) {
            return n <= 0;
        }

        private static boolean IIlIIIIll(int n, int n2) {
            return n != n2;
        }

        public static interface SpaceCharFilter {
            public boolean isSpaceChar(int var1);
        }
    }
}

