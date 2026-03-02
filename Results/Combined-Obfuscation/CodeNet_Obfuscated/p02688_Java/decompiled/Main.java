/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;

public class Main {
    private static int[] llllIlIIl;

    public Main() {
        Main IIllIllllllIll;
    }

    public static void main(String[] stringArray) {
        int IIIlIIlllllIll;
        int lIIlIIlllllIll;
        InputStream lIIIlIlllllIll = System.in;
        PrintStream IIIIlIlllllIll = System.out;
        InputReader llllIIlllllIll = new InputReader(lIIIlIlllllIll);
        PrintWriter llllIIlllllIll2 = new PrintWriter(IIIIlIlllllIll);
        StringBuilder IlllIIlllllIll = new StringBuilder();
        int lIllIIlllllIll = llllIIlllllIll.Int();
        int llIlIIlllllIll = llllIIlllllIll.Int();
        int[] IlIlIIlllllIll = new int[lIllIIlllllIll + llllIlIIl[0]];
        while (Main.llllllllll(llIlIIlllllIll--)) {
            lIIlIIlllllIll = llllIIlllllIll.Int();
            while (Main.llllllllll(lIIlIIlllllIll--)) {
                int n = IIIlIIlllllIll = llllIIlllllIll.Int();
                IlIlIIlllllIll[n] = IlIlIIlllllIll[n] + llllIlIIl[0];
                "".length();
                if (" ".length() << " ".length() >= " ".length() << " ".length()) continue;
                return;
            }
            "".length();
            if (-((0x76 ^ 0x65) << "   ".length() ^ (4 ^ 0x23) << (" ".length() << " ".length())) <= 0) continue;
            return;
        }
        lIIlIIlllllIll = llllIlIIl[1];
        IIIlIIlllllIll = llllIlIIl[0];
        while (Main.IIIIIIIIIIl(IIIlIIlllllIll, lIllIIlllllIll)) {
            if (Main.lIIIIIIIIIl(IlIlIIlllllIll[IIIlIIlllllIll])) {
                ++lIIlIIlllllIll;
            }
            ++IIIlIIlllllIll;
            "".length();
            if (" ".length() << (" ".length() << " ".length()) >= 0) continue;
            return;
        }
        llllIIlllllIll2.println(lIIlIIlllllIll);
        llllIIlllllIll2.close();
    }

    static {
        Main.lIllllllll();
    }

    private static void lIllllllll() {
        llllIlIIl = new int[2];
        Main.llllIlIIl[0] = " ".length();
        Main.llllIlIIl[1] = ((0x5A ^ 0x17) << " ".length() ^ 93 + 1 - -18 + 59) << " ".length() & (((0xE7 ^ 0xB8) << " ".length() ^ 140 + 139 - 162 + 26) << " ".length() ^ -" ".length());
    }

    private static boolean IIIIIIIIIIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean lIIIIIIIIIl(int n) {
        return n == 0;
    }

    private static boolean llllllllll(int n) {
        return n > 0;
    }

    private static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[lIllIlIIl[0]];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private static int[] lIllIlIIl;

        public InputReader(InputStream lIllIIIIIIIlll) {
            InputReader IlllIIIIIIIlll;
            IlllIIIIIIIlll.stream = lIllIIIIIIIlll;
        }

        public int read() {
            block5: {
                InputReader IlIlIIIIIIIlll;
                if (InputReader.IllIllllll(IlIlIIIIIIIlll.numChars, lIllIlIIl[1])) {
                    throw new InputMismatchException();
                }
                if (!InputReader.lllIllllll(IlIlIIIIIIIlll.curChar, IlIlIIIIIIIlll.numChars)) break block5;
                IlIlIIIIIIIlll.curChar = lIllIlIIl[2];
                try {
                    IlIlIIIIIIIlll.numChars = IlIlIIIIIIIlll.stream.read(IlIlIIIIIIIlll.buf);
                    "".length();
                }
                catch (IOException lIIlIIIIIIIlll) {
                    throw new InputMismatchException();
                }
                if (" ".length() <= 0) {
                    return " ".length() << "   ".length() & (" ".length() << "   ".length() ^ -" ".length());
                }
                if (InputReader.IIIlllllll(IlIlIIIIIIIlll.numChars)) {
                    return lIllIlIIl[1];
                }
            }
            int n = this.curChar;
            this.curChar = n + lIllIlIIl[3];
            return this.buf[n];
        }

