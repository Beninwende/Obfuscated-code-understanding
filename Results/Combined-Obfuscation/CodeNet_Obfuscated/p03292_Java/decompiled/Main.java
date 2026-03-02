/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;

public class Main {
    private static int[] lIlll;

    public Main() {
        Main IllIlllIllIllIl;
    }

    public static void main(String[] stringArray) throws Exception {
        InputReader IlllIllIllIllIl = new InputReader(System.in);
        PrintWriter lIllIllIllIllIl = new PrintWriter(System.out);
        int[] IIllIllIllIllIl = IlllIllIllIllIl.nextIntArray(lIlll[0]);
        int llIlIllIllIllIl = lIlll[1];
        int IlIlIllIllIllIl = lIlll[2];
        while (Main.lIIIIll(IlIlIllIllIllIl, lIlll[0])) {
            int lIIlIllIllIllIl = lIlll[2];
            int IIIlIllIllIllIl = lIlll[2];
            while (Main.lIIIIll(IIIlIllIllIllIl, lIlll[0])) {
                if (Main.llIIIll(IlIlIllIllIllIl, IIIlIllIllIllIl)) {
                    "".length();
                    if (-" ".length() == " ".length()) {
                        return;
                    }
                } else {
                    lIIlIllIllIllIl += Math.abs(IIllIllIllIllIl[IIIlIllIllIllIl] - IIllIllIllIllIl[IlIlIllIllIllIl]);
                }
                ++IIIlIllIllIllIl;
                "".length();
                if (((0x94 ^ 0x8B) << " ".length() & ~((0x2A ^ 0x35) << " ".length())) >= 0) continue;
                return;
            }
            llIlIllIllIllIl = Math.min(llIlIllIllIllIl, lIIlIllIllIllIl);
            ++IlIlIllIllIllIl;
            "".length();
            if (" ".length() > (((0x90 ^ 0x9B) << " ".length() ^ (0xEF ^ 0xC6)) & ((0x2A ^ 0x3D) << "   ".length() ^ 80 + 130 - 79 + 4 ^ -" ".length()))) continue;
            return;
        }
        lIllIllIllIllIl.print(llIlIllIllIllIl);
        lIllIllIllIllIl.close();
    }

    static {
        Main.IllllIl();
    }

    private static void IllllIl() {
        lIlll = new int[3];
        Main.lIlll[0] = "   ".length();
        Main.lIlll[1] = 579 + 315 - 83 + 316 + (879 + 31 - -663 + 422) - (705 + 361 - 434 + 217 << " ".length()) + (1303 + 283 - 553 + 668) << ((0x5F ^ 0x42) << " ".length() ^ (9 ^ 0x36));
        Main.lIlll[2] = ((0x1F ^ 0) << " ".length() ^ (0x18 ^ 0x31)) << (" ".length() << " ".length()) & ((89 + 116 - 84 + 22 ^ (0x29 ^ 0x3A) << "   ".length()) << (" ".length() << " ".length()) ^ -" ".length());
    }

    private static boolean llIIIll(int n, int n2) {
        return n == n2;
    }

