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

public class Main {
    private static int[] lIllllIl;

    public Main() {
        Main IlIlllIIlIlIIIl;
    }

    /*
     * WARNING - void declaration
     */
    static long gcd(long lllIllIIlIlIIIl, long IllIllIIlIlIIIl) {
        long l;
        void var2_1;
        if (Main.IIIlIllIIl(Main.lllIIllIIl(lllIllIIlIlIIIl, 0L))) {
            return IllIllIIlIlIIIl;
        }
        return Main.gcd((long)(var2_1 % l), l);
    }

    /*
     * WARNING - void declaration
     */
    static long lcm(long llIIllIIlIlIIIl, long IlIIllIIlIlIIIl) {
        long l;
        void var2_1;
        return llIIllIIlIlIIIl * var2_1 / Main.gcd(l, (long)var2_1);
    }

    /*
     * WARNING - void declaration
     */
    static long func(long[] llIlIlIIlIlIIIl, long IlIlIlIIlIlIIIl, int lIIlIlIIlIlIIIl) {
        void var4_3;
        long IIIlIlIIlIlIIIl = llIlIlIIlIlIIIl[lIIlIlIIlIlIIIl];
        long lllIIlIIlIlIIIl = llIlIlIIlIlIIIl[lIIlIlIIlIlIIIl];
        int IllIIlIIlIlIIIl = lIIlIlIIlIlIIIl + lIllllIl[0];
        while (Main.IlIlIllIIl(Main.lIIlIllIIl(IllIIlIIlIlIIIl, IlIlIlIIlIlIIIl))) {
            lllIIlIIlIlIIIl = Math.max(llIlIlIIlIlIIIl[IllIIlIIlIlIIIl], lllIIlIIlIlIIIl + llIlIlIIlIlIIIl[IllIIlIIlIlIIIl]);
            IIIlIlIIlIlIIIl = Math.max(lllIIlIIlIlIIIl, IIIlIlIIlIlIIIl);
            ++IllIIlIIlIlIIIl;
            "".length();
            if (-" ".length() <= (((0x3D ^ 0x1E) << (" ".length() << " ".length()) ^ 70 + 165 - 186 + 132) & (142 + 72 - 82 + 13 ^ (3 ^ 0x16) << "   ".length() ^ -" ".length()))) continue;
            return 0L;
        }
        return (long)var4_3;
    }

    public static void main(String[] stringArray) {
        InputStream llIllIIIlIlIIIl = System.in;
        PrintStream IlIllIIIlIlIIIl = System.out;
        FastReader lIIllIIIlIlIIIl = new FastReader(llIllIIIlIlIIIl);
        PrintWriter IIIllIIIlIlIIIl = new PrintWriter(IlIllIIIlIlIIIl);
        int lIlIlIIIlIlIIIl = lIllllIl[1];
        int lllIlIIIlIlIIIl = lIIllIIIlIlIIIl.nextInt();
        int[] IIlIlIIIlIlIIIl = new int[lllIlIIIlIlIIIl];
        int[] llIIlIIIlIlIIIl = new int[lllIlIIIlIlIIIl];
        int IllIlIIIlIlIIIl = lIllllIl[1];
        while (Main.llIlIllIIl(IllIlIIIlIlIIIl, lllIlIIIlIlIIIl)) {
            IIlIlIIIlIlIIIl[IllIlIIIlIlIIIl] = lIIllIIIlIlIIIl.nextInt();
            ++IllIlIIIlIlIIIl;
            "".length();
            if (" ".length() != 0) continue;
            return;
        }
        llIIlIIIlIlIIIl[Main.lIllllIl[1]] = IIlIlIIIlIlIIIl[lIllllIl[1]];
        lIlIlIIIlIlIIIl = IIlIlIIIlIlIIIl[lIllllIl[1]];
        IllIlIIIlIlIIIl = lIllllIl[0];
        while (Main.llIlIllIIl(IllIlIIIlIlIIIl, lllIlIIIlIlIIIl)) {
            if (Main.IIllIllIIl(lIlIlIIIlIlIIIl, IIlIlIIIlIlIIIl[IllIlIIIlIlIIIl])) {
                llIIlIIIlIlIIIl[IllIlIIIlIlIIIl] = lIlIlIIIlIlIIIl = IIlIlIIIlIlIIIl[IllIlIIIlIlIIIl];
                "".length();
                if ((((0x9E ^ 0x89) << "   ".length() ^ 145 + 61 - 66 + 21) << " ".length() & ((95 + 96 - 42 + 18 ^ (0x7F ^ 0x20) << " ".length()) << " ".length() ^ -" ".length())) != 0) {
                    return;
                }
            } else {
                llIIlIIIlIlIIIl[IllIlIIIlIlIIIl] = lIlIlIIIlIlIIIl;
            }
            ++IllIlIIIlIlIIIl;
            "".length();
            if (" ".length() << " ".length() >= 0) continue;
            return;
        }
        int IlIIlIIIlIlIIIl = lIllllIl[1];
        IllIlIIIlIlIIIl = lIllllIl[1];
        while (Main.llIlIllIIl(IllIlIIIlIlIIIl, lllIlIIIlIlIIIl)) {
            if (Main.lIllIllIIl(llIIlIIIlIlIIIl[IllIlIIIlIlIIIl], IIlIlIIIlIlIIIl[IllIlIIIlIlIIIl])) {
                ++IlIIlIIIlIlIIIl;
            }
            ++IllIlIIIlIlIIIl;
            "".length();
            if (null == null) continue;
            return;
        }
        IIIllIIIlIlIIIl.println(IlIIlIIIlIlIIIl);
        IIIllIIIlIlIIIl.close();
    }

