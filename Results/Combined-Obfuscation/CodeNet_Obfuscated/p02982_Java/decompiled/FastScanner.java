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
    private final byte[] buffer = new byte[IllIllIIIl[IIllllIIIl[0]]];
    private int ptr = IllIllIIIl[IIllllIIIl[1]];
    private int buflen = IllIllIIIl[IIllllIIIl[1]];
    private static int[] IllIllIIIl;
    private static String[] lIIlllIIIl;
    private static int[] IIllllIIIl;

    FastScanner() {
        FastScanner IIIllllllIlIl;
    }

    private boolean hasNextByte() {
        FastScanner IIlIlllllIlIl;
        if (FastScanner.llIlIllllll(FastScanner.lIllIIlllll(IIlIlllllIlIl.ptr, IIlIlllllIlIl.buflen) ? 1 : 0)) {
            return IllIllIIIl[IIllllIIIl[2]];
        }
        IIlIlllllIlIl.ptr = IllIllIIIl[IIllllIIIl[1]];
        try {
            IIlIlllllIlIl.buflen = IIlIlllllIlIl.in.read(IIlIlllllIlIl.buffer);
            lIIlllIIIl[IIllllIIIl[0]].length();
            "".length();
        }
        catch (IOException llIIlllllIlIl) {
            llIIlllllIlIl.printStackTrace();
        }
        if (FastScanner.IIllIllllll(lIIlllIIIl[IIllllIIIl[1]].length(), lIIlllIIIl[IIllllIIIl[2]].length() << lIIlllIIIl[IIllllIIIl[3]].length())) {
            return ((IIllllIIIl[4] ^ IIllllIIIl[5] ^ (IIllllIIIl[6] ^ IIllllIIIl[7]) << lIIlllIIIl[IIllllIIIl[8]].length()) & ((IIllllIIIl[9] ^ IIllllIIIl[10]) << (lIIlllIIIl[IIllllIIIl[11]].length() << lIIlllIIIl[IIllllIIIl[12]].length()) ^ (IIllllIIIl[13] ^ IIllllIIIl[14]) ^ -lIIlllIIIl[IIllllIIIl[15]].length())) != 0;
        }
        if (FastScanner.llIlIllllll(FastScanner.IlllIIlllll(IIlIlllllIlIl.buflen) ? 1 : 0)) {
            return IllIllIIIl[IIllllIIIl[1]];
        }
        return IllIllIIIl[IIllllIIIl[2]];
    }

    private int readByte() {
        FastScanner llllIllllIlIl;
        if (FastScanner.llIlIllllll(FastScanner.llllIIlllll(llllIllllIlIl.hasNextByte() ? 1 : 0) ? 1 : 0)) {
            int n = llllIllllIlIl.ptr;
            llllIllllIlIl.ptr = n + IllIllIIIl[IIllllIIIl[2]];
            return llllIllllIlIl.buffer[n];
        }
        return IllIllIIIl[IIllllIIIl[3]];
    }

    private static boolean isPrintableChar(int IIllIllllIlIl) {
        int n;
        if (FastScanner.llIlIllllll(FastScanner.IIIIlIlllll(IllIllIIIl[IIllllIIIl[8]], IIllIllllIlIl) ? 1 : 0) && FastScanner.llIlIllllll(FastScanner.IIIIlIlllll(IIllIllllIlIl, IllIllIIIl[IIllllIIIl[11]]) ? 1 : 0)) {
            n = IllIllIIIl[IIllllIIIl[2]];
            lIIlllIIIl[IIllllIIIl[16]].length();
            "".length();
            if (FastScanner.lIllIllllll(lIIlllIIIl[IIllllIIIl[17]].length(), lIIlllIIIl[IIllllIIIl[18]].length() << lIIlllIIIl[IIllllIIIl[19]].length())) {
                return ((IIllllIIIl[20] ^ IIllllIIIl[21]) << (lIIlllIIIl[IIllllIIIl[7]].length() << lIIlllIIIl[IIllllIIIl[22]].length()) & ((IIllllIIIl[23] ^ IIllllIIIl[24]) << (lIIlllIIIl[IIllllIIIl[25]].length() << lIIlllIIIl[IIllllIIIl[26]].length()) ^ IIllllIIIl[27])) != 0;
            }
        } else {
            n = IllIllIIIl[IIllllIIIl[1]];
        }
        return n != 0;
    }

    public boolean hasNext() {
        FastScanner lIIlIllllIlIl;
        while (FastScanner.llIlIllllll(FastScanner.llllIIlllll(lIIlIllllIlIl.hasNextByte() ? 1 : 0) ? 1 : 0) && FastScanner.llIlIllllll(FastScanner.lIIIlIlllll(FastScanner.isPrintableChar(lIIlIllllIlIl.buffer[lIIlIllllIlIl.ptr]) ? 1 : 0) ? 1 : 0)) {
            lIIlIllllIlIl.ptr += IllIllIIIl[IIllllIIIl[2]];
            lIIlllIIIl[IIllllIIIl[28]].length();
            "".length();
            if (!FastScanner.IlllIllllll(lIIlllIIIl[IIllllIIIl[29]].length())) continue;
            return ((IIllllIIIl[30] ^ IIllllIIIl[31] ^ (IIllllIIIl[8] ^ IIllllIIIl[19]) << (lIIlllIIIl[IIllllIIIl[32]].length() << lIIlllIIIl[IIllllIIIl[33]].length())) & ((IIllllIIIl[34] ^ IIllllIIIl[35]) << lIIlllIIIl[IIllllIIIl[36]].length() ^ (IIllllIIIl[37] ^ IIllllIIIl[38]) ^ -lIIlllIIIl[IIllllIIIl[39]].length())) != 0;
        }
        return this.hasNextByte();
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        FastScanner IIlIIllllIlIl;
        if (FastScanner.llIlIllllll(FastScanner.lIIIlIlllll(IIlIIllllIlIl.hasNext() ? 1 : 0) ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder llIIIllllIlIl = new StringBuilder();
        int IlIIIllllIlIl = IIlIIllllIlIl.readByte();
        while (FastScanner.llIlIllllll(FastScanner.llllIIlllll(FastScanner.isPrintableChar(IlIIIllllIlIl) ? 1 : 0) ? 1 : 0)) {
            llIIIllllIlIl.appendCodePoint(IlIIIllllIlIl);
            lIIlllIIIl[IIllllIIIl[40]].length();
            IlIIIllllIlIl = IIlIIllllIlIl.readByte();
            lIIlllIIIl[IIllllIIIl[41]].length();
            "".length();
            if (!FastScanner.llllIllllll(null)) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        FastScanner IlIllIlllIlIl;
        if (FastScanner.llIlIllllll(FastScanner.lIIIlIlllll(IlIllIlllIlIl.hasNext() ? 1 : 0) ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long lIIllIlllIlIl = 0L;
        int IIIllIlllIlIl = IllIllIIIl[IIllllIIIl[1]];
        int lllIlIlllIlIl = IlIllIlllIlIl.readByte();
        if (FastScanner.llIlIllllll(FastScanner.IlIIlIlllll(lllIlIlllIlIl, IllIllIIIl[IIllllIIIl[12]]) ? 1 : 0)) {
            IIIllIlllIlIl = IllIllIIIl[IIllllIIIl[2]];
            lllIlIlllIlIl = IlIllIlllIlIl.readByte();
        }
        if (!FastScanner.llIlIllllll(FastScanner.llIIlIlllll(lllIlIlllIlIl, IllIllIIIl[IIllllIIIl[15]]) ? 1 : 0) || FastScanner.llIlIllllll(FastScanner.lIllIIlllll(IllIllIIIl[IIllllIIIl[16]], lllIlIlllIlIl) ? 1 : 0)) {
            throw new NumberFormatException();
        }
        do {
            if (FastScanner.llIlIllllll(FastScanner.IIIIlIlllll(IllIllIIIl[IIllllIIIl[15]], lllIlIlllIlIl) ? 1 : 0) && FastScanner.llIlIllllll(FastScanner.IIIIlIlllll(lllIlIlllIlIl, IllIllIIIl[IIllllIIIl[16]]) ? 1 : 0)) {
                lIIllIlllIlIl *= 10L;
                lIIllIlllIlIl += (long)(lllIlIlllIlIl - IllIllIIIl[IIllllIIIl[15]]);
                lIIlllIIIl[IIllllIIIl[42]].length();
                "".length();
                if (FastScanner.IIllIllllll(((IIllllIIIl[43] ^ IIllllIIIl[44]) << lIIlllIIIl[IIllllIIIl[45]].length() ^ (IIllllIIIl[14] ^ IIllllIIIl[46])) & ((IIllllIIIl[47] ^ IIllllIIIl[48]) << lIIlllIIIl[IIllllIIIl[49]].length() ^ (IIllllIIIl[50] ^ IIllllIIIl[51]) ^ -lIIlllIIIl[IIllllIIIl[52]].length()), lIIlllIIIl[IIllllIIIl[53]].length() << lIIlllIIIl[IIllllIIIl[54]].length())) {
                    return 0L;
                }
            } else {
                if (!FastScanner.llIlIllllll(FastScanner.IIlIlIlllll(lllIlIlllIlIl, IllIllIIIl[IIllllIIIl[3]]) ? 1 : 0) || FastScanner.llIlIllllll(FastScanner.lIIIlIlllll(FastScanner.isPrintableChar(lllIlIlllIlIl) ? 1 : 0) ? 1 : 0)) {
                    long l;
                    if (FastScanner.llIlIllllll(FastScanner.llllIIlllll(IIIllIlllIlIl) ? 1 : 0)) {
                        l = -lIIllIlllIlIl;
                        lIIlllIIIl[IIllllIIIl[55]].length();
                        "".length();
                        if (FastScanner.IIllIllllll(lIIlllIIIl[IIllllIIIl[56]].length(), lIIlllIIIl[IIllllIIIl[57]].length())) {
                            return 0L;
                        }
                    } else {
                        l = lIIllIlllIlIl;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            lIIlllIIIl[IIllllIIIl[58]].length();
            "".length();
        } while (!FastScanner.llIlIllllll((IIllllIIIl[59] ^ IIllllIIIl[26]) << lIIlllIIIl[IIllllIIIl[60]].length() & ((IIllllIIIl[61] ^ IIllllIIIl[62]) << lIIlllIIIl[IIllllIIIl[21]].length() ^ IIllllIIIl[27])));
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int nextInt() {
        void var1_1;
        FastScanner IIIIlIlllIlIl;
        long llllIIlllIlIl = IIIIlIlllIlIl.nextLong();
        if (!FastScanner.llIlIllllll(FastScanner.IllIlIlllll(FastScanner.lIlIlIlllll(llllIIlllIlIl, Integer.MIN_VALUE)) ? 1 : 0) || FastScanner.llIlIllllll(FastScanner.lllIlIlllll(FastScanner.lIlIlIlllll(llllIIlllIlIl, Integer.MAX_VALUE)) ? 1 : 0)) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double nextDouble() {
        FastScanner llIlIIlllIlIl;
        return Double.parseDouble(llIlIIlllIlIl.next());
    }

    static {
        FastScanner.IlIlIllllll();
        FastScanner.lIIIIllllll();
        FastScanner.IIllIIlllll();
    }

    private static void IIllIIlllll() {
        IllIllIIIl = new int[IIllllIIIl[17]];
        FastScanner.IllIllIIIl[FastScanner.IIllllIIIl[0]] = lIIlllIIIl[IIllllIIIl[20]].length() << ((IIllllIIIl[63] ^ IIllllIIIl[64]) << lIIlllIIIl[IIllllIIIl[65]].length());
        FastScanner.IllIllIIIl[FastScanner.IIllllIIIl[1]] = (IIllllIIIl[0] ^ IIllllIIIl[66]) & (IIllllIIIl[67] ^ IIllllIIIl[68] ^ IIllllIIIl[27]);
        FastScanner.IllIllIIIl[FastScanner.IIllllIIIl[2]] = lIIlllIIIl[IIllllIIIl[69]].length();
        FastScanner.IllIllIIIl[FastScanner.IIllllIIIl[3]] = -lIIlllIIIl[IIllllIIIl[70]].length();
        FastScanner.IllIllIIIl[FastScanner.IIllllIIIl[8]] = (IIllllIIIl[71] ^ IIllllIIIl[72]) << lIIlllIIIl[IIllllIIIl[38]].length() ^ (IIllllIIIl[73] ^ IIllllIIIl[74]);
        FastScanner.IllIllIIIl[FastScanner.IIllllIIIl[11]] = ((IIllllIIIl[75] ^ IIllllIIIl[56]) << lIIlllIIIl[IIllllIIIl[76]].length() ^ (IIllllIIIl[77] ^ IIllllIIIl[78])) << lIIlllIIIl[IIllllIIIl[59]].length();
        FastScanner.IllIllIIIl[FastScanner.IIllllIIIl[12]] = IIllllIIIl[79] ^ IIllllIIIl[80];
        FastScanner.IllIllIIIl[FastScanner.IIllllIIIl[15]] = lIIlllIIIl[IIllllIIIl[81]].length() << (lIIlllIIIl[IIllllIIIl[82]].length() << (lIIlllIIIl[IIllllIIIl[83]].length() << lIIlllIIIl[IIllllIIIl[84]].length()));
        FastScanner.IllIllIIIl[FastScanner.IIllllIIIl[16]] = IIllllIIIl[81] ^ IIllllIIIl[85] ^ lIIlllIIIl[IIllllIIIl[86]].length() << (IIllllIIIl[86] ^ IIllllIIIl[59]);
    }

    private static boolean IlIIlIlllll(int n, int n2) {
        boolean bl;
        if (FastScanner.IIIIlllllll(n, n2)) {
            bl = IIllllIIIl[1];
            "".length();
            if (-" ".length() >= " ".length() << " ".length()) {
                return ((0xA0 ^ 0xA5) & ~(0x53 ^ 0x56)) != 0;
            }
        } else {
            bl = IIllllIIIl[0];
        }
        return bl;
    }

    private static boolean llIIlIlllll(int n, int n2) {
        boolean bl;
        if (FastScanner.lIIIlllllll(n, n2)) {
            bl = IIllllIIIl[1];
            "".length();
            if (" ".length() < 0) {
                return ((0x2E ^ 0x3B) << (" ".length() << " ".length()) & ~((0xA5 ^ 0xB0) << (" ".length() << " ".length()))) != 0;
            }
        } else {
            bl = IIllllIIIl[0];
        }
        return bl;
    }

    private static boolean lIllIIlllll(int n, int n2) {
        boolean bl;
        if (FastScanner.IlIIlllllll(n, n2)) {
            bl = IIllllIIIl[1];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) == 0) {
                return ((34 + 77 - 13 + 73 ^ (0xED ^ 0xB2) << " ".length()) & ((0x6C ^ 0x51) << " ".length() ^ (0xEC ^ 0x83) ^ -" ".length())) != 0;
            }
        } else {
            bl = IIllllIIIl[0];
        }
        return bl;
    }

    private static boolean IIIIlIlllll(int n, int n2) {
        boolean bl;
        if (FastScanner.lIllIllllll(n, n2)) {
            bl = IIllllIIIl[1];
            "".length();
            if (null != null) {
                return (((0x76 ^ 0x7D) & ~(0x1A ^ 0x11) ^ (0xE6 ^ 0x87)) & ((0x69 ^ 0x6C) << (0xBE ^ 0xBB) ^ 55 + 55 - 57 + 140 ^ -" ".length())) != 0;
            }
        } else {
            bl = IIllllIIIl[0];
        }
        return bl;
    }

    private static boolean llllIIlllll(int n) {
        boolean bl;
        if (FastScanner.llIlIllllll(n)) {
            bl = IIllllIIIl[1];
            "".length();
            if (-" ".length() == " ".length()) {
                return ((0x59 ^ 0x3E ^ (0xFA ^ 0xC5) << " ".length()) & ((0x3D ^ 0x36) << (" ".length() << " ".length()) ^ (0xBE ^ 0x8B) ^ -" ".length())) != 0;
            }
        } else {
            bl = IIllllIIIl[0];
        }
        return bl;
    }

    private static boolean lIIIlIlllll(int n) {
        boolean bl;
        if (FastScanner.IlllIllllll(n)) {
            bl = IIllllIIIl[1];
            "".length();
            if (" ".length() < 0) {
                return (((0x4B ^ 0x70) << (" ".length() << " ".length()) ^ 76 + 37 - 112 + 160) & (27 + 5 - 17 + 128 ^ (0x5E ^ 0x3F) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = IIllllIIIl[0];
        }
        return bl;
    }

    private static boolean IllIlIlllll(int n) {
        boolean bl;
        if (FastScanner.llIIlllllll(n)) {
            bl = IIllllIIIl[1];
            "".length();
            if (" ".length() << " ".length() == 0) {
                return ((0xB4 ^ 0x83) & ~(0x4C ^ 0x7B)) != 0;
            }
        } else {
            bl = IIllllIIIl[0];
        }
        return bl;
    }

    private static boolean IlllIIlllll(int n) {
        boolean bl;
        if (FastScanner.IIlIlllllll(n)) {
            bl = IIllllIIIl[1];
            "".length();
            if ("   ".length() <= (((0x73 ^ 0x6A) << (" ".length() << " ".length()) ^ (0x24 ^ 0x21)) & (" ".length() << "   ".length() ^ (0x54 ^ 0x3D) ^ -" ".length()))) {
                return ((0x5B ^ 0x56 ^ (0x9D ^ 0x88) << " ".length()) << " ".length() & (((0x7B ^ 0x66) << " ".length() ^ (0x67 ^ 0x7A)) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = IIllllIIIl[0];
        }
        return bl;
    }

    private static boolean lllIlIlllll(int n) {
        boolean bl;
        if (FastScanner.lIlIlllllll(n)) {
            bl = IIllllIIIl[1];
            "".length();
            if ((((0x7F ^ 0x4A) << " ".length() ^ (0x77 ^ 0x3E)) & (0x85 ^ 0x90 ^ (0x96 ^ 0x8D) << " ".length() ^ -" ".length())) > 0) {
                return (((0xE6 ^ 0xAF) << " ".length() ^ 72 + 73 - 84 + 78) & (57 + 5 - -80 + 31 ^ (0xA7 ^ 0x8A) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
            }
        } else {
            bl = IIllllIIIl[0];
        }
        return bl;
    }

    private static boolean IIlIlIlllll(int n, int n2) {
        boolean bl;
        if (FastScanner.IllIlllllll(n, n2)) {
            bl = IIllllIIIl[1];
            "".length();
            if (-"   ".length() >= 0) {
                return (((0 ^ 0x63) << " ".length() ^ 95 + 165 - 247 + 180) << "   ".length() & (((0x4A ^ 0x17) << " ".length() ^ 102 + 150 - 131 + 68) << "   ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = IIllllIIIl[0];
        }
        return bl;
    }

    private static int lIlIlIlllll(long l, long l2) {
        return FastScanner.lllIlllllll(l, l2);
    }

    private static void lIIIIllllll() {
        lIIlllIIIl = new String[IIllllIIIl[75]];
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[0]] = FastScanner.IIlllIlllll("cNJ9Pp3jMp8=", "NeiQL");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[1]] = FastScanner.lIlllIlllll("bQ==", "MzSPf");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[2]] = FastScanner.lIlllIlllll("Yg==", "BZPnG");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[3]] = FastScanner.IllllIlllll("m72LEotPU/g=", "kPKBY");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[8]] = FastScanner.lIlllIlllll("SA==", "htdEQ");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[11]] = FastScanner.lIlllIlllll("Uw==", "ssSJj");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[12]] = FastScanner.lIlllIlllll("WA==", "xBTXo");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[15]] = FastScanner.IllllIlllll("ZGdnmR8elNc=", "yWDBW");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[16]] = FastScanner.IllllIlllll("vrO3OwxYqCo=", "STROO");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[17]] = FastScanner.IIlllIlllll("doxqCPOpjhQ=", "vliHd");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[18]] = FastScanner.IIlllIlllll("OBj+KSoXCno=", "fonKb");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[19]] = FastScanner.IllllIlllll("4U5EsE8haho=", "IMbul");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[7]] = FastScanner.IllllIlllll("B7ObRAje1ns=", "qSXnj");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[22]] = FastScanner.IIlllIlllll("w+KGt9oUpko=", "FstgC");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[25]] = FastScanner.IllllIlllll("IlK18j7ycOc=", "EDpSj");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[26]] = FastScanner.lIlllIlllll("bQ==", "MFGOR");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[28]] = FastScanner.IIlllIlllll("rSg2+0tBn1I=", "DihVL");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[29]] = FastScanner.lIlllIlllll("Yg==", "BHKqN");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[32]] = FastScanner.lIlllIlllll("SA==", "hzalQ");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[33]] = FastScanner.IllllIlllll("1lNB4Jw2LUM=", "RIOtr");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[36]] = FastScanner.IIlllIlllll("o9+oqXFdPA8=", "XTGQK");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[39]] = FastScanner.lIlllIlllll("VA==", "tkOGG");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[40]] = FastScanner.IIlllIlllll("4cyP0cOuUwU=", "waHqf");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[41]] = FastScanner.lIlllIlllll("", "BmoZX");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[42]] = FastScanner.IIlllIlllll("3L7uuHQtg+c=", "fLyfd");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[45]] = FastScanner.IllllIlllll("lWqA1H8rMPg=", "YIZrR");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[49]] = FastScanner.IIlllIlllll("cV4R0KOVrAc=", "tlCha");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[52]] = FastScanner.IllllIlllll("GP3kmar5RAY=", "tZDIy");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[53]] = FastScanner.lIlllIlllll("Uw==", "sQjoW");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[54]] = FastScanner.IIlllIlllll("y5cAcI++tjM=", "MxqKt");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[55]] = FastScanner.IllllIlllll("wwUguYSRetQ=", "TLzLx");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[56]] = FastScanner.IIlllIlllll("AtED8zcNAQE=", "ksiSx");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[57]] = FastScanner.lIlllIlllll("TnJ3", "nRWzR");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[58]] = FastScanner.IllllIlllll("CS45pwWFGrY=", "TqDpw");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[60]] = FastScanner.IllllIlllll("ce+oDYjr0jI=", "vZZDV");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[21]] = FastScanner.IIlllIlllll("jtviLL3kaA8=", "BGFPF");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[20]] = FastScanner.IllllIlllll("aDTNtDI6bsY=", "VxFQC");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[65]] = FastScanner.lIlllIlllll("Ug==", "rsesC");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[69]] = FastScanner.IIlllIlllll("oYm2ajtF9yk=", "skvJg");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[70]] = FastScanner.IIlllIlllll("9mrVs234fQU=", "ouRDY");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[38]] = FastScanner.lIlllIlllll("Tg==", "nKbMo");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[76]] = FastScanner.IIlllIlllll("6CcrTjWYX1I=", "VWZKn");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[59]] = FastScanner.IIlllIlllll("EsvFgZ42CLU=", "apaIm");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[81]] = FastScanner.IIlllIlllll("OR98x+ik1OA=", "RFFfS");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[82]] = FastScanner.IllllIlllll("IA1VxYbGKpw=", "ADBnf");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[83]] = FastScanner.IIlllIlllll("ZkbCYuweI3A=", "KqsDO");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[84]] = FastScanner.IllllIlllll("UjNaz6a/WqY=", "dBkOp");
        FastScanner.lIIlllIIIl[FastScanner.IIllllIIIl[86]] = FastScanner.IllllIlllll("temBqcEPfU0=", "PqLVI");
    }

    /*
     * Unable to fully structure code
     */
    private static String lIlllIlllll(String llIIlIIllIlIl, String IlIIlIIllIlIl) {
        llIIlIIllIlIl = new String(Base64.getDecoder().decode(llIIlIIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        lIIIlIIllIlIl = new StringBuilder();
        IIIIlIIllIlIl = IlIIlIIllIlIl.toCharArray();
        llllIIIllIlIl = FastScanner.IIllllIIIl[0];
        lIlIIIIllIlIl = llIIlIIllIlIl.toCharArray();
        IllIIIIllIlIl = lIlIIIIllIlIl.length;
        lllIIIIllIlIl = FastScanner.IIllllIIIl[0];
        "".length();
        if ((((151 ^ 184) << " ".length() ^ (192 ^ 181)) & ((29 ^ 60) << (" ".length() << " ".length()) ^ 98 + 32 - 84 + 129 ^ -" ".length())) < " ".length() << " ".length()) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            IlllIIIllIlIl = lIlIIIIllIlIl[lllIIIIllIlIl];
            lIIIlIIllIlIl.append((char)(IlllIIIllIlIl ^ IIIIlIIllIlIl[llllIIIllIlIl % IIIIlIIllIlIl.length]));
            "".length();
            ++llllIIIllIlIl;
            ++lllIIIIllIlIl;
lbl19:
            // 2 sources

            ** while (!FastScanner.lIIIlllllll((int)lllIIIIllIlIl, (int)IllIIIIllIlIl))
        }
lbl20:
        // 1 sources

        return String.valueOf(lIIIlIIllIlIl);
    }

    private static String IllllIlllll(String IIIIIIIllIlIl, String lllllllIlIlIl) {
        try {
            SecretKeySpec IllllllIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlllllIlIlIl = Cipher.getInstance("Blowfish");
            lIlllllIlIlIl.init(IIllllIIIl[2], IllllllIlIlIl);
            return new String(lIlllllIlIlIl.doFinal(Base64.getDecoder().decode(IIIIIIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIlllllIlIlIl) {
            IIlllllIlIlIl.printStackTrace();
            return null;
        }
    }

    private static String IIlllIlllll(String llIIlllIlIlIl, String IlIIlllIlIlIl) {
        try {
            SecretKeySpec lIIIlllIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlIIlllIlIlIl.getBytes(StandardCharsets.UTF_8)), IIllllIIIl[16]), "DES");
            Cipher IIIIlllIlIlIl = Cipher.getInstance("DES");
            IIIIlllIlIlIl.init(IIllllIIIl[2], lIIIlllIlIlIl);
            return new String(IIIIlllIlIlIl.doFinal(Base64.getDecoder().decode(llIIlllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIllIlIlIl) {
            llllIllIlIlIl.printStackTrace();
            return null;
        }
    }

    private static void IlIlIllllll() {
        IIllllIIIl = new int[87];
        FastScanner.IIllllIIIl[0] = (0x36 ^ 1) & ~(0x44 ^ 0x73);
        FastScanner.IIllllIIIl[1] = " ".length();
        FastScanner.IIllllIIIl[2] = " ".length() << " ".length();
        FastScanner.IIllllIIIl[3] = "   ".length();
        FastScanner.IIllllIIIl[4] = (0x81 ^ 0xBA) << " ".length();
        FastScanner.IIllllIIIl[5] = (0x7C ^ 0x79) << (" ".length() << (" ".length() << " ".length())) ^ (0xBF ^ 0xA0);
        FastScanner.IIllllIIIl[6] = 0x10 ^ 0x4D ^ (0x24 ^ 0x3D) << (" ".length() << " ".length());
        FastScanner.IIllllIIIl[7] = "   ".length() << (" ".length() << " ".length());
        FastScanner.IIllllIIIl[8] = " ".length() << (" ".length() << " ".length());
        FastScanner.IIllllIIIl[9] = ((0xE3 ^ 0xB6) << " ".length() ^ 77 + 112 - 149 + 113) << " ".length();
        FastScanner.IIllllIIIl[10] = 0x38 ^ 0x57;
        FastScanner.IIllllIIIl[11] = (0xA8 ^ 0xAF) << (" ".length() << " ".length()) ^ (0xDA ^ 0xC3);
        FastScanner.IIllllIIIl[12] = "   ".length() << " ".length();
        FastScanner.IIllllIIIl[13] = ((0xEC ^ 0x81) << " ".length()) + ((0x45 ^ 0x62) << (" ".length() << " ".length())) - ((0xA9 ^ 0xB4) << "   ".length()) + (0x9E ^ 0xC7);
        FastScanner.IIllllIIIl[14] = (116 + 68 - 182 + 133 ^ (0xEE ^ 0xA9) << " ".length()) << (" ".length() << (" ".length() << " ".length()));
        FastScanner.IIllllIIIl[15] = 0x4D ^ 0x48 ^ " ".length() << " ".length();
        FastScanner.IIllllIIIl[16] = " ".length() << "   ".length();
        FastScanner.IIllllIIIl[17] = 0xC6 ^ 0xC3 ^ "   ".length() << (" ".length() << " ".length());
        FastScanner.IIllllIIIl[18] = (0x26 ^ 0x17 ^ (0x40 ^ 0x4D) << (" ".length() << " ".length())) << " ".length();
        FastScanner.IIllllIIIl[19] = 0xC ^ 0x79 ^ (0x19 ^ 0x26) << " ".length();
        FastScanner.IIllllIIIl[20] = (0x42 ^ 0x4B) << (" ".length() << " ".length());
        FastScanner.IIllllIIIl[21] = 0x5B ^ 0x78;
        FastScanner.IIllllIIIl[22] = 0x9F ^ 0x92;
        FastScanner.IIllllIIIl[23] = (0x79 ^ 0x46) << " ".length();
        FastScanner.IIllllIIIl[24] = 0xF ^ 0x76;
        FastScanner.IIllllIIIl[25] = (3 + 0 - -41 + 97 ^ (0xF6 ^ 0xB3) << " ".length()) << " ".length();
        FastScanner.IIllllIIIl[26] = 65 + 110 - 173 + 183 ^ (0xDE ^ 0x85) << " ".length();
        FastScanner.IIllllIIIl[27] = -" ".length();
        FastScanner.IIllllIIIl[28] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.IIllllIIIl[29] = 0x54 ^ 0x45;
        FastScanner.IIllllIIIl[30] = (0xA5 ^ 0x92) << " ".length() ^ (0x8E ^ 0xB1);
        FastScanner.IIllllIIIl[31] = (0x12 ^ 0x53 ^ (0x51 ^ 0x60) << " ".length()) << " ".length();
        FastScanner.IIllllIIIl[32] = (0x16 ^ 0x1F) << " ".length();
        FastScanner.IIllllIIIl[33] = 0x5B ^ 0x48;
        FastScanner.IIllllIIIl[34] = (5 + 125 - 94 + 103 ^ (0x43 ^ 0xE) << " ".length()) << (" ".length() << " ".length());
        FastScanner.IIllllIIIl[35] = 96 + 70 - 118 + 155 ^ (0x9B ^ 0xC6) << " ".length();
        FastScanner.IIllllIIIl[36] = (0xD ^ 8) << (" ".length() << " ".length());
        FastScanner.IIllllIIIl[37] = (0xC2 ^ 0xB1) << " ".length() ^ 81 + 46 - -15 + 1;
        FastScanner.IIllllIIIl[38] = (5 ^ 0) << "   ".length();
        FastScanner.IIllllIIIl[39] = " ".length() << (0x89 ^ 0x8E) ^ 66 + 53 - 5 + 35;
        FastScanner.IIllllIIIl[40] = (0x35 ^ 0x3E) << " ".length();
        FastScanner.IIllllIIIl[41] = 0x80 ^ 0x97;
        FastScanner.IIllllIIIl[42] = "   ".length() << "   ".length();
        FastScanner.IIllllIIIl[43] = 0x3C ^ 0xF ^ (0x8B ^ 0x90) << (" ".length() << " ".length());
        FastScanner.IIllllIIIl[44] = (2 ^ 0x4F ^ (0x6A ^ 0x5F) << " ".length()) << " ".length();
        FastScanner.IIllllIIIl[45] = (0xDA ^ 0x81) << " ".length() ^ 135 + 95 - 227 + 172;
        FastScanner.IIllllIIIl[46] = ((0x65 ^ 0x40) << (" ".length() << " ".length())) + (0x38 ^ 0x17) - ("   ".length() << (" ".length() << " ".length())) + ("   ".length() << " ".length());
        FastScanner.IIllllIIIl[47] = (109 + 23 - 32 + 47 ^ (0x74 ^ 0x2D) << " ".length()) << (" ".length() << " ".length());
        FastScanner.IIllllIIIl[48] = 41 + 115 - 63 + 64;
        FastScanner.IIllllIIIl[49] = (0x79 ^ 0x74) << " ".length();
        FastScanner.IIllllIIIl[50] = (0xFC ^ 0xBD) << " ".length();
        FastScanner.IIllllIIIl[51] = ((0x38 ^ 0x29) << " ".length()) + (0x69 ^ 0x52) - -(0x55 ^ 0x72) + (0x46 ^ 0x7D);
        FastScanner.IIllllIIIl[52] = 0x43 ^ 0x36 ^ (0x29 ^ 0x1E) << " ".length();
        FastScanner.IIllllIIIl[53] = (0xBF ^ 0xB8) << (" ".length() << " ".length());
        FastScanner.IIllllIIIl[54] = (0x52 ^ 0x7B) << (" ".length() << " ".length()) ^ 65 + 144 - 143 + 119;
        FastScanner.IIllllIIIl[55] = (0xAD ^ 0xA2) << " ".length();
        FastScanner.IIllllIIIl[56] = 0x9A ^ 0x85;
        FastScanner.IIllllIIIl[57] = " ".length() << ("   ".length() << " ".length() ^ "   ".length());
        FastScanner.IIllllIIIl[58] = 0x7C ^ 0x5D;
        FastScanner.IIllllIIIl[59] = (0x90 ^ 0x85) << " ".length();
        FastScanner.IIllllIIIl[60] = (0xB0 ^ 0xA1) << " ".length();
        FastScanner.IIllllIIIl[61] = (0x6B ^ 0x1A) << " ".length() ^ 161 + 105 - 172 + 75;
        FastScanner.IIllllIIIl[62] = (0xBB ^ 0x8C) << " ".length();
        FastScanner.IIllllIIIl[63] = 116 + 85 - 96 + 36;
        FastScanner.IIllllIIIl[64] = ((0xA8 ^ 0xA1) << (" ".length() << " ".length()) ^ (0x2F ^ 0x1A)) << "   ".length();
        FastScanner.IIllllIIIl[65] = 0x26 ^ 3;
        FastScanner.IIllllIIIl[66] = (0x98 ^ 0xAF) << (" ".length() << " ".length()) ^ 137 + 111 - 172 + 81;
        FastScanner.IIllllIIIl[67] = ((0x3B ^ 0x32) << (" ".length() << " ".length()) ^ (0x83 ^ 0xAA)) << (" ".length() << (" ".length() << " ".length()));
        FastScanner.IIllllIIIl[68] = 25 + 62 - -52 + 6;
        FastScanner.IIllllIIIl[69] = (8 ^ 0x1B) << " ".length();
        FastScanner.IIllllIIIl[70] = 125 + 76 - 162 + 104 ^ (0x5B ^ 0x4E) << "   ".length();
        FastScanner.IIllllIIIl[71] = ((0x98 ^ 0x95) << "   ".length()) + ((0x50 ^ 0x41) << (" ".length() << " ".length())) - (0xFF ^ 0x8C) + ((0xAB ^ 0x92) << " ".length());
        FastScanner.IIllllIIIl[72] = (0x7C ^ 0x6B) << "   ".length();
        FastScanner.IIllllIIIl[73] = 0x7D ^ 0x4A ^ (0x6A ^ 0x5B) << " ".length();
        FastScanner.IIllllIIIl[74] = (0x4F ^ 0x68 ^ (0x26 ^ 0x21) << " ".length()) << " ".length();
        FastScanner.IIllllIIIl[75] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        FastScanner.IIllllIIIl[76] = 0x2C ^ 5;
        FastScanner.IIllllIIIl[77] = (0x4E ^ 0x51) << "   ".length();
        FastScanner.IIllllIIIl[78] = (0x31 ^ 0x5A) + (25 + 114 - 21 + 15) - (99 + 13 - -42 + 65) + ((0xE1 ^ 0xC0) << (" ".length() << " ".length()));
        FastScanner.IIllllIIIl[79] = 0x72 ^ 0x2F;
        FastScanner.IIllllIIIl[80] = (119 + 1 - 23 + 48 ^ (0xF6 ^ 0xBD) << " ".length()) << (" ".length() << (" ".length() << " ".length()));
        FastScanner.IIllllIIIl[81] = 124 + 16 - 71 + 68 ^ (0xED ^ 0xBC) << " ".length();
        FastScanner.IIllllIIIl[82] = (0x71 ^ 0x7A) << (" ".length() << " ".length());
        FastScanner.IIllllIIIl[83] = 0xB8 ^ 0x93 ^ "   ".length() << " ".length();
        FastScanner.IIllllIIIl[84] = (0x2C ^ 0x3B) << " ".length();
        FastScanner.IIllllIIIl[85] = (0xB8 ^ 0xA1) << " ".length();
        FastScanner.IIllllIIIl[86] = 0x32 ^ 0x1D;
    }

    private static boolean IIIIlllllll(int n, int n2) {
        return n == n2;
    }

    private static boolean lIIIlllllll(int n, int n2) {
        return n >= n2;
    }

    private static boolean IlIIlllllll(int n, int n2) {
        return n < n2;
    }

    private static boolean lIllIllllll(int n, int n2) {
        return n <= n2;
    }

    private static boolean IIllIllllll(int n, int n2) {
        return n > n2;
    }

    private static boolean llllIllllll(Object object) {
        return object != null;
    }

    private static boolean llIlIllllll(int n) {
        return n != 0;
    }

    private static boolean IlllIllllll(int n) {
        return n == 0;
    }

    private static boolean llIIlllllll(int n) {
        return n >= 0;
    }

    private static boolean IIlIlllllll(int n) {
        return n <= 0;
    }

    private static boolean lIlIlllllll(int n) {
        return n > 0;
    }

    private static boolean IllIlllllll(int n, int n2) {
        return n != n2;
    }

    private static int lllIlllllll(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

