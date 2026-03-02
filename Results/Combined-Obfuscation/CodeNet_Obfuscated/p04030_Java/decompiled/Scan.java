/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

class Scan {
    private byte[] buf = new byte[IIIllIIlIl[0]];
    private int index;
    private InputStream in = System.in;
    private int total;
    private static int[] IIIllIIlIl;

    public Scan() {
        Scan lIllIIIIIlIl;
    }

    public int scan() throws IOException {
        Scan llIlIIIIIlIl;
        if (Scan.IIllllIIlIIl(llIlIIIIIlIl.total)) {
            throw new InputMismatchException();
        }
        if (Scan.lIllllIIlIIl(llIlIIIIIlIl.index, llIlIIIIIlIl.total)) {
            llIlIIIIIlIl.index = IIIllIIlIl[1];
            llIlIIIIIlIl.total = llIlIIIIIlIl.in.read(llIlIIIIIlIl.buf);
            if (Scan.IlllllIIlIIl(llIlIIIIIlIl.total)) {
                return IIIllIIlIl[2];
            }
        }
        int n = this.index;
        this.index = n + IIIllIIlIl[3];
        return this.buf[n];
    }

    /*
     * WARNING - void declaration
     */
    public int scanInt() throws IOException {
        void var1_1;
        void var3_3;
        Scan IllIIIIIIlIl;
        int lIlIIIIIIlIl = IIIllIIlIl[1];
        int IIlIIIIIIlIl = IllIIIIIIlIl.scan();
        while (Scan.llllllIIlIIl(IllIIIIIIlIl.isWhiteSpace(IIlIIIIIIlIl) ? 1 : 0)) {
            IIlIIIIIIlIl = IllIIIIIIlIl.scan();
            "".length();
            if (" ".length() << " ".length() >= -" ".length()) continue;
            return " ".length() << " ".length() & ~(" ".length() << " ".length());
        }
        int llIIIIIIIlIl = IIIllIIlIl[3];
        if (Scan.IIIIIIlIlIIl(IIlIIIIIIlIl, IIIllIIlIl[4])) {
            llIIIIIIIlIl = IIIllIIlIl[2];
            IIlIIIIIIlIl = IllIIIIIIlIl.scan();
        }
        while (Scan.lIIIIIlIlIIl(IllIIIIIIlIl.isWhiteSpace(IIlIIIIIIlIl) ? 1 : 0)) {
            if (Scan.lIllllIIlIIl(IIlIIIIIIlIl, IIIllIIlIl[5]) && Scan.IlIIIIlIlIIl(IIlIIIIIIlIl, IIIllIIlIl[6])) {
                lIlIIIIIIlIl *= IIIllIIlIl[7];
                lIlIIIIIIlIl += IIlIIIIIIlIl - IIIllIIlIl[5];
                IIlIIIIIIlIl = IllIIIIIIlIl.scan();
                "".length();
                if (" ".length() << " ".length() < " ".length() << (" ".length() << " ".length())) continue;
                return ((0x3D ^ 0x62) << " ".length() ^ 120 + 28 - 105 + 104) << " ".length() & ((0x1E ^ 0x2B ^ "   ".length() << "   ".length()) << " ".length() ^ -" ".length());
            }
            throw new InputMismatchException();
        }
        return (int)(var3_3 * var1_1);
    }

    /*
     * WARNING - void declaration
     */
    public long scanLong() throws IOException {
        void var1_1;
        void var4_3;
        Scan IllllllllIIl;
        long lIlllllllIIl = 0L;
        int IIlllllllIIl = IllllllllIIl.scan();
        while (Scan.llllllIIlIIl(IllllllllIIl.isWhiteSpace(IIlllllllIIl) ? 1 : 0)) {
            IIlllllllIIl = IllllllllIIl.scan();
            "".length();
            if (" ".length() << (" ".length() << " ".length()) >= 0) continue;
            return 0L;
        }
        int llIllllllIIl = IIIllIIlIl[3];
        if (Scan.IIIIIIlIlIIl(IIlllllllIIl, IIIllIIlIl[4])) {
            llIllllllIIl = IIIllIIlIl[2];
            IIlllllllIIl = IllllllllIIl.scan();
        }
        while (Scan.lIIIIIlIlIIl(IllllllllIIl.isWhiteSpace(IIlllllllIIl) ? 1 : 0)) {
            if (Scan.lIllllIIlIIl(IIlllllllIIl, IIIllIIlIl[5]) && Scan.IlIIIIlIlIIl(IIlllllllIIl, IIIllIIlIl[6])) {
                lIlllllllIIl *= 10L;
                lIlllllllIIl += (long)(IIlllllllIIl - IIIllIIlIl[5]);
                IIlllllllIIl = IllllllllIIl.scan();
                "".length();
                if (" ".length() << " ".length() == " ".length() << " ".length()) continue;
                return 0L;
            }
            throw new InputMismatchException();
        }
        return (long)var4_3 * var1_1;
    }

