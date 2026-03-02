/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;

public class Main {
    private static int[] IIIIIIIIl;

    public Main() {
        Main lIIIllIlIIllll;
    }

    public static void main(String[] stringArray) throws Exception {
        InputReader IlIlIlIlIIllll = new InputReader(System.in);
        PrintWriter lIIlIlIlIIllll = new PrintWriter(System.out);
        int IIIlIlIlIIllll = IlIlIlIlIIllll.nextInt();
        int lllIIlIlIIllll = IlIlIlIlIIllll.nextInt();
        int IllIIlIlIIllll = (int)Math.pow(100.0, IIIlIlIlIIllll);
        int lIlIIlIlIIllll = IIIIIIIIl[0];
        while (Main.IllIIllIll(lllIIlIlIIllll--)) {
            if (!Main.lllIIllIll(Main.howMany(lIlIIlIlIIllll += IllIIlIlIIllll), IIIlIlIlIIllll)) continue;
            lIlIIlIlIIllll += IllIIlIlIIllll;
            "".length();
            if (" ".length() << " ".length() != (" ".length() << (0xAF ^ 0xAA) & ~(" ".length() << (0xA2 ^ 0xA7)))) continue;
            return;
        }
        lIIlIlIlIIllll.println(lIlIIlIlIIllll);
        lIIlIlIlIIllll.close();
    }

    /*
     * WARNING - void declaration
     */
    static int howMany(int IlIIIlIlIIllll) {
        void var1_1;
        int lIIIIlIlIIllll = IIIIIIIIl[0];
        while (Main.IIIlIllIll(IlIIIlIlIIllll % IIIIIIIIl[1])) {
            IlIIIlIlIIllll /= IIIIIIIIl[1];
            ++lIIIIlIlIIllll;
            "".length();
            if (null == null) continue;
            return ("   ".length() << (0x18 ^ 0x1D) ^ (0x50 ^ 0x37)) << "   ".length() & (((0xFC ^ 0xA7) << " ".length() ^ 98 + 53 - 113 + 139) << "   ".length() ^ -" ".length());
        }
        return (int)var1_1;
    }

    static {
        Main.lIlIIllIll();
    }

    private static void lIlIIllIll() {
        IIIIIIIIl = new int[2];
        Main.IIIIIIIIl[0] = " ".length() << " ".length() & (" ".length() << " ".length() ^ -" ".length());
        Main.IIIIIIIIl[1] = (0xA6 ^ 0xBF) << (" ".length() << " ".length());
    }

    private static boolean lllIIllIll(int n, int n2) {
        return n > n2;
    }

    private static boolean IIIlIllIll(int n) {
        return n == 0;
    }

