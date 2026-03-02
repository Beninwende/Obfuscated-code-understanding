/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.InputMismatchException;

public class Main {
    private static int[] llIIIIIl;

    public Main() {
        Main llIIIIllIlIlIIl;
    }

    public static void main(String[] stringArray) {
        int IllIllIlIlIlIIl;
        InputReader llIlllIlIlIlIIl = new InputReader(System.in);
        OutputWriter IlIlllIlIlIlIIl = new OutputWriter(System.out);
        StringBuilder lIIlllIlIlIlIIl = new StringBuilder();
        int IIIlllIlIlIlIIl = llIlllIlIlIlIIl.Int();
        int lllIllIlIlIlIIl = llIIIIIl[0];
        if (Main.llllllIll(IIIlllIlIlIlIIl, llIIIIIl[1])) {
            IllIllIlIlIlIIl = IIIlllIlIlIlIIl / llIIIIIl[1];
            int lIlIllIlIlIlIIl = IIIlllIlIlIlIIl / llIIIIIl[1] * llIIIIIl[2];
            IIIlllIlIlIlIIl -= llIIIIIl[1] * IllIllIlIlIlIIl;
            lllIllIlIlIlIIl += lIlIllIlIlIlIIl;
        }
        if (Main.llllllIll(IIIlllIlIlIlIIl, llIIIIIl[3])) {
            IllIllIlIlIlIIl = IIIlllIlIlIlIIl / llIIIIIl[3] * llIIIIIl[3];
            IIIlllIlIlIlIIl -= IllIllIlIlIlIIl;
            lllIllIlIlIlIIl += IllIllIlIlIlIIl;
        }
        Object[] objectArray = new Object[llIIIIIl[4]];
        objectArray[Main.llIIIIIl[0]] = lllIllIlIlIlIIl;
        IlIlllIlIlIlIIl.println(objectArray);
    }

    static {
        Main.IlllllIll();
    }

    private static void IlllllIll() {
        llIIIIIl = new int[5];
        Main.llIIIIIl[0] = (0x16 ^ 0xB) << " ".length() & ~((0x5F ^ 0x42) << " ".length());
        Main.llIIIIIl[1] = (" ".length() << (" ".length() << (" ".length() << " ".length())) ^ (0xA ^ 0x67)) << (" ".length() << " ".length());
        Main.llIIIIIl[2] = (0x6A ^ 0x1D ^ (0x72 ^ 0x77) << " ".length()) << "   ".length();
        Main.llIIIIIl[3] = 0x84 ^ 0x81;
        Main.llIIIIIl[4] = " ".length();
    }

    private static boolean llllllIll(int n, int n2) {
        return n >= n2;
    }

    private static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[lllllll[0]];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private static int[] lllllll;

        public InputReader(InputStream llIIIlIIllIlIIl) {
            InputReader IIlIIlIIllIlIIl;
            IIlIIlIIllIlIIl.stream = llIIIlIIllIlIIl;
        }

        public int read() {
            block5: {
                InputReader IIIIIlIIllIlIIl;
                if (InputReader.llIIllIll(IIIIIlIIllIlIIl.numChars, lllllll[1])) {
                    throw new InputMismatchException();
                }
                if (!InputReader.IIlIllIll(IIIIIlIIllIlIIl.curChar, IIIIIlIIllIlIIl.numChars)) break block5;
                IIIIIlIIllIlIIl.curChar = lllllll[2];
                try {
                    IIIIIlIIllIlIIl.numChars = IIIIIlIIllIlIIl.stream.read(IIIIIlIIllIlIIl.buf);
                    "".length();
                }
                catch (IOException lllllIIIllIlIIl) {
                    throw new InputMismatchException();
                }
                if (-"   ".length() > 0) {
                    return " ".length() << (" ".length() << " ".length()) & ~(" ".length() << (" ".length() << " ".length()));
                }
                if (InputReader.lIlIllIll(IIIIIlIIllIlIIl.numChars)) {
                    return lllllll[1];
                }
            }
            int n = this.curChar;
            this.curChar = n + lllllll[3];
            return this.buf[n];
        }

