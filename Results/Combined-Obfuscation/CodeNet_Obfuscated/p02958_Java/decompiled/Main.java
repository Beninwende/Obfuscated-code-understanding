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
    private static final String TEST;
    Scanner sc;
    int N;
    int[] p;
    private static String[] IlIIllIIl;
    private static int[] llIIllIIl;

    public Main() {
        Main llIllIIllllIll;
        llIllIIllllIll.sc = new Scanner(System.in);
    }

    public Main(String lllIlIIllllIll) {
        Main IIIllIIllllIll;
        IIIllIIllllIll.sc = new Scanner(lllIlIIllllIll);
    }

    void out(Object lIlIlIIllllIll) {
        System.out.println(lIlIlIIllllIll);
        System.out.flush();
    }

    public void exec() throws Exception {
        Main llllIIIllllIll;
        llllIIIllllIll.N = llllIIIllllIll.sc.nextInt();
        llllIIIllllIll.p = new int[llllIIIllllIll.N];
        int IlllIIIllllIll22 = llIIllIIl[0];
        while (Main.IIllIIIIIIl(IlllIIIllllIll22, llllIIIllllIll.N)) {
            llllIIIllllIll.p[IlllIIIllllIll22] = llllIIIllllIll.sc.nextInt();
            ++IlllIIIllllIll22;
            "".length();
            if (" ".length() << (" ".length() << " ".length()) >= 0) continue;
            return;
        }
        int[] IlllIIIllllIll22 = new int[llIIllIIl[1]];
        int lIllIIIllllIll = llIIllIIl[0];
        int IIllIIIllllIll = llIIllIIl[0];
        while (Main.IIllIIIIIIl(IIllIIIllllIll, llllIIIllllIll.N - llIIllIIl[2])) {
            if (Main.lIllIIIIIIl(llllIIIllllIll.p[IIllIIIllllIll], llllIIIllllIll.p[IIllIIIllllIll + llIIllIIl[2]])) {
                IlllIIIllllIll22[lIllIIIllllIll++] = IIllIIIllllIll;
                if (Main.lIllIIIIIIl(lIllIIIllllIll, llIIllIIl[3])) {
                    "".length();
                    if (" ".length() == " ".length()) break;
                    return;
                }
            }
            ++IIllIIIllllIll;
            "".length();
            if (" ".length() << " ".length() > -" ".length()) continue;
            return;
        }
        switch (lIllIIIllllIll) {
            case 0: {
                llllIIIllllIll.out(IlIIllIIl[llIIllIIl[0]]);
                "".length();
                if (-(0x4F ^ 0x4B) <= 0) break;
                return;
            }
            case 1: {
                IIllIIIllllIll = IlllIIIllllIll22[llIIllIIl[0]];
                if (Main.IlllIIIIIIl(IIllIIIllllIll) && Main.lIllIIIIIIl(llllIIIllllIll.p[IIllIIIllllIll - llIIllIIl[2]], llllIIIllllIll.p[IIllIIIllllIll + llIIllIIl[2]])) {
                    llllIIIllllIll.out(IlIIllIIl[llIIllIIl[2]]);
                    return;
                }
                if (Main.IIllIIIIIIl(IIllIIIllllIll, llllIIIllllIll.N - llIIllIIl[3]) && Main.lIllIIIIIIl(llllIIIllllIll.p[IIllIIIllllIll], llllIIIllllIll.p[IIllIIIllllIll + llIIllIIl[3]])) {
                    llllIIIllllIll.out(IlIIllIIl[llIIllIIl[3]]);
                    return;
                }
                llllIIIllllIll.out(IlIIllIIl[llIIllIIl[1]]);
                return;
            }
            case 2: {
                IIllIIIllllIll = IlllIIIllllIll22[llIIllIIl[0]];
                int llIlIIIllllIll = IlllIIIllllIll22[llIIllIIl[2]];
                if (Main.IlllIIIIIIl(IIllIIIllllIll) && Main.lIllIIIIIIl(llllIIIllllIll.p[IIllIIIllllIll - llIIllIIl[2]], llllIIIllllIll.p[llIlIIIllllIll + llIIllIIl[2]])) {
                    llllIIIllllIll.out(IlIIllIIl[llIIllIIl[4]]);
                    return;
                }
                if (Main.lIllIIIIIIl(llllIIIllllIll.p[llIlIIIllllIll + llIIllIIl[2]], llllIIIllllIll.p[IIllIIIllllIll + llIIllIIl[2]])) {
                    llllIIIllllIll.out(IlIIllIIl[llIIllIIl[5]]);
                    return;
                }
                if (Main.IIllIIIIIIl(llIlIIIllllIll + llIIllIIl[2], llllIIIllllIll.N - llIIllIIl[2]) && Main.lIllIIIIIIl(llllIIIllllIll.p[IIllIIIllllIll], llllIIIllllIll.p[llIlIIIllllIll + llIIllIIl[3]])) {
                    llllIIIllllIll.out(IlIIllIIl[llIIllIIl[6]]);
                    return;
                }
                if (Main.lIllIIIIIIl(llllIIIllllIll.p[llIlIIIllllIll], llllIIIllllIll.p[IIllIIIllllIll])) {
                    llllIIIllllIll.out(IlIIllIIl[llIIllIIl[7]]);
                    return;
                }
                llllIIIllllIll.out(IlIIllIIl[llIIllIIl[8]]);
                return;
            }
            default: {
                llllIIIllllIll.out(IlIIllIIl[llIIllIIl[9]]);
                return;
            }
        }
    }

    public static void main(String[] stringArray) throws Exception {
        Main lIIlIIIllllIll = new Main();
        lIIlIIIllllIll.exec();
    }

    static {
        Main.llIlIIIIIIl();
        Main.IlIlIIIIIIl();
        TEST = IlIIllIIl[llIIllIIl[10]];
    }

    private static void IlIlIIIIIIl() {
        IlIIllIIl = new String[llIIllIIl[11]];
        Main.IlIIllIIl[Main.llIIllIIl[0]] = Main.lllIIIIIIIl("epEYlPMgEBs=", "AwrYR");
        Main.IlIIllIIl[Main.llIIllIIl[2]] = Main.lllIIIIIIIl("TACOGQcOt54=", "knNgg");
        Main.IlIIllIIl[Main.llIIllIIl[3]] = Main.IIIlIIIIIIl("if+ZWI6qHNM=", "kfWMK");
        Main.IlIIllIIl[Main.llIIllIIl[1]] = Main.lIIlIIIIIIl("LS4S", "tkAuv");
        Main.IlIIllIIl[Main.llIIllIIl[4]] = Main.lIIlIIIIIIl("OQQ=", "wKJCc");
        Main.IlIIllIIl[Main.llIIllIIl[5]] = Main.lllIIIIIIIl("AIPBGBjcFfk=", "RIJib");
        Main.IlIIllIIl[Main.llIIllIIl[6]] = Main.IIIlIIIIIIl("Gm86vxYikxU=", "nccqZ");
        Main.IlIIllIIl[Main.llIIllIIl[7]] = Main.lllIIIIIIIl("DbgxIgBQZdE=", "CBFVA");
        Main.IlIIllIIl[Main.llIIllIIl[8]] = Main.lllIIIIIIIl("v4JZlIQLM88=", "SJNvs");
        Main.IlIIllIIl[Main.llIIllIIl[9]] = Main.lllIIIIIIIl("kAvXAcix+lc=", "gQvaj");
        Main.IlIIllIIl[Main.llIIllIIl[10]] = Main.lIIlIIIIIIl("QlF1QmNVQmRWcUBRckJm", "uqDbQ");
    }

    private static String IIIlIIIIIIl(String IIlIIIIllllIll, String llIIIIIllllIll) {
        try {
            SecretKeySpec IlIIIIIllllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIIllllIll.getBytes(StandardCharsets.UTF_8)), llIIllIIl[8]), "DES");
            Cipher lIIIIIIllllIll = Cipher.getInstance("DES");
            lIIIIIIllllIll.init(llIIllIIl[3], IlIIIIIllllIll);
            return new String(lIIIIIIllllIll.doFinal(Base64.getDecoder().decode(IIlIIIIllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIIIIIllllIll) {
            IIIIIIIllllIll.printStackTrace();
            return null;
        }
    }

    private static String lllIIIIIIIl(String lllIlllIlllIll, String IllIlllIlllIll) {
        try {
            SecretKeySpec lIlIlllIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IllIlllIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IIlIlllIlllIll = Cipher.getInstance("Blowfish");
            IIlIlllIlllIll.init(llIIllIIl[3], lIlIlllIlllIll);
            return new String(IIlIlllIlllIll.doFinal(Base64.getDecoder().decode(lllIlllIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlllIlllIll) {
            llIIlllIlllIll.printStackTrace();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String lIIlIIIIIIl(String lIlIIllIlllIll, String IIlIIllIlllIll) {
        lIlIIllIlllIll = new String(Base64.getDecoder().decode(lIlIIllIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        llIIIllIlllIll = new StringBuilder();
        IlIIIllIlllIll = IIlIIllIlllIll.toCharArray();
        lIIIIllIlllIll = Main.llIIllIIl[0];
        lllIlIlIlllIll = lIlIIllIlllIll.toCharArray();
        IIIllIlIlllIll = lllIlIlIlllIll.length;
        lIIllIlIlllIll = Main.llIIllIIl[0];
        "".length();
        if (" ".length() << (" ".length() << " ".length()) >= " ".length()) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            IIIIIllIlllIll = lllIlIlIlllIll[lIIllIlIlllIll];
            llIIIllIlllIll.append((char)(IIIIIllIlllIll ^ IlIIIllIlllIll[lIIIIllIlllIll % IlIIIllIlllIll.length]));
            "".length();
            ++lIIIIllIlllIll;
            ++lIIllIlIlllIll;
lbl19:
            // 2 sources

            ** while (!Main.llllIIIIIIl((int)lIIllIlIlllIll, (int)IIIllIlIlllIll))
        }
lbl20:
        // 1 sources

        return String.valueOf(llIIIllIlllIll);
    }

    private static void llIlIIIIIIl() {
        llIIllIIl = new int[12];
        Main.llIIllIIl[0] = ((0x4C ^ 0x41) << " ".length() ^ (0x63 ^ 0x48)) << " ".length() & (((0xCF ^ 0xC0) << (" ".length() << (" ".length() << " ".length())) ^ 31 + 80 - 100 + 182) << " ".length() ^ -" ".length());
        Main.llIIllIIl[1] = "   ".length();
        Main.llIIllIIl[2] = " ".length();
        Main.llIIllIIl[3] = " ".length() << " ".length();
        Main.llIIllIIl[4] = " ".length() << (" ".length() << " ".length());
        Main.llIIllIIl[5] = 0x97 ^ 0x92;
        Main.llIIllIIl[6] = "   ".length() << " ".length();
        Main.llIIllIIl[7] = 64 + 71 - 107 + 103 ^ (0xB9 ^ 0x98) << (" ".length() << " ".length());
        Main.llIIllIIl[8] = " ".length() << "   ".length();
        Main.llIIllIIl[9] = 0x20 ^ 0x29;
        Main.llIIllIIl[10] = ((0xBA ^ 0xA9) << " ".length() ^ (0xE7 ^ 0xC4)) << " ".length();
        Main.llIIllIIl[11] = (0x4C ^ 0x7F) << (" ".length() << " ".length()) ^ 23 + 100 - 50 + 126;
    }

    private static boolean llllIIIIIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIllIIIIIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lIllIIIIIIl(int n, int n2) {
        return n > n2;
    }

    private static boolean IlllIIIIIIl(int n) {
        return n != 0;
    }
}

