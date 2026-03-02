/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class Main {
    private static String[] lIllIllIl;
    private static int[] llllIllIl;

    Main() {
        Main lIllIIIlllllIl;
    }

    public static void main(String[] stringArray) throws Exception {
        hayami IIIlIIIlllllIl = new hayami();
        String[] lllIIIIlllllIl = IIIlIIIlllllIl.nextHayami().split(lIllIllIl[llllIllIl[0]]);
        int IllIIIIlllllIl = llllIllIl[0];
        int lIlIIIIlllllIl = llllIllIl[0];
        while (Main.lllIIIIIlIl(lIlIIIIlllllIl, lllIIIIlllllIl.length)) {
            if (Main.IIIlIIIIlIl(lllIIIIlllllIl[lIlIIIIlllllIl].equals(lIllIllIl[llllIllIl[1]]) ? 1 : 0)) {
                ++IllIIIIlllllIl;
            }
            ++lIlIIIIlllllIl;
            "".length();
            if (null == null) continue;
            return;
        }
        System.out.println(IllIIIIlllllIl);
    }

    static {
        Main.IllIIIIIlIl();
        Main.lIlIIIIIlIl();
    }

    private static void lIlIIIIIlIl() {
        lIllIllIl = new String[llllIllIl[2]];
        Main.lIllIllIl[Main.llllIllIl[0]] = Main.lllIllllIIl("Ut6NlUhFzOE=", "GeDZE");
        Main.lIllIllIl[Main.llllIllIl[1]] = Main.IIlIIIIIlIl("PfV+RtGoex4=", "Iksxq");
    }

    private static String IIlIIIIIlIl(String IIIIIIIlllllIl, String lllllllIllllIl) {
        try {
            SecretKeySpec IllllllIllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlllllIllllIl = Cipher.getInstance("Blowfish");
            lIlllllIllllIl.init(llllIllIl[2], IllllllIllllIl);
            return new String(lIlllllIllllIl.doFinal(Base64.getDecoder().decode(IIIIIIIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIlllllIllllIl) {
            IIlllllIllllIl.printStackTrace();
            return null;
        }
    }

    private static String lllIllllIIl(String llIIlllIllllIl, String IlIIlllIllllIl) {
        try {
            SecretKeySpec lIIIlllIllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlIIlllIllllIl.getBytes(StandardCharsets.UTF_8)), llllIllIl[3]), "DES");
            Cipher IIIIlllIllllIl = Cipher.getInstance("DES");
            IIIIlllIllllIl.init(llllIllIl[2], lIIIlllIllllIl);
            return new String(IIIIlllIllllIl.doFinal(Base64.getDecoder().decode(llIIlllIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIllIllllIl) {
            llllIllIllllIl.printStackTrace();
            return null;
        }
    }

    private static void IllIIIIIlIl() {
        llllIllIl = new int[4];
        Main.llllIllIl[0] = (0xB5 ^ 0xA8) & ~(0xB ^ 0x16);
        Main.llllIllIl[1] = " ".length();
        Main.llllIllIl[2] = " ".length() << " ".length();
        Main.llllIllIl[3] = " ".length() << "   ".length();
    }

    private static boolean lllIIIIIlIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IIIlIIIIlIl(int n) {
        return n != 0;
    }
}

