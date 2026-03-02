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

class Main {
    private static String[] lIlIIllIll;
    private static int[] IllIIllIll;

    Main() {
        Main lIIIIIIlIlIlIll;
    }

    public static void main(String[] stringArray) {
        Scanner IIlllllIIlIlIll = new Scanner(System.in);
        while (Main.lllllllIIIll(IIlllllIIlIlIll.hasNext() ? 1 : 0)) {
            int IlIllllIIlIlIll;
            int llIllllIIlIlIll = IIlllllIIlIlIll.nextInt();
            int lIIllllIIlIlIll = llIllllIIlIlIll + (IlIllllIIlIlIll = IIlllllIIlIlIll.nextInt());
            if (Main.IIIIIIIlIIll(lIIllllIIlIlIll, IllIIllIll[0])) {
                System.out.println(lIlIIllIll[IllIIllIll[1]]);
            }
            if (Main.IIIIIIIlIIll(lIIllllIIlIlIll, IllIIllIll[2]) && Main.lIIIIIIlIIll(lIIllllIIlIlIll, IllIIllIll[3])) {
                System.out.println(lIlIIllIll[IllIIllIll[4]]);
            }
            if (Main.IIIIIIIlIIll(lIIllllIIlIlIll, IllIIllIll[5]) && Main.lIIIIIIlIIll(lIIllllIIlIlIll, IllIIllIll[6])) {
                System.out.println(lIlIIllIll[IllIIllIll[7]]);
            }
            if (Main.IIIIIIIlIIll(lIIllllIIlIlIll, IllIIllIll[8]) && Main.lIIIIIIlIIll(lIIllllIIlIlIll, IllIIllIll[9])) {
                System.out.println(lIlIIllIll[IllIIllIll[10]]);
            }
            if (Main.IIIIIIIlIIll(lIIllllIIlIlIll, IllIIllIll[11]) && Main.lIIIIIIlIIll(lIIllllIIlIlIll, IllIIllIll[12])) {
                System.out.println(lIlIIllIll[IllIIllIll[13]]);
            }
            if (Main.IIIIIIIlIIll(lIIllllIIlIlIll, IllIIllIll[14]) && Main.lIIIIIIlIIll(lIIllllIIlIlIll, IllIIllIll[15])) {
                System.out.println(lIlIIllIll[IllIIllIll[16]]);
            }
            if (Main.IIIIIIIlIIll(lIIllllIIlIlIll, IllIIllIll[17]) && Main.lIIIIIIlIIll(lIIllllIIlIlIll, IllIIllIll[18])) {
                System.out.println(lIlIIllIll[IllIIllIll[19]]);
            }
            "".length();
            if ("   ".length() >= 0) continue;
            return;
        }
    }

    static {
        Main.IllllllIIIll();
        Main.lIlllllIIIll();
    }

    private static void lIlllllIIIll() {
        lIlIIllIll = new String[IllIIllIll[20]];
        Main.lIlIIllIll[Main.IllIIllIll[1]] = Main.lIIllllIIIll("w8FXCBN+8q0=", "BkAkK");
        Main.lIlIIllIll[Main.IllIIllIll[4]] = Main.IlIllllIIIll("ZPHDTPKFG+U=", "yEpGH");
        Main.lIlIIllIll[Main.IllIIllIll[7]] = Main.IlIllllIIIll("VFZNHKXH1es=", "OvIWe");
        Main.lIlIIllIll[Main.IllIIllIll[10]] = Main.IIlllllIIIll("Rw==", "sbwzy");
        Main.lIlIIllIll[Main.IllIIllIll[13]] = Main.IlIllllIIIll("zyOk8b0Yi0o=", "YmNVD");
        Main.lIlIIllIll[Main.IllIIllIll[16]] = Main.lIIllllIIIll("PD8D243N5wE=", "ekaQU");
        Main.lIlIIllIll[Main.IllIIllIll[19]] = Main.lIIllllIIIll("7k1MdfswOFs=", "sjSuR");
    }

