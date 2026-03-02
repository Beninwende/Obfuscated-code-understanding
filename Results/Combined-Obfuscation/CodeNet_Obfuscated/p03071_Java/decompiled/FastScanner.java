/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[IIllIIIl[0]];
    private int ptr = IIllIIIl[1];
    private int buflen = IIllIIIl[1];
    private static int[] IIllIIIl;

    FastScanner() {
        FastScanner lllllIlllIIlIIl;
    }

    private boolean hasNextByte() {
        FastScanner IIlllIlllIIlIIl;
        if (FastScanner.IIlIlIlll(IIlllIlllIIlIIl.ptr, IIlllIlllIIlIIl.buflen)) {
            return IIllIIIl[2];
        }
        IIlllIlllIIlIIl.ptr = IIllIIIl[1];
        try {
            IIlllIlllIIlIIl.buflen = IIlllIlllIIlIIl.in.read(IIlllIlllIIlIIl.buffer);
            "".length();
        }
        catch (IOException llIllIlllIIlIIl) {
            llIllIlllIIlIIl.printStackTrace();
        }
        if (null != null) {
            return (((0xDA ^ 0x8D) << " ".length() ^ 111 + 59 - 82 + 69) & (0x16 ^ 9 ^ (0x8F ^ 0x84) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
        }
        if (FastScanner.lIlIlIlll(IIlllIlllIIlIIl.buflen)) {
            return IIllIIIl[1];
        }
        return IIllIIIl[2];
    }

    private int readByte() {
        FastScanner lIIllIlllIIlIIl;
        if (FastScanner.IllIlIlll(lIIllIlllIIlIIl.hasNextByte() ? 1 : 0)) {
            int n = lIIllIlllIIlIIl.ptr;
            lIIllIlllIIlIIl.ptr = n + IIllIIIl[2];
            return lIIllIlllIIlIIl.buffer[n];
        }
        return IIllIIIl[3];
    }

    private static boolean isPrintableChar(int lllIlIlllIIlIIl) {
        int n;
        if (FastScanner.lllIlIlll(IIllIIIl[4], lllIlIlllIIlIIl) && FastScanner.lllIlIlll(lllIlIlllIIlIIl, IIllIIIl[5])) {
            n = IIllIIIl[2];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) < " ".length() << (" ".length() << " ".length())) {
                return (((0x13 ^ 0x1E) << (" ".length() << (" ".length() << " ".length())) ^ 53 + 176 - 43 + 9) << (" ".length() << " ".length()) & ((" ".length() ^ (0x31 ^ 0x38) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
            }
        } else {
            n = IIllIIIl[1];
        }
        return n != 0;
    }

    public boolean hasNext() {
        FastScanner lIlIlIlllIIlIIl;
        while (FastScanner.IllIlIlll(lIlIlIlllIIlIIl.hasNextByte() ? 1 : 0) && FastScanner.IIIllIlll(FastScanner.isPrintableChar(lIlIlIlllIIlIIl.buffer[lIlIlIlllIIlIIl.ptr]) ? 1 : 0)) {
            lIlIlIlllIIlIIl.ptr += IIllIIIl[2];
            "".length();
            if ("   ".length() <= "   ".length()) continue;
            return ((39 + 0 - -106 + 18 ^ (0x18 ^ 0x13) << (" ".length() << (" ".length() << " ".length()))) & (0x3C ^ 0x6F ^ " ".length() << ("   ".length() << " ".length()) ^ -" ".length())) != 0;
        }
        return this.hasNextByte();
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        FastScanner lIIIlIlllIIlIIl;
        if (FastScanner.IIIllIlll(lIIIlIlllIIlIIl.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IIIIlIlllIIlIIl = new StringBuilder();
        int llllIIlllIIlIIl = lIIIlIlllIIlIIl.readByte();
        while (FastScanner.IllIlIlll(FastScanner.isPrintableChar(llllIIlllIIlIIl) ? 1 : 0)) {
            IIIIlIlllIIlIIl.appendCodePoint(llllIIlllIIlIIl);
            "".length();
            llllIIlllIIlIIl = lIIIlIlllIIlIIl.readByte();
            "".length();
            if (((0x32 ^ 3 ^ "   ".length() << "   ".length()) << " ".length() & (((0x8D ^ 0xAE) << (" ".length() << " ".length()) ^ 131 + 68 - 184 + 150) << " ".length() ^ -" ".length())) == 0) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        FastScanner IlIlIIlllIIlIIl;
        if (FastScanner.IIIllIlll(IlIlIIlllIIlIIl.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long lIIlIIlllIIlIIl = 0L;
        int IIIlIIlllIIlIIl = IIllIIIl[1];
        int lllIIIlllIIlIIl = IlIlIIlllIIlIIl.readByte();
        if (FastScanner.lIIllIlll(lllIIIlllIIlIIl, IIllIIIl[6])) {
            IIIlIIlllIIlIIl = IIllIIIl[2];
            lllIIIlllIIlIIl = IlIlIIlllIIlIIl.readByte();
        }
        if (!FastScanner.IlIllIlll(lllIIIlllIIlIIl, IIllIIIl[7]) || FastScanner.IIlIlIlll(IIllIIIl[8], lllIIIlllIIlIIl)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.lllIlIlll(IIllIIIl[7], lllIIIlllIIlIIl) && FastScanner.lllIlIlll(lllIIIlllIIlIIl, IIllIIIl[8])) {
                lIIlIIlllIIlIIl *= 10L;
                lIIlIIlllIIlIIl += (long)(lllIIIlllIIlIIl - IIllIIIl[7]);
                "".length();
                if (-(0x9E ^ 0xB5 ^ (0xB4 ^ 0x9B)) >= 0) {
                    return 0L;
                }
            } else {
                if (!FastScanner.llIllIlll(lllIIIlllIIlIIl, IIllIIIl[3]) || FastScanner.IIIllIlll(FastScanner.isPrintableChar(lllIIIlllIIlIIl) ? 1 : 0)) {
                    long l;
                    if (FastScanner.IllIlIlll(IIIlIIlllIIlIIl)) {
                        l = -lIIlIIlllIIlIIl;
                        "".length();
                        if ("   ".length() < " ".length()) {
                            return 0L;
                        }
                    } else {
                        l = lIIlIIlllIIlIIl;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            "".length();
        } while (((0xA7 ^ 0xB0) << " ".length() & ~((0x33 ^ 0x24) << " ".length())) < "   ".length());
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int nextInt() {
        void var1_1;
        FastScanner IIlIIIlllIIlIIl;
        long llIIIIlllIIlIIl = IIlIIIlllIIlIIl.nextLong();
        if (!FastScanner.lIlllIlll(FastScanner.IIlllIlll(llIIIIlllIIlIIl, Integer.MIN_VALUE)) || FastScanner.IllllIlll(FastScanner.IIlllIlll(llIIIIlllIIlIIl, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double nextDouble() {
        FastScanner lIIIIIlllIIlIIl;
        return Double.parseDouble(lIIIIIlllIIlIIl.next());
    }

    static {
        FastScanner.lIIIlIlll();
    }

    private static void lIIIlIlll() {
        IIllIIIl = new int[9];
        FastScanner.IIllIIIl[0] = " ".length() << (((2 ^ 0x23) << (" ".length() << " ".length()) ^ 15 + 68 - 63 + 109) << " ".length());
        FastScanner.IIllIIIl[1] = (0xAF ^ 0x9E ^ (0x38 ^ 0x23) << " ".length()) << "   ".length() & ((30 + 68 - 91 + 166 ^ (0x49 ^ 0x1C) << " ".length()) << "   ".length() ^ -" ".length());
        FastScanner.IIllIIIl[2] = " ".length();
        FastScanner.IIllIIIl[3] = -" ".length();
        FastScanner.IIllIIIl[4] = 0x9C ^ 0xBD;
        FastScanner.IIllIIIl[5] = (0xB2 ^ 0x8D) << " ".length();
        FastScanner.IIllIIIl[6] = 0x31 ^ 0x1C;
        FastScanner.IIllIIIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.IIllIIIl[8] = 0xCD ^ 0xB8 ^ (0x5F ^ 0x4C) << (" ".length() << " ".length());
    }

    private static boolean lIIllIlll(int n, int n2) {
        return n == n2;
    }

    private static boolean IlIllIlll(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIlIlIlll(int n, int n2) {
        return n < n2;
    }

    private static boolean lllIlIlll(int n, int n2) {
        return n <= n2;
    }

    private static boolean IllIlIlll(int n) {
        return n != 0;
    }

    private static boolean IIIllIlll(int n) {
        return n == 0;
    }

    private static boolean lIlllIlll(int n) {
        return n >= 0;
    }

    private static boolean lIlIlIlll(int n) {
        return n <= 0;
    }

    private static boolean IllllIlll(int n) {
        return n > 0;
    }

    private static boolean llIllIlll(int n, int n2) {
        return n != n2;
    }

    private static int IIlllIlll(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

