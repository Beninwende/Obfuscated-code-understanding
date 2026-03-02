/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    Scanner sc;
    int N;
    private static String[] llIIlIlIll;
    private static int[] IIlIlIlIll;

    public static void main(String[] stringArray) throws Exception {
        Scanner IIIIIlllIIllIll = new Scanner(System.in);
        Main lllllIllIIllIll = new Main(IIIIIlllIIllIll);
        lllllIllIIllIll.show(lllllIllIIllIll.solve());
        IIIIIlllIIllIll.close();
    }

    Main(Scanner llIllIllIIllIll) {
        Main IIlllIllIIllIll;
        IIlllIllIIllIll.sc = llIllIllIIllIll;
        IIlllIllIIllIll.N = llIllIllIIllIll.nextInt();
    }

    private String solve() {
        String string;
        Main IIIllIllIIllIll;
        String lllIlIllIIllIll = llIIlIlIll[IIlIlIlIll[0]];
        if (Main.IIIlllIIIIll(IIlIlIlIll[1], IIIllIllIIllIll.N) && Main.IIIlllIIIIll(IIIllIllIIllIll.N, IIlIlIlIll[2])) {
            lllIlIllIIllIll = llIIlIlIll[IIlIlIlIll[1]];
            "".length();
            if ("   ".length() > " ".length() << (" ".length() << " ".length())) {
                return null;
            }
        } else if (Main.lIIlllIIIIll(IIIllIllIIllIll.N % IIlIlIlIll[3]) && Main.IIIlllIIIIll(IIlIlIlIll[3], IIIllIllIIllIll.N) && Main.IIIlllIIIIll(IIIllIllIIllIll.N, IIlIlIlIll[4])) {
            lllIlIllIIllIll = llIIlIlIll[IIlIlIlIll[3]];
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        } else if (Main.lIIlllIIIIll(IIIllIllIIllIll.N % IIlIlIlIll[5]) && Main.IIIlllIIIIll(IIlIlIlIll[5], IIIllIllIIllIll.N) && Main.IIIlllIIIIll(IIIllIllIIllIll.N, IIlIlIlIll[6])) {
            lllIlIllIIllIll = llIIlIlIll[IIlIlIlIll[5]];
            "".length();
            if (-("   ".length() << (" ".length() << " ".length()) ^ (0x98 ^ 0x91)) >= 0) {
                return null;
            }
        } else if (Main.lIIlllIIIIll(IIIllIllIIllIll.N % IIlIlIlIll[7]) && Main.IIIlllIIIIll(IIlIlIlIll[7], IIIllIllIIllIll.N) && Main.IIIlllIIIIll(IIIllIllIIllIll.N, IIlIlIlIll[8])) {
            lllIlIllIIllIll = llIIlIlIll[IIlIlIlIll[7]];
            "".length();
            if (-" ".length() == " ".length() << (" ".length() << " ".length())) {
                return null;
            }
        } else if (Main.lIIlllIIIIll(IIIllIllIIllIll.N % IIlIlIlIll[9]) && Main.IIIlllIIIIll(IIlIlIlIll[9], IIIllIllIIllIll.N) && Main.IIIlllIIIIll(IIIllIllIIllIll.N, IIlIlIlIll[10])) {
            lllIlIllIIllIll = llIIlIlIll[IIlIlIlIll[9]];
            "".length();
            if (-" ".length() == ((6 ^ 0x37 ^ (6 ^ 0x3D) << " ".length()) & (109 + 107 - 126 + 159 ^ (0x52 ^ 0xD) << " ".length() ^ -" ".length()))) {
                return null;
            }
        } else if (Main.lIIlllIIIIll(IIIllIllIIllIll.N % IIlIlIlIll[11]) && Main.IIIlllIIIIll(IIlIlIlIll[11], IIIllIllIIllIll.N) && Main.IIIlllIIIIll(IIIllIllIIllIll.N, IIlIlIlIll[12])) {
            lllIlIllIIllIll = llIIlIlIll[IIlIlIlIll[11]];
            "".length();
            if (((0xBD ^ 0xA8) & ~(0xF ^ 0x1A)) != 0) {
                return null;
            }
        } else if (Main.lIIlllIIIIll(IIIllIllIIllIll.N % IIlIlIlIll[13]) && Main.IIIlllIIIIll(IIlIlIlIll[13], IIIllIllIIllIll.N) && Main.IIIlllIIIIll(IIIllIllIIllIll.N, IIlIlIlIll[14])) {
            lllIlIllIIllIll = llIIlIlIll[IIlIlIlIll[13]];
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        } else if (Main.lIIlllIIIIll(IIIllIllIIllIll.N % IIlIlIlIll[15]) && Main.IIIlllIIIIll(IIlIlIlIll[15], IIIllIllIIllIll.N) && Main.IIIlllIIIIll(IIIllIllIIllIll.N, IIlIlIlIll[16])) {
            lllIlIllIIllIll = llIIlIlIll[IIlIlIlIll[15]];
            "".length();
            if ((" ".length() << (0xB7 ^ 0xB2) & ~(" ".length() << (0xBD ^ 0xB8))) > " ".length() << " ".length()) {
                return null;
            }
        } else if (Main.lIIlllIIIIll(IIIllIllIIllIll.N % IIlIlIlIll[2]) && Main.IIIlllIIIIll(IIlIlIlIll[2], IIIllIllIIllIll.N) && Main.IIIlllIIIIll(IIIllIllIIllIll.N, IIlIlIlIll[17])) {
            string = llIIlIlIll[IIlIlIlIll[2]];
        }
        return string;
    }

    public void show(String lIlIlIllIIllIll) {
        System.out.println(lIlIlIllIIllIll);
    }

    static {
        Main.lllIllIIIIll();
        Main.IllIllIIIIll();
    }

    private static void IllIllIIIIll() {
        llIIlIlIll = new String[IIlIlIlIll[18]];
        Main.llIIlIlIll[Main.IIlIlIlIll[0]] = Main.llIIllIIIIll("XjEYoyiZYCM=", "ggirU");
        Main.llIIlIlIll[Main.IIlIlIlIll[1]] = Main.llIIllIIIIll("ei5e+mkmtbo=", "TVrZI");
        Main.llIIlIlIll[Main.IIlIlIlIll[3]] = Main.IIlIllIIIIll("IQYg", "xcSkZ");
        Main.llIIlIlIll[Main.IIlIlIlIll[5]] = Main.IIlIllIIIIll("Phc0", "grGqh");
        Main.llIIlIlIll[Main.IIlIlIlIll[7]] = Main.IIlIllIIIIll("EBYZ", "IsjUk");
        Main.llIIlIlIll[Main.IIlIlIlIll[9]] = Main.lIlIllIIIIll("riBDcDX9S7c=", "PGqAI");
        Main.llIIlIlIll[Main.IIlIlIlIll[11]] = Main.lIlIllIIIIll("mSd0r7FDErI=", "HrmPR");
        Main.llIIlIlIll[Main.IIlIlIlIll[13]] = Main.lIlIllIIIIll("NgsEa3b/GpQ=", "NNmdv");
        Main.llIIlIlIll[Main.IIlIlIlIll[15]] = Main.lIlIllIIIIll("m1KAiaogtZs=", "zjTXX");
        Main.llIIlIlIll[Main.IIlIlIlIll[2]] = Main.llIIllIIIIll("ENp26jwgHU0=", "TUOel");
    }

    private static String llIIllIIIIll(String IIIIlIllIIllIll, String llllIIllIIllIll) {
        try {
            SecretKeySpec IlllIIllIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIIllIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIIllIIllIll = Cipher.getInstance("Blowfish");
            lIllIIllIIllIll.init(IIlIlIlIll[3], IlllIIllIIllIll);
            return new String(lIllIIllIIllIll.doFinal(Base64.getDecoder().decode(IIIIlIllIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIllIIllIIllIll) {
            IIllIIllIIllIll.printStackTrace();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String IIlIllIIIIll(String IlllllIlIIllIll, String lIllllIlIIllIll) {
        IlllllIlIIllIll = new String(Base64.getDecoder().decode(IlllllIlIIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        IIllllIlIIllIll = new StringBuilder();
        llIlllIlIIllIll = lIllllIlIIllIll.toCharArray();
        IlIlllIlIIllIll = Main.IIlIlIlIll[0];
        IIIIllIlIIllIll = IlllllIlIIllIll.toCharArray();
        lIIIllIlIIllIll = IIIIllIlIIllIll.length;
        IlIIllIlIIllIll = Main.IIlIlIlIll[0];
        "".length();
        if ("   ".length() >= " ".length() << " ".length()) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            lIIlllIlIIllIll = IIIIllIlIIllIll[IlIIllIlIIllIll];
            IIllllIlIIllIll.append((char)(lIIlllIlIIllIll ^ llIlllIlIIllIll[IlIlllIlIIllIll % llIlllIlIIllIll.length]));
            "".length();
            ++IlIlllIlIIllIll;
            ++IlIIllIlIIllIll;
lbl19:
            // 2 sources

            ** while (!Main.IlIlllIIIIll((int)IlIIllIlIIllIll, (int)lIIIllIlIIllIll))
        }
lbl20:
        // 1 sources

        return String.valueOf(IIllllIlIIllIll);
    }

    private static String lIlIllIIIIll(String llIlIlIlIIllIll, String IlIlIlIlIIllIll) {
        try {
            SecretKeySpec lIIlIlIlIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlIlIlIlIIllIll.getBytes(StandardCharsets.UTF_8)), IIlIlIlIll[15]), "DES");
            Cipher IIIlIlIlIIllIll = Cipher.getInstance("DES");
            IIIlIlIlIIllIll.init(IIlIlIlIll[3], lIIlIlIlIIllIll);
            return new String(IIIlIlIlIIllIll.doFinal(Base64.getDecoder().decode(llIlIlIlIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIlIlIIllIll) {
            lllIIlIlIIllIll.printStackTrace();
            return null;
        }
    }

    private static void lllIllIIIIll() {
        IIlIlIlIll = new int[19];
        Main.IIlIlIlIll[0] = (0x1B ^ 0x3C) << " ".length() & ~((0x1B ^ 0x3C) << " ".length());
        Main.IIlIlIlIll[1] = " ".length();
        Main.IIlIlIlIll[2] = 0x2B ^ 0x22;
        Main.IIlIlIlIll[3] = " ".length() << " ".length();
        Main.IIlIlIlIll[4] = (0x8A ^ 0x83) << " ".length();
        Main.IIlIlIlIll[5] = "   ".length();
        Main.IIlIlIlIll[6] = 0xDE ^ 0xC5;
        Main.IIlIlIlIll[7] = " ".length() << (" ".length() << " ".length());
        Main.IIlIlIlIll[8] = (0xBA ^ 0xB3) << (" ".length() << " ".length());
        Main.IIlIlIlIll[9] = (0xA9 ^ 0xB8) << (" ".length() << " ".length()) ^ (0x4F ^ 0xE);
        Main.IIlIlIlIll[10] = " ".length() << (" ".length() << " ".length()) ^ (0x1C ^ 0x35);
        Main.IIlIlIlIll[11] = "   ".length() << " ".length();
        Main.IIlIlIlIll[12] = ((0x54 ^ 0x69) << " ".length() ^ (0x75 ^ 0x14)) << " ".length();
        Main.IIlIlIlIll[13] = 0x75 ^ 0x72;
        Main.IIlIlIlIll[14] = 0xAB ^ 0x94;
        Main.IIlIlIlIll[15] = " ".length() << "   ".length();
        Main.IIlIlIlIll[16] = (0x2F ^ 0x26) << "   ".length();
        Main.IIlIlIlIll[17] = 0x72 ^ 0x1D ^ (0x3B ^ 0x24) << " ".length();
        Main.IIlIlIlIll[18] = (0xA3 ^ 0xA6) << " ".length();
    }

    private static boolean IlIlllIIIIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIIlllIIIIll(int n, int n2) {
        return n <= n2;
    }

    private static boolean lIIlllIIIIll(int n) {
        return n == 0;
    }
}

