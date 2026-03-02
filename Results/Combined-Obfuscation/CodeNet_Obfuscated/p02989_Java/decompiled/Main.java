/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Main$Foster
 */
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static String[] llIIIIIIll;
    private static int[] IlllIIIIll;

    public Main() {
        Main IllIIIIIIlIllll;
    }

    public static void main(String[] stringArray) throws Exception {
        Foster IIIIIIIIIlIllll = new Foster();
        PrintWriter lllllllllIIllll = new PrintWriter(System.out);
        long IllllllllIIllll = IIIIIIIIIlIllll.nextLong();
        long lIlllllllIIllll = IIIIIIIIIlIllll.nextLong();
        long IIlllllllIIllll = IIIIIIIIIlIllll.nextLong();
        if (Main.IlIlIIIIllIl(Main.lIIlIIIIllIl(IIlllllllIIllll * lIlllllllIIllll, IllllllllIIllll))) {
            lllllllllIIllll.println(llIIIIIIll[IlllIIIIll[0]]);
            "".length();
            if ("   ".length() == " ".length()) {
                return;
            }
        } else {
            lllllllllIIllll.println(llIIIIIIll[IlllIIIIll[1]]);
        }
        lllllllllIIllll.close();
    }

    static {
        Main.IllIIIIIllIl();
        Main.lIIIIIIIllIl();
    }

    private static void lIIIIIIIllIl() {
        llIIIIIIll = new String[IlllIIIIll[2]];
        Main.llIIIIIIll[Main.IlllIIIIll[0]] = Main.lllllIllIlIl("aiNnUU9qVp8=", "XNUHD");
        Main.llIIIIIIll[Main.IlllIIIIll[1]] = Main.IIIIIIIIllIl("DDw=", "BSgmM");
    }

    private static String lllllIllIlIl(String lllIlllllIIllll, String IllIlllllIIllll) {
        try {
            SecretKeySpec lIlIlllllIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IllIlllllIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IIlIlllllIIllll = Cipher.getInstance("Blowfish");
            IIlIlllllIIllll.init(IlllIIIIll[2], lIlIlllllIIllll);
            return new String(IIlIlllllIIllll.doFinal(Base64.getDecoder().decode(lllIlllllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlllllIIllll) {
            llIIlllllIIllll.printStackTrace();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String IIIIIIIIllIl(String lIlIIllllIIllll, String IIlIIllllIIllll) {
        lIlIIllllIIllll = new String(Base64.getDecoder().decode(lIlIIllllIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        llIIIllllIIllll = new StringBuilder();
        IlIIIllllIIllll = IIlIIllllIIllll.toCharArray();
        lIIIIllllIIllll = Main.IlllIIIIll[0];
        lllIlIlllIIllll = lIlIIllllIIllll.toCharArray();
        IIIllIlllIIllll = lllIlIlllIIllll.length;
        lIIllIlllIIllll = Main.IlllIIIIll[0];
        "".length();
        if (-" ".length() != " ".length() << (" ".length() << " ".length())) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            IIIIIllllIIllll = lllIlIlllIIllll[lIIllIlllIIllll];
            llIIIllllIIllll.append((char)(IIIIIllllIIllll ^ IlIIIllllIIllll[lIIIIllllIIllll % IlIIIllllIIllll.length]));
            "".length();
            ++lIIIIllllIIllll;
            ++lIIllIlllIIllll;
lbl19:
            // 2 sources

            ** while (!Main.IIllIIIIllIl((int)lIIllIlllIIllll, (int)IIIllIlllIIllll))
        }
lbl20:
        // 1 sources

        return String.valueOf(llIIIllllIIllll);
    }

    private static void IllIIIIIllIl() {
        IlllIIIIll = new int[3];
        Main.IlllIIIIll[0] = " ".length() << (" ".length() << (" ".length() << " ".length())) & (" ".length() << (" ".length() << (" ".length() << " ".length())) ^ -" ".length());
        Main.IlllIIIIll[1] = " ".length();
        Main.IlllIIIIll[2] = " ".length() << " ".length();
    }

    private static boolean IIllIIIIllIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IlIlIIIIllIl(int n) {
        return n >= 0;
    }

    private static int lIIlIIIIllIl(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

