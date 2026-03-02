/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[IllIIlIlIl[0]];
    private int ptr = IllIIlIlIl[1];
    private int buflen = IllIIlIlIl[1];
    private static int[] IllIIlIlIl;

    FastScanner() {
        FastScanner lIlIIlIlIIIl;
    }

    private boolean hasNextByte() {
        FastScanner IlIIIlIlIIIl;
        if (FastScanner.llllIllIlIIl(IlIIIlIlIIIl.ptr, IlIIIlIlIIIl.buflen)) {
            return IllIIlIlIl[2];
        }
        IlIIIlIlIIIl.ptr = IllIIlIlIl[1];
        try {
            IlIIIlIlIIIl.buflen = IlIIIlIlIIIl.in.read(IlIIIlIlIIIl.buffer);
            "".length();
        }
        catch (IOException lIIIIlIlIIIl) {
            lIIIIlIlIIIl.printStackTrace();
        }
        if (-(0x2F ^ 0x2B) >= 0) {
            return ((0x46 ^ 0x63) << " ".length() & ~((0x60 ^ 0x45) << " ".length())) != 0;
        }
        if (FastScanner.lIIIlllIlIIl(IlIIIlIlIIIl.buflen)) {
            return IllIIlIlIl[1];
        }
        return IllIIlIlIl[2];
    }

    private int readByte() {
        FastScanner lllllIIlIIIl;
        if (FastScanner.IlIIlllIlIIl(lllllIIlIIIl.hasNextByte() ? 1 : 0)) {
            int n = lllllIIlIIIl.ptr;
            lllllIIlIIIl.ptr = n + IllIIlIlIl[2];
            return lllllIIlIIIl.buffer[n];
        }
        return IllIIlIlIl[3];
    }

    private static boolean isPrintableChar(int lIlllIIlIIIl) {
        int n;
        if (FastScanner.llIIlllIlIIl(IllIIlIlIl[4], lIlllIIlIIIl) && FastScanner.llIIlllIlIIl(lIlllIIlIIIl, IllIIlIlIl[5])) {
            n = IllIIlIlIl[2];
            "".length();
            if ((((0x8D ^ 0x8A) << (" ".length() << " ".length()) ^ (0x1B ^ 0x1C)) & ((0x5D ^ 0x46) << "   ".length() ^ 168 + 142 - 157 + 42 ^ -" ".length())) != 0) {
                return (" ".length() & (" ".length() ^ -" ".length())) != 0;
            }
        } else {
            n = IllIIlIlIl[1];
        }
        return n != 0;
    }

    public boolean hasNext() {
        FastScanner llIllIIlIIIl;
        while (FastScanner.IlIIlllIlIIl(llIllIIlIIIl.hasNextByte() ? 1 : 0) && FastScanner.IIlIlllIlIIl(FastScanner.isPrintableChar(llIllIIlIIIl.buffer[llIllIIlIIIl.ptr]) ? 1 : 0)) {
            llIllIIlIIIl.ptr += IllIIlIlIl[2];
            "".length();
            if (" ".length() <= " ".length() << (" ".length() << " ".length())) continue;
            return ((0x8C ^ 0xC7 ^ (0xBC ^ 0x91) << " ".length()) << (" ".length() << " ".length()) & (((0x80 ^ 0xB9) << " ".length() ^ (0xC6 ^ 0xA5)) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
        }
        return this.hasNextByte();
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        FastScanner lllIlIIlIIIl;
        if (FastScanner.IIlIlllIlIIl(lllIlIIlIIIl.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IllIlIIlIIIl = new StringBuilder();
        int lIlIlIIlIIIl = lllIlIIlIIIl.readByte();
        while (FastScanner.IlIIlllIlIIl(FastScanner.isPrintableChar(lIlIlIIlIIIl) ? 1 : 0)) {
            IllIlIIlIIIl.appendCodePoint(lIlIlIIlIIIl);
            "".length();
            lIlIlIIlIIIl = lllIlIIlIIIl.readByte();
            "".length();
            if (" ".length() << " ".length() != 0) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        FastScanner IIIIlIIlIIIl;
        if (FastScanner.IIlIlllIlIIl(IIIIlIIlIIIl.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long llllIIIlIIIl = 0L;
        int IlllIIIlIIIl = IllIIlIlIl[1];
        int lIllIIIlIIIl = IIIIlIIlIIIl.readByte();
        if (FastScanner.lIlIlllIlIIl(lIllIIIlIIIl, IllIIlIlIl[6])) {
            IlllIIIlIIIl = IllIIlIlIl[2];
            lIllIIIlIIIl = IIIIlIIlIIIl.readByte();
        }
        if (!FastScanner.IllIlllIlIIl(lIllIIIlIIIl, IllIIlIlIl[7]) || FastScanner.llllIllIlIIl(IllIIlIlIl[8], lIllIIIlIIIl)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.llIIlllIlIIl(IllIIlIlIl[7], lIllIIIlIIIl) && FastScanner.llIIlllIlIIl(lIllIIIlIIIl, IllIIlIlIl[8])) {
                llllIIIlIIIl *= 10L;
                llllIIIlIIIl += (long)(lIllIIIlIIIl - IllIIlIlIl[7]);
                "".length();
                if (((92 + 96 - 163 + 142 ^ (0x58 ^ 0x11) << " ".length()) & (0xD2 ^ 0x9F ^ (0x56 ^ 0x59) << "   ".length() ^ -" ".length())) < 0) {
                    return 0L;
                }
            } else {
                if (!FastScanner.lllIlllIlIIl(lIllIIIlIIIl, IllIIlIlIl[3]) || FastScanner.IIlIlllIlIIl(FastScanner.isPrintableChar(lIllIIIlIIIl) ? 1 : 0)) {
                    long l;
                    if (FastScanner.IlIIlllIlIIl(IlllIIIlIIIl)) {
                        l = -llllIIIlIIIl;
                        "".length();
                        if (("   ".length() << (" ".length() << (" ".length() << " ".length())) & ~("   ".length() << (" ".length() << (" ".length() << " ".length())))) < 0) {
                            return 0L;
                        }
                    } else {
                        l = llllIIIlIIIl;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            "".length();
        } while (((" ".length() << (0x67 ^ 0x62) ^ (0x8F ^ 0xAA)) << (" ".length() << (" ".length() << " ".length())) & (((0xBB ^ 0x98) << " ".length() ^ (0x7A ^ 0x39)) << (" ".length() << (" ".length() << " ".length())) ^ -" ".length())) == 0);
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int nextInt() {
        void var1_1;
        FastScanner IlIlIIIlIIIl;
        long lIIlIIIlIIIl = IlIlIIIlIIIl.nextLong();
        if (!FastScanner.IlIllllIlIIl(FastScanner.lIIllllIlIIl(lIIlIIIlIIIl, Integer.MIN_VALUE)) || FastScanner.llIllllIlIIl(FastScanner.lIIllllIlIIl(lIIlIIIlIIIl, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double nextDouble() {
        FastScanner lllIIIIlIIIl;
        return Double.parseDouble(lllIIIIlIIIl.next());
    }

    static {
        FastScanner.IlllIllIlIIl();
    }

    private static void IlllIllIlIIl() {
        IllIIlIlIl = new int[9];
        FastScanner.IllIIlIlIl[0] = " ".length() << ((0x2A ^ 0x2F) << " ".length());
        FastScanner.IllIIlIlIl[1] = " ".length() << " ".length() & (" ".length() << " ".length() ^ -" ".length());
        FastScanner.IllIIlIlIl[2] = " ".length();
        FastScanner.IllIIlIlIl[3] = -" ".length();
        FastScanner.IllIIlIlIl[4] = 0x35 ^ 0x14;
        FastScanner.IllIIlIlIl[5] = (0x10 ^ 0x2F) << " ".length();
        FastScanner.IllIIlIlIl[6] = 3 ^ 0x2E;
        FastScanner.IllIIlIlIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.IllIIlIlIl[8] = 0xB6 ^ 0x8F;
    }

    private static boolean lIlIlllIlIIl(int n, int n2) {
        return n == n2;
    }

    private static boolean IllIlllIlIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean llllIllIlIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean llIIlllIlIIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean IlIIlllIlIIl(int n) {
        return n != 0;
    }

    private static boolean IIlIlllIlIIl(int n) {
        return n == 0;
    }

    private static boolean IlIllllIlIIl(int n) {
        return n >= 0;
    }

    private static boolean lIIIlllIlIIl(int n) {
        return n <= 0;
    }

    private static boolean llIllllIlIIl(int n) {
        return n > 0;
    }

    private static boolean lllIlllIlIIl(int n, int n2) {
        return n != n2;
    }

    private static int lIIllllIlIIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

