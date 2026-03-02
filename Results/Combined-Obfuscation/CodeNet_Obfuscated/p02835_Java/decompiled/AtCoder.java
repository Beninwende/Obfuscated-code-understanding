/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class AtCoder {
    private int[] a = new int[IlIllIIIll[0]];
    private static String[] lllIlIIIll;
    private static int[] IlIllIIIll;

    AtCoder(FastScanner IllllIllIIlIlll) {
        AtCoder lllllIllIIlIlll;
        int lIlllIllIIlIlll = IlIllIIIll[1];
        while (AtCoder.lIlIlIlIllIl(lIlllIllIIlIlll, IlIllIIIll[0])) {
            lllllIllIIlIlll.a[lIlllIllIIlIlll] = IllllIllIIlIlll.nextInt();
            ++lIlllIllIIlIlll;
            "".length();
            if ((((0x94 ^ 0x91) << " ".length() ^ (0x42 ^ 0x77)) & ((0xBE ^ 0xBB) << "   ".length() ^ (0xD4 ^ 0xC3) ^ -" ".length())) == 0) continue;
            throw null;
        }
    }

    void solve(PrintWriter lIIllIllIIlIlll) {
        AtCoder IlIllIllIIlIlll;
        if (AtCoder.IllIlIlIllIl(IlIllIllIIlIlll.a[IlIllIIIll[1]] + IlIllIllIIlIlll.a[IlIllIIIll[2]] + IlIllIllIIlIlll.a[IlIllIIIll[3]], IlIllIIIll[4])) {
            lIIllIllIIlIlll.println(lllIlIIIll[IlIllIIIll[1]]);
            "".length();
            if (" ".length() == 0) {
                return;
            }
        } else {
            lIIllIllIIlIlll.println(lllIlIIIll[IlIllIIIll[2]]);
        }
    }

    static {
        AtCoder.IIlIlIlIllIl();
        AtCoder.llIIlIlIllIl();
    }

    private static void llIIlIlIllIl() {
        lllIlIIIll = new String[IlIllIIIll[3]];
        AtCoder.lllIlIIIll[AtCoder.IlIllIIIll[1]] = AtCoder.lIlIIIlIllIl("zSgsN2GkHtk=", "NVZkm");
        AtCoder.lllIlIIIll[AtCoder.IlIllIIIll[2]] = AtCoder.IlIIlIlIllIl("AxIkOQ==", "agWMZ");
    }

    private static String lIlIIIlIllIl(String IIlIlIllIIlIlll, String llIIlIllIIlIlll) {
        try {
            SecretKeySpec IlIIlIllIIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIlIllIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIlIllIIlIlll = Cipher.getInstance("Blowfish");
            lIIIlIllIIlIlll.init(IlIllIIIll[3], IlIIlIllIIlIlll);
            return new String(lIIIlIllIIlIlll.doFinal(Base64.getDecoder().decode(IIlIlIllIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIIlIllIIlIlll) {
            IIIIlIllIIlIlll.printStackTrace();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String IlIIlIlIllIl(String IlIIIIllIIlIlll, String lIIIIIllIIlIlll) {
        IlIIIIllIIlIlll = new String(Base64.getDecoder().decode(IlIIIIllIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        IIIIIIllIIlIlll = new StringBuilder();
        llllllIlIIlIlll = lIIIIIllIIlIlll.toCharArray();
        IlllllIlIIlIlll = AtCoder.IlIllIIIll[1];
        IIlIllIlIIlIlll = IlIIIIllIIlIlll.toCharArray();
        lIlIllIlIIlIlll = IIlIllIlIIlIlll.length;
        IllIllIlIIlIlll = AtCoder.IlIllIIIll[1];
        "".length();
        if (-"  ".length() <= 0) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            lIllllIlIIlIlll = IIlIllIlIIlIlll[IllIllIlIIlIlll];
            IIIIIIllIIlIlll.append((char)(lIllllIlIIlIlll ^ llllllIlIIlIlll[IlllllIlIIlIlll % llllllIlIIlIlll.length]));
            "".length();
            ++IlllllIlIIlIlll;
            ++IllIllIlIIlIlll;
lbl19:
            // 2 sources

            ** while (!AtCoder.lllIlIlIllIl((int)IllIllIlIIlIlll, (int)lIlIllIlIIlIlll))
        }
lbl20:
        // 1 sources

        return String.valueOf(IIIIIIllIIlIlll);
    }

    private static void IIlIlIlIllIl() {
        IlIllIIIll = new int[5];
        AtCoder.IlIllIIIll[0] = "   ".length();
        AtCoder.IlIllIIIll[1] = (0x81 ^ 0x88 ^ (4 ^ 0x15) << " ".length()) << " ".length() & ((71 + 84 - 29 + 55 ^ (0xDF ^ 0x90) << " ".length()) << " ".length() ^ -" ".length());
        AtCoder.IlIllIIIll[2] = " ".length();
        AtCoder.IlIllIIIll[3] = " ".length() << " ".length();
        AtCoder.IlIllIIIll[4] = 0xB3 ^ 0xA6;
    }

    private static boolean lllIlIlIllIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIlIlIlIllIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IllIlIlIllIl(int n, int n2) {
        return n <= n2;
    }
}

