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
import java.util.StringTokenizer;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static String[] llllIlllIl;
    private static int[] IlIIllllIl;

    public Main() {
        Main llIllllIlIlllll;
    }

    public static void main(String[] stringArray) {
        try {
            InputStreamReader IIlIlllIlIlllll = new InputStreamReader(System.in);
            BufferedReader llIIlllIlIlllll = new BufferedReader(IIlIlllIlIlllll);
            String IlIIlllIlIlllll = llIIlllIlIlllll.readLine();
            StringTokenizer lIIIlllIlIlllll = new StringTokenizer(IlIIlllIlIlllll, llllIlllIl[IlIIllllIl[0]]);
            int IIIIlllIlIlllll = Integer.parseInt(lIIIlllIlIlllll.nextToken());
            int llllIllIlIlllll = Integer.parseInt(lIIIlllIlIlllll.nextToken());
            if (Main.IlIllIIlIlIl(IlIIllllIl[1], IIIIlllIlIlllll) && Main.llIllIIlIlIl(Main.lIIllIIlIlIl(IIIIlllIlIlllll, Math.pow(10.0, 9.0))) && Main.IlIllIIlIlIl(IlIIllllIl[1], llllIllIlIlllll) && Main.llIllIIlIlIl(Main.lIIllIIlIlIl(llllIllIlIlllll, Math.pow(10.0, 9.0)))) {
                System.out.print(IIIIlllIlIlllll / llllIllIlIlllll + " " + IIIIlllIlIlllll % llllIllIlIlllll);
            }
            Object[] objectArray = new Object[IlIIllllIl[1]];
            objectArray[Main.IlIIllllIl[0]] = (double)IIIIlllIlIlllll / (double)llllIllIlIlllll;
            System.out.printf(llllIlllIl[IlIIllllIl[1]], objectArray);
            "".length();
            "".length();
        }
        catch (IOException IIlIlllIlIlllll) {
            System.err.println(IIlIlllIlIlllll);
        }
        if (-" ".length() >= " ".length() << " ".length()) {
            return;
        }
    }

    static {
        Main.IIIllIIlIlIl();
        Main.lllIlIIlIlIl();
    }

    private static void lllIlIIlIlIl() {
        llllIlllIl = new String[IlIIllllIl[2]];
        Main.llllIlllIl[Main.IlIIllllIl[0]] = Main.lIlIlIIlIlIl("LRIBr8kANjs=", "QhhuI");
        Main.llllIlllIl[Main.IlIIllllIl[1]] = Main.IllIlIIlIlIl("PS8Ip5NxgC4=", "jjGkn");
    }

    private static String lIlIlIIlIlIl(String IlIlIllIlIlllll, String lIIlIllIlIlllll) {
        try {
            SecretKeySpec IIIlIllIlIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIllIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIllIlIlllll = Cipher.getInstance("Blowfish");
            lllIIllIlIlllll.init(IlIIllllIl[2], IIIlIllIlIlllll);
            return new String(lllIIllIlIlllll.doFinal(Base64.getDecoder().decode(IlIlIllIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllIIllIlIlllll) {
            IllIIllIlIlllll.printStackTrace();
            return null;
        }
    }

    private static String IllIlIIlIlIl(String lIlllIlIlIlllll, String IIlllIlIlIlllll) {
        try {
            SecretKeySpec llIllIlIlIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIlllIlIlIlllll.getBytes(StandardCharsets.UTF_8)), IlIIllllIl[3]), "DES");
            Cipher IlIllIlIlIlllll = Cipher.getInstance("DES");
            IlIllIlIlIlllll.init(IlIIllllIl[2], llIllIlIlIlllll);
            return new String(IlIllIlIlIlllll.doFinal(Base64.getDecoder().decode(lIlllIlIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllIlIlIlllll) {
            lIIllIlIlIlllll.printStackTrace();
            return null;
        }
    }

    private static void IIIllIIlIlIl() {
        IlIIllllIl = new int[4];
        Main.IlIIllllIl[0] = (0xD9 ^ 0x96) & ~(0x3C ^ 0x73);
        Main.IlIIllllIl[1] = " ".length();
        Main.IlIIllllIl[2] = " ".length() << " ".length();
        Main.IlIIllllIl[3] = " ".length() << "   ".length();
    }

    private static boolean IlIllIIlIlIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean llIllIIlIlIl(int n) {
        return n <= 0;
    }

    private static int lIIllIIlIlIl(double d, double d2) {
        return d == d2 ? 0 : (d < d2 ? -1 : 1);
    }
}