        /*
         * WARNING - void declaration
         */
        public int Int() {
            void var2_2;
            void var3_3;
            InputReader IlIllIIIllIlIIl;
            int lIIllIIIllIlIIl = IlIllIIIllIlIIl.read();
            while (InputReader.IllIllIll(IlIllIIIllIlIIl.isSpaceChar(lIIllIIIllIlIIl) ? 1 : 0)) {
                lIIllIIIllIlIIl = IlIllIIIllIlIIl.read();
                "".length();
                if (" ".length() << " ".length() != 0) continue;
                return ((0x33 ^ 0x34) << (" ".length() << (" ".length() << " ".length())) ^ (0xB3 ^ 0x88)) & ((0xBB ^ 0xBE) << "   ".length() ^ (0xCB ^ 0xA8) ^ -" ".length());
            }
            int IIIllIIIllIlIIl = lllllll[3];
            if (InputReader.llIIllIll(lIIllIIIllIlIIl, lllllll[4])) {
                IIIllIIIllIlIIl = lllllll[1];
                lIIllIIIllIlIIl = IlIllIIIllIlIIl.read();
            }
            int lllIlIIIllIlIIl = lllllll[2];
            do {
                if (!InputReader.IIlIllIll(lIIllIIIllIlIIl, lllllll[5]) || InputReader.lllIllIll(lIIllIIIllIlIIl, lllllll[6])) {
                    throw new InputMismatchException();
                }
                lllIlIIIllIlIIl *= lllllll[7];
                lllIlIIIllIlIIl += lIIllIIIllIlIIl - lllllll[5];
            } while (!InputReader.IllIllIll(IlIllIIIllIlIIl.isSpaceChar(lIIllIIIllIlIIl = IlIllIIIllIlIIl.read()) ? 1 : 0));
            return (int)(var3_3 * var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public String String() {
            void var2_2;
            InputReader llIIlIIIllIlIIl;
            int IlIIlIIIllIlIIl = llIIlIIIllIlIIl.read();
            while (InputReader.IllIllIll(llIIlIIIllIlIIl.isSpaceChar(IlIIlIIIllIlIIl) ? 1 : 0)) {
                IlIIlIIIllIlIIl = llIIlIIIllIlIIl.read();
                "".length();
                if (" ".length() << (" ".length() << " ".length()) != 0) continue;
                return null;
            }
            StringBuilder lIIIlIIIllIlIIl = new StringBuilder();
            do {
                lIIIlIIIllIlIIl.appendCodePoint(IlIIlIIIllIlIIl);
                "".length();
            } while (!InputReader.IllIllIll(llIIlIIIllIlIIl.isSpaceChar(IlIIlIIIllIlIIl = llIIlIIIllIlIIl.read()) ? 1 : 0));
            return String.valueOf(var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public double Double() {
            void var2_2;
            void var3_3;
            InputReader llIlIIIIllIlIIl;
            int IlIlIIIIllIlIIl = llIlIIIIllIlIIl.read();
            while (InputReader.IllIllIll(llIlIIIIllIlIIl.isSpaceChar(IlIlIIIIllIlIIl) ? 1 : 0)) {
                IlIlIIIIllIlIIl = llIlIIIIllIlIIl.read();
                "".length();
                if (null == null) continue;
                return 0.0;
            }
            int lIIlIIIIllIlIIl = lllllll[3];
            if (InputReader.llIIllIll(IlIlIIIIllIlIIl, lllllll[4])) {
                lIIlIIIIllIlIIl = lllllll[1];
                IlIlIIIIllIlIIl = llIlIIIIllIlIIl.read();
            }
            double IIIlIIIIllIlIIl = 0.0;
            while (InputReader.IIIlllIll(llIlIIIIllIlIIl.isSpaceChar(IlIlIIIIllIlIIl) ? 1 : 0) && InputReader.lIIlllIll(IlIlIIIIllIlIIl, lllllll[8])) {
                if (!InputReader.lIIlllIll(IlIlIIIIllIlIIl, lllllll[9]) || InputReader.llIIllIll(IlIlIIIIllIlIIl, lllllll[10])) {
                    return IIIlIIIIllIlIIl * Math.pow(10.0, llIlIIIIllIlIIl.Int());
                }
                if (!InputReader.IIlIllIll(IlIlIIIIllIlIIl, lllllll[5]) || InputReader.lllIllIll(IlIlIIIIllIlIIl, lllllll[6])) {
                    throw new InputMismatchException();
                }
                IIIlIIIIllIlIIl *= 10.0;
                IIIlIIIIllIlIIl += (double)(IlIlIIIIllIlIIl - lllllll[5]);
                IlIlIIIIllIlIIl = llIlIIIIllIlIIl.read();
                "".length();
                if ((((3 ^ 0x28) << " ".length() ^ (0xC ^ 0x71)) & (" ".length() ^ (0x8C ^ 0x99) << " ".length() ^ -" ".length())) < " ".length() << (" ".length() << " ".length())) continue;
                return 0.0;
            }
            if (InputReader.llIIllIll(IlIlIIIIllIlIIl, lllllll[8])) {
                IlIlIIIIllIlIIl = llIlIIIIllIlIIl.read();
                double lllIIIIIllIlIIl = 1.0;
                while (InputReader.IIIlllIll(llIlIIIIllIlIIl.isSpaceChar(IlIlIIIIllIlIIl) ? 1 : 0)) {
                    if (!InputReader.lIIlllIll(IlIlIIIIllIlIIl, lllllll[9]) || InputReader.llIIllIll(IlIlIIIIllIlIIl, lllllll[10])) {
                        return IIIlIIIIllIlIIl * Math.pow(10.0, llIlIIIIllIlIIl.Int());
                    }
                    if (!InputReader.IIlIllIll(IlIlIIIIllIlIIl, lllllll[5]) || InputReader.lllIllIll(IlIlIIIIllIlIIl, lllllll[6])) {
                        throw new InputMismatchException();
                    }
                    IIIlIIIIllIlIIl += (double)(IlIlIIIIllIlIIl - lllllll[5]) * (lllIIIIIllIlIIl /= 10.0);
                    IlIlIIIIllIlIIl = llIlIIIIllIlIIl.read();
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
        public long Long() {
            void var2_2;
            void var3_3;
            InputReader IlIIIIIIllIlIIl;
            int lIIIIIIIllIlIIl = IlIIIIIIllIlIIl.read();
            while (InputReader.IllIllIll(IlIIIIIIllIlIIl.isSpaceChar(lIIIIIIIllIlIIl) ? 1 : 0)) {
                lIIIIIIIllIlIIl = IlIIIIIIllIlIIl.read();
                "".length();
                if (((0xE3 ^ 0xA8) & ~(0x44 ^ 0xF)) <= " ".length() << " ".length()) continue;
                return 0L;
            }
            int IIIIIIIIllIlIIl = lllllll[3];
            if (InputReader.llIIllIll(lIIIIIIIllIlIIl, lllllll[4])) {
                IIIIIIIIllIlIIl = lllllll[1];
                lIIIIIIIllIlIIl = IlIIIIIIllIlIIl.read();
            }
            long llllllllIlIlIIl = 0L;
            do {
                if (!InputReader.IIlIllIll(lIIIIIIIllIlIIl, lllllll[5]) || InputReader.lllIllIll(lIIIIIIIllIlIIl, lllllll[6])) {
                    throw new InputMismatchException();
                }
                llllllllIlIlIIl *= 10L;
                llllllllIlIlIIl += (long)(lIIIIIIIllIlIIl - lllllll[5]);
            } while (!InputReader.IllIllIll(IlIIIIIIllIlIIl.isSpaceChar(lIIIIIIIllIlIIl = IlIIIIIIllIlIIl.read()) ? 1 : 0));
            return (long)(var3_3 * (long)var2_2);
        }

        public boolean isSpaceChar(int llIlllllIlIlIIl) {
            int n;
            InputReader IIllllllIlIlIIl;
            if (InputReader.IlIlllIll(IIllllllIlIlIIl.filter)) {
                return IIllllllIlIlIIl.filter.isSpaceChar(llIlllllIlIlIIl);
            }
            if (!(InputReader.lIIlllIll(llIlllllIlIlIIl, lllllll[11]) && InputReader.lIIlllIll(llIlllllIlIlIIl, lllllll[7]) && InputReader.lIIlllIll(llIlllllIlIlIIl, lllllll[12]) && InputReader.lIIlllIll(llIlllllIlIlIIl, lllllll[13]) && !InputReader.llIIllIll(llIlllllIlIlIIl, lllllll[1]))) {
                n = lllllll[3];
                "".length();
                if ("   ".length() <= -" ".length()) {
                    return ((0x6D ^ 0x70 ^ (0x23 ^ 0x3C) << (" ".length() << " ".length())) & (0x91 ^ 0xBE ^ (0x6A ^ 0x4D) << " ".length() ^ -" ".length())) != 0;
                }
            } else {
                n = lllllll[2];
            }
            return n != 0;
        }

        public String next() {
            InputReader lIIlllllIlIlIIl;
            return lIIlllllIlIlIIl.String();
        }

        static {
            InputReader.IlIIllIll();
        }

        private static void IlIIllIll() {
            lllllll = new int[14];
            InputReader.lllllll[0] = " ".length() << ((84 + 116 - 181 + 146 ^ (0x4C ^ 0x49) << (0x83 ^ 0x86)) << " ".length());
            InputReader.lllllll[1] = -" ".length();
            InputReader.lllllll[2] = (0x80 ^ 0x85 ^ (0x5F ^ 0x7A) << " ".length()) & (0xB ^ 0x7C ^ (0x1A ^ 0x1D) << "   ".length() ^ -" ".length());
            InputReader.lllllll[3] = " ".length();
            InputReader.lllllll[4] = (0x4C ^ 0x6D) << (" ".length() << " ".length()) ^ 68 + 66 - 3 + 38;
            InputReader.lllllll[5] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            InputReader.lllllll[6] = 111 + 165 - 211 + 184 ^ "   ".length() << ("   ".length() << " ".length());
            InputReader.lllllll[7] = (7 ^ 2) << " ".length();
            InputReader.lllllll[8] = ((0x8F ^ 0xC6) << " ".length() ^ 66 + 47 - 47 + 67) << " ".length();
            InputReader.lllllll[9] = 0xC8 ^ 0xAD;
            InputReader.lllllll[10] = 133 + 44 - 173 + 191 ^ (0x68 ^ 0x2B) << " ".length();
            InputReader.lllllll[11] = " ".length() << ((9 ^ 0x1E) << " ".length() ^ (0x7D ^ 0x56));
            InputReader.lllllll[12] = 0x87 ^ 0x8A;
            InputReader.lllllll[13] = 3 ^ 0xA;
        }

        private static boolean llIIllIll(int n, int n2) {
            return n == n2;
        }

        private static boolean IIlIllIll(int n, int n2) {
            return n >= n2;
        }

        private static boolean lllIllIll(int n, int n2) {
            return n > n2;
        }

        private static boolean IlIlllIll(Object object) {
            return object != null;
        }

        private static boolean IllIllIll(int n) {
            return n != 0;
        }

        private static boolean IIIlllIll(int n) {
            return n == 0;
        }

        private static boolean lIlIllIll(int n) {
            return n <= 0;
        }

        private static boolean lIIlllIll(int n, int n2) {
            return n != n2;
        }

        public static interface SpaceCharFilter {
            public boolean isSpaceChar(int var1);
        }
    }

    private static class OutputWriter {
        private final PrintWriter writer;
        private static int[] lIIIIIIl;

        public OutputWriter(OutputStream lIlllIllIlIlIIl) {
            OutputWriter IllllIllIlIlIIl;
            IllllIllIlIlIIl.writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(lIlllIllIlIlIIl)));
        }

        public OutputWriter(Writer lIIllIllIlIlIIl) {
            OutputWriter IlIllIllIlIlIIl;
            IlIllIllIlIlIIl.writer = new PrintWriter(lIIllIllIlIlIIl);
        }

        public void print(Object ... IIlIlIllIlIlIIl) {
            OutputWriter lIlIlIllIlIlIIl;
            int llIIlIllIlIlIIl = lIIIIIIl[0];
            while (OutputWriter.IIllllIll(llIIlIllIlIlIIl, IIlIlIllIlIlIIl.length)) {
                if (OutputWriter.lIllllIll(llIIlIllIlIlIIl)) {
                    lIlIlIllIlIlIIl.writer.print(lIIIIIIl[1]);
                }
                lIlIlIllIlIlIIl.writer.print(IIlIlIllIlIlIIl[llIIlIllIlIlIIl]);
                ++llIIlIllIlIlIIl;
                "".length();
                if (("   ".length() << (" ".length() << " ".length()) & ~("   ".length() << (" ".length() << " ".length()))) <= "   ".length()) continue;
                return;
            }
            lIlIlIllIlIlIIl.writer.flush();
        }

        public void println(Object ... llllIIllIlIlIIl) {
            OutputWriter IIIIlIllIlIlIIl;
            IIIIlIllIlIlIIl.print(llllIIllIlIlIIl);
            IIIIlIllIlIlIIl.writer.println();
            IIIIlIllIlIlIIl.writer.flush();
        }

        public void close() {
            OutputWriter lIllIIllIlIlIIl;
            lIllIIllIlIlIIl.writer.close();
        }

        public void flush() {
            OutputWriter llIlIIllIlIlIIl;
            llIlIIllIlIlIIl.writer.flush();
        }

        static {
            OutputWriter.llIlllIll();
        }

        private static void llIlllIll() {
            lIIIIIIl = new int[2];
            OutputWriter.lIIIIIIl[0] = (0x38 ^ 0x77 ^ (0x5D ^ 0x54) << "   ".length()) & ((0x4D ^ 0x2C) << " ".length() ^ 85 + 17 - 7 + 102 ^ -" ".length());
            OutputWriter.lIIIIIIl[1] = " ".length() << (0x5C ^ 0x59);
        }

        private static boolean IIllllIll(int n, int n2) {
            return n < n2;
        }

        private static boolean lIllllIll(int n) {
            return n != 0;
        }
    }
}

