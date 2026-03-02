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
    private static String[] llIIIlll;
    private static int[] IIlIIlll;

    public Main() {
        Main lllIlIlIllllll;
    }

    public static void main(String[] stringArray) {
        int lIllIIlIllllll;
        int llllIIlIllllll;
        int IlllIIlIllllll;
        Scanner lIIIlIlIllllll = new Scanner(System.in);
        int IIIIlIlIllllll = lIIIlIlIllllll.nextInt();
        if (Main.llllllllIl(IIIIlIlIllllll, (IlllIIlIllllll = IIlIIlll[0] * IIIIlIlIllllll - (llllIIlIllllll = lIIIlIlIllllll.nextInt()) / IIlIIlll[0]) + (lIllIIlIllllll = IIIIlIlIllllll - IlllIIlIllllll)) && Main.llllllllIl(llllIIlIllllll, IIlIIlll[0] * IlllIIlIllllll + IIlIIlll[1] * lIllIIlIllllll)) {
            if (!Main.IIIIIIIIll(IlllIIlIllllll) || Main.lIIIIIIIll(lIllIIlIllllll)) {
                System.out.println(llIIIlll[IIlIIlll[2]]);
                "".length();
                if (null != null) {
                    return;
                }
            } else if (Main.IlIIIIIIll(IlllIIlIllllll) && !Main.llIIIIIIll(IlllIIlIllllll, IIlIIlll[3]) || Main.IlIIIIIIll(lIllIIlIllllll) && Main.IIlIIIIIll(lIllIIlIllllll, IIlIIlll[3])) {
                System.out.println(llIIIlll[IIlIIlll[3]]);
                "".length();
                if (" ".length() == ((0x57 ^ 0x12) & ~(0x5F ^ 0x1A))) {
                    return;
                }
            } else if (Main.IIIIIIIIll(IlllIIlIllllll) && Main.IIIIIIIIll(lIllIIlIllllll)) {
                System.out.println(llIIIlll[IIlIIlll[0]]);
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            } else {
                System.out.println(llIIIlll[IIlIIlll[4]]);
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
            }
        } else {
            System.out.println(llIIIlll[IIlIIlll[1]]);
        }
    }

    static {
        Main.IlllllllIl();
        Main.lIllllllIl();
    }

    private static void lIllllllIl() {
        llIIIlll = new String[IIlIIlll[5]];
        Main.llIIIlll[Main.IIlIIlll[2]] = Main.IlIlllllIl("pKWElp/qXvo=", "xrYVu");
        Main.llIIIlll[Main.IIlIIlll[3]] = Main.llIlllllIl("nUkxaBh48aM=", "Sovwi");
        Main.llIIIlll[Main.IIlIIlll[0]] = Main.llIlllllIl("MhamAAic3fM=", "Wgpov");
        Main.llIIIlll[Main.IIlIIlll[4]] = Main.IIllllllIl("Ixo=", "mudeW");
        Main.llIIIlll[Main.IIlIIlll[1]] = Main.IlIlllllIl("4x9sfY9K23A=", "PiDVd");
    }

    private static String IlIlllllIl(String IIIlIIlIllllll, String lllIIIlIllllll) {
        try {
            SecretKeySpec IllIIIlIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIIlIllllll.getBytes(StandardCharsets.UTF_8)), IIlIIlll[6]), "DES");
            Cipher lIlIIIlIllllll = Cipher.getInstance("DES");
            lIlIIIlIllllll.init(IIlIIlll[0], IllIIIlIllllll);
            return new String(lIlIIIlIllllll.doFinal(Base64.getDecoder().decode(IIIlIIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIlIIIlIllllll) {
            IIlIIIlIllllll.printStackTrace();
            return null;
        }
    }

    private static String llIlllllIl(String llIlllIIllllll, String IlIlllIIllllll) {
        try {
            SecretKeySpec lIIlllIIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlIlllIIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IIIlllIIllllll = Cipher.getInstance("Blowfish");
            IIIlllIIllllll.init(IIlIIlll[0], lIIlllIIllllll);
            return new String(IIIlllIIllllll.doFinal(Base64.getDecoder().decode(llIlllIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIllIIllllll) {
            lllIllIIllllll.printStackTrace();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String IIllllllIl(String lIIlIlIIllllll, String IIIlIlIIllllll) {
        lIIlIlIIllllll = new String(Base64.getDecoder().decode(lIIlIlIIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        lllIIlIIllllll = new StringBuilder();
        IllIIlIIllllll = IIIlIlIIllllll.toCharArray();
        lIlIIlIIllllll = Main.IIlIIlll[2];
        llIllIIIllllll = lIIlIlIIllllll.toCharArray();
        IIlllIIIllllll = llIllIIIllllll.length;
        lIlllIIIllllll = Main.IIlIIlll[2];
        "".length();
        if (" ".length() << " ".length() > " ".length()) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            IIlIIlIIllllll = llIllIIIllllll[lIlllIIIllllll];
            lllIIlIIllllll.append((char)(IIlIIlIIllllll ^ IllIIlIIllllll[lIlIIlIIllllll % IllIIlIIllllll.length]));
            "".length();
            ++lIlIIlIIllllll;
            ++lIlllIIIllllll;
lbl19:
            // 2 sources

            ** while (!Main.llIIIIIIll((int)lIlllIIIllllll, (int)IIlllIIIllllll))
        }
lbl20:
        // 1 sources

        return String.valueOf(lllIIlIIllllll);
    }

    private static void IlllllllIl() {
        IIlIIlll = new int[7];
        Main.IIlIIlll[0] = " ".length() << " ".length();
        Main.IIlIIlll[1] = " ".length() << (" ".length() << " ".length());
        Main.IIlIIlll[2] = (0x69 ^ 0x78) & ~(0x53 ^ 0x42);
        Main.IIlIIlll[3] = " ".length();
        Main.IIlIIlll[4] = "   ".length();
        Main.IIlIIlll[5] = 161 + 30 - 3 + 7 ^ (0x28 ^ 0x4B) << " ".length();
        Main.IIlIIlll[6] = " ".length() << "   ".length();
    }

    private static boolean llllllllIl(int n, int n2) {
        return n == n2;
    }

    private static boolean llIIIIIIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIlIIIIIll(int n, int n2) {
        return n < n2;
    }

    private static boolean IIIIIIIIll(int n) {
        return n >= 0;
    }

    private static boolean lIIIIIIIll(int n) {
        return n < 0;
    }

    private static boolean IlIIIIIIll(int n) {
        return n > 0;
    }
}

