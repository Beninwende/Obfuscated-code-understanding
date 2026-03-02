/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static String[] lIllIIlll;
    private static int[] llllIIlll;

    public Main() {
        Main IIlIIllIllIIIl;
    }

    public static void main(String[] stringArray) throws MyException {
        Scanner llIllIlIllIIIl = new Scanner(System.in);
        String IlIllIlIllIIIl = llIllIlIllIIIl.next();
        String lIIllIlIllIIIl = llIllIlIllIIIl.next();
        if (!Main.IlllIllIIll(IlIllIlIllIIIl.length(), llllIIlll[0]) || Main.llllIllIIll(IlIllIlIllIIIl.length(), llllIIlll[1])) {
            throw new MyException(lIllIIlll[llllIIlll[2]]);
        }
        if (!Main.IlllIllIIll(lIIllIlIllIIIl.length(), llllIIlll[0]) || Main.llllIllIIll(lIIllIlIllIIIl.length(), llllIIlll[1])) {
            throw new MyException(lIllIIlll[llllIIlll[0]]);
        }
        if (Main.IIIIlllIIll(Pattern.matches(lIllIIlll[llllIIlll[3]], IlIllIlIllIIIl) ? 1 : 0)) {
            throw new MyException(lIllIIlll[llllIIlll[4]]);
        }
        if (Main.IIIIlllIIll(Pattern.matches(lIllIIlll[llllIIlll[5]], lIIllIlIllIIIl) ? 1 : 0)) {
            throw new MyException(lIllIIlll[llllIIlll[6]]);
        }
        if (Main.lIIIlllIIll(IlIllIlIllIIIl.equals(lIIllIlIllIIIl) ? 1 : 0)) {
            throw new MyException(lIllIIlll[llllIIlll[7]]);
        }
        String IIIllIlIllIIIl = llIllIlIllIIIl.next();
        String lllIlIlIllIIIl = llIllIlIllIIIl.next();
        if (Main.IIIIlllIIll(Pattern.compile(lIllIIlll[llllIIlll[8]]).matcher(IIIllIlIllIIIl).find() ? 1 : 0)) {
            throw new MyException(lIllIIlll[llllIIlll[9]]);
        }
        if (Main.IIIIlllIIll(Pattern.compile(lIllIIlll[llllIIlll[10]]).matcher(lllIlIlIllIIIl).find() ? 1 : 0)) {
            throw new MyException(lIllIIlll[llllIIlll[1]]);
        }
        int IllIlIlIllIIIl = Integer.parseInt(IIIllIlIllIIIl);
        int lIlIlIlIllIIIl = Integer.parseInt(lllIlIlIllIIIl);
        if (!Main.IlllIllIIll(IllIlIlIllIIIl, llllIIlll[0]) || Main.llllIllIIll(IllIlIlIllIIIl, llllIIlll[1])) {
            throw new MyException(lIllIIlll[llllIIlll[11]]);
        }
        if (!Main.IlllIllIIll(lIlIlIlIllIIIl, llllIIlll[0]) || Main.llllIllIIll(lIlIlIlIllIIIl, llllIIlll[1])) {
            throw new MyException(lIllIIlll[llllIIlll[12]]);
        }
        String IIlIlIlIllIIIl = llIllIlIllIIIl.next();
        if (Main.IIIIlllIIll(IIlIlIlIllIIIl.equals(IlIllIlIllIIIl) ? 1 : 0) && Main.IIIIlllIIll(IIlIlIlIllIIIl.equals(lIIllIlIllIIIl) ? 1 : 0)) {
            throw new MyException(lIllIIlll[llllIIlll[13]]);
        }
        if (Main.lIIIlllIIll(IIlIlIlIllIIIl.equals(IlIllIlIllIIIl) ? 1 : 0)) {
            System.out.println(IllIlIlIllIIIl - llllIIlll[0] + " " + lIlIlIlIllIIIl);
        }
        if (Main.lIIIlllIIll(IIlIlIlIllIIIl.equals(lIIllIlIllIIIl) ? 1 : 0)) {
            System.out.println(IllIlIlIllIIIl + " " + (lIlIlIlIllIIIl - llllIIlll[0]));
        }
        llIllIlIllIIIl.close();
    }

    static {
        Main.lIllIllIIll();
        Main.IIllIllIIll();
    }

    private static void IIllIllIIll() {
        lIllIIlll = new String[llllIIlll[14]];
        Main.lIllIIlll[Main.llllIIlll[2]] = Main.lIIlIllIIll("", "kkQgC");
        Main.lIllIIlll[Main.llllIIlll[0]] = Main.lIIlIllIIll("", "tKGNd");
        Main.lIllIIlll[Main.llllIIlll[3]] = Main.IlIlIllIIll("bykRZMdATbOFEMponlVCiw==", "NeQzH");
        Main.lIllIIlll[Main.llllIIlll[4]] = Main.IlIlIllIIll("oEXfXXhxPfE=", "wdhzh");
        Main.lIllIIlll[Main.llllIIlll[5]] = Main.IlIlIllIIll("LyxMvo3atllQVZQMJREiYw==", "KStaC");
        Main.lIllIIlll[Main.llllIIlll[6]] = Main.IlIlIllIIll("Piz1HPD3d4E=", "qEAPX");
        Main.lIllIIlll[Main.llllIIlll[7]] = Main.lIIlIllIIll("", "MafVf");
        Main.lIllIIlll[Main.llllIIlll[8]] = Main.IlIlIllIIll("zsHbncqmRX52QQ9BLtY3Eg==", "anHBd");
        Main.lIllIIlll[Main.llllIIlll[9]] = Main.IlIlIllIIll("XueG8usMxrU=", "kZHwq");
        Main.lIllIIlll[Main.llllIIlll[10]] = Main.llIlIllIIll("33o20f2hSjSPOgBWsjgmAw==", "acTMv");
        Main.lIllIIlll[Main.llllIIlll[1]] = Main.IlIlIllIIll("nixlylCFkpc=", "gaVRO");
        Main.lIllIIlll[Main.llllIIlll[11]] = Main.lIIlIllIIll("", "flNxE");
        Main.lIllIIlll[Main.llllIIlll[12]] = Main.lIIlIllIIll("", "HbUaj");
        Main.lIllIIlll[Main.llllIIlll[13]] = Main.llIlIllIIll("wMXF+Y0OvoY=", "myfBt");
    }

    private static String IlIlIllIIll(String llllIIlIllIIIl, String IlllIIlIllIIIl) {
        try {
            SecretKeySpec lIllIIlIllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlllIIlIllIIIl.getBytes(StandardCharsets.UTF_8)), llllIIlll[9]), "DES");
            Cipher IIllIIlIllIIIl = Cipher.getInstance("DES");
            IIllIIlIllIIIl.init(llllIIlll[3], lIllIIlIllIIIl);
            return new String(IIllIIlIllIIIl.doFinal(Base64.getDecoder().decode(llllIIlIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIIlIllIIIl) {
            llIlIIlIllIIIl.printStackTrace();
            return null;
        }
    }

    private static String llIlIllIIll(String IlIIIIlIllIIIl, String lIIIIIlIllIIIl) {
        try {
            SecretKeySpec IIIIIIlIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIIlIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllIIllIIIl = Cipher.getInstance("Blowfish");
            llllllIIllIIIl.init(llllIIlll[3], IIIIIIlIllIIIl);
            return new String(llllllIIllIIIl.doFinal(Base64.getDecoder().decode(IlIIIIlIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlllllIIllIIIl) {
            IlllllIIllIIIl.printStackTrace();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String lIIlIllIIll(String IIIIllIIllIIIl, String llllIlIIllIIIl) {
        IIIIllIIllIIIl = new String(Base64.getDecoder().decode(IIIIllIIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        IlllIlIIllIIIl = new StringBuilder();
        lIllIlIIllIIIl = llllIlIIllIIIl.toCharArray();
        IIllIlIIllIIIl = Main.llllIIlll[2];
        IlIIIlIIllIIIl = IIIIllIIllIIIl.toCharArray();
        llIIIlIIllIIIl = IlIIIlIIllIIIl.length;
        IIlIIlIIllIIIl = Main.llllIIlll[2];
        "".length();
        if (-"  ".length() <= 0) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            llIlIlIIllIIIl = IlIIIlIIllIIIl[IIlIIlIIllIIIl];
            IlllIlIIllIIIl.append((char)(llIlIlIIllIIIl ^ lIllIlIIllIIIl[IIllIlIIllIIIl % lIllIlIIllIIIl.length]));
            "".length();
            ++IIllIlIIllIIIl;
            ++IIlIIlIIllIIIl;
lbl19:
            // 2 sources

            ** while (!Main.IlllIllIIll((int)IIlIIlIIllIIIl, (int)llIIIlIIllIIIl))
        }
lbl20:
        // 1 sources

        return String.valueOf(IlllIlIIllIIIl);
    }

    private static void lIllIllIIll() {
        llllIIlll = new int[15];
        Main.llllIIlll[0] = " ".length();
        Main.llllIIlll[1] = (0x38 ^ 0x3D) << " ".length();
        Main.llllIIlll[2] = "   ".length() & ("   ".length() ^ -" ".length());
        Main.llllIIlll[3] = " ".length() << " ".length();
        Main.llllIIlll[4] = "   ".length();
        Main.llllIIlll[5] = " ".length() << (" ".length() << " ".length());
        Main.llllIIlll[6] = 16 + 24 - -44 + 51 ^ (0x51 ^ 0x10) << " ".length();
        Main.llllIIlll[7] = "   ".length() << " ".length();
        Main.llllIIlll[8] = 0x41 ^ 0x46;
        Main.llllIIlll[9] = " ".length() << "   ".length();
        Main.llllIIlll[10] = 0x78 ^ 0x71;
        Main.llllIIlll[11] = 88 + 112 - 169 + 156 ^ (0xB0 ^ 0xBB) << (" ".length() << (" ".length() << " ".length()));
        Main.llllIIlll[12] = "   ".length() << (" ".length() << " ".length());
        Main.llllIIlll[13] = 0xCF ^ 0xC2;
        Main.llllIIlll[14] = (0xAD ^ 0xBE ^ (0xBD ^ 0xB8) << (" ".length() << " ".length())) << " ".length();
    }

    private static boolean IlllIllIIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean llllIllIIll(int n, int n2) {
        return n > n2;
    }

    private static boolean lIIIlllIIll(int n) {
        return n != 0;
    }

    private static boolean IIIIlllIIll(int n) {
        return n == 0;
    }
}

