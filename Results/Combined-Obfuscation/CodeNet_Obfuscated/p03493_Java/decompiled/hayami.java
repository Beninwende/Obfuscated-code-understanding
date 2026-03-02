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
    private final byte[] hayami = new byte[IlllIllIl[0]];
    private int Hayami = IlllIllIl[1];
    private int saori = IlllIllIl[1];
    private static int[] IlllIllIl;

    hayami() {
        hayami llllIIllllllIl;
    }

    private boolean HayamiSaori() {
        hayami IIllIIllllllIl;
        if (hayami.lIIlllllIIl(IIllIIllllllIl.Hayami, IIllIIllllllIl.saori)) {
            return IlllIllIl[2];
        }
        IIllIIllllllIl.Hayami = IlllIllIl[1];
        try {
            IIllIIllllllIl.saori = IIllIIllllllIl.in.read(IIllIIllllllIl.hayami);
            "".length();
        }
        catch (IOException llIlIIllllllIl) {
            llIlIIllllllIl.printStackTrace();
        }
        if (-"  ".length() > 0) {
            return ((1 ^ 8) & ~(0x17 ^ 0x1E)) != 0;
        }
        if (hayami.IlIlllllIIl(IIllIIllllllIl.saori)) {
            return IlllIllIl[1];
        }
        return IlllIllIl[2];
    }

    private int SaoriHayami() {
        hayami lIIlIIllllllIl;
        if (hayami.llIlllllIIl(lIIlIIllllllIl.HayamiSaori() ? 1 : 0)) {
            int n = lIIlIIllllllIl.Hayami;
            lIIlIIllllllIl.Hayami = n + IlllIllIl[2];
            return lIIlIIllllllIl.hayami[n];
        }
        return IlllIllIl[3];
    }

    private static boolean hayami_saori(int lllIIIllllllIl) {
        int n;
        if (hayami.IIllllllIIl(IlllIllIl[4], lllIIIllllllIl) && hayami.IIllllllIIl(lllIIIllllllIl, IlllIllIl[5])) {
            n = IlllIllIl[2];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) != " ".length() << (" ".length() << " ".length())) {
                return (" ".length() << ("   ".length() << " ".length()) & (" ".length() << ("   ".length() << " ".length()) ^ -" ".length())) != 0;
            }
        } else {
            n = IlllIllIl[1];
        }
        return n != 0;
    }

    public boolean hayamisaori() {
        hayami lIlIIIllllllIl;
        while (hayami.llIlllllIIl(lIlIIIllllllIl.HayamiSaori() ? 1 : 0) && hayami.lIllllllIIl(hayami.hayami_saori(lIlIIIllllllIl.hayami[lIlIIIllllllIl.Hayami]) ? 1 : 0)) {
            lIlIIIllllllIl.Hayami += IlllIllIl[2];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) >= ((0x5B ^ 8) & ~(0x2C ^ 0x7F))) continue;
            return ((0x1C ^ 0x11) << " ".length() & ~((0x2C ^ 0x21) << " ".length())) != 0;
        }
        return this.HayamiSaori();
    }

    /*
     * WARNING - void declaration
     */
    public String nextHayami() {
        void var1_1;
        hayami lIIIIIllllllIl;
        if (hayami.lIllllllIIl(lIIIIIllllllIl.hayamisaori() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IIIIIIllllllIl = new StringBuilder();
        int llllllIlllllIl = lIIIIIllllllIl.SaoriHayami();
        while (hayami.llIlllllIIl(hayami.hayami_saori(llllllIlllllIl) ? 1 : 0)) {
            IIIIIIllllllIl.appendCodePoint(llllllIlllllIl);
            "".length();
            llllllIlllllIl = lIIIIIllllllIl.SaoriHayami();
            "".length();
            if (("   ".length() << "   ".length() & ~("   ".length() << "   ".length())) <= "   ".length()) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long saorihayami() {
        hayami IlIlllIlllllIl;
        if (hayami.lIllllllIIl(IlIlllIlllllIl.hayamisaori() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long lIIlllIlllllIl = 0L;
        int IIIlllIlllllIl = IlllIllIl[1];
        int lllIllIlllllIl = IlIlllIlllllIl.SaoriHayami();
        if (hayami.IlllllllIIl(lllIllIlllllIl, IlllIllIl[6])) {
            IIIlllIlllllIl = IlllIllIl[2];
            lllIllIlllllIl = IlIlllIlllllIl.SaoriHayami();
        }
        if (!hayami.llllllllIIl(lllIllIlllllIl, IlllIllIl[7]) || hayami.lIIlllllIIl(IlllIllIl[8], lllIllIlllllIl)) {
            throw new NumberFormatException();
        }
        do {
            if (hayami.IIllllllIIl(IlllIllIl[7], lllIllIlllllIl) && hayami.IIllllllIIl(lllIllIlllllIl, IlllIllIl[8])) {
                lIIlllIlllllIl *= 10L;
                lIIlllIlllllIl += (long)(lllIllIlllllIl - IlllIllIl[7]);
                "".length();
                if (-" ".length() == " ".length() << (" ".length() << " ".length())) {
                    return 0L;
                }
            } else {
                if (!hayami.IIIIIIIIlIl(lllIllIlllllIl, IlllIllIl[3]) || hayami.lIllllllIIl(hayami.hayami_saori(lllIllIlllllIl) ? 1 : 0)) {
                    long l;
                    if (hayami.llIlllllIIl(IIIlllIlllllIl)) {
                        l = -lIIlllIlllllIl;
                        "".length();
                        if (null != null) {
                            return 0L;
                        }
                    } else {
                        l = lIIlllIlllllIl;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.SaoriHayami();
            "".length();
        } while (((0x19 ^ 0x1C) << (" ".length() << (" ".length() << " ".length())) & ~((0x17 ^ 0x12) << (" ".length() << (" ".length() << " ".length())))) == 0);
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int saori_hayami() {
        void var1_1;
        hayami IIlIllIlllllIl;
        long llIIllIlllllIl = IIlIllIlllllIl.saorihayami();
        if (!hayami.IlIIIIIIlIl(hayami.lIIIIIIIlIl(llIIllIlllllIl, Integer.MIN_VALUE)) || hayami.llIIIIIIlIl(hayami.lIIIIIIIlIl(llIIllIlllllIl, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double Hayamin() {
        hayami lIIIllIlllllIl;
        return Double.parseDouble(lIIIllIlllllIl.nextHayami());
    }

    @Override
    public void close() {
        try {
            hayami IlllIlIlllllIl;
            IlllIlIlllllIl.in.close();
            "".length();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        if (-"   ".length() >= 0) {
            return;
        }
    }

    static {
        hayami.IIIlllllIIl();
    }

    private static void IIIlllllIIl() {
        IlllIllIl = new int[9];
        hayami.IlllIllIl[0] = " ".length() << (((0xA2 ^ 0xA5) << " ".length() ^ (0x6C ^ 0x67)) << " ".length());
        hayami.IlllIllIl[1] = (0x69 ^ 0x2C) & ~(0xDC ^ 0x99);
        hayami.IlllIllIl[2] = " ".length();
        hayami.IlllIllIl[3] = -" ".length();
        hayami.IlllIllIl[4] = 0xCD ^ 0xBC ^ (0x96 ^ 0x93) << (" ".length() << (" ".length() << " ".length()));
        hayami.IlllIllIl[5] = (0x38 ^ 0x3D ^ (0x6C ^ 0x71) << " ".length()) << " ".length();
        hayami.IlllIllIl[6] = 63 + 62 - -6 + 32 ^ (0x80 ^ 0xC7) << " ".length();
        hayami.IlllIllIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        hayami.IlllIllIl[8] = 8 ^ 0x31;
    }

    private static boolean IlllllllIIl(int n, int n2) {
        return n == n2;
    }

    private static boolean llllllllIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIIlllllIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IIllllllIIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean llIlllllIIl(int n) {
        return n != 0;
    }

    private static boolean lIllllllIIl(int n) {
        return n == 0;
    }

    private static boolean IlIIIIIIlIl(int n) {
        return n >= 0;
    }

    private static boolean IlIlllllIIl(int n) {
        return n <= 0;
    }

    private static boolean llIIIIIIlIl(int n) {
        return n > 0;
    }

    private static boolean IIIIIIIIlIl(int n, int n2) {
        return n != n2;
    }

    private static int lIIIIIIIlIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

