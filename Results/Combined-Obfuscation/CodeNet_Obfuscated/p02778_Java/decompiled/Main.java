/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static String[] IIIlIllIl;
    private static int[] llIlIllIl;

    public Main() {
        Main IllIIlllllllIl;
    }

    public static void main(String[] stringArray) {
        FastScanner lIIIIlllllllIl = new FastScanner();
        PrintWriter IIIIIlllllllIl = new PrintWriter(System.out);
        String lllllIllllllIl = lIIIIlllllllIl.next();
        char[] IllllIllllllIl = lllllIllllllIl.toCharArray();
        Arrays.fill(IllllIllllllIl, llIlIllIl[0]);
        Object[] objectArray = new Object[llIlIllIl[2]];
        objectArray[Main.llIlIllIl[1]] = String.valueOf(IllllIllllllIl);
        IIIIIlllllllIl.printf(IIIlIllIl[llIlIllIl[1]], objectArray);
        "".length();
        IIIIIlllllllIl.flush();
    }

    static {
        Main.IllIllllIIl();
        Main.IIlIllllIIl();
    }

    private static void IIlIllllIIl() {
        IIIlIllIl = new String[llIlIllIl[2]];
        Main.IIIlIllIl[Main.llIlIllIl[1]] = Main.llIlIlllIIl("Nq15hjwMthQ=", "pqbvT");
    }

    private static String llIlIlllIIl(String lIIllIllllllIl, String IIIllIllllllIl) {
        try {
            SecretKeySpec lllIlIllllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIIllIllllllIl.getBytes(StandardCharsets.UTF_8)), llIlIllIl[3]), "DES");
            Cipher IllIlIllllllIl = Cipher.getInstance("DES");
            IllIlIllllllIl.init(llIlIllIl[4], lllIlIllllllIl);
            return new String(IllIlIllllllIl.doFinal(Base64.getDecoder().decode(lIIllIllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlIllllllIl) {
            lIlIlIllllllIl.printStackTrace();
            return null;
        }
    }

    private static void IllIllllIIl() {
        llIlIllIl = new int[5];
        Main.llIlIllIl[0] = (0xC8 ^ 0xC7) << "   ".length();
        Main.llIlIllIl[1] = (0xB4 ^ 0xBF) << "   ".length() & ~((0x86 ^ 0x8D) << "   ".length());
        Main.llIlIllIl[2] = " ".length();
        Main.llIlIllIl[3] = " ".length() << "   ".length();
        Main.llIlIllIl[4] = " ".length() << " ".length();
    }
}

