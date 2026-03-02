/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[IIlIIIIll[0]];
    private int ptr = IIlIIIIll[1];
    private int buflen = IIlIIIIll[1];
    private static int[] IIlIIIIll;

    FastScanner() {
        FastScanner lIIIIlIIlIllIl;
    }

    private boolean hasNextByte() {
        FastScanner IllllIIIlIllIl;
        if (FastScanner.lIIlIIlIlIl(IllllIIIlIllIl.ptr, IllllIIIlIllIl.buflen)) {
            return IIlIIIIll[2];
        }
        IllllIIIlIllIl.ptr = IIlIIIIll[1];
        try {
            IllllIIIlIllIl.buflen = IllllIIIlIllIl.in.read(IllllIIIlIllIl.buffer);
            "".length();
        }
        catch (IOException lIlllIIIlIllIl) {
            lIlllIIIlIllIl.printStackTrace();
        }
        if ((((0x7D ^ 0x46) << " ".length() ^ (0x49 ^ 0x2C)) << (" ".length() << " ".length()) & ((0xCA ^ 0x8F ^ (0xE8 ^ 0xC3) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length())) < 0) {
            return ((0xE3 ^ 0x8A ^ (0xBB ^ 0x84) << " ".length()) << (" ".length() << " ".length()) & (((0x74 ^ 0x79) << (" ".length() << (" ".length() << " ".length())) ^ 154 + 12 - 61 + 94) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
        }
        if (FastScanner.IlIlIIlIlIl(IllllIIIlIllIl.buflen)) {
            return IIlIIIIll[1];
        }
        return IIlIIIIll[2];
    }

    private int readByte() {
        FastScanner llIllIIIlIllIl;
        if (FastScanner.llIlIIlIlIl(llIllIIIlIllIl.hasNextByte() ? 1 : 0)) {
            int n = llIllIIIlIllIl.ptr;
            llIllIIIlIllIl.ptr = n + IIlIIIIll[2];
            return llIllIIIlIllIl.buffer[n];
        }
        return IIlIIIIll[3];
    }

    private static boolean isPrintableChar(int lIIllIIIlIllIl) {
        int n;
        if (FastScanner.IIllIIlIlIl(IIlIIIIll[4], lIIllIIIlIllIl) && FastScanner.IIllIIlIlIl(lIIllIIIlIllIl, IIlIIIIll[5])) {
            n = IIlIIIIll[2];
            "".length();
            if (" ".length() < -" ".length()) {
                return (((0x43 ^ 0x7C) << " ".length() ^ (0xEB ^ 0x8A)) << " ".length() & (((0x9C ^ 0x8B) << " ".length() ^ (0x38 ^ 9)) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            n = IIlIIIIll[1];
        }
        return n != 0;
    }

    public boolean hasNext() {
        FastScanner lllIlIIIlIllIl;
        while (FastScanner.llIlIIlIlIl(lllIlIIIlIllIl.hasNextByte() ? 1 : 0) && FastScanner.lIllIIlIlIl(FastScanner.isPrintableChar(lllIlIIIlIllIl.buffer[lllIlIIIlIllIl.ptr]) ? 1 : 0)) {
            lllIlIIIlIllIl.ptr += IIlIIIIll[2];
            "".length();
            if (-" ".length() <= -" ".length()) continue;
            return ((0x93 ^ 0x9A) << (" ".length() << " ".length()) & ~((0xC8 ^ 0xC1) << (" ".length() << " ".length()))) != 0;
        }
        return this.hasNextByte();
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        FastScanner llIIlIIIlIllIl;
        if (FastScanner.lIllIIlIlIl(llIIlIIIlIllIl.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IlIIlIIIlIllIl = new StringBuilder();
        int lIIIlIIIlIllIl = llIIlIIIlIllIl.readByte();
        while (FastScanner.llIlIIlIlIl(FastScanner.isPrintableChar(lIIIlIIIlIllIl) ? 1 : 0)) {
            IlIIlIIIlIllIl.appendCodePoint(lIIIlIIIlIllIl);
            "".length();
            lIIIlIIIlIllIl = llIIlIIIlIllIl.readByte();
            "".length();
            if (-" ".length() < " ".length() << (" ".length() << " ".length())) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        FastScanner IIllIIIIlIllIl;
        if (FastScanner.lIllIIlIlIl(IIllIIIIlIllIl.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long llIlIIIIlIllIl = 0L;
        int IlIlIIIIlIllIl = IIlIIIIll[1];
        int lIIlIIIIlIllIl = IIllIIIIlIllIl.readByte();
        if (FastScanner.IlllIIlIlIl(lIIlIIIIlIllIl, IIlIIIIll[6])) {
            IlIlIIIIlIllIl = IIlIIIIll[2];
            lIIlIIIIlIllIl = IIllIIIIlIllIl.readByte();
        }
        if (!FastScanner.llllIIlIlIl(lIIlIIIIlIllIl, IIlIIIIll[7]) || FastScanner.lIIlIIlIlIl(IIlIIIIll[8], lIIlIIIIlIllIl)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.IIllIIlIlIl(IIlIIIIll[7], lIIlIIIIlIllIl) && FastScanner.IIllIIlIlIl(lIIlIIIIlIllIl, IIlIIIIll[8])) {
                llIlIIIIlIllIl *= 10L;
                llIlIIIIlIllIl += (long)(lIIlIIIIlIllIl - IIlIIIIll[7]);
                "".length();
                if ("   ".length() >= " ".length() << (" ".length() << " ".length())) {
                    return 0L;
                }
            } else {
                if (!FastScanner.IIIIlIlIlIl(lIIlIIIIlIllIl, IIlIIIIll[3]) || FastScanner.lIllIIlIlIl(FastScanner.isPrintableChar(lIIlIIIIlIllIl) ? 1 : 0)) {
                    long l;
                    if (FastScanner.llIlIIlIlIl(IlIlIIIIlIllIl)) {
                        l = -llIlIIIIlIllIl;
                        "".length();
                        if (-((0xA6 ^ 0xA3) << "   ".length() ^ (0x60 ^ 0x6B) << (" ".length() << " ".length())) >= 0) {
                            return 0L;
                        }
                    } else {
                        l = llIlIIIIlIllIl;
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
        FastScanner IllIIIIIlIllIl;
        long lIlIIIIIlIllIl = IllIIIIIlIllIl.nextLong();
        if (!FastScanner.IlIIlIlIlIl(FastScanner.lIIIlIlIlIl(lIlIIIIIlIllIl, Integer.MIN_VALUE)) || FastScanner.llIIlIlIlIl(FastScanner.lIIIlIlIlIl(lIlIIIIIlIllIl, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double nextDouble() {
        FastScanner llIIIIIIlIllIl;
        return Double.parseDouble(llIIIIIIlIllIl.next());
    }

    static {
        FastScanner.IIIlIIlIlIl();
    }

    private static void IIIlIIlIlIl() {
        IIlIIIIll = new int[9];
        FastScanner.IIlIIIIll[0] = " ".length() << ((0x86 ^ 0x83) << " ".length());
        FastScanner.IIlIIIIll[1] = (0xF6 ^ 0xBB) & ~(0x45 ^ 8);
        FastScanner.IIlIIIIll[2] = " ".length();
        FastScanner.IIlIIIIll[3] = -" ".length();
        FastScanner.IIlIIIIll[4] = 0xB2 ^ 0x93;
        FastScanner.IIlIIIIll[5] = (0xC9 ^ 0xBE ^ (0x91 ^ 0x98) << "   ".length()) << " ".length();
        FastScanner.IIlIIIIll[6] = 0x6C ^ 0x2F ^ (0x7C ^ 0x4B) << " ".length();
        FastScanner.IIlIIIIll[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.IIlIIIIll[8] = 0x66 ^ 0x31 ^ (0x88 ^ 0xBF) << " ".length();
    }

    private static boolean IlllIIlIlIl(int n, int n2) {
        return n == n2;
    }

    private static boolean llllIIlIlIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIIlIIlIlIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IIllIIlIlIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean llIlIIlIlIl(int n) {
        return n != 0;
    }

    private static boolean lIllIIlIlIl(int n) {
        return n == 0;
    }

    private static boolean IlIIlIlIlIl(int n) {
        return n >= 0;
    }

    private static boolean IlIlIIlIlIl(int n) {
        return n <= 0;
    }

    private static boolean llIIlIlIlIl(int n) {
        return n > 0;
    }

    private static boolean IIIIlIlIlIl(int n, int n2) {
        return n != n2;
    }

    private static int lIIIlIlIlIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