    static {
        Main.IllIIllIIl();
    }

    private static void IllIIllIIl() {
        lIllllIl = new int[2];
        Main.lIllllIl[0] = " ".length();
        Main.lIllllIl[1] = " ".length() << " ".length() & ~(" ".length() << " ".length());
    }

    private static boolean lIllIllIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean llIlIllIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IIllIllIIl(int n, int n2) {
        return n > n2;
    }

    private static boolean IIIlIllIIl(int n) {
        return n == 0;
    }

    private static boolean IlIlIllIIl(int n) {
        return n < 0;
    }

    private static int lllIIllIIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static int lIIlIllIIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[IIIIIIll[0]];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private static String[] IlllllIl;
        private static int[] IIIIIIll;

        public FastReader(InputStream IlllllllIIlIIIl) {
            FastReader llllllllIIlIIIl;
            llllllllIIlIIIl.stream = IlllllllIIlIIIl;
        }

        public int read() {
            block5: {
                FastReader llIlllllIIlIIIl;
                if (FastReader.lIIIlllIIl(llIlllllIIlIIIl.numChars, IIIIIIll[1])) {
                    throw new InputMismatchException();
                }
                if (!FastReader.IlIIlllIIl(llIlllllIIlIIIl.curChar, llIlllllIIlIIIl.numChars)) break block5;
                llIlllllIIlIIIl.curChar = IIIIIIll[2];
                try {
                    llIlllllIIlIIIl.numChars = llIlllllIIlIIIl.stream.read(llIlllllIIlIIIl.buf);
                    "".length();
                }
                catch (IOException IlIlllllIIlIIIl) {
                    throw new InputMismatchException();
                }
                if (" ".length() < (((0xD6 ^ 0x85) << " ".length() ^ 117 + 137 - 127 + 42) & (0x53 ^ 0x66 ^ (0x11 ^ 0xC) << " ".length() ^ -" ".length()))) {
                    return ((0x85 ^ 0x9E) << (" ".length() << " ".length()) ^ (0x14 ^ 0x63)) << " ".length() & (((0xB3 ^ 0x92) << " ".length() ^ (0x1B ^ 0x42)) << " ".length() ^ -" ".length());
                }
                if (FastReader.llIIlllIIl(llIlllllIIlIIIl.numChars)) {
                    return IIIIIIll[1];
                }
            }
            int n = this.curChar;
            this.curChar = n + IIIIIIll[3];
            return this.buf[n];
        }

