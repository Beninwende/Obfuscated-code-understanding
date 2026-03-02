/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
    static FastScanner sc = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);
    static int n;
    static String s;

    public Main() {
        Main lIlIIlllIIlllIl;
    }

    public static void main(String[] stringArray) {
        n = sc.nextInt();
        int IlIIIlllIIlllIl = sc.nextInt();
        out.println(n * IlIIIlllIIlllIl);
        out.flush();
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[IIlIl[0]];
        private int ptr = IIlIl[1];
        private int buflen = IIlIl[1];
        private static int[] IIlIl;

        FastScanner() {
            FastScanner lllllIllIIlllIl;
        }

        private boolean hasNextByte() {
            FastScanner IIlllIllIIlllIl;
            if (FastScanner.IlIlll(IIlllIllIIlllIl.ptr, IIlllIllIIlllIl.buflen)) {
                return IIlIl[2];
            }
            IIlllIllIIlllIl.ptr = IIlIl[1];
            try {
                IIlllIllIIlllIl.buflen = IIlllIllIIlllIl.in.read(IIlllIllIIlllIl.buffer);
                "".length();
            }
            catch (IOException llIllIllIIlllIl) {
                llIllIllIIlllIl.printStackTrace();
            }
            if (" ".length() << " ".length() < (((0x6F ^ 0x34) << " ".length() ^ 54 + 16 - 30 + 145) << " ".length() & (((0x6B ^ 0x42) << (" ".length() << " ".length()) ^ 26 + 66 - -54 + 25) << " ".length() ^ -" ".length()))) {
                return ((" ".length() << "   ".length() ^ (0xFC ^ 0xB7)) & ((0x28 ^ 0x2D) << " ".length() ^ (0xEB ^ 0xA2) ^ -" ".length())) != 0;
            }
            if (FastScanner.llIlll(IIlllIllIIlllIl.buflen)) {
                return IIlIl[1];
            }
            return IIlIl[2];
        }

        private int readByte() {
            FastScanner lIIllIllIIlllIl;
            if (FastScanner.IIllll(lIIllIllIIlllIl.hasNextByte() ? 1 : 0)) {
                int n = lIIllIllIIlllIl.ptr;
                lIIllIllIIlllIl.ptr = n + IIlIl[2];
                return lIIllIllIIlllIl.buffer[n];
            }
            return IIlIl[3];
        }

        private static boolean isPrintableChar(int lllIlIllIIlllIl) {
            int n;
            if (FastScanner.lIllll(IIlIl[4], lllIlIllIIlllIl) && FastScanner.lIllll(lllIlIllIIlllIl, IIlIl[5])) {
                n = IIlIl[2];
                "".length();
                if (" ".length() << " ".length() < 0) {
                    return ((0xB8 ^ 0x8B ^ (0x7C ^ 0x73) << "   ".length()) & (0x82 ^ 0x91 ^ (7 ^ 0xC) << "   ".length() ^ -" ".length())) != 0;
                }
            } else {
                n = IIlIl[1];
            }
            return n != 0;
        }

        private void skipUnprintable() {
            FastScanner lIlIlIllIIlllIl;
            while (FastScanner.IIllll(lIlIlIllIIlllIl.hasNextByte() ? 1 : 0) && FastScanner.Illlll(FastScanner.isPrintableChar(lIlIlIllIIlllIl.buffer[lIlIlIllIIlllIl.ptr]) ? 1 : 0)) {
                lIlIlIllIIlllIl.ptr += IIlIl[2];
                "".length();
                if (null == null) continue;
                return;
            }
        }

        public boolean hasNext() {
            FastScanner llIIlIllIIlllIl;
            llIIlIllIIlllIl.skipUnprintable();
            return this.hasNextByte();
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var1_1;
            FastScanner llllIIllIIlllIl;
            if (FastScanner.Illlll(llllIIllIIlllIl.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            StringBuilder IlllIIllIIlllIl = new StringBuilder();
            int lIllIIllIIlllIl = llllIIllIIlllIl.readByte();
            while (FastScanner.IIllll(FastScanner.isPrintableChar(lIllIIllIIlllIl) ? 1 : 0)) {
                IlllIIllIIlllIl.appendCodePoint(lIllIIllIIlllIl);
                "".length();
                lIllIIllIIlllIl = llllIIllIIlllIl.readByte();
                "".length();
                if ("   ".length() >= 0) continue;
                return null;
            }
            return String.valueOf(var1_1);
        }

        public long nextLong() {
            FastScanner IIIlIIllIIlllIl;
            if (FastScanner.Illlll(IIIlIIllIIlllIl.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            long lllIIIllIIlllIl = 0L;
            int IllIIIllIIlllIl = IIlIl[1];
            int lIlIIIllIIlllIl = IIIlIIllIIlllIl.readByte();
            if (FastScanner.llllll(lIlIIIllIIlllIl, IIlIl[6])) {
                IllIIIllIIlllIl = IIlIl[2];
                lIlIIIllIIlllIl = IIIlIIllIIlllIl.readByte();
            }
            if (!FastScanner.IIIIIIl(lIlIIIllIIlllIl, IIlIl[7]) || FastScanner.IlIlll(IIlIl[8], lIlIIIllIIlllIl)) {
                throw new NumberFormatException();
            }
            do {
                if (FastScanner.lIllll(IIlIl[7], lIlIIIllIIlllIl) && FastScanner.lIllll(lIlIIIllIIlllIl, IIlIl[8])) {
                    lllIIIllIIlllIl *= 10L;
                    lllIIIllIIlllIl += (long)(lIlIIIllIIlllIl - IIlIl[7]);
                    "".length();
                    if (-" ".length() >= " ".length()) {
                        return 0L;
                    }
                } else {
                    if (!FastScanner.lIIIIIl(lIlIIIllIIlllIl, IIlIl[3]) || FastScanner.Illlll(FastScanner.isPrintableChar(lIlIIIllIIlllIl) ? 1 : 0)) {
                        long l;
                        if (FastScanner.IIllll(IllIIIllIIlllIl)) {
                            l = -lllIIIllIIlllIl;
                            "".length();
                            if (((0x69 ^ 0x6E) << (" ".length() << " ".length()) & ~((0x74 ^ 0x73) << (" ".length() << " ".length()))) != ((0x71 ^ 0x40) << " ".length() & ~((0xF2 ^ 0xC3) << " ".length()))) {
                                return 0L;
                            }
                        } else {
                            l = lllIIIllIIlllIl;
                        }
                        return l;
                    }
                    throw new NumberFormatException();
                }
                int n = this.readByte();
                "".length();
            } while (-" ".length() <= -" ".length());
            return 0L;
        }

        public int nextInt() {
            FastScanner llIIIIllIIlllIl;
            return (int)llIIIIllIIlllIl.nextLong();
        }

        public double nextDouble() {
            FastScanner lIIIIIllIIlllIl;
            return Double.parseDouble(lIIIIIllIIlllIl.next());
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray(int IIllllIlIIlllIl, boolean llIlllIlIIlllIl) {
            void var3_4;
            if (FastScanner.IIllll(llIlllIlIIlllIl ? 1 : 0)) {
                int[] IlIlllIlIIlllIl = new int[IIllllIlIIlllIl + IIlIl[2]];
                int lIIlllIlIIlllIl = IIlIl[2];
                while (FastScanner.lIllll(lIIlllIlIIlllIl, IIllllIlIIlllIl)) {
                    IlIlllIlIIlllIl[lIIlllIlIIlllIl] = sc.nextInt();
                    ++lIIlllIlIIlllIl;
                    "".length();
                    if (null == null) continue;
                    return null;
                }
                return IlIlllIlIIlllIl;
            }
            int[] IlIlllIlIIlllIl = new int[IIllllIlIIlllIl];
            int lIIlllIlIIlllIl = IIlIl[1];
            while (FastScanner.IlIlll(lIIlllIlIIlllIl, IIllllIlIIlllIl)) {
                IlIlllIlIIlllIl[lIIlllIlIIlllIl] = sc.nextInt();
                ++lIIlllIlIIlllIl;
                "".length();
                if (((0x34 ^ 0x25) << (" ".length() << " ".length()) & ~((0x3E ^ 0x2F) << (" ".length() << " ".length()))) < " ".length() << " ".length()) continue;
                return null;
            }
            return var3_4;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray(int IIlIllIlIIlllIl, boolean llIIllIlIIlllIl) {
            void var3_4;
            if (FastScanner.IIllll(llIIllIlIIlllIl ? 1 : 0)) {
                long[] IlIIllIlIIlllIl = new long[IIlIllIlIIlllIl + IIlIl[2]];
                int lIIIllIlIIlllIl = IIlIl[2];
                while (FastScanner.lIllll(lIIIllIlIIlllIl, IIlIllIlIIlllIl)) {
                    IlIIllIlIIlllIl[lIIIllIlIIlllIl] = sc.nextLong();
                    ++lIIIllIlIIlllIl;
                    "".length();
                    if ("   ".length() >= (((0x3C ^ 0x71) << " ".length() ^ 149 + 29 - 170 + 159) & ((0x4A ^ 0x5D) << "   ".length() ^ 101 + 55 - 88 + 65 ^ -" ".length()))) continue;
                    return null;
                }
                return IlIIllIlIIlllIl;
            }
            long[] IlIIllIlIIlllIl = new long[IIlIllIlIIlllIl];
            int lIIIllIlIIlllIl = IIlIl[1];
            while (FastScanner.IlIlll(lIIIllIlIIlllIl, IIlIllIlIIlllIl)) {
                IlIIllIlIIlllIl[lIIIllIlIIlllIl] = sc.nextLong();
                ++lIIIllIlIIlllIl;
                "".length();
                if (" ".length() << " ".length() == " ".length() << " ".length()) continue;
                return null;
            }
            return var3_4;
        }

        static {
            FastScanner.lIIlll();
        }

        private static void lIIlll() {
            IIlIl = new int[9];
            FastScanner.IIlIl[0] = " ".length() << ((0x36 ^ 0x7F ^ (0x3A ^ 0x29) << (" ".length() << " ".length())) << " ".length());
            FastScanner.IIlIl[1] = (0x83 ^ 0x9C) << " ".length() & ~((0x90 ^ 0x8F) << " ".length());
            FastScanner.IIlIl[2] = " ".length();
            FastScanner.IIlIl[3] = -" ".length();
            FastScanner.IIlIl[4] = 0x8F ^ 0xAE;
            FastScanner.IIlIl[5] = (134 + 65 - 82 + 20 ^ (0x59 ^ 2) << " ".length()) << " ".length();
            FastScanner.IIlIl[6] = (0xA7 ^ 0x86) << " ".length() ^ (0xCD ^ 0xA2);
            FastScanner.IIlIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.IIlIl[8] = 0x56 ^ 0x2D ^ (0x3E ^ 0x1F) << " ".length();
        }

        private static boolean llllll(int n, int n2) {
            return n == n2;
        }

        private static boolean IIIIIIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean IlIlll(int n, int n2) {
            return n < n2;
        }

        private static boolean lIllll(int n, int n2) {
            return n <= n2;
        }

        private static boolean IIllll(int n) {
            return n != 0;
        }

        private static boolean Illlll(int n) {
            return n == 0;
        }

        private static boolean llIlll(int n) {
            return n <= 0;
        }

        private static boolean lIIIIIl(int n, int n2) {
            return n != n2;
        }
    }
}

