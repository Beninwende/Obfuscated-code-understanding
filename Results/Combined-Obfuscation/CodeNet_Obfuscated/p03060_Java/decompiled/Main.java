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
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;

public class Main {
    private static int[] IlIllIIIl;

    public Main() {
        Main IIIIlIlllIIlll;
    }

    private static double round(double IIllIIlllIIlll, int llIlIIlllIIlll) {
        if (Main.lIIlllIlll(llIlIIlllIIlll)) {
            throw new IllegalArgumentException();
        }
        BigDecimal IlIlIIlllIIlll = new BigDecimal(Double.toString(IIllIIlllIIlll));
        BigDecimal bigDecimal = IlIlIIlllIIlll.setScale(llIlIIlllIIlll, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    public static void main(String[] stringArray) {
        InputReader IlIIIIlllIIlll = new InputReader(System.in);
        OutputWriter lIIIIIlllIIlll = new OutputWriter(System.out);
        int IIIIIIlllIIlll = IlIIIIlllIIlll.readInt();
        int[] llllllIllIIlll = new int[IIIIIIlllIIlll];
        int[] IlllllIllIIlll = new int[IIIIIIlllIIlll];
        int lIllllIllIIlll22 = IlIllIIIl[0];
        while (Main.IlIlllIlll(lIllllIllIIlll22, IIIIIIlllIIlll)) {
            llllllIllIIlll[lIllllIllIIlll22] = IlIIIIlllIIlll.readInt();
            ++lIllllIllIIlll22;
            "".length();
            if (("   ".length() << " ".length() & ~("   ".length() << " ".length())) < "   ".length()) continue;
            return;
        }
        lIllllIllIIlll22 = IlIllIIIl[0];
        while (Main.IlIlllIlll(lIllllIllIIlll22, IIIIIIlllIIlll)) {
            IlllllIllIIlll[lIllllIllIIlll22] = IlIIIIlllIIlll.readInt();
            ++lIllllIllIIlll22;
            "".length();
            if (null == null) continue;
            return;
        }
        long lIllllIllIIlll22 = 0L;
        int IIllllIllIIlll = IlIllIIIl[0];
        while (Main.IlIlllIlll(IIllllIllIIlll, IIIIIIlllIIlll)) {
            if (Main.llIlllIlll(llllllIllIIlll[IIllllIllIIlll], IlllllIllIIlll[IIllllIllIIlll])) {
                lIllllIllIIlll22 += (long)(llllllIllIIlll[IIllllIllIIlll] - IlllllIllIIlll[IIllllIllIIlll]);
            }
            ++IIllllIllIIlll;
            "".length();
            if (-((0xF ^ 0x10) << " ".length() ^ (0x3A ^ 0x27) << " ".length()) <= 0) continue;
            return;
        }
        Object[] objectArray = new Object[IlIllIIIl[1]];
        objectArray[Main.IlIllIIIl[0]] = lIllllIllIIlll22;
        lIIIIIlllIIlll.printLine(objectArray);
    }

    static {
        Main.IIIlllIlll();
    }

    private static void IIIlllIlll() {
        IlIllIIIl = new int[2];
        Main.IlIllIIIl[0] = (0 ^ 5) << (" ".length() << " ".length()) & ~((0xB9 ^ 0xBC) << (" ".length() << " ".length()));
        Main.IlIllIIIl[1] = " ".length();
    }

    private static boolean IlIlllIlll(int n, int n2) {
        return n < n2;
    }

    private static boolean llIlllIlll(int n, int n2) {
        return n > n2;
    }

    private static boolean lIIlllIlll(int n) {
        return n < 0;
    }

    private static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[IIIllIIIl[0]];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private static int[] IIIllIIIl;

        public InputReader(InputStream IIlIlIIIIlIlll) {
            InputReader lIlIlIIIIlIlll;
            lIlIlIIIIlIlll.stream = IIlIlIIIIlIlll;
        }

        public int read() {
            block5: {
                InputReader lIIIlIIIIlIlll;
                if (InputReader.IIIIllIlll(lIIIlIIIIlIlll.numChars, IIIllIIIl[1])) {
                    throw new InputMismatchException();
                }
                if (!InputReader.lIIIllIlll(lIIIlIIIIlIlll.curChar, lIIIlIIIIlIlll.numChars)) break block5;
                lIIIlIIIIlIlll.curChar = IIIllIIIl[2];
                try {
                    lIIIlIIIIlIlll.numChars = lIIIlIIIIlIlll.stream.read(lIIIlIIIIlIlll.buf);
                    "".length();
                }
                catch (IOException IIIIlIIIIlIlll) {
                    throw new InputMismatchException();
                }
                if (((1 ^ 0x30) & ~(0xF3 ^ 0xC2)) != 0) {
                    return (0x40 ^ 0x57) << (" ".length() << " ".length()) & ~((0x69 ^ 0x7E) << (" ".length() << " ".length()));
                }
                if (InputReader.IlIIllIlll(lIIIlIIIIlIlll.numChars)) {
                    return IIIllIIIl[1];
                }
            }
            int n = this.curChar;
            this.curChar = n + IIIllIIIl[3];
            return this.buf[n];
        }

        /*
         * WARNING - void declaration
         */
        public int readInt() {
            void var2_2;
            void var3_3;
            InputReader llIlIIIIIlIlll;
            int IlIlIIIIIlIlll = llIlIIIIIlIlll.read();
            while (InputReader.llIIllIlll(llIlIIIIIlIlll.isSpaceChar(IlIlIIIIIlIlll) ? 1 : 0)) {
                IlIlIIIIIlIlll = llIlIIIIIlIlll.read();
                "".length();
                if (null == null) continue;
                return (0x9C ^ 0x95) << "   ".length() & ~((0x62 ^ 0x6B) << "   ".length());
            }
            int lIIlIIIIIlIlll = IIIllIIIl[3];
            if (InputReader.IIIIllIlll(IlIlIIIIIlIlll, IIIllIIIl[4])) {
                lIIlIIIIIlIlll = IIIllIIIl[1];
                IlIlIIIIIlIlll = llIlIIIIIlIlll.read();
            }
            int IIIlIIIIIlIlll = IIIllIIIl[2];
            do {
                if (!InputReader.lIIIllIlll(IlIlIIIIIlIlll, IIIllIIIl[5]) || InputReader.IIlIllIlll(IlIlIIIIIlIlll, IIIllIIIl[6])) {
                    throw new InputMismatchException();
                }
                IIIlIIIIIlIlll *= IIIllIIIl[7];
                IIIlIIIIIlIlll += IlIlIIIIIlIlll - IIIllIIIl[5];
            } while (!InputReader.llIIllIlll(llIlIIIIIlIlll.isSpaceChar(IlIlIIIIIlIlll = llIlIIIIIlIlll.read()) ? 1 : 0));
            return (int)(var3_3 * var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public String readString() {
            void var2_2;
            InputReader IIlIIIIIIlIlll;
            int llIIIIIIIlIlll = IIlIIIIIIlIlll.read();
            while (InputReader.llIIllIlll(IIlIIIIIIlIlll.isSpaceChar(llIIIIIIIlIlll) ? 1 : 0)) {
                llIIIIIIIlIlll = IIlIIIIIIlIlll.read();
                "".length();
                if (" ".length() << (" ".length() << " ".length()) > 0) continue;
                return null;
            }
            StringBuilder IlIIIIIIIlIlll = new StringBuilder();
            do {
                IlIIIIIIIlIlll.appendCodePoint(llIIIIIIIlIlll);
                "".length();
            } while (!InputReader.llIIllIlll(IIlIIIIIIlIlll.isSpaceChar(llIIIIIIIlIlll = IIlIIIIIIlIlll.read()) ? 1 : 0));
            return String.valueOf(var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public double readDouble() {
            void var2_2;
            void var3_3;
            InputReader IIlllllllIIlll;
            int llIllllllIIlll = IIlllllllIIlll.read();
            while (InputReader.llIIllIlll(IIlllllllIIlll.isSpaceChar(llIllllllIIlll) ? 1 : 0)) {
                llIllllllIIlll = IIlllllllIIlll.read();
                "".length();
                if (-" ".length() <= -" ".length()) continue;
                return 0.0;
            }
            int IlIllllllIIlll = IIIllIIIl[3];
            if (InputReader.IIIIllIlll(llIllllllIIlll, IIIllIIIl[4])) {
                IlIllllllIIlll = IIIllIIIl[1];
                llIllllllIIlll = IIlllllllIIlll.read();
            }
            double lIIllllllIIlll = 0.0;
            while (InputReader.lIlIllIlll(IIlllllllIIlll.isSpaceChar(llIllllllIIlll) ? 1 : 0) && InputReader.IllIllIlll(llIllllllIIlll, IIIllIIIl[8])) {
                if (!InputReader.IllIllIlll(llIllllllIIlll, IIIllIIIl[9]) || InputReader.IIIIllIlll(llIllllllIIlll, IIIllIIIl[10])) {
                    return lIIllllllIIlll * Math.pow(10.0, IIlllllllIIlll.readInt());
                }
                if (!InputReader.lIIIllIlll(llIllllllIIlll, IIIllIIIl[5]) || InputReader.IIlIllIlll(llIllllllIIlll, IIIllIIIl[6])) {
                    throw new InputMismatchException();
                }
                lIIllllllIIlll *= 10.0;
                lIIllllllIIlll += (double)(llIllllllIIlll - IIIllIIIl[5]);
                llIllllllIIlll = IIlllllllIIlll.read();
                "".length();
                if (null == null) continue;
                return 0.0;
            }
            if (InputReader.IIIIllIlll(llIllllllIIlll, IIIllIIIl[8])) {
                llIllllllIIlll = IIlllllllIIlll.read();
                double IIIllllllIIlll = 1.0;
                while (InputReader.lIlIllIlll(IIlllllllIIlll.isSpaceChar(llIllllllIIlll) ? 1 : 0)) {
                    if (!InputReader.IllIllIlll(llIllllllIIlll, IIIllIIIl[9]) || InputReader.IIIIllIlll(llIllllllIIlll, IIIllIIIl[10])) {
                        return lIIllllllIIlll * Math.pow(10.0, IIlllllllIIlll.readInt());
                    }
                    if (!InputReader.lIIIllIlll(llIllllllIIlll, IIIllIIIl[5]) || InputReader.IIlIllIlll(llIllllllIIlll, IIIllIIIl[6])) {
                        throw new InputMismatchException();
                    }
                    lIIllllllIIlll += (double)(llIllllllIIlll - IIIllIIIl[5]) * (IIIllllllIIlll /= 10.0);
                    llIllllllIIlll = IIlllllllIIlll.read();
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
        public long readLong() {
            void var2_2;
            void var3_3;
            InputReader llIIlllllIIlll;
            int IlIIlllllIIlll = llIIlllllIIlll.read();
            while (InputReader.llIIllIlll(llIIlllllIIlll.isSpaceChar(IlIIlllllIIlll) ? 1 : 0)) {
                IlIIlllllIIlll = llIIlllllIIlll.read();
                "".length();
                if (((0xC ^ 0x49) & ~(0x83 ^ 0xC6)) == 0) continue;
                return 0L;
            }
            int lIIIlllllIIlll = IIIllIIIl[3];
            if (InputReader.IIIIllIlll(IlIIlllllIIlll, IIIllIIIl[4])) {
                lIIIlllllIIlll = IIIllIIIl[1];
                IlIIlllllIIlll = llIIlllllIIlll.read();
            }
            long IIIIlllllIIlll = 0L;
            do {
                if (!InputReader.lIIIllIlll(IlIIlllllIIlll, IIIllIIIl[5]) || InputReader.IIlIllIlll(IlIIlllllIIlll, IIIllIIIl[6])) {
                    throw new InputMismatchException();
                }
                IIIIlllllIIlll *= 10L;
                IIIIlllllIIlll += (long)(IlIIlllllIIlll - IIIllIIIl[5]);
            } while (!InputReader.llIIllIlll(llIIlllllIIlll.isSpaceChar(IlIIlllllIIlll = llIIlllllIIlll.read()) ? 1 : 0));
            return (long)(var3_3 * (long)var2_2);
        }

        public boolean isSpaceChar(int IIllIllllIIlll) {
            int n;
            InputReader lIllIllllIIlll;
            if (InputReader.lllIllIlll(lIllIllllIIlll.filter)) {
                return lIllIllllIIlll.filter.isSpaceChar(IIllIllllIIlll);
            }
            if (!(InputReader.IllIllIlll(IIllIllllIIlll, IIIllIIIl[11]) && InputReader.IllIllIlll(IIllIllllIIlll, IIIllIIIl[7]) && InputReader.IllIllIlll(IIllIllllIIlll, IIIllIIIl[12]) && InputReader.IllIllIlll(IIllIllllIIlll, IIIllIIIl[13]) && !InputReader.IIIIllIlll(IIllIllllIIlll, IIIllIIIl[1]))) {
                n = IIIllIIIl[3];
                "".length();
                if (-"   ".length() > 0) {
                    return ((4 + 32 - -114 + 9 ^ (0xF9 ^ 0xB2) << " ".length()) & ((0x3B ^ 0x32) << "   ".length() ^ (0xE5 ^ 0xA4) ^ -" ".length())) != 0;
                }
            } else {
                n = IIIllIIIl[2];
            }
            return n != 0;
        }

        public String next() {
            InputReader IlIlIllllIIlll;
            return IlIlIllllIIlll.readString();
        }

        static {
            InputReader.llllIlIlll();
        }

        private static void llllIlIlll() {
            IIIllIIIl = new int[14];
            InputReader.IIIllIIIl[0] = " ".length() << ((0x9E ^ 0x99 ^ " ".length() << " ".length()) << " ".length());
            InputReader.IIIllIIIl[1] = -" ".length();
            InputReader.IIIllIIIl[2] = (0xB ^ 0xE) << (" ".length() << " ".length()) & ~((0x48 ^ 0x4D) << (" ".length() << " ".length()));
            InputReader.IIIllIIIl[3] = " ".length();
            InputReader.IIIllIIIl[4] = 105 + 99 - 143 + 74 ^ (0x7C ^ 0x29) << " ".length();
            InputReader.IIIllIIIl[5] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            InputReader.IIIllIIIl[6] = 0x1F ^ 0x26;
            InputReader.IIIllIIIl[7] = ((0xA ^ 0x3D) << " ".length() ^ (0x34 ^ 0x5F)) << " ".length();
            InputReader.IIIllIIIl[8] = (0xB5 ^ 0xA2) << " ".length();
            InputReader.IIIllIIIl[9] = 0xEC ^ 0x89;
            InputReader.IIIllIIIl[10] = 0xB ^ 0x4E;
            InputReader.IIIllIIIl[11] = " ".length() << (0x1F ^ 0x1A);
            InputReader.IIIllIIIl[12] = 0x2E ^ 0x23;
            InputReader.IIIllIIIl[13] = (0x16 ^ 3) << (" ".length() << " ".length()) ^ (0x6C ^ 0x31);
        }

        private static boolean IIIIllIlll(int n, int n2) {
            return n == n2;
        }

        private static boolean lIIIllIlll(int n, int n2) {
            return n >= n2;
        }

        private static boolean IIlIllIlll(int n, int n2) {
            return n > n2;
        }

        private static boolean lllIllIlll(Object object) {
            return object != null;
        }

        private static boolean llIIllIlll(int n) {
            return n != 0;
        }

        private static boolean lIlIllIlll(int n) {
            return n == 0;
        }

        private static boolean IlIIllIlll(int n) {
            return n <= 0;
        }

        private static boolean IllIllIlll(int n, int n2) {
            return n != n2;
        }

        public static interface SpaceCharFilter {
            public boolean isSpaceChar(int var1);
        }
    }

    private static class OutputWriter {
        private final PrintWriter writer;
        private static int[] IIlllIIIl;

        public OutputWriter(OutputStream IlllIlIllIIlll) {
            OutputWriter llllIlIllIIlll;
            llllIlIllIIlll.writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(IlllIlIllIIlll)));
        }

        public OutputWriter(Writer IlIlIlIllIIlll) {
            OutputWriter llIlIlIllIIlll;
            llIlIlIllIIlll.writer = new PrintWriter(IlIlIlIllIIlll);
        }

        public void print(Object ... lIlIIlIllIIlll) {
            OutputWriter IllIIlIllIIlll;
            int IIlIIlIllIIlll = IIlllIIIl[0];
            while (OutputWriter.lIllllIlll(IIlIIlIllIIlll, lIlIIlIllIIlll.length)) {
                if (OutputWriter.IlllllIlll(IIlIIlIllIIlll)) {
                    IllIIlIllIIlll.writer.print(IIlllIIIl[1]);
                }
                IllIIlIllIIlll.writer.print(lIlIIlIllIIlll[IIlIIlIllIIlll]);
                ++IIlIIlIllIIlll;
                "".length();
                if (null == null) continue;
                return;
            }
            IllIIlIllIIlll.writer.flush();
        }

        public void printLine(Object ... IIIIIlIllIIlll) {
            OutputWriter lIIIIlIllIIlll;
            lIIIIlIllIIlll.print(IIIIIlIllIIlll);
            lIIIIlIllIIlll.writer.println();
            lIIIIlIllIIlll.writer.flush();
        }

        public void close() {
            OutputWriter IllllIIllIIlll;
            IllllIIllIIlll.writer.close();
        }

        public void flush() {
            OutputWriter IIlllIIllIIlll;
            IIlllIIllIIlll.writer.flush();
        }

        static {
            OutputWriter.IIllllIlll();
        }

        private static void IIllllIlll() {
            IIlllIIIl = new int[2];
            OutputWriter.IIlllIIIl[0] = ((0x14 ^ 3) << (" ".length() << " ".length()) ^ (0x76 ^ 0x39)) << (" ".length() << " ".length()) & (((0x9E ^ 0x81) << " ".length() ^ (0x97 ^ 0xBA)) << (" ".length() << " ".length()) ^ -" ".length());
            OutputWriter.IIlllIIIl[1] = " ".length() << (0x55 ^ 0x50);
        }

        private static boolean lIllllIlll(int n, int n2) {
            return n < n2;
        }

        private static boolean IlllllIlll(int n) {
            return n != 0;
        }
    }
}

