/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    private static int[] IIIlIlIIl;

    public Main() {
        Main lllIlllIIIIlll;
    }

    public static void main(String[] stringArray) throws Exception {
        InputReader IlIIlllIIIIlll = new InputReader(System.in);
        PrintWriter lIIIlllIIIIlll = new PrintWriter(System.out);
        int IIIIlllIIIIlll = IlIIlllIIIIlll.nextInt();
        int[] llllIllIIIIlll = IlIIlllIIIIlll.nextIntArray(IIIIlllIIIIlll);
        Arrays.sort(llllIllIIIIlll);
        lIIIlllIIIIlll.println(llllIllIIIIlll[IIIIlllIIIIlll - IIIlIlIIl[0]] - llllIllIIIIlll[IIIlIlIIl[1]]);
        lIIIlllIIIIlll.close();
    }

    static {
        Main.IlIlIlllll();
    }

    private static void IlIlIlllll() {
        IIIlIlIIl = new int[2];
        Main.IIIlIlIIl[0] = " ".length();
        Main.IIIlIlIIl[1] = (87 + 36 - 54 + 122 ^ (0x8C ^ 0xA1) << (" ".length() << " ".length())) << (" ".length() << " ".length()) & ((18 + 65 - 10 + 108 ^ (0xF3 ^ 0xAC) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length());
    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[IlIlIlIIl[0]];
        private int curChar;
        private int numChars;
        private static int[] IlIlIlIIl;

        public InputReader(InputStream llIlIllIIIIlll) {
            InputReader IIllIllIIIIlll;
            IIllIllIIIIlll.stream = llIlIllIIIIlll;
        }

        public int read() {
            block5: {
                InputReader IIIlIllIIIIlll;
                if (InputReader.IIllIlllll(IIIlIllIIIIlll.numChars, IlIlIlIIl[1])) {
                    throw new UnknownError();
                }
                if (!InputReader.lIllIlllll(IIIlIllIIIIlll.curChar, IIIlIllIIIIlll.numChars)) break block5;
                IIIlIllIIIIlll.curChar = IlIlIlIIl[2];
                try {
                    IIIlIllIIIIlll.numChars = IIIlIllIIIIlll.stream.read(IIIlIllIIIIlll.buf);
                    "".length();
                }
                catch (IOException lllIIllIIIIlll) {
                    throw new UnknownError();
                }
                if (-"  ".length() >= 0) {
                    return (0xDD ^ 0xA0 ^ (0x45 ^ 0x52) << " ".length()) & ((8 ^ 0x35) << (" ".length() << " ".length()) ^ 75 + 29 - -19 + 44 ^ -" ".length());
                }
                if (InputReader.IlllIlllll(IIIlIllIIIIlll.numChars)) {
                    return IlIlIlIIl[1];
                }
            }
            int n = this.curChar;
            this.curChar = n + IlIlIlIIl[3];
            return this.buf[n];
        }

        public int peek() {
            block5: {
                InputReader IIlIIllIIIIlll;
                if (InputReader.IIllIlllll(IIlIIllIIIIlll.numChars, IlIlIlIIl[1])) {
                    return IlIlIlIIl[1];
                }
                if (!InputReader.lIllIlllll(IIlIIllIIIIlll.curChar, IIlIIllIIIIlll.numChars)) break block5;
                IIlIIllIIIIlll.curChar = IlIlIlIIl[2];
                try {
                    IIlIIllIIIIlll.numChars = IIlIIllIIIIlll.stream.read(IIlIIllIIIIlll.buf);
                    "".length();
                }
                catch (IOException llIIIllIIIIlll) {
                    return IlIlIlIIl[1];
                }
                if (" ".length() << (" ".length() << " ".length()) != " ".length() << (" ".length() << " ".length())) {
                    return ((0x86 ^ 0x95) << " ".length() ^ "   ".length()) & ((0xBB ^ 0xB2) << "   ".length() ^ (2 ^ 0x6F) ^ -" ".length());
                }
                if (InputReader.IlllIlllll(IIlIIllIIIIlll.numChars)) {
                    return IlIlIlIIl[1];
                }
            }
            return this.buf[this.curChar];
        }

        public void skip(int lllllIlIIIIlll) {
            while (InputReader.llllIlllll(lllllIlIIIIlll--)) {
                InputReader IIIIIllIIIIlll;
                IIIIIllIIIIlll.read();
                "".length();
                "".length();
                if (null == null) continue;
                return;
            }
        }

        public int nextInt() {
            InputReader lIlllIlIIIIlll;
            return Integer.parseInt(lIlllIlIIIIlll.next());
        }

        public long nextLong() {
            InputReader llIllIlIIIIlll;
            return Long.parseLong(llIllIlIIIIlll.next());
        }

        public String nextString() {
            InputReader lIIllIlIIIIlll;
            return lIIllIlIIIIlll.next();
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var2_2;
            InputReader lIlIlIlIIIIlll;
            int IIlIlIlIIIIlll = lIlIlIlIIIIlll.read();
            while (InputReader.IIIIllllll(lIlIlIlIIIIlll.isSpaceChar(IIlIlIlIIIIlll) ? 1 : 0)) {
                IIlIlIlIIIIlll = lIlIlIlIIIIlll.read();
                "".length();
                if ((((0x53 ^ 0x12) << " ".length() ^ 35 + 90 - 32 + 56) & ((0xAD ^ 0xB4) << (" ".length() << " ".length()) ^ (0x26 ^ 0x55) ^ -" ".length())) < " ".length() << (" ".length() << " ".length())) continue;
                return null;
            }
            StringBuffer llIIlIlIIIIlll = new StringBuffer();
            do {
                llIIlIlIIIIlll.appendCodePoint(IIlIlIlIIIIlll);
                "".length();
            } while (!InputReader.IIIIllllll(lIlIlIlIIIIlll.isSpaceChar(IIlIlIlIIIIlll = lIlIlIlIIIIlll.read()) ? 1 : 0));
            return var2_2.toString();
        }

        /*
         * WARNING - void declaration
         */
        public String nextLine() {
            void var1_1;
            InputReader llllIIlIIIIlll;
            StringBuffer IlllIIlIIIIlll = new StringBuffer();
            int lIllIIlIIIIlll = llllIIlIIIIlll.read();
            while (InputReader.lIIIllllll(lIllIIlIIIIlll, IlIlIlIIl[4]) && InputReader.lIIIllllll(lIllIIlIIIIlll, IlIlIlIIl[1])) {
                if (InputReader.lIIIllllll(lIllIIlIIIIlll, IlIlIlIIl[5])) {
                    IlllIIlIIIIlll.appendCodePoint(lIllIIlIIIIlll);
                    "".length();
                }
                lIllIIlIIIIlll = llllIIlIIIIlll.read();
                "".length();
                if ((((4 ^ 0x4D) << " ".length() ^ 37 + 136 - 159 + 145) << " ".length() & (((0x16 ^ 0x2F) << " ".length() ^ 55 + 36 - 45 + 81) << " ".length() ^ -" ".length())) <= "   ".length()) continue;
                return null;
            }
            return var1_1.toString();
        }

        /*
         * WARNING - void declaration
         */
        public double nextDouble() {
            void var2_2;
            void var3_3;
            InputReader lllIIIlIIIIlll;
            int IllIIIlIIIIlll = lllIIIlIIIIlll.read();
            while (InputReader.IIIIllllll(lllIIIlIIIIlll.isSpaceChar(IllIIIlIIIIlll) ? 1 : 0)) {
                IllIIIlIIIIlll = lllIIIlIIIIlll.read();
                "".length();
                if (((0x57 ^ 0x44 ^ (0x43 ^ 0x5A) << " ".length()) & (140 + 60 - 155 + 180 ^ "   ".length() << ("   ".length() << " ".length()) ^ -" ".length())) == 0) continue;
                return 0.0;
            }
            int lIlIIIlIIIIlll = IlIlIlIIl[3];
            if (InputReader.IIllIlllll(IllIIIlIIIIlll, IlIlIlIIl[6])) {
                lIlIIIlIIIIlll = IlIlIlIIl[1];
                IllIIIlIIIIlll = lllIIIlIIIIlll.read();
            }
            double IIlIIIlIIIIlll = 0.0;
            while (InputReader.IlIIllllll(lllIIIlIIIIlll.isSpaceChar(IllIIIlIIIIlll) ? 1 : 0) && InputReader.lIIIllllll(IllIIIlIIIIlll, IlIlIlIIl[7])) {
                if (!InputReader.lIIIllllll(IllIIIlIIIIlll, IlIlIlIIl[8]) || InputReader.IIllIlllll(IllIIIlIIIIlll, IlIlIlIIl[9])) {
                    return IIlIIIlIIIIlll * Math.pow(10.0, lllIIIlIIIIlll.nextInt());
                }
                if (!InputReader.lIllIlllll(IllIIIlIIIIlll, IlIlIlIIl[10]) || InputReader.llIIllllll(IllIIIlIIIIlll, IlIlIlIIl[11])) {
                    throw new InputMismatchException();
                }
                IIlIIIlIIIIlll *= 10.0;
                IIlIIIlIIIIlll += (double)(IllIIIlIIIIlll - IlIlIlIIl[10]);
                IllIIIlIIIIlll = lllIIIlIIIIlll.read();
                "".length();
                if (" ".length() < " ".length() << (" ".length() << " ".length())) continue;
                return 0.0;
            }
            if (InputReader.IIllIlllll(IllIIIlIIIIlll, IlIlIlIIl[7])) {
                IllIIIlIIIIlll = lllIIIlIIIIlll.read();
                double llIIIIlIIIIlll = 1.0;
                while (InputReader.IlIIllllll(lllIIIlIIIIlll.isSpaceChar(IllIIIlIIIIlll) ? 1 : 0)) {
                    if (!InputReader.lIIIllllll(IllIIIlIIIIlll, IlIlIlIIl[8]) || InputReader.IIllIlllll(IllIIIlIIIIlll, IlIlIlIIl[9])) {
                        return IIlIIIlIIIIlll * Math.pow(10.0, lllIIIlIIIIlll.nextInt());
                    }
                    if (!InputReader.lIllIlllll(IllIIIlIIIIlll, IlIlIlIIl[10]) || InputReader.llIIllllll(IllIIIlIIIIlll, IlIlIlIIl[11])) {
                        throw new InputMismatchException();
                    }
                    IIlIIIlIIIIlll += (double)(IllIIIlIIIIlll - IlIlIlIIl[10]) * (llIIIIlIIIIlll /= 10.0);
                    IllIIIlIIIIlll = lllIIIlIIIIlll.read();
                    "".length();
                    if (null == null) continue;
                    return 0.0;
                }
            }
            return (double)(var3_3 * (double)var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray(int lIllllIIIIIlll) {
            void var2_2;
            int[] IIllllIIIIIlll = new int[lIllllIIIIIlll];
            int llIlllIIIIIlll = IlIlIlIIl[2];
            while (InputReader.IIlIllllll(llIlllIIIIIlll, lIllllIIIIIlll)) {
                InputReader IlllllIIIIIlll;
                IIllllIIIIIlll[llIlllIIIIIlll] = IlllllIIIIIlll.nextInt();
                ++llIlllIIIIIlll;
                "".length();
                if (" ".length() << " ".length() >= 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray(int lIlIllIIIIIlll) {
            void var2_2;
            long[] IIlIllIIIIIlll = new long[lIlIllIIIIIlll];
            int llIIllIIIIIlll = IlIlIlIIl[2];
            while (InputReader.IIlIllllll(llIIllIIIIIlll, lIlIllIIIIIlll)) {
                InputReader IllIllIIIIIlll;
                IIlIllIIIIIlll[llIIllIIIIIlll] = IllIllIIIIIlll.nextLong();
                ++llIIllIIIIIlll;
                "".length();
                if (null == null) continue;
                return null;
            }
            return var2_2;
        }

        public boolean hasNext() {
            boolean bl;
            int llllIlIIIIIlll;
            InputReader IIIIllIIIIIlll;
            while (InputReader.IIIIllllll(IIIIllIIIIIlll.isSpaceChar(llllIlIIIIIlll = IIIIllIIIIIlll.peek()) ? 1 : 0) && InputReader.lIIIllllll(llllIlIIIIIlll, IlIlIlIIl[1])) {
                IIIIllIIIIIlll.read();
                "".length();
                "".length();
                if (" ".length() < " ".length() << (" ".length() << " ".length())) continue;
                return ((0xD7 ^ 0xC0 ^ " ".length() << ("   ".length() << " ".length()) & ~(" ".length() << ("   ".length() << " ".length()))) & (80 + 47 - 7 + 29 ^ (0xCC ^ 0x8D) << " ".length() ^ -" ".length())) != 0;
            }
            if (InputReader.lIIIllllll(llllIlIIIIIlll, IlIlIlIIl[1])) {
                bl = IlIlIlIIl[3];
                "".length();
                if (((0xB0 ^ 0x93) & ~(0xA5 ^ 0x86)) != ((0xF ^ 0x36) & ~(3 ^ 0x3A))) {
                    return ((0x1C ^ 0x51) & ~(0x55 ^ 0x18)) != 0;
                }
            } else {
                bl = IlIlIlIIl[2];
            }
            return bl;
        }

        private boolean isSpaceChar(int lIllIlIIIIIlll) {
            int n;
            if (!(InputReader.lIIIllllll(lIllIlIIIIIlll, IlIlIlIIl[12]) && InputReader.lIIIllllll(lIllIlIIIIIlll, IlIlIlIIl[4]) && InputReader.lIIIllllll(lIllIlIIIIIlll, IlIlIlIIl[5]) && InputReader.lIIIllllll(lIllIlIIIIIlll, IlIlIlIIl[13]) && !InputReader.IIllIlllll(lIllIlIIIIIlll, IlIlIlIIl[1]))) {
                n = IlIlIlIIl[3];
                "".length();
                if (" ".length() << " ".length() < 0) {
                    return ((0x49 ^ 0x40) << "   ".length() & ~((0x3F ^ 0x36) << "   ".length())) != 0;
                }
            } else {
                n = IlIlIlIIl[2];
            }
            return n != 0;
        }

        static {
            InputReader.llIlIlllll();
        }

        private static void llIlIlllll() {
            IlIlIlIIl = new int[14];
            InputReader.IlIlIlIIl[0] = " ".length() << (((0xCE ^ 0x95) << " ".length() ^ 47 + 4 - -8 + 120) << " ".length());
            InputReader.IlIlIlIIl[1] = -" ".length();
            InputReader.IlIlIlIIl[2] = ("   ".length() << (0x22 ^ 0x27) ^ (0x1D ^ 0x24)) & (54 + 180 - 20 + 41 ^ (0x17 ^ 0x44) << " ".length() ^ -" ".length());
            InputReader.IlIlIlIIl[3] = " ".length();
            InputReader.IlIlIlIIl[4] = (0x56 ^ 0x53) << " ".length();
            InputReader.IlIlIlIIl[5] = 0x15 ^ 0x5A ^ (0x2F ^ 0xE) << " ".length();
            InputReader.IlIlIlIIl[6] = 0x81 ^ 0xAC;
            InputReader.IlIlIlIIl[7] = (0xA3 ^ 0xB4) << " ".length();
            InputReader.IlIlIlIIl[8] = 4 ^ 0x61;
            InputReader.IlIlIlIIl[9] = 0xEF ^ 0xAA;
            InputReader.IlIlIlIIl[10] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            InputReader.IlIlIlIIl[11] = 81 + 14 - -40 + 52 ^ (0x82 ^ 0xC3) << " ".length();
            InputReader.IlIlIlIIl[12] = " ".length() << (0xB7 ^ 0xB2);
            InputReader.IlIlIlIIl[13] = 0xA5 ^ 0xAC;
        }

        private static boolean IIllIlllll(int n, int n2) {
            return n == n2;
        }

        private static boolean lIllIlllll(int n, int n2) {
            return n >= n2;
        }

        private static boolean IIlIllllll(int n, int n2) {
            return n < n2;
        }

        private static boolean llIIllllll(int n, int n2) {
            return n > n2;
        }

        private static boolean IIIIllllll(int n) {
            return n != 0;
        }

        private static boolean IlIIllllll(int n) {
            return n == 0;
        }

        private static boolean IlllIlllll(int n) {
            return n <= 0;
        }

        private static boolean llllIlllll(int n) {
            return n > 0;
        }

        private static boolean lIIIllllll(int n, int n2) {
            return n != n2;
        }
    }
}

