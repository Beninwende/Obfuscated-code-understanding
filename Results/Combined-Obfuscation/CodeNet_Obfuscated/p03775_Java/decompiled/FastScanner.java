/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[IllIIIlll[0]];
    private int ptr = IllIIIlll[1];
    private int buflen = IllIIIlll[1];
    private static int[] IllIIIlll;

    FastScanner() {
        FastScanner lllIIlIlIIlIIl;
    }

    private boolean hasNextByte() {
        FastScanner IIlIIlIlIIlIIl;
        if (FastScanner.llllllIIIll(IIlIIlIlIIlIIl.ptr, IIlIIlIlIIlIIl.buflen)) {
            return IllIIIlll[2];
        }
        IIlIIlIlIIlIIl.ptr = IllIIIlll[1];
        try {
            IIlIIlIlIIlIIl.buflen = IIlIIlIlIIlIIl.in.read(IIlIIlIlIIlIIl.buffer);
            "".length();
        }
        catch (IOException llIIIlIlIIlIIl) {
            llIIIlIlIIlIIl.printStackTrace();
        }
        if (((0xA4 ^ 0xA1) << " ".length() & ~((0x27 ^ 0x22) << " ".length())) != ((0xCC ^ 0xC7) << (" ".length() << " ".length()) & ~((0x18 ^ 0x13) << (" ".length() << " ".length())))) {
            return ((0x49 ^ 0x4C) << (" ".length() << " ".length()) & ~((0x38 ^ 0x3D) << (" ".length() << " ".length()))) != 0;
        }
        if (FastScanner.llIIIIlIIll(IIlIIlIlIIlIIl.buflen)) {
            return IllIIIlll[1];
        }
        return IllIIIlll[2];
    }

    private int readByte() {
        FastScanner lIIIIlIlIIlIIl;
        if (FastScanner.IIlIIIlIIll(lIIIIlIlIIlIIl.hasNextByte() ? 1 : 0)) {
            int n = lIIIIlIlIIlIIl.ptr;
            lIIIIlIlIIlIIl.ptr = n + IllIIIlll[2];
            return lIIIIlIlIIlIIl.buffer[n];
        }
        return IllIIIlll[3];
    }

    private static boolean isPrintableChar(int lllllIIlIIlIIl) {
        int n;
        if (FastScanner.lIlIIIlIIll(IllIIIlll[4], lllllIIlIIlIIl) && FastScanner.lIlIIIlIIll(lllllIIlIIlIIl, IllIIIlll[5])) {
            n = IllIIIlll[2];
            "".length();
            if (" ".length() << " ".length() <= " ".length()) {
                return ("   ".length() << (0x2D ^ 0x1E ^ (6 ^ 0x1D) << " ".length()) & ("   ".length() << ((0x88 ^ 0xA3) << (" ".length() << " ".length()) ^ 132 + 111 - 131 + 57) ^ -" ".length())) != 0;
            }
        } else {
            n = IllIIIlll[1];
        }
        return n != 0;
    }

    public boolean hasNext() {
        FastScanner lIlllIIlIIlIIl;
        while (FastScanner.IIlIIIlIIll(lIlllIIlIIlIIl.hasNextByte() ? 1 : 0) && FastScanner.IllIIIlIIll(FastScanner.isPrintableChar(lIlllIIlIIlIIl.buffer[lIlllIIlIIlIIl.ptr]) ? 1 : 0)) {
            lIlllIIlIIlIIl.ptr += IllIIIlll[2];
            "".length();
            if ((((0x38 ^ 0x3D) << "   ".length() ^ (0xE9 ^ 0xA2)) & (" ".length() << " ".length() ^ (0x29 ^ 0x48) ^ -" ".length())) == 0) continue;
            return ((109 + 105 - 93 + 70 ^ (0x7E ^ 0x23) << " ".length()) << "   ".length() & (((0x78 ^ 0x37) << " ".length() ^ 88 + 98 - 37 + 6) << "   ".length() ^ -" ".length())) != 0;
        }
        return this.hasNextByte();
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        FastScanner lIIllIIlIIlIIl;
        if (FastScanner.IllIIIlIIll(lIIllIIlIIlIIl.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IIIllIIlIIlIIl = new StringBuilder();
        int lllIlIIlIIlIIl = lIIllIIlIIlIIl.readByte();
        while (FastScanner.IIlIIIlIIll(FastScanner.isPrintableChar(lllIlIIlIIlIIl) ? 1 : 0)) {
            IIIllIIlIIlIIl.appendCodePoint(lllIlIIlIIlIIl);
            "".length();
            lllIlIIlIIlIIl = lIIllIIlIIlIIl.readByte();
            "".length();
            if ("   ".length() < " ".length() << (" ".length() << " ".length())) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        FastScanner IlIIlIIlIIlIIl;
        if (FastScanner.IllIIIlIIll(IlIIlIIlIIlIIl.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long lIIIlIIlIIlIIl = 0L;
        int IIIIlIIlIIlIIl = IllIIIlll[1];
        int llllIIIlIIlIIl = IlIIlIIlIIlIIl.readByte();
        if (FastScanner.lllIIIlIIll(llllIIIlIIlIIl, IllIIIlll[6])) {
            IIIIlIIlIIlIIl = IllIIIlll[2];
            llllIIIlIIlIIl = IlIIlIIlIIlIIl.readByte();
        }
        if (!FastScanner.IIIlIIlIIll(llllIIIlIIlIIl, IllIIIlll[7]) || FastScanner.llllllIIIll(IllIIIlll[8], llllIIIlIIlIIl)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.lIlIIIlIIll(IllIIIlll[7], llllIIIlIIlIIl) && FastScanner.lIlIIIlIIll(llllIIIlIIlIIl, IllIIIlll[8])) {
                lIIIlIIlIIlIIl *= 10L;
                lIIIlIIlIIlIIl += (long)(llllIIIlIIlIIl - IllIIIlll[7]);
                "".length();
                if (" ".length() << (" ".length() << " ".length()) <= " ".length()) {
                    return 0L;
                }
            } else {
                if (!FastScanner.lIIlIIlIIll(llllIIIlIIlIIl, IllIIIlll[3]) || FastScanner.IllIIIlIIll(FastScanner.isPrintableChar(llllIIIlIIlIIl) ? 1 : 0)) {
                    long l;
                    if (FastScanner.IIlIIIlIIll(IIIIlIIlIIlIIl)) {
                        l = -lIIIlIIlIIlIIl;
                        "".length();
                        if ("   ".length() == 0) {
                            return 0L;
                        }
                    } else {
                        l = lIIIlIIlIIlIIl;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            "".length();
        } while ("   ".length() >= "   ".length());
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int nextInt() {
        void var1_1;
        FastScanner IIllIIIlIIlIIl;
        long llIlIIIlIIlIIl = IIllIIIlIIlIIl.nextLong();
        if (!FastScanner.llIlIIlIIll(FastScanner.IlIlIIlIIll(llIlIIIlIIlIIl, Integer.MIN_VALUE)) || FastScanner.IIllIIlIIll(FastScanner.IlIlIIlIIll(llIlIIIlIIlIIl, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double nextDouble() {
        FastScanner lIIlIIIlIIlIIl;
        return Double.parseDouble(lIIlIIIlIIlIIl.next());
    }

    static {
        FastScanner.IlllllIIIll();
    }

    private static void IlllllIIIll() {
        IllIIIlll = new int[9];
        FastScanner.IllIIIlll[0] = " ".length() << (("   ".length() << (" ".length() << (" ".length() << " ".length())) ^ (0xA0 ^ 0x95)) << " ".length());
        FastScanner.IllIIIlll[1] = ((0x4B ^ 0x4E) << "   ".length() ^ (0x3C ^ 0x2F)) & (34 + 109 - -29 + 13 ^ (0 ^ 0x41) << " ".length() ^ -" ".length());
        FastScanner.IllIIIlll[2] = " ".length();
        FastScanner.IllIIIlll[3] = -" ".length();
        FastScanner.IllIIIlll[4] = 0x6F ^ 0x4E;
        FastScanner.IllIIIlll[5] = (" ".length() << " ".length() ^ (5 ^ 0x38)) << " ".length();
        FastScanner.IllIIIlll[6] = 195 + 107 - 85 + 16 ^ (0x63 ^ 0x52) << (" ".length() << " ".length());
        FastScanner.IllIIIlll[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.IllIIIlll[8] = 0xA9 ^ 0x90;
    }

    private static boolean lllIIIlIIll(int n, int n2) {
        return n == n2;
    }

    private static boolean IIIlIIlIIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean llllllIIIll(int n, int n2) {
        return n < n2;
    }

    private static boolean lIlIIIlIIll(int n, int n2) {
        return n <= n2;
    }

    private static boolean IIlIIIlIIll(int n) {
        return n != 0;
    }

    private static boolean IllIIIlIIll(int n) {
        return n == 0;
    }

    private static boolean llIlIIlIIll(int n) {
        return n >= 0;
    }

    private static boolean llIIIIlIIll(int n) {
        return n <= 0;
    }

    private static boolean IIllIIlIIll(int n) {
        return n > 0;
    }

    private static boolean lIIlIIlIIll(int n, int n2) {
        return n != n2;
    }

    private static int IlIlIIlIIll(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

