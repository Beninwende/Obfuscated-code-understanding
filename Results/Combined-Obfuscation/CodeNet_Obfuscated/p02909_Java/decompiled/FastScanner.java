/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[IIlllll[0]];
    private int ptr = IIlllll[1];
    private int buflen = IIlllll[1];
    private static int[] IIlllll;

    FastScanner() {
        FastScanner llIIIllIllIlIIl;
    }

    private boolean hasNextByte() {
        FastScanner IIIIIllIllIlIIl;
        if (FastScanner.lllIIlIll(IIIIIllIllIlIIl.ptr, IIIIIllIllIlIIl.buflen)) {
            return IIlllll[2];
        }
        IIIIIllIllIlIIl.ptr = IIlllll[1];
        try {
            IIIIIllIllIlIIl.buflen = IIIIIllIllIlIIl.in.read(IIIIIllIllIlIIl.buffer);
            "".length();
        }
        catch (IOException lllllIlIllIlIIl) {
            lllllIlIllIlIIl.printStackTrace();
        }
        if (-"  ".length() > 0) {
            return ((0xC4 ^ 0xC3) << " ".length() & ~((0x2F ^ 0x28) << " ".length())) != 0;
        }
        if (FastScanner.IIIlIlIll(IIIIIllIllIlIIl.buflen)) {
            return IIlllll[1];
        }
        return IIlllll[2];
    }

    private int readByte() {
        FastScanner lIlllIlIllIlIIl;
        if (FastScanner.lIIlIlIll(lIlllIlIllIlIIl.hasNextByte() ? 1 : 0)) {
            int n = lIlllIlIllIlIIl.ptr;
            lIlllIlIllIlIIl.ptr = n + IIlllll[2];
            return lIlllIlIllIlIIl.buffer[n];
        }
        return IIlllll[3];
    }

    private boolean isPrintableChar(int llIllIlIllIlIIl) {
        int n;
        if (FastScanner.IlIlIlIll(IIlllll[4], llIllIlIllIlIIl) && FastScanner.IlIlIlIll(llIllIlIllIlIIl, IIlllll[5])) {
            n = IIlllll[2];
            "".length();
            if (((0xC2 ^ 0xC5) << (" ".length() << " ".length()) & ~((0x45 ^ 0x42) << (" ".length() << " ".length()))) != ((0x3B ^ 0x2E) << " ".length() & ~((0xD3 ^ 0xC6) << " ".length()))) {
                return ("   ".length() << (" ".length() << " ".length()) & ~("   ".length() << (" ".length() << " ".length()))) != 0;
            }
        } else {
            n = IIlllll[1];
        }
        return n != 0;
    }

    public boolean hasNext() {
        FastScanner lIIllIlIllIlIIl;
        while (FastScanner.lIIlIlIll(lIIllIlIllIlIIl.hasNextByte() ? 1 : 0) && FastScanner.llIlIlIll(lIIllIlIllIlIIl.isPrintableChar(lIIllIlIllIlIIl.buffer[lIIllIlIllIlIIl.ptr]) ? 1 : 0)) {
            lIIllIlIllIlIIl.ptr += IIlllll[2];
            "".length();
            if ((((0x5F ^ 0x54) << " ".length() ^ (0x94 ^ 0x87)) << (" ".length() << " ".length()) & (((0x88 ^ 0xB5) << " ".length() ^ 19 + 99 - 58 + 67) << (" ".length() << " ".length()) ^ -" ".length())) <= "   ".length()) continue;
            return (("   ".length() << " ".length() ^ "   ".length()) << (" ".length() << (" ".length() << " ".length())) & ((156 + 121 - 172 + 68 ^ (0x9E ^ 0x8B) << "   ".length()) << (" ".length() << (" ".length() << " ".length())) ^ -" ".length())) != 0;
        }
        return this.hasNextByte();
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        FastScanner lIlIlIlIllIlIIl;
        if (FastScanner.llIlIlIll(lIlIlIlIllIlIIl.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IIlIlIlIllIlIIl = new StringBuilder();
        int llIIlIlIllIlIIl = lIlIlIlIllIlIIl.readByte();
        while (FastScanner.lIIlIlIll(lIlIlIlIllIlIIl.isPrintableChar(llIIlIlIllIlIIl) ? 1 : 0)) {
            IIlIlIlIllIlIIl.appendCodePoint(llIIlIlIllIlIIl);
            "".length();
            llIIlIlIllIlIIl = lIlIlIlIllIlIIl.readByte();
            "".length();
            if (-(0x93 ^ 0x96) < 0) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        FastScanner IlllIIlIllIlIIl;
        if (FastScanner.llIlIlIll(IlllIIlIllIlIIl.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long lIllIIlIllIlIIl = 0L;
        int IIllIIlIllIlIIl = IIlllll[1];
        int llIlIIlIllIlIIl = IlllIIlIllIlIIl.readByte();
        if (FastScanner.IIllIlIll(llIlIIlIllIlIIl, IIlllll[6])) {
            IIllIIlIllIlIIl = IIlllll[2];
            llIlIIlIllIlIIl = IlllIIlIllIlIIl.readByte();
        }
        if (!FastScanner.lIllIlIll(llIlIIlIllIlIIl, IIlllll[7]) || FastScanner.lllIIlIll(IIlllll[8], llIlIIlIllIlIIl)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.IlIlIlIll(IIlllll[7], llIlIIlIllIlIIl) && FastScanner.IlIlIlIll(llIlIIlIllIlIIl, IIlllll[8])) {
                lIllIIlIllIlIIl *= 10L;
                lIllIIlIllIlIIl += (long)(llIlIIlIllIlIIl - IIlllll[7]);
                "".length();
                if (" ".length() << " ".length() < " ".length() << " ".length()) {
                    return 0L;
                }
            } else {
                if (!FastScanner.IlllIlIll(llIlIIlIllIlIIl, IIlllll[3]) || FastScanner.llIlIlIll(IlllIIlIllIlIIl.isPrintableChar(llIlIIlIllIlIIl) ? 1 : 0)) {
                    long l;
                    if (FastScanner.lIIlIlIll(IIllIIlIllIlIIl)) {
                        l = -lIllIIlIllIlIIl;
                        "".length();
                        if (" ".length() <= 0) {
                            return 0L;
                        }
                    } else {
                        l = lIllIIlIllIlIIl;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            "".length();
        } while (null == null);
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int nextInt() {
        void var1_1;
        FastScanner IIIlIIlIllIlIIl;
        long lllIIIlIllIlIIl = IIIlIIlIllIlIIl.nextLong();
        if (!FastScanner.IIIIllIll(FastScanner.llllIlIll(lllIIIlIllIlIIl, Integer.MIN_VALUE)) || FastScanner.lIIIllIll(FastScanner.llllIlIll(lllIIIlIllIlIIl, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double nextDouble() {
        FastScanner lIlIIIlIllIlIIl;
        return Double.parseDouble(lIlIIIlIllIlIIl.next());
    }

    static {
        FastScanner.IllIIlIll();
    }

    private static void IllIIlIll() {
        IIlllll = new int[9];
        FastScanner.IIlllll[0] = " ".length() << ((0xA6 ^ 0xA3) << " ".length());
        FastScanner.IIlllll[1] = "   ".length() << (0x2A ^ 0x67 ^ (7 ^ 0xE) << "   ".length()) & ("   ".length() << (52 + 34 - 37 + 144 ^ (0x4B ^ 0x7A) << (" ".length() << " ".length())) ^ -" ".length());
        FastScanner.IIlllll[2] = " ".length();
        FastScanner.IIlllll[3] = -" ".length();
        FastScanner.IIlllll[4] = (0x6D ^ 0x64) << " ".length() ^ (0x41 ^ 0x72);
        FastScanner.IIlllll[5] = (0x1F ^ 0x20) << " ".length();
        FastScanner.IIlllll[6] = 0x40 ^ 0x13 ^ (0x63 ^ 0x5C) << " ".length();
        FastScanner.IIlllll[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.IIlllll[8] = 0xB9 ^ 0x80;
    }

    private static boolean IIllIlIll(int n, int n2) {
        return n == n2;
    }

    private static boolean lIllIlIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean lllIIlIll(int n, int n2) {
        return n < n2;
    }

    private static boolean IlIlIlIll(int n, int n2) {
        return n <= n2;
    }

    private static boolean lIIlIlIll(int n) {
        return n != 0;
    }

    private static boolean llIlIlIll(int n) {
        return n == 0;
    }

    private static boolean IIIIllIll(int n) {
        return n >= 0;
    }

    private static boolean IIIlIlIll(int n) {
        return n <= 0;
    }

    private static boolean lIIIllIll(int n) {
        return n > 0;
    }

    private static boolean IlllIlIll(int n, int n2) {
        return n != n2;
    }

    private static int llllIlIll(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