    private static boolean lIIIIll(int n, int n2) {
        return n < n2;
    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[IIlll[0]];
        private int curChar;
        private int numChars;
        private static int[] IIlll;

        public InputReader(InputStream IIlllIlIllIllIl) {
            InputReader lIlllIlIllIllIl;
            lIlllIlIllIllIl.stream = IIlllIlIllIllIl;
        }

        public int read() {
            block5: {
                InputReader lIIllIlIllIllIl;
                if (InputReader.IIlllIl(lIIllIlIllIllIl.numChars, IIlll[1])) {
                    throw new UnknownError();
                }
                if (!InputReader.lIlllIl(lIIllIlIllIllIl.curChar, lIIllIlIllIllIl.numChars)) break block5;
                lIIllIlIllIllIl.curChar = IIlll[2];
                try {
                    lIIllIlIllIllIl.numChars = lIIllIlIllIllIl.stream.read(lIIllIlIllIllIl.buf);
                    "".length();
                }
                catch (IOException IIIllIlIllIllIl) {
                    throw new UnknownError();
                }
                if (" ".length() << " ".length() == 0) {
                    return ((0xC7 ^ 0xBC) << " ".length() ^ 41 + 102 - 110 + 154) & (" ".length() << (" ".length() << " ".length()) ^ (5 ^ 0x4C) ^ -" ".length());
                }
                if (InputReader.lllllIl(lIIllIlIllIllIl.numChars)) {
                    return IIlll[1];
                }
            }
            int n = this.curChar;
            this.curChar = n + IIlll[3];
            return this.buf[n];
        }

        public int peek() {
            block5: {
                InputReader lIlIlIlIllIllIl;
                if (InputReader.IIlllIl(lIlIlIlIllIllIl.numChars, IIlll[1])) {
                    return IIlll[1];
                }
                if (!InputReader.lIlllIl(lIlIlIlIllIllIl.curChar, lIlIlIlIllIllIl.numChars)) break block5;
                lIlIlIlIllIllIl.curChar = IIlll[2];
                try {
                    lIlIlIlIllIllIl.numChars = lIlIlIlIllIllIl.stream.read(lIlIlIlIllIllIl.buf);
                    "".length();
                }
                catch (IOException IIlIlIlIllIllIl) {
                    return IIlll[1];
                }
                if (-" ".length() > 0) {
                    return (0xAB ^ 0x80) & ~(0x54 ^ 0x7F) & ~(" ".length() << (0x5B ^ 0x5E) & ~(" ".length() << (0x13 ^ 0x16)));
                }
                if (InputReader.lllllIl(lIlIlIlIllIllIl.numChars)) {
                    return IIlll[1];
                }
            }
            return this.buf[this.curChar];
        }

        public void skip(int IIIIlIlIllIllIl) {
            while (InputReader.IIIIIll(IIIIlIlIllIllIl--)) {
                InputReader lIIIlIlIllIllIl;
                lIIIlIlIllIllIl.read();
                "".length();
                "".length();
                if (" ".length() << " ".length() > ((0x6C ^ 0x79 ^ (0x27 ^ 0x2E) << (" ".length() << " ".length())) & (15 + 93 - -24 + 109 ^ "   ".length() << ("   ".length() << " ".length()) ^ -" ".length()))) continue;
                return;
            }
        }

        public int nextInt() {
            InputReader IlllIIlIllIllIl;
            return Integer.parseInt(IlllIIlIllIllIl.next());
        }

        public long nextLong() {
            InputReader IIllIIlIllIllIl;
            return Long.parseLong(IIllIIlIllIllIl.next());
        }

        public String nextString() {
            InputReader IlIlIIlIllIllIl;
            return IlIlIIlIllIllIl.next();
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var2_2;
            InputReader IllIIIlIllIllIl;
            int lIlIIIlIllIllIl = IllIIIlIllIllIl.read();
            while (InputReader.IlIIIll(IllIIIlIllIllIl.isSpaceChar(lIlIIIlIllIllIl) ? 1 : 0)) {
                lIlIIIlIllIllIl = IllIIIlIllIllIl.read();
                "".length();
                if (" ".length() != ((68 + 62 - 48 + 79 ^ (0x2A ^ 0xB) << (" ".length() << " ".length())) & ((0x32 ^ 0x41) << " ".length() ^ 58 + 57 - 81 + 161 ^ -" ".length()))) continue;
                return null;
            }
            StringBuffer IIlIIIlIllIllIl = new StringBuffer();
            do {
                IIlIIIlIllIllIl.appendCodePoint(lIlIIIlIllIllIl);
                "".length();
            } while (!InputReader.IlIIIll(IllIIIlIllIllIl.isSpaceChar(lIlIIIlIllIllIl = IllIIIlIllIllIl.read()) ? 1 : 0));
            return var2_2.toString();
        }

        /*
         * WARNING - void declaration
         */
        public String nextLine() {
            void var1_1;
            InputReader IIIIIIlIllIllIl;
            StringBuffer llllllIIllIllIl = new StringBuffer();
            int IlllllIIllIllIl = IIIIIIlIllIllIl.read();
            while (InputReader.IIlIIll(IlllllIIllIllIl, IIlll[4]) && InputReader.IIlIIll(IlllllIIllIllIl, IIlll[1])) {
                if (InputReader.IIlIIll(IlllllIIllIllIl, IIlll[5])) {
                    llllllIIllIllIl.appendCodePoint(IlllllIIllIllIl);
                    "".length();
                }
                IlllllIIllIllIl = IIIIIIlIllIllIl.read();
                "".length();
                if (null == null) continue;
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
            InputReader IIIlllIIllIllIl;
            int lllIllIIllIllIl = IIIlllIIllIllIl.read();
            while (InputReader.IlIIIll(IIIlllIIllIllIl.isSpaceChar(lllIllIIllIllIl) ? 1 : 0)) {
                lllIllIIllIllIl = IIIlllIIllIllIl.read();
                "".length();
                if ((((0x26 ^ 0x35) << (" ".length() << " ".length()) ^ (0x6A ^ 0x63)) & ((0x71 ^ 0x4E) << " ".length() ^ (0xB8 ^ 0x83) ^ -" ".length())) == 0) continue;
                return 0.0;
            }
            int IllIllIIllIllIl = IIlll[3];
            if (InputReader.IIlllIl(lllIllIIllIllIl, IIlll[6])) {
                IllIllIIllIllIl = IIlll[1];
                lllIllIIllIllIl = IIIlllIIllIllIl.read();
            }
            double lIlIllIIllIllIl = 0.0;
            while (InputReader.lIlIIll(IIIlllIIllIllIl.isSpaceChar(lllIllIIllIllIl) ? 1 : 0) && InputReader.IIlIIll(lllIllIIllIllIl, IIlll[7])) {
                if (!InputReader.IIlIIll(lllIllIIllIllIl, IIlll[8]) || InputReader.IIlllIl(lllIllIIllIllIl, IIlll[9])) {
                    return lIlIllIIllIllIl * Math.pow(10.0, IIIlllIIllIllIl.nextInt());
                }
                if (!InputReader.lIlllIl(lllIllIIllIllIl, IIlll[10]) || InputReader.IllIIll(lllIllIIllIllIl, IIlll[11])) {
                    throw new InputMismatchException();
                }
                lIlIllIIllIllIl *= 10.0;
                lIlIllIIllIllIl += (double)(lllIllIIllIllIl - IIlll[10]);
                lllIllIIllIllIl = IIIlllIIllIllIl.read();
                "".length();
                if (" ".length() << " ".length() >= ((0x77 ^ 0x6A) << " ".length() & ~((0x53 ^ 0x4E) << " ".length()))) continue;
                return 0.0;
            }
            if (InputReader.IIlllIl(lllIllIIllIllIl, IIlll[7])) {
                lllIllIIllIllIl = IIIlllIIllIllIl.read();
                double IIlIllIIllIllIl = 1.0;
                while (InputReader.lIlIIll(IIIlllIIllIllIl.isSpaceChar(lllIllIIllIllIl) ? 1 : 0)) {
                    if (!InputReader.IIlIIll(lllIllIIllIllIl, IIlll[8]) || InputReader.IIlllIl(lllIllIIllIllIl, IIlll[9])) {
                        return lIlIllIIllIllIl * Math.pow(10.0, IIIlllIIllIllIl.nextInt());
                    }
                    if (!InputReader.lIlllIl(lllIllIIllIllIl, IIlll[10]) || InputReader.IllIIll(lllIllIIllIllIl, IIlll[11])) {
                        throw new InputMismatchException();
                    }
                    lIlIllIIllIllIl += (double)(lllIllIIllIllIl - IIlll[10]) * (IIlIllIIllIllIl /= 10.0);
                    lllIllIIllIllIl = IIIlllIIllIllIl.read();
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
        public int[] nextIntArray(int IlllIlIIllIllIl) {
            void var2_2;
            int[] lIllIlIIllIllIl = new int[IlllIlIIllIllIl];
            int IIllIlIIllIllIl = IIlll[2];
            while (InputReader.lllIIll(IIllIlIIllIllIl, IlllIlIIllIllIl)) {
                InputReader llllIlIIllIllIl;
                lIllIlIIllIllIl[IIllIlIIllIllIl] = llllIlIIllIllIl.nextInt();
                ++IIllIlIIllIllIl;
                "".length();
                if ((0x4D ^ 0x50 ^ "   ".length() << "   ".length()) > 0) continue;
                return null;
            }
            return var2_2;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray(int IllIIlIIllIllIl) {
            void var2_2;
            long[] lIlIIlIIllIllIl = new long[IllIIlIIllIllIl];
            int IIlIIlIIllIllIl = IIlll[2];
            while (InputReader.lllIIll(IIlIIlIIllIllIl, IllIIlIIllIllIl)) {
                InputReader lllIIlIIllIllIl;
                lIlIIlIIllIllIl[IIlIIlIIllIllIl] = lllIIlIIllIllIl.nextLong();
                ++IIlIIlIIllIllIl;
                "".length();
                if (" ".length() << " ".length() > 0) continue;
                return null;
            }
            return var2_2;
        }

        public boolean hasNext() {
            boolean bl;
            int IIIIIlIIllIllIl;
            InputReader lIIIIlIIllIllIl;
            while (InputReader.IlIIIll(lIIIIlIIllIllIl.isSpaceChar(IIIIIlIIllIllIl = lIIIIlIIllIllIl.peek()) ? 1 : 0) && InputReader.IIlIIll(IIIIIlIIllIllIl, IIlll[1])) {
                lIIIIlIIllIllIl.read();
                "".length();
                "".length();
                if (((211 + 108 - 303 + 197 ^ "   ".length() << ("   ".length() << " ".length())) << " ".length() & ((86 + 28 - 41 + 70 ^ (0x16 ^ 0x5B) << " ".length()) << " ".length() ^ -" ".length())) == 0) continue;
                return (("   ".length() ^ (6 ^ 0x37) << " ".length()) & (0xE8 ^ 0x99 ^ " ".length() << (" ".length() << (" ".length() << " ".length())) ^ -" ".length())) != 0;
            }
            if (InputReader.IIlIIll(IIIIIlIIllIllIl, IIlll[1])) {
                bl = IIlll[3];
                "".length();
                if (((0x55 ^ 0x24 ^ (0x50 ^ 0x47) << " ".length()) & (59 + 163 - 202 + 191 ^ (0x56 ^ 0x75) << (" ".length() << " ".length()) ^ -" ".length())) != 0) {
                    return ((38 + 185 - 132 + 112 ^ (0x94 ^ 0xC1) << " ".length()) & (10 + 68 - -122 + 5 ^ (0xA2 ^ 0x89) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
                }
            } else {
                bl = IIlll[2];
            }
            return bl;
        }

        private boolean isSpaceChar(int IllllIIIllIllIl) {
            int n;
            if (!(InputReader.IIlIIll(IllllIIIllIllIl, IIlll[12]) && InputReader.IIlIIll(IllllIIIllIllIl, IIlll[4]) && InputReader.IIlIIll(IllllIIIllIllIl, IIlll[5]) && InputReader.IIlIIll(IllllIIIllIllIl, IIlll[13]) && !InputReader.IIlllIl(IllllIIIllIllIl, IIlll[1]))) {
                n = IIlll[3];
                "".length();
                if (" ".length() << (" ".length() << " ".length()) == " ".length() << " ".length()) {
                    return ((0x16 ^ 0x39) << " ".length() & ~((0xEA ^ 0xC5) << " ".length())) != 0;
                }
            } else {
                n = IIlll[2];
            }
            return n != 0;
        }

        static {
            InputReader.llIllIl();
        }

        private static void llIllIl() {
            IIlll = new int[14];
            InputReader.IIlll[0] = " ".length() << ((0x61 ^ 0x64) << " ".length());
            InputReader.IIlll[1] = -" ".length();
            InputReader.IIlll[2] = (0x4B ^ 0x24 ^ "   ".length() << (0xB7 ^ 0xB2)) << (" ".length() << " ".length()) & ((118 + 27 - 53 + 37 ^ (0xEE ^ 0xA9) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length());
            InputReader.IIlll[3] = " ".length();
            InputReader.IIlll[4] = ((0xE ^ 5) << (" ".length() << " ".length()) ^ (0x7D ^ 0x54)) << " ".length();
            InputReader.IIlll[5] = " ".length() << (" ".length() << (" ".length() << " ".length())) ^ (0x90 ^ 0x8D);
            InputReader.IIlll[6] = 0x2F ^ 2;
            InputReader.IIlll[7] = (0x6A ^ 0xB ^ (0xA7 ^ 0x9C) << " ".length()) << " ".length();
            InputReader.IIlll[8] = 82 + 79 - 17 + 99 ^ (0x78 ^ 0x33) << " ".length();
            InputReader.IIlll[9] = 107 + 200 - 242 + 148 ^ (0x52 ^ 0x5B) << (" ".length() << (" ".length() << " ".length()));
            InputReader.IIlll[10] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            InputReader.IIlll[11] = (0x1F ^ 8) << " ".length() ^ (0x7D ^ 0x6A);
            InputReader.IIlll[12] = " ".length() << (0xB4 ^ 0xB1);
            InputReader.IIlll[13] = 0xB9 ^ 0xB0;
        }

        private static boolean IIlllIl(int n, int n2) {
            return n == n2;
        }

        private static boolean lIlllIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean lllIIll(int n, int n2) {
            return n < n2;
        }

        private static boolean IllIIll(int n, int n2) {
            return n > n2;
        }

        private static boolean IlIIIll(int n) {
            return n != 0;
        }

        private static boolean lIlIIll(int n) {
            return n == 0;
        }

        private static boolean lllllIl(int n) {
            return n <= 0;
        }

        private static boolean IIIIIll(int n) {
            return n > 0;
        }

        private static boolean IIlIIll(int n, int n2) {
            return n != n2;
        }
    }
}

