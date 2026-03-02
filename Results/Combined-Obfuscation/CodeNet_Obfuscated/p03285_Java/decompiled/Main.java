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
    private static String[] llllIlll;
    private static int[] IIIIllll;

    public Main() {
        Main IIllIlIIIlllll;
    }

    public static void main(String[] stringArray) {
        String string;
        Scanner IIIlIlIIIlllll = new Scanner(System.in);
        int lllIIlIIIlllll = IIIlIlIIIlllll.nextInt();
        int IllIIlIIIlllll = IIIIllll[0];
        if (Main.IlllIlIIll(lllIIlIIIlllll, IIIIllll[1]) && Main.llllIlIIll(lllIIlIIIlllll, IIIIllll[2]) && Main.llllIlIIll(lllIIlIIIlllll, IIIIllll[3]) && Main.llllIlIIll(lllIIlIIIlllll, IIIIllll[4])) {
            if (Main.IIIIllIIll(lllIIlIIIlllll, IIIIllll[5])) {
                "".length();
                if (null != null) {
                    return;
                }
            } else if (Main.lIIIllIIll(lllIIlIIIlllll % IIIIllll[6])) {
                IllIIlIIIlllll = IIIIllll[7];
                "".length();
                if (" ".length() >= " ".length() << " ".length()) {
                    return;
                }
            } else if (Main.lIIIllIIll(lllIIlIIIlllll % IIIIllll[8])) {
                IllIIlIIIlllll = IIIIllll[7];
                "".length();
                if ("   ".length() == " ".length() << " ".length()) {
                    return;
                }
            } else if (Main.lIIIllIIll(lllIIlIIIlllll % IIIIllll[6] % IIIIllll[8])) {
                IllIIlIIIlllll = IIIIllll[7];
                "".length();
                if (-" ".length() == " ".length() << (" ".length() << " ".length())) {
                    return;
                }
            } else if (!Main.IlIIllIIll(lllIIlIIIlllll % IIIIllll[9] % IIIIllll[6]) || Main.lIIIllIIll(lllIIlIIIlllll % IIIIllll[10] % IIIIllll[8])) {
                IllIIlIIIlllll = IIIIllll[7];
                "".length();
                if (" ".length() << " ".length() >= " ".length() << (" ".length() << " ".length())) {
                    return;
                }
            } else if (!Main.IlIIllIIll(lllIIlIIIlllll % IIIIllll[11] % IIIIllll[6]) || Main.lIIIllIIll(lllIIlIIIlllll % IIIIllll[12] % IIIIllll[8])) {
                IllIIlIIIlllll = IIIIllll[7];
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            } else if (!Main.IlIIllIIll(lllIIlIIIlllll % IIIIllll[13] % IIIIllll[6]) || !Main.IlIIllIIll(lllIIlIIIlllll % IIIIllll[14] % IIIIllll[6]) || Main.lIIIllIIll(lllIIlIIIlllll % IIIIllll[15] % IIIIllll[6])) {
                IllIIlIIIlllll = IIIIllll[7];
            }
        }
        if (Main.IlIIllIIll(IllIIlIIIlllll)) {
            string = llllIlll[IIIIllll[0]];
            "".length();
            if (" ".length() == 0) {
                return;
            }
        } else {
            string = llllIlll[IIIIllll[7]];
        }
        System.out.println(string);
        IIIlIlIIIlllll.close();
    }

    static {
        Main.lIllIlIIll();
        Main.IIllIlIIll();
    }

    private static void IIllIlIIll() {
        llllIlll = new String[IIIIllll[16]];
        Main.llllIlll[Main.IIIIllll[0]] = Main.IlIlIlIIll("NjEa", "oTite");
        Main.llllIlll[Main.IIIIllll[7]] = Main.llIlIlIIll("nIJdHjtZ6pI=", "myrBz");
    }

    private static String llIlIlIIll(String lIIIIlIIIlllll, String IIIIIlIIIlllll) {
        try {
            SecretKeySpec lllllIIIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIIIIlIIIlllll.getBytes(StandardCharsets.UTF_8)), IIIIllll[9]), "DES");
            Cipher IllllIIIIlllll = Cipher.getInstance("DES");
            IllllIIIIlllll.init(IIIIllll[16], lllllIIIIlllll);
            return new String(IllllIIIIlllll.doFinal(Base64.getDecoder().decode(lIIIIlIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllIIIIlllll) {
            lIlllIIIIlllll.printStackTrace();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String IlIlIlIIll(String llllIIIIIlllll, String IlllIIIIIlllll) {
        llllIIIIIlllll = new String(Base64.getDecoder().decode(llllIIIIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        lIllIIIIIlllll = new StringBuilder();
        IIllIIIIIlllll = IlllIIIIIlllll.toCharArray();
        llIlIIIIIlllll = Main.IIIIllll[0];
        lIIIIIIIIlllll = llllIIIIIlllll.toCharArray();
        IlIIIIIIIlllll = lIIIIIIIIlllll.length;
        llIIIIIIIlllll = Main.IIIIllll[0];
        "".length();
        if (" ".length() << (" ".length() << " ".length()) > -" ".length()) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            IlIlIIIIIlllll = lIIIIIIIIlllll[llIIIIIIIlllll];
            lIllIIIIIlllll.append((char)(IlIlIIIIIlllll ^ IIllIIIIIlllll[llIlIIIIIlllll % IIllIIIIIlllll.length]));
            "".length();
            ++llIlIIIIIlllll;
            ++llIIIIIIIlllll;
lbl19:
            // 2 sources

            ** while (!Main.llIIllIIll((int)llIIIIIIIlllll, (int)IlIIIIIIIlllll))
        }
lbl20:
        // 1 sources

        return String.valueOf(lIllIIIIIlllll);
    }

    private static void lIllIlIIll() {
        IIIIllll = new int[17];
        Main.IIIIllll[0] = (0xA4 ^ 0x95) & ~(0x94 ^ 0xA5) & ~((0xFE ^ 0xA5) & ~(0x2B ^ 0x70));
        Main.IIIIllll[1] = "   ".length();
        Main.IIIIllll[2] = (0x3C ^ 0x1F) << " ".length() ^ (0xF8 ^ 0xBB);
        Main.IIIIllll[3] = "   ".length() << " ".length();
        Main.IIIIllll[4] = 0xAF ^ 0xA6;
        Main.IIIIllll[5] = (0 + 157 - 132 + 140 ^ (0x7E ^ 0x7B) << (0x52 ^ 0x57)) << " ".length();
        Main.IIIIllll[6] = 0xC5 ^ 0xAC ^ (0x92 ^ 0xA5) << " ".length();
        Main.IIIIllll[7] = " ".length();
        Main.IIIIllll[8] = " ".length() << (" ".length() << " ".length());
        Main.IIIIllll[9] = " ".length() << "   ".length();
        Main.IIIIllll[10] = (0xA8 ^ 0xAF) << " ".length();
        Main.IIIIllll[11] = "   ".length() << (" ".length() << " ".length());
        Main.IIIIllll[12] = 0xB0 ^ 0xA5;
        Main.IIIIllll[13] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        Main.IIIIllll[14] = (0x9C ^ 0x99) << (" ".length() << " ".length());
        Main.IIIIllll[15] = "   ".length() << "   ".length();
        Main.IIIIllll[16] = " ".length() << " ".length();
    }

    private static boolean IIIIllIIll(int n, int n2) {
        return n == n2;
    }

    private static boolean llIIllIIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean IlllIlIIll(int n, int n2) {
        return n > n2;
    }

    private static boolean IlIIllIIll(int n) {
        return n != 0;
    }

    private static boolean lIIIllIIll(int n) {
        return n == 0;
    }

    private static boolean llllIlIIll(int n, int n2) {
        return n != n2;
    }
}

