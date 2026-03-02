/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
    static IO io;
    private static int[] lIIlIIlIl;

    public Main() {
        Main llIIlIlIIIlIll;
    }

    public static void main(String[] stringArray) {
        int llllIIlIIIlIll = io.nextInt();
        double IlllIIlIIIlIll = 100000.0;
        int lIllIIlIIIlIll = lIIlIIlIl[0];
        while (Main.IIIlIllIIIl(lIllIIlIIIlIll, llllIIlIIIlIll)) {
            IlllIIlIIIlIll = Math.ceil((IlllIIlIIIlIll + IlllIIlIIIlIll * 0.05) / 1000.0) * 1000.0;
            ++lIllIIlIIIlIll;
            "".length();
            if (-" ".length() < " ".length()) continue;
            return;
        }
        System.out.println((int)IlllIIlIIIlIll);
    }

    static {
        Main.lllIIllIIIl();
        io = new IO();
    }

    private static void lllIIllIIIl() {
        lIIlIIlIl = new int[1];
        Main.lIIlIIlIl[0] = (" ".length() << (0xC3 ^ 0xC6) ^ (0x57 ^ 0x7E)) & (0xBA ^ 0xC1 ^ (0x5B ^ 0x62) << " ".length() ^ -" ".length());
    }

    private static boolean IIIlIllIIIl(int n, int n2) {
        return n < n2;
    }

    static class IO
    extends PrintWriter {
        private final InputStream in;
        private final byte[] buffer = new byte[lllIIIlIl[0]];
        private int ptr = lllIIIlIl[1];
        private int buflen = lllIIIlIl[1];
        private static int[] lllIIIlIl;

        IO() {
            llIIlIIlIIlIll(System.in);
            IO llIIlIIlIIlIll;
        }

        IO(InputStream llllIIIlIIlIll) {
            super(System.out);
            IO IIIIlIIlIIlIll;
            IIIIlIIlIIlIll.in = llllIIIlIIlIll;
        }

        boolean hasNextByte() {
            IO IIllIIIlIIlIll;
            if (IO.IIlllIlIIIl(IIllIIIlIIlIll.ptr, IIllIIIlIIlIll.buflen)) {
                return lllIIIlIl[2];
            }
            IIllIIIlIIlIll.ptr = lllIIIlIl[1];
            try {
                IIllIIIlIIlIll.buflen = IIllIIIlIIlIll.in.read(IIllIIIlIIlIll.buffer);
                "".length();
            }
            catch (IOException llIlIIIlIIlIll) {
                llIlIIIlIIlIll.printStackTrace();
            }
            if (-" ".length() >= " ".length() << " ".length()) {
                return ("   ".length() & ("   ".length() ^ -" ".length())) != 0;
            }
            if (IO.lIlllIlIIIl(IIllIIIlIIlIll.buflen)) {
                return lllIIIlIl[1];
            }
            return lllIIIlIl[2];
        }

        int readByte() {
            IO lIIlIIIlIIlIll;
            if (IO.IllllIlIIIl(lIIlIIIlIIlIll.hasNextByte() ? 1 : 0)) {
                int n = lIIlIIIlIIlIll.ptr;
                lIIlIIIlIIlIll.ptr = n + lllIIIlIl[2];
                return lIIlIIIlIIlIll.buffer[n];
            }
            return lllIIIlIl[3];
        }

        boolean isPrintableChar(int lllIIIIlIIlIll) {
            int n;
            if (IO.lllllIlIIIl(lllIIIlIl[4], lllIIIIlIIlIll) && IO.lllllIlIIIl(lllIIIIlIIlIll, lllIIIlIl[5])) {
                n = lllIIIlIl[2];
                "".length();
                if (null != null) {
                    return ((0x2F ^ 0x64) & ~(0x50 ^ 0x1B)) != 0;
                }
            } else {
                n = lllIIIlIl[1];
            }
            return n != 0;
        }

        void skipUnprintable() {
            IO lIlIIIIlIIlIll;
            while (IO.IllllIlIIIl(lIlIIIIlIIlIll.hasNextByte() ? 1 : 0) && IO.IIIIIllIIIl(lIlIIIIlIIlIll.isPrintableChar(lIlIIIIlIIlIll.buffer[lIlIIIIlIIlIll.ptr]) ? 1 : 0)) {
                lIlIIIIlIIlIll.ptr += lllIIIlIl[2];
                "".length();
                if (null == null) continue;
                return;
            }
        }

        boolean hasNext() {
            IO llIIIIIlIIlIll;
            llIIIIIlIIlIll.skipUnprintable();
            return this.hasNextByte();
        }

        long nextLong() {
            IO IllllllIIIlIll;
            if (IO.IIIIIllIIIl(IllllllIIIlIll.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            long lIlllllIIIlIll = 0L;
            int IIlllllIIIlIll = lllIIIlIl[1];
            int llIllllIIIlIll = IllllllIIIlIll.readByte();
            if (IO.lIIIIllIIIl(llIllllIIIlIll, lllIIIlIl[6])) {
                IIlllllIIIlIll = lllIIIlIl[2];
                llIllllIIIlIll = IllllllIIIlIll.readByte();
            }
            if (!IO.IlIIIllIIIl(llIllllIIIlIll, lllIIIlIl[7]) || IO.IIlllIlIIIl(lllIIIlIl[8], llIllllIIIlIll)) {
                throw new NumberFormatException();
            }
            do {
                if (IO.lllllIlIIIl(lllIIIlIl[7], llIllllIIIlIll) && IO.lllllIlIIIl(llIllllIIIlIll, lllIIIlIl[8])) {
                    lIlllllIIIlIll *= 10L;
                    lIlllllIIIlIll += (long)(llIllllIIIlIll - lllIIIlIl[7]);
                    "".length();
                    if (" ".length() << " ".length() <= ((100 + 125 - 113 + 23 ^ (0x54 ^ 0x13) << " ".length()) << (" ".length() << " ".length()) & (((0xF7 ^ 0xB8) << " ".length() ^ 82 + 69 - 96 + 96) << (" ".length() << " ".length()) ^ -" ".length()))) {
                        return 0L;
                    }
                } else {
                    if (!IO.llIIIllIIIl(llIllllIIIlIll, lllIIIlIl[3]) || IO.IIIIIllIIIl(IllllllIIIlIll.isPrintableChar(llIllllIIIlIll) ? 1 : 0)) {
                        long l;
                        if (IO.IllllIlIIIl(IIlllllIIIlIll)) {
                            l = -lIlllllIIIlIll;
                            "".length();
                            if ("   ".length() != "   ".length()) {
                                return 0L;
                            }
                        } else {
                            l = lIlllllIIIlIll;
                        }
                        return l;
                    }
                    throw new NumberFormatException();
                }
                int n = this.readByte();
                "".length();
            } while (-" ".length() < "   ".length());
            return 0L;
        }

        /*
         * WARNING - void declaration
         */
        int nextInt() {
            void var1_1;
            IO IIIllllIIIlIll;
            long lllIlllIIIlIll = IIIllllIIIlIll.nextLong();
            if (!IO.lIlIIllIIIl(IO.IIlIIllIIIl(lllIlllIIIlIll, Integer.MIN_VALUE)) || IO.IllIIllIIIl(IO.IIlIIllIIIl(lllIlllIIIlIll, Integer.MAX_VALUE))) {
                throw new NumberFormatException();
            }
            return (int)var1_1;
        }

        @Override
        public void close() {
            IO IIlIlllIIIlIll;
            super.close();
            try {
                IIlIlllIIIlIll.in.close();
                "".length();
            }
            catch (IOException iOException) {
                // empty catch block
            }
            if (-(0x74 ^ 0x70) >= 0) {
                return;
            }
        }

        static {
            IO.llIllIlIIIl();
        }

        private static void llIllIlIIIl() {
            lllIIIlIl = new int[9];
            IO.lllIIIlIl[0] = " ".length() << ((0xE ^ 0xB) << " ".length());
            IO.lllIIIlIl[1] = " ".length() << " ".length() & ~(" ".length() << " ".length());
            IO.lllIIIlIl[2] = " ".length();
            IO.lllIIIlIl[3] = -" ".length();
            IO.lllIIIlIl[4] = 0xC ^ 0x2D;
            IO.lllIIIlIl[5] = (0x13 ^ 0x2C) << " ".length();
            IO.lllIIIlIl[6] = 0x7A ^ 0x57;
            IO.lllIIIlIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            IO.lllIIIlIl[8] = (0xE ^ 0x21) << (" ".length() << " ".length()) ^ 26 + 19 - -37 + 51;
        }

        private static boolean lIIIIllIIIl(int n, int n2) {
            return n == n2;
        }

        private static boolean IlIIIllIIIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean IIlllIlIIIl(int n, int n2) {
            return n < n2;
        }

        private static boolean lllllIlIIIl(int n, int n2) {
            return n <= n2;
        }

        private static boolean IllllIlIIIl(int n) {
            return n != 0;
        }

        private static boolean IIIIIllIIIl(int n) {
            return n == 0;
        }

        private static boolean lIlIIllIIIl(int n) {
            return n >= 0;
        }

        private static boolean lIlllIlIIIl(int n) {
            return n <= 0;
        }

        private static boolean IllIIllIIIl(int n) {
            return n > 0;
        }

        private static boolean llIIIllIIIl(int n, int n2) {
            return n != n2;
        }

        private static int IIlIIllIIIl(long l, long l2) {
            return l == l2 ? 0 : (l < l2 ? -1 : 1);
        }
    }
}

