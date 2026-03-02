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
    private static String[] lIIIIIIIll;
    private static int[] IlIIIIIIll;

    Main() {
        Main llIIllIIllIllll;
    }

    public static void main(String[] stringArray) {
        Scanner llllIlIIllIllll = new Scanner(System.in);
        String IlllIlIIllIllll = llllIlIIllIllll.next();
        int lIllIlIIllIllll = Integer.parseInt(IlllIlIIllIllll);
        if (Main.IlIllIllIlIl(IlIIIIIIll[0], lIllIlIIllIllll) && Main.IlIllIllIlIl(lIllIlIIllIllll, IlIIIIIIll[1])) {
            if (!(Main.llIllIllIlIl(lIllIlIIllIllll, IlIIIIIIll[2]) && Main.llIllIllIlIl(lIllIlIIllIllll, IlIIIIIIll[3]) && Main.llIllIllIlIl(lIllIlIIllIllll, IlIIIIIIll[4]) && Main.llIllIllIlIl(lIllIlIIllIllll, IlIIIIIIll[5]) && !Main.IIlllIllIlIl(lIllIlIIllIllll, IlIIIIIIll[6]))) {
                System.out.println(lIIIIIIIll[IlIIIIIIll[0]]);
            }
            if (!Main.llIllIllIlIl(lIllIlIIllIllll, IlIIIIIIll[7]) || !Main.llIllIllIlIl(lIllIlIIllIllll, IlIIIIIIll[8]) || Main.IIlllIllIlIl(lIllIlIIllIllll, IlIIIIIIll[9])) {
                System.out.println(lIIIIIIIll[IlIIIIIIll[7]]);
            }
            if (Main.IIlllIllIlIl(lIllIlIIllIllll, IlIIIIIIll[10])) {
                System.out.println(lIIIIIIIll[IlIIIIIIll[2]]);
            }
        }
        if (Main.lIlllIllIlIl(IlIIIIIIll[1], lIllIlIIllIllll) && Main.IlIllIllIlIl(lIllIlIIllIllll, IlIIIIIIll[11])) {
            if (!(Main.llIllIllIlIl(IlllIlIIllIllll.charAt(IlIIIIIIll[7]), IlIIIIIIll[12]) && Main.llIllIllIlIl(IlllIlIIllIllll.charAt(IlIIIIIIll[7]), IlIIIIIIll[13]) && Main.llIllIllIlIl(IlllIlIIllIllll.charAt(IlIIIIIIll[7]), IlIIIIIIll[14]) && Main.llIllIllIlIl(IlllIlIIllIllll.charAt(IlIIIIIIll[7]), IlIIIIIIll[15]) && !Main.IIlllIllIlIl(IlllIlIIllIllll.charAt(IlIIIIIIll[7]), IlIIIIIIll[16]))) {
                System.out.println(lIIIIIIIll[IlIIIIIIll[10]]);
            }
            if (!Main.llIllIllIlIl(IlllIlIIllIllll.charAt(IlIIIIIIll[7]), IlIIIIIIll[17]) || !Main.llIllIllIlIl(IlllIlIIllIllll.charAt(IlIIIIIIll[7]), IlIIIIIIll[18]) || !Main.llIllIllIlIl(IlllIlIIllIllll.charAt(IlIIIIIIll[7]), IlIIIIIIll[19]) || Main.IIlllIllIlIl(IlllIlIIllIllll.charAt(IlIIIIIIll[7]), IlIIIIIIll[20])) {
                System.out.println(lIIIIIIIll[IlIIIIIIll[3]]);
            }
            if (Main.IIlllIllIlIl(IlllIlIIllIllll.charAt(IlIIIIIIll[7]), IlIIIIIIll[21])) {
                System.out.println(lIIIIIIIll[IlIIIIIIll[4]]);
            }
        }
        if (Main.lIlllIllIlIl(IlIIIIIIll[11], lIllIlIIllIllll) && Main.IlIllIllIlIl(lIllIlIIllIllll, IlIIIIIIll[22])) {
            if (!(Main.llIllIllIlIl(IlllIlIIllIllll.charAt(IlIIIIIIll[2]), IlIIIIIIll[12]) && Main.llIllIllIlIl(IlllIlIIllIllll.charAt(IlIIIIIIll[2]), IlIIIIIIll[13]) && Main.llIllIllIlIl(IlllIlIIllIllll.charAt(IlIIIIIIll[2]), IlIIIIIIll[14]) && Main.llIllIllIlIl(IlllIlIIllIllll.charAt(IlIIIIIIll[2]), IlIIIIIIll[15]) && !Main.IIlllIllIlIl(IlllIlIIllIllll.charAt(IlIIIIIIll[2]), IlIIIIIIll[16]))) {
                System.out.println(lIIIIIIIll[IlIIIIIIll[8]]);
            }
            if (!Main.llIllIllIlIl(IlllIlIIllIllll.charAt(IlIIIIIIll[2]), IlIIIIIIll[17]) || !Main.llIllIllIlIl(IlllIlIIllIllll.charAt(IlIIIIIIll[2]), IlIIIIIIll[18]) || !Main.llIllIllIlIl(IlllIlIIllIllll.charAt(IlIIIIIIll[2]), IlIIIIIIll[19]) || Main.IIlllIllIlIl(IlllIlIIllIllll.charAt(IlIIIIIIll[2]), IlIIIIIIll[20])) {
                System.out.println(lIIIIIIIll[IlIIIIIIll[5]]);
            }
            if (Main.IIlllIllIlIl(IlllIlIIllIllll.charAt(IlIIIIIIll[2]), IlIIIIIIll[21])) {
                System.out.println(lIIIIIIIll[IlIIIIIIll[9]]);
            }
        }
        llllIlIIllIllll.close();
    }

    static {
        Main.lIIllIllIlIl();
        Main.IIIllIllIlIl();
    }

    private static void IIIllIllIlIl() {
        lIIIIIIIll = new String[IlIIIIIIll[6]];
        Main.lIIIIIIIll[Main.IlIIIIIIll[0]] = Main.lIlIlIllIlIl("5konxh2BFGs=", "ivYYr");
        Main.lIIIIIIIll[Main.IlIIIIIIll[7]] = Main.IllIlIllIlIl("GzF/4ahTg/4=", "MsCmq");
        Main.lIIIIIIIll[Main.IlIIIIIIll[2]] = Main.lllIlIllIlIl("CTUD", "kZmMx");
        Main.lIIIIIIIll[Main.IlIIIIIIll[10]] = Main.lllIlIllIlIl("Kxsk", "CtJdY");
        Main.lIIIIIIIll[Main.IlIIIIIIll[3]] = Main.IllIlIllIlIl("Q7G+q5MHDBA=", "TmjHZ");
        Main.lIIIIIIIll[Main.IlIIIIIIll[4]] = Main.lIlIlIllIlIl("FcivQqTRNps=", "IuSve");
        Main.lIIIIIIIll[Main.IlIIIIIIll[8]] = Main.IllIlIllIlIl("LDRwihMeRkc=", "zYqWz");
        Main.lIIIIIIIll[Main.IlIIIIIIll[5]] = Main.IllIlIllIlIl("B0De44XArNA=", "kZBED");
        Main.lIIIIIIIll[Main.IlIIIIIIll[9]] = Main.IllIlIllIlIl("tmOfc++/xSQ=", "OKJuf");
    }

    private static String IllIlIllIlIl(String IIIlIlIIllIllll, String lllIIlIIllIllll) {
        try {
            SecretKeySpec IllIIlIIllIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIlIIllIllll.getBytes(StandardCharsets.UTF_8)), IlIIIIIIll[9]), "DES");
            Cipher lIlIIlIIllIllll = Cipher.getInstance("DES");
            lIlIIlIIllIllll.init(IlIIIIIIll[2], IllIIlIIllIllll);
            return new String(lIlIIlIIllIllll.doFinal(Base64.getDecoder().decode(IIIlIlIIllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIlIIlIIllIllll) {
            IIlIIlIIllIllll.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lllIlIllIlIl(String IllIlIIIllIllll, String lIlIlIIIllIllll) {
        IllIlIIIllIllll = new String(Base64.getDecoder().decode(IllIlIIIllIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder IIlIlIIIllIllll = new StringBuilder();
        char[] llIIlIIIllIllll = lIlIlIIIllIllll.toCharArray();
        int IlIIlIIIllIllll = IlIIIIIIll[0];
        char[] IIIlIIIIllIllll = IllIlIIIllIllll.toCharArray();
        int lIIlIIIIllIllll = IIIlIIIIllIllll.length;
        int IlIlIIIIllIllll = IlIIIIIIll[0];
        "".length();
        while (!Main.IllllIllIlIl(IlIlIIIIllIllll, lIIlIIIIllIllll)) {
            char lIIIlIIIllIllll = IIIlIIIIllIllll[IlIlIIIIllIllll];
            IIlIlIIIllIllll.append((char)(lIIIlIIIllIllll ^ llIIlIIIllIllll[IlIIlIIIllIllll % llIIlIIIllIllll.length]));
            "".length();
            ++IlIIlIIIllIllll;
            ++IlIlIIIIllIllll;
        }
        return String.valueOf(IIlIlIIIllIllll);
    }

    private static String lIlIlIllIlIl(String llIIIIIIllIllll, String IlIIIIIIllIllll) {
        try {
            SecretKeySpec lIIIIIIIllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlIIIIIIllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IIIIIIIIllIllll = Cipher.getInstance("Blowfish");
            IIIIIIIIllIllll.init(IlIIIIIIll[2], lIIIIIIIllIllll);
            return new String(IIIIIIIIllIllll.doFinal(Base64.getDecoder().decode(llIIIIIIllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllIlIllll) {
            llllllllIlIllll.printStackTrace();
            return null;
        }
    }

    private static void lIIllIllIlIl() {
        IlIIIIIIll = new int[23];
        Main.IlIIIIIIll[0] = (3 + 80 - 61 + 133 ^ "   ".length() << ("   ".length() << " ".length())) & (98 + 133 - 103 + 109 ^ (0x40 ^ 0x1B) << " ".length() ^ -" ".length());
        Main.IlIIIIIIll[1] = ((0x38 ^ 0x1B) << (" ".length() << " ".length()) ^ 78 + 91 - 147 + 115) << " ".length();
        Main.IlIIIIIIll[2] = " ".length() << " ".length();
        Main.IlIIIIIIll[3] = " ".length() << (" ".length() << " ".length());
        Main.IlIIIIIIll[4] = 0x18 ^ 0x1D;
        Main.IlIIIIIIll[5] = (0x28 ^ 0x31) << (" ".length() << " ".length()) ^ (0xA ^ 0x69);
        Main.IlIIIIIIll[6] = 141 + 70 - 52 + 48 ^ (0x4B ^ 0x28) << " ".length();
        Main.IlIIIIIIll[7] = " ".length();
        Main.IlIIIIIIll[8] = "   ".length() << " ".length();
        Main.IlIIIIIIll[9] = " ".length() << "   ".length();
        Main.IlIIIIIIll[10] = "   ".length();
        Main.IlIIIIIIll[11] = (0xA1 ^ 0xB8) << (" ".length() << " ".length());
        Main.IlIIIIIIll[12] = (0xD0 ^ 0x85 ^ (0xA5 ^ 0xB6) << (" ".length() << " ".length())) << " ".length();
        Main.IlIIIIIIll[13] = (0x3D ^ 0x30) << (" ".length() << " ".length());
        Main.IlIIIIIIll[14] = 0x2A ^ 0x1F;
        Main.IlIIIIIIll[15] = 0x3E ^ 9;
        Main.IlIIIIIIll[16] = (0x57 ^ 0x44) << "   ".length() ^ 49 + 39 - 61 + 134;
        Main.IlIIIIIIll[17] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        Main.IlIIIIIIll[18] = 0x77 ^ 0x46;
        Main.IlIIIIIIll[19] = (0x94 ^ 0x8F) << " ".length();
        Main.IlIIIIIIll[20] = (0xA6 ^ 0xA1) << "   ".length();
        Main.IlIIIIIIll[21] = 0 ^ 0x33;
        Main.IlIIIIIIll[22] = (0x6B ^ 0x16) << "   ".length();
    }

    private static boolean IIlllIllIlIl(int n, int n2) {
        return n == n2;
    }

    private static boolean IllllIllIlIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IlIllIllIlIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lIlllIllIlIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean llIllIllIlIl(int n, int n2) {
        return n != n2;
    }
}

