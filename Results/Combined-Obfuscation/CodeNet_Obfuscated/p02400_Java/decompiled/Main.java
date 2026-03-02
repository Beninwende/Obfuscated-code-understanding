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

public class Main {
    private static String[] IIIlllIl;
    private static int[] lIIlllIl;

    public Main() {
        Main IlIllIIllIlIIIl;
    }

    public static void main(String[] stringArray) {
        try {
            String lIIIlIIllIlIIIl;
            BufferedReader IlIIlIIllIlIIIl = new BufferedReader(new InputStreamReader(System.in));
            while (Main.lIlllIlIIl(lIIIlIIllIlIIIl = IlIIlIIllIlIIIl.readLine())) {
                double IIIIlIIllIlIIIl = Double.parseDouble(lIIIlIIllIlIIIl);
                double llllIIIllIlIIIl = IIIIlIIllIlIIIl * IIIIlIIllIlIIIl * Math.PI;
                double IlllIIIllIlIIIl = 2.0 * IIIIlIIllIlIIIl * Math.PI;
                Object[] objectArray = new Object[lIIlllIl[1]];
                objectArray[Main.lIIlllIl[0]] = llllIIIllIlIIIl;
                String lIllIIIllIlIIIl = String.format(IIIlllIl[lIIlllIl[0]], objectArray);
                Object[] objectArray2 = new Object[lIIlllIl[1]];
                objectArray2[Main.lIIlllIl[0]] = IlllIIIllIlIIIl;
                String IIllIIIllIlIIIl = String.format(IIIlllIl[lIIlllIl[1]], objectArray2);
                System.out.println(lIllIIIllIlIIIl + " " + IIllIIIllIlIIIl);
                "".length();
                if (-"   ".length() < 0) continue;
                return;
            }
            IlIIlIIllIlIIIl.close();
            "".length();
        }
        catch (Exception IlIIlIIllIlIIIl) {
            IlIIlIIllIlIIIl.getStackTrace();
            "".length();
            System.exit(lIIlllIl[2]);
        }
        if (((0x1C ^ 0x3F ^ (0xBA ^ 0xB1) << (" ".length() << " ".length())) << (" ".length() << " ".length()) & (((0x38 ^ 0x1F) << (" ".length() << " ".length()) ^ 2 + 38 - -64 + 43) << (" ".length() << " ".length()) ^ -" ".length())) < 0) {
            return;
        }
    }

    static {
        Main.IIlllIlIIl();
        Main.llIllIlIIl();
    }

    private static void llIllIlIIl() {
        IIIlllIl = new String[lIIlllIl[3]];
        Main.IIIlllIl[Main.lIIlllIl[0]] = Main.lIIllIlIIl("7YQoWUEF20Q=", "aptzP");
        Main.IIIlllIl[Main.lIIlllIl[1]] = Main.IlIllIlIIl("wHOK1M8+6Gc=", "LXUhS");
    }

    private static String lIIllIlIIl(String lllIIIIllIlIIIl, String IllIIIIllIlIIIl) {
        try {
            SecretKeySpec lIlIIIIllIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IllIIIIllIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IIlIIIIllIlIIIl = Cipher.getInstance("Blowfish");
            IIlIIIIllIlIIIl.init(lIIlllIl[3], lIlIIIIllIlIIIl);
            return new String(IIlIIIIllIlIIIl.doFinal(Base64.getDecoder().decode(lllIIIIllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIIIllIlIIIl) {
            llIIIIIllIlIIIl.printStackTrace();
            return null;
        }
    }

    private static String IlIllIlIIl(String IlIllllIlIlIIIl, String lIIllllIlIlIIIl) {
        try {
            SecretKeySpec IIIllllIlIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllllIlIlIIIl.getBytes(StandardCharsets.UTF_8)), lIIlllIl[4]), "DES");
            Cipher lllIlllIlIlIIIl = Cipher.getInstance("DES");
            lllIlllIlIlIIIl.init(lIIlllIl[3], IIIllllIlIlIIIl);
            return new String(lllIlllIlIlIIIl.doFinal(Base64.getDecoder().decode(IlIllllIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllIlllIlIlIIIl) {
            IllIlllIlIlIIIl.printStackTrace();
            return null;
        }
    }

    private static void IIlllIlIIl() {
        lIIlllIl = new int[5];
        Main.lIIlllIl[0] = (0x1E ^ 0x19) << "   ".length() & ~((0x2B ^ 0x2C) << "   ".length());
        Main.lIIlllIl[1] = " ".length();
        Main.lIIlllIl[2] = -" ".length();
        Main.lIIlllIl[3] = " ".length() << " ".length();
        Main.lIIlllIl[4] = " ".length() << "   ".length();
    }

    private static boolean lIlllIlIIl(Object object) {
        return object != null;
    }
}

