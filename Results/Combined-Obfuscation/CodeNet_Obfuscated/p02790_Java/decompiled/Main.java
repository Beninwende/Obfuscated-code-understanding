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
    private static String[] lIIllIl;
    private static int[] IIlllIl;

    public Main() {
        Main lllIIlIIIIIIlIl;
    }

    /*
     * WARNING - void declaration
     */
    static long gcd(long IIlIIlIIIIIIlIl, long llIIIlIIIIIIlIl) {
        long l;
        void var2_1;
        if (Main.llIlIlIIl(Main.IlIlIlIIl(IIlIIlIIIIIIlIl, 0L))) {
            return llIIIlIIIIIIlIl;
        }
        return Main.gcd((long)(var2_1 % l), l);
    }

    /*
     * WARNING - void declaration
     */
    static long lcm(long IIIIIlIIIIIIlIl, long lllllIIIIIIIlIl) {
        long l;
        void var2_1;
        return IIIIIlIIIIIIlIl * var2_1 / Main.gcd(l, (long)var2_1);
    }

    /*
     * WARNING - void declaration
     */
    static long func(long[] IIIllIIIIIIIlIl, long lllIlIIIIIIIlIl, int IllIlIIIIIIIlIl) {
        void var4_3;
        long lIlIlIIIIIIIlIl = IIIllIIIIIIIlIl[IllIlIIIIIIIlIl];
        long IIlIlIIIIIIIlIl = IIIllIIIIIIIlIl[IllIlIIIIIIIlIl];
        int llIIlIIIIIIIlIl = IllIlIIIIIIIlIl + IIlllIl[0];
        while (Main.IlllIlIIl(Main.IIllIlIIl(llIIlIIIIIIIlIl, lllIlIIIIIIIlIl))) {
            IIlIlIIIIIIIlIl = Math.max(IIIllIIIIIIIlIl[llIIlIIIIIIIlIl], IIlIlIIIIIIIlIl + IIIllIIIIIIIlIl[llIIlIIIIIIIlIl]);
            lIlIlIIIIIIIlIl = Math.max(IIlIlIIIIIIIlIl, lIlIlIIIIIIIlIl);
            ++llIIlIIIIIIIlIl;
            "".length();
            if ("   ".length() == "   ".length()) continue;
            return 0L;
        }
        return (long)var4_3;
    }

    public static void main(String[] stringArray) {
        InputStream IlIlIIIIIIIIlIl = System.in;
        PrintStream lIIlIIIIIIIIlIl = System.out;
        FastReader IIIlIIIIIIIIlIl = new FastReader(IlIlIIIIIIIIlIl);
        PrintWriter lllIIIIIIIIIlIl = new PrintWriter(lIIlIIIIIIIIlIl);
        Object IIlIIIIIIIIIlIl = lIIllIl[IIlllIl[1]];
        String IllIIIIIIIIIlIl = IIIlIIIIIIIIlIl.next();
        String lIlIIIIIIIIIlIl = IIIlIIIIIIIIlIl.next();
        if (Main.llllIlIIl(Integer.parseInt(IllIIIIIIIIIlIl), Integer.parseInt(lIlIIIIIIIIIlIl))) {
            int llIIIIIIIIIIlIl = IIlllIl[1];
            while (Main.llllIlIIl(llIIIIIIIIIIlIl, Integer.parseInt(lIlIIIIIIIIIlIl))) {
                IIlIIIIIIIIIlIl = (String)IIlIIIIIIIIIlIl + IllIIIIIIIIIlIl;
                ++llIIIIIIIIIIlIl;
                "".length();
                if ((0xC6 ^ 0xC3) != 0) continue;
                return;
            }
            "".length();
            if ((("   ".length() << "   ".length() ^ (0x3F ^ 0x22)) << "   ".length() & (((0xDE ^ 0x9B) << " ".length() ^ 138 + 46 - 76 + 35) << "   ".length() ^ -" ".length())) < 0) {
                return;
            }
        } else {
            int llIIIIIIIIIIlIl = IIlllIl[1];
            while (Main.llllIlIIl(llIIIIIIIIIIlIl, Integer.parseInt(IllIIIIIIIIIlIl))) {
                IIlIIIIIIIIIlIl = (String)IIlIIIIIIIIIlIl + lIlIIIIIIIIIlIl;
                ++llIIIIIIIIIIlIl;
                "".length();
                if (" ".length() >= 0) continue;
                return;
            }
        }
        lllIIIIIIIIIlIl.println((String)IIlIIIIIIIIIlIl);
        lllIIIIIIIIIlIl.close();
    }

    static {
        Main.lIIlIlIIl();
        Main.lIlIIlIIl();
    }

    private static void lIlIIlIIl() {
        lIIllIl = new String[IIlllIl[0]];
        Main.lIIllIl[Main.IIlllIl[1]] = Main.llIIIlIIl("", "IcRWN");
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String llIIIlIIl(String lIIlllllllllIIl, String IIIlllllllllIIl) {
        lIIlllllllllIIl = new String(Base64.getDecoder().decode(lIIlllllllllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIllllllllIIl = new StringBuilder();
        char[] IllIllllllllIIl = IIIlllllllllIIl.toCharArray();
        int lIlIllllllllIIl = IIlllIl[1];
        char[] llIlIlllllllIIl = lIIlllllllllIIl.toCharArray();
        int IIllIlllllllIIl = llIlIlllllllIIl.length;
        int lIllIlllllllIIl = IIlllIl[1];
        "".length();
        while (!Main.IIIIllIIl(lIllIlllllllIIl, IIllIlllllllIIl)) {
            char IIlIllllllllIIl = llIlIlllllllIIl[lIllIlllllllIIl];
            lllIllllllllIIl.append((char)(IIlIllllllllIIl ^ IllIllllllllIIl[lIlIllllllllIIl % IllIllllllllIIl.length]));
            "".length();
            ++lIlIllllllllIIl;
            ++lIllIlllllllIIl;
        }
        return String.valueOf(lllIllllllllIIl);
    }

    private static void lIIlIlIIl() {
        IIlllIl = new int[2];
        Main.IIlllIl[0] = " ".length();
        Main.IIlllIl[1] = (0xA5 ^ 0xC0 ^ (0x8D ^ 0xAA) << " ".length()) & ((0x95 ^ 0xBC) << " ".length() ^ (0x1C ^ 0x65) ^ -" ".length());
    }

    private static boolean IIIIllIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean llllIlIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean llIlIlIIl(int n) {
        return n == 0;
    }

    private static boolean IlllIlIIl(int n) {
        return n < 0;
    }

    private static int IlIlIlIIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static int IIllIlIIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[llIllIl[0]];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private static String[] IIIllIl;
        private static int[] llIllIl;

        public FastReader(InputStream llIllIllllllIIl) {
            FastReader IIlllIllllllIIl;
            IIlllIllllllIIl.stream = llIllIllllllIIl;
        }

        public int read() {
            block5: {
                FastReader IIIllIllllllIIl;
                if (FastReader.lllIIlIIl(IIIllIllllllIIl.numChars, llIllIl[1])) {
                    throw new InputMismatchException();
                }
                if (!FastReader.IIIlIlIIl(IIIllIllllllIIl.curChar, IIIllIllllllIIl.numChars)) break block5;
                IIIllIllllllIIl.curChar = llIllIl[2];
                try {
                    IIIllIllllllIIl.numChars = IIIllIllllllIIl.stream.read(IIIllIllllllIIl.buf);
                    "".length();
                }
                catch (IOException lllIlIllllllIIl) {
                    throw new InputMismatchException();
                }
                if (" ".length() << " ".length() == 0) {
                    return (" ".length() << ("   ".length() << " ".length()) ^ (0xF1 ^ 0x9A)) & ((0x5A ^ 0x7F) << " ".length() ^ (0xEF ^ 0x8E) ^ -" ".length());
                }
                if (FastReader.lIllIlIIl(IIIllIllllllIIl.numChars)) {
                    return llIllIl[1];
                }
            }
            int n = this.curChar;
            this.curChar = n + llIllIl[3];
            return this.buf[n];
        }

        /*
         * WARNING - void declaration
         */
        public String nextLine() {
            void var2_2;
            BufferedReader llIIlIllllllIIl = new BufferedReader(new InputStreamReader(System.in));
            String IlIIlIllllllIIl = IIIllIl[llIllIl[2]];
            try {
                IlIIlIllllllIIl = llIIlIllllllIIl.readLine();
                "".length();
            }
            catch (IOException lIIIlIllllllIIl) {
                lIIIlIllllllIIl.printStackTrace();
            }
            if (((0x4D ^ 0x4A) << " ".length() & ~((0x87 ^ 0x80) << " ".length())) > " ".length()) {
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
            FastReader IIllIIllllllIIl;
            int llIlIIllllllIIl = IIllIIllllllIIl.read();
            while (FastReader.lIIIllIIl(IIllIIllllllIIl.isSpaceChar(llIlIIllllllIIl) ? 1 : 0)) {
                llIlIIllllllIIl = IIllIIllllllIIl.read();
                "".length();
                if (" ".length() << (" ".length() << " ".length()) >= ((0x95 ^ 0xBC ^ " ".length() << (0x42 ^ 0x47)) << "   ".length() & (((9 ^ 0) << (" ".length() << (" ".length() << " ".length())) ^ 69 + 9 - 72 + 147) << "   ".length() ^ -" ".length()))) continue;
                return ((0xDD ^ 0xC4) << (" ".length() << " ".length()) ^ (0x2B ^ 0x66)) & ((0x8F ^ 0x86) << (" ".length() << (" ".length() << " ".length())) ^ 29 + 12 - 39 + 183 ^ -" ".length());
            }
            int IlIlIIllllllIIl = llIllIl[3];
            if (FastReader.lllIIlIIl(llIlIIllllllIIl, llIllIl[4])) {
                IlIlIIllllllIIl = llIllIl[1];
                llIlIIllllllIIl = IIllIIllllllIIl.read();
            }
            int lIIlIIllllllIIl = llIllIl[2];
            do {
                if (!FastReader.IIIlIlIIl(llIlIIllllllIIl, llIllIl[5]) || FastReader.IlIIllIIl(llIlIIllllllIIl, llIllIl[6])) {
                    throw new InputMismatchException();
                }
                lIIlIIllllllIIl *= llIllIl[7];
                lIIlIIllllllIIl += llIlIIllllllIIl - llIllIl[5];
            } while (!FastReader.lIIIllIIl(IIllIIllllllIIl.isSpaceChar(llIlIIllllllIIl = IIllIIllllllIIl.read()) ? 1 : 0));
            return (int)(var3_3 * var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public long nextLong() {
            void var2_2;
            void var3_3;
            FastReader IIlIIIllllllIIl;
            int llIIIIllllllIIl = IIlIIIllllllIIl.read();
            while (FastReader.lIIIllIIl(IIlIIIllllllIIl.isSpaceChar(llIIIIllllllIIl) ? 1 : 0)) {
                llIIIIllllllIIl = IIlIIIllllllIIl.read();
                "".length();
                if (-"  ".length() <= 0) continue;
                return 0L;
            }
            int IlIIIIllllllIIl = llIllIl[3];
            if (FastReader.lllIIlIIl(llIIIIllllllIIl, llIllIl[4])) {
                IlIIIIllllllIIl = llIllIl[1];
                llIIIIllllllIIl = IIlIIIllllllIIl.read();
            }
            long lIIIIIllllllIIl = 0L;
            do {
                if (!FastReader.IIIlIlIIl(llIIIIllllllIIl, llIllIl[5]) || FastReader.IlIIllIIl(llIIIIllllllIIl, llIllIl[6])) {
                    throw new InputMismatchException();
                }
                lIIIIIllllllIIl *= 10L;
                lIIIIIllllllIIl += (long)(llIIIIllllllIIl - llIllIl[5]);
            } while (!FastReader.lIIIllIIl(IIlIIIllllllIIl.isSpaceChar(llIIIIllllllIIl = IIlIIIllllllIIl.read()) ? 1 : 0));
            return (long)(var3_3 * (long)var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public double nextDouble() {
            void var2_2;
            void var3_3;
            FastReader llIlllIlllllIIl;
            int IlIlllIlllllIIl = llIlllIlllllIIl.read();
            while (FastReader.lIIIllIIl(llIlllIlllllIIl.isSpaceChar(IlIlllIlllllIIl) ? 1 : 0)) {
                IlIlllIlllllIIl = llIlllIlllllIIl.read();
                "".length();
                if (((0x10 ^ 0x1F) & ~(0x14 ^ 0x1B)) == 0) continue;
                return 0.0;
            }
            int lIIlllIlllllIIl = llIllIl[3];
            if (FastReader.lllIIlIIl(IlIlllIlllllIIl, llIllIl[4])) {
                lIIlllIlllllIIl = llIllIl[1];
                IlIlllIlllllIIl = llIlllIlllllIIl.read();
            }
            double IIIlllIlllllIIl = 0.0;
            while (FastReader.llIIllIIl(llIlllIlllllIIl.isSpaceChar(IlIlllIlllllIIl) ? 1 : 0) && FastReader.IIlIllIIl(IlIlllIlllllIIl, llIllIl[8])) {
                if (!FastReader.IIlIllIIl(IlIlllIlllllIIl, llIllIl[9]) || FastReader.lllIIlIIl(IlIlllIlllllIIl, llIllIl[10])) {
                    return IIIlllIlllllIIl * Math.pow(10.0, llIlllIlllllIIl.nextInt());
                }
                if (!FastReader.IIIlIlIIl(IlIlllIlllllIIl, llIllIl[5]) || FastReader.IlIIllIIl(IlIlllIlllllIIl, llIllIl[6])) {
                    throw new InputMismatchException();
                }
                IIIlllIlllllIIl *= 10.0;
                IIIlllIlllllIIl += (double)(IlIlllIlllllIIl - llIllIl[5]);
                IlIlllIlllllIIl = llIlllIlllllIIl.read();
                "".length();
                if ("   ".length() > -" ".length()) continue;
                return 0.0;
            }
            if (FastReader.lllIIlIIl(IlIlllIlllllIIl, llIllIl[8])) {
                IlIlllIlllllIIl = llIlllIlllllIIl.read();
                double lllIllIlllllIIl = 1.0;
                while (FastReader.llIIllIIl(llIlllIlllllIIl.isSpaceChar(IlIlllIlllllIIl) ? 1 : 0)) {
                    if (!FastReader.IIlIllIIl(IlIlllIlllllIIl, llIllIl[9]) || FastReader.lllIIlIIl(IlIlllIlllllIIl, llIllIl[10])) {
                        return IIIlllIlllllIIl * Math.pow(10.0, llIlllIlllllIIl.nextInt());
                    }
                    if (!FastReader.IIIlIlIIl(IlIlllIlllllIIl, llIllIl[5]) || FastReader.IlIIllIIl(IlIlllIlllllIIl, llIllIl[6])) {
                        throw new InputMismatchException();
                    }
                    IIIlllIlllllIIl += (double)(IlIlllIlllllIIl - llIllIl[5]) * (lllIllIlllllIIl /= 10.0);
                    IlIlllIlllllIIl = llIlllIlllllIIl.read();
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
            FastReader IIlIllIlllllIIl;
            int llIIllIlllllIIl = IIlIllIlllllIIl.read();
            while (FastReader.lIIIllIIl(IIlIllIlllllIIl.isSpaceChar(llIIllIlllllIIl) ? 1 : 0)) {
                llIIllIlllllIIl = IIlIllIlllllIIl.read();
                "".length();
                if (" ".length() << " ".length() > 0) continue;
                return (char)((0x7A ^ 0xD ^ (0xA9 ^ 0xB2) << (" ".length() << " ".length())) << " ".length() & ((0x38 ^ 7 ^ (0x48 ^ 0x41) << (" ".length() << " ".length())) << " ".length() ^ -" ".length()));
            }
            return (char)var1_1;
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var2_2;
            FastReader llllIlIlllllIIl;
            int IlllIlIlllllIIl = llllIlIlllllIIl.read();
            while (FastReader.lIIIllIIl(llllIlIlllllIIl.isSpaceChar(IlllIlIlllllIIl) ? 1 : 0)) {
                IlllIlIlllllIIl = llllIlIlllllIIl.read();
                "".length();
                if ((((0x20 ^ 1) << " ".length() ^ (0x4F ^ 0x28)) << " ".length() & (((0x1B ^ 0x10) << (" ".length() << (" ".length() << " ".length())) ^ 101 + 15 - 29 + 62) << " ".length() ^ -" ".length())) == 0) continue;
                return null;
            }
            StringBuilder lIllIlIlllllIIl = new StringBuilder();
            do {
                lIllIlIlllllIIl.appendCodePoint(IlllIlIlllllIIl);
                "".length();
            } while (!FastReader.lIIIllIIl(llllIlIlllllIIl.isSpaceChar(IlllIlIlllllIIl = llllIlIlllllIIl.read()) ? 1 : 0));
            return String.valueOf(var2_2);
        }

        public boolean isSpaceChar(int lIIlIlIlllllIIl) {
            int n;
            FastReader IlIlIlIlllllIIl;
            if (FastReader.lIlIllIIl(IlIlIlIlllllIIl.filter)) {
                return IlIlIlIlllllIIl.filter.isSpaceChar(lIIlIlIlllllIIl);
            }
            if (!(FastReader.IIlIllIIl(lIIlIlIlllllIIl, llIllIl[11]) && FastReader.IIlIllIIl(lIIlIlIlllllIIl, llIllIl[7]) && FastReader.IIlIllIIl(lIIlIlIlllllIIl, llIllIl[12]) && FastReader.IIlIllIIl(lIIlIlIlllllIIl, llIllIl[13]) && !FastReader.lllIIlIIl(lIIlIlIlllllIIl, llIllIl[1]))) {
                n = llIllIl[3];
                "".length();
                if (-" ".length() >= " ".length() << (" ".length() << " ".length())) {
                    return (((0x7E ^ 0x45) << " ".length() ^ (0x48 ^ 0x31)) & ((0x7F ^ 0x6A) << "   ".length() ^ 44 + 116 - 156 + 163 ^ -" ".length())) != 0;
                }
            } else {
                n = llIllIl[2];
            }
            return n != 0;
        }

        static {
            FastReader.IllIIlIIl();
            FastReader.IIlIIlIIl();
        }

        private static void IIlIIlIIl() {
            IIIllIl = new String[llIllIl[3]];
            FastReader.IIIllIl[FastReader.llIllIl[2]] = FastReader.IlIIIlIIl("", "wFIQF");
        }

        /*
         * Unable to fully structure code
         */
        private static String IlIIIlIIl(String lllllIIlllllIIl, String IllllIIlllllIIl) {
            lllllIIlllllIIl = new String(Base64.getDecoder().decode(lllllIIlllllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            lIlllIIlllllIIl = new StringBuilder();
            IIlllIIlllllIIl = IllllIIlllllIIl.toCharArray();
            llIllIIlllllIIl = FastReader.llIllIl[2];
            lIIIlIIlllllIIl = lllllIIlllllIIl.toCharArray();
            IlIIlIIlllllIIl = lIIIlIIlllllIIl.length;
            llIIlIIlllllIIl = FastReader.llIllIl[2];
            "".length();
            if ("   ".length() >= 0) ** GOTO lbl19
            return null;
lbl-1000:
            // 1 sources

            {
                IlIllIIlllllIIl = lIIIlIIlllllIIl[llIIlIIlllllIIl];
                lIlllIIlllllIIl.append((char)(IlIllIIlllllIIl ^ IIlllIIlllllIIl[llIllIIlllllIIl % IIlllIIlllllIIl.length]));
                "".length();
                ++llIllIIlllllIIl;
                ++llIIlIIlllllIIl;
lbl19:
                // 2 sources

                ** while (!FastReader.IIIlIlIIl((int)llIIlIIlllllIIl, (int)IlIIlIIlllllIIl))
            }
lbl20:
            // 1 sources

            return String.valueOf(lIlllIIlllllIIl);
        }

        private static void IllIIlIIl() {
            llIllIl = new int[14];
            FastReader.llIllIl[0] = " ".length() << ((0x1A ^ 0x1F) << " ".length());
            FastReader.llIllIl[1] = -" ".length();
            FastReader.llIllIl[2] = (0xBF ^ 0xA6) << " ".length() & ~((7 ^ 0x1E) << " ".length());
            FastReader.llIllIl[3] = " ".length();
            FastReader.llIllIl[4] = " ".length() << " ".length() ^ (0x2D ^ 2);
            FastReader.llIllIl[5] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastReader.llIllIl[6] = 98 + 118 - 144 + 63 ^ (0x48 ^ 0x17) << " ".length();
            FastReader.llIllIl[7] = (51 + 104 - 85 + 95 ^ (0xBB ^ 0xBE) << (0xA6 ^ 0xA3)) << " ".length();
            FastReader.llIllIl[8] = ("   ".length() << (" ".length() << " ".length()) ^ (0xA9 ^ 0xB2)) << " ".length();
            FastReader.llIllIl[9] = 0xD3 ^ 0xB6;
            FastReader.llIllIl[10] = (0x18 ^ 0x15) << "   ".length() ^ (0x22 ^ 0xF);
            FastReader.llIllIl[11] = " ".length() << (0x91 ^ 0x94);
            FastReader.llIllIl[12] = " ".length() ^ "   ".length() << (" ".length() << " ".length());
            FastReader.llIllIl[13] = 139 + 6 - 95 + 127 ^ (0x3F ^ 0x28) << "   ".length();
        }

        private static boolean lllIIlIIl(int n, int n2) {
            return n == n2;
        }

        private static boolean IIIlIlIIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean IlIIllIIl(int n, int n2) {
            return n > n2;
        }

        private static boolean lIlIllIIl(Object object) {
            return object != null;
        }

        private static boolean lIIIllIIl(int n) {
            return n != 0;
        }

        private static boolean llIIllIIl(int n) {
            return n == 0;
        }

        private static boolean lIllIlIIl(int n) {
            return n <= 0;
        }

        private static boolean IIlIllIIl(int n, int n2) {
            return n != n2;
        }

        public static interface SpaceCharFilter {
            public boolean isSpaceChar(int var1);
        }
    }
}

