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
    private final byte[] hayami = new byte[IllIlllIIl[0]];
    private int Hayami = IllIlllIIl[1];
    private int saori = IllIlllIIl[1];
    private static int[] IllIlllIIl;

    hayami() {
        hayami IIlIlllIlIll;
    }

    private boolean HayamiSaori() {
        hayami lIIIlllIlIll;
        if (hayami.IIIlIIllIIIl(lIIIlllIlIll.Hayami, lIIIlllIlIll.saori)) {
            return IllIlllIIl[2];
        }
        lIIIlllIlIll.Hayami = IllIlllIIl[1];
        try {
            lIIIlllIlIll.saori = lIIIlllIlIll.in.read(lIIIlllIlIll.hayami);
            "".length();
        }
        catch (IOException IIIIlllIlIll) {
            IIIIlllIlIll.printStackTrace();
        }
        if (-"   ".length() > 0) {
            return ((0x87 ^ 0xBA) & ~(0x7D ^ 0x40)) != 0;
        }
        if (hayami.lIIlIIllIIIl(lIIIlllIlIll.saori)) {
            return IllIlllIIl[1];
        }
        return IllIlllIIl[2];
    }

    private int SaoriHayami() {
        hayami IlllIllIlIll;
        if (hayami.IlIlIIllIIIl(IlllIllIlIll.HayamiSaori() ? 1 : 0)) {
            int n = IlllIllIlIll.Hayami;
            IlllIllIlIll.Hayami = n + IllIlllIIl[2];
            return IlllIllIlIll.hayami[n];
        }
        return IllIlllIIl[3];
    }

    private static boolean hayami_saori(int IIllIllIlIll) {
        int n;
        if (hayami.llIlIIllIIIl(IllIlllIIl[4], IIllIllIlIll) && hayami.llIlIIllIIIl(IIllIllIlIll, IllIlllIIl[5])) {
            n = IllIlllIIl[2];
            "".length();
            if (" ".length() < 0) {
                return ((0x68 ^ 0x77) << " ".length() & ~((0x4B ^ 0x54) << " ".length())) != 0;
            }
        } else {
            n = IllIlllIIl[1];
        }
        return n != 0;
    }

    public boolean hayamisaori() {
        hayami IlIlIllIlIll;
        while (hayami.IlIlIIllIIIl(IlIlIllIlIll.HayamiSaori() ? 1 : 0) && hayami.IIllIIllIIIl(hayami.hayami_saori(IlIlIllIlIll.hayami[IlIlIllIlIll.Hayami]) ? 1 : 0)) {
            IlIlIllIlIll.Hayami += IllIlllIIl[2];
            "".length();
            if ("   ".length() >= " ".length() << " ".length()) continue;
            return (((0x82 ^ 0xB5) << " ".length() ^ (0x73 ^ 0x52)) & (119 + 150 - 94 + 48 ^ (0x88 ^ 0x81) << (" ".length() << (" ".length() << " ".length())) ^ -" ".length())) != 0;
        }
        return this.HayamiSaori();
    }

    /*
     * WARNING - void declaration
     */
    public String nextHayami() {
        void var1_1;
        hayami IllIIllIlIll;
        if (hayami.IIllIIllIIIl(IllIIllIlIll.hayamisaori() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder lIlIIllIlIll = new StringBuilder();
        int IIlIIllIlIll = IllIIllIlIll.SaoriHayami();
        while (hayami.IlIlIIllIIIl(hayami.hayami_saori(IIlIIllIlIll) ? 1 : 0)) {
            lIlIIllIlIll.appendCodePoint(IIlIIllIlIll);
            "".length();
            IIlIIllIlIll = IllIIllIlIll.SaoriHayami();
            "".length();
            if (((0x87 ^ 0x90) & ~(0x62 ^ 0x75)) <= ((0xD5 ^ 0x94) & ~(0xCD ^ 0x8C))) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long saorihayami() {
        hayami lllllIlIlIll;
        if (hayami.IIllIIllIIIl(lllllIlIlIll.hayamisaori() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long IllllIlIlIll = 0L;
        int lIlllIlIlIll = IllIlllIIl[1];
        int IIlllIlIlIll = lllllIlIlIll.SaoriHayami();
        if (hayami.lIllIIllIIIl(IIlllIlIlIll, IllIlllIIl[6])) {
            lIlllIlIlIll = IllIlllIIl[2];
            IIlllIlIlIll = lllllIlIlIll.SaoriHayami();
        }
        if (!hayami.IlllIIllIIIl(IIlllIlIlIll, IllIlllIIl[7]) || hayami.IIIlIIllIIIl(IllIlllIIl[8], IIlllIlIlIll)) {
            throw new NumberFormatException();
        }
        do {
            if (hayami.llIlIIllIIIl(IllIlllIIl[7], IIlllIlIlIll) && hayami.llIlIIllIIIl(IIlllIlIlIll, IllIlllIIl[8])) {
                IllllIlIlIll *= 10L;
                IllllIlIlIll += (long)(IIlllIlIlIll - IllIlllIIl[7]);
                "".length();
                if ("   ".length() <= -" ".length()) {
                    return 0L;
                }
            } else {
                if (!hayami.llllIIllIIIl(IIlllIlIlIll, IllIlllIIl[3]) || hayami.IIllIIllIIIl(hayami.hayami_saori(IIlllIlIlIll) ? 1 : 0)) {
                    long l;
                    if (hayami.IlIlIIllIIIl(lIlllIlIlIll)) {
                        l = -IllllIlIlIll;
                        "".length();
                        if (((0x40 ^ 0x51) << " ".length() & ~((0xA5 ^ 0xB4) << " ".length())) > 0) {
                            return 0L;
                        }
                    } else {
                        l = IllllIlIlIll;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.SaoriHayami();
            "".length();
        } while (-(0x34 ^ 0x31) < 0);
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int saori_hayami() {
        void var1_1;
        hayami lIIllIlIlIll;
        long IIIllIlIlIll = lIIllIlIlIll.saorihayami();
        if (!hayami.lIIIlIllIIIl(hayami.IIIIlIllIIIl(IIIllIlIlIll, Integer.MIN_VALUE)) || hayami.IlIIlIllIIIl(hayami.IIIIlIllIIIl(IIIllIlIlIll, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double Hayamin() {
        hayami IllIlIlIlIll;
        return Double.parseDouble(IllIlIlIlIll.nextHayami());
    }

    @Override
    public void close() {
        try {
            hayami llIIlIlIlIll;
            llIIlIlIlIll.in.close();
            "".length();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        if (" ".length() <= ((0x4F ^ 0x70) & ~(0x8F ^ 0xB0))) {
            return;
        }
    }

    static {
        hayami.lllIIIllIIIl();
    }

    private static void lllIIIllIIIl() {
        IllIlllIIl = new int[9];
        hayami.IllIlllIIl[0] = " ".length() << ((77 + 3 - 40 + 115 ^ (0x2E ^ 0x61) << " ".length()) << " ".length());
        hayami.IllIlllIIl[1] = (0x44 ^ 0x4B) << (" ".length() << " ".length()) & ~((0xAC ^ 0xA3) << (" ".length() << " ".length()));
        hayami.IllIlllIIl[2] = " ".length();
        hayami.IllIlllIIl[3] = -" ".length();
        hayami.IllIlllIIl[4] = 0x7C ^ 0x5D;
        hayami.IllIlllIIl[5] = (0xA0 ^ 0xB1 ^ (0xB ^ 0x1C) << " ".length()) << " ".length();
        hayami.IllIlllIIl[6] = 0x48 ^ 0x65;
        hayami.IllIlllIIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        hayami.IllIlllIIl[8] = 0x24 ^ 0x1D;
    }

    private static boolean lIllIIllIIIl(int n, int n2) {
        return n == n2;
    }

    private static boolean IlllIIllIIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIIlIIllIIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean llIlIIllIIIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean IlIlIIllIIIl(int n) {
        return n != 0;
    }

    private static boolean IIllIIllIIIl(int n) {
        return n == 0;
    }

    private static boolean lIIIlIllIIIl(int n) {
        return n >= 0;
    }

    private static boolean lIIlIIllIIIl(int n) {
        return n <= 0;
    }

    private static boolean IlIIlIllIIIl(int n) {
        return n > 0;
    }

    private static boolean llllIIllIIIl(int n, int n2) {
        return n != n2;
    }

    private static int IIIIlIllIIIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

