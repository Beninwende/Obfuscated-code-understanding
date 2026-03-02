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
    private final byte[] hayami = new byte[IIIllIlIIl[0]];
    private int Hayami = IIIllIlIIl[1];
    private int saori = IIIllIlIIl[1];
    private static int[] IIIllIlIIl;

    hayami() {
        hayami IIIlIIIIIlIIl;
    }

    private boolean HayamiSaori() {
        hayami lIlIIIIIIlIIl;
        if (hayami.llIllIlIIIIl(lIlIIIIIIlIIl.Hayami, lIlIIIIIIlIIl.saori)) {
            return IIIllIlIIl[2];
        }
        lIlIIIIIIlIIl.Hayami = IIIllIlIIl[1];
        try {
            lIlIIIIIIlIIl.saori = lIlIIIIIIlIIl.in.read(lIlIIIIIIlIIl.hayami);
            "".length();
        }
        catch (IOException IIlIIIIIIlIIl) {
            IIlIIIIIIlIIl.printStackTrace();
        }
        if ("   ".length() != "   ".length()) {
            return ((0x48 ^ 0xD) & ~(0x5B ^ 0x1E)) != 0;
        }
        if (hayami.IIlllIlIIIIl(lIlIIIIIIlIIl.saori)) {
            return IIIllIlIIl[1];
        }
        return IIIllIlIIl[2];
    }

    private int SaoriHayami() {
        hayami IlIIIIIIIlIIl;
        if (hayami.lIlllIlIIIIl(IlIIIIIIIlIIl.HayamiSaori() ? 1 : 0)) {
            int n = IlIIIIIIIlIIl.Hayami;
            IlIIIIIIIlIIl.Hayami = n + IIIllIlIIl[2];
            return IlIIIIIIIlIIl.hayami[n];
        }
        return IIIllIlIIl[3];
    }

    private static boolean hayami_saori(int IIIIIIIIIlIIl) {
        int n;
        if (hayami.IllllIlIIIIl(IIIllIlIIl[4], IIIIIIIIIlIIl) && hayami.IllllIlIIIIl(IIIIIIIIIlIIl, IIIllIlIIl[5])) {
            n = IIIllIlIIl[2];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) <= " ".length()) {
                return ((0x20 ^ 0xB ^ (0x68 ^ 0x73) << " ".length()) << " ".length() & (((0x15 ^ 6) << " ".length() ^ (0x61 ^ 0x5A)) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            n = IIIllIlIIl[1];
        }
        return n != 0;
    }

    public boolean hayamisaori() {
        hayami IllllllllIIIl;
        while (hayami.lIlllIlIIIIl(IllllllllIIIl.HayamiSaori() ? 1 : 0) && hayami.lllllIlIIIIl(hayami.hayami_saori(IllllllllIIIl.hayami[IllllllllIIIl.Hayami]) ? 1 : 0)) {
            IllllllllIIIl.Hayami += IIIllIlIIl[2];
            "".length();
            if (((0x7E ^ 0x6F) & ~(0x94 ^ 0x85)) <= 0) continue;
            return ((0x10 ^ 0x73) & ~(0x40 ^ 0x23)) != 0;
        }
        return this.HayamiSaori();
    }

    /*
     * WARNING - void declaration
     */
    public String nextHayami() {
        void var1_1;
        hayami IlIllllllIIIl;
        if (hayami.lllllIlIIIIl(IlIllllllIIIl.hayamisaori() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder lIIllllllIIIl = new StringBuilder();
        int IIIllllllIIIl = IlIllllllIIIl.SaoriHayami();
        while (hayami.lIlllIlIIIIl(hayami.hayami_saori(IIIllllllIIIl) ? 1 : 0)) {
            lIIllllllIIIl.appendCodePoint(IIIllllllIIIl);
            "".length();
            IIIllllllIIIl = IlIllllllIIIl.SaoriHayami();
            "".length();
            if (" ".length() << " ".length() > ((0x76 ^ 0x7D) << "   ".length() & ~((0x26 ^ 0x2D) << "   ".length()))) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long saorihayami() {
        hayami llIIlllllIIIl;
        if (hayami.lllllIlIIIIl(llIIlllllIIIl.hayamisaori() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long IlIIlllllIIIl = 0L;
        int lIIIlllllIIIl = IIIllIlIIl[1];
        int IIIIlllllIIIl = llIIlllllIIIl.SaoriHayami();
        if (hayami.IIIIIllIIIIl(IIIIlllllIIIl, IIIllIlIIl[6])) {
            lIIIlllllIIIl = IIIllIlIIl[2];
            IIIIlllllIIIl = llIIlllllIIIl.SaoriHayami();
        }
        if (!hayami.lIIIIllIIIIl(IIIIlllllIIIl, IIIllIlIIl[7]) || hayami.llIllIlIIIIl(IIIllIlIIl[8], IIIIlllllIIIl)) {
            throw new NumberFormatException();
        }
        do {
            if (hayami.IllllIlIIIIl(IIIllIlIIl[7], IIIIlllllIIIl) && hayami.IllllIlIIIIl(IIIIlllllIIIl, IIIllIlIIl[8])) {
                IlIIlllllIIIl *= 10L;
                IlIIlllllIIIl += (long)(IIIIlllllIIIl - IIIllIlIIl[7]);
                "".length();
                if (" ".length() << " ".length() <= 0) {
                    return 0L;
                }
            } else {
                if (!hayami.IlIIIllIIIIl(IIIIlllllIIIl, IIIllIlIIl[3]) || hayami.lllllIlIIIIl(hayami.hayami_saori(IIIIlllllIIIl) ? 1 : 0)) {
                    long l;
                    if (hayami.lIlllIlIIIIl(lIIIlllllIIIl)) {
                        l = -IlIIlllllIIIl;
                        "".length();
                        if (" ".length() << " ".length() != " ".length() << " ".length()) {
                            return 0L;
                        }
                    } else {
                        l = IlIIlllllIIIl;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.SaoriHayami();
            "".length();
        } while (("   ".length() << (" ".length() << " ".length()) & ~("   ".length() << (" ".length() << " ".length()))) != " ".length() << " ".length());
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int saori_hayami() {
        void var1_1;
        hayami lIllIllllIIIl;
        long IIllIllllIIIl = lIllIllllIIIl.saorihayami();
        if (!hayami.IIlIIllIIIIl(hayami.llIIIllIIIIl(IIllIllllIIIl, Integer.MIN_VALUE)) || hayami.lIlIIllIIIIl(hayami.llIIIllIIIIl(IIllIllllIIIl, Integer.MAX_VALUE))) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double Hayamin() {
        hayami IlIlIllllIIIl;
        return Double.parseDouble(IlIlIllllIIIl.nextHayami());
    }

    @Override
    public void close() {
        try {
            hayami lllIIllllIIIl;
            lllIIllllIIIl.in.close();
            "".length();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        if (null != null) {
            return;
        }
    }

    static {
        hayami.IlIllIlIIIIl();
    }

    private static void IlIllIlIIIIl() {
        IIIllIlIIl = new int[9];
        hayami.IIIllIlIIl[0] = " ".length() << (((0x8A ^ 0x81) << " ".length() ^ (0x77 ^ 0x64)) << " ".length());
        hayami.IIIllIlIIl[1] = "   ".length() & ("   ".length() ^ -" ".length());
        hayami.IIIllIlIIl[2] = " ".length();
        hayami.IIIllIlIIl[3] = -" ".length();
        hayami.IIIllIlIIl[4] = 0x61 ^ 0x5A ^ (0xB4 ^ 0xB9) << " ".length();
        hayami.IIIllIlIIl[5] = (0x7F ^ 0xE ^ (0x74 ^ 0x53) << " ".length()) << " ".length();
        hayami.IIIllIlIIl[6] = 0x89 ^ 0xA4;
        hayami.IIIllIlIIl[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        hayami.IIIllIlIIl[8] = (0xDF ^ 0x96) << " ".length() ^ 7 + 37 - -88 + 39;
    }

    private static boolean IIIIIllIIIIl(int n, int n2) {
        return n == n2;
    }

    private static boolean lIIIIllIIIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean llIllIlIIIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IllllIlIIIIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean lIlllIlIIIIl(int n) {
        return n != 0;
    }

    private static boolean lllllIlIIIIl(int n) {
        return n == 0;
    }

    private static boolean IIlIIllIIIIl(int n) {
        return n >= 0;
    }

    private static boolean IIlllIlIIIIl(int n) {
        return n <= 0;
    }

    private static boolean lIlIIllIIIIl(int n) {
        return n > 0;
    }

    private static boolean IlIIIllIIIIl(int n, int n2) {
        return n != n2;
    }

    private static int llIIIllIIIIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

