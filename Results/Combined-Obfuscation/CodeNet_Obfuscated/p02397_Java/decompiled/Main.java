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
    private static String[] lIlIIll;
    private static int[] IllIIll;

    Main() {
        Main IIIlllIIIlllIIl;
    }

    public static void main(String[] stringArray) {
        try {
            BufferedReader IIIIllIIIlllIIl = new BufferedReader(new InputStreamReader(System.in));
            int llllIlIIIlllIIl = IllIIll[0];
            int IlllIlIIIlllIIl = IllIIll[0];
            int lIllIlIIIlllIIl = IllIIll[0];
            int IIllIlIIIlllIIl = IllIIll[0];
            while (Main.llIllIlIl(IIllIlIIIlllIIl)) {
                String llIlIlIIIlllIIl = IIIIllIIIlllIIl.readLine();
                String[] IlIlIlIIIlllIIl = llIlIlIIIlllIIl.split(lIlIIll[IllIIll[0]]);
                llllIlIIIlllIIl = Integer.parseInt(IlIlIlIIIlllIIl[IllIIll[0]]);
                IlllIlIIIlllIIl = Integer.parseInt(IlIlIlIIIlllIIl[IllIIll[1]]);
                if (Main.IIlllIlIl(llllIlIIIlllIIl) && !Main.lIlllIlIl(IlllIlIIIlllIIl, IllIIll[2]) || Main.llIllIlIl(llllIlIIIlllIIl) && !Main.IllllIlIl(IlllIlIIIlllIIl) || Main.lllllIlIl(lIllIlIIIlllIIl, IllIIll[3])) {
                    IIllIlIIIlllIIl = IllIIll[1];
                    "".length();
                    if (" ".length() != " ".length()) {
                        return;
                    }
                } else if (!Main.lIlllIlIl(llllIlIIIlllIIl, IlllIlIIIlllIIl) || Main.IIIIIllIl(llllIlIIIlllIIl, IlllIlIIIlllIIl)) {
                    System.out.println(IlllIlIIIlllIIl + " " + llllIlIIIlllIIl);
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) <= 0) {
                        return;
                    }
                } else if (Main.lIIIIllIl(llllIlIIIlllIIl, IlllIlIIIlllIIl)) {
                    System.out.println(llllIlIIIlllIIl + " " + IlllIlIIIlllIIl);
                }
                ++lIllIlIIIlllIIl;
                "".length();
                if (" ".length() << (" ".length() << " ".length()) >= 0) continue;
                return;
            }
            "".length();
        }
        catch (Exception IIIIllIIIlllIIl) {
            System.out.println(IIIIllIIIlllIIl);
        }
        if (" ".length() << (" ".length() << " ".length()) <= "   ".length()) {
            return;
        }
    }

    static {
        Main.IlIllIlIl();
        Main.lIIllIlIl();
    }

    private static void lIIllIlIl() {
        lIlIIll = new String[IllIIll[1]];
        Main.lIlIIll[Main.IllIIll[0]] = Main.IIIllIlIl("i7MEevmV7gk=", "UkiuR");
    }

    private static String IIIllIlIl(String lIlIIlIIIlllIIl, String IIlIIlIIIlllIIl) {
        try {
            SecretKeySpec llIIIlIIIlllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIlIIlIIIlllIIl.getBytes(StandardCharsets.UTF_8)), IllIIll[4]), "DES");
            Cipher IlIIIlIIIlllIIl = Cipher.getInstance("DES");
            IlIIIlIIIlllIIl.init(IllIIll[5], llIIIlIIIlllIIl);
            return new String(IlIIIlIIIlllIIl.doFinal(Base64.getDecoder().decode(lIlIIlIIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIlIIIlllIIl) {
            lIIIIlIIIlllIIl.printStackTrace();
            return null;
        }
    }

    private static void IlIllIlIl() {
        IllIIll = new int[6];
        Main.IllIIll[0] = (0x5C ^ 0x51 ^ (0x74 ^ 0x65) << " ".length()) & ((0x8E ^ 0x99) << " ".length() ^ " ".length() ^ -" ".length());
        Main.IllIIll[1] = " ".length();
        Main.IllIIll[2] = ((0x6A ^ 0x29) << " ".length()) + (425 + 470 - 793 + 513) - (215 + 271 - 137 + 64) + (278 + 88 - 283 + 206) << (" ".length() << (" ".length() << " ".length()));
        Main.IllIIll[3] = 257 + 319 - 362 + 111 + (154 + 40 - 176 + 181) - ((0x40 ^ 0x3B) << (" ".length() << " ".length())) + (177 + 61 - 13 + 118) << "   ".length();
        Main.IllIIll[4] = " ".length() << "   ".length();
        Main.IllIIll[5] = " ".length() << " ".length();
    }

    private static boolean IIIIIllIl(int n, int n2) {
        return n == n2;
    }

    private static boolean lIIIIllIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lIlllIlIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean lllllIlIl(int n, int n2) {
        return n > n2;
    }

    private static boolean IllllIlIl(int n) {
        return n != 0;
    }

    private static boolean llIllIlIl(int n) {
        return n == 0;
    }

    private static boolean IIlllIlIl(int n) {
        return n < 0;
    }
}

