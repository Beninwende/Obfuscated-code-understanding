/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.NoSuchElementException;

public class Main {
    private static int[] lIIIIlIll;

    public Main() {
        Main IIIIIlIIIIIlIl;
    }

    public static void main(String[] stringArray) {
        InputStream IlIllIIIIIIlIl = System.in;
        PrintStream lIIllIIIIIIlIl = System.out;
        FastScanner IIIllIIIIIIlIl = new FastScanner(IlIllIIIIIIlIl);
        PrintWriter lllIlIIIIIIlIl = new PrintWriter(lIIllIIIIIIlIl);
        BKagamiMochi IllIlIIIIIIlIl = new BKagamiMochi();
        IllIlIIIIIIlIl.solve(lIIIIlIll[0], IIIllIIIIIIlIl, lllIlIIIIIIlIl);
        lllIlIIIIIIlIl.close();
    }

    static {
        Main.IlllIIlllIl();
    }

    private static void IlllIIlllIl() {
        lIIIIlIll = new int[1];
        Main.lIIIIlIll[0] = " ".length();
    }

    static class FastScanner
    implements Closeable {
        private final InputStream in;
        private final byte[] buffer = new byte[lIlIIlIll[0]];
        private int ptr = lIlIIlIll[1];
        private int buflen = lIlIIlIll[1];
        private static int[] lIlIIlIll;

        public FastScanner(InputStream IlIIIIIIIIIlIl) {
            FastScanner llIIIIIIIIIlIl;
            llIIIIIIIIIlIl.in = IlIIIIIIIIIlIl;
        }

        private boolean hasNextByte() {
            FastScanner lllllllllllIIl;
            if (FastScanner.IlIIlIlllIl(lllllllllllIIl.ptr, lllllllllllIIl.buflen)) {
                return lIlIIlIll[2];
            }
            lllllllllllIIl.ptr = lIlIIlIll[1];
            try {
                lllllllllllIIl.buflen = lllllllllllIIl.in.read(lllllllllllIIl.buffer);
                "".length();
            }
            catch (IOException IllllllllllIIl) {
                IllllllllllIIl.printStackTrace();
            }
            if (" ".length() << (" ".length() << " ".length()) < 0) {
                return ((8 + 106 - 28 + 131 ^ "   ".length() << ("   ".length() << " ".length())) << " ".length() & (((0x4A ^ 0x4D) << " ".length() ^ (0xA5 ^ 0xB2)) << " ".length() ^ -" ".length())) != 0;
            }
            if (FastScanner.llIIlIlllIl(lllllllllllIIl.buflen)) {
                return lIlIIlIll[1];
            }
            return lIlIIlIll[2];
        }

        private int readByte() {
            FastScanner IIlllllllllIIl;
            if (FastScanner.IIlIlIlllIl(IIlllllllllIIl.hasNextByte() ? 1 : 0)) {
                int n = IIlllllllllIIl.ptr;
                IIlllllllllIIl.ptr = n + lIlIIlIll[2];
                return IIlllllllllIIl.buffer[n];
            }
            return lIlIIlIll[3];
        }

        private static boolean isPrintableChar(int IlIllllllllIIl) {
            int n;
            if (FastScanner.lIlIlIlllIl(lIlIIlIll[4], IlIllllllllIIl) && FastScanner.lIlIlIlllIl(IlIllllllllIIl, lIlIIlIll[5])) {
                n = lIlIIlIll[2];
                "".length();
                if (null != null) {
                    return ((40 + 86 - 78 + 151 ^ " ".length() << (0x6A ^ 0x6D)) & (" ".length() << (" ".length() << " ".length()) ^ (0xD ^ 0x4E) ^ -" ".length())) != 0;
                }
            } else {
                n = lIlIIlIll[1];
            }
            return n != 0;
        }

        public boolean hasNext() {
            FastScanner IIIllllllllIIl;
            while (FastScanner.IIlIlIlllIl(IIIllllllllIIl.hasNextByte() ? 1 : 0) && FastScanner.IllIlIlllIl(FastScanner.isPrintableChar(IIIllllllllIIl.buffer[IIIllllllllIIl.ptr]) ? 1 : 0)) {
                IIIllllllllIIl.ptr += lIlIIlIll[2];
                "".length();
                if (null == null) continue;
                return ((0x6E ^ 0x2F ^ (0x2D ^ 0xE) << " ".length()) << (" ".length() << " ".length()) & ((9 ^ 0x1A ^ (0x4B ^ 0x4E) << (" ".length() << " ".length())) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
            }
            return this.hasNextByte();
        }

        public long nextLong() {
            FastScanner llIIlllllllIIl;
            if (FastScanner.IllIlIlllIl(llIIlllllllIIl.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            long IlIIlllllllIIl = 0L;
            int lIIIlllllllIIl = lIlIIlIll[1];
            int IIIIlllllllIIl = llIIlllllllIIl.readByte();
            if (FastScanner.lllIlIlllIl(IIIIlllllllIIl, lIlIIlIll[6])) {
                lIIIlllllllIIl = lIlIIlIll[2];
                IIIIlllllllIIl = llIIlllllllIIl.readByte();
            }
            if (!FastScanner.IIIllIlllIl(IIIIlllllllIIl, lIlIIlIll[7]) || FastScanner.IlIIlIlllIl(lIlIIlIll[8], IIIIlllllllIIl)) {
                throw new NumberFormatException();
            }
            do {
                if (FastScanner.lIlIlIlllIl(lIlIIlIll[7], IIIIlllllllIIl) && FastScanner.lIlIlIlllIl(IIIIlllllllIIl, lIlIIlIll[8])) {
                    IlIIlllllllIIl *= 10L;
                    IlIIlllllllIIl += (long)(IIIIlllllllIIl - lIlIIlIll[7]);
                    "".length();
                    if ("   ".length() <= 0) {
                        return 0L;
                    }
                } else {
                    if (!FastScanner.lIIllIlllIl(IIIIlllllllIIl, lIlIIlIll[3]) || FastScanner.IllIlIlllIl(FastScanner.isPrintableChar(IIIIlllllllIIl) ? 1 : 0)) {
                        long l;
                        if (FastScanner.IIlIlIlllIl(lIIIlllllllIIl)) {
                            l = -IlIIlllllllIIl;
                            "".length();
                            if (-" ".length() > 0) {
                                return 0L;
                            }
                        } else {
                            l = IlIIlllllllIIl;
                        }
                        return l;
                    }
                    throw new NumberFormatException();
                }
                int n = this.readByte();
                "".length();
            } while ("   ".length() >= " ".length() << " ".length());
            return 0L;
        }

        /*
         * WARNING - void declaration
         */
        public int nextInt() {
            void var1_1;
            FastScanner lIllIllllllIIl;
            long IIllIllllllIIl = lIllIllllllIIl.nextLong();
            if (!FastScanner.llIllIlllIl(FastScanner.IlIllIlllIl(IIllIllllllIIl, Integer.MIN_VALUE)) || FastScanner.IIlllIlllIl(FastScanner.IlIllIlllIl(IIllIllllllIIl, Integer.MAX_VALUE))) {
                throw new NumberFormatException();
            }
            return (int)var1_1;
        }

        @Override
        public void close() {
            try {
                FastScanner lIIlIllllllIIl;
                lIIlIllllllIIl.in.close();
                "".length();
            }
            catch (IOException IIIlIllllllIIl) {
                IIIlIllllllIIl.printStackTrace();
            }
            if (((0x28 ^ 0x19) & ~(0x2F ^ 0x1E)) != ((0x66 ^ 0x49) & ~(0xA3 ^ 0x8C))) {
                return;
            }
        }

        static {
            FastScanner.lIIIlIlllIl();
        }

        private static void lIIIlIlllIl() {
            lIlIIlIll = new int[9];
            FastScanner.lIlIIlIll[0] = " ".length() << ((0xD ^ 0x20 ^ (0x64 ^ 0x61) << "   ".length()) << " ".length());
            FastScanner.lIlIIlIll[1] = (0xAB ^ 0xA6) & ~(0x49 ^ 0x44);
            FastScanner.lIlIIlIll[2] = " ".length();
            FastScanner.lIlIIlIll[3] = -" ".length();
            FastScanner.lIlIIlIll[4] = 0xD ^ 0x2C;
            FastScanner.lIlIIlIll[5] = (0xBD ^ 0x82) << " ".length();
            FastScanner.lIlIIlIll[6] = 0x76 ^ 0x5B;
            FastScanner.lIlIIlIll[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.lIlIIlIll[8] = 17 + 92 - -62 + 14 ^ " ".length() << (0xAE ^ 0xA9);
        }

        private static boolean lllIlIlllIl(int n, int n2) {
            return n == n2;
        }

        private static boolean IIIllIlllIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean IlIIlIlllIl(int n, int n2) {
            return n < n2;
        }

        private static boolean lIlIlIlllIl(int n, int n2) {
            return n <= n2;
        }

        private static boolean IIlIlIlllIl(int n) {
            return n != 0;
        }

        private static boolean IllIlIlllIl(int n) {
            return n == 0;
        }

        private static boolean llIllIlllIl(int n) {
            return n >= 0;
        }

        private static boolean llIIlIlllIl(int n) {
            return n <= 0;
        }

        private static boolean IIlllIlllIl(int n) {
            return n > 0;
        }

        private static boolean lIIllIlllIl(int n, int n2) {
            return n != n2;
        }

        private static int IlIllIlllIl(long l, long l2) {
            return l == l2 ? 0 : (l < l2 ? -1 : 1);
        }
    }

    static class BKagamiMochi {
        private static int[] llIIIlIll;

        BKagamiMochi() {
            BKagamiMochi IIlIlIIIIIIlIl;
        }

        public void solve(int n, FastScanner IlllIIIIIIIlIl, PrintWriter lIllIIIIIIIlIl) {
            int IIllIIIIIIIlIl = IlllIIIIIIIlIl.nextInt();
            HashSet<Integer> llIlIIIIIIIlIl = new HashSet<Integer>();
            int IlIlIIIIIIIlIl = llIIIlIll[0];
            while (BKagamiMochi.IIIIlIlllIl(IlIlIIIIIIIlIl, IIllIIIIIIIlIl)) {
                llIlIIIIIIIlIl.add(IlllIIIIIIIlIl.nextInt());
                "".length();
                ++IlIlIIIIIIIlIl;
                "".length();
                if (" ".length() << " ".length() != " ".length()) continue;
                return;
            }
            lIllIIIIIIIlIl.println(llIlIIIIIIIlIl.size());
        }

        static {
            BKagamiMochi.llllIIlllIl();
        }

        private static void llllIIlllIl() {
            llIIIlIll = new int[1];
            BKagamiMochi.llIIIlIll[0] = (0x6A ^ 0x53) & ~(0x4D ^ 0x74);
        }

        private static boolean IIIIlIlllIl(int n, int n2) {
            return n < n2;
        }
    }
}

