/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    private static int[] lIlIlIIIl;

    public Main() {
        Main IlIlIllIIlIlll;
    }

    public static void main(String[] stringArray) {
        InputStream IlIIIllIIlIlll = System.in;
        PrintStream lIIIIllIIlIlll = System.out;
        InputReader IIIIIllIIlIlll = new InputReader(IlIIIllIIlIlll);
        OutputWriter IllllIlIIlIlll = new OutputWriter(lIIIIllIIlIlll);
        CAlchemist IIlllIlIIlIlll = new CAlchemist();
        IIlllIlIIlIlll.solve(lIlIlIIIl[0], IIIIIllIIlIlll, IllllIlIIlIlll);
        IllllIlIIlIlll.close();
    }

    static {
        Main.lIIlIlIlll();
    }

    private static void lIIlIlIlll() {
        lIlIlIIIl = new int[1];
        Main.lIlIlIIIl[0] = " ".length();
    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[llllIIIIl[0]];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private static int[] llllIIIIl;

        public InputReader(InputStream IIllIIlIIlIlll) {
            InputReader lIllIIlIIlIlll;
            lIllIIlIIlIlll.stream = IIllIIlIIlIlll;
        }

        public int read() {
            block5: {
                InputReader lIIlIIlIIlIlll;
                if (InputReader.lIlIIlIlll(lIIlIIlIIlIlll.numChars, llllIIIIl[1])) {
                    throw new InputMismatchException();
                }
                if (!InputReader.IllIIlIlll(lIIlIIlIIlIlll.curChar, lIIlIIlIIlIlll.numChars)) break block5;
                lIIlIIlIIlIlll.curChar = llllIIIIl[2];
                try {
                    lIIlIIlIIlIlll.numChars = lIIlIIlIIlIlll.stream.read(lIIlIIlIIlIlll.buf);
                    "".length();
                }
                catch (IOException IIIlIIlIIlIlll) {
                    throw new InputMismatchException();
                }
                if (null != null) {
                    return ((0x4D ^ 0x44) << (" ".length() << (" ".length() << " ".length())) ^ 99 + 143 - 203 + 116) << (" ".length() << " ".length()) & (((0x93 ^ 0x86) << "   ".length() ^ 28 + 16 - -28 + 91) << (" ".length() << " ".length()) ^ -" ".length());
                }
                if (InputReader.IIIlIlIlll(lIIlIIlIIlIlll.numChars)) {
                    return llllIIIIl[1];
                }
            }
            int n = this.curChar;
            this.curChar = n + llllIIIIl[3];
            return this.buf[n];
        }

        /*
         * WARNING - void declaration
         */
        public int readInt() {
            void var2_2;
            void var3_3;
            InputReader llIIIIlIIlIlll;
            int IlIIIIlIIlIlll = llIIIIlIIlIlll.read();
            while (InputReader.IlIlIlIlll(llIIIIlIIlIlll.isSpaceChar(IlIIIIlIIlIlll) ? 1 : 0)) {
                IlIIIIlIIlIlll = llIIIIlIIlIlll.read();
                "".length();
                if ("   ".length() > 0) continue;
                return " ".length() << (" ".length() << " ".length()) & (" ".length() << (" ".length() << " ".length()) ^ -" ".length());
            }
            int lIIIIIlIIlIlll = llllIIIIl[3];
            if (InputReader.lIlIIlIlll(IlIIIIlIIlIlll, llllIIIIl[4])) {
                lIIIIIlIIlIlll = llllIIIIl[1];
                IlIIIIlIIlIlll = llIIIIlIIlIlll.read();
            }
            int IIIIIIlIIlIlll = llllIIIIl[2];
            do {
                if (!InputReader.IllIIlIlll(IlIIIIlIIlIlll, llllIIIIl[5]) || InputReader.llIlIlIlll(IlIIIIlIIlIlll, llllIIIIl[6])) {
                    throw new InputMismatchException();
                }
                IIIIIIlIIlIlll *= llllIIIIl[7];
                IIIIIIlIIlIlll += IlIIIIlIIlIlll - llllIIIIl[5];
            } while (!InputReader.IlIlIlIlll(llIIIIlIIlIlll.isSpaceChar(IlIIIIlIIlIlll = llIIIIlIIlIlll.read()) ? 1 : 0));
            return (int)(var3_3 * var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public boolean isSpaceChar(int IIllllIIIlIlll) {
            void var1_1;
            InputReader lIllllIIIlIlll;
            if (InputReader.IIllIlIlll(lIllllIIIlIlll.filter)) {
                return lIllllIIIlIlll.filter.isSpaceChar(IIllllIIIlIlll);
            }
            return InputReader.isWhitespace((int)var1_1);
        }

        public static boolean isWhitespace(int IlIlllIIIlIlll) {
            int n;
            if (!(InputReader.lIllIlIlll(IlIlllIIIlIlll, llllIIIIl[8]) && InputReader.lIllIlIlll(IlIlllIIIlIlll, llllIIIIl[7]) && InputReader.lIllIlIlll(IlIlllIIIlIlll, llllIIIIl[9]) && InputReader.lIllIlIlll(IlIlllIIIlIlll, llllIIIIl[10]) && !InputReader.lIlIIlIlll(IlIlllIIIlIlll, llllIIIIl[1]))) {
                n = llllIIIIl[3];
                "".length();
                if (" ".length() << " ".length() == " ".length()) {
                    return ((0xFC ^ 0xBD) & ~(0xD5 ^ 0x94)) != 0;
                }
            } else {
                n = llllIIIIl[2];
            }
            return n != 0;
        }

        /*
         * WARNING - void declaration
         */
        public double readDouble() {
            void var2_2;
            void var3_3;
            InputReader IIlIllIIIlIlll;
            int llIIllIIIlIlll = IIlIllIIIlIlll.read();
            while (InputReader.IlIlIlIlll(IIlIllIIIlIlll.isSpaceChar(llIIllIIIlIlll) ? 1 : 0)) {
                llIIllIIIlIlll = IIlIllIIIlIlll.read();
                "".length();
                if (null == null) continue;
                return 0.0;
            }
            int IlIIllIIIlIlll = llllIIIIl[3];
            if (InputReader.lIlIIlIlll(llIIllIIIlIlll, llllIIIIl[4])) {
                IlIIllIIIlIlll = llllIIIIl[1];
                llIIllIIIlIlll = IIlIllIIIlIlll.read();
            }
            double lIIIllIIIlIlll = 0.0;
            while (InputReader.IlllIlIlll(IIlIllIIIlIlll.isSpaceChar(llIIllIIIlIlll) ? 1 : 0) && InputReader.lIllIlIlll(llIIllIIIlIlll, llllIIIIl[11])) {
                if (!InputReader.lIllIlIlll(llIIllIIIlIlll, llllIIIIl[12]) || InputReader.lIlIIlIlll(llIIllIIIlIlll, llllIIIIl[13])) {
                    return lIIIllIIIlIlll * Math.pow(10.0, IIlIllIIIlIlll.readInt());
                }
                if (!InputReader.IllIIlIlll(llIIllIIIlIlll, llllIIIIl[5]) || InputReader.llIlIlIlll(llIIllIIIlIlll, llllIIIIl[6])) {
                    throw new InputMismatchException();
                }
                lIIIllIIIlIlll *= 10.0;
                lIIIllIIIlIlll += (double)(llIIllIIIlIlll - llllIIIIl[5]);
                llIIllIIIlIlll = IIlIllIIIlIlll.read();
                "".length();
                if (-" ".length() != " ".length() << " ".length()) continue;
                return 0.0;
            }
            if (InputReader.lIlIIlIlll(llIIllIIIlIlll, llllIIIIl[11])) {
                llIIllIIIlIlll = IIlIllIIIlIlll.read();
                double IIIIllIIIlIlll = 1.0;
                while (InputReader.IlllIlIlll(IIlIllIIIlIlll.isSpaceChar(llIIllIIIlIlll) ? 1 : 0)) {
                    if (!InputReader.lIllIlIlll(llIIllIIIlIlll, llllIIIIl[12]) || InputReader.lIlIIlIlll(llIIllIIIlIlll, llllIIIIl[13])) {
                        return lIIIllIIIlIlll * Math.pow(10.0, IIlIllIIIlIlll.readInt());
                    }
                    if (!InputReader.IllIIlIlll(llIIllIIIlIlll, llllIIIIl[5]) || InputReader.llIlIlIlll(llIIllIIIlIlll, llllIIIIl[6])) {
                        throw new InputMismatchException();
                    }
                    lIIIllIIIlIlll += (double)(llIIllIIIlIlll - llllIIIIl[5]) * (IIIIllIIIlIlll /= 10.0);
                    llIIllIIIlIlll = IIlIllIIIlIlll.read();
                    "".length();
                    if ("   ".length() > -" ".length()) continue;
                    return 0.0;
                }
            }
            return (double)(var3_3 * (double)var2_2);
        }

        static {
            InputReader.llIIIlIlll();
        }

        private static void llIIIlIlll() {
            llllIIIIl = new int[14];
            InputReader.llllIIIIl[0] = " ".length() << ((0x75 ^ 0x70) << " ".length());
            InputReader.llllIIIIl[1] = -" ".length();
            InputReader.llllIIIIl[2] = (0x29 ^ 0x6A) & ~(0xD5 ^ 0x96);
            InputReader.llllIIIIl[3] = " ".length();
            InputReader.llllIIIIl[4] = 0xDF ^ 0xB8 ^ (0x83 ^ 0xA6) << " ".length();
            InputReader.llllIIIIl[5] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            InputReader.llllIIIIl[6] = 0x50 ^ 0x69;
            InputReader.llllIIIIl[7] = (0xF ^ 0xA) << " ".length();
            InputReader.llllIIIIl[8] = " ".length() << (27 + 151 - 34 + 13 ^ (0x20 ^ 0x33) << "   ".length());
            InputReader.llllIIIIl[9] = 102 + 33 - 17 + 17 ^ (0xC4 ^ 0x81) << " ".length();
            InputReader.llllIIIIl[10] = 144 + 165 - 265 + 139 ^ (0x9D ^ 0xC2) << " ".length();
            InputReader.llllIIIIl[11] = (35 + 140 - -28 + 8 ^ (0xF1 ^ 0xC0) << (" ".length() << " ".length())) << " ".length();
            InputReader.llllIIIIl[12] = (0x49 ^ 0x5C) << (" ".length() << " ".length()) ^ (0x5B ^ 0x6A);
            InputReader.llllIIIIl[13] = 0xD3 ^ 0x96;
        }

        private static boolean lIlIIlIlll(int n, int n2) {
            return n == n2;
        }

        private static boolean IllIIlIlll(int n, int n2) {
            return n >= n2;
        }

        private static boolean llIlIlIlll(int n, int n2) {
            return n > n2;
        }

        private static boolean IIllIlIlll(Object object) {
            return object != null;
        }

        private static boolean IlIlIlIlll(int n) {
            return n != 0;
        }

        private static boolean IlllIlIlll(int n) {
            return n == 0;
        }

        private static boolean IIIlIlIlll(int n) {
            return n <= 0;
        }

        private static boolean lIllIlIlll(int n, int n2) {
            return n != n2;
        }

        public static interface SpaceCharFilter {
            public boolean isSpaceChar(int var1);
        }
    }

    static class OutputWriter {
        private final PrintWriter writer;
        private static int[] lIIIlIIIl;

        public OutputWriter(OutputStream IIlllllIIlIlll) {
            OutputWriter lIlllllIIlIlll;
            lIlllllIIlIlll.writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(IIlllllIIlIlll)));
        }

        public OutputWriter(Writer IIIllllIIlIlll) {
            OutputWriter lIIllllIIlIlll;
            lIIllllIIlIlll.writer = new PrintWriter(IIIllllIIlIlll);
        }

        public void print(Object ... llIIlllIIlIlll) {
            int IlIIlllIIlIlll = lIIIlIIIl[0];
            while (OutputWriter.lIIIIlIlll(IlIIlllIIlIlll, llIIlllIIlIlll.length)) {
                OutputWriter IIlIlllIIlIlll;
                if (OutputWriter.IlIIIlIlll(IlIIlllIIlIlll)) {
                    IIlIlllIIlIlll.writer.print(lIIIlIIIl[1]);
                }
                IIlIlllIIlIlll.writer.print(llIIlllIIlIlll[IlIIlllIIlIlll]);
                ++IlIIlllIIlIlll;
                "".length();
                if (" ".length() == " ".length()) continue;
                return;
            }
        }

        public void printLine(Object ... llIlIllIIlIlll) {
            OutputWriter IIllIllIIlIlll;
            IIllIllIIlIlll.print(llIlIllIIlIlll);
            IIllIllIIlIlll.writer.println();
        }

        public void close() {
            OutputWriter IIIlIllIIlIlll;
            IIIlIllIIlIlll.writer.close();
        }

        static {
            OutputWriter.IIIIIlIlll();
        }

        private static void IIIIIlIlll() {
            lIIIlIIIl = new int[2];
            OutputWriter.lIIIlIIIl[0] = (0x48 ^ 7 ^ (0x8D ^ 0xAE) << " ".length()) << "   ".length() & ((59 + 31 - 88 + 173 ^ (0x59 ^ 0xA) << " ".length()) << "   ".length() ^ -" ".length());
            OutputWriter.lIIIlIIIl[1] = " ".length() << ((0xC2 ^ 0x95) << " ".length() ^ 33 + 136 - 79 + 81);
        }

        private static boolean lIIIIlIlll(int n, int n2) {
            return n < n2;
        }

        private static boolean IlIIIlIlll(int n) {
            return n != 0;
        }
    }

    static class CAlchemist {
        private static int[] llIIlIIIl;

        CAlchemist() {
            CAlchemist IIIIlllIIlIlll;
        }

        public void solve(int n, InputReader lIIllIlIIlIlll, OutputWriter IIIllIlIIlIlll) {
            int lllIlIlIIlIlll = lIIllIlIIlIlll.readInt();
            double[] IllIlIlIIlIlll = new double[lllIlIlIIlIlll];
            int lIlIlIlIIlIlll22 = llIIlIIIl[0];
            while (CAlchemist.lllIIlIlll(lIlIlIlIIlIlll22, lllIlIlIIlIlll)) {
                IllIlIlIIlIlll[lIlIlIlIIlIlll22] = lIIllIlIIlIlll.readDouble();
                ++lIlIlIlIIlIlll22;
                "".length();
                if (" ".length() != 0) continue;
                return;
            }
            Arrays.sort(IllIlIlIIlIlll);
            double lIlIlIlIIlIlll22 = (IllIlIlIIlIlll[llIIlIIIl[0]] + IllIlIlIIlIlll[llIIlIIIl[1]]) / 2.0;
            int IIlIlIlIIlIlll = llIIlIIIl[2];
            while (CAlchemist.lllIIlIlll(IIlIlIlIIlIlll, lllIlIlIIlIlll)) {
                IllIlIlIIlIlll[IIlIlIlIIlIlll] = lIlIlIlIIlIlll22 = (lIlIlIlIIlIlll22 + IllIlIlIIlIlll[IIlIlIlIIlIlll]) / 2.0;
                ++IIlIlIlIIlIlll;
                "".length();
                if ("   ".length() < " ".length() << (" ".length() << " ".length())) continue;
                return;
            }
            Object[] objectArray = new Object[llIIlIIIl[1]];
            objectArray[CAlchemist.llIIlIIIl[0]] = lIlIlIlIIlIlll22;
            IIIllIlIIlIlll.printLine(objectArray);
        }

        static {
            CAlchemist.IIlIIlIlll();
        }

        private static void IIlIIlIlll() {
            llIIlIIIl = new int[3];
            CAlchemist.llIIlIIIl[0] = (0x32 ^ 0x53 ^ (0x7B ^ 0x46) << " ".length()) << " ".length() & (((0x8C ^ 0x9D) << "   ".length() ^ 132 + 118 - 169 + 66) << " ".length() ^ -" ".length());
            CAlchemist.llIIlIIIl[1] = " ".length();
            CAlchemist.llIIlIIIl[2] = " ".length() << " ".length();
        }

        private static boolean lllIIlIlll(int n, int n2) {
            return n < n2;
        }
    }
}