    private static boolean IllIIllIll(int n) {
        return n > 0;
    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[IlIIIIIIl[0]];
        private int curChar;
        private int numChars;
        private static int[] IlIIIIIIl;

        public InputReader(InputStream lIlIlIIlIIllll) {
            InputReader IllIlIIlIIllll;
            IllIlIIlIIllll.stream = lIlIlIIlIIllll;
        }

        public int read() {
            block5: {
                InputReader IlIIlIIlIIllll;
                if (InputReader.IlIlIllIll(IlIIlIIlIIllll.numChars, IlIIIIIIl[1])) {
                    throw new UnknownError();
                }
                if (!InputReader.llIlIllIll(IlIIlIIlIIllll.curChar, IlIIlIIlIIllll.numChars)) break block5;
                IlIIlIIlIIllll.curChar = IlIIIIIIl[2];
                try {
                    IlIIlIIlIIllll.numChars = IlIIlIIlIIllll.stream.read(IlIIlIIlIIllll.buf);
                    "".length();
                }
                catch (IOException lIIIlIIlIIllll) {
                    throw new UnknownError();
                }
                if (((0x6F ^ 0x68) << "   ".length() ^ (0x9F ^ 0xA2)) == 0) {
                    return ((0x56 ^ 0x5D) << (" ".length() << (" ".length() << " ".length())) ^ 170 + 116 - 225 + 124) << " ".length() & (((0x9B ^ 0xC2) << " ".length() ^ 130 + 26 - 148 + 179) << " ".length() ^ -" ".length());
                }
                if (InputReader.IIllIllIll(IlIIlIIlIIllll.numChars)) {
                    return IlIIIIIIl[1];
                }
            }
            int n = this.curChar;
            this.curChar = n + IlIIIIIIl[3];
            return this.buf[n];
        }

        public int peek() {
            block5: {
                InputReader IlllIIIlIIllll;
                if (InputReader.IlIlIllIll(IlllIIIlIIllll.numChars, IlIIIIIIl[1])) {
                    return IlIIIIIIl[1];
                }
                if (!InputReader.llIlIllIll(IlllIIIlIIllll.curChar, IlllIIIlIIllll.numChars)) break block5;
                IlllIIIlIIllll.curChar = IlIIIIIIl[2];
                try {
                    IlllIIIlIIllll.numChars = IlllIIIlIIllll.stream.read(IlllIIIlIIllll.buf);
                    "".length();
                }
                catch (IOException lIllIIIlIIllll) {
                    return IlIIIIIIl[1];
                }
                if (" ".length() << " ".length() == 0) {
                    return (0x45 ^ 0x54 ^ (0xA8 ^ 0xA3) << " ".length()) << (" ".length() << " ".length()) & (((0x69 ^ 0x78) << "   ".length() ^ 72 + 130 - 199 + 140) << (" ".length() << " ".length()) ^ -" ".length());
                }
                if (InputReader.IIllIllIll(IlllIIIlIIllll.numChars)) {
                    return IlIIIIIIl[1];
                }
            }
            return this.buf[this.curChar];
        }

        public void skip(int lIIlIIIlIIllll) {
            while (InputReader.lIllIllIll(lIIlIIIlIIllll--)) {
                InputReader IlIlIIIlIIllll;
                IlIlIIIlIIllll.read();
                "".length();
                "".length();
                if (((0x59 ^ 0x4C) & ~(0x5A ^ 0x4F)) <= 0) continue;
                return;
            }
        }

        public int nextInt() {
            InputReader lllIIIIlIIllll;
            return Integer.parseInt(lllIIIIlIIllll.next());
        }

        public long nextLong() {
            InputReader lIlIIIIlIIllll;
            return Long.parseLong(lIlIIIIlIIllll.next());
        }

        public String nextString() {
            InputReader llIIIIIlIIllll;
            return llIIIIIlIIllll.next();
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var2_2;
            InputReader lllllllIIIllll;
            int IllllllIIIllll = lllllllIIIllll.read();
            while (InputReader.IlllIllIll(lllllllIIIllll.isSpaceChar(IllllllIIIllll) ? 1 : 0)) {
                IllllllIIIllll = lllllllIIIllll.read();
                "".length();
                if (" ".length() << " ".length() >= " ".length() << " ".length()) continue;
                return null;
            }
            StringBuffer lIlllllIIIllll = new StringBuffer();
            do {
                lIlllllIIIllll.appendCodePoint(IllllllIIIllll);
                "".length();
            } while (!InputReader.IlllIllIll(lllllllIIIllll.isSpaceChar(IllllllIIIllll = lllllllIIIllll.read()) ? 1 : 0));
            return var2_2.toString();
        }

        /*
         * WARNING - void declaration
         */
        public String nextLine() {
            void var1_1;
            InputReader lIIllllIIIllll;
            StringBuffer IIIllllIIIllll = new StringBuffer();
            int lllIlllIIIllll = lIIllllIIIllll.read();
            while (InputReader.llllIllIll(lllIlllIIIllll, IlIIIIIIl[4]) && InputReader.llllIllIll(lllIlllIIIllll, IlIIIIIIl[1])) {
                if (InputReader.llllIllIll(lllIlllIIIllll, IlIIIIIIl[5])) {
                    IIIllllIIIllll.appendCodePoint(lllIlllIIIllll);
                    "".length();
                }
                lllIlllIIIllll = lIIllllIIIllll.read();
                "".length();
                if (((0x66 ^ 7) & ~(0xE3 ^ 0x82)) == 0) continue;
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
            InputReader lIIIlllIIIllll;
            int IIIIlllIIIllll = lIIIlllIIIllll.read();
            while (InputReader.IlllIllIll(lIIIlllIIIllll.isSpaceChar(IIIIlllIIIllll) ? 1 : 0)) {
                IIIIlllIIIllll = lIIIlllIIIllll.read();
                "".length();
                if (" ".length() <= " ".length() << (" ".length() << " ".length())) continue;
                return 0.0;
            }
            int llllIllIIIllll = IlIIIIIIl[3];
            if (InputReader.IlIlIllIll(IIIIlllIIIllll, IlIIIIIIl[6])) {
                llllIllIIIllll = IlIIIIIIl[1];
                IIIIlllIIIllll = lIIIlllIIIllll.read();
            }
            double IlllIllIIIllll = 0.0;
            while (InputReader.IIIIlllIll(lIIIlllIIIllll.isSpaceChar(IIIIlllIIIllll) ? 1 : 0) && InputReader.llllIllIll(IIIIlllIIIllll, IlIIIIIIl[7])) {
                if (!InputReader.llllIllIll(IIIIlllIIIllll, IlIIIIIIl[8]) || InputReader.IlIlIllIll(IIIIlllIIIllll, IlIIIIIIl[9])) {
                    return IlllIllIIIllll * Math.pow(10.0, lIIIlllIIIllll.nextInt());
                }
                if (!InputReader.llIlIllIll(IIIIlllIIIllll, IlIIIIIIl[10]) || InputReader.lIIIlllIll(IIIIlllIIIllll, IlIIIIIIl[11])) {
                    throw new InputMismatchException();
                }
                IlllIllIIIllll *= 10.0;
                IlllIllIIIllll += (double)(IIIIlllIIIllll - IlIIIIIIl[10]);
                IIIIlllIIIllll = lIIIlllIIIllll.read();
                "".length();
                if (((" ".length() << "   ".length() ^ (2 ^ 0x1B)) << " ".length() & (((0x35 ^ 0x3A) << " ".length() ^ (0x14 ^ 0x1B)) << " ".length() ^ -" ".length())) == 0) continue;
                return 0.0;
            }
            if (InputReader.IlIlIllIll(IIIIlllIIIllll, IlIIIIIIl[7])) {
                IIIIlllIIIllll = lIIIlllIIIllll.read();
                double lIllIllIIIllll = 1.0;
                while (InputReader.IIIIlllIll(lIIIlllIIIllll.isSpaceChar(IIIIlllIIIllll) ? 1 : 0)) {
                    if (!InputReader.llllIllIll(IIIIlllIIIllll, IlIIIIIIl[8]) || InputReader.IlIlIllIll(IIIIlllIIIllll, IlIIIIIIl[9])) {
                        return IlllIllIIIllll * Math.pow(10.0, lIIIlllIIIllll.nextInt());
                    }
                    if (!InputReader.llIlIllIll(IIIIlllIIIllll, IlIIIIIIl[10]) || InputReader.lIIIlllIll(IIIIlllIIIllll, IlIIIIIIl[11])) {
                        throw new InputMismatchException();
                    }
                    IlllIllIIIllll += (double)(IIIIlllIIIllll - IlIIIIIIl[10]) * (lIllIllIIIllll /= 10.0);
                    IIIIlllIIIllll = lIIIlllIIIllll.read();
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
        public int[] nextIntArray(int lllIIllIIIllll) {
            void var2_2;
            int[] IllIIllIIIllll = new int[lllIIllIIIllll];
            int lIlIIllIIIllll = IlIIIIIIl[2];
            while (InputReader.IlIIlllIll(lIlIIllIIIllll, lllIIllIIIllll)) {
                InputReader IIIlIllIIIllll;
                IllIIllIIIllll[lIlIIllIIIllll] = IIIlIllIIIllll.nextInt();
                ++lIlIIllIIIllll;
                "".length();
                if (-" ".length() <= "   ".length()) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray(int lllllIlIIIllll) {
            void var2_2;
            long[] IllllIlIIIllll = new long[lllllIlIIIllll];
            int lIlllIlIIIllll = IlIIIIIIl[2];
            while (InputReader.IlIIlllIll(lIlllIlIIIllll, lllllIlIIIllll)) {
                InputReader IIIIIllIIIllll;
                IllllIlIIIllll[lIlllIlIIIllll] = IIIIIllIIIllll.nextLong();
                ++lIlllIlIIIllll;
                "".length();
                if (null == null) continue;
                return null;
            }
            return var2_2;
        }

        public boolean hasNext() {
            boolean bl;
            int lIIllIlIIIllll;
            InputReader IlIllIlIIIllll;
            while (InputReader.IlllIllIll(IlIllIlIIIllll.isSpaceChar(lIIllIlIIIllll = IlIllIlIIIllll.peek()) ? 1 : 0) && InputReader.llllIllIll(lIIllIlIIIllll, IlIIIIIIl[1])) {
                IlIllIlIIIllll.read();
                "".length();
                "".length();
                if ("   ".length() > 0) continue;
                return ((0x1D ^ 0x5A) & ~(0x60 ^ 0x27)) != 0;
            }
            if (InputReader.llllIllIll(lIIllIlIIIllll, IlIIIIIIl[1])) {
                bl = IlIIIIIIl[3];
                "".length();
                if (" ".length() << (" ".length() << " ".length()) <= ((0xEE ^ 0x8D ^ (0x82 ^ 0x93) << " ".length()) & ((0x1E ^ 0x7D) << " ".length() ^ 65 + 50 - -19 + 1 ^ -" ".length()))) {
                    return ((0x96 ^ 0xBB ^ " ".length() << (0x28 ^ 0x2D)) & ((0x83 ^ 0xAE) << " ".length() ^ (0x4D ^ 0x1A) ^ -" ".length())) != 0;
                }
            } else {
                bl = IlIIIIIIl[2];
            }
            return bl;
        }

        private boolean isSpaceChar(int lllIlIlIIIllll) {
            int n;
            if (!(InputReader.llllIllIll(lllIlIlIIIllll, IlIIIIIIl[12]) && InputReader.llllIllIll(lllIlIlIIIllll, IlIIIIIIl[4]) && InputReader.llllIllIll(lllIlIlIIIllll, IlIIIIIIl[5]) && InputReader.llllIllIll(lllIlIlIIIllll, IlIIIIIIl[13]) && !InputReader.IlIlIllIll(lllIlIlIIIllll, IlIIIIIIl[1]))) {
                n = IlIIIIIIl[3];
                "".length();
                if (" ".length() << (" ".length() << " ".length()) < 0) {
                    return ((0xB7 ^ 0x90) << " ".length() & ~((0x9E ^ 0xB9) << " ".length())) != 0;
                }
            } else {
                n = IlIIIIIIl[2];
            }
            return n != 0;
        }

        static {
            InputReader.lIIlIllIll();
        }

        private static void lIIlIllIll() {
            IlIIIIIIl = new int[14];
            InputReader.IlIIIIIIl[0] = " ".length() << ((0xBF ^ 0xBA) << " ".length());
            InputReader.IlIIIIIIl[1] = -" ".length();
            InputReader.IlIIIIIIl[2] = (0x12 ^ 0x23) << " ".length() & ~((0x82 ^ 0xB3) << " ".length());
            InputReader.IlIIIIIIl[3] = " ".length();
            InputReader.IlIIIIIIl[4] = (0xBC ^ 0xB9) << " ".length();
            InputReader.IlIIIIIIl[5] = 0x1B ^ 0x48 ^ (0xBA ^ 0x95) << " ".length();
            InputReader.IlIIIIIIl[6] = 0x89 ^ 0xA4;
            InputReader.IlIIIIIIl[7] = (0xBC ^ 0xAB) << " ".length();
            InputReader.IlIIIIIIl[8] = 0xE4 ^ 0x9F ^ (0xD ^ 2) << " ".length();
            InputReader.IlIIIIIIl[9] = 0x71 ^ 0x34;
            InputReader.IlIIIIIIl[10] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            InputReader.IlIIIIIIl[11] = 0x69 ^ 0x5A ^ (0xB0 ^ 0xB5) << " ".length();
            InputReader.IlIIIIIIl[12] = " ".length() << (0x16 ^ 0x13);
            InputReader.IlIIIIIIl[13] = (0x50 ^ 0x5F) << (" ".length() << " ".length()) ^ (0x22 ^ 0x17);
        }

        private static boolean IlIlIllIll(int n, int n2) {
            return n == n2;
        }

        private static boolean llIlIllIll(int n, int n2) {
            return n >= n2;
        }

        private static boolean IlIIlllIll(int n, int n2) {
            return n < n2;
        }

        private static boolean lIIIlllIll(int n, int n2) {
            return n > n2;
        }

        private static boolean IlllIllIll(int n) {
            return n != 0;
        }

        private static boolean IIIIlllIll(int n) {
            return n == 0;
        }

        private static boolean IIllIllIll(int n) {
            return n <= 0;
        }

        private static boolean lIllIllIll(int n) {
            return n > 0;
        }

        private static boolean llllIllIll(int n, int n2) {
            return n != n2;
        }
    }
}

