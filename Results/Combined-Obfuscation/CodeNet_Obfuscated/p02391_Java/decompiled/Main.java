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
    private static String[] IllllIlIl;
    private static int[] lllllIlIl;

    public Main() {
        Main IlIllIIllIIIll;
    }

    public static void main(String[] stringArray) {
        Scanner IllIlIIllIIIll = new Scanner(System.in);
        int lIlIlIIllIIIll = IllIlIIllIIIll.nextInt();
        int IIlIlIIllIIIll = IllIlIIllIIIll.nextInt();
        if (Main.IIllllIlIIl(lllllIlIl[0], lIlIlIIllIIIll) && Main.IIllllIlIIl(lIlIlIIllIIIll, lllllIlIl[1]) && Main.IIllllIlIIl(lllllIlIl[0], IIlIlIIllIIIll) && Main.IIllllIlIIl(IIlIlIIllIIIll, lllllIlIl[1]) && Main.lIllllIlIIl(lIlIlIIllIIIll, IIlIlIIllIIIll)) {
            System.out.println(IllllIlIl[lllllIlIl[2]]);
            "".length();
            if (" ".length() >= "   ".length()) {
                return;
            }
        } else if (Main.IIllllIlIIl(lllllIlIl[0], lIlIlIIllIIIll) && Main.IIllllIlIIl(lIlIlIIllIIIll, lllllIlIl[1]) && Main.IIllllIlIIl(lllllIlIl[0], IIlIlIIllIIIll) && Main.IIllllIlIIl(IIlIlIIllIIIll, lllllIlIl[1]) && Main.IlllllIlIIl(lIlIlIIllIIIll, IIlIlIIllIIIll)) {
            System.out.println(IllllIlIl[lllllIlIl[3]]);
            "".length();
            if (-" ".length() > "   ".length()) {
                return;
            }
        } else if (Main.IIllllIlIIl(lllllIlIl[0], lIlIlIIllIIIll) && Main.IIllllIlIIl(lIlIlIIllIIIll, lllllIlIl[1]) && Main.IIllllIlIIl(lllllIlIl[0], IIlIlIIllIIIll) && Main.IIllllIlIIl(IIlIlIIllIIIll, lllllIlIl[1]) && Main.llllllIlIIl(lIlIlIIllIIIll, IIlIlIIllIIIll)) {
            System.out.println(IllllIlIl[lllllIlIl[4]]);
            "".length();
            if (null != null) {
                return;
            }
        } else {
            System.out.println(IllllIlIl[lllllIlIl[5]]);
        }
    }

    static {
        Main.llIlllIlIIl();
        Main.IlIlllIlIIl();
    }

    private static void IlIlllIlIIl() {
        IllllIlIl = new String[lllllIlIl[6]];
        Main.IllllIlIl[Main.lllllIlIl[2]] = Main.lllIllIlIIl("OWtyWjs=", "XKNzY");
        Main.IllllIlIl[Main.lllllIlIl[3]] = Main.IIIlllIlIIl("lLIklxdy/1o=", "WIHwq");
        Main.IllllIlIl[Main.lllllIlIl[4]] = Main.lllIllIlIIl("KmdbR2Ip", "KGfzB");
        Main.IllllIlIl[Main.lllllIlIl[5]] = Main.lIIlllIlIIl("IVb1vTj6eVnvxGtyY/RjjBWmpVG8mrGvhf48/bgX5nNB67ni5Y87XnHBOExWuB/x", "aLCES");
    }

    private static String IIIlllIlIIl(String llllIIIllIIIll, String IlllIIIllIIIll) {
        try {
            SecretKeySpec lIllIIIllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlllIIIllIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IIllIIIllIIIll = Cipher.getInstance("Blowfish");
            IIllIIIllIIIll.init(lllllIlIl[4], lIllIIIllIIIll);
            return new String(IIllIIIllIIIll.doFinal(Base64.getDecoder().decode(llllIIIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIIIllIIIll) {
            llIlIIIllIIIll.printStackTrace();
            return null;
        }
    }

    private static String lIIlllIlIIl(String IlIIIIIllIIIll, String lIIIIIIllIIIll) {
        try {
            SecretKeySpec IIIIIIIllIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIIIllIIIll.getBytes(StandardCharsets.UTF_8)), lllllIlIl[7]), "DES");
            Cipher lllllllIlIIIll = Cipher.getInstance("DES");
            lllllllIlIIIll.init(lllllIlIl[4], IIIIIIIllIIIll);
            return new String(lllllllIlIIIll.doFinal(Base64.getDecoder().decode(IlIIIIIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllllllIlIIIll) {
            IllllllIlIIIll.printStackTrace();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String lllIllIlIIl(String IIIIlllIlIIIll, String llllIllIlIIIll) {
        IIIIlllIlIIIll = new String(Base64.getDecoder().decode(IIIIlllIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        IlllIllIlIIIll = new StringBuilder();
        lIllIllIlIIIll = llllIllIlIIIll.toCharArray();
        IIllIllIlIIIll = Main.lllllIlIl[2];
        IlIIIllIlIIIll = IIIIlllIlIIIll.toCharArray();
        llIIIllIlIIIll = IlIIIllIlIIIll.length;
        IIlIIllIlIIIll = Main.lllllIlIl[2];
        "".length();
        if (" ".length() << " ".length() > " ".length()) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            llIlIllIlIIIll = IlIIIllIlIIIll[IIlIIllIlIIIll];
            IlllIllIlIIIll.append((char)(llIlIllIlIIIll ^ lIllIllIlIIIll[IIllIllIlIIIll % lIllIllIlIIIll.length]));
            "".length();
            ++IIllIllIlIIIll;
            ++IIlIIllIlIIIll;
lbl19:
            // 2 sources

            ** while (!Main.IIIIIIllIIl((int)IIlIIllIlIIIll, (int)llIIIllIlIIIll))
        }
lbl20:
        // 1 sources

        return String.valueOf(IlllIllIlIIIll);
    }

    private static void llIlllIlIIl() {
        lllllIlIl = new int[8];
        Main.lllllIlIl[0] = -(968 + 333 - 648 + 347);
        Main.lllllIlIl[1] = (0xFA ^ 0x87) << "   ".length();
        Main.lllllIlIl[2] = (0xEB ^ 0xAC) & ~(0x25 ^ 0x62);
        Main.lllllIlIl[3] = " ".length();
        Main.lllllIlIl[4] = " ".length() << " ".length();
        Main.lllllIlIl[5] = "   ".length();
        Main.lllllIlIl[6] = " ".length() << (" ".length() << " ".length());
        Main.lllllIlIl[7] = " ".length() << "   ".length();
    }

    private static boolean llllllIlIIl(int n, int n2) {
        return n == n2;
    }

    private static boolean IIIIIIllIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIllllIlIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IIllllIlIIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean IlllllIlIIl(int n, int n2) {
        return n > n2;
    }
}

