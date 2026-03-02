/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
    static FastScanner sc;
    static PrintWriter out;
    static String S;
    static int n;
    static boolean[][] seen;
    static int[][] field;
    static final int mod;
    private static int[] llllllIIIl;

    public Main() {
        Main lIlIIIlIlIlIl;
    }

    public static void main(String[] stringArray) {
        int lIIIIIlIlIlIl = sc.nextInt();
        int IIIIIIlIlIlIl = sc.nextInt();
        int llllllIIlIlIl = sc.nextInt();
        out.println(llllllIIlIlIl + " " + lIIIIIlIlIlIl + " " + IIIIIIlIlIlIl);
        out.flush();
    }

    static {
        Main.IIIllllllll();
        mod = llllllIIIl[0];
        sc = new FastScanner();
        out = new PrintWriter(System.out);
    }

    private static void IIIllllllll() {
        llllllIIIl = new int[1];
        Main.llllllIIIl[0] = (27615072 + 461492405 - 381948491 + 358860585 << " ".length()) + (205024434 + 49855874 - 59279177 + 24933938) - (179558619 + 178526276 - 163150381 + 36240803) + (61549129 + 17483510 - 29150227 + 28718701);
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[IIIIIIlIIl[0]];
        private int ptr = IIIIIIlIIl[1];
        private int buflen = IIIIIIlIIl[1];
        private static int[] IIIIIIlIIl;
        private static String[] IlIIIIlIIl;

        FastScanner() {
            FastScanner lIllllIIlIlIl;
        }

        private boolean hasNextByte() {
            FastScanner IlIlllIIlIlIl;
            if (FastScanner.IlIllllllll(IlIlllIIlIlIl.ptr, IlIlllIIlIlIl.buflen)) {
                return IIIIIIlIIl[2];
            }
            IlIlllIIlIlIl.ptr = IIIIIIlIIl[1];
            try {
                IlIlllIIlIlIl.buflen = IlIlllIIlIlIl.in.read(IlIlllIIlIlIl.buffer);
                IlIIIIlIIl[0].length();
            }
            catch (IOException lIIlllIIlIlIl) {
                lIIlllIIlIlIl.printStackTrace();
            }
            if (IlIIIIlIIl[1].length() < 0) {
                return ((0x1C ^ 0x71 ^ (0xCC ^ 0xC1) << IlIIIIlIIl[2].length()) << (IlIIIIlIIl[3].length() << IlIIIIlIIl[4].length()) & ((0x91 ^ 0xC4 ^ (0x5B ^ 0x5E) << (IlIIIIlIIl[5].length() << (IlIIIIlIIl[6].length() << IlIIIIlIIl[7].length()))) << (IlIIIIlIIl[8].length() << IlIIIIlIIl[9].length()) ^ -IlIIIIlIIl[10].length())) != 0;
            }
            if (FastScanner.Illllllllll(IlIlllIIlIlIl.buflen)) {
                return IIIIIIlIIl[1];
            }
            return IIIIIIlIIl[2];
        }

        private int readByte() {
            FastScanner lllIllIIlIlIl;
            if (FastScanner.lllllllllll(lllIllIIlIlIl.hasNextByte() ? 1 : 0)) {
                int n = lllIllIIlIlIl.ptr;
                lllIllIIlIlIl.ptr = n + IIIIIIlIIl[2];
                return lllIllIIlIlIl.buffer[n];
            }
            return IIIIIIlIIl[3];
        }

        private static boolean isPrintableChar(int lIlIllIIlIlIl) {
            int n;
            if (FastScanner.IIIIIIIIIIIl(IIIIIIlIIl[4], lIlIllIIlIlIl) && FastScanner.IIIIIIIIIIIl(lIlIllIIlIlIl, IIIIIIlIIl[5])) {
                n = IIIIIIlIIl[2];
                "".length();
                if (" ".length() << (" ".length() << " ".length()) <= -" ".length()) {
                    return ((0x25 ^ 0xE) << " ".length() & ~((0xAF ^ 0x84) << " ".length())) != 0;
                }
            } else {
                n = IIIIIIlIIl[1];
            }
            return n != 0;
        }

        private void skipUnprintable() {
            FastScanner llIIllIIlIlIl;
            while (FastScanner.lllllllllll(llIIllIIlIlIl.hasNextByte() ? 1 : 0) && FastScanner.lIIIIIIIIIIl(FastScanner.isPrintableChar(llIIllIIlIlIl.buffer[llIIllIIlIlIl.ptr]) ? 1 : 0)) {
                llIIllIIlIlIl.ptr += IIIIIIlIIl[2];
                "".length();
                if (" ".length() == " ".length()) continue;
                return;
            }
        }

        public boolean hasNext() {
            FastScanner lIIIllIIlIlIl;
            lIIIllIIlIlIl.skipUnprintable();
            return this.hasNextByte();
        }

        /*
         * WARNING - void declaration
         */
        public String next() {
            void var1_1;
            FastScanner lIllIlIIlIlIl;
            if (FastScanner.lIIIIIIIIIIl(lIllIlIIlIlIl.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            StringBuilder IIllIlIIlIlIl = new StringBuilder();
            int llIlIlIIlIlIl = lIllIlIIlIlIl.readByte();
            while (FastScanner.lllllllllll(FastScanner.isPrintableChar(llIlIlIIlIlIl) ? 1 : 0)) {
                IIllIlIIlIlIl.appendCodePoint(llIlIlIIlIlIl);
                "".length();
                llIlIlIIlIlIl = lIllIlIIlIlIl.readByte();
                "".length();
                if ("   ".length() >= -" ".length()) continue;
                return null;
            }
            return String.valueOf(var1_1);
        }

        public long nextLong() {
            FastScanner IllIIlIIlIlIl;
            if (FastScanner.lIIIIIIIIIIl(IllIIlIIlIlIl.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            long lIlIIlIIlIlIl = 0L;
            int IIlIIlIIlIlIl = IIIIIIlIIl[1];
            int llIIIlIIlIlIl = IllIIlIIlIlIl.readByte();
            if (FastScanner.IlIIIIIIIIIl(llIIIlIIlIlIl, IIIIIIlIIl[6])) {
                IIlIIlIIlIlIl = IIIIIIlIIl[2];
                llIIIlIIlIlIl = IllIIlIIlIlIl.readByte();
            }
            if (!FastScanner.llIIIIIIIIIl(llIIIlIIlIlIl, IIIIIIlIIl[7]) || FastScanner.IlIllllllll(IIIIIIlIIl[8], llIIIlIIlIlIl)) {
                throw new NumberFormatException();
            }
            do {
                if (FastScanner.IIIIIIIIIIIl(IIIIIIlIIl[7], llIIIlIIlIlIl) && FastScanner.IIIIIIIIIIIl(llIIIlIIlIlIl, IIIIIIlIIl[8])) {
                    lIlIIlIIlIlIl *= 10L;
                    lIlIIlIIlIlIl += (long)(llIIIlIIlIlIl - IIIIIIlIIl[7]);
                    "".length();
                    if ("   ".length() == " ".length() << (" ".length() << " ".length())) {
                        return 0L;
                    }
                } else {
                    if (!FastScanner.IIlIIIIIIIIl(llIIIlIIlIlIl, IIIIIIlIIl[3]) || FastScanner.lIIIIIIIIIIl(FastScanner.isPrintableChar(llIIIlIIlIlIl) ? 1 : 0)) {
                        long l;
                        if (FastScanner.lllllllllll(IIlIIlIIlIlIl)) {
                            l = -lIlIIlIIlIlIl;
                            "".length();
                            if (" ".length() << " ".length() == 0) {
                                return 0L;
                            }
                        } else {
                            l = lIlIIlIIlIlIl;
                        }
                        return l;
                    }
                    throw new NumberFormatException();
                }
                int n = this.readByte();
                "".length();
            } while (" ".length() != 0);
            return 0L;
        }

        public int nextInt() {
            FastScanner lIIIIlIIlIlIl;
            return (int)lIIIIlIIlIlIl.nextLong();
        }

        public double nextDouble() {
            FastScanner lllllIIIlIlIl;
            return Double.parseDouble(lllllIIIlIlIl.next());
        }

        /*
         * WARNING - void declaration
         */
        public int[] nextIntArray(int IlIllIIIlIlIl, boolean lIIllIIIlIlIl) {
            void var3_4;
            if (FastScanner.lllllllllll(lIIllIIIlIlIl ? 1 : 0)) {
                int[] IIIllIIIlIlIl = new int[IlIllIIIlIlIl + IIIIIIlIIl[2]];
                int lllIlIIIlIlIl = IIIIIIlIIl[2];
                while (FastScanner.IIIIIIIIIIIl(lllIlIIIlIlIl, IlIllIIIlIlIl)) {
                    IIIllIIIlIlIl[lllIlIIIlIlIl] = sc.nextInt();
                    ++lllIlIIIlIlIl;
                    "".length();
                    if (("   ".length() << " ".length() & ~("   ".length() << " ".length())) == 0) continue;
                    return null;
                }
                return IIIllIIIlIlIl;
            }
            int[] IIIllIIIlIlIl = new int[IlIllIIIlIlIl];
            int lllIlIIIlIlIl = IIIIIIlIIl[1];
            while (FastScanner.IlIllllllll(lllIlIIIlIlIl, IlIllIIIlIlIl)) {
                IIIllIIIlIlIl[lllIlIIIlIlIl] = sc.nextInt();
                ++lllIlIIIlIlIl;
                "".length();
                if (-" ".length() == -" ".length()) continue;
                return null;
            }
            return var3_4;
        }

        /*
         * WARNING - void declaration
         */
        public long[] nextLongArray(int IlIIlIIIlIlIl, boolean lIIIlIIIlIlIl) {
            void var3_4;
            if (FastScanner.lllllllllll(lIIIlIIIlIlIl ? 1 : 0)) {
                long[] IIIIlIIIlIlIl = new long[IlIIlIIIlIlIl + IIIIIIlIIl[2]];
                int llllIIIIlIlIl = IIIIIIlIIl[2];
                while (FastScanner.IIIIIIIIIIIl(llllIIIIlIlIl, IlIIlIIIlIlIl)) {
                    IIIIlIIIlIlIl[llllIIIIlIlIl] = sc.nextLong();
                    ++llllIIIIlIlIl;
                    "".length();
                    if (" ".length() != 0) continue;
                    return null;
                }
                return IIIIlIIIlIlIl;
            }
            long[] IIIIlIIIlIlIl = new long[IlIIlIIIlIlIl];
            int llllIIIIlIlIl = IIIIIIlIIl[1];
            while (FastScanner.IlIllllllll(llllIIIIlIlIl, IlIIlIIIlIlIl)) {
                IIIIlIIIlIlIl[llllIIIIlIlIl] = sc.nextLong();
                ++llllIIIIlIlIl;
                "".length();
                if (((0x64 ^ 0x47) & ~(3 ^ 0x20)) == 0) continue;
                return null;
            }
            return var3_4;
        }

        static {
            FastScanner.lIIllllllll();
        }

        private static void lIIllllllll() {
            IIIIIIlIIl = new int[9];
            FastScanner.IIIIIIlIIl[0] = IlIIIIlIIl[11].length() << ((0x68 ^ 0x53 ^ (0xAA ^ 0xB5) << IlIIIIlIIl[12].length()) << IlIIIIlIIl[13].length());
            FastScanner.IIIIIIlIIl[1] = (0xF ^ 0x48 ^ (0x1F ^ 4) << (IlIIIIlIIl[14].length() << IlIIIIlIIl[15].length())) & ((0 ^ 0x53) << IlIIIIlIIl[16].length() ^ 62 + 114 - 88 + 53 ^ -IlIIIIlIIl[17].length());
            FastScanner.IIIIIIlIIl[2] = IlIIIIlIIl[18].length();
            FastScanner.IIIIIIlIIl[3] = -IlIIIIlIIl[19].length();
            FastScanner.IIIIIIlIIl[4] = 4 ^ 0x6F ^ (0x96 ^ 0xB3) << IlIIIIlIIl[20].length();
            FastScanner.IIIIIIlIIl[5] = (0x5B ^ 0x64) << IlIIIIlIIl[21].length();
            FastScanner.IIIIIIlIIl[6] = 0xB9 ^ 0xC2 ^ (0x23 ^ 8) << IlIIIIlIIl[22].length();
            FastScanner.IIIIIIlIIl[7] = IlIIIIlIIl[23].length() << (IlIIIIlIIl[24].length() << (IlIIIIlIIl[25].length() << IlIIIIlIIl[26].length()));
            FastScanner.IIIIIIlIIl[8] = 0xF6 ^ 0xC7 ^ IlIIIIlIIl[27].length() << IlIIIIlIIl[28].length();
        }

        private static boolean IlIIIIIIIIIl(int n, int n2) {
            return n == n2;
        }

        private static boolean llIIIIIIIIIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean IlIllllllll(int n, int n2) {
            return n < n2;
        }

        private static boolean IIIIIIIIIIIl(int n, int n2) {
            return n <= n2;
        }

        private static boolean lllllllllll(int n) {
            return n != 0;
        }

        private static boolean lIIIIIIIIIIl(int n) {
            return n == 0;
        }

        private static boolean Illllllllll(int n) {
            return n <= 0;
        }

        private static boolean IIlIIIIIIIIl(int n, int n2) {
            return n != n2;
        }
    }
}

