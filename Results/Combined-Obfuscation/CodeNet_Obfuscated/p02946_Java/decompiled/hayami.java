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
    private final byte[] hayami = new byte[lllIIIllIl[0]];
    private int Hayami = lllIIIllIl[1];
    private int saori = lllIIIllIl[1];
    private static int[] lllIIIllIl;

    hayami() {
        hayami IlllIlIIIl;
    }

    private boolean HayamiSaori() {
        hayami llIlIlIIIl;
        if (hayami.IlIIIIIIIlIl(llIlIlIIIl.Hayami, llIlIlIIIl.saori)) {
            return lllIIIllIl[2];
        }
        llIlIlIIIl.Hayami = lllIIIllIl[1];
        try {
            llIlIlIIIl.saori = llIlIlIIIl.in.read(llIlIlIIIl.hayami);
            "".length();
        }
        catch (IOException IlIlIlIIIl) {
            IlIlIlIIIl.printStackTrace();
        }
        if (((0x79 ^ 0x6E) << " ".length() & ~((0x97 ^ 0x80) << " ".length())) <= -" ".length()) {
            return ((0x5C ^ 0x55) << " ".length() & ~((0x47 ^ 0x4E) << " ".length())) != 0;
        }
        if (hayami.llIIIIIIIlIl(llIlIlIIIl.saori)) {
            return lllIIIllIl[1];
        }
        return lllIIIllIl[2];
    }

    private int SaoriHayami() {
        hayami IIIlIlIIIl;
        if (hayami.IIlIIIIIIlIl(IIIlIlIIIl.HayamiSaori() ? 1 : 0)) {
            int n = IIIlIlIIIl.Hayami;
            IIIlIlIIIl.Hayami = n + lllIIIllIl[2];
            return IIIlIlIIIl.hayami[n];
        }
        return lllIIIllIl[3];
    }

    private static boolean hayami_saori(int IllIIlIIIl) {
        int n;
        if (hayami.lIlIIIIIIlIl(lllIIIllIl[4], IllIIlIIIl) && hayami.lIlIIIIIIlIl(IllIIlIIIl, lllIIIllIl[5])) {
            n = lllIIIllIl[2];
            "".length();
            if (-" ".length() != -" ".length()) {
                return ((38 + 40 - -82 + 41 ^ (4 ^ 0x15) << "   ".length()) & (127 + 126 - 172 + 50 ^ (0x42 ^ 0x23) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            n = lllIIIllIl[1];
        }
        return n != 0;
    }

    public boolean hayamisaori() {
        hayami IIlIIlIIIl;
        while (hayami.IIlIIIIIIlIl(IIlIIlIIIl.HayamiSaori() ? 1 : 0) && hayami.IllIIIIIIlIl(hayami.hayami_saori(IIlIIlIIIl.hayami[IIlIIlIIIl.Hayami]) ? 1 : 0)) {
            IIlIIlIIIl.Hayami += lllIIIllIl[2];
            "".length();
            if (((0x83 ^ 0x96) & ~(0x53 ^ 0x46)) == 0) continue;
            return ((0xC0 ^ 0xA1) & ~(0xD1 ^ 0xB0)) != 0;
        }
        return this.HayamiSaori();
    }

    /*
     * WARNING - void declaration
     */
    public String nextHayami() {
        void var1_1;
        hayami IIIIIlIIIl;
        if (hayami.IllIIIIIIlIl(IIIIIlIIIl.hayamisaori() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder lllllIIIIl = new StringBuilder();
        int IllllIIIIl = IIIIIlIIIl.SaoriHayami();
        while (hayami.IIlIIIIIIlIl(hayami.hayami_saori(IllllIIIIl) ? 1 : 0)) {
            lllllIIIIl.appendCodePoint(IllllIIIIl);
            "".length();
            IllllIIIIl = IIIIIlIIIl.SaoriHayami();
            "".length();
            if (" ".length() >= " ".length()) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long saorihayami() {
        hayami lIIllIIIIl;
        if (hayami.IllIIIIIIlIl(lIIllIIIIl.hayamisaori() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long IIIllIIIIl = 0L;
        int lllIlIIIIl = lllIIIllIl[1];
        int IllIlIIIIl = lIIllIIIIl.SaoriHayami();
        if (hayami.lllIIIIIIlIl(IllIlIIIIl, lllIIIllIl[6])) {
            lllIlIIIIl = lllIIIllIl[2];
            IllIlIIIIl = lIIllIIIIl.SaoriHayami();
        }
        if (!hayami.IIIlIIIIIlIl(IllIlIIIIl, lllIIIllIl[7]) || hayami.IlIIIIIIIlIl(lllIIIllIl[8], IllIlIIIIl)) {
            throw new NumberFormatException();
        }
        do {
            if (hayami.lIlIIIIIIlIl(lllIIIllIl[7], IllIlIIIIl) && hayami.lIlIIIIIIlIl(IllIlIIIIl, lllIIIllIl[8])) {
                IIIllIIIIl *= 10L;
                IIIllIIIIl += (long)(IllIlIIIIl - lllIIIllIl[7]);
                "".length();
                if (" ".length() < " ".length()) {
                    return 0L;
                }
            } else {
                if (!hayami.lIIlIIIIIlIl(IllIlIIIIl, lllIIIllIl[3]) || hayami.IllIIIIIIlIl(hayami.hayami_saori(IllIlIIIIl) ? 1 : 0)) {
                    long l;
                    if (hayami.IIlIIIIIIlIl(lllIlIIIIl)) {
                        l = -IIIllIIIIl;
                        "".length();
                        if (" ".length() == 0) {
                            return 0L;
                        }
                    } else {
                        l = IIIllIIIIl;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.SaoriHayami();
            "".length();
        } while (null == null);
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int saori_hayami() {
        void var1_1;
        hayami llIIlIIIIl;
        long IlIIlIIIIl = llIIlIIIIl.saorihayami();
        if (!hayami.llIlIIIIIlIl(hayami.IlIlIIIIIlIl(IlIIlIIIIl, Integer.MIN_VALUE)) || hayami.IIllIIIIIlIl(hayami.IlIlIIIIIlIl(IlIIlIIIIl, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double Hayamin() {
        hayami IIIIlIIIIl;
        return Double.parseDouble(IIIIlIIIIl.nextHayami());
    }

    @Override
    public void close() {
        try {
            hayami lIllIIIIIl;
            lIllIIIIIl.in.close();
            "".length();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        if ("   ".length() != "   ".length()) {
            return;
        }
    }

    static {
        hayami.lIIIIIIIIlIl();
    }

    private static void lIIIIIIIIlIl() {
        lllIIIllIl = new int[9];
        hayami.lllIIIllIl[0] = " ".length() << ((0x54 ^ 0x51) << " ".length());
        hayami.lllIIIllIl[1] = (0x1F ^ 0x52 ^ (0xA4 ^ 0x87) << " ".length()) << "   ".length() & ((0xC6 ^ 0xC3 ^ (0x6B ^ 0x6C) << " ".length()) << "   ".length() ^ -" ".length());
        hayami.lllIIIllIl[2] = " ".length();
        hayami.lllIIIllIl[3] = -" ".length();
        hayami.lllIIIllIl[4] = 5 ^ 0x6A ^ (0xE1 ^ 0xC6) << " ".length();
        hayami.lllIIIllIl[5] = (0x62 ^ 0x5D) << " ".length();
        hayami.lllIIIllIl[6] = 0xA3 ^ 0x86 ^ " ".length() << "   ".length();
        hayami.lllIIIllIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        hayami.lllIIIllIl[8] = (0x21 ^ 0x24) << (" ".length() << " ".length()) ^ (0x30 ^ 0x1D);
    }

    private static boolean lllIIIIIIlIl(int n, int n2) {
        return n == n2;
    }

    private static boolean IIIlIIIIIlIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IlIIIIIIIlIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lIlIIIIIIlIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean IIlIIIIIIlIl(int n) {
        return n != 0;
    }

    private static boolean IllIIIIIIlIl(int n) {
        return n == 0;
    }

    private static boolean llIlIIIIIlIl(int n) {
        return n >= 0;
    }

    private static boolean llIIIIIIIlIl(int n) {
        return n <= 0;
    }

    private static boolean IIllIIIIIlIl(int n) {
        return n > 0;
    }

    private static boolean lIIlIIIIIlIl(int n, int n2) {
        return n != n2;
    }

    private static int IlIlIIIIIlIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