    /*
     * WARNING - void declaration
     */
    public double scanDouble() throws IOException {
        void var4_3;
        void var1_1;
        Scan lIlIlllllIIl;
        double IIlIlllllIIl = 0.0;
        int llIIlllllIIl = lIlIlllllIIl.scan();
        while (Scan.llllllIIlIIl(lIlIlllllIIl.isWhiteSpace(llIIlllllIIl) ? 1 : 0)) {
            llIIlllllIIl = lIlIlllllIIl.scan();
            "".length();
            if (" ".length() > ((0x3F ^ 0x38) << (" ".length() << " ".length()) & ~((0x98 ^ 0x9F) << (" ".length() << " ".length())))) continue;
            return 0.0;
        }
        int IlIIlllllIIl = IIIllIIlIl[3];
        if (Scan.IIIIIIlIlIIl(llIIlllllIIl, IIIllIIlIl[4])) {
            IlIIlllllIIl = IIIllIIlIl[2];
            llIIlllllIIl = lIlIlllllIIl.scan();
        }
        while (Scan.lIIIIIlIlIIl(lIlIlllllIIl.isWhiteSpace(llIIlllllIIl) ? 1 : 0) && Scan.llIIIIlIlIIl(llIIlllllIIl, IIIllIIlIl[8])) {
            if (Scan.lIllllIIlIIl(llIIlllllIIl, IIIllIIlIl[5]) && Scan.IlIIIIlIlIIl(llIIlllllIIl, IIIllIIlIl[6])) {
                IIlIlllllIIl *= 10.0;
                IIlIlllllIIl += (double)(llIIlllllIIl - IIIllIIlIl[5]);
                llIIlllllIIl = lIlIlllllIIl.scan();
                "".length();
                if ((0xBC ^ 0xB9) > 0) continue;
                return 0.0;
            }
            throw new InputMismatchException();
        }
        if (Scan.IIIIIIlIlIIl(llIIlllllIIl, IIIllIIlIl[8])) {
            llIIlllllIIl = lIlIlllllIIl.scan();
            double lIIIlllllIIl = 1.0;
            while (Scan.lIIIIIlIlIIl(lIlIlllllIIl.isWhiteSpace(llIIlllllIIl) ? 1 : 0)) {
                if (Scan.lIllllIIlIIl(llIIlllllIIl, IIIllIIlIl[5]) && Scan.IlIIIIlIlIIl(llIIlllllIIl, IIIllIIlIl[6])) {
                    IIlIlllllIIl += (double)(llIIlllllIIl - IIIllIIlIl[5]) * (lIIIlllllIIl /= 10.0);
                    llIIlllllIIl = lIlIlllllIIl.scan();
                    "".length();
                    if ((("   ".length() << " ".length() ^ (0x2F ^ 0x14)) & (73 + 8 - -52 + 0 ^ (0x33 ^ 0x24) << "   ".length() ^ -" ".length())) != -" ".length()) continue;
                    return 0.0;
                }
                throw new InputMismatchException();
            }
        }
        return (double)(var1_1 * (double)var4_3);
    }

    /*
     * WARNING - void declaration
     */
    public String scanString() throws IOException {
        void var1_1;
        Scan lIllIllllIIl;
        StringBuilder IIllIllllIIl = new StringBuilder();
        int llIlIllllIIl = lIllIllllIIl.scan();
        while (Scan.llllllIIlIIl(lIllIllllIIl.isWhiteSpace(llIlIllllIIl) ? 1 : 0)) {
            llIlIllllIIl = lIllIllllIIl.scan();
            "".length();
            if (-" ".length() <= " ".length() << " ".length()) continue;
            return null;
        }
        while (Scan.lIIIIIlIlIIl(lIllIllllIIl.isWhiteSpace(llIlIllllIIl) ? 1 : 0)) {
            IIllIllllIIl.append((char)llIlIllllIIl);
            "".length();
            llIlIllllIIl = lIllIllllIIl.scan();
            "".length();
            if ("   ".length() >= " ".length()) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    private boolean isWhiteSpace(int lIIlIllllIIl) {
        if (!(Scan.llIIIIlIlIIl(lIIlIllllIIl, IIIllIIlIl[9]) && Scan.llIIIIlIlIIl(lIIlIllllIIl, IIIllIIlIl[7]) && Scan.llIIIIlIlIIl(lIIlIllllIIl, IIIllIIlIl[10]) && Scan.llIIIIlIlIIl(lIIlIllllIIl, IIIllIIlIl[11]) && !Scan.IIIIIIlIlIIl(lIIlIllllIIl, IIIllIIlIl[2]))) {
            return IIIllIIlIl[3];
        }
        return IIIllIIlIl[1];
    }

    static {
        Scan.llIlllIIlIIl();
    }

    private static void llIlllIIlIIl() {
        IIIllIIlIl = new int[12];
        Scan.IIIllIIlIl[0] = " ".length() << ((0x93 ^ 0x96) << " ".length());
        Scan.IIIllIIlIl[1] = (0x54 ^ 0x63) & ~(0x56 ^ 0x61);
        Scan.IIIllIIlIl[2] = -" ".length();
        Scan.IIIllIIlIl[3] = " ".length();
        Scan.IIIllIIlIl[4] = 0x8C ^ 0xA1;
        Scan.IIIllIIlIl[5] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        Scan.IIIllIIlIl[6] = 0x71 ^ 0x48;
        Scan.IIIllIIlIl[7] = (0xC4 ^ 0xC1) << " ".length();
        Scan.IIIllIIlIl[8] = (0xB2 ^ 0xA5) << " ".length();
        Scan.IIIllIIlIl[9] = " ".length() << (0x68 ^ 0x6D);
        Scan.IIIllIIlIl[10] = 0xDC ^ 0x9B ^ (0x3D ^ 0x18) << " ".length();
        Scan.IIIllIIlIl[11] = 0x39 ^ 0x5C ^ (0xA1 ^ 0xBA) << (" ".length() << " ".length());
    }

    private static boolean IIIIIIlIlIIl(int n, int n2) {
        return n == n2;
    }

    private static boolean lIllllIIlIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IlIIIIlIlIIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean llllllIIlIIl(int n) {
        return n != 0;
    }

    private static boolean lIIIIIlIlIIl(int n) {
        return n == 0;
    }

    private static boolean IIllllIIlIIl(int n) {
        return n < 0;
    }

    private static boolean IlllllIIlIIl(int n) {
        return n <= 0;
    }

    private static boolean llIIIIlIlIIl(int n, int n2) {
        return n != n2;
    }
}