        /*
         * WARNING - void declaration
         */
        public int Int() {
            void var2_2;
            void var3_3;
            InputReader IIlIIIIIIIIlll;
            int llIIIIIIIIIlll = IIlIIIIIIIIlll.read();
            while (InputReader.lIIlllllll(IIlIIIIIIIIlll.isSpaceChar(llIIIIIIIIIlll) ? 1 : 0)) {
                llIIIIIIIIIlll = IIlIIIIIIIIlll.read();
                "".length();
                if (null == null) continue;
                return "   ".length() << (0x34 ^ 0x31) & ~("   ".length() << (0x9C ^ 0x99));
            }
            int IlIIIIIIIIIlll = lIllIlIIl[3];
            if (InputReader.IllIllllll(llIIIIIIIIIlll, lIllIlIIl[4])) {
                IlIIIIIIIIIlll = lIllIlIIl[1];
                llIIIIIIIIIlll = IIlIIIIIIIIlll.read();
            }
            int lIIIIIIIIIIlll = lIllIlIIl[2];
            do {
                if (!InputReader.lllIllllll(llIIIIIIIIIlll, lIllIlIIl[5]) || InputReader.IlIlllllll(llIIIIIIIIIlll, lIllIlIIl[6])) {
                    throw new InputMismatchException();
                }
                lIIIIIIIIIIlll *= lIllIlIIl[7];
                lIIIIIIIIIIlll += llIIIIIIIIIlll - lIllIlIIl[5];
            } while (!InputReader.lIIlllllll(IIlIIIIIIIIlll.isSpaceChar(llIIIIIIIIIlll = IIlIIIIIIIIlll.read()) ? 1 : 0));
            return (int)(var3_3 * var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public String String() {
            void var2_2;
            InputReader lIlllllllllIll;
            int IIlllllllllIll = lIlllllllllIll.read();
            while (InputReader.lIIlllllll(lIlllllllllIll.isSpaceChar(IIlllllllllIll) ? 1 : 0)) {
                IIlllllllllIll = lIlllllllllIll.read();
                "".length();
                if (((118 + 29 - 125 + 125 ^ (0xE6 ^ 0xB9) << " ".length()) << " ".length() & (((0xEA ^ 0xB5) << " ".length() ^ 100 + 69 - 81 + 59) << " ".length() ^ -" ".length())) == 0) continue;
                return null;
            }
            StringBuilder llIllllllllIll = new StringBuilder();
            do {
                llIllllllllIll.appendCodePoint(IIlllllllllIll);
                "".length();
            } while (!InputReader.lIIlllllll(lIlllllllllIll.isSpaceChar(IIlllllllllIll = lIlllllllllIll.read()) ? 1 : 0));
            return String.valueOf(var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public double Double() {
            void var2_2;
            void var3_3;
            InputReader lIlIlllllllIll;
            int IIlIlllllllIll = lIlIlllllllIll.read();
            while (InputReader.lIIlllllll(lIlIlllllllIll.isSpaceChar(IIlIlllllllIll) ? 1 : 0)) {
                IIlIlllllllIll = lIlIlllllllIll.read();
                "".length();
                if (((0x7F ^ 0x46 ^ " ".length() << " ".length()) & (8 + 34 - -84 + 13 ^ (0x50 ^ 0x5B) << (" ".length() << (" ".length() << " ".length())) ^ -" ".length())) == 0) continue;
                return 0.0;
            }
            int llIIlllllllIll = lIllIlIIl[3];
            if (InputReader.IllIllllll(IIlIlllllllIll, lIllIlIIl[4])) {
                llIIlllllllIll = lIllIlIIl[1];
                IIlIlllllllIll = lIlIlllllllIll.read();
            }
            double IlIIlllllllIll = 0.0;
            while (InputReader.llIlllllll(lIlIlllllllIll.isSpaceChar(IIlIlllllllIll) ? 1 : 0) && InputReader.IIllllllll(IIlIlllllllIll, lIllIlIIl[8])) {
                if (!InputReader.IIllllllll(IIlIlllllllIll, lIllIlIIl[9]) || InputReader.IllIllllll(IIlIlllllllIll, lIllIlIIl[10])) {
                    return IlIIlllllllIll * Math.pow(10.0, lIlIlllllllIll.Int());
                }
                if (!InputReader.lllIllllll(IIlIlllllllIll, lIllIlIIl[5]) || InputReader.IlIlllllll(IIlIlllllllIll, lIllIlIIl[6])) {
                    throw new InputMismatchException();
                }
                IlIIlllllllIll *= 10.0;
                IlIIlllllllIll += (double)(IIlIlllllllIll - lIllIlIIl[5]);
                IIlIlllllllIll = lIlIlllllllIll.read();
                "".length();
                if (null == null) continue;
                return 0.0;
            }
            if (InputReader.IllIllllll(IIlIlllllllIll, lIllIlIIl[8])) {
                IIlIlllllllIll = lIlIlllllllIll.read();
                double lIIIlllllllIll = 1.0;
                while (InputReader.llIlllllll(lIlIlllllllIll.isSpaceChar(IIlIlllllllIll) ? 1 : 0)) {
                    if (!InputReader.IIllllllll(IIlIlllllllIll, lIllIlIIl[9]) || InputReader.IllIllllll(IIlIlllllllIll, lIllIlIIl[10])) {
                        return IlIIlllllllIll * Math.pow(10.0, lIlIlllllllIll.Int());
                    }
                    if (!InputReader.lllIllllll(IIlIlllllllIll, lIllIlIIl[5]) || InputReader.IlIlllllll(IIlIlllllllIll, lIllIlIIl[6])) {
                        throw new InputMismatchException();
                    }
                    IlIIlllllllIll += (double)(IIlIlllllllIll - lIllIlIIl[5]) * (lIIIlllllllIll /= 10.0);
                    IIlIlllllllIll = lIlIlllllllIll.read();
                    "".length();
                    if (-" ".length() <= " ".length()) continue;
                    return 0.0;
                }
            }
            return (double)(var3_3 * (double)var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public long Long() {
            void var2_2;
            void var3_3;
            InputReader IIllIllllllIll;
            int llIlIllllllIll = IIllIllllllIll.read();
            while (InputReader.lIIlllllll(IIllIllllllIll.isSpaceChar(llIlIllllllIll) ? 1 : 0)) {
                llIlIllllllIll = IIllIllllllIll.read();
                "".length();
                if (((0x41 ^ 0x7A ^ (0x8A ^ 0x87) << (" ".length() << " ".length())) << (" ".length() << " ".length()) & (((0x70 ^ 0x69) << " ".length() ^ (0xA3 ^ 0x9E)) << (" ".length() << " ".length()) ^ -" ".length())) == 0) continue;
                return 0L;
            }
            int IlIlIllllllIll = lIllIlIIl[3];
            if (InputReader.IllIllllll(llIlIllllllIll, lIllIlIIl[4])) {
                IlIlIllllllIll = lIllIlIIl[1];
                llIlIllllllIll = IIllIllllllIll.read();
            }
            long lIIlIllllllIll = 0L;
            do {
                if (!InputReader.lllIllllll(llIlIllllllIll, lIllIlIIl[5]) || InputReader.IlIlllllll(llIlIllllllIll, lIllIlIIl[6])) {
                    throw new InputMismatchException();
                }
                lIIlIllllllIll *= 10L;
                lIIlIllllllIll += (long)(llIlIllllllIll - lIllIlIIl[5]);
            } while (!InputReader.lIIlllllll(IIllIllllllIll.isSpaceChar(llIlIllllllIll = IIllIllllllIll.read()) ? 1 : 0));
            return (long)(var3_3 * (long)var2_2);
        }

        public boolean isSpaceChar(int lIlIIllllllIll) {
            int n;
            InputReader IllIIllllllIll;
            if (InputReader.Illlllllll(IllIIllllllIll.filter)) {
                return IllIIllllllIll.filter.isSpaceChar(lIlIIllllllIll);
            }
            if (!(InputReader.IIllllllll(lIlIIllllllIll, lIllIlIIl[11]) && InputReader.IIllllllll(lIlIIllllllIll, lIllIlIIl[7]) && InputReader.IIllllllll(lIlIIllllllIll, lIllIlIIl[12]) && InputReader.IIllllllll(lIlIIllllllIll, lIllIlIIl[13]) && !InputReader.IllIllllll(lIlIIllllllIll, lIllIlIIl[1]))) {
                n = lIllIlIIl[3];
                "".length();
                if ("   ".length() == " ".length()) {
                    return ((0xDE ^ 0xC5) & ~(0x93 ^ 0x88)) != 0;
                }
            } else {
                n = lIllIlIIl[2];
            }
            return n != 0;
        }

        public String next() {
            InputReader llIIIllllllIll;
            return llIIIllllllIll.String();
        }

        static {
            InputReader.lIlIllllll();
        }

        private static void lIlIllllll() {
            lIllIlIIl = new int[14];
            InputReader.lIllIlIIl[0] = " ".length() << ((0x8D ^ 0x88) << " ".length());
            InputReader.lIllIlIIl[1] = -" ".length();
            InputReader.lIllIlIIl[2] = (3 ^ 0x22) & ~(0x76 ^ 0x57);
            InputReader.lIllIlIIl[3] = " ".length();
            InputReader.lIllIlIIl[4] = 0x3D ^ 0x10;
            InputReader.lIllIlIIl[5] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            InputReader.lIllIlIIl[6] = 0x83 ^ 0xBA;
            InputReader.lIllIlIIl[7] = (0x1A ^ 0x35 ^ (0x25 ^ 0x30) << " ".length()) << " ".length();
            InputReader.lIllIlIIl[8] = (0x5F ^ 0x40 ^ " ".length() << "   ".length()) << " ".length();
            InputReader.lIllIlIIl[9] = 0xE8 ^ 0x8D;
            InputReader.lIllIlIIl[10] = 0x36 ^ 0x73;
            InputReader.lIllIlIIl[11] = " ".length() << (0xC ^ 9);
            InputReader.lIllIlIIl[12] = 0x66 ^ 0x6B;
            InputReader.lIllIlIIl[13] = (9 ^ 0x1E) << (" ".length() << " ".length()) ^ (0xC6 ^ 0x93);
        }

        private static boolean IllIllllll(int n, int n2) {
            return n == n2;
        }

        private static boolean lllIllllll(int n, int n2) {
            return n >= n2;
        }

        private static boolean IlIlllllll(int n, int n2) {
            return n > n2;
        }

        private static boolean Illlllllll(Object object) {
            return object != null;
        }

        private static boolean lIIlllllll(int n) {
            return n != 0;
        }

        private static boolean llIlllllll(int n) {
            return n == 0;
        }

        private static boolean IIIlllllll(int n) {
            return n <= 0;
        }

        private static boolean IIllllllll(int n, int n2) {
            return n != n2;
        }

        public static interface SpaceCharFilter {
            public boolean isSpaceChar(int var1);
        }
    }
}

