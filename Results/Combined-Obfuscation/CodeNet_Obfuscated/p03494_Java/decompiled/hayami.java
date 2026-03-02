/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class hayami
implements Closeable {
    private final InputStream in = System.in;
    private final byte[] hayami = new byte[lllIlIl[0]];
    private int Hayami = lllIlIl[1];
    private int saori = lllIlIl[1];
    private static int[] lllIlIl;

    hayami() {
        hayami llIllllIIIIIlIl;
    }

    private boolean HayamiSaori() {
        hayami IIIllllIIIIIlIl;
        if (hayami.IllIlIIIl(IIIllllIIIIIlIl.Hayami, IIIllllIIIIIlIl.saori)) {
            return lllIlIl[2];
        }
        IIIllllIIIIIlIl.Hayami = lllIlIl[1];
        try {
            IIIllllIIIIIlIl.saori = IIIllllIIIIIlIl.in.read(IIIllllIIIIIlIl.hayami);
            "".length();
        }
        catch (IOException lllIlllIIIIIlIl) {
            lllIlllIIIIIlIl.printStackTrace();
        }
        if (((0x52 ^ 0x1D ^ (1 ^ 0x1A) << (" ".length() << " ".length())) << " ".length() & (((0xE1 ^ 0xB4) << " ".length() ^ 124 + 53 - 170 + 130) << " ".length() ^ -" ".length())) >= " ".length()) {
            return ((128 + 169 - 131 + 5 ^ (0x56 ^ 0x75) << (" ".length() << " ".length())) << " ".length() & ((59 + 86 - 4 + 14 ^ (0x2F ^ 0) << (" ".length() << " ".length())) << " ".length() ^ -" ".length())) != 0;
        }
        if (hayami.IIIllIIIl(IIIllllIIIIIlIl.saori)) {
            return lllIlIl[1];
        }
        return lllIlIl[2];
    }

    private int SaoriHayami() {
        hayami lIlIlllIIIIIlIl;
        if (hayami.lIIllIIIl(lIlIlllIIIIIlIl.HayamiSaori() ? 1 : 0)) {
            int n = lIlIlllIIIIIlIl.Hayami;
            lIlIlllIIIIIlIl.Hayami = n + lllIlIl[2];
            return lIlIlllIIIIIlIl.hayami[n];
        }
        return lllIlIl[3];
    }

    private static boolean hayami_saori(int llIIlllIIIIIlIl) {
        int n;
        if (hayami.IlIllIIIl(lllIlIl[4], llIIlllIIIIIlIl) && hayami.IlIllIIIl(llIIlllIIIIIlIl, lllIlIl[5])) {
            n = lllIlIl[2];
            "".length();
            if (null != null) {
                return (((0x6C ^ 0x6B) << (0xB5 ^ 0xB0) ^ 145 + 16 - 25 + 31) & ((0x14 ^ 0x2B) << " ".length() ^ (0x4C ^ 0x75) ^ -" ".length())) != 0;
            }
        } else {
            n = lllIlIl[1];
        }
        return n != 0;
    }

    public boolean hayamisaori() {
        hayami lIIIlllIIIIIlIl;
        while (hayami.lIIllIIIl(lIIIlllIIIIIlIl.HayamiSaori() ? 1 : 0) && hayami.llIllIIIl(hayami.hayami_saori(lIIIlllIIIIIlIl.hayami[lIIIlllIIIIIlIl.Hayami]) ? 1 : 0)) {
            lIIIlllIIIIIlIl.Hayami += lllIlIl[2];
            "".length();
            if ((((0x23 ^ 0x5A) << " ".length() ^ 71 + 38 - -34 + 30) & (189 + 48 - 197 + 183 ^ " ".length() << (0x28 ^ 0x2F) ^ -" ".length())) == 0) continue;
            return (((0x26 ^ 0x1B) << (" ".length() << " ".length()) ^ 124 + 160 - 125 + 30) & ((0x98 ^ 0x83) << " ".length() ^ 104 + 4 - 106 + 125 ^ -" ".length())) != 0;
        }
        return this.HayamiSaori();
    }

    /*
     * WARNING - void declaration
     */
    public String nextHayami() {
        void var1_1;
        hayami lIllIllIIIIIlIl;
        if (hayami.llIllIIIl(lIllIllIIIIIlIl.hayamisaori() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IIllIllIIIIIlIl = new StringBuilder();
        int llIlIllIIIIIlIl = lIllIllIIIIIlIl.SaoriHayami();
        while (hayami.lIIllIIIl(hayami.hayami_saori(llIlIllIIIIIlIl) ? 1 : 0)) {
            IIllIllIIIIIlIl.appendCodePoint(llIlIllIIIIIlIl);
            "".length();
            llIlIllIIIIIlIl = lIllIllIIIIIlIl.SaoriHayami();
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long saorihayami() {
        hayami IllIIllIIIIIlIl;
        if (hayami.llIllIIIl(IllIIllIIIIIlIl.hayamisaori() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long lIlIIllIIIIIlIl = 0L;
        int IIlIIllIIIIIlIl = lllIlIl[1];
        int llIIIllIIIIIlIl = IllIIllIIIIIlIl.SaoriHayami();
        if (hayami.IIlllIIIl(llIIIllIIIIIlIl, lllIlIl[6])) {
            IIlIIllIIIIIlIl = lllIlIl[2];
            llIIIllIIIIIlIl = IllIIllIIIIIlIl.SaoriHayami();
        }
        if (!hayami.lIlllIIIl(llIIIllIIIIIlIl, lllIlIl[7]) || hayami.IllIlIIIl(lllIlIl[8], llIIIllIIIIIlIl)) {
            throw new NumberFormatException();
        }
        do {
            if (hayami.IlIllIIIl(lllIlIl[7], llIIIllIIIIIlIl) && hayami.IlIllIIIl(llIIIllIIIIIlIl, lllIlIl[8])) {
                lIlIIllIIIIIlIl *= 10L;
                lIlIIllIIIIIlIl += (long)(llIIIllIIIIIlIl - lllIlIl[7]);
                "".length();
                if (-"  ".length() >= 0) {
                    return 0L;
                }
            } else {
                if (!hayami.IllllIIIl(llIIIllIIIIIlIl, lllIlIl[3]) || hayami.llIllIIIl(hayami.hayami_saori(llIIIllIIIIIlIl) ? 1 : 0)) {
                    long l;
                    if (hayami.lIIllIIIl(IIlIIllIIIIIlIl)) {
                        l = -lIlIIllIIIIIlIl;
                        "".length();
                        if (-"  ".length() >= 0) {
                            return 0L;
                        }
                    } else {
                        l = lIlIIllIIIIIlIl;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.SaoriHayami();
            "".length();
        } while ("   ".length() != -" ".length());
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int saori_hayami() {
        void var1_1;
        hayami IIIIIllIIIIIlIl;
        long lllllIlIIIIIlIl = IIIIIllIIIIIlIl.saorihayami();
        if (!hayami.IIIIIlIIl(hayami.lllllIIIl(lllllIlIIIIIlIl, Integer.MIN_VALUE)) || hayami.lIIIIlIIl(hayami.lllllIIIl(lllllIlIIIIIlIl, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double Hayamin() {
        hayami lIlllIlIIIIIlIl;
        return Double.parseDouble(lIlllIlIIIIIlIl.nextHayami());
    }

    @Override
    public void close() {
        try {
            hayami IlIllIlIIIIIlIl;
            IlIllIlIIIIIlIl.in.close();
            "".length();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        if ("   ".length() <= 0) {
            return;
        }
    }

    static {
        hayami.IIlIlIIIl();
    }

    private static void IIlIlIIIl() {
        lllIlIl = new int[9];
        hayami.lllIlIl[0] = " ".length() << ((0x39 ^ 0x3C) << " ".length());
        hayami.lllIlIl[1] = " ".length() << (" ".length() << " ".length()) & (" ".length() << (" ".length() << " ".length()) ^ -" ".length());
        hayami.lllIlIl[2] = " ".length();
        hayami.lllIlIl[3] = -" ".length();
        hayami.lllIlIl[4] = 0x36 ^ 0x17;
        hayami.lllIlIl[5] = (0x8F ^ 0xB0) << " ".length();
        hayami.lllIlIl[6] = 8 ^ 0x25;
        hayami.lllIlIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        hayami.lllIlIl[8] = 0x68 ^ 0x51;
    }

    private static boolean IIlllIIIl(int n, int n2) {
        return n == n2;
    }

    private static boolean lIlllIIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IllIlIIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IlIllIIIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean lIIllIIIl(int n) {
        return n != 0;
    }

    private static boolean llIllIIIl(int n) {
        return n == 0;
    }

    private static boolean IIIIIlIIl(int n) {
        return n >= 0;
    }

    private static boolean IIIllIIIl(int n) {
        return n <= 0;
    }

    private static boolean lIIIIlIIl(int n) {
        return n > 0;
    }

    private static boolean IllllIIIl(int n, int n2) {
        return n != n2;
    }

    private static int lllllIIIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

