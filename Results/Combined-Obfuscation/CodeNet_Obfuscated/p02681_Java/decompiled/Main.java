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
    private static String[] llIllIIlll;
    private static int[] IIlllIIlll;

    public Main() {
        Main lIIIIIlllllllIl;
    }

    public static void main(String[] stringArray) {
        char IlllIlIllllllIl;
        Scanner IllIllIllllllIl = new Scanner(System.in);
        String lIlIllIllllllIl = IllIllIllllllIl.next();
        String IIlIllIllllllIl = IllIllIllllllIl.next();
        int llIIllIllllllIl = IIlllIIlll[0];
        int IlIIllIllllllIl = IIlllIIlll[0];
        int lIIIllIllllllIl = IIlllIIlll[1];
        int IIIIllIllllllIl = IIlllIIlll[1];
        int llllIlIllllllIl = IIlllIIlll[1];
        while (Main.lIlllllIlIll(llllIlIllllllIl, lIlIllIllllllIl.length())) {
            char lIllIlIllllllIl;
            IlllIlIllllllIl = lIlIllIllllllIl.charAt(llllIlIllllllIl);
            if (Main.IllllllIlIll(IlllIlIllllllIl, lIllIlIllllllIl = IIlIllIllllllIl.charAt(llllIlIllllllIl))) {
                llIIllIllllllIl = IIlllIIlll[1];
            }
            ++llllIlIllllllIl;
            "".length();
            if (" ".length() << (" ".length() << " ".length()) >= -" ".length()) continue;
            return;
        }
        llllIlIllllllIl = IIlllIIlll[1];
        while (Main.lIlllllIlIll(llllIlIllllllIl, lIlIllIllllllIl.length())) {
            IlllIlIllllllIl = lIlIllIllllllIl.charAt(llllIlIllllllIl);
            if (Main.lllllllIlIll(IlllIlIllllllIl, IIlllIIlll[2]) && Main.IIIIIIIllIll(IlllIlIllllllIl, IIlllIIlll[3])) {
                IlIIllIllllllIl = IIlllIIlll[1];
            }
            ++llllIlIllllllIl;
            "".length();
            if (" ".length() == " ".length()) continue;
            return;
        }
        llllIlIllllllIl = IIlllIIlll[1];
        while (Main.lIlllllIlIll(llllIlIllllllIl, IIlIllIllllllIl.length())) {
            IlllIlIllllllIl = IIlIllIllllllIl.charAt(llllIlIllllllIl);
            if (Main.lllllllIlIll(IlllIlIllllllIl, IIlllIIlll[2]) && Main.IIIIIIIllIll(IlllIlIllllllIl, IIlllIIlll[3])) {
                IlIIllIllllllIl = IIlllIIlll[1];
            }
            ++llllIlIllllllIl;
            "".length();
            if (null == null) continue;
            return;
        }
        if (Main.IIIIIIIllIll(IIlllIIlll[0], lIlIllIllllllIl.length()) && Main.IIIIIIIllIll(lIlIllIllllllIl.length(), IIlllIIlll[4])) {
            lIIIllIllllllIl = IIlllIIlll[0];
        }
        if (Main.lIIIIIIllIll(IIlIllIllllllIl.length(), lIlIllIllllllIl.length() + IIlllIIlll[0])) {
            IIIIllIllllllIl = IIlllIIlll[0];
        }
        if (Main.IlIIIIIllIll(llIIllIllllllIl) && Main.IlIIIIIllIll(IlIIllIllllllIl) && Main.IlIIIIIllIll(lIIIllIllllllIl) && Main.IlIIIIIllIll(IIIIllIllllllIl)) {
            System.out.println(llIllIIlll[IIlllIIlll[1]]);
            "".length();
            if (" ".length() << " ".length() > " ".length() << " ".length()) {
                return;
            }
        } else {
            System.out.println(llIllIIlll[IIlllIIlll[0]]);
        }
    }

    static {
        Main.IIlllllIlIll();
        Main.llIllllIlIll();
    }

    private static void llIllllIlIll() {
        llIllIIlll = new String[IIlllIIlll[5]];
        Main.llIllIIlll[Main.IIlllIIlll[1]] = Main.lIIllllIlIll("ChU8", "SpOQK");
        Main.llIllIIlll[Main.IIlllIIlll[0]] = Main.IlIllllIlIll("gVjRZiyGoOU=", "dCsNU");
    }

    private static String IlIllllIlIll(String IIIlIlIllllllIl, String lllIIlIllllllIl) {
        try {
            SecretKeySpec IllIIlIllllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIlIllllllIl.getBytes(StandardCharsets.UTF_8)), IIlllIIlll[6]), "DES");
            Cipher lIlIIlIllllllIl = Cipher.getInstance("DES");
            lIlIIlIllllllIl.init(IIlllIIlll[5], IllIIlIllllllIl);
            return new String(lIlIIlIllllllIl.doFinal(Base64.getDecoder().decode(IIIlIlIllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIlIIlIllllllIl) {
            IIlIIlIllllllIl.printStackTrace();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String lIIllllIlIll(String IllIlIIllllllIl, String lIlIlIIllllllIl) {
        IllIlIIllllllIl = new String(Base64.getDecoder().decode(IllIlIIllllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        IIlIlIIllllllIl = new StringBuilder();
        llIIlIIllllllIl = lIlIlIIllllllIl.toCharArray();
        IlIIlIIllllllIl = Main.IIlllIIlll[1];
        IIIlIIIllllllIl = IllIlIIllllllIl.toCharArray();
        lIIlIIIllllllIl = IIIlIIIllllllIl.length;
        IlIlIIIllllllIl = Main.IIlllIIlll[1];
        "".length();
        if ((" ".length() << " ".length() & (" ".length() << " ".length() ^ -" ".length())) > -" ".length()) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            lIIIlIIllllllIl = IIIlIIIllllllIl[IlIlIIIllllllIl];
            IIlIlIIllllllIl.append((char)(lIIIlIIllllllIl ^ llIIlIIllllllIl[IlIIlIIllllllIl % llIIlIIllllllIl.length]));
            "".length();
            ++IlIIlIIllllllIl;
            ++IlIlIIIllllllIl;
lbl19:
            // 2 sources

            ** while (!Main.lllllllIlIll((int)IlIlIIIllllllIl, (int)lIIlIIIllllllIl))
        }
lbl20:
        // 1 sources

        return String.valueOf(IIlIlIIllllllIl);
    }

    private static void IIlllllIlIll() {
        IIlllIIlll = new int[7];
        Main.IIlllIIlll[0] = " ".length();
        Main.IIlllIIlll[1] = (61 + 31 - 33 + 74 ^ (0x8A ^ 0xAF) << (" ".length() << " ".length())) << (" ".length() << " ".length()) & (((0xB8 ^ 0xB1) << (" ".length() << " ".length()) ^ (0x91 ^ 0xA4)) << (" ".length() << " ".length()) ^ -" ".length());
        Main.IIlllIIlll[2] = 0x1E ^ 0x5F;
        Main.IIlllIIlll[3] = (7 ^ 0x2A) << " ".length();
        Main.IIlllIIlll[4] = (123 + 12 - 107 + 103 ^ (0x72 ^ 0x31) << " ".length()) << " ".length();
        Main.IIlllIIlll[5] = " ".length() << " ".length();
        Main.IIlllIIlll[6] = " ".length() << "   ".length();
    }

    private static boolean lIIIIIIllIll(int n, int n2) {
        return n == n2;
    }

    private static boolean lllllllIlIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIlllllIlIll(int n, int n2) {
        return n < n2;
    }

    private static boolean IIIIIIIllIll(int n, int n2) {
        return n <= n2;
    }

    private static boolean IlIIIIIllIll(int n) {
        return n != 0;
    }

    private static boolean IllllllIlIll(int n, int n2) {
        return n != n2;
    }
}

