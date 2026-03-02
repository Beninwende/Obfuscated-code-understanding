/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[IlllIIIll[IIlIlIIll[0]]];
    private int ptr = IlllIIIll[IIlIlIIll[1]];
    private int buflen = IlllIIIll[IIlIlIIll[1]];
    private static int[] IlllIIIll;
    private static String[] lIIIlIIll;
    private static int[] IIlIlIIll;

    FastScanner() {
        FastScanner llIlIllIllIlIl;
    }

    private boolean hasNextByte() {
        FastScanner lllIIllIllIlIl;
        if (FastScanner.llIlIIIllIl(FastScanner.IIllIllIlIl(lllIIllIllIlIl.ptr, lllIIllIllIlIl.buflen) ? 1 : 0)) {
            return IlllIIIll[IIlIlIIll[2]];
        }
        lllIIllIllIlIl.ptr = IlllIIIll[IIlIlIIll[1]];
        try {
            lllIIllIllIlIl.buflen = lllIIllIllIlIl.in.read(lllIIllIllIlIl.buffer);
            lIIIlIIll[IIlIlIIll[0]].length();
            "".length();
        }
        catch (IOException IllIIllIllIlIl) {
            IllIIllIllIlIl.printStackTrace();
        }
        if (FastScanner.IIllIIIllIl(lIIIlIIll[IIlIlIIll[1]].length() << (lIIIlIIll[IIlIlIIll[2]].length() << lIIIlIIll[IIlIlIIll[3]].length()))) {
            return ((IIlIlIIll[4] + IIlIlIIll[5] - IIlIlIIll[6] + IIlIlIIll[7] ^ (IIlIlIIll[8] ^ IIlIlIIll[9]) << lIIIlIIll[IIlIlIIll[10]].length()) << (lIIIlIIll[IIlIlIIll[11]].length() << lIIIlIIll[IIlIlIIll[12]].length()) & (((IIlIlIIll[13] ^ IIlIlIIll[14]) << lIIIlIIll[IIlIlIIll[15]].length() ^ (IIlIlIIll[16] ^ IIlIlIIll[17])) << (lIIIlIIll[IIlIlIIll[18]].length() << lIIIlIIll[IIlIlIIll[19]].length()) ^ -lIIIlIIll[IIlIlIIll[20]].length())) != 0;
        }
        if (FastScanner.llIlIIIllIl(FastScanner.lIllIllIlIl(lllIIllIllIlIl.buflen) ? 1 : 0)) {
            return IlllIIIll[IIlIlIIll[1]];
        }
        return IlllIIIll[IIlIlIIll[2]];
    }

    private int readByte() {
        FastScanner IlIIIllIllIlIl;
        if (FastScanner.llIlIIIllIl(FastScanner.IlllIllIlIl(IlIIIllIllIlIl.hasNextByte() ? 1 : 0) ? 1 : 0)) {
            int n = IlIIIllIllIlIl.ptr;
            IlIIIllIllIlIl.ptr = n + IlllIIIll[IIlIlIIll[2]];
            return IlIIIllIllIlIl.buffer[n];
        }
        return IlllIIIll[IIlIlIIll[3]];
    }

    private static boolean isPrintableChar(int lllllIlIllIlIl) {
        int n;
        if (FastScanner.llIlIIIllIl(FastScanner.llllIllIlIl(IlllIIIll[IIlIlIIll[10]], lllllIlIllIlIl) ? 1 : 0) && FastScanner.llIlIIIllIl(FastScanner.llllIllIlIl(lllllIlIllIlIl, IlllIIIll[IIlIlIIll[11]]) ? 1 : 0)) {
            n = IlllIIIll[IIlIlIIll[2]];
            lIIIlIIll[IIlIlIIll[21]].length();
            "".length();
            if (FastScanner.IIllIIIllIl(IIlIlIIll[22] ^ IIlIlIIll[23])) {
                return ((IIlIlIIll[24] ^ IIlIlIIll[25]) & (IIlIlIIll[26] ^ IIlIlIIll[27] ^ IIlIlIIll[28])) != 0;
            }
        } else {
            n = IlllIIIll[IIlIlIIll[1]];
        }
        return n != 0;
    }

    public boolean hasNext() {
        FastScanner IIlllIlIllIlIl;
        while (FastScanner.llIlIIIllIl(FastScanner.IlllIllIlIl(IIlllIlIllIlIl.hasNextByte() ? 1 : 0) ? 1 : 0) && FastScanner.llIlIIIllIl(FastScanner.IIIIlllIlIl(FastScanner.isPrintableChar(IIlllIlIllIlIl.buffer[IIlllIlIllIlIl.ptr]) ? 1 : 0) ? 1 : 0)) {
            IIlllIlIllIlIl.ptr += IlllIIIll[IIlIlIIll[2]];
            lIIIlIIll[IIlIlIIll[29]].length();
            "".length();
            if (!FastScanner.llIlIIIllIl((IIlIlIIll[30] ^ IIlIlIIll[31]) << lIIIlIIll[IIlIlIIll[32]].length() & ((IIlIlIIll[33] ^ IIlIlIIll[34]) << lIIIlIIll[IIlIlIIll[35]].length() ^ IIlIlIIll[28]) & ((IIlIlIIll[36] ^ IIlIlIIll[11]) << (lIIIlIIll[IIlIlIIll[37]].length() << lIIIlIIll[IIlIlIIll[36]].length()) & ((IIlIlIIll[38] ^ IIlIlIIll[39]) << (lIIIlIIll[IIlIlIIll[40]].length() << lIIIlIIll[IIlIlIIll[41]].length()) ^ IIlIlIIll[28]) ^ IIlIlIIll[28]))) continue;
            return ((IIlIlIIll[42] ^ IIlIlIIll[43]) & (IIlIlIIll[44] ^ IIlIlIIll[45] ^ IIlIlIIll[28])) != 0;
        }
        return this.hasNextByte();
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        FastScanner lllIlIlIllIlIl;
        if (FastScanner.llIlIIIllIl(FastScanner.IIIIlllIlIl(lllIlIlIllIlIl.hasNext() ? 1 : 0) ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IllIlIlIllIlIl = new StringBuilder();
        int lIlIlIlIllIlIl = lllIlIlIllIlIl.readByte();
        while (FastScanner.llIlIIIllIl(FastScanner.IlllIllIlIl(FastScanner.isPrintableChar(lIlIlIlIllIlIl) ? 1 : 0) ? 1 : 0)) {
            IllIlIlIllIlIl.appendCodePoint(lIlIlIlIllIlIl);
            lIIIlIIll[IIlIlIIll[46]].length();
            lIlIlIlIllIlIl = lllIlIlIllIlIl.readByte();
            lIIIlIIll[IIlIlIIll[47]].length();
            "".length();
            if (!FastScanner.lIllIIIllIl(lIIIlIIll[IIlIlIIll[48]].length())) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        FastScanner lIllIIlIllIlIl;
        if (FastScanner.llIlIIIllIl(FastScanner.IIIIlllIlIl(lIllIIlIllIlIl.hasNext() ? 1 : 0) ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long IIllIIlIllIlIl = 0L;
        int llIlIIlIllIlIl = IlllIIIll[IIlIlIIll[1]];
        int IlIlIIlIllIlIl = lIllIIlIllIlIl.readByte();
        if (FastScanner.llIlIIIllIl(FastScanner.lIIIlllIlIl(IlIlIIlIllIlIl, IlllIIIll[IIlIlIIll[12]]) ? 1 : 0)) {
            llIlIIlIllIlIl = IlllIIIll[IIlIlIIll[2]];
            IlIlIIlIllIlIl = lIllIIlIllIlIl.readByte();
        }
        if (!FastScanner.llIlIIIllIl(FastScanner.IlIIlllIlIl(IlIlIIlIllIlIl, IlllIIIll[IIlIlIIll[15]]) ? 1 : 0) || FastScanner.llIlIIIllIl(FastScanner.IIllIllIlIl(IlllIIIll[IIlIlIIll[18]], IlIlIIlIllIlIl) ? 1 : 0)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.llIlIIIllIl(FastScanner.llllIllIlIl(IlllIIIll[IIlIlIIll[15]], IlIlIIlIllIlIl) ? 1 : 0) && FastScanner.llIlIIIllIl(FastScanner.llllIllIlIl(IlIlIIlIllIlIl, IlllIIIll[IIlIlIIll[18]]) ? 1 : 0)) {
                IIllIIlIllIlIl *= 10L;
                IIllIIlIllIlIl += (long)(IlIlIIlIllIlIl - IlllIIIll[IIlIlIIll[15]]);
                lIIIlIIll[IIlIlIIll[49]].length();
                "".length();
                if (FastScanner.IlllIIIllIl(null)) {
                    return 0L;
                }
            } else {
                if (!FastScanner.llIlIIIllIl(FastScanner.llIIlllIlIl(IlIlIIlIllIlIl, IlllIIIll[IIlIlIIll[3]]) ? 1 : 0) || FastScanner.llIlIIIllIl(FastScanner.IIIIlllIlIl(FastScanner.isPrintableChar(IlIlIIlIllIlIl) ? 1 : 0) ? 1 : 0)) {
                    long l;
                    if (FastScanner.llIlIIIllIl(FastScanner.IlllIllIlIl(llIlIIlIllIlIl) ? 1 : 0)) {
                        l = -IIllIIlIllIlIl;
                        lIIIlIIll[IIlIlIIll[50]].length();
                        "".length();
                        if (FastScanner.llllIIIllIl(lIIIlIIll[IIlIlIIll[51]].length() << lIIIlIIll[IIlIlIIll[52]].length(), -lIIIlIIll[IIlIlIIll[53]].length())) {
                            return 0L;
                        }
                    } else {
                        l = IIllIIlIllIlIl;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            lIIIlIIll[IIlIlIIll[54]].length();
            "".length();
        } while (!FastScanner.IIllIIIllIl(lIIIlIIll[IIlIlIIll[55]].length()));
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int nextInt() {
        void var1_1;
        FastScanner llIIIIlIllIlIl;
        long IlIIIIlIllIlIl = llIIIIlIllIlIl.nextLong();
        if (!FastScanner.llIlIIIllIl(FastScanner.lIlIlllIlIl(FastScanner.IIlIlllIlIl(IlIIIIlIllIlIl, Integer.MIN_VALUE)) ? 1 : 0) || FastScanner.llIlIIIllIl(FastScanner.IllIlllIlIl(FastScanner.IIlIlllIlIl(IlIIIIlIllIlIl, Integer.MAX_VALUE)) ? 1 : 0)) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double nextDouble() {
        FastScanner IlllllIIllIlIl;
        return Double.parseDouble(IlllllIIllIlIl.next());
    }

    static {
        FastScanner.IlIlIIIllIl();
        FastScanner.lIIlIIIllIl();
        FastScanner.llIlIllIlIl();
    }

    private static void llIlIllIlIl() {
        IlllIIIll = new int[IIlIlIIll[19]];
        FastScanner.IlllIIIll[FastScanner.IIlIlIIll[0]] = lIIIlIIll[IIlIlIIll[56]].length() << ((IIlIlIIll[37] + IIlIlIIll[57] - IIlIlIIll[23] + IIlIlIIll[58] ^ (IIlIlIIll[52] ^ IIlIlIIll[59]) << lIIIlIIll[IIlIlIIll[60]].length()) << lIIIlIIll[IIlIlIIll[5]].length());
        FastScanner.IlllIIIll[FastScanner.IIlIlIIll[1]] = (IIlIlIIll[61] ^ IIlIlIIll[37]) & (IIlIlIIll[62] ^ IIlIlIIll[30] ^ IIlIlIIll[28]);
        FastScanner.IlllIIIll[FastScanner.IIlIlIIll[2]] = lIIIlIIll[IIlIlIIll[63]].length();
        FastScanner.IlllIIIll[FastScanner.IIlIlIIll[3]] = -lIIIlIIll[IIlIlIIll[64]].length();
        FastScanner.IlllIIIll[FastScanner.IIlIlIIll[10]] = IIlIlIIll[65] ^ IIlIlIIll[66] ^ lIIIlIIll[IIlIlIIll[67]].length() << (lIIIlIIll[IIlIlIIll[68]].length() << lIIIlIIll[IIlIlIIll[69]].length());
        FastScanner.IlllIIIll[FastScanner.IIlIlIIll[11]] = ((IIlIlIIll[70] ^ IIlIlIIll[71]) << lIIIlIIll[IIlIlIIll[72]].length() ^ lIIIlIIll[IIlIlIIll[34]].length()) << lIIIlIIll[IIlIlIIll[73]].length();
        FastScanner.IlllIIIll[FastScanner.IIlIlIIll[12]] = (IIlIlIIll[74] ^ IIlIlIIll[75]) << (lIIIlIIll[IIlIlIIll[76]].length() << lIIIlIIll[IIlIlIIll[77]].length()) ^ IIlIlIIll[78] + IIlIlIIll[79] - IIlIlIIll[80] + IIlIlIIll[81];
        FastScanner.IlllIIIll[FastScanner.IIlIlIIll[15]] = lIIIlIIll[IIlIlIIll[82]].length() << (lIIIlIIll[IIlIlIIll[83]].length() << (lIIIlIIll[IIlIlIIll[39]].length() << lIIIlIIll[IIlIlIIll[84]].length()));
        FastScanner.IlllIIIll[FastScanner.IIlIlIIll[18]] = IIlIlIIll[42] ^ IIlIlIIll[85];
    }

    private static boolean lIIIlllIlIl(int n, int n2) {
        boolean bl;
        if (FastScanner.llllIIIllIl(n, n2)) {
            bl = IIlIlIIll[1];
            "".length();
            if (" ".length() << " ".length() < -" ".length()) {
                return ((0x68 ^ 0x7F) << (" ".length() << " ".length()) & ~((0x11 ^ 6) << (" ".length() << " ".length()))) != 0;
            }
        } else {
            bl = IIlIlIIll[0];
        }
        return bl;
    }

    private static boolean IlIIlllIlIl(int n, int n2) {
        boolean bl;
        if (FastScanner.IIIIlIIllIl(n, n2)) {
            bl = IIlIlIIll[1];
            "".length();
            if ((((0x6C ^ 0x63) << " ".length() ^ (0x1E ^ 0xF)) << " ".length() & ((105 + 115 - 58 + 15 ^ (0x5E ^ 1) << " ".length()) << " ".length() ^ -" ".length())) > 0) {
                return (" ".length() << ("   ".length() << " ".length()) & (" ".length() << ("   ".length() << " ".length()) ^ -" ".length())) != 0;
            }
        } else {
            bl = IIlIlIIll[0];
        }
        return bl;
    }

    private static boolean IIllIllIlIl(int n, int n2) {
        boolean bl;
        if (FastScanner.lIIIlIIllIl(n, n2)) {
            bl = IIlIlIIll[1];
            "".length();
            if ((" ".length() << (0xAA ^ 0xAD) ^ 41 + 106 - 44 + 30) == 0) {
                return ((0x23 ^ 2 ^ (0x7C ^ 0x67) << " ".length()) << (" ".length() << " ".length()) & (((0x89 ^ 0xA2) << (" ".length() << " ".length()) ^ 35 + 87 - -63 + 2) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
            }
        } else {
            bl = IIlIlIIll[0];
        }
        return bl;
    }

    private static boolean llllIllIlIl(int n, int n2) {
        boolean bl;
        if (FastScanner.IlIIlIIllIl(n, n2)) {
            bl = IIlIlIIll[1];
            "".length();
            if (" ".length() << " ".length() <= 0) {
                return ((0x9A ^ 0xA1 ^ (0x45 ^ 0x4E) << "   ".length()) & (0x6E ^ 0x65 ^ (0x12 ^ 0x1F) << "   ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = IIlIlIIll[0];
        }
        return bl;
    }

    private static boolean IlllIllIlIl(int n) {
        boolean bl;
        if (FastScanner.llIlIIIllIl(n)) {
            bl = IIlIlIIll[1];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) < "   ".length()) {
                return ((5 ^ 0x42 ^ (0x86 ^ 0x93) << (" ".length() << " ".length())) << (" ".length() << " ".length()) & ((0x61 ^ 0x6A ^ "   ".length() << "   ".length()) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
            }
        } else {
            bl = IIlIlIIll[0];
        }
        return bl;
    }

    private static boolean IIIIlllIlIl(int n) {
        boolean bl;
        if (FastScanner.IIllIIIllIl(n)) {
            bl = IIlIlIIll[1];
            "".length();
            if (-" ".length() == "   ".length()) {
                return ((10 + 102 - 88 + 117 ^ " ".length() << (0x2A ^ 0x2D)) << (" ".length() << " ".length()) & (((0x74 ^ 0x69) << (" ".length() << " ".length()) ^ (0x65 ^ 0x1C)) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
            }
        } else {
            bl = IIlIlIIll[0];
        }
        return bl;
    }

    private static boolean lIlIlllIlIl(int n) {
        boolean bl;
        if (FastScanner.llIIlIIllIl(n)) {
            bl = IIlIlIIll[1];
            "".length();
            if ((0x8F ^ 0x8A) == 0) {
                return ((0x6B ^ 0x70) & ~(0xC ^ 0x17)) != 0;
            }
        } else {
            bl = IIlIlIIll[0];
        }
        return bl;
    }

    private static boolean lIllIllIlIl(int n) {
        boolean bl;
        if (FastScanner.IIlIlIIllIl(n)) {
            bl = IIlIlIIll[1];
            "".length();
            if (" ".length() << " ".length() < 0) {
                return ("   ".length() << (" ".length() << " ".length()) & ~("   ".length() << (" ".length() << " ".length()))) != 0;
            }
        } else {
            bl = IIlIlIIll[0];
        }
        return bl;
    }

    private static boolean IllIlllIlIl(int n) {
        boolean bl;
        if (FastScanner.lIlIlIIllIl(n)) {
            bl = IIlIlIIll[1];
            "".length();
            if (("   ".length() << (" ".length() << " ".length()) & ("   ".length() << (" ".length() << " ".length()) ^ -" ".length())) >= " ".length() << (" ".length() << " ".length())) {
                return (((0x76 ^ 0x79) << (" ".length() << " ".length()) ^ "   ".length()) & (0x49 ^ 0x44 ^ (3 ^ 0x1A) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = IIlIlIIll[0];
        }
        return bl;
    }

    private static boolean llIIlllIlIl(int n, int n2) {
        boolean bl;
        if (FastScanner.IllIlIIllIl(n, n2)) {
            bl = IIlIlIIll[1];
            "".length();
            if (((0x2E ^ 0x25) << " ".length() & ~((0x69 ^ 0x62) << " ".length())) != 0) {
                return ((0x53 ^ 0x7E) << " ".length() & ~((0x9D ^ 0xB0) << " ".length())) != 0;
            }
        } else {
            bl = IIlIlIIll[0];
        }
        return bl;
    }

    private static int IIlIlllIlIl(long l, long l2) {
        return FastScanner.lllIlIIllIl(l, l2);
    }

    private static void lIIlIIIllIl() {
        lIIIlIIll = new String[IIlIlIIll[86]];
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[0]] = FastScanner.IlIllllIlIl("", "dOSwo");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[1]] = FastScanner.IlIllllIlIl("Zw==", "GZHKx");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[2]] = FastScanner.llIllllIlIl("to+cedDY9Dg=", "HzwEy");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[3]] = FastScanner.llIllllIlIl("nqTfKg0OKcA=", "NBtog");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[10]] = FastScanner.IlIllllIlIl("cw==", "ScQas");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[11]] = FastScanner.llIllllIlIl("atxF/T3+qbY=", "sesCX");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[12]] = FastScanner.IIIlIIIllIl("OKAacAD2ZCc=", "mTpyL");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[15]] = FastScanner.IlIllllIlIl("Tw==", "oAGVR");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[18]] = FastScanner.IIIlIIIllIl("BZdjZXywuHw=", "lLzuM");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[19]] = FastScanner.llIllllIlIl("zEDAKdiVU8c=", "jPaBl");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[20]] = FastScanner.IIIlIIIllIl("5Sw1mTvEiE8=", "alEwI");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[21]] = FastScanner.IlIllllIlIl("", "fSiyg");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[29]] = FastScanner.llIllllIlIl("b6Bu8s9INTo=", "PCVAA");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[32]] = FastScanner.IlIllllIlIl("Yg==", "BKDlu");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[35]] = FastScanner.IIIlIIIllIl("hf3saUTdgAU=", "NJfqr");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[37]] = FastScanner.llIllllIlIl("5vcKTUDgmjw=", "INrui");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[36]] = FastScanner.IlIllllIlIl("dw==", "WNILR");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[40]] = FastScanner.IIIlIIIllIl("JW33XOtB08k=", "umkdC");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[41]] = FastScanner.IIIlIIIllIl("qMzYW8euaB0=", "vqWrI");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[46]] = FastScanner.llIllllIlIl("0ahW1StFWYA=", "uwLAM");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[47]] = FastScanner.IlIllllIlIl("", "zOmss");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[48]] = FastScanner.IIIlIIIllIl("cFCP7Eg9xu0=", "MHZIL");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[49]] = FastScanner.llIllllIlIl("9L2k9TRqV2g=", "mnXCO");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[50]] = FastScanner.IIIlIIIllIl("E0BKW0gUP9Y=", "dFQEu");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[51]] = FastScanner.llIllllIlIl("w5wIGonGzgs=", "tEpYe");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[52]] = FastScanner.llIllllIlIl("e87FaXYM0iM=", "nnavp");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[53]] = FastScanner.llIllllIlIl("XrhQA0qd7gM=", "kselZ");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[54]] = FastScanner.IlIllllIlIl("", "GxPiK");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[55]] = FastScanner.llIllllIlIl("1rpmXYLBWmE=", "tQdbh");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[56]] = FastScanner.IlIllllIlIl("eQ==", "YVHbt");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[60]] = FastScanner.IlIllllIlIl("Rw==", "glyMJ");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[5]] = FastScanner.llIllllIlIl("JKrch/iuMQo=", "Axtek");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[63]] = FastScanner.IlIllllIlIl("Qg==", "bNGZd");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[64]] = FastScanner.IlIllllIlIl("bQ==", "MgjQR");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[67]] = FastScanner.llIllllIlIl("TZvf2aFCFTI=", "sGUZh");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[68]] = FastScanner.IlIllllIlIl("ZFFW", "DqvkZ");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[69]] = FastScanner.IlIllllIlIl("TA==", "lfzBN");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[72]] = FastScanner.IIIlIIIllIl("MmOwg2gN1G8=", "urFgS");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[34]] = FastScanner.IIIlIIIllIl("ra4EYMv92BQ=", "trWoz");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[73]] = FastScanner.IIIlIIIllIl("KSpDPrD5vc4=", "JVuAD");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[76]] = FastScanner.llIllllIlIl("bOAczndf854=", "rQtps");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[77]] = FastScanner.IlIllllIlIl("TQ==", "mQHjg");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[82]] = FastScanner.IlIllllIlIl("RkdX", "fgwyZ");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[83]] = FastScanner.IIIlIIIllIl("/WI6EPIMaFk=", "donCz");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[39]] = FastScanner.IIIlIIIllIl("CGcHrMOoZho=", "Geosf");
        FastScanner.lIIIlIIll[FastScanner.IIlIlIIll[84]] = FastScanner.IlIllllIlIl("QQ==", "aOgpQ");
    }

    private static String IIIlIIIllIl(String llIlIIIIllIlIl, String IlIlIIIIllIlIl) {
        try {
            SecretKeySpec lIIlIIIIllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlIlIIIIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IIIlIIIIllIlIl = Cipher.getInstance("Blowfish");
            IIIlIIIIllIlIl.init(IIlIlIIll[2], lIIlIIIIllIlIl);
            return new String(IIIlIIIIllIlIl.doFinal(Base64.getDecoder().decode(llIlIIIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIIIIllIlIl) {
            lllIIIIIllIlIl.printStackTrace();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String IlIllllIlIl(String lIIlllllIlIlIl, String IIIlllllIlIlIl) {
        lIIlllllIlIlIl = new String(Base64.getDecoder().decode(lIIlllllIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        lllIllllIlIlIl = new StringBuilder();
        IllIllllIlIlIl = IIIlllllIlIlIl.toCharArray();
        lIlIllllIlIlIl = FastScanner.IIlIlIIll[0];
        llIlIlllIlIlIl = lIIlllllIlIlIl.toCharArray();
        IIllIlllIlIlIl = llIlIlllIlIlIl.length;
        lIllIlllIlIlIl = FastScanner.IIlIlIIll[0];
        "".length();
        if (" ".length() <= " ".length() << (" ".length() << " ".length())) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            IIlIllllIlIlIl = llIlIlllIlIlIl[lIllIlllIlIlIl];
            lllIllllIlIlIl.append((char)(IIlIllllIlIlIl ^ IllIllllIlIlIl[lIlIllllIlIlIl % IllIllllIlIlIl.length]));
            "".length();
            ++lIlIllllIlIlIl;
            ++lIllIlllIlIlIl;
lbl19:
            // 2 sources

            ** while (!FastScanner.IIIIlIIllIl((int)lIllIlllIlIlIl, (int)IIllIlllIlIlIl))
        }
lbl20:
        // 1 sources

        return String.valueOf(lllIllllIlIlIl);
    }

    private static String llIllllIlIl(String IllIIlllIlIlIl, String lIlIIlllIlIlIl) {
        try {
            SecretKeySpec IIlIIlllIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIlllIlIlIl.getBytes(StandardCharsets.UTF_8)), IIlIlIIll[18]), "DES");
            Cipher llIIIlllIlIlIl = Cipher.getInstance("DES");
            llIIIlllIlIlIl.init(IIlIlIIll[2], IIlIIlllIlIlIl);
            return new String(llIIIlllIlIlIl.doFinal(Base64.getDecoder().decode(IllIIlllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIIIlllIlIlIl) {
            IlIIIlllIlIlIl.printStackTrace();
            return null;
        }
    }

    private static void IlIlIIIllIl() {
        IIlIlIIll = new int[87];
        FastScanner.IIlIlIIll[0] = (0xE8 ^ 0xA3) & ~(0x3B ^ 0x70);
        FastScanner.IIlIlIIll[1] = " ".length();
        FastScanner.IIlIlIIll[2] = " ".length() << " ".length();
        FastScanner.IIlIlIIll[3] = "   ".length();
        FastScanner.IIlIlIIll[4] = 0xF1 ^ 0xAA;
        FastScanner.IIlIlIIll[5] = 0x3A ^ 0x25;
        FastScanner.IIlIlIIll[6] = (0x6E ^ 0x55) << " ".length();
        FastScanner.IIlIlIIll[7] = 52 + 78 - 87 + 128;
        FastScanner.IIlIlIIll[8] = 168 + 212 - 157 + 16;
        FastScanner.IIlIlIIll[9] = (0x44 ^ 0x1B) << " ".length();
        FastScanner.IIlIlIIll[10] = " ".length() << (" ".length() << " ".length());
        FastScanner.IIlIlIIll[11] = (0x96 ^ 0xBD) << (" ".length() << " ".length()) ^ 63 + 159 - 126 + 73;
        FastScanner.IIlIlIIll[12] = "   ".length() << " ".length();
        FastScanner.IIlIlIIll[13] = (0xE6 ^ 0xB7) << " ".length();
        FastScanner.IIlIlIIll[14] = 142 + 116 - 244 + 139 + ((9 ^ 0xE) << (" ".length() << " ".length())) - (0x44 ^ 0x31) + (0xF6 ^ 0x8B);
        FastScanner.IIlIlIIll[15] = (0xAC ^ 0x93) << " ".length() ^ (0x46 ^ 0x3F);
        FastScanner.IIlIlIIll[16] = ((0xB5 ^ 0x88) << " ".length()) + (" ".length() << " ".length()) - ((0x4C ^ 0x7F) << " ".length()) + (62 + 46 - 91 + 126);
        FastScanner.IIlIlIIll[17] = (0xFB ^ 0xB0) << " ".length();
        FastScanner.IIlIlIIll[18] = " ".length() << "   ".length();
        FastScanner.IIlIlIIll[19] = 63 + 67 - 125 + 134 ^ (0x5E ^ 0x1F) << " ".length();
        FastScanner.IIlIlIIll[20] = ((0x59 ^ 0x44) << (" ".length() << " ".length()) ^ (0xF8 ^ 0x89)) << " ".length();
        FastScanner.IIlIlIIll[21] = 0xF3 ^ 0xC6 ^ (0xA9 ^ 0xB6) << " ".length();
        FastScanner.IIlIlIIll[22] = 177 + 172 - 164 + 12 ^ (0xA9 ^ 0xBA) << "   ".length();
        FastScanner.IIlIlIIll[23] = (0xC8 ^ 0xC3) << "   ".length();
        FastScanner.IIlIlIIll[24] = ((0x13 ^ 0x3E) << (" ".length() << " ".length()) ^ 98 + 32 - 74 + 99) << " ".length();
        FastScanner.IIlIlIIll[25] = 0x33 ^ 0x44;
        FastScanner.IIlIlIIll[26] = (0x7A ^ 0x71 ^ (0x16 ^ 0x31) << " ".length()) << " ".length();
        FastScanner.IIlIlIIll[27] = 97 + 67 - 23 + 22;
        FastScanner.IIlIlIIll[28] = -" ".length();
        FastScanner.IIlIlIIll[29] = "   ".length() << (" ".length() << " ".length());
        FastScanner.IIlIlIIll[30] = 58 + 122 - 102 + 61;
        FastScanner.IIlIlIIll[31] = (158 + 123 - 187 + 75 ^ (0x7E ^ 0x39) << " ".length()) << (" ".length() << " ".length());
        FastScanner.IIlIlIIll[32] = 0x43 ^ 0x2E ^ "   ".length() << (0x41 ^ 0x44);
        FastScanner.IIlIlIIll[33] = (0xBE ^ 0x9F) << " ".length() ^ (0x75 ^ 6);
        FastScanner.IIlIlIIll[34] = (0x97 ^ 0x84) << " ".length();
        FastScanner.IIlIlIIll[35] = (0xA1 ^ 0xA6) << " ".length();
        FastScanner.IIlIlIIll[36] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.IIlIlIIll[37] = 4 ^ 0xB;
        FastScanner.IIlIlIIll[38] = 0x9F ^ 0xA6;
        FastScanner.IIlIlIIll[39] = ("   ".length() << (" ".length() << (" ".length() << " ".length())) ^ (0xB0 ^ 0x8B)) << (" ".length() << " ".length());
        FastScanner.IIlIlIIll[40] = 0xAA ^ 0xBB;
        FastScanner.IIlIlIIll[41] = ((0x56 ^ 0x41) << " ".length() ^ (8 ^ 0x2F)) << " ".length();
        FastScanner.IIlIlIIll[42] = 0xEA ^ 0x8D ^ (0x5C ^ 0x5B) << (" ".length() << " ".length());
        FastScanner.IIlIlIIll[43] = ((5 ^ 0x18) << " ".length() ^ (0x41 ^ 0x64)) << " ".length();
        FastScanner.IIlIlIIll[44] = (0xB ^ 0x26) + (13 + 14 - -28 + 120) - (87 + 75 - 99 + 92) + ((0xA1 ^ 0x80) << (" ".length() << " ".length()));
        FastScanner.IIlIlIIll[45] = " ".length() << (137 + 82 - 195 + 133 ^ (0x8A ^ 0xC7) << " ".length());
        FastScanner.IIlIlIIll[46] = 0x53 ^ 0x40;
        FastScanner.IIlIlIIll[47] = (0x15 ^ 0x46 ^ (0x2B ^ 0) << " ".length()) << (" ".length() << " ".length());
        FastScanner.IIlIlIIll[48] = 0x68 ^ 0x2F ^ (0xB0 ^ 0x99) << " ".length();
        FastScanner.IIlIlIIll[49] = (0xBD ^ 0xB6) << " ".length();
        FastScanner.IIlIlIIll[50] = (0xD5 ^ 0xC2) << (" ".length() << " ".length()) ^ (0x8E ^ 0xC5);
        FastScanner.IIlIlIIll[51] = "   ".length() << "   ".length();
        FastScanner.IIlIlIIll[52] = 0x76 ^ 0x6F;
        FastScanner.IIlIlIIll[53] = (0x2F ^ 0x22) << " ".length();
        FastScanner.IIlIlIIll[54] = 0x5E ^ 0x45;
        FastScanner.IIlIlIIll[55] = (0x3C ^ 0x29 ^ (0x54 ^ 0x5D) << " ".length()) << (" ".length() << " ".length());
        FastScanner.IIlIlIIll[56] = (0x35 ^ 0x30) << (2 ^ 7) ^ 188 + 181 - 327 + 147;
        FastScanner.IIlIlIIll[57] = 0x20 ^ 0x19 ^ (0x39 ^ 0xE) << " ".length();
        FastScanner.IIlIlIIll[58] = ((0x61 ^ 0x64) << (" ".length() << (" ".length() << " ".length()))) + ((0x32 ^ 0x11) << " ".length()) - ((0x59 ^ 0x5E) << "   ".length()) + (0x47 ^ 0x70);
        FastScanner.IIlIlIIll[59] = ((3 ^ 0x44) << " ".length() ^ 50 + 170 - 87 + 38) << " ".length();
        FastScanner.IIlIlIIll[60] = ((1 ^ 0x36) << " ".length() ^ (0xD7 ^ 0xB6)) << " ".length();
        FastScanner.IIlIlIIll[61] = (39 + 18 - -38 + 60 ^ (0x37 ^ 0x76) << " ".length()) << " ".length();
        FastScanner.IIlIlIIll[62] = (0x66 ^ 0x3D) << " ".length();
        FastScanner.IIlIlIIll[63] = " ".length() << (0x41 ^ 0x44);
        FastScanner.IIlIlIIll[64] = 0xB3 ^ 0x92;
        FastScanner.IIlIlIIll[65] = ((0xF1 ^ 0xA0) << " ".length()) + (116 + 112 - 139 + 48) - (117 + 215 - 287 + 210) + (111 + 63 - 139 + 142);
        FastScanner.IIlIlIIll[66] = (0x50 ^ 0x7F) << (" ".length() << " ".length());
        FastScanner.IIlIlIIll[67] = (0x81 ^ 0x90) << " ".length();
        FastScanner.IIlIlIIll[68] = 67 + 11 - 36 + 149 ^ (0xE4 ^ 0xC3) << (" ".length() << " ".length());
        FastScanner.IIlIlIIll[69] = ((0x37 ^ 0x3C) << "   ".length() ^ (0x41 ^ 0x10)) << (" ".length() << " ".length());
        FastScanner.IIlIlIIll[70] = ((0xAF ^ 0xA2) << (" ".length() << " ".length())) + (84 + 117 - 148 + 80) - ((0x50 ^ 0x61) << " ".length()) + ((0x56 ^ 0x79) << " ".length());
        FastScanner.IIlIlIIll[71] = (0x14 ^ 0x41) << " ".length();
        FastScanner.IIlIlIIll[72] = 0x3A ^ 0x41 ^ (0xA5 ^ 0x8A) << " ".length();
        FastScanner.IIlIlIIll[73] = 0x96 ^ 0xA9 ^ "   ".length() << "   ".length();
        FastScanner.IIlIlIIll[74] = (0xEA ^ 0x9D) << " ".length();
        FastScanner.IIlIlIIll[75] = "   ".length() + ((0xEC ^ 0xA5) << " ".length()) - (" ".length() << (" ".length() << (" ".length() << " ".length()))) + ((0x16 ^ 9) << " ".length());
        FastScanner.IIlIlIIll[76] = (11 + 128 - 97 + 147 ^ (0x33 ^ 0x24) << "   ".length()) << "   ".length();
        FastScanner.IIlIlIIll[77] = 0x1F ^ 0x36;
        FastScanner.IIlIlIIll[78] = 8 ^ 0x61;
        FastScanner.IIlIlIIll[79] = (0x66 ^ 0x5B ^ (0xAC ^ 0xA7) << " ".length()) << " ".length();
        FastScanner.IIlIlIIll[80] = (0x84 ^ 0x99) << (" ".length() << " ".length());
        FastScanner.IIlIlIIll[81] = (0x3A ^ 0x77 ^ (0x4C ^ 0x79) << " ".length()) << " ".length();
        FastScanner.IIlIlIIll[82] = ((0x8C ^ 0x87) << "   ".length() ^ (0xE1 ^ 0xAC)) << " ".length();
        FastScanner.IIlIlIIll[83] = (0xE1 ^ 0xAE) << " ".length() ^ 32 + 151 - 90 + 88;
        FastScanner.IIlIlIIll[84] = 0x28 ^ 0x41 ^ (0x96 ^ 0x87) << (" ".length() << " ".length());
        FastScanner.IIlIlIIll[85] = (1 ^ 0x20) << " ".length();
        FastScanner.IIlIlIIll[86] = (0x1B ^ 0x72 ^ (0x39 ^ 6) << " ".length()) << " ".length();
    }

    private static boolean llllIIIllIl(int n, int n2) {
        return n == n2;
    }

    private static boolean IIIIlIIllIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIIIlIIllIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IlIIlIIllIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean IlllIIIllIl(Object object) {
        return object != null;
    }

    private static boolean llIlIIIllIl(int n) {
        return n != 0;
    }

    private static boolean IIllIIIllIl(int n) {
        return n == 0;
    }

    private static boolean llIIlIIllIl(int n) {
        return n >= 0;
    }

    private static boolean lIllIIIllIl(int n) {
        return n < 0;
    }

    private static boolean IIlIlIIllIl(int n) {
        return n <= 0;
    }

    private static boolean lIlIlIIllIl(int n) {
        return n > 0;
    }

    private static boolean IllIlIIllIl(int n, int n2) {
        return n != n2;
    }

    private static int lllIlIIllIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

