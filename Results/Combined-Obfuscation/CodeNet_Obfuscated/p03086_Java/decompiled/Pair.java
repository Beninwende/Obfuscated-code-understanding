/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class Pair {
    public int x;
    public int y;
    private static int[] lIlIlllIll;
    private static String[] lllIlllIll;
    private static int[] IIIllllIll;

    public Pair(int llIlIllllllIIll, int IlIlIllllllIIll) {
        Pair IIllIllllllIIll;
        IIllIllllllIIll.x = llIlIllllllIIll;
        IIllIllllllIIll.y = IlIlIllllllIIll;
    }

    public boolean equals(Object IlIIIllllllIIll) {
        int n;
        Pair llIIIllllllIIll;
        if (Pair.lIIlIIllIIll(Pair.lIllllIlIIll(IlIIIllllllIIll, llIIIllllllIIll) ? 1 : 0)) {
            return lIlIlllIll[IIIllllIll[0]];
        }
        if (Pair.lIIlIIllIIll(Pair.IlllllIlIIll(IlIIIllllllIIll instanceof Pair) ? 1 : 0)) {
            return lIlIlllIll[IIIllllIll[1]];
        }
        Pair lIIIIllllllIIll = (Pair)IlIIIllllllIIll;
        if (Pair.lIIlIIllIIll(Pair.llllllIlIIll(llIIIllllllIIll.x, lIIIIllllllIIll.x) ? 1 : 0) && Pair.lIIlIIllIIll(Pair.llllllIlIIll(llIIIllllllIIll.y, lIIIIllllllIIll.y) ? 1 : 0)) {
            n = lIlIlllIll[IIIllllIll[0]];
            lllIlllIll[IIIllllIll[0]].length();
            "".length();
            if (Pair.IlIlIIllIIll(-lllIlllIll[IIIllllIll[1]].length())) {
                return (((IIIllllIll[2] ^ IIIllllIll[3]) << lllIlllIll[IIIllllIll[4]].length() ^ (IIIllllIll[5] ^ IIIllllIll[6])) & (IIIllllIll[7] ^ IIIllllIll[8] ^ lllIlllIll[IIIllllIll[9]].length() << (lllIlllIll[IIIllllIll[10]].length() << lllIlllIll[IIIllllIll[11]].length()) ^ -lllIlllIll[IIIllllIll[12]].length())) != 0;
            }
        } else {
            n = lIlIlllIll[IIIllllIll[1]];
        }
        return n != 0;
    }

    public int hashCode() {
        int[] nArray = new int[lIlIlllIll[IIIllllIll[4]]];
        nArray[Pair.lIlIlllIll[Pair.IIIllllIll[1]]] = this.x;
        nArray[Pair.lIlIlllIll[Pair.IIIllllIll[0]]] = this.y;
        return Arrays.hashCode(nArray);
    }

    public String toString() {
        Pair lIIllIlllllIIll;
        return "(" + lIIllIlllllIIll.x + ", " + this.y + ")";
    }

    static {
        Pair.IIIlIIllIIll();
        Pair.IllIIIllIIll();
        Pair.IIllllIlIIll();
    }

    private static void IIllllIlIIll() {
        lIlIlllIll = new int[IIIllllIll[9]];
        Pair.lIlIlllIll[Pair.IIIllllIll[0]] = lllIlllIll[IIIllllIll[13]].length();
        Pair.lIlIlllIll[Pair.IIIllllIll[1]] = lllIlllIll[IIIllllIll[14]].length() << lllIlllIll[IIIllllIll[15]].length() & (lllIlllIll[IIIllllIll[16]].length() << lllIlllIll[IIIllllIll[17]].length() ^ -lllIlllIll[IIIllllIll[18]].length());
        Pair.lIlIlllIll[Pair.IIIllllIll[4]] = lllIlllIll[IIIllllIll[19]].length() << lllIlllIll[IIIllllIll[20]].length();
    }

    private static boolean llllllIlIIll(int n, int n2) {
        boolean bl;
        if (Pair.llIlIIllIIll(n, n2)) {
            bl = IIIllllIll[1];
            "".length();
            if ((" ".length() << "   ".length() & (" ".length() << "   ".length() ^ -" ".length())) != 0) {
                return (" ".length() << "   ".length() & (" ".length() << "   ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = IIIllllIll[0];
        }
        return bl;
    }

    private static boolean lIllllIlIIll(Object object, Object object2) {
        boolean bl;
        if (Pair.IIllIIllIIll(object, object2)) {
            bl = IIIllllIll[1];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) <= 0) {
                return ((0xE7 ^ 0xA6) & ~(0xDC ^ 0x9D)) != 0;
            }
        } else {
            bl = IIIllllIll[0];
        }
        return bl;
    }

    private static boolean IlllllIlIIll(int n) {
        boolean bl;
        if (Pair.lIllIIllIIll(n)) {
            bl = IIIllllIll[1];
            "".length();
            if ((((0xD7 ^ 0x8C) << " ".length() ^ 23 + 0 - -79 + 63) << " ".length() & (((0x9A ^ 0x9F) << (" ".length() << " ".length()) ^ (0xC2 ^ 0xC5)) << " ".length() ^ -" ".length())) >= " ".length()) {
                return ("   ".length() << "   ".length() & ("   ".length() << "   ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = IIIllllIll[0];
        }
        return bl;
    }

    private static void IllIIIllIIll() {
        lllIlllIll = new String[IIIllllIll[21]];
        Pair.lllIlllIll[Pair.IIIllllIll[0]] = Pair.llIIIIllIIll("", "KEHDZ");
        Pair.lllIlllIll[Pair.IIIllllIll[1]] = Pair.llIIIIllIIll("VU4=", "unIeW");
        Pair.lllIlllIll[Pair.IIIllllIll[4]] = Pair.IIlIIIllIIll("0RlhgToYtz0=", "Ckjfq");
        Pair.lllIlllIll[Pair.IIIllllIll[9]] = Pair.llIIIIllIIll("WQ==", "yzdBl");
        Pair.lllIlllIll[Pair.IIIllllIll[10]] = Pair.IIlIIIllIIll("jReBJzGsk4s=", "HCvZM");
        Pair.lllIlllIll[Pair.IIIllllIll[11]] = Pair.IIlIIIllIIll("al5xc2H6/rQ=", "Zeiak");
        Pair.lllIlllIll[Pair.IIIllllIll[12]] = Pair.llIIIIllIIll("VA==", "tSjuW");
        Pair.lllIlllIll[Pair.IIIllllIll[13]] = Pair.IIlIIIllIIll("GCpEZ6bfmms=", "otCVz");
        Pair.lllIlllIll[Pair.IIIllllIll[14]] = Pair.lIlIIIllIIll("50Z98Mt02Fo=", "rvMhA");
        Pair.lllIlllIll[Pair.IIIllllIll[15]] = Pair.lIlIIIllIIll("LAfTP3q5N1A=", "ekGka");
        Pair.lllIlllIll[Pair.IIIllllIll[16]] = Pair.IIlIIIllIIll("kB+qnmYsWUA=", "bDHli");
        Pair.lllIlllIll[Pair.IIIllllIll[17]] = Pair.lIlIIIllIIll("HMFha7FHYmU=", "YfktZ");
        Pair.lllIlllIll[Pair.IIIllllIll[18]] = Pair.lIlIIIllIIll("nSZCxLIWXnA=", "LPaIU");
        Pair.lllIlllIll[Pair.IIIllllIll[19]] = Pair.IIlIIIllIIll("m8WWlUC+wyg=", "QZALq");
        Pair.lllIlllIll[Pair.IIIllllIll[20]] = Pair.IIlIIIllIIll("JN7JPxlEifk=", "Wrzsl");
    }

    /*
     * Unable to fully structure code
     */
    private static String llIIIIllIIll(String llllllIllllIIll, String IlllllIllllIIll) {
        llllllIllllIIll = new String(Base64.getDecoder().decode(llllllIllllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        lIllllIllllIIll = new StringBuilder();
        IIllllIllllIIll = IlllllIllllIIll.toCharArray();
        llIlllIllllIIll = Pair.IIIllllIll[0];
        lIIIllIllllIIll = llllllIllllIIll.toCharArray();
        IlIIllIllllIIll = lIIIllIllllIIll.length;
        llIIllIllllIIll = Pair.IIIllllIll[0];
        "".length();
        if (" ".length() != -" ".length()) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            IlIlllIllllIIll = lIIIllIllllIIll[llIIllIllllIIll];
            lIllllIllllIIll.append((char)(IlIlllIllllIIll ^ IIllllIllllIIll[llIlllIllllIIll % IIllllIllllIIll.length]));
            "".length();
            ++llIlllIllllIIll;
            ++llIIllIllllIIll;
lbl19:
            // 2 sources

            ** while (!Pair.IlllIIllIIll((int)llIIllIllllIIll, (int)IlIIllIllllIIll))
        }
lbl20:
        // 1 sources

        return String.valueOf(lIllllIllllIIll);
    }

    private static String IIlIIIllIIll(String IIllIlIllllIIll, String llIlIlIllllIIll) {
        try {
            SecretKeySpec IlIlIlIllllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIlIllllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlIlIllllIIll = Cipher.getInstance("Blowfish");
            lIIlIlIllllIIll.init(IIIllllIll[4], IlIlIlIllllIIll);
            return new String(lIIlIlIllllIIll.doFinal(Base64.getDecoder().decode(IIllIlIllllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIlIlIllllIIll) {
            IIIlIlIllllIIll.printStackTrace();
            return null;
        }
    }

    private static String lIlIIIllIIll(String lllllIIllllIIll, String IllllIIllllIIll) {
        try {
            SecretKeySpec lIlllIIllllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IllllIIllllIIll.getBytes(StandardCharsets.UTF_8)), IIIllllIll[14]), "DES");
            Cipher IIlllIIllllIIll = Cipher.getInstance("DES");
            IIlllIIllllIIll.init(IIIllllIll[4], lIlllIIllllIIll);
            return new String(IIlllIIllllIIll.doFinal(Base64.getDecoder().decode(lllllIIllllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllIIllllIIll) {
            llIllIIllllIIll.printStackTrace();
            return null;
        }
    }

    private static void IIIlIIllIIll() {
        IIIllllIll = new int[22];
        Pair.IIIllllIll[0] = ((0xA7 ^ 0xAA) << (" ".length() << " ".length()) ^ (0x34 ^ 0x33)) & (0x3A ^ 0x3F ^ (0x81 ^ 0x9A) << " ".length() ^ -" ".length());
        Pair.IIIllllIll[1] = " ".length();
        Pair.IIIllllIll[2] = ((0x25 ^ 0x36) << (" ".length() << " ".length()) ^ 4 + 2 - -24 + 97) << (" ".length() << " ".length());
        Pair.IIIllllIll[3] = 64 + 187 - 96 + 40;
        Pair.IIIllllIll[4] = " ".length() << " ".length();
        Pair.IIIllllIll[5] = (0x61 ^ 0x54) << (" ".length() << " ".length()) ^ 51 + 72 - 2 + 24;
        Pair.IIIllllIll[6] = (0x53 ^ 0x56) << (" ".length() << " ".length());
        Pair.IIIllllIll[7] = (0x16 ^ 0x13) << (" ".length() << (" ".length() << " ".length()));
        Pair.IIIllllIll[8] = 0x54 ^ 0x51 ^ (0x8E ^ 0x81) << " ".length();
        Pair.IIIllllIll[9] = "   ".length();
        Pair.IIIllllIll[10] = " ".length() << (" ".length() << " ".length());
        Pair.IIIllllIll[11] = "   ".length() << "   ".length() ^ (0x7B ^ 0x66);
        Pair.IIIllllIll[12] = "   ".length() << " ".length();
        Pair.IIIllllIll[13] = 0x95 ^ 0x92;
        Pair.IIIllllIll[14] = " ".length() << "   ".length();
        Pair.IIIllllIll[15] = (0x41 ^ 0x54) << " ".length() ^ (0x3F ^ 0x1C);
        Pair.IIIllllIll[16] = (0x35 ^ 0x30) << " ".length();
        Pair.IIIllllIll[17] = 0x77 ^ 0x7C;
        Pair.IIIllllIll[18] = "   ".length() << (" ".length() << " ".length());
        Pair.IIIllllIll[19] = 0x3E ^ 0x33;
        Pair.IIIllllIll[20] = (0x72 ^ 0x75) << " ".length();
        Pair.IIIllllIll[21] = (0x3C ^ 0x25) << " ".length() ^ (0x74 ^ 0x49);
    }

    private static boolean llIlIIllIIll(int n, int n2) {
        return n == n2;
    }

    private static boolean IlllIIllIIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIllIIllIIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIIllIIll(int n) {
        return n != 0;
    }

    private static boolean lIllIIllIIll(int n) {
        return n == 0;
    }

    private static boolean IlIlIIllIIll(int n) {
        return n >= 0;
    }
}

