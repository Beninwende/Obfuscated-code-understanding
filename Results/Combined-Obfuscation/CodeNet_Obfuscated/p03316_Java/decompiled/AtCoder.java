/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class AtCoder {
    final int H;
    final int N;
    final int[] A;
    private static String[] lIIlIlIlIl;
    private static int[] llIlIlIlIl;
    private static String[] IlIIllIlIl;
    private static int[] lIlIllIlIl;

    AtCoder(FastScanner lIllIIlllll) {
        AtCoder IlllIIlllll;
        IlllIIlllll.H = lIllIIlllll.nextInt();
        IlllIIlllll.N = lIllIIlllll.nextInt();
        IlllIIlllll.A = new int[IlllIIlllll.N];
        int IIllIIlllll = llIlIlIlIl[lIlIllIlIl[0]];
        while (AtCoder.lllIlIIllIIl(AtCoder.lIlllllIlIIl(IIllIIlllll, IlllIIlllll.A.length) ? 1 : 0)) {
            IlllIIlllll.A[IIllIIlllll] = lIllIIlllll.nextInt();
            ++IIllIIlllll;
            IlIIllIlIl[lIlIllIlIl[0]].length();
            "".length();
            if (!AtCoder.IIIllIIllIIl(-IlIIllIlIl[lIlIllIlIl[1]].length(), IlIIllIlIl[lIlIllIlIl[2]].length())) continue;
            throw null;
        }
    }

    void solve(PrintWriter llIIIIlllll) {
        AtCoder IIlIIIlllll;
        int IlIIIIlllll = IIlIIIlllll.H;
        int lIIIIIlllll = llIlIlIlIl[lIlIllIlIl[0]];
        while (AtCoder.lllIlIIllIIl(AtCoder.lIlllllIlIIl(lIIIIIlllll, IIlIIIlllll.A.length) ? 1 : 0)) {
            if (AtCoder.lllIlIIllIIl(AtCoder.IllllllIlIIl(IlIIIIlllll -= IIlIIIlllll.A[lIIIIIlllll]) ? 1 : 0)) {
                IlIIllIlIl[lIlIllIlIl[3]].length();
                "".length();
                if (AtCoder.lIIllIIllIIl(-IlIIllIlIl[lIlIllIlIl[4]].length())) {
                    return;
                }
            } else {
                llIIIIlllll.println(lIIlIlIlIl[llIlIlIlIl[lIlIllIlIl[0]]]);
                IlIIllIlIl[lIlIllIlIl[5]].length();
                "".length();
                if (!AtCoder.lllIlIIllIIl((lIlIllIlIl[6] ^ lIlIllIlIl[7]) & (lIlIllIlIl[8] ^ lIlIllIlIl[9] ^ lIlIllIlIl[10]))) break;
                return;
            }
            ++lIIIIIlllll;
            IlIIllIlIl[lIlIllIlIl[11]].length();
            "".length();
            if (!AtCoder.IlIllIIllIIl(null)) continue;
            return;
        }
        if (AtCoder.lllIlIIllIIl(AtCoder.IllllllIlIIl(IlIIIIlllll) ? 1 : 0)) {
            llIIIIlllll.println(lIIlIlIlIl[llIlIlIlIl[lIlIllIlIl[1]]]);
        }
    }

    static {
        AtCoder.IllIlIIllIIl();
        AtCoder.lIlIlIIllIIl();
        AtCoder.IIlllllIlIIl();
        AtCoder.IIIllllIlIIl();
    }

    private static void IIIllllIlIIl() {
        lIIlIlIlIl = new String[llIlIlIlIl[lIlIllIlIl[2]]];
        AtCoder.lIIlIlIlIl[AtCoder.llIlIlIlIl[AtCoder.lIlIllIlIl[0]]] = AtCoder.IIIIlllIlIIl(IlIIllIlIl[lIlIllIlIl[12]], IlIIllIlIl[lIlIllIlIl[13]]);
        AtCoder.lIIlIlIlIl[AtCoder.llIlIlIlIl[AtCoder.lIlIllIlIl[1]]] = AtCoder.IIIIlllIlIIl(IlIIllIlIl[lIlIllIlIl[14]], IlIIllIlIl[lIlIllIlIl[15]]);
    }

    /*
     * Unable to fully structure code
     */
    private static String IIIIlllIlIIl(String llIIllIllll, String IlIIllIllll) {
        llIIllIllll = new String(Base64.getDecoder().decode(llIIllIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        lIIIllIllll = new StringBuilder();
        IIIIllIllll = IlIIllIllll.toCharArray();
        llllIlIllll = AtCoder.llIlIlIlIl[AtCoder.lIlIllIlIl[0]];
        lIlIIlIllll = llIIllIllll.toCharArray();
        IllIIlIllll = lIlIIlIllll.length;
        lllIIlIllll = AtCoder.llIlIlIlIl[AtCoder.lIlIllIlIl[0]];
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[16]].length();
        "".length();
        if (!AtCoder.llIllIIllIIl(-AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[17]].length(), AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[18]].length() << (AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[19]].length() << AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[20]].length()))) ** GOTO lbl21
        return null;
