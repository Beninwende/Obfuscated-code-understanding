/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Main$InputReader
 */
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static String[] lllllIlIIl;
    private static int[] lIIlIllIIl;
    private static int[] IlIlIllIIl;

    public Main() {
        Main IlIIIlIIIIIIl;
    }

    public static void main(String[] stringArray) {
        InputStream IlIllIIIIIIIl = System.in;
        PrintStream lIIllIIIIIIIl = System.out;
        InputReader IIIllIIIIIIIl = new InputReader(IlIllIIIIIIIl);
        PrintWriter lllIlIIIIIIIl = new PrintWriter(lIIllIIIIIIIl);
        StringBuilder IllIlIIIIIIIl = new StringBuilder();
        String lIlIlIIIIIIIl = IIIllIIIIIIIl.String();
        if (Main.lIlllIIlIIIl(Main.IIIllIIlIIIl(lIlIlIIIIIIIl.equals(lllllIlIIl[lIIlIllIIl[IlIlIllIIl[0]]]) ? 1 : 0) ? 1 : 0)) {
            lllIlIIIIIIIl.println(lllllIlIIl[lIIlIllIIl[IlIlIllIIl[1]]]);
            "".length();
            "".length();
            if (Main.IllllIIlIIIl(" ".length() << (" ".length() << " ".length()), " ".length() << (" ".length() << " ".length()))) {
                return;
            }
        } else {
            lllIlIIIIIIIl.println(lllllIlIIl[lIIlIllIIl[IlIlIllIIl[2]]]);
        }
        lllIlIIIIIIIl.close();
    }

    static {
        Main.IIlllIIlIIIl();
        Main.lllIlIIlIIIl();
        Main.lIIlIIIlIIIl();
    }

    private static void lIIlIIIlIIIl() {
        lllllIlIIl = new String[lIIlIllIIl[IlIlIllIIl[3]]];
        Main.lllllIlIIl[Main.lIIlIllIIl[Main.IlIlIllIIl[0]]] = Main.llIlIllIIIIl("BCAp", "EbjAS");
        Main.lllllIlIIl[Main.lIIlIllIIl[Main.IlIlIllIIl[1]]] = Main.IlllIllIIIIl("EECnCRRbYJU=", "MaVkM");
        Main.lllllIlIIl[Main.lIIlIllIIl[Main.IlIlIllIIl[2]]] = Main.llIIIIIlIIIl("5HX6GxDLnjs=", "albxc");
    }

    private static void lllIlIIlIIIl() {
        lIIlIllIIl = new int[IlIlIllIIl[4]];
        Main.lIIlIllIIl[Main.IlIlIllIIl[0]] = " ".length() << " ".length() & (" ".length() << " ".length() ^ -" ".length());
        Main.lIIlIllIIl[Main.IlIlIllIIl[1]] = " ".length();
        Main.lIIlIllIIl[Main.IlIlIllIIl[2]] = " ".length() << " ".length();
        Main.lIIlIllIIl[Main.IlIlIllIIl[3]] = "   ".length();
    }

    private static boolean IIIllIIlIIIl(int n) {
        boolean bl;
        if (Main.lIlllIIlIIIl(n)) {
            bl = IlIlIllIIl[1];
            "".length();
            if (-((9 ^ 0x12) << " ".length() ^ (0xA3 ^ 0x90)) >= 0) {
                return (((0x10 ^ 0x19) << (" ".length() << " ".length()) ^ "   ".length()) & ((0x95 ^ 0xC6) << " ".length() ^ 22 + 63 - 33 + 77 ^ -" ".length())) != 0;
            }
        } else {
            bl = IlIlIllIIl[0];
        }
        return bl;
    }

    private static String llIIIIIlIIIl(String lllIIIIIIIIIl, String IllIIIIIIIIIl) {
        try {
            SecretKeySpec lIlIIIIIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IllIIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IIlIIIIIIIIIl = Cipher.getInstance("Blowfish");
            IIlIIIIIIIIIl.init(IlIlIllIIl[2], lIlIIIIIIIIIl);
            return new String(IIlIIIIIIIIIl.doFinal(Base64.getDecoder().decode(lllIIIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIIIIIIIIl) {
            llIIIIIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static String IlllIllIIIIl(String IlIlllllllll, String lIIlllllllll) {
        try {
            SecretKeySpec IIIlllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlllllllll.getBytes(StandardCharsets.UTF_8)), IlIlIllIIl[5]), "DES");
            Cipher lllIllllllll = Cipher.getInstance("DES");
            lllIllllllll.init(IlIlIllIIl[2], IIIlllllllll);
            return new String(lllIllllllll.doFinal(Base64.getDecoder().decode(IlIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllIllllllll) {
            IllIllllllll.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String llIlIllIIIIl(String IIIlIlllllll, String lllIIlllllll) {
        IIIlIlllllll = new String(Base64.getDecoder().decode(IIIlIlllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder IllIIlllllll = new StringBuilder();
        char[] lIlIIlllllll = lllIIlllllll.toCharArray();
        int IIlIIlllllll = IlIlIllIIl[0];
        char[] IlIllIllllll = IIIlIlllllll.toCharArray();
        int llIllIllllll = IlIllIllllll.length;
        int IIlllIllllll = IlIlIllIIl[0];
        "".length();
        while (!Main.lllllIIlIIIl(IIlllIllllll, llIllIllllll)) {
            char llIIIlllllll = IlIllIllllll[IIlllIllllll];
            IllIIlllllll.append((char)(llIIIlllllll ^ lIlIIlllllll[IIlIIlllllll % lIlIIlllllll.length]));
            "".length();
            ++IIlIIlllllll;
            ++IIlllIllllll;
        }
        return String.valueOf(IllIIlllllll);
    }

    private static void IIlllIIlIIIl() {
        IlIlIllIIl = new int[6];
        Main.IlIlIllIIl[0] = ((0x69 ^ 0x74) << "   ".length() ^ 9 + 38 - 25 + 115) & ((0x7A ^ 0x73) << " ".length() ^ (0x7F ^ 0xC) ^ -" ".length());
        Main.IlIlIllIIl[1] = " ".length();
        Main.IlIlIllIIl[2] = " ".length() << " ".length();
        Main.IlIlIllIIl[3] = "   ".length();
        Main.IlIlIllIIl[4] = " ".length() << (" ".length() << " ".length());
        Main.IlIlIllIIl[5] = " ".length() << "   ".length();
    }

    private static boolean lllllIIlIIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIlllIIlIIIl(int n) {
        return n != 0;
    }

    private static boolean IllllIIlIIIl(int n, int n2) {
        return n != n2;
    }
}

