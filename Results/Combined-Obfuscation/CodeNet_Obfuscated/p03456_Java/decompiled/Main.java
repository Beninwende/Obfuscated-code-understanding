/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static String[] llIlIlll;
    private static int[] IlllIlll;

    public Main() {
        Main llIlIIlIIlllll;
    }

    public static void main(String[] stringArray) {
        String IlIIIIlIIlllll;
        FastScanner IIlIIIlIIlllll = new FastScanner();
        String llIIIIlIIlllll = IIlIIIlIIlllll.next();
        String lIIIIIlIIlllll = llIIIIlIIlllll + (IlIIIIlIIlllll = IIlIIIlIIlllll.next());
        int IIIIIIlIIlllll = Integer.valueOf(lIIIIIlIIlllll);
        int llllllIIIlllll = (int)Math.sqrt(IIIIIIlIIlllll);
        if (Main.lIIlIlIIll(llllllIIIlllll * llllllIIIlllll, IIIIIIlIIlllll)) {
            System.out.println(llIlIlll[IlllIlll[0]]);
            "".length();
            if (("   ".length() << (" ".length() << (" ".length() << " ".length())) ^ (6 ^ 0x33)) <= 0) {
                return;
            }
        } else {
            System.out.println(llIlIlll[IlllIlll[1]]);
        }
    }

    static {
        Main.IIIlIlIIll();
        Main.lllIIlIIll();
    }

    private static void lllIIlIIll() {
        llIlIlll = new String[IlllIlll[2]];
        Main.llIlIlll[Main.IlllIlll[0]] = Main.IlIllIIIll("1n0Pp1Yd9Z0=", "gZWYB");
        Main.llIlIlll[Main.IlllIlll[1]] = Main.IlIllIIIll("tXQUA3TzoB8=", "GuVnY");
    }

    private static String IlIllIIIll(String IlIlllIIIlllll, String lIIlllIIIlllll) {
        try {
            SecretKeySpec IIIlllIIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlllIIIlllll.getBytes(StandardCharsets.UTF_8)), IlllIlll[3]), "DES");
            Cipher lllIllIIIlllll = Cipher.getInstance("DES");
            lllIllIIIlllll.init(IlllIlll[2], IIIlllIIIlllll);
            return new String(lllIllIIIlllll.doFinal(Base64.getDecoder().decode(IlIlllIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllIllIIIlllll) {
            IllIllIIIlllll.printStackTrace();
            return null;
        }
    }

    private static void IIIlIlIIll() {
        IlllIlll = new int[4];
        Main.IlllIlll[0] = " ".length() << (" ".length() << (" ".length() << " ".length())) & ~(" ".length() << (" ".length() << (" ".length() << " ".length())));
        Main.IlllIlll[1] = " ".length();
        Main.IlllIlll[2] = " ".length() << " ".length();
        Main.IlllIlll[3] = " ".length() << "   ".length();
    }

    private static boolean lIIlIlIIll(int n, int n2) {
        return n == n2;
    }
}

