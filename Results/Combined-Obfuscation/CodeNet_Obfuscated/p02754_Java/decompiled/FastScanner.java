/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[IlllIIIll[0]];
    private int ptr = IlllIIIll[1];
    private int buflen = IlllIIIll[1];
    private static int[] IlllIIIll;

    FastScanner() {
        FastScanner lIIIIIIIIIllIl;
    }

    private boolean hasNextByte() {
        FastScanner IlllllllllIlIl;
        if (FastScanner.IIllIllIlIl(IlllllllllIlIl.ptr, IlllllllllIlIl.buflen)) {
            return IlllIIIll[2];
        }
        IlllllllllIlIl.ptr = IlllIIIll[1];
        try {
            IlllllllllIlIl.buflen = IlllllllllIlIl.in.read(IlllllllllIlIl.buffer);
            "".length();
        }
        catch (IOException lIllllllllIlIl) {
            lIllllllllIlIl.printStackTrace();
        }
        if (" ".length() << (" ".length() << " ".length()) == 0) {
            return ((91 + 31 - 118 + 171 ^ (0xEF ^ 0xBE) << " ".length()) << (" ".length() << " ".length()) & (((0xA2 ^ 0xBD) << " ".length() ^ (0xA5 ^ 0x96)) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
        }
        if (FastScanner.lIllIllIlIl(IlllllllllIlIl.buflen)) {
            return IlllIIIll[1];
        }
        return IlllIIIll[2];
    }

    private int readByte() {
        FastScanner llIlllllllIlIl;
        if (FastScanner.IlllIllIlIl(llIlllllllIlIl.hasNextByte() ? 1 : 0)) {
            int n = llIlllllllIlIl.ptr;
            llIlllllllIlIl.ptr = n + IlllIIIll[2];
            return llIlllllllIlIl.buffer[n];
        }
        return IlllIIIll[3];
    }

    private static boolean isPrintableChar(int lIIlllllllIlIl) {
        int n;
        if (FastScanner.llllIllIlIl(IlllIIIll[4], lIIlllllllIlIl) && FastScanner.llllIllIlIl(lIIlllllllIlIl, IlllIIIll[5])) {
            n = IlllIIIll[2];
            "".length();
            if ((0x5D ^ 0x58) == 0) {
                return ((0x5E ^ 0x77) & ~(0x8A ^ 0xA3)) != 0;
            }
        } else {
            n = IlllIIIll[1];
        }
        return n != 0;
    }

    public boolean hasNext() {
        FastScanner lllIllllllIlIl;
        while (FastScanner.IlllIllIlIl(lllIllllllIlIl.hasNextByte() ? 1 : 0) && FastScanner.IIIIlllIlIl(FastScanner.isPrintableChar(lllIllllllIlIl.buffer[lllIllllllIlIl.ptr]) ? 1 : 0)) {
            lllIllllllIlIl.ptr += IlllIIIll[2];
            "".length();
            if (((0x8B ^ 0x9C) << " ".length() & ~((0x31 ^ 0x26) << " ".length()) & ~((0x10 ^ 5) << (" ".length() << " ".length()) & ~((0x39 ^ 0x2C) << (" ".length() << " ".length())))) == 0) continue;
            return ((0x7B ^ 0x3E) & ~(0xC5 ^ 0x80)) != 0;
        }
        return this.hasNextByte();
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        FastScanner llIIllllllIlIl;
        if (FastScanner.IIIIlllIlIl(llIIllllllIlIl.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IlIIllllllIlIl = new StringBuilder();
        int lIIIllllllIlIl = llIIllllllIlIl.readByte();
        while (FastScanner.IlllIllIlIl(FastScanner.isPrintableChar(lIIIllllllIlIl) ? 1 : 0)) {
            IlIIllllllIlIl.appendCodePoint(lIIIllllllIlIl);
            "".length();
            lIIIllllllIlIl = llIIllllllIlIl.readByte();
            "".length();
            if (" ".length() >= 0) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        FastScanner IIllIlllllIlIl;
        if (FastScanner.IIIIlllIlIl(IIllIlllllIlIl.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long llIlIlllllIlIl = 0L;
        int IlIlIlllllIlIl = IlllIIIll[1];
        int lIIlIlllllIlIl = IIllIlllllIlIl.readByte();
        if (FastScanner.lIIIlllIlIl(lIIlIlllllIlIl, IlllIIIll[6])) {
            IlIlIlllllIlIl = IlllIIIll[2];
            lIIlIlllllIlIl = IIllIlllllIlIl.readByte();
        }
        if (!FastScanner.IlIIlllIlIl(lIIlIlllllIlIl, IlllIIIll[7]) || FastScanner.IIllIllIlIl(IlllIIIll[8], lIIlIlllllIlIl)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.llllIllIlIl(IlllIIIll[7], lIIlIlllllIlIl) && FastScanner.llllIllIlIl(lIIlIlllllIlIl, IlllIIIll[8])) {
                llIlIlllllIlIl *= 10L;
                llIlIlllllIlIl += (long)(lIIlIlllllIlIl - IlllIIIll[7]);
                "".length();
                if (null != null) {
                    return 0L;
                }
            } else {
                if (!FastScanner.llIIlllIlIl(lIIlIlllllIlIl, IlllIIIll[3]) || FastScanner.IIIIlllIlIl(FastScanner.isPrintableChar(lIIlIlllllIlIl) ? 1 : 0)) {
                    long l;
                    if (FastScanner.IlllIllIlIl(IlIlIlllllIlIl)) {
                        l = -llIlIlllllIlIl;
                        "".length();
                        if (" ".length() << " ".length() == -" ".length()) {
                            return 0L;
                        }
                    } else {
                        l = llIlIlllllIlIl;
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

    /*
     * WARNING - void declaration
     */
    public int nextInt() {
        void var1_1;
        FastScanner IllIIlllllIlIl;
        long lIlIIlllllIlIl = IllIIlllllIlIl.nextLong();
        if (!FastScanner.lIlIlllIlIl(FastScanner.IIlIlllIlIl(lIlIIlllllIlIl, Integer.MIN_VALUE)) || FastScanner.IllIlllIlIl(FastScanner.IIlIlllIlIl(lIlIIlllllIlIl, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double nextDouble() {
        FastScanner llIIIlllllIlIl;
        return Double.parseDouble(llIIIlllllIlIl.next());
    }

    static {
        FastScanner.llIlIllIlIl();
    }

    private static void llIlIllIlIl() {
        IlllIIIll = new int[9];
        FastScanner.IlllIIIll[0] = " ".length() << ((15 + 87 - 88 + 149 ^ (0x19 ^ 0x4A) << " ".length()) << " ".length());
        FastScanner.IlllIIIll[1] = (0x32 ^ 0xF) & ~(0xB6 ^ 0x8B);
        FastScanner.IlllIIIll[2] = " ".length();
        FastScanner.IlllIIIll[3] = -" ".length();
        FastScanner.IlllIIIll[4] = 0xDD ^ 0xBC ^ " ".length() << ("   ".length() << " ".length());
        FastScanner.IlllIIIll[5] = ((0xB5 ^ 0xAA) << " ".length() ^ " ".length()) << " ".length();
        FastScanner.IlllIIIll[6] = (0xEE ^ 0xC3) << (" ".length() << " ".length()) ^ 105 + 86 - 116 + 78;
        FastScanner.IlllIIIll[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.IlllIIIll[8] = 0x7B ^ 0x42;
    }

    private static boolean lIIIlllIlIl(int n, int n2) {
        return n == n2;
    }

    private static boolean IlIIlllIlIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIllIllIlIl(int n, int n2) {
        return n < n2;
    }

    private static boolean llllIllIlIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean IlllIllIlIl(int n) {
        return n != 0;
    }

    private static boolean IIIIlllIlIl(int n) {
        return n == 0;
    }

    private static boolean lIlIlllIlIl(int n) {
        return n >= 0;
    }

    private static boolean lIllIllIlIl(int n) {
        return n <= 0;
    }

    private static boolean IllIlllIlIl(int n) {
        return n > 0;
    }

    private static boolean llIIlllIlIl(int n, int n2) {
        return n != n2;
    }

    private static int IIlIlllIlIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