    private static String lIIllllIIIll(String IIlIlllIIlIlIll, String llIIlllIIlIlIll) {
        try {
            SecretKeySpec IlIIlllIIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlllIIlIlIll.getBytes(StandardCharsets.UTF_8)), IllIIllIll[21]), "DES");
            Cipher lIIIlllIIlIlIll = Cipher.getInstance("DES");
            lIIIlllIIlIlIll.init(IllIIllIll[7], IlIIlllIIlIlIll);
            return new String(lIIIlllIIlIlIll.doFinal(Base64.getDecoder().decode(IIlIlllIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIIlllIIlIlIll) {
            IIIIlllIIlIlIll.printStackTrace();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String IIlllllIIIll(String IlIIIllIIlIlIll, String lIIIIllIIlIlIll) {
        IlIIIllIIlIlIll = new String(Base64.getDecoder().decode(IlIIIllIIlIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        IIIIIllIIlIlIll = new StringBuilder();
        lllllIlIIlIlIll = lIIIIllIIlIlIll.toCharArray();
        IllllIlIIlIlIll = Main.IllIIllIll[1];
        IIlIlIlIIlIlIll = IlIIIllIIlIlIll.toCharArray();
        lIlIlIlIIlIlIll = IIlIlIlIIlIlIll.length;
        IllIlIlIIlIlIll = Main.IllIIllIll[1];
        "".length();
        if ("   ".length() > 0) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            lIlllIlIIlIlIll = IIlIlIlIIlIlIll[IllIlIlIIlIlIll];
            IIIIIllIIlIlIll.append((char)(lIlllIlIIlIlIll ^ lllllIlIIlIlIll[IllllIlIIlIlIll % lllllIlIIlIlIll.length]));
            "".length();
            ++IllllIlIIlIlIll;
            ++IllIlIlIIlIlIll;
lbl19:
            // 2 sources

            ** while (!Main.IlIIIIIlIIll((int)IllIlIlIIlIlIll, (int)lIlIlIlIIlIlIll))
        }
lbl20:
        // 1 sources

        return String.valueOf(IIIIIllIIlIlIll);
    }

    private static String IlIllllIIIll(String llllIIlIIlIlIll, String IlllIIlIIlIlIll) {
        try {
            SecretKeySpec lIllIIlIIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlllIIlIIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IIllIIlIIlIlIll = Cipher.getInstance("Blowfish");
            IIllIIlIIlIlIll.init(IllIIllIll[7], lIllIIlIIlIlIll);
            return new String(IIllIIlIIlIlIll.doFinal(Base64.getDecoder().decode(llllIIlIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIIlIIlIlIll) {
            llIlIIlIIlIlIll.printStackTrace();
            return null;
        }
    }

    private static void IllllllIIIll() {
        IllIIllIll = new int[22];
        Main.IllIIllIll[0] = ((0x32 ^ 0x77) << " ".length() ^ 112 + 60 - 31 + 2) << " ".length();
        Main.IllIIllIll[1] = ("   ".length() << (" ".length() << " ".length()) ^ (0x27 ^ 0x18)) & ((0xD4 ^ 0x9D) << " ".length() ^ 77 + 156 - 163 + 91 ^ -" ".length());
        Main.IllIIllIll[2] = (0x75 ^ 0x6C) << (" ".length() << " ".length());
        Main.IllIIllIll[3] = 0x23 ^ 0x2A;
        Main.IllIIllIll[4] = " ".length();
        Main.IllIIllIll[5] = ((0x11 ^ 0xC) << " ".length() ^ (0x23 ^ 0x64)) << "   ".length();
        Main.IllIIllIll[6] = 0x51 ^ 0x4E ^ (0x3C ^ 0x23) << (" ".length() << " ".length());
        Main.IllIIllIll[7] = " ".length() << " ".length();
        Main.IllIIllIll[8] = 53 + 57 - 82 + 333 + (65 + 54 - -100 + 18 << " ".length()) - (136 + 112 - 206 + 185) + (0xD5 ^ 0xC4) << (" ".length() << (" ".length() << " ".length()));
        Main.IllIIllIll[9] = 100 + 141 - -139 + 619;
        Main.IllIIllIll[10] = "   ".length();
        Main.IllIIllIll[11] = 965 + 1991 - 1119 + 1288 << (0x9B ^ 0x9E);
        Main.IllIIllIll[12] = 4511 + 5839 - 5415 + 5064;
        Main.IllIIllIll[13] = " ".length() << (" ".length() << " ".length());
        Main.IllIIllIll[14] = 1248 + 275 - -6225 + 7877 << ("   ".length() << " ".length());
        Main.IllIIllIll[15] = 43815 + 46653 - 42395 + 10422 + (19186 + 4359 - 22641 + 33195 << " ".length()) - (6057 + 679 - 1970 + 10221 << "   ".length()) + (11274 + 2408 - 13439 + 46358 << " ".length());
        Main.IllIIllIll[16] = 0x2D ^ 0x28;
        Main.IllIIllIll[17] = 38817 + 38140 - 40951 + 42119 << (0x69 ^ 0x6E);
        Main.IllIIllIll[18] = 418429 + 356136 - 379421 + 604855;
        Main.IllIIllIll[19] = "   ".length() << " ".length();
        Main.IllIIllIll[20] = 0xA8 ^ 0xB9 ^ (0x2B ^ 0x20) << " ".length();
        Main.IllIIllIll[21] = " ".length() << "   ".length();
    }

    private static boolean IlIIIIIlIIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIIIIIIlIIll(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIIIIIlIIll(int n, int n2) {
        return n > n2;
    }

    private static boolean lllllllIIIll(int n) {
        return n != 0;
    }
}

