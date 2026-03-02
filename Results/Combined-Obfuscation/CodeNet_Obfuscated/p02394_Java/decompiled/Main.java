/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class Main {
    private static String[] lIIllIIlll;
    private static int[] IlIllIIlll;

    Main() {
        Main lIIIlIIIIIIIIll;
    }

    public static void main(String[] stringArray) throws Exception {
        BufferedReader IIIlIIIIIIIIIll = new BufferedReader(new InputStreamReader(System.in));
        String[] lllIIIIIIIIIIll = IIIlIIIIIIIIIll.readLine().split(lIIllIIlll[IlIllIIlll[0]]);
        int IllIIIIIIIIIIll = Integer.parseInt(lllIIIIIIIIIIll[IlIllIIlll[0]]);
        int lIlIIIIIIIIIIll = Integer.parseInt(lllIIIIIIIIIIll[IlIllIIlll[1]]);
        int IIlIIIIIIIIIIll = Integer.parseInt(lllIIIIIIIIIIll[IlIllIIlll[2]]);
        int llIIIIIIIIIIIll = Integer.parseInt(lllIIIIIIIIIIll[IlIllIIlll[3]]);
        int IlIIIIIIIIIIIll = Integer.parseInt(lllIIIIIIIIIIll[IlIllIIlll[4]]);
        int lIIIIIIIIIIIIll = IlIllIIlll[0];
        if (Main.lIlIlllIlIll(IlIllIIlll[0], IllIIIIIIIIIIll) && Main.lIlIlllIlIll(IlIllIIlll[0], lIlIIIIIIIIIIll) && Main.lIlIlllIlIll(IlIllIIlll[0], IIlIIIIIIIIIIll) && Main.lIlIlllIlIll(IlIllIIlll[0], llIIIIIIIIIIIll) && Main.lIlIlllIlIll(IIlIIIIIIIIIIll + IlIIIIIIIIIIIll, IllIIIIIIIIIIll) && Main.lIlIlllIlIll(llIIIIIIIIIIIll + IlIIIIIIIIIIIll, lIlIIIIIIIIIIll) && Main.lIlIlllIlIll(IlIllIIlll[0], IIlIIIIIIIIIIll - IlIIIIIIIIIIIll) && Main.lIlIlllIlIll(IlIllIIlll[0], llIIIIIIIIIIIll - IlIIIIIIIIIIIll)) {
            System.out.println(lIIllIIlll[IlIllIIlll[1]]);
            ++lIIIIIIIIIIIIll;
        }
        if (Main.IllIlllIlIll(IlIllIIlll[0], IllIIIIIIIIIIll) && Main.lIlIlllIlIll(IlIllIIlll[0], lIlIIIIIIIIIIll) && Main.IllIlllIlIll(IlIllIIlll[0], IIlIIIIIIIIIIll) && Main.lIlIlllIlIll(IlIllIIlll[0], llIIIIIIIIIIIll) && Main.lllIlllIlIll(IIlIIIIIIIIIIll + IlIIIIIIIIIIIll) && Main.lIlIlllIlIll(llIIIIIIIIIIIll + IlIIIIIIIIIIIll, lIlIIIIIIIIIIll) && Main.lIlIlllIlIll(IllIIIIIIIIIIll, IIlIIIIIIIIIIll - IlIIIIIIIIIIIll) && Main.lIlIlllIlIll(IlIllIIlll[0], llIIIIIIIIIIIll - IlIIIIIIIIIIIll)) {
            System.out.println(lIIllIIlll[IlIllIIlll[2]]);
            ++lIIIIIIIIIIIIll;
        }
        if (Main.IllIlllIlIll(IlIllIIlll[0], IllIIIIIIIIIIll) && Main.IllIlllIlIll(IlIllIIlll[0], lIlIIIIIIIIIIll) && Main.IllIlllIlIll(IlIllIIlll[0], IIlIIIIIIIIIIll) && Main.IllIlllIlIll(IlIllIIlll[0], llIIIIIIIIIIIll) && Main.lllIlllIlIll(IIlIIIIIIIIIIll + IlIIIIIIIIIIIll) && Main.lllIlllIlIll(llIIIIIIIIIIIll + IlIIIIIIIIIIIll) && Main.lIlIlllIlIll(IllIIIIIIIIIIll, IIlIIIIIIIIIIll - IlIIIIIIIIIIIll) && Main.lIlIlllIlIll(lIlIIIIIIIIIIll, llIIIIIIIIIIIll - IlIIIIIIIIIIIll)) {
            System.out.println(lIIllIIlll[IlIllIIlll[3]]);
            ++lIIIIIIIIIIIIll;
        }
        if (Main.IllIlllIlIll(IlIllIIlll[0], IllIIIIIIIIIIll) && Main.IllIlllIlIll(IlIllIIlll[0], lIlIIIIIIIIIIll) && Main.lIlIlllIlIll(IlIllIIlll[0], IIlIIIIIIIIIIll) && Main.IllIlllIlIll(IlIllIIlll[0], llIIIIIIIIIIIll) && Main.lIlIlllIlIll(IIlIIIIIIIIIIll + IlIIIIIIIIIIIll, IllIIIIIIIIIIll) && Main.lllIlllIlIll(llIIIIIIIIIIIll + IlIIIIIIIIIIIll) && Main.lIlIlllIlIll(IllIIIIIIIIIIll, IIlIIIIIIIIIIll - IlIIIIIIIIIIIll) && Main.lIlIlllIlIll(lIlIIIIIIIIIIll, llIIIIIIIIIIIll - IlIIIIIIIIIIIll)) {
            System.out.println(lIIllIIlll[IlIllIIlll[4]]);
            ++lIIIIIIIIIIIIll;
        }
        if (Main.IIIllllIlIll(lIIIIIIIIIIIIll)) {
            System.out.println(lIIllIIlll[IlIllIIlll[5]]);
        }
    }

    static {
        Main.IIlIlllIlIll();
        Main.llIIlllIlIll();
    }

    private static void llIIlllIlIll() {
        lIIllIIlll = new String[IlIllIIlll[6]];
        Main.lIIllIIlll[Main.IlIllIIlll[0]] = Main.IIIIlllIlIll("biy1M+ZAxqQ=", "mGlPk");
        Main.lIIllIIlll[Main.IlIllIIlll[1]] = Main.lIIIlllIlIll("Ey0x", "JHBFz");
        Main.lIIllIIlll[Main.IlIllIIlll[2]] = Main.IIIIlllIlIll("uSxSe0wGNfo=", "NERzq");
        Main.lIIllIIlll[Main.IlIllIIlll[3]] = Main.IlIIlllIlIll("CVq+wnlSzro=", "Flqkq");
        Main.lIIllIIlll[Main.IlIllIIlll[4]] = Main.IlIIlllIlIll("Fbj5dJ3rvhU=", "HBYtb");
        Main.lIIllIIlll[Main.IlIllIIlll[5]] = Main.lIIIlllIlIll("Dyc=", "AHeRP");
    }

    private static String IIIIlllIlIll(String IIlllllllllllIl, String llIllllllllllIl) {
        try {
            SecretKeySpec IlIllllllllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllllllllllIl.getBytes(StandardCharsets.UTF_8)), IlIllIIlll[7]), "DES");
            Cipher lIIllllllllllIl = Cipher.getInstance("DES");
            lIIllllllllllIl.init(IlIllIIlll[2], IlIllllllllllIl);
            return new String(lIIllllllllllIl.doFinal(Base64.getDecoder().decode(IIlllllllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIllllllllllIl) {
            IIIllllllllllIl.printStackTrace();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String lIIIlllIlIll(String IlIlIllllllllIl, String lIIlIllllllllIl) {
        IlIlIllllllllIl = new String(Base64.getDecoder().decode(IlIlIllllllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        IIIlIllllllllIl = new StringBuilder();
        lllIIllllllllIl = lIIlIllllllllIl.toCharArray();
        IllIIllllllllIl = Main.IlIllIIlll[0];
        IIlllIlllllllIl = IlIlIllllllllIl.toCharArray();
        lIlllIlllllllIl = IIlllIlllllllIl.length;
        IllllIlllllllIl = Main.IlIllIIlll[0];
        "".length();
        if (((166 + 67 - 83 + 55 ^ (12 ^ 109) << " ".length()) << " ".length() & (((128 ^ 145) << (" ".length() << " ".length()) ^ (229 ^ 174)) << " ".length() ^ -" ".length())) == 0) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            lIlIIllllllllIl = IIlllIlllllllIl[IllllIlllllllIl];
            IIIlIllllllllIl.append((char)(lIlIIllllllllIl ^ lllIIllllllllIl[IllIIllllllllIl % lllIIllllllllIl.length]));
            "".length();
            ++IllIIllllllllIl;
            ++IllllIlllllllIl;
lbl19:
            // 2 sources

            ** while (!Main.IllIlllIlIll((int)IllllIlllllllIl, (int)lIlllIlllllllIl))
        }
lbl20:
        // 1 sources

        return String.valueOf(IIIlIllllllllIl);
    }

    private static String IlIIlllIlIll(String lllIlIlllllllIl, String IllIlIlllllllIl) {
        try {
            SecretKeySpec lIlIlIlllllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IllIlIlllllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IIlIlIlllllllIl = Cipher.getInstance("Blowfish");
            IIlIlIlllllllIl.init(IlIllIIlll[2], lIlIlIlllllllIl);
            return new String(IIlIlIlllllllIl.doFinal(Base64.getDecoder().decode(lllIlIlllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlIlllllllIl) {
            llIIlIlllllllIl.printStackTrace();
            return null;
        }
    }

    private static void IIlIlllIlIll() {
        IlIllIIlll = new int[8];
        Main.IlIllIIlll[0] = (0xF3 ^ 0x9A ^ (0x9F ^ 0x96) << (" ".length() << " ".length())) & ((0x39 ^ 0x28) << "   ".length() ^ 137 + 185 - 132 + 7 ^ -" ".length());
        Main.IlIllIIlll[1] = " ".length();
        Main.IlIllIIlll[2] = " ".length() << " ".length();
        Main.IlIllIIlll[3] = "   ".length();
        Main.IlIllIIlll[4] = " ".length() << (" ".length() << " ".length());
        Main.IlIllIIlll[5] = 124 + 103 - 189 + 141 ^ (0x7A ^ 0x21) << " ".length();
        Main.IlIllIIlll[6] = "   ".length() << " ".length();
        Main.IlIllIIlll[7] = " ".length() << "   ".length();
    }

    private static boolean IllIlllIlIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIlIlllIlIll(int n, int n2) {
        return n <= n2;
    }

    private static boolean IIIllllIlIll(int n) {
        return n == 0;
    }

    private static boolean lllIlllIlIll(int n) {
        return n <= 0;
    }
}