lbl-1000:
        // 1 sources

        {
            IlllIlIllll = lIlIIlIllll[lllIIlIllll];
            lIIIllIllll.append((char)(IlllIlIllll ^ IIIIllIllll[llllIlIllll % IIIIllIllll.length]));
            AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[21]].length();
            ++llllIlIllll;
            ++lllIIlIllll;
lbl21:
            // 2 sources

            ** while (!AtCoder.lllIlIIllIIl((int)AtCoder.lllllllIlIIl((int)lllIIlIllll, (int)IllIIlIllll)))
        }
lbl22:
        // 1 sources

        return String.valueOf(lIIIllIllll);
    }

    private static void IIlllllIlIIl() {
        llIlIlIlIl = new int[lIlIllIlIl[3]];
        AtCoder.llIlIlIlIl[AtCoder.lIlIllIlIl[0]] = ((lIlIllIlIl[11] ^ lIlIllIlIl[22]) << IlIIllIlIl[lIlIllIlIl[23]].length() ^ (lIlIllIlIl[13] ^ lIlIllIlIl[24])) << IlIIllIlIl[lIlIllIlIl[25]].length() & ((lIlIllIlIl[26] ^ lIlIllIlIl[27] ^ (lIlIllIlIl[28] ^ lIlIllIlIl[29]) << (IlIIllIlIl[lIlIllIlIl[30]].length() << (IlIIllIlIl[lIlIllIlIl[31]].length() << IlIIllIlIl[lIlIllIlIl[32]].length()))) << IlIIllIlIl[lIlIllIlIl[33]].length() ^ -IlIIllIlIl[lIlIllIlIl[34]].length());
        AtCoder.llIlIlIlIl[AtCoder.lIlIllIlIl[1]] = IlIIllIlIl[lIlIllIlIl[35]].length();
        AtCoder.llIlIlIlIl[AtCoder.lIlIllIlIl[2]] = IlIIllIlIl[lIlIllIlIl[36]].length() << IlIIllIlIl[lIlIllIlIl[37]].length();
    }

    private static boolean lllllllIlIIl(int n, int n2) {
        boolean bl;
        if (AtCoder.IIlllIIllIIl(n, n2)) {
            bl = lIlIllIlIl[1];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) <= " ".length() << " ".length()) {
                return ((0x39 ^ 0x1A ^ (0x13 ^ 0x14) << (" ".length() << (" ".length() << " ".length()))) & ((0xD8 ^ 0xBB) << " ".length() ^ 106 + 94 - 170 + 119 ^ -" ".length())) != 0;
            }
        } else {
            bl = lIlIllIlIl[0];
        }
        return bl;
    }

    private static boolean lIlllllIlIIl(int n, int n2) {
        boolean bl;
        if (AtCoder.lIlllIIllIIl(n, n2)) {
            bl = lIlIllIlIl[1];
            "".length();
            if (((0x11 ^ 0x28) & ~(0x59 ^ 0x60)) != 0) {
                return ((0x28 ^ 0x19) & ~(0x10 ^ 0x21)) != 0;
            }
        } else {
            bl = lIlIllIlIl[0];
        }
        return bl;
    }

    private static boolean IllllllIlIIl(int n) {
        boolean bl;
        if (AtCoder.IllllIIllIIl(n)) {
            bl = lIlIllIlIl[1];
            "".length();
            if (" ".length() >= " ".length() << " ".length()) {
                return ((119 + 145 - 164 + 75 ^ (0x28 ^ 0x73) << " ".length()) << " ".length() & (((0x8F ^ 0x8A) << (0x69 ^ 0x6C) ^ 100 + 0 - 28 + 113) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = lIlIllIlIl[0];
        }
        return bl;
    }

    private static void lIlIlIIllIIl() {
        IlIIllIlIl = new String[lIlIllIlIl[38]];
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[0]] = AtCoder.lllIIIIllIIl("PZ5mAmkRwzI=", "nnVSv");
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[1]] = AtCoder.lllIIIIllIIl("nFVamQWz4F8=", "UPvtT");
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[2]] = AtCoder.IlIIlIIllIIl("5NjxuZ5HT3U=", "DpaYM");
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[3]] = AtCoder.lllIIIIllIIl("BrMRUs85Alg=", "bEqZj");
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[4]] = AtCoder.lllIIIIllIIl("kPIm4+w7+Mw=", "iLHib");
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[5]] = AtCoder.llIIlIIllIIl("", "Ghdbl");
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[11]] = AtCoder.IlIIlIIllIIl("9dk2K+TLZoM=", "dpSSM");
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[12]] = AtCoder.IlIIlIIllIIl("E8GGblEb4kk=", "bfcxi");
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[13]] = AtCoder.IlIIlIIllIIl("AYiTkKMCoj8=", "wCQWB");
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[14]] = AtCoder.lllIIIIllIIl("KYhkpCSNm1Q=", "AYGJp");
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[15]] = AtCoder.IlIIlIIllIIl("3tf9U0r4Yzo=", "dPwbF");
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[16]] = AtCoder.llIIlIIllIIl("", "GuFXz");
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[17]] = AtCoder.lllIIIIllIIl("atkyumGS7Yo=", "lHCUV");
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[18]] = AtCoder.lllIIIIllIIl("w2V1jKtr/gk=", "FgGzW");
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[19]] = AtCoder.llIIlIIllIIl("ZQ==", "EEwPr");
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[20]] = AtCoder.lllIIIIllIIl("YMbrLFuoPwM=", "KSQjI");
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[21]] = AtCoder.IlIIlIIllIIl("Kn/e6D72VYw=", "VTQgL");
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[23]] = AtCoder.lllIIIIllIIl("b0n76q0Ai0o=", "RwMTl");
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[25]] = AtCoder.IlIIlIIllIIl("LBFCANRFDt8=", "IJWWW");
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[30]] = AtCoder.llIIlIIllIIl("aw==", "KYqJM");
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[31]] = AtCoder.IlIIlIIllIIl("HZUrUcxFQVI=", "ftrWe");
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[32]] = AtCoder.llIIlIIllIIl("WA==", "xGtdt");
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[33]] = AtCoder.lllIIIIllIIl("qqVBYvXU8Xk=", "NJZuO");
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[34]] = AtCoder.IlIIlIIllIIl("mwBeocC5Roo=", "UzDIz");
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[35]] = AtCoder.IlIIlIIllIIl("uzq41HWg3AM=", "eCMQD");
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[36]] = AtCoder.llIIlIIllIIl("Rw==", "gUWJw");
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[37]] = AtCoder.IlIIlIIllIIl("FfOORHJtP+Y=", "QyLOe");
    }

    private static String lllIIIIllIIl(String IIIlIIIllll, String lllIIIIllll) {
        try {
            SecretKeySpec IllIIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIIIIllll = Cipher.getInstance("Blowfish");
            lIlIIIIllll.init(lIlIllIlIl[2], IllIIIIllll);
            return new String(lIlIIIIllll.doFinal(Base64.getDecoder().decode(IIIlIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIlIIIIllll) {
            IIlIIIIllll.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String llIIlIIllIIl(String IllIlllIlll, String lIlIlllIlll) {
        IllIlllIlll = new String(Base64.getDecoder().decode(IllIlllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder IIlIlllIlll = new StringBuilder();
        char[] llIIlllIlll = lIlIlllIlll.toCharArray();
        int IlIIlllIlll = lIlIllIlIl[0];
        char[] IIIlIllIlll = IllIlllIlll.toCharArray();
        int lIIlIllIlll = IIIlIllIlll.length;
        int IlIlIllIlll = lIlIllIlIl[0];
        "".length();
        while (!AtCoder.IIlllIIllIIl(IlIlIllIlll, lIIlIllIlll)) {
            char lIIIlllIlll = IIIlIllIlll[IlIlIllIlll];
            IIlIlllIlll.append((char)(lIIIlllIlll ^ llIIlllIlll[IlIIlllIlll % llIIlllIlll.length]));
            "".length();
            ++IlIIlllIlll;
            ++IlIlIllIlll;
        }
        return String.valueOf(IIlIlllIlll);
    }

    private static String IlIIlIIllIIl(String llIIIllIlll, String IlIIIllIlll) {
        try {
            SecretKeySpec lIIIIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlIIIllIlll.getBytes(StandardCharsets.UTF_8)), lIlIllIlIl[13]), "DES");
            Cipher IIIIIllIlll = Cipher.getInstance("DES");
            IIIIIllIlll.init(lIlIllIlIl[2], lIIIIllIlll);
            return new String(IIIIIllIlll.doFinal(Base64.getDecoder().decode(llIIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllIlIlll) {
            lllllIlIlll.printStackTrace();
            return null;
        }
    }

    private static void IllIlIIllIIl() {
        lIlIllIlIl = new int[39];
        AtCoder.lIlIllIlIl[0] = ((1 ^ 0x1A) << (" ".length() << " ".length()) ^ (0x18 ^ 0x7F)) & ((0xAE ^ 0xA9) << (" ".length() << " ".length()) ^ (0x9B ^ 0x8C) ^ -" ".length());
        AtCoder.lIlIllIlIl[1] = " ".length();
        AtCoder.lIlIllIlIl[2] = " ".length() << " ".length();
        AtCoder.lIlIllIlIl[3] = "   ".length();
        AtCoder.lIlIllIlIl[4] = " ".length() << (" ".length() << " ".length());
        AtCoder.lIlIllIlIl[5] = 0x42 ^ 0x47;
        AtCoder.lIlIllIlIl[6] = ((0xC ^ 5) << "   ".length() ^ (0xB8 ^ 0x87)) << " ".length();
        AtCoder.lIlIllIlIl[7] = ((0x18 ^ 0xD) << "   ".length()) + (0xDC ^ 0x9B) - (47 + 144 - 127 + 133) + (19 + 93 - -1 + 30);
        AtCoder.lIlIllIlIl[8] = (0xC ^ 3) << "   ".length();
        AtCoder.lIlIllIlIl[9] = 0xB8 ^ 0x97;
        AtCoder.lIlIllIlIl[10] = -" ".length();
        AtCoder.lIlIllIlIl[11] = "   ".length() << " ".length();
        AtCoder.lIlIllIlIl[12] = 0x12 ^ 0x15;
        AtCoder.lIlIllIlIl[13] = " ".length() << "   ".length();
        AtCoder.lIlIllIlIl[14] = 0x1B ^ 0x1C ^ (0x30 ^ 0x37) << " ".length();
        AtCoder.lIlIllIlIl[15] = ((0x72 ^ 0x43) << " ".length() ^ (0x28 ^ 0x4F)) << " ".length();
        AtCoder.lIlIllIlIl[16] = (0x6A ^ 0x45) << (" ".length() << " ".length()) ^ 125 + 47 - 113 + 124;
        AtCoder.lIlIllIlIl[17] = "   ".length() << (" ".length() << " ".length());
        AtCoder.lIlIllIlIl[18] = (0x21 ^ 0xA) << " ".length() ^ (0x44 ^ 0x1F);
        AtCoder.lIlIllIlIl[19] = (0x2B ^ 0x2C) << " ".length();
        AtCoder.lIlIllIlIl[20] = 0x86 ^ 0xC5 ^ (0xD4 ^ 0xC7) << (" ".length() << " ".length());
        AtCoder.lIlIllIlIl[21] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        AtCoder.lIlIllIlIl[22] = 0x32 ^ 0x13;
        AtCoder.lIlIllIlIl[23] = "   ".length() << " ".length() ^ (0x66 ^ 0x71);
        AtCoder.lIlIllIlIl[24] = 14 + 80 - 84 + 183 ^ (0xDC ^ 0x93) << " ".length();
        AtCoder.lIlIllIlIl[25] = (0x40 ^ 0x49) << " ".length();
        AtCoder.lIlIllIlIl[26] = (0xC7 ^ 0xC0) << (" ".length() << " ".length());
        AtCoder.lIlIllIlIl[27] = 0xDD ^ 0x88;
        AtCoder.lIlIllIlIl[28] = ((0x5C ^ 0x67) << " ".length() ^ (0xFC ^ 0x95)) << " ".length();
        AtCoder.lIlIllIlIl[29] = 0x44 ^ 0x7F;
        AtCoder.lIlIllIlIl[30] = 0x73 ^ 0x7E ^ (0x94 ^ 0x9B) << " ".length();
        AtCoder.lIlIllIlIl[31] = (0x4E ^ 0x4B) << (" ".length() << " ".length());
        AtCoder.lIlIllIlIl[32] = 0x4B ^ 0x5E;
        AtCoder.lIlIllIlIl[33] = (0xBC ^ 0xB7) << " ".length();
        AtCoder.lIlIllIlIl[34] = (0x2D ^ 0x38) << (" ".length() << " ".length()) ^ (0x31 ^ 0x72);
        AtCoder.lIlIllIlIl[35] = "   ".length() << "   ".length();
        AtCoder.lIlIllIlIl[36] = (0xBE ^ 0x93) << " ".length() ^ (4 ^ 0x47);
        AtCoder.lIlIllIlIl[37] = (0x3D ^ 0x30) << " ".length();
        AtCoder.lIlIllIlIl[38] = 0x9A ^ 0x81;
    }

    private static boolean llIllIIllIIl(int n, int n2) {
        return n == n2;
    }

    private static boolean IIlllIIllIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIlllIIllIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IIIllIIllIIl(int n, int n2) {
        return n > n2;
    }

    private static boolean IlIllIIllIIl(Object object) {
        return object != null;
    }

    private static boolean lllIlIIllIIl(int n) {
        return n != 0;
    }

    private static boolean lIIllIIllIIl(int n) {
        return n >= 0;
    }

    private static boolean IllllIIllIIl(int n) {
        return n > 0;
    }
}

