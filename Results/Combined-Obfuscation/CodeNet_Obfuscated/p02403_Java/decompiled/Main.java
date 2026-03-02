/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static String[] IIIIIlIlIl;
    private static int[] lIIIIlIlIl;

    public Main() {
        Main IlIlIlIIlIIl;
    }

    public static void main(String[] stringArray) {
        int lIlllIIIlIIl;
        int IllllIIIlIIl;
        int lllllIIIlIIl;
        ArrayList<Integer> IIIIIlIIlIIl;
        ArrayList<Integer> lIIIIlIIlIIl;
        block10: {
            Scanner IlIIIlIIlIIl = new Scanner(System.in);
            lIIIIlIIlIIl = new ArrayList<Integer>();
            IIIIIlIIlIIl = new ArrayList<Integer>();
            lllllIIIlIIl = lIIIIlIlIl[0];
            do {
                IllllIIIlIIl = IlIIIlIIlIIl.nextInt();
                lIlllIIIlIIl = IlIIIlIIlIIl.nextInt();
                if (Main.IlIIIllIlIIl(IllllIIIlIIl) && Main.IlIIIllIlIIl(lIlllIIIlIIl)) {
                    "".length();
                    if (" ".length() << " ".length() >= " ".length() << (" ".length() << " ".length())) {
                        return;
                    }
                    break block10;
                }
                if (!(Main.llIIIllIlIIl(IllllIIIlIIl, lIIIIlIlIl[0]) && Main.llIIIllIlIIl(lIlllIIIlIIl, lIIIIlIlIl[0]) && Main.IIlIIllIlIIl(IllllIIIlIIl, lIIIIlIlIl[1]) && Main.IIlIIllIlIIl(lIlllIIIlIIl, lIIIIlIlIl[1]))) {
                    lllllIIIlIIl = lIIIIlIlIl[2];
                    "".length();
                    if (" ".length() << " ".length() < -" ".length()) {
                        return;
                    }
                    break block10;
                }
                lIIIIlIIlIIl.add(IllllIIIlIIl);
                "".length();
                IIIIIlIIlIIl.add(lIlllIIIlIIl);
                "".length();
                "".length();
                if (((0x20 ^ 0x43) & ~(0x19 ^ 0x7A)) != 0) {
                    return;
                }
                "".length();
            } while (((0xB4 ^ 0x97) << " ".length() & ~((0x5A ^ 0x79) << " ".length())) >= -" ".length());
            return;
        }
        if (Main.lIlIIllIlIIl(lllllIIIlIIl, lIIIIlIlIl[0])) {
            IllllIIIlIIl = lIIIIlIlIl[2];
            while (Main.IllIIllIlIIl(IllllIIIlIIl, lIIIIlIIlIIl.size())) {
                lIlllIIIlIIl = lIIIIlIlIl[2];
                while (Main.IllIIllIlIIl(lIlllIIIlIIl, (Integer)lIIIIlIIlIIl.get(IllllIIIlIIl))) {
                    int IIlllIIIlIIl = lIIIIlIlIl[2];
                    while (Main.IllIIllIlIIl(IIlllIIIlIIl, (Integer)IIIIIlIIlIIl.get(IllllIIIlIIl))) {
                        System.out.print(IIIIIlIlIl[lIIIIlIlIl[2]]);
                        ++IIlllIIIlIIl;
                        "".length();
                        if (" ".length() > -" ".length()) continue;
                        return;
                    }
                    System.out.println();
                    ++lIlllIIIlIIl;
                    "".length();
                    if ("   ".length() == "   ".length()) continue;
                    return;
                }
                System.out.println();
                ++IllllIIIlIIl;
                "".length();
                if (" ".length() <= " ".length() << (" ".length() << " ".length())) continue;
                return;
            }
        }
    }

    static {
        Main.lIIIIllIlIIl();
        Main.IIIIIllIlIIl();
    }

    private static void IIIIIllIlIIl() {
        IIIIIlIlIl = new String[lIIIIlIlIl[0]];
        Main.IIIIIlIlIl[Main.lIIIIlIlIl[2]] = Main.lllllIlIlIIl("1UhGMHDIOaI=", "mZCiH");
    }

    private static String lllllIlIlIIl(String lllIlIIIlIIl, String IllIlIIIlIIl) {
        try {
            SecretKeySpec lIlIlIIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IllIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), lIIIIlIlIl[3]), "DES");
            Cipher IIlIlIIIlIIl = Cipher.getInstance("DES");
            IIlIlIIIlIIl.init(lIIIIlIlIl[4], lIlIlIIIlIIl);
            return new String(IIlIlIIIlIIl.doFinal(Base64.getDecoder().decode(lllIlIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlIIIlIIl) {
            llIIlIIIlIIl.printStackTrace();
            return null;
        }
    }

    private static void lIIIIllIlIIl() {
        lIIIIlIlIl = new int[5];
        Main.lIIIIlIlIl[0] = " ".length();
        Main.lIIIIlIlIl[1] = (0x54 ^ 0x25 ^ (0x35 ^ 0x28) << " ".length()) << (" ".length() << " ".length());
        Main.lIIIIlIlIl[2] = (0x5D ^ 0x68 ^ (0x23 ^ 0x34) << " ".length()) << " ".length() & (((0x62 ^ 0x79) << " ".length() ^ (0xEA ^ 0xC7)) << " ".length() ^ -" ".length());
        Main.lIIIIlIlIl[3] = " ".length() << "   ".length();
        Main.lIIIIlIlIl[4] = " ".length() << " ".length();
    }

    private static boolean lIlIIllIlIIl(int n, int n2) {
        return n == n2;
    }

    private static boolean llIIIllIlIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IllIIllIlIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IIlIIllIlIIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean IlIIIllIlIIl(int n) {
        return n == 0;
    }
}

