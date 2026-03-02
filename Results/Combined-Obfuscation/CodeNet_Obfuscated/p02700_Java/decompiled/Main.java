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
    private static String[] lIlIIIIIIl;
    private static int[] IllIIIIIIl;

    public Main() {
        Main llIIIllIlIlll;
    }

    public static void main(String[] stringArray) {
        Scanner lIlllIlIlIlll = new Scanner(System.in);
        int IIlllIlIlIlll = lIlllIlIlIlll.nextInt();
        int llIllIlIlIlll = lIlllIlIlIlll.nextInt();
        int IlIllIlIlIlll = lIlllIlIlIlll.nextInt();
        int lIIllIlIlIlll = lIlllIlIlIlll.nextInt();
        if (Main.IIIIIlIIlll(IllIIIIIIl[0], IIlllIlIlIlll) && Main.IIIIIlIIlll(IIlllIlIlIlll, IllIIIIIIl[1]) && Main.IIIIIlIIlll(IllIIIIIIl[0], llIllIlIlIlll) && Main.IIIIIlIIlll(llIllIlIlIlll, IllIIIIIIl[1]) && Main.IIIIIlIIlll(IllIIIIIIl[0], IlIllIlIlIlll) && Main.IIIIIlIIlll(IlIllIlIlIlll, IllIIIIIIl[1]) && Main.IIIIIlIIlll(IllIIIIIIl[0], lIIllIlIlIlll) && Main.IIIIIlIIlll(lIIllIlIlIlll, IllIIIIIIl[1])) {
            "".length();
            if ((((0x90 ^ 0x9B) << (" ".length() << (" ".length() << " ".length())) ^ 150 + 77 - 171 + 97) << " ".length() & (((0x1A ^ 0x1D) << (" ".length() << (" ".length() << " ".length())) ^ (0x7E ^ 0x27)) << " ".length() ^ -" ".length())) < 0) {
                return;
            }
        } else {
            throw new IllegalArgumentException(lIlIIIIIIl[IllIIIIIIl[2]]);
        }
        while (Main.lIIIIlIIlll(IIlllIlIlIlll) && Main.lIIIIlIIlll(IlIllIlIlIlll)) {
            if (Main.lIIIIlIIlll(IlIllIlIlIlll -= llIllIlIlIlll)) {
                IIlllIlIlIlll -= lIIllIlIlIlll;
                "".length();
                if (" ".length() == " ".length()) continue;
                return;
            }
            System.out.println(lIlIIIIIIl[IllIIIIIIl[0]]);
            return;
        }
        System.out.println(lIlIIIIIIl[IllIIIIIIl[3]]);
    }

    static {
        Main.lllllIIIlll();
        Main.IllllIIIlll();
    }

    private static void IllllIIIlll() {
        lIlIIIIIIl = new String[IllIIIIIIl[4]];
        Main.lIlIIIIIIl[Main.IllIIIIIIl[2]] = Main.IIlllIIIlll("MVrAvwjhq1kr8h1kG+pHXfmw4NYzpYN9/FIdydcNdes=", "njdAy");
        Main.lIlIIIIIIl[Main.IllIIIIIIl[0]] = Main.lIlllIIIlll("Lwo9", "voNir");
        Main.lIlIIIIIIl[Main.IllIIIIIIl[3]] = Main.lIlllIIIlll("DSA=", "COqUa");
    }

    private static String IIlllIIIlll(String IIlIlIlIlIlll, String llIIlIlIlIlll) {
        try {
            SecretKeySpec IlIIlIlIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIlIlIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIlIlIlIlll = Cipher.getInstance("Blowfish");
            lIIIlIlIlIlll.init(IllIIIIIIl[3], IlIIlIlIlIlll);
            return new String(lIIIlIlIlIlll.doFinal(Base64.getDecoder().decode(IIlIlIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIIlIlIlIlll) {
            IIIIlIlIlIlll.printStackTrace();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String lIlllIIIlll(String IlIIIIlIlIlll, String lIIIIIlIlIlll) {
        IlIIIIlIlIlll = new String(Base64.getDecoder().decode(IlIIIIlIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        IIIIIIlIlIlll = new StringBuilder();
        llllllIIlIlll = lIIIIIlIlIlll.toCharArray();
        IlllllIIlIlll = Main.IllIIIIIIl[2];
        IIlIllIIlIlll = IlIIIIlIlIlll.toCharArray();
        lIlIllIIlIlll = IIlIllIIlIlll.length;
        IllIllIIlIlll = Main.IllIIIIIIl[2];
        "".length();
        if (" ".length() << " ".length() <= " ".length() << " ".length()) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            lIllllIIlIlll = IIlIllIIlIlll[IllIllIIlIlll];
            IIIIIIlIlIlll.append((char)(lIllllIIlIlll ^ llllllIIlIlll[IlllllIIlIlll % llllllIIlIlll.length]));
            "".length();
            ++IlllllIIlIlll;
            ++IllIllIIlIlll;
lbl19:
            // 2 sources

            ** while (!Main.IlIIIlIIlll((int)IllIllIIlIlll, (int)lIlIllIIlIlll))
        }
lbl20:
        // 1 sources

        return String.valueOf(IIIIIIlIlIlll);
    }

    private static void lllllIIIlll() {
        IllIIIIIIl = new int[5];
        Main.IllIIIIIIl[0] = " ".length();
        Main.IllIIIIIIl[1] = (66 + 149 - 207 + 151 ^ (0xFC ^ 0xBF) << " ".length()) << (" ".length() << " ".length());
        Main.IllIIIIIIl[2] = ((0x84 ^ 0xAD) << (" ".length() << " ".length()) ^ 154 + 148 - 195 + 66) << (" ".length() << " ".length()) & ((0x46 ^ 0x51 ^ (0xBB ^ 0xB4) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length());
        Main.IllIIIIIIl[3] = " ".length() << " ".length();
        Main.IllIIIIIIl[4] = "   ".length();
    }

    private static boolean IlIIIlIIlll(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIIIIlIIlll(int n, int n2) {
        return n <= n2;
    }

    private static boolean lIIIIlIIlll(int n) {
        return n > 0;
    }
}

