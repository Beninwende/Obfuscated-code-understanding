/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static String[] lIIIlIIlll;
    private static int[] IIlIlIIlll;

    public Main() {
        Main lIIllIIIIlIIIll;
    }

    public static void main(String[] stringArray) {
        BufferedReader llIlIIIIIlIIIll = new BufferedReader(new InputStreamReader(System.in));
        try {
            String IlIlIIIIIlIIIll = llIlIIIIIlIIIll.readLine();
            int lIIlIIIIIlIIIll = Integer.parseInt(IlIlIIIIIlIIIll);
            String IIIlIIIIIlIIIll = llIlIIIIIlIIIll.readLine();
            String[] lllIIIIIIlIIIll = IIIlIIIIIlIIIll.split(lIIIlIIlll[IIlIlIIlll[0]], IIlIlIIlll[1]);
            int[] IllIIIIIIlIIIll = new int[lIIlIIIIIlIIIll];
            int lIlIIIIIIlIIIll = IIlIlIIlll[0];
            while (Main.lIllIIlIlIll(lIlIIIIIIlIIIll, lIIlIIIIIlIIIll)) {
                IllIIIIIIlIIIll[lIlIIIIIIlIIIll] = Integer.parseInt(lllIIIIIIlIIIll[lIlIIIIIIlIIIll]);
                ++lIlIIIIIIlIIIll;
                "".length();
                if (null == null) continue;
                return;
            }
            lIlIIIIIIlIIIll = IIlIlIIlll[0];
            int IIlIIIIIIlIIIll = IIlIlIIlll[0];
            while (Main.lIllIIlIlIll(lIlIIIIIIlIIIll, lIIlIIIIIlIIIll - IIlIlIIlll[2]) && Main.lIllIIlIlIll(IIlIIIIIIlIIIll, lIIlIIIIIlIIIll - IIlIlIIlll[2])) {
                if (!Main.IlllIIlIlIll(IllIIIIIIlIIIll[lIlIIIIIIlIIIll], IllIIIIIIlIIIll[++IIlIIIIIIlIIIll])) continue;
                lIlIIIIIIlIIIll = IIlIIIIIIlIIIll;
                "".length();
                if (((0xC3 ^ 0xB0 ^ (0x56 ^ 0x6D) << " ".length()) << (" ".length() << " ".length()) & ((0xA2 ^ 0x99 ^ (0x3C ^ 0x23) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length())) != " ".length() << " ".length()) continue;
                return;
            }
            int llIIIIIIIlIIIll = IIlIlIIlll[0];
            int IlIIIIIIIlIIIll = IIlIlIIlll[0];
            while (Main.lIllIIlIlIll(llIIIIIIIlIIIll, lIIlIIIIIlIIIll - IIlIlIIlll[2]) && Main.lIllIIlIlIll(IlIIIIIIIlIIIll, lIIlIIIIIlIIIll - IIlIlIIlll[2])) {
                if (!Main.lIllIIlIlIll(IllIIIIIIlIIIll[llIIIIIIIlIIIll], IllIIIIIIlIIIll[++IlIIIIIIIlIIIll])) continue;
                llIIIIIIIlIIIll = IlIIIIIIIlIIIll;
                "".length();
                if (null == null) continue;
                return;
            }
            long[] lIIIIIIIIlIIIll = new long[lIIlIIIIIlIIIll + IIlIlIIlll[2]];
            long[] IIIIIIIIIlIIIll = new long[lIIlIIIIIlIIIll];
            int lllllllllIIIIll = IIlIlIIlll[0];
            while (Main.lIllIIlIlIll(lllllllllIIIIll, lIIlIIIIIlIIIll)) {
                IIIIIIIIIlIIIll[lllllllllIIIIll] = IllIIIIIIlIIIll[lllllllllIIIIll];
                ++lllllllllIIIIll;
                "".length();
                if (" ".length() << " ".length() < " ".length() << (" ".length() << " ".length())) continue;
                return;
            }
            lIIIIIIIIlIIIll[Main.IIlIlIIlll[0]] = 0L;
            lllllllllIIIIll = IIlIlIIlll[2];
            while (Main.llllIIlIlIll(lllllllllIIIIll, lIIlIIIIIlIIIll)) {
                lIIIIIIIIlIIIll[lllllllllIIIIll] = IIIIIIIIIlIIIll[lllllllllIIIIll - IIlIlIIlll[2]] + lIIIIIIIIlIIIll[lllllllllIIIIll - IIlIlIIlll[2]];
                ++lllllllllIIIIll;
                "".length();
                if (-"   ".length() < 0) continue;
                return;
            }
            System.out.println(IllIIIIIIlIIIll[lIlIIIIIIlIIIll] + " " + IllIIIIIIlIIIll[llIIIIIIIlIIIll] + " " + lIIIIIIIIlIIIll[lIIlIIIIIlIIIll]);
        }
        catch (IOException IlIlIIIIIlIIIll) {
            System.out.println(IlIlIIIIIlIIIll);
            "".length();
            if ((((0x37 ^ 0x1A) << (" ".length() << " ".length()) ^ 60 + 72 - 62 + 83) & (15 + 63 - -9 + 74 ^ (0x74 ^ 0x57) << (" ".length() << " ".length()) ^ -" ".length())) >= " ".length()) {
                return;
            }
        }
        catch (NumberFormatException IlIlIIIIIlIIIll) {
            System.out.println(lIIIlIIlll[IIlIlIIlll[2]]);
        }
        "".length();
        if ((" ".length() << "   ".length() & (" ".length() << "   ".length() ^ -" ".length())) != 0) {
            return;
        }
    }

    static {
        Main.IIllIIlIlIll();
        Main.IlllllIIlIll();
    }

    private static void IlllllIIlIll() {
        lIIIlIIlll = new String[IIlIlIIlll[3]];
        Main.lIIIlIIlll[Main.IIlIlIIlll[0]] = Main.lIllllIIlIll("HHJRnY2+3QQ=", "jfVAV");
        Main.lIIIlIIlll[Main.IIlIlIIlll[2]] = Main.lIllllIIlIll("YZCDHdpL9Z0=", "tEhho");
    }

    private static String lIllllIIlIll(String IlIllllllIIIIll, String lIIllllllIIIIll) {
        try {
            SecretKeySpec IIIllllllIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllllllIIIIll.getBytes(StandardCharsets.UTF_8)), IIlIlIIlll[4]), "DES");
            Cipher lllIlllllIIIIll = Cipher.getInstance("DES");
            lllIlllllIIIIll.init(IIlIlIIlll[3], IIIllllllIIIIll);
            return new String(lllIlllllIIIIll.doFinal(Base64.getDecoder().decode(IlIllllllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllIlllllIIIIll) {
            IllIlllllIIIIll.printStackTrace();
            return null;
        }
    }

    private static void IIllIIlIlIll() {
        IIlIlIIlll = new int[5];
        Main.IIlIlIIlll[0] = (0x7E ^ 0x65) << " ".length() & ~((0x6F ^ 0x74) << " ".length());
        Main.IIlIlIIlll[1] = -" ".length();
        Main.IIlIlIIlll[2] = " ".length();
        Main.IIlIlIIlll[3] = " ".length() << " ".length();
        Main.IIlIlIIlll[4] = " ".length() << "   ".length();
    }

    private static boolean lIllIIlIlIll(int n, int n2) {
        return n < n2;
    }

    private static boolean llllIIlIlIll(int n, int n2) {
        return n <= n2;
    }

    private static boolean IlllIIlIlIll(int n, int n2) {
        return n > n2;
    }
}

