/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class hayami
implements Closeable {
    private final InputStream in = System.in;
    private final byte[] hayami = new byte[llIIlIIll[IlIllIIll[0]]];
    private int Hayami = llIIlIIll[IlIllIIll[1]];
    private int saori = llIIlIIll[IlIllIIll[1]];
    private static int[] llIIlIIll;
    private static String[] lIIllIIll;
    private static int[] IlIllIIll;

    hayami() {
        hayami llIIIIIlIlIlIl;
    }

    private boolean HayamiSaori() {
        hayami lllllllIIlIlIl;
        if (hayami.IllIIlIllIl(hayami.lIlllllIlIl(lllllllIIlIlIl.Hayami, lllllllIIlIlIl.saori) ? 1 : 0)) {
            return llIIlIIll[IlIllIIll[2]];
        }
        lllllllIIlIlIl.Hayami = llIIlIIll[IlIllIIll[1]];
        try {
            lllllllIIlIlIl.saori = lllllllIIlIlIl.in.read(lllllllIIlIlIl.hayami);
            lIIllIIll[IlIllIIll[0]].length();
            "".length();
        }
        catch (IOException IllllllIIlIlIl) {
            IllllllIIlIlIl.printStackTrace();
        }
        if (hayami.lllIIlIllIl(lIIllIIll[IlIllIIll[1]].length() << (lIIllIIll[IlIllIIll[2]].length() << lIIllIIll[IlIllIIll[3]].length()))) {
            return ((IlIllIIll[4] ^ IlIllIIll[5]) & (IlIllIIll[6] ^ IlIllIIll[7] ^ IlIllIIll[8])) != 0;
        }
        if (hayami.IllIIlIllIl(hayami.IllllllIlIl(lllllllIIlIlIl.saori) ? 1 : 0)) {
            return llIIlIIll[IlIllIIll[1]];
        }
        return llIIlIIll[IlIllIIll[2]];
    }

    private int SaoriHayami() {
        hayami IlIllllIIlIlIl;
        if (hayami.IllIIlIllIl(hayami.lllllllIlIl(IlIllllIIlIlIl.HayamiSaori() ? 1 : 0) ? 1 : 0)) {
            int n = IlIllllIIlIlIl.Hayami;
            IlIllllIIlIlIl.Hayami = n + llIIlIIll[IlIllIIll[2]];
            return IlIllllIIlIlIl.hayami[n];
        }
        return llIIlIIll[IlIllIIll[3]];
    }

    private static boolean hayami_saori(int lllIlllIIlIlIl) {
        int n;
        if (hayami.IllIIlIllIl(hayami.IIIIIIIllIl(llIIlIIll[IlIllIIll[9]], lllIlllIIlIlIl) ? 1 : 0) && hayami.IllIIlIllIl(hayami.IIIIIIIllIl(lllIlllIIlIlIl, llIIlIIll[IlIllIIll[10]]) ? 1 : 0)) {
            n = llIIlIIll[IlIllIIll[2]];
            lIIllIIll[IlIllIIll[9]].length();
            "".length();
            if (hayami.IIIlIlIllIl(lIIllIIll[IlIllIIll[10]].length(), lIIllIIll[IlIllIIll[11]].length() << lIIllIIll[IlIllIIll[12]].length())) {
                return ((lIIllIIll[IlIllIIll[13]].length() << (lIIllIIll[IlIllIIll[14]].length() << (lIIllIIll[IlIllIIll[15]].length() << lIIllIIll[IlIllIIll[16]].length())) ^ (IlIllIIll[17] ^ IlIllIIll[18])) & (lIIllIIll[IlIllIIll[19]].length() ^ (IlIllIIll[20] ^ IlIllIIll[21]) << lIIllIIll[IlIllIIll[22]].length() ^ -lIIllIIll[IlIllIIll[23]].length())) != 0;
            }
        } else {
            n = llIIlIIll[IlIllIIll[1]];
        }
        return n != 0;
    }

    public boolean hayamisaori() {
        hayami IIlIlllIIlIlIl;
        while (hayami.IllIIlIllIl(hayami.lllllllIlIl(IIlIlllIIlIlIl.HayamiSaori() ? 1 : 0) ? 1 : 0) && hayami.IllIIlIllIl(hayami.lIIIIIIllIl(hayami.hayami_saori(IIlIlllIIlIlIl.hayami[IIlIlllIIlIlIl.Hayami]) ? 1 : 0) ? 1 : 0)) {
            IIlIlllIIlIlIl.Hayami += llIIlIIll[IlIllIIll[2]];
            lIIllIIll[IlIllIIll[24]].length();
            "".length();
            if (!hayami.IIIlIlIllIl(lIIllIIll[IlIllIIll[25]].length() << (lIIllIIll[IlIllIIll[26]].length() << lIIllIIll[IlIllIIll[27]].length()), -lIIllIIll[IlIllIIll[28]].length())) continue;
            return (lIIllIIll[IlIllIIll[29]].length() << lIIllIIll[IlIllIIll[30]].length() & (lIIllIIll[IlIllIIll[31]].length() << lIIllIIll[IlIllIIll[32]].length() ^ IlIllIIll[8])) != 0;
        }
        return this.HayamiSaori();
    }

    /*
     * WARNING - void declaration
     */
    public String nextHayami() {
        void var1_1;
        hayami llllIllIIlIlIl;
        if (hayami.IllIIlIllIl(hayami.lIIIIIIllIl(llllIllIIlIlIl.hayamisaori() ? 1 : 0) ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IlllIllIIlIlIl = new StringBuilder();
        int lIllIllIIlIlIl = llllIllIIlIlIl.SaoriHayami();
        while (hayami.IllIIlIllIl(hayami.lllllllIlIl(hayami.hayami_saori(lIllIllIIlIlIl) ? 1 : 0) ? 1 : 0)) {
            IlllIllIIlIlIl.appendCodePoint(lIllIllIIlIlIl);
            lIIllIIll[IlIllIIll[33]].length();
            lIllIllIIlIlIl = llllIllIIlIlIl.SaoriHayami();
            lIIllIIll[IlIllIIll[34]].length();
            "".length();
            if (!hayami.lIIlIlIllIl((IlIllIIll[1] + IlIllIIll[35] - IlIllIIll[36] + IlIllIIll[37] ^ (IlIllIIll[38] ^ IlIllIIll[39]) << lIIllIIll[IlIllIIll[40]].length()) << lIIllIIll[IlIllIIll[41]].length() & ((IlIllIIll[42] + IlIllIIll[43] - IlIllIIll[44] + IlIllIIll[45] ^ (IlIllIIll[46] ^ IlIllIIll[0]) << lIIllIIll[IlIllIIll[47]].length()) << lIIllIIll[IlIllIIll[48]].length() ^ -lIIllIIll[IlIllIIll[49]].length()), lIIllIIll[IlIllIIll[50]].length() << lIIllIIll[IlIllIIll[36]].length())) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long saorihayami() {
        hayami lIlIIllIIlIlIl;
        if (hayami.IllIIlIllIl(hayami.lIIIIIIllIl(lIlIIllIIlIlIl.hayamisaori() ? 1 : 0) ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long IIlIIllIIlIlIl = 0L;
        int llIIIllIIlIlIl = llIIlIIll[IlIllIIll[1]];
        int IlIIIllIIlIlIl = lIlIIllIIlIlIl.SaoriHayami();
        if (hayami.IllIIlIllIl(hayami.IlIIIIIllIl(IlIIIllIIlIlIl, llIIlIIll[IlIllIIll[11]]) ? 1 : 0)) {
            llIIIllIIlIlIl = llIIlIIll[IlIllIIll[2]];
            IlIIIllIIlIlIl = lIlIIllIIlIlIl.SaoriHayami();
        }
        if (!hayami.IllIIlIllIl(hayami.llIIIIIllIl(IlIIIllIIlIlIl, llIIlIIll[IlIllIIll[12]]) ? 1 : 0) || hayami.IllIIlIllIl(hayami.lIlllllIlIl(llIIlIIll[IlIllIIll[13]], IlIIIllIIlIlIl) ? 1 : 0)) {
            throw new NumberFormatException();
        }
        do {
            if (hayami.IllIIlIllIl(hayami.IIIIIIIllIl(llIIlIIll[IlIllIIll[12]], IlIIIllIIlIlIl) ? 1 : 0) && hayami.IllIIlIllIl(hayami.IIIIIIIllIl(IlIIIllIIlIlIl, llIIlIIll[IlIllIIll[13]]) ? 1 : 0)) {
                IIlIIllIIlIlIl *= 10L;
                IIlIIllIIlIlIl += (long)(IlIIIllIIlIlIl - llIIlIIll[IlIllIIll[12]]);
                lIIllIIll[IlIllIIll[45]].length();
                "".length();
                if (hayami.IlIlIlIllIl(lIIllIIll[IlIllIIll[51]].length() << (lIIllIIll[IlIllIIll[21]].length() << lIIllIIll[IlIllIIll[52]].length()), lIIllIIll[IlIllIIll[53]].length())) {
                    return 0L;
                }
            } else {
                if (!hayami.IllIIlIllIl(hayami.IIlIIIIllIl(IlIIIllIIlIlIl, llIIlIIll[IlIllIIll[3]]) ? 1 : 0) || hayami.IllIIlIllIl(hayami.lIIIIIIllIl(hayami.hayami_saori(IlIIIllIIlIlIl) ? 1 : 0) ? 1 : 0)) {
                    long l;
                    if (hayami.IllIIlIllIl(hayami.lllllllIlIl(llIIIllIIlIlIl) ? 1 : 0)) {
                        l = -IIlIIllIIlIlIl;
                        lIIllIIll[IlIllIIll[54]].length();
                        "".length();
                        if (hayami.llIlIlIllIl(-lIIllIIll[IlIllIIll[55]].length())) {
                            return 0L;
                        }
                    } else {
                        l = IIlIIllIIlIlIl;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.SaoriHayami();
            lIIllIIll[IlIllIIll[56]].length();
            "".length();
        } while (!hayami.IIIlIlIllIl(lIIllIIll[IlIllIIll[57]].length() << lIIllIIll[IlIllIIll[20]].length(), lIIllIIll[IlIllIIll[58]].length()));
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public int saori_hayami() {
        void var1_1;
        hayami llIllIlIIlIlIl;
        long IlIllIlIIlIlIl = llIllIlIIlIlIl.saorihayami();
        if (!hayami.IllIIlIllIl(hayami.IllIIIIllIl(hayami.lIlIIIIllIl(IlIllIlIIlIlIl, Integer.MIN_VALUE)) ? 1 : 0) || hayami.IllIIlIllIl(hayami.lllIIIIllIl(hayami.lIlIIIIllIl(IlIllIlIIlIlIl, Integer.MAX_VALUE)) ? 1 : 0)) {
            throw new NumberFormatException();
        }
        return (int)var1_1;
    }

    public double Hayamin() {
        hayami IllIlIlIIlIlIl;
        return Double.parseDouble(IllIlIlIIlIlIl.nextHayami());
    }

    @Override
    public void close() {
        try {
            hayami IlIIlIlIIlIlIl;
            IlIIlIlIIlIlIl.in.close();
            lIIllIIll[IlIllIIll[59]].length();
            "".length();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        if (hayami.IIllIlIllIl(lIIllIIll[IlIllIIll[60]].length())) {
            return;
        }
    }

    static {
        hayami.lIlIIlIllIl();
        hayami.IIlIIlIllIl();
        hayami.IIlllllIlIl();
    }

    private static void IIlllllIlIl() {
        llIIlIIll = new int[IlIllIIll[14]];
        hayami.llIIlIIll[hayami.IlIllIIll[0]] = lIIllIIll[IlIllIIll[61]].length() << ((IlIllIIll[62] ^ IlIllIIll[7]) << lIIllIIll[IlIllIIll[63]].length());
        hayami.llIIlIIll[hayami.IlIllIIll[1]] = (IlIllIIll[64] ^ IlIllIIll[65]) & (IlIllIIll[23] ^ IlIllIIll[66] ^ IlIllIIll[8]);
        hayami.llIIlIIll[hayami.IlIllIIll[2]] = lIIllIIll[IlIllIIll[67]].length();
        hayami.llIIlIIll[hayami.IlIllIIll[3]] = -lIIllIIll[IlIllIIll[68]].length();
        hayami.llIIlIIll[hayami.IlIllIIll[9]] = (IlIllIIll[69] ^ IlIllIIll[70]) << (lIIllIIll[IlIllIIll[71]].length() << lIIllIIll[IlIllIIll[72]].length()) ^ (IlIllIIll[0] ^ IlIllIIll[48]);
        hayami.llIIlIIll[hayami.IlIllIIll[10]] = (IlIllIIll[73] ^ IlIllIIll[74] ^ (IlIllIIll[75] ^ IlIllIIll[76]) << (lIIllIIll[IlIllIIll[77]].length() << lIIllIIll[IlIllIIll[78]].length())) << lIIllIIll[IlIllIIll[79]].length();
        hayami.llIIlIIll[hayami.IlIllIIll[11]] = IlIllIIll[80] ^ IlIllIIll[81] ^ (IlIllIIll[82] ^ IlIllIIll[83]) << lIIllIIll[IlIllIIll[84]].length();
        hayami.llIIlIIll[hayami.IlIllIIll[12]] = lIIllIIll[IlIllIIll[85]].length() << (lIIllIIll[IlIllIIll[86]].length() << (lIIllIIll[IlIllIIll[87]].length() << lIIllIIll[IlIllIIll[88]].length()));
        hayami.llIIlIIll[hayami.IlIllIIll[13]] = IlIllIIll[57] ^ IlIllIIll[25];
    }

    private static boolean IlIIIIIllIl(int n, int n2) {
        boolean bl;
        if (hayami.IlIlIlIllIl(n, n2)) {
            bl = IlIllIIll[1];
            "".length();
            if (" ".length() << " ".length() >= "   ".length()) {
                return ((0x36 ^ 0x25) & ~(0xB1 ^ 0xA2)) != 0;
            }
        } else {
            bl = IlIllIIll[0];
        }
        return bl;
    }

    private static boolean llIIIIIllIl(int n, int n2) {
        boolean bl;
        if (hayami.lIllIlIllIl(n, n2)) {
            bl = IlIllIIll[1];
            "".length();
            if ("   ".length() > " ".length() << (" ".length() << " ".length())) {
                return ((0x17 ^ 0x4A) & ~(0xE6 ^ 0xBB)) != 0;
            }
        } else {
            bl = IlIllIIll[0];
        }
        return bl;
    }

    private static boolean lIlllllIlIl(int n, int n2) {
        boolean bl;
        if (hayami.IIIlIlIllIl(n, n2)) {
            bl = IlIllIIll[1];
            "".length();
            if (((0xB ^ 0x1E) << " ".length() & ~((4 ^ 0x11) << " ".length())) != 0) {
                return ((0xE2 ^ 0xBD) & ~(0x64 ^ 0x3B)) != 0;
            }
        } else {
            bl = IlIllIIll[0];
        }
        return bl;
    }

    private static boolean IIIIIIIllIl(int n, int n2) {
        boolean bl;
        if (hayami.IlllIlIllIl(n, n2)) {
            bl = IlIllIIll[1];
            "".length();
            if (("   ".length() << (" ".length() << " ".length()) & ("   ".length() << (" ".length() << " ".length()) ^ -" ".length())) != 0) {
                return (((0xAB ^ 0x84) << " ".length() ^ (2 ^ 0x7F)) & ((0x29 ^ 0x34) << (" ".length() << " ".length()) ^ (0xC7 ^ 0x90) ^ -" ".length())) != 0;
            }
        } else {
            bl = IlIllIIll[0];
        }
        return bl;
    }

    private static boolean lllllllIlIl(int n) {
        boolean bl;
        if (hayami.IllIIlIllIl(n)) {
            bl = IlIllIIll[1];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) == 0) {
                return ((0xAE ^ 0x83) << " ".length() & ~((0x61 ^ 0x4C) << " ".length())) != 0;
            }
        } else {
            bl = IlIllIIll[0];
        }
        return bl;
    }

    private static boolean lIIIIIIllIl(int n) {
        boolean bl;
        if (hayami.IIllIlIllIl(n)) {
            bl = IlIllIIll[1];
            "".length();
            if ((0xAE ^ 0xAB) == 0) {
                return ((0xBF ^ 0xB8) << " ".length() & ~((0x57 ^ 0x50) << " ".length())) != 0;
            }
        } else {
            bl = IlIllIIll[0];
        }
        return bl;
    }

    private static boolean IllIIIIllIl(int n) {
        boolean bl;
        if (hayami.llIlIlIllIl(n)) {
            bl = IlIllIIll[1];
            "".length();
            if (("   ".length() & ("   ".length() ^ -" ".length())) < 0) {
                return ((104 + 35 - 72 + 62 ^ (0xE ^ 0x19) << "   ".length()) & (1 ^ 0x76 ^ (0x4B ^ 0x6C) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = IlIllIIll[0];
        }
        return bl;
    }

    private static boolean IllllllIlIl(int n) {
        boolean bl;
        if (hayami.lllIIlIllIl(n)) {
            bl = IlIllIIll[1];
            "".length();
            if (((0x2E ^ 0x21) << (" ".length() << " ".length()) & ~((0x8C ^ 0x83) << (" ".length() << " ".length()))) < ((0xDA ^ 0xC7) << " ".length() & ~((0x4C ^ 0x51) << " ".length()))) {
                return ((0x45 ^ 0x60) & ~(0x6F ^ 0x4A)) != 0;
            }
        } else {
            bl = IlIllIIll[0];
        }
        return bl;
    }

    private static boolean lllIIIIllIl(int n) {
        boolean bl;
        if (hayami.llllIlIllIl(n)) {
            bl = IlIllIIll[1];
            "".length();
            if (((0x66 ^ 0x4D) << " ".length() & ~((0xA0 ^ 0x8B) << " ".length())) != ((0x64 ^ 0x4F) & ~(0x98 ^ 0xB3))) {
                return ((0x94 ^ 0x93) << " ".length() & ~((0xA3 ^ 0xA4) << " ".length())) != 0;
            }
        } else {
            bl = IlIllIIll[0];
        }
        return bl;
    }

    private static boolean IIlIIIIllIl(int n, int n2) {
        boolean bl;
        if (hayami.IIIIllIllIl(n, n2)) {
            bl = IlIllIIll[1];
            "".length();
            if (" ".length() << " ".length() == 0) {
                return ((" ".length() << ("   ".length() << " ".length()) ^ (0x30 ^ 0x57)) & ((0x12 ^ 0x19) << " ".length() ^ (0xA4 ^ 0x95) ^ -" ".length())) != 0;
            }
        } else {
            bl = IlIllIIll[0];
        }
        return bl;
    }

    private static int lIlIIIIllIl(long l, long l2) {
        return hayami.lIIIllIllIl(l, l2);
    }

    private static void IIlIIlIllIl() {
        lIIllIIll = new String[IlIllIIll[89]];
        hayami.lIIllIIll[hayami.IlIllIIll[0]] = hayami.lIIIIlIllIl("", "OwGxt");
        hayami.lIIllIIll[hayami.IlIllIIll[1]] = hayami.lIIIIlIllIl("aQ==", "Isvfh");
        hayami.lIIllIIll[hayami.IlIllIIll[2]] = hayami.lIIIIlIllIl("SQ==", "iECHY");
        hayami.lIIllIIll[hayami.IlIllIIll[3]] = hayami.lIIIIlIllIl("cw==", "SYJcW");
        hayami.lIIllIIll[hayami.IlIllIIll[9]] = hayami.IlIIIlIllIl("SeqCz4HteXk=", "itcbC");
        hayami.lIIllIIll[hayami.IlIllIIll[10]] = hayami.IlIIIlIllIl("myMoZJvHgmY=", "fCXNt");
        hayami.lIIllIIll[hayami.IlIllIIll[11]] = hayami.llIIIlIllIl("HaSyj4dYqQM=", "Uktas");
        hayami.lIIllIIll[hayami.IlIllIIll[12]] = hayami.lIIIIlIllIl("bA==", "LrSqn");
        hayami.lIIllIIll[hayami.IlIllIIll[13]] = hayami.IlIIIlIllIl("OhRMpf/qVVA=", "SkQJU");
        hayami.lIIllIIll[hayami.IlIllIIll[14]] = hayami.IlIIIlIllIl("SS9+ybkrFoE=", "BRDBJ");
        hayami.lIIllIIll[hayami.IlIllIIll[15]] = hayami.llIIIlIllIl("nGoR4P8PYHs=", "QLAoz");
        hayami.lIIllIIll[hayami.IlIllIIll[16]] = hayami.IlIIIlIllIl("P6GFtWZd6+g=", "enlzY");
        hayami.lIIllIIll[hayami.IlIllIIll[19]] = hayami.llIIIlIllIl("4AU1YokkcGE=", "FFXbx");
        hayami.lIIllIIll[hayami.IlIllIIll[22]] = hayami.lIIIIlIllIl("cQ==", "QOEpL");
        hayami.lIIllIIll[hayami.IlIllIIll[23]] = hayami.IlIIIlIllIl("NqLFpz+Lx3w=", "CQXOc");
        hayami.lIIllIIll[hayami.IlIllIIll[24]] = hayami.IlIIIlIllIl("6FcQaUn0mho=", "avNfx");
        hayami.lIIllIIll[hayami.IlIllIIll[25]] = hayami.llIIIlIllIl("GLAjaksUVu8=", "dhaQv");
        hayami.lIIllIIll[hayami.IlIllIIll[26]] = hayami.llIIIlIllIl("My/v3LL8zzU=", "CvmwR");
        hayami.lIIllIIll[hayami.IlIllIIll[27]] = hayami.lIIIIlIllIl("eQ==", "YdtuJ");
        hayami.lIIllIIll[hayami.IlIllIIll[28]] = hayami.llIIIlIllIl("FSDKPVcIfO8=", "RuHua");
        hayami.lIIllIIll[hayami.IlIllIIll[29]] = hayami.llIIIlIllIl("0CyDcjBjqeI=", "zOpqe");
        hayami.lIIllIIll[hayami.IlIllIIll[30]] = hayami.llIIIlIllIl("XBO1s2WylrM=", "KPRBz");
        hayami.lIIllIIll[hayami.IlIllIIll[31]] = hayami.llIIIlIllIl("w3bvFd3e2PU=", "GlUUi");
        hayami.lIIllIIll[hayami.IlIllIIll[32]] = hayami.llIIIlIllIl("3MBtLCmAnmc=", "qQORc");
        hayami.lIIllIIll[hayami.IlIllIIll[33]] = hayami.llIIIlIllIl("/wl82wtYi6o=", "utVNt");
        hayami.lIIllIIll[hayami.IlIllIIll[34]] = hayami.lIIIIlIllIl("", "PFXta");
        hayami.lIIllIIll[hayami.IlIllIIll[40]] = hayami.llIIIlIllIl("BZrGLhJOgFg=", "UYCOV");
        hayami.lIIllIIll[hayami.IlIllIIll[41]] = hayami.lIIIIlIllIl("aQ==", "IFTVs");
        hayami.lIIllIIll[hayami.IlIllIIll[47]] = hayami.IlIIIlIllIl("/NvFIF9M+cg=", "ZBaSI");
        hayami.lIIllIIll[hayami.IlIllIIll[48]] = hayami.llIIIlIllIl("zbYeIOh/gss=", "GlAFW");
        hayami.lIIllIIll[hayami.IlIllIIll[49]] = hayami.llIIIlIllIl("ZDSXZHw+vt0=", "ZcXgR");
        hayami.lIIllIIll[hayami.IlIllIIll[50]] = hayami.llIIIlIllIl("W7e6QJdMU5g=", "UiZjG");
        hayami.lIIllIIll[hayami.IlIllIIll[36]] = hayami.IlIIIlIllIl("axpEv0HzDek=", "CviOr");
        hayami.lIIllIIll[hayami.IlIllIIll[45]] = hayami.llIIIlIllIl("Qg3lfI8Ned4=", "mIrcu");
        hayami.lIIllIIll[hayami.IlIllIIll[51]] = hayami.lIIIIlIllIl("SA==", "hSvFF");
        hayami.lIIllIIll[hayami.IlIllIIll[21]] = hayami.llIIIlIllIl("4SQh1ghIb7U=", "Tikyy");
        hayami.lIIllIIll[hayami.IlIllIIll[52]] = hayami.lIIIIlIllIl("bA==", "Lcjdp");
        hayami.lIIllIIll[hayami.IlIllIIll[53]] = hayami.lIIIIlIllIl("QQ==", "adNkF");
        hayami.lIIllIIll[hayami.IlIllIIll[54]] = hayami.lIIIIlIllIl("", "cbBTS");
        hayami.lIIllIIll[hayami.IlIllIIll[55]] = hayami.llIIIlIllIl("5z97htB3ElM=", "nZPgc");
        hayami.lIIllIIll[hayami.IlIllIIll[56]] = hayami.IlIIIlIllIl("IBZBvmLsywE=", "MAIiM");
        hayami.lIIllIIll[hayami.IlIllIIll[57]] = hayami.llIIIlIllIl("uRgi4PIx1/w=", "SgZTR");
        hayami.lIIllIIll[hayami.IlIllIIll[20]] = hayami.lIIIIlIllIl("TA==", "lJvZm");
        hayami.lIIllIIll[hayami.IlIllIIll[58]] = hayami.lIIIIlIllIl("Zw==", "GvgJM");
        hayami.lIIllIIll[hayami.IlIllIIll[59]] = hayami.lIIIIlIllIl("", "YYdHX");
        hayami.lIIllIIll[hayami.IlIllIIll[60]] = hayami.lIIIIlIllIl("Qw==", "ceMyP");
        hayami.lIIllIIll[hayami.IlIllIIll[61]] = hayami.llIIIlIllIl("c99DrSCxajQ=", "nhPfp");
        hayami.lIIllIIll[hayami.IlIllIIll[63]] = hayami.lIIIIlIllIl("RQ==", "eNNEw");
        hayami.lIIllIIll[hayami.IlIllIIll[67]] = hayami.lIIIIlIllIl("Rg==", "fOxMP");
        hayami.lIIllIIll[hayami.IlIllIIll[68]] = hayami.lIIIIlIllIl("Ug==", "rnvyG");
        hayami.lIIllIIll[hayami.IlIllIIll[71]] = hayami.llIIIlIllIl("lt7rXglVb74=", "oNmYN");
        hayami.lIIllIIll[hayami.IlIllIIll[72]] = hayami.IlIIIlIllIl("i3gcAlWMhuY=", "hbiih");
        hayami.lIIllIIll[hayami.IlIllIIll[77]] = hayami.lIIIIlIllIl("bQ==", "MIDGm");
        hayami.lIIllIIll[hayami.IlIllIIll[78]] = hayami.llIIIlIllIl("KXoFNuLLK3Q=", "ErTVf");
        hayami.lIIllIIll[hayami.IlIllIIll[79]] = hayami.IlIIIlIllIl("6tdrugZODzk=", "qAJQG");
        hayami.lIIllIIll[hayami.IlIllIIll[84]] = hayami.lIIIIlIllIl("eg==", "ZcjDS");
        hayami.lIIllIIll[hayami.IlIllIIll[85]] = hayami.llIIIlIllIl("GjKlTDEFl0M=", "WAPPW");
        hayami.lIIllIIll[hayami.IlIllIIll[86]] = hayami.IlIIIlIllIl("uyPtnPp97Zs=", "jIysC");
        hayami.lIIllIIll[hayami.IlIllIIll[87]] = hayami.lIIIIlIllIl("UQ==", "qvfNA");
        hayami.lIIllIIll[hayami.IlIllIIll[88]] = hayami.IlIIIlIllIl("FzR3xkIyOPc=", "LLuDn");
    }

    private static String llIIIlIllIl(String lIlllIIIIlIlIl, String IIlllIIIIlIlIl) {
        try {
            SecretKeySpec llIllIIIIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIlllIIIIlIlIl.getBytes(StandardCharsets.UTF_8)), IlIllIIll[13]), "DES");
            Cipher IlIllIIIIlIlIl = Cipher.getInstance("DES");
            IlIllIIIIlIlIl.init(IlIllIIll[2], llIllIIIIlIlIl);
            return new String(IlIllIIIIlIlIl.doFinal(Base64.getDecoder().decode(lIlllIIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllIIIIlIlIl) {
            lIIllIIIIlIlIl.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIIIIlIllIl(String llIlIIIIIlIlIl, String IlIlIIIIIlIlIl) {
        llIlIIIIIlIlIl = new String(Base64.getDecoder().decode(llIlIIIIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlIIIIIlIlIl = new StringBuilder();
        char[] IIIlIIIIIlIlIl = IlIlIIIIIlIlIl.toCharArray();
        int lllIIIIIIlIlIl = IlIllIIll[0];
        char[] lIlllllllIIlIl = llIlIIIIIlIlIl.toCharArray();
        int IllllllllIIlIl = lIlllllllIIlIl.length;
        int lllllllllIIlIl = IlIllIIll[0];
        "".length();
        while (!hayami.lIllIlIllIl(lllllllllIIlIl, IllllllllIIlIl)) {
            char IllIIIIIIlIlIl = lIlllllllIIlIl[lllllllllIIlIl];
            lIIlIIIIIlIlIl.append((char)(IllIIIIIIlIlIl ^ IIIlIIIIIlIlIl[lllIIIIIIlIlIl % IIIlIIIIIlIlIl.length]));
            "".length();
            ++lllIIIIIIlIlIl;
            ++lllllllllIIlIl;
        }
        return String.valueOf(lIIlIIIIIlIlIl);
    }

    private static String IlIIIlIllIl(String IIIllllllIIlIl, String lllIlllllIIlIl) {
        try {
            SecretKeySpec IllIlllllIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlllllIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlllllIIlIl = Cipher.getInstance("Blowfish");
            lIlIlllllIIlIl.init(IlIllIIll[2], IllIlllllIIlIl);
            return new String(lIlIlllllIIlIl.doFinal(Base64.getDecoder().decode(IIIllllllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIlIlllllIIlIl) {
            IIlIlllllIIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIIlIllIl() {
        IlIllIIll = new int[90];
        hayami.IlIllIIll[0] = (0xE3 ^ 0xAE) & ~(0xD ^ 0x40);
        hayami.IlIllIIll[1] = " ".length();
        hayami.IlIllIIll[2] = " ".length() << " ".length();
        hayami.IlIllIIll[3] = "   ".length();
        hayami.IlIllIIll[4] = ((0xAC ^ 0x8D) << " ".length()) + (0x53 ^ 0x60) - -"   ".length() + (0xA9 ^ 0xB0);
        hayami.IlIllIIll[5] = (0xFB ^ 0x98) << " ".length();
        hayami.IlIllIIll[6] = 210 + 226 - 247 + 58;
        hayami.IlIllIIll[7] = (0x5C ^ 3 ^ (0x7E ^ 0x53) << " ".length()) << (57 + 9 - 9 + 76 ^ " ".length() << (0x40 ^ 0x47));
        hayami.IlIllIIll[8] = -" ".length();
        hayami.IlIllIIll[9] = " ".length() << (" ".length() << " ".length());
        hayami.IlIllIIll[10] = 0x1A ^ 0x1F;
        hayami.IlIllIIll[11] = "   ".length() << " ".length();
        hayami.IlIllIIll[12] = 0x36 ^ 0x31;
        hayami.IlIllIIll[13] = " ".length() << "   ".length();
        hayami.IlIllIIll[14] = (0x77 ^ 0x62) << "   ".length() ^ 141 + 31 - 84 + 73;
        hayami.IlIllIIll[15] = (56 + 77 - 44 + 76 ^ (0x38 ^ 0x3D) << (0x58 ^ 0x5D)) << " ".length();
        hayami.IlIllIIll[16] = 0 + 142 - 14 + 41 ^ (0x6B ^ 0x3A) << " ".length();
        hayami.IlIllIIll[17] = (0x49 ^ 0x7A ^ (0x8A ^ 0xB7) << " ".length()) << " ".length();
        hayami.IlIllIIll[18] = 46 + 44 - -44 + 45;
        hayami.IlIllIIll[19] = "   ".length() << (" ".length() << " ".length());
        hayami.IlIllIIll[20] = ((4 ^ 0x13) << " ".length() ^ (0xAD ^ 0x96)) << " ".length();
        hayami.IlIllIIll[21] = 0x96 ^ 0xB5;
        hayami.IlIllIIll[22] = (0x7D ^ 0x62) << (" ".length() << " ".length()) ^ (0x39 ^ 0x48);
        hayami.IlIllIIll[23] = (0x1A ^ 0x3F ^ (1 ^ 0x10) << " ".length()) << " ".length();
        hayami.IlIllIIll[24] = (0xBA ^ 0xB7) << " ".length() ^ (0x1A ^ 0xF);
        hayami.IlIllIIll[25] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        hayami.IlIllIIll[26] = 0x18 ^ 9;
        hayami.IlIllIIll[27] = (0x19 ^ 0x10) << " ".length();
        hayami.IlIllIIll[28] = 0xD2 ^ 0xC1;
        hayami.IlIllIIll[29] = (0x7C ^ 0x79) << (" ".length() << " ".length());
        hayami.IlIllIIll[30] = 0xBA ^ 0xAF;
        hayami.IlIllIIll[31] = (0x39 ^ 0x32) << " ".length();
        hayami.IlIllIIll[32] = (0xE5 ^ 0x8C) << " ".length() ^ 19 + 5 - -163 + 10;
        hayami.IlIllIIll[33] = "   ".length() << "   ".length();
        hayami.IlIllIIll[34] = 0x6B ^ 0x34 ^ (0xB8 ^ 0x9B) << " ".length();
        hayami.IlIllIIll[35] = (0x40 ^ 0x63) << " ".length();
        hayami.IlIllIIll[36] = " ".length() << (0x13 ^ 0x1A ^ "   ".length() << (" ".length() << " ".length()));
        hayami.IlIllIIll[37] = ((0x5E ^ 0x45) << " ".length() ^ (0xE8 ^ 0x99)) << " ".length();
        hayami.IlIllIIll[38] = 0xE1 ^ 0x86;
        hayami.IlIllIIll[39] = (0x16 ^ 9) << " ".length();
        hayami.IlIllIIll[40] = (0x7D ^ 0x70) << " ".length();
        hayami.IlIllIIll[41] = 147 + 92 - 132 + 70 ^ (0x90 ^ 0xC5) << " ".length();
        hayami.IlIllIIll[42] = (31 + 117 - 43 + 142 ^ (0xD2 ^ 0xC5) << "   ".length()) << " ".length();
        hayami.IlIllIIll[43] = (0x9C ^ 0xB3 ^ (0x87 ^ 0x82) << "   ".length()) << (" ".length() << (" ".length() << " ".length()));
        hayami.IlIllIIll[44] = (57 + 139 - 165 + 138 ^ (0xA2 ^ 0x85) << (" ".length() << " ".length())) << " ".length();
        hayami.IlIllIIll[45] = 0x9E ^ 0xBF;
        hayami.IlIllIIll[46] = 0xF7 ^ 0x96;
        hayami.IlIllIIll[47] = (0x2B ^ 0x3C ^ " ".length() << (" ".length() << (" ".length() << " ".length()))) << (" ".length() << " ".length());
        hayami.IlIllIIll[48] = 0x3B ^ 0x4C ^ (0x90 ^ 0xA5) << " ".length();
        hayami.IlIllIIll[49] = (64 + 40 - 78 + 163 ^ (0x5A ^ 3) << " ".length()) << " ".length();
        hayami.IlIllIIll[50] = 0x48 ^ 0x57;
        hayami.IlIllIIll[51] = (0xAB ^ 0x92 ^ (0x50 ^ 0x55) << "   ".length()) << " ".length();
        hayami.IlIllIIll[52] = ((0x28 ^ 0x3D) << " ".length() ^ (0x83 ^ 0xA0)) << (" ".length() << " ".length());
        hayami.IlIllIIll[53] = 0xAB ^ 0x8E;
        hayami.IlIllIIll[54] = (0x9C ^ 0x8F) << " ".length();
        hayami.IlIllIIll[55] = 0x87 ^ 0xA0;
        hayami.IlIllIIll[56] = (0x5D ^ 0x58) << "   ".length();
        hayami.IlIllIIll[57] = 0x45 ^ 0x6C;
        hayami.IlIllIIll[58] = "   ".length() << " ".length() ^ (0xAB ^ 0x86);
        hayami.IlIllIIll[59] = ((0xA2 ^ 0x8F) << " ".length() ^ (0x7A ^ 0x2B)) << (" ".length() << " ".length());
        hayami.IlIllIIll[60] = (0x49 ^ 0x18) & ~(0xE9 ^ 0xB8) ^ (0xE ^ 0x23);
        hayami.IlIllIIll[61] = (0xD4 ^ 0xC3) << " ".length();
        hayami.IlIllIIll[62] = (0xEB ^ 0x8C) + (0x86 ^ 0x83) - (0x86 ^ 0xB3) + ((0x78 ^ 0x4F) << " ".length());
        hayami.IlIllIIll[63] = (0xDD ^ 0x9E) << " ".length() ^ 7 + 59 - -9 + 94;
        hayami.IlIllIIll[64] = (0x35 ^ 0x3A) << (" ".length() << (" ".length() << " ".length()));
        hayami.IlIllIIll[65] = 86 + 75 - 132 + 152;
        hayami.IlIllIIll[66] = 0x26 ^ 0x77 ^ (0x3E ^ 0x33) << " ".length();
        hayami.IlIllIIll[67] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        hayami.IlIllIIll[68] = 0x14 ^ 0x25;
        hayami.IlIllIIll[69] = 107 + 109 - 197 + 150;
        hayami.IlIllIIll[70] = (0xB9 ^ 0xA6 ^ (0x28 ^ 0x3B) << (" ".length() << " ".length())) << " ".length();
        hayami.IlIllIIll[71] = (0x6E ^ 0x77) << " ".length();
        hayami.IlIllIIll[72] = 0x16 ^ 0x25;
        hayami.IlIllIIll[73] = ((0xE1 ^ 0xA2) << " ".length()) + (6 ^ 0x5D) - (" ".length() << " ".length()) + ("   ".length() << (" ".length() << " ".length()));
        hayami.IlIllIIll[74] = (0x16 ^ 0x7F ^ (0x18 ^ 0x27) << " ".length()) << "   ".length();
        hayami.IlIllIIll[75] = 0x5B ^ 0x12;
        hayami.IlIllIIll[76] = (0x40 ^ 0x69) << " ".length();
        hayami.IlIllIIll[77] = ((0x39 ^ 0x34) << (" ".length() << " ".length()) ^ (0x4C ^ 0x75)) << (" ".length() << " ".length());
        hayami.IlIllIIll[78] = 0x78 ^ 0x4D;
        hayami.IlIllIIll[79] = ((0x69 ^ 0x6C) << (" ".length() << (" ".length() << " ".length())) ^ (0x42 ^ 9)) << " ".length();
        hayami.IlIllIIll[80] = ((0x85 ^ 0xBE) << " ".length()) + (0xF6 ^ 0xC3) - ((0xE ^ 0x4F) << " ".length()) + ((0x95 ^ 0x9C) << (" ".length() << (" ".length() << " ".length())));
        hayami.IlIllIIll[81] = (0x26 ^ 0x7D) << " ".length();
        hayami.IlIllIIll[82] = 0xCA ^ 0xA3;
        hayami.IlIllIIll[83] = (0x5B ^ 0 ^ (0x4C ^ 0x59) << (" ".length() << " ".length())) << "   ".length();
        hayami.IlIllIIll[84] = 0x63 ^ 0x54;
        hayami.IlIllIIll[85] = (0x62 ^ 0x65) << "   ".length();
        hayami.IlIllIIll[86] = 0x24 ^ 0x31 ^ (0x3A ^ 0x31) << (" ".length() << " ".length());
        hayami.IlIllIIll[87] = (0xBD ^ 0xA0) << " ".length();
        hayami.IlIllIIll[88] = (0x29 ^ 0x68) << " ".length() ^ 168 + 133 - 271 + 155;
        hayami.IlIllIIll[89] = (0x81 ^ 0x8A ^ " ".length() << (" ".length() << " ".length())) << (" ".length() << " ".length());
    }

    private static boolean IlIlIlIllIl(int n, int n2) {
        return n == n2;
    }

    private static boolean lIllIlIllIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIIlIlIllIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IlllIlIllIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean lIIlIlIllIl(int n, int n2) {
        return n > n2;
    }

    private static boolean IllIIlIllIl(int n) {
        return n != 0;
    }

    private static boolean IIllIlIllIl(int n) {
        return n == 0;
    }

    private static boolean llIlIlIllIl(int n) {
        return n >= 0;
    }

    private static boolean lllIIlIllIl(int n) {
        return n <= 0;
    }

    private static boolean llllIlIllIl(int n) {
        return n > 0;
    }

    private static boolean IIIIllIllIl(int n, int n2) {
        return n != n2;
    }

    private static int lIIIllIllIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

