/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static String[] lllIIllll;
    private static int[] IIIlIllll;

    public Main() {
        Main lIlllllIIIIIIl;
    }

    public static void main(String[] stringArray) {
        try {
            Scanner IlIllllIIIIIIl = new Scanner(System.in);
            int lIIllllIIIIIIl = Integer.parseInt(IlIllllIIIIIIl.next());
            if (Main.IIlIIIllIll(IIIlIllll[0], lIIllllIIIIIIl) && Main.IIlIIIllIll(lIIllllIIIIIIl, IIIlIllll[1])) {
                System.out.println(IIIlIllll[1]);
                "".length();
                if (((0x52 ^ 0x77) & ~(0x2C ^ 9)) != ((0x6A ^ 0x23) & ~(0x66 ^ 0x2F))) {
                    return;
                }
            } else if (Main.lIlIIIllIll(IIIlIllll[1], lIIllllIIIIIIl) && Main.IIlIIIllIll(lIIllllIIIIIIl, IIIlIllll[2])) {
                System.out.println(IIIlIllll[2]);
                "".length();
                if (" ".length() << " ".length() < 0) {
                    return;
                }
            } else if (Main.lIlIIIllIll(IIIlIllll[2], lIIllllIIIIIIl) && Main.IIlIIIllIll(lIIllllIIIIIIl, IIIlIllll[3])) {
                System.out.println(IIIlIllll[3]);
                "".length();
                if (" ".length() << (" ".length() << " ".length()) <= "   ".length()) {
                    return;
                }
            } else if (Main.lIlIIIllIll(IIIlIllll[3], lIIllllIIIIIIl) && Main.IIlIIIllIll(lIIllllIIIIIIl, IIIlIllll[4])) {
                System.out.println(IIIlIllll[4]);
                "".length();
                if (null != null) {
                    return;
                }
            } else if (Main.lIlIIIllIll(IIIlIllll[4], lIIllllIIIIIIl) && Main.IIlIIIllIll(lIIllllIIIIIIl, IIIlIllll[5])) {
                System.out.println(IIIlIllll[5]);
                "".length();
                if (null != null) {
                    return;
                }
            } else if (Main.lIlIIIllIll(IIIlIllll[5], lIIllllIIIIIIl) && Main.IIlIIIllIll(lIIllllIIIIIIl, IIIlIllll[6])) {
                System.out.println(IIIlIllll[6]);
                "".length();
                if (" ".length() << " ".length() <= -" ".length()) {
                    return;
                }
            } else if (Main.lIlIIIllIll(IIIlIllll[6], lIIllllIIIIIIl) && Main.IIlIIIllIll(lIIllllIIIIIIl, IIIlIllll[7])) {
                System.out.println(IIIlIllll[7]);
                "".length();
                if (-" ".length() > 0) {
                    return;
                }
            } else if (Main.lIlIIIllIll(IIIlIllll[7], lIIllllIIIIIIl) && Main.IIlIIIllIll(lIIllllIIIIIIl, IIIlIllll[8])) {
                System.out.println(IIIlIllll[8]);
                "".length();
                if (" ".length() == ((0x2D ^ 0xE) << " ".length() & ~((0xBD ^ 0x9E) << " ".length()))) {
                    return;
                }
            } else if (Main.lIlIIIllIll(IIIlIllll[8], lIIllllIIIIIIl)) {
                System.out.println(IIIlIllll[9]);
            }
            "".length();
        }
        catch (Exception IlIllllIIIIIIl) {
            System.out.println(lllIIllll[IIIlIllll[10]]);
        }
        if (null != null) {
            return;
        }
    }

    static {
        Main.llIIIIllIll();
        Main.IlIIIIllIll();
    }

    private static void IlIIIIllIll() {
        lllIIllll = new String[IIIlIllll[11]];
        Main.lllIIllll[Main.IIIlIllll[10]] = Main.lIIIIIllIll("RH/dRald0OU=", "mSmWy");
    }

    private static String lIIIIIllIll(String IIlIlllIIIIIIl, String llIIlllIIIIIIl) {
        try {
            SecretKeySpec IlIIlllIIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIlllIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIlllIIIIIIl = Cipher.getInstance("Blowfish");
            lIIIlllIIIIIIl.init(IIIlIllll[12], IlIIlllIIIIIIl);
            return new String(lIIIlllIIIIIIl.doFinal(Base64.getDecoder().decode(IIlIlllIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIIlllIIIIIIl) {
            IIIIlllIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static void llIIIIllIll() {
        IIIlIllll = new int[13];
        Main.IIIlIllll[0] = (0xDC ^ 0xC5) << (" ".length() << " ".length());
        Main.IIIlIllll[1] = 0x49 ^ 0x3E ^ "   ".length() << "   ".length();
        Main.IIIlIllll[2] = ("   ".length() << (0x28 ^ 0x2D) ^ (0x3C ^ 0x33)) << " ".length();
        Main.IIIlIllll[3] = 87 + 54 - -64 + 128;
        Main.IIIlIllll[4] = (167 + 171 - 305 + 208 ^ (0xB ^ 0x44) << " ".length()) << (" ".length() << " ".length());
        Main.IIIlIllll[5] = 50 + 359 - 164 + 310;
        Main.IIIlIllll[6] = 133 + 77 - -72 + 51 << " ".length();
        Main.IIIlIllll[7] = 248 + 587 - 281 + 223;
        Main.IIIlIllll[8] = (0xF3 ^ 0x9C) << "   ".length();
        Main.IIIlIllll[9] = 105 + 117 - 46 + 27 + (123 + 96 - 29 + 13 << " ".length()) - (255 + 204 - 339 + 147 << " ".length()) + (194 + 68 - 237 + 206 << (" ".length() << " ".length()));
        Main.IIIlIllll[10] = (0x86 ^ 0x91) << " ".length() & ~((0xB1 ^ 0xA6) << " ".length());
        Main.IIIlIllll[11] = " ".length();
        Main.IIIlIllll[12] = " ".length() << " ".length();
    }

    private static boolean lIlIIIllIll(int n, int n2) {
        return n < n2;
    }

    private static boolean IIlIIIllIll(int n, int n2) {
        return n <= n2;
    }
}