        /*
         * WARNING - void declaration
         */
        public String nextLine() {
            void var2_2;
            BufferedReader IllIllllIIlIIIl = new BufferedReader(new InputStreamReader(System.in));
            String lIlIllllIIlIIIl = IlllllIl[IIIIIIll[2]];
            try {
                lIlIllllIIlIIIl = IllIllllIIlIIIl.readLine();
                "".length();
            }
            catch (IOException IIlIllllIIlIIIl) {
                IIlIllllIIlIIIl.printStackTrace();
            }
            if (" ".length() << " ".length() >= "   ".length()) {
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
            FastReader llllIlllIIlIIIl;
            int IlllIlllIIlIIIl = llllIlllIIlIIIl.read();
            while (FastReader.IIlIlllIIl(llllIlllIIlIIIl.isSpaceChar(IlllIlllIIlIIIl) ? 1 : 0)) {
                IlllIlllIIlIIIl = llllIlllIIlIIIl.read();
                "".length();
                if (((0x19 ^ 0x76 ^ (0x76 ^ 0x7F) << "   ".length()) << " ".length() & ((222 + 106 - 316 + 213 ^ (0x25 ^ 0x46) << " ".length()) << " ".length() ^ -" ".length())) <= " ".length() << (" ".length() << " ".length())) continue;
                return ((0x50 ^ 0x57) << (" ".length() << (" ".length() << " ".length())) ^ (0x2A ^ 0x4B)) << " ".length() & ((0x1A ^ 0x47 ^ (0xA3 ^ 0xB0) << (" ".length() << " ".length())) << " ".length() ^ -" ".length());
            }
            int lIllIlllIIlIIIl = IIIIIIll[3];
            if (FastReader.lIIIlllIIl(IlllIlllIIlIIIl, IIIIIIll[4])) {
                lIllIlllIIlIIIl = IIIIIIll[1];
                IlllIlllIIlIIIl = llllIlllIIlIIIl.read();
            }
            int IIllIlllIIlIIIl = IIIIIIll[2];
            do {
                if (!FastReader.IlIIlllIIl(IlllIlllIIlIIIl, IIIIIIll[5]) || FastReader.lIlIlllIIl(IlllIlllIIlIIIl, IIIIIIll[6])) {
                    throw new InputMismatchException();
                }
                IIllIlllIIlIIIl *= IIIIIIll[7];
                IIllIlllIIlIIIl += IlllIlllIIlIIIl - IIIIIIll[5];
            } while (!FastReader.IIlIlllIIl(llllIlllIIlIIIl.isSpaceChar(IlllIlllIIlIIIl = llllIlllIIlIIIl.read()) ? 1 : 0));
            return (int)(var3_3 * var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public long nextLong() {
            void var2_2;
            void var3_3;
            FastReader lllIIlllIIlIIIl;
            int IllIIlllIIlIIIl = lllIIlllIIlIIIl.read();
            while (FastReader.IIlIlllIIl(lllIIlllIIlIIIl.isSpaceChar(IllIIlllIIlIIIl) ? 1 : 0)) {
                IllIIlllIIlIIIl = lllIIlllIIlIIIl.read();
                "".length();
                if (" ".length() << " ".length() > 0) continue;
                return 0L;
            }
            int lIlIIlllIIlIIIl = IIIIIIll[3];
            if (FastReader.lIIIlllIIl(IllIIlllIIlIIIl, IIIIIIll[4])) {
                lIlIIlllIIlIIIl = IIIIIIll[1];
                IllIIlllIIlIIIl = lllIIlllIIlIIIl.read();
            }
            long IIlIIlllIIlIIIl = 0L;
            do {
                if (!FastReader.IlIIlllIIl(IllIIlllIIlIIIl, IIIIIIll[5]) || FastReader.lIlIlllIIl(IllIIlllIIlIIIl, IIIIIIll[6])) {
                    throw new InputMismatchException();
                }
                IIlIIlllIIlIIIl *= 10L;
                IIlIIlllIIlIIIl += (long)(IllIIlllIIlIIIl - IIIIIIll[5]);
            } while (!FastReader.IIlIlllIIl(lllIIlllIIlIIIl.isSpaceChar(IllIIlllIIlIIIl = lllIIlllIIlIIIl.read()) ? 1 : 0));
            return (long)(var3_3 * (long)var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public double nextDouble() {
            void var2_2;
            void var3_3;
            FastReader IllllIllIIlIIIl;
            int lIlllIllIIlIIIl = IllllIllIIlIIIl.read();
            while (FastReader.IIlIlllIIl(IllllIllIIlIIIl.isSpaceChar(lIlllIllIIlIIIl) ? 1 : 0)) {
                lIlllIllIIlIIIl = IllllIllIIlIIIl.read();
                "".length();
                if (" ".length() << " ".length() > 0) continue;
                return 0.0;
            }
            int IIlllIllIIlIIIl = IIIIIIll[3];
            if (FastReader.lIIIlllIIl(lIlllIllIIlIIIl, IIIIIIll[4])) {
                IIlllIllIIlIIIl = IIIIIIll[1];
                lIlllIllIIlIIIl = IllllIllIIlIIIl.read();
            }
            double llIllIllIIlIIIl = 0.0;
            while (FastReader.IllIlllIIl(IllllIllIIlIIIl.isSpaceChar(lIlllIllIIlIIIl) ? 1 : 0) && FastReader.lllIlllIIl(lIlllIllIIlIIIl, IIIIIIll[8])) {
                if (!FastReader.lllIlllIIl(lIlllIllIIlIIIl, IIIIIIll[9]) || FastReader.lIIIlllIIl(lIlllIllIIlIIIl, IIIIIIll[10])) {
                    return llIllIllIIlIIIl * Math.pow(10.0, IllllIllIIlIIIl.nextInt());
                }
                if (!FastReader.IlIIlllIIl(lIlllIllIIlIIIl, IIIIIIll[5]) || FastReader.lIlIlllIIl(lIlllIllIIlIIIl, IIIIIIll[6])) {
                    throw new InputMismatchException();
                }
                llIllIllIIlIIIl *= 10.0;
                llIllIllIIlIIIl += (double)(lIlllIllIIlIIIl - IIIIIIll[5]);
                lIlllIllIIlIIIl = IllllIllIIlIIIl.read();
                "".length();
                if (" ".length() << " ".length() > 0) continue;
                return 0.0;
            }
            if (FastReader.lIIIlllIIl(lIlllIllIIlIIIl, IIIIIIll[8])) {
                lIlllIllIIlIIIl = IllllIllIIlIIIl.read();
                double IlIllIllIIlIIIl = 1.0;
                while (FastReader.IllIlllIIl(IllllIllIIlIIIl.isSpaceChar(lIlllIllIIlIIIl) ? 1 : 0)) {
                    if (!FastReader.lllIlllIIl(lIlllIllIIlIIIl, IIIIIIll[9]) || FastReader.lIIIlllIIl(lIlllIllIIlIIIl, IIIIIIll[10])) {
                        return llIllIllIIlIIIl * Math.pow(10.0, IllllIllIIlIIIl.nextInt());
                    }
                    if (!FastReader.IlIIlllIIl(lIlllIllIIlIIIl, IIIIIIll[5]) || FastReader.lIlIlllIIl(lIlllIllIIlIIIl, IIIIIIll[6])) {
                        throw new InputMismatchException();
                    }
                    llIllIllIIlIIIl += (double)(lIlllIllIIlIIIl - IIIIIIll[5]) * (IlIllIllIIlIIIl /= 10.0);
                    lIlllIllIIlIIIl = IllllIllIIlIIIl.read();
                    "".length();
                    if (" ".length() >= 0) continue;
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
            FastReader lllIlIllIIlIIIl;
            int IllIlIllIIlIIIl = lllIlIllIIlIIIl.read();
            while (FastReader.IIlIlllIIl(lllIlIllIIlIIIl.isSpaceChar(IllIlIllIIlIIIl) ? 1 : 0)) {
                IllIlIllIIlIIIl = lllIlIllIIlIIIl.read();
                "".length();
                if (-"   ".length() <= 0) continue;
                return (char)((0x43 ^ 0x52) & ~(0xB1 ^ 0xA0));
            }
            return (char)var1_1;
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var2_2;
            FastReader IlIIlIllIIlIIIl;
            int lIIIlIllIIlIIIl = IlIIlIllIIlIIIl.read();
            while (FastReader.IIlIlllIIl(IlIIlIllIIlIIIl.isSpaceChar(lIIIlIllIIlIIIl) ? 1 : 0)) {
                lIIIlIllIIlIIIl = IlIIlIllIIlIIIl.read();
                "".length();
                if (" ".length() > 0) continue;
                return null;
            }
            StringBuilder IIIIlIllIIlIIIl = new StringBuilder();
            do {
                IIIIlIllIIlIIIl.appendCodePoint(lIIIlIllIIlIIIl);
                "".length();
            } while (!FastReader.IIlIlllIIl(IlIIlIllIIlIIIl.isSpaceChar(lIIIlIllIIlIIIl = IlIIlIllIIlIIIl.read()) ? 1 : 0));
            return String.valueOf(var2_2);
        }

        public boolean isSpaceChar(int IIllIIllIIlIIIl) {
            int n;
            FastReader lIllIIllIIlIIIl;
            if (FastReader.IIIllllIIl(lIllIIllIIlIIIl.filter)) {
                return lIllIIllIIlIIIl.filter.isSpaceChar(IIllIIllIIlIIIl);
            }
            if (!(FastReader.lllIlllIIl(IIllIIllIIlIIIl, IIIIIIll[11]) && FastReader.lllIlllIIl(IIllIIllIIlIIIl, IIIIIIll[7]) && FastReader.lllIlllIIl(IIllIIllIIlIIIl, IIIIIIll[12]) && FastReader.lllIlllIIl(IIllIIllIIlIIIl, IIIIIIll[13]) && !FastReader.lIIIlllIIl(IIllIIllIIlIIIl, IIIIIIll[1]))) {
                n = IIIIIIll[3];
                "".length();
                if (null != null) {
                    return ((0xBD ^ 0x90) << " ".length() & ~((0x8E ^ 0xA3) << " ".length())) != 0;
                }
            } else {
                n = IIIIIIll[2];
            }
            return n != 0;
        }

        static {
            FastReader.IIIIlllIIl();
            FastReader.llllIllIIl();
        }

        private static void llllIllIIl() {
            IlllllIl = new String[IIIIIIll[3]];
            FastReader.IlllllIl[FastReader.IIIIIIll[2]] = FastReader.IlllIllIIl("", "ESitS");
        }

        /*
         * Unable to fully structure code
         */
        private static String IlllIllIIl(String IlIIIIllIIlIIIl, String lIIIIIllIIlIIIl) {
            IlIIIIllIIlIIIl = new String(Base64.getDecoder().decode(IlIIIIllIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            IIIIIIllIIlIIIl = new StringBuilder();
            llllllIlIIlIIIl = lIIIIIllIIlIIIl.toCharArray();
            IlllllIlIIlIIIl = FastReader.IIIIIIll[2];
            IIlIllIlIIlIIIl = IlIIIIllIIlIIIl.toCharArray();
            lIlIllIlIIlIIIl = IIlIllIlIIlIIIl.length;
            IllIllIlIIlIIIl = FastReader.IIIIIIll[2];
            "".length();
            if (" ".length() >= -" ".length()) ** GOTO lbl19
            return null;
lbl-1000:
            // 1 sources

            {
                lIllllIlIIlIIIl = IIlIllIlIIlIIIl[IllIllIlIIlIIIl];
                IIIIIIllIIlIIIl.append((char)(lIllllIlIIlIIIl ^ llllllIlIIlIIIl[IlllllIlIIlIIIl % llllllIlIIlIIIl.length]));
                "".length();
                ++IlllllIlIIlIIIl;
                ++IllIllIlIIlIIIl;
lbl19:
                // 2 sources

                ** while (!FastReader.IlIIlllIIl((int)IllIllIlIIlIIIl, (int)lIlIllIlIIlIIIl))
            }
lbl20:
            // 1 sources

            return String.valueOf(IIIIIIllIIlIIIl);
        }

        private static void IIIIlllIIl() {
            IIIIIIll = new int[14];
            FastReader.IIIIIIll[0] = " ".length() << ((0xB2 ^ 0xBB ^ "   ".length() << (" ".length() << " ".length())) << " ".length());
            FastReader.IIIIIIll[1] = -" ".length();
            FastReader.IIIIIIll[2] = (0x3F ^ 0x12 ^ (0xBA ^ 0xBD) << " ".length()) << " ".length() & (((0x75 ^ 0x50) << (" ".length() << " ".length()) ^ 11 + 105 - -39 + 28) << " ".length() ^ -" ".length());
            FastReader.IIIIIIll[3] = " ".length();
            FastReader.IIIIIIll[4] = (0x1D ^ 0x3E) << (" ".length() << " ".length()) ^ 63 + 120 - 127 + 105;
            FastReader.IIIIIIll[5] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastReader.IIIIIIll[6] = (0x48 ^ 0x59) << (" ".length() << " ".length()) ^ (0x62 ^ 0x1F);
            FastReader.IIIIIIll[7] = (" ".length() << " ".length() ^ (0xBE ^ 0xB9)) << " ".length();
            FastReader.IIIIIIll[8] = (0x6D ^ 0x7A) << " ".length();
            FastReader.IIIIIIll[9] = (0xE7 ^ 0x94) << " ".length() ^ 127 + 78 - 153 + 79;
            FastReader.IIIIIIll[10] = (0x50 ^ 0x4F) << "   ".length() ^ 45 + 88 - 109 + 165;
            FastReader.IIIIIIll[11] = " ".length() << (0x79 ^ 0x7C);
            FastReader.IIIIIIll[12] = 0xB9 ^ 0xB4;
            FastReader.IIIIIIll[13] = (5 ^ 0x20) << (" ".length() << " ".length()) ^ 90 + 85 - 131 + 113;
        }

        private static boolean lIIIlllIIl(int n, int n2) {
            return n == n2;
        }

        private static boolean IlIIlllIIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean lIlIlllIIl(int n, int n2) {
            return n > n2;
        }

        private static boolean IIIllllIIl(Object object) {
            return object != null;
        }

        private static boolean IIlIlllIIl(int n) {
            return n != 0;
        }

        private static boolean IllIlllIIl(int n) {
            return n == 0;
        }

        private static boolean llIIlllIIl(int n) {
            return n <= 0;
        }

        private static boolean lllIlllIIl(int n, int n2) {
            return n != n2;
        }

        public static interface SpaceCharFilter {
            public boolean isSpaceChar(int var1);
        }
    }
}

