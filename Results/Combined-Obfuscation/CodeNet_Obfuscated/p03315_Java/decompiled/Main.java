/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static String[] lIIIIIll;
    private static int[] IlIIIIll;

    public Main() {
        Main IlIllIIlIIlIIIl;
    }

    public static void main(String[] stringArray) {
        Scanner lllIlIIlIIlIIIl = new Scanner(System.in);
        String IllIlIIlIIlIIIl = lllIlIIlIIlIIIl.nextLine();
        if (Main.IllllllIIl(IllIlIIlIIlIIIl.equals(lIIIIIll[IlIIIIll[0]]) ? 1 : 0)) {
            System.out.println(IlIIIIll[1]);
        }
        if (!Main.lllllllIIl(IllIlIIlIIlIIIl.equals(lIIIIIll[IlIIIIll[2]]) ? 1 : 0) || !Main.lllllllIIl(IllIlIIlIIlIIIl.equals(lIIIIIll[IlIIIIll[3]]) ? 1 : 0) || !Main.lllllllIIl(IllIlIIlIIlIIIl.equals(lIIIIIll[IlIIIIll[4]]) ? 1 : 0) || Main.IllllllIIl(IllIlIIlIIlIIIl.equals(lIIIIIll[IlIIIIll[5]]) ? 1 : 0)) {
            System.out.println(IlIIIIll[6]);
        }
        if (!(Main.lllllllIIl(IllIlIIlIIlIIIl.equals(lIIIIIll[IlIIIIll[7]]) ? 1 : 0) && Main.lllllllIIl(IllIlIIlIIlIIIl.equals(lIIIIIll[IlIIIIll[8]]) ? 1 : 0) && Main.lllllllIIl(IllIlIIlIIlIIIl.equals(lIIIIIll[IlIIIIll[9]]) ? 1 : 0) && Main.lllllllIIl(IllIlIIlIIlIIIl.equals(lIIIIIll[IlIIIIll[10]]) ? 1 : 0) && Main.lllllllIIl(IllIlIIlIIlIIIl.equals(lIIIIIll[IlIIIIll[11]]) ? 1 : 0) && !Main.IllllllIIl(IllIlIIlIIlIIIl.equals(lIIIIIll[IlIIIIll[12]]) ? 1 : 0))) {
            System.out.println(IlIIIIll[0]);
        }
        if (Main.IllllllIIl(IllIlIIlIIlIIIl.equals(lIIIIIll[IlIIIIll[13]]) ? 1 : 0)) {
            System.out.println(IlIIIIll[5]);
        }
        if (!Main.lllllllIIl(IllIlIIlIIlIIIl.equals(lIIIIIll[IlIIIIll[14]]) ? 1 : 0) || !Main.lllllllIIl(IllIlIIlIIlIIIl.equals(lIIIIIll[IlIIIIll[15]]) ? 1 : 0) || !Main.lllllllIIl(IllIlIIlIIlIIIl.equals(lIIIIIll[IlIIIIll[16]]) ? 1 : 0) || Main.IllllllIIl(IllIlIIlIIlIIIl.equals(lIIIIIll[IlIIIIll[17]]) ? 1 : 0)) {
            System.out.println(IlIIIIll[3]);
        }
    }

    static {
        Main.lIlllllIIl();
        Main.IIlllllIIl();
    }

    private static void IIlllllIIl() {
        lIIIIIll = new String[IlIIIIll[18]];
        Main.lIIIIIll[Main.IlIIIIll[0]] = Main.lIIllllIIl("0Y3NLLH5PNs=", "Bgxde");
        Main.lIIIIIll[Main.IlIIIIll[2]] = Main.IlIllllIIl("OdvyfjCvIsA=", "QpsPF");
        Main.lIIIIIll[Main.IlIIIIll[3]] = Main.lIIllllIIl("U3IloaV4ovk=", "JjcbS");
        Main.lIIIIIll[Main.IlIIIIll[4]] = Main.lIIllllIIl("6F/k5kZLYl8=", "aDWtn");
        Main.lIIIIIll[Main.IlIIIIll[5]] = Main.lIIllllIIl("iv6qywVv0js=", "CKnYw");
        Main.lIIIIIll[Main.IlIIIIll[7]] = Main.llIllllIIl("QVNkWA==", "jxIuX");
        Main.lIIIIIll[Main.IlIIIIll[8]] = Main.lIIllllIIl("pw5OAKCeIXw=", "zkLNS");
        Main.lIIIIIll[Main.IlIIIIll[9]] = Main.lIIllllIIl("LXEvqLm/Uuo=", "duaRB");
        Main.lIIIIIll[Main.IlIIIIll[10]] = Main.IlIllllIIl("MXbFNyxSB9o=", "kylvn");
        Main.lIIIIIll[Main.IlIIIIll[11]] = Main.IlIllllIIl("apCKM2USKAU=", "GuxkU");
        Main.lIIIIIll[Main.IlIIIIll[12]] = Main.lIIllllIIl("CB7tEIZ2nXs=", "QRmkz");
        Main.lIIIIIll[Main.IlIIIIll[13]] = Main.lIIllllIIl("MzZQcT2eFr0=", "QAXlr");
        Main.lIIIIIll[Main.IlIIIIll[14]] = Main.llIllllIIl("bX1eYQ==", "FVuLA");
        Main.lIIIIIll[Main.IlIIIIll[15]] = Main.IlIllllIIl("+ec8OQcv62o=", "RudSk");
        Main.lIIIIIll[Main.IlIIIIll[16]] = Main.IlIllllIIl("+YQiCIb8HYI=", "RkYjH");
        Main.lIIIIIll[Main.IlIIIIll[17]] = Main.llIllllIIl("WkZBRg==", "wmjmn");
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String llIllllIIl(String IIllIIIlIIlIIIl, String llIlIIIlIIlIIIl) {
        IIllIIIlIIlIIIl = new String(Base64.getDecoder().decode(IIllIIIlIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder IlIlIIIlIIlIIIl = new StringBuilder();
        char[] lIIlIIIlIIlIIIl = llIlIIIlIIlIIIl.toCharArray();
        int IIIlIIIlIIlIIIl = IlIIIIll[0];
        char[] IllllllIIIlIIIl = IIllIIIlIIlIIIl.toCharArray();
        int lllllllIIIlIIIl = IllllllIIIlIIIl.length;
        int IIIIIIIlIIlIIIl = IlIIIIll[0];
        "".length();
        while (!Main.IIIIIIIlIl(IIIIIIIlIIlIIIl, lllllllIIIlIIIl)) {
            char lllIIIIlIIlIIIl = IllllllIIIlIIIl[IIIIIIIlIIlIIIl];
            IlIlIIIlIIlIIIl.append((char)(lllIIIIlIIlIIIl ^ lIIlIIIlIIlIIIl[IIIlIIIlIIlIIIl % lIIlIIIlIIlIIIl.length]));
            "".length();
            ++IIIlIIIlIIlIIIl;
            ++IIIIIIIlIIlIIIl;
        }
        return String.valueOf(IlIlIIIlIIlIIIl);
    }

    private static String lIIllllIIl(String lIIllllIIIlIIIl, String IIIllllIIIlIIIl) {
        try {
            SecretKeySpec lllIlllIIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIIllllIIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IllIlllIIIlIIIl = Cipher.getInstance("Blowfish");
            IllIlllIIIlIIIl.init(IlIIIIll[3], lllIlllIIIlIIIl);
            return new String(IllIlllIIIlIIIl.doFinal(Base64.getDecoder().decode(lIIllllIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlllIIIlIIIl) {
            lIlIlllIIIlIIIl.printStackTrace();
            return null;
        }
    }

    private static String IlIllllIIl(String IIllIllIIIlIIIl, String llIlIllIIIlIIIl) {
        try {
            SecretKeySpec IlIlIllIIIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIllIIIlIIIl.getBytes(StandardCharsets.UTF_8)), IlIIIIll[10]), "DES");
            Cipher lIIlIllIIIlIIIl = Cipher.getInstance("DES");
            lIIlIllIIIlIIIl.init(IlIIIIll[3], IlIlIllIIIlIIIl);
            return new String(lIIlIllIIIlIIIl.doFinal(Base64.getDecoder().decode(IIllIllIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIlIllIIIlIIIl) {
            IIIlIllIIIlIIIl.printStackTrace();
            return null;
        }
    }

    private static void lIlllllIIl() {
        IlIIIIll = new int[19];
        Main.IlIIIIll[0] = (0xE0 ^ 0xA7) & ~(0x51 ^ 0x16);
        Main.IlIIIIll[1] = -(134 + 151 - 122 + 22 ^ 181 + 142 - 197 + 63);
        Main.IlIIIIll[2] = " ".length();
        Main.IlIIIIll[3] = " ".length() << " ".length();
        Main.IlIIIIll[4] = "   ".length();
        Main.IlIIIIll[5] = " ".length() << (" ".length() << " ".length());
        Main.IlIIIIll[6] = -"  ".length();
        Main.IlIIIIll[7] = 8 ^ 0x4F ^ (0x1D ^ 0x3C) << " ".length();
        Main.IlIIIIll[8] = "   ".length() << " ".length();
        Main.IlIIIIll[9] = (0x2B ^ 0x2E) << (" ".length() << " ".length()) ^ (0x3A ^ 0x29);
        Main.IlIIIIll[10] = " ".length() << "   ".length();
        Main.IlIIIIll[11] = 0xCD ^ 0xC4;
        Main.IlIIIIll[12] = (0x50 ^ 3 ^ (0x72 ^ 0x59) << " ".length()) << " ".length();
        Main.IlIIIIll[13] = 62 + 118 - 145 + 166 ^ (0x48 ^ 0x29) << " ".length();
        Main.IlIIIIll[14] = "   ".length() << (" ".length() << " ".length());
        Main.IlIIIIll[15] = "   ".length() << "   ".length() ^ (0x3B ^ 0x2E);
        Main.IlIIIIll[16] = ((0xB4 ^ 0x93) << " ".length() ^ (0x43 ^ 0xA)) << " ".length();
        Main.IlIIIIll[17] = " ".length() << (0x8F ^ 0x8A) ^ (0xAD ^ 0x82);
        Main.IlIIIIll[18] = " ".length() << (" ".length() << (" ".length() << " ".length()));
    }

    private static boolean IIIIIIIlIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IllllllIIl(int n) {
        return n != 0;
    }

    private static boolean lllllllIIl(int n) {
        return n == 0;
    }
}

