/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    static int K;
    static int S;
    static final FastScanner sc;
    static PrintWriter writer;
    private static int[] IlllllIIll;
    private static String[] llllllIIll;
    private static int[] IlIIIIlIll;
    private static String[] llIIIIlIll;
    private static int[] IllIIIlIll;

    public Main() {
        Main llllIlIlllllIll;
    }

    public static void main(String[] stringArray) {
        K = sc.nextInt();
        S = sc.nextInt();
        writer.println(Main.g(S, K));
        writer.flush();
    }

    /*
     * WARNING - void declaration
     */
    private static int f(int IIIlIlIlllllIll, int lllIIlIlllllIll) {
        void var2_2;
        if (Main.llllIlllllIl(Main.lIlIlIllllIl(Main.llIIIIllllIl(IIIlIlIlllllIll) ? 1 : 0) ? 1 : 0)) {
            return IlllllIIll[IlIIIIlIll[IllIIIlIll[0]]];
        }
        int IllIIlIlllllIll = IlllllIIll[IlIIIIlIll[IllIIIlIll[0]]];
        int lIlIIlIlllllIll = IlllllIIll[IlIIIIlIll[IllIIIlIll[0]]];
        while (Main.llllIlllllIl(Main.lIlIlIllllIl(Main.IIlIIIllllIl(lIlIIlIlllllIll, lllIIlIlllllIll) ? 1 : 0) ? 1 : 0)) {
            if (Main.llllIlllllIl(Main.lIlIlIllllIl(Main.IIlIIIllllIl(IIIlIlIlllllIll - lIlIIlIlllllIll, lllIIlIlllllIll) ? 1 : 0) ? 1 : 0) && Main.llllIlllllIl(Main.lIlIlIllllIl(Main.lIlIIIllllIl(IIIlIlIlllllIll - lIlIIlIlllllIll) ? 1 : 0) ? 1 : 0)) {
                ++IllIIlIlllllIll;
            }
            ++lIlIIlIlllllIll;
            llllllIIll[IlIIIIlIll[IllIIIlIll[0]]].length();
            llIIIIlIll[IllIIIlIll[0]].length();
            if (!Main.llllIlllllIl(Main.IllIlIllllIl(llllllIIll[IlIIIIlIll[IllIIIlIll[1]]].length() << (llllllIIll[IlIIIIlIll[IllIIIlIll[2]]].length() << llllllIIll[IlIIIIlIll[IllIIIlIll[3]]].length()), llllllIIll[IlIIIIlIll[IllIIIlIll[4]]].length()) ? 1 : 0)) continue;
            return llllllIIll[IlIIIIlIll[IllIIIlIll[5]]].length() << (IlIIIIlIll[IllIIIlIll[6]] ^ IlIIIIlIll[IllIIIlIll[7]]) & (llllllIIll[IlIIIIlIll[IllIIIlIll[8]]].length() << (IlIIIIlIll[IllIIIlIll[9]] ^ IlIIIIlIll[IllIIIlIll[10]]) ^ IlIIIIlIll[IllIIIlIll[11]]);
        }
        return (int)var2_2;
    }

    /*
     * WARNING - void declaration
     */
    private static int g(int IIIllIIlllllIll, int lllIlIIlllllIll) {
        void var2_2;
        int IllIlIIlllllIll = IlllllIIll[IlIIIIlIll[IllIIIlIll[0]]];
        int lIlIlIIlllllIll = IlllllIIll[IlIIIIlIll[IllIIIlIll[0]]];
        while (Main.llllIlllllIl(Main.lIlIlIllllIl(Main.IIlIIIllllIl(lIlIlIIlllllIll, lllIlIIlllllIll) ? 1 : 0) ? 1 : 0)) {
            IllIlIIlllllIll += Main.f(IIIllIIlllllIll - lIlIlIIlllllIll, lllIlIIlllllIll);
            ++lIlIlIIlllllIll;
            llllllIIll[IlIIIIlIll[IllIIIlIll[12]]].length();
            llIIIIlIll[IllIIIlIll[1]].length();
            if (!Main.llllIlllllIl(Main.lllIlIllllIl(-llllllIIll[IlIIIIlIll[IllIIIlIll[13]]].length()) ? 1 : 0)) continue;
            return (IlIIIIlIll[IllIIIlIll[14]] ^ IlIIIIlIll[IllIIIlIll[6]]) & (IlIIIIlIll[IllIIIlIll[15]] ^ IlIIIIlIll[IllIIIlIll[7]] ^ IlIIIIlIll[IllIIIlIll[11]]);
        }
        return (int)var2_2;
    }

    static {
        Main.IlllIlllllIl();
        Main.lIllIlllllIl();
        Main.IIlIlIllllIl();
        Main.llIIlIllllIl();
        Main.IlIIIIllllIl();
        sc = new FastScanner(System.in);
        writer = new PrintWriter(System.out);
    }

    private static void IlIIIIllllIl() {
        IlllllIIll = new int[IlIIIIlIll[IllIIIlIll[1]]];
        Main.IlllllIIll[Main.IlIIIIlIll[Main.IllIIIlIll[0]]] = (IlIIIIlIll[IllIIIlIll[16]] + IlIIIIlIll[IllIIIlIll[17]] - IlIIIIlIll[IllIIIlIll[18]] + IlIIIIlIll[IllIIIlIll[19]] ^ (IlIIIIlIll[IllIIIlIll[20]] ^ IlIIIIlIll[IllIIIlIll[21]]) << (llllllIIll[IlIIIIlIll[IllIIIlIll[22]]].length() << (llllllIIll[IlIIIIlIll[IllIIIlIll[23]]].length() << llllllIIll[IlIIIIlIll[IllIIIlIll[24]]].length()))) << (llllllIIll[IlIIIIlIll[IllIIIlIll[25]]].length() << llllllIIll[IlIIIIlIll[IllIIIlIll[26]]].length()) & ((IlIIIIlIll[IllIIIlIll[27]] + IlIIIIlIll[IllIIIlIll[28]] - IlIIIIlIll[IllIIIlIll[29]] + IlIIIIlIll[IllIIIlIll[30]] ^ (IlIIIIlIll[IllIIIlIll[31]] ^ IlIIIIlIll[IllIIIlIll[32]]) << llllllIIll[IlIIIIlIll[IllIIIlIll[33]]].length()) << (llllllIIll[IlIIIIlIll[IllIIIlIll[34]]].length() << llllllIIll[IlIIIIlIll[IllIIIlIll[14]]].length()) ^ -llllllIIll[IlIIIIlIll[IllIIIlIll[35]]].length());
    }

    private static boolean IIlIIIllllIl(int n, int n2) {
        boolean bl;
        if (Main.llllIlllllIl(Main.IIIllIllllIl(n, n2) ? 1 : 0)) {
            bl = IlIIIIlIll[IllIIIlIll[1]];
            llIIIIlIll[IllIIIlIll[2]].length();
            "".length();
            if (Main.IIIIllllllIl(llIIIIlIll[IllIIIlIll[3]].length() << (llIIIIlIll[IllIIIlIll[4]].length() << llIIIIlIll[IllIIIlIll[5]].length()))) {
                return ((IllIIIlIll[36] ^ IllIIIlIll[37]) & (IllIIIlIll[38] ^ IllIIIlIll[39] ^ IllIIIlIll[40])) != 0;
            }
        } else {
            bl = IlIIIIlIll[IllIIIlIll[0]];
        }
        return bl;
    }

    private static boolean lIlIIIllllIl(int n) {
        boolean bl;
        if (Main.llllIlllllIl(Main.lllIlIllllIl(n) ? 1 : 0)) {
            bl = IlIIIIlIll[IllIIIlIll[1]];
            llIIIIlIll[IllIIIlIll[6]].length();
            "".length();
            if (Main.lIIIllllllIl(((IllIIIlIll[41] ^ IllIIIlIll[42]) << (llIIIIlIll[IllIIIlIll[7]].length() << llIIIIlIll[IllIIIlIll[8]].length()) ^ (IllIIIlIll[43] ^ IllIIIlIll[44])) << llIIIIlIll[IllIIIlIll[9]].length() & (((IllIIIlIll[45] ^ IllIIIlIll[46]) << (llIIIIlIll[IllIIIlIll[10]].length() << llIIIIlIll[IllIIIlIll[11]].length()) ^ (IllIIIlIll[38] ^ IllIIIlIll[36])) << llIIIIlIll[IllIIIlIll[12]].length() ^ -llIIIIlIll[IllIIIlIll[13]].length()), llIIIIlIll[IllIIIlIll[14]].length())) {
                return ((IllIIIlIll[47] ^ IllIIIlIll[48] ^ (IllIIIlIll[49] ^ IllIIIlIll[50]) << llIIIIlIll[IllIIIlIll[15]].length()) & ((IllIIIlIll[51] ^ IllIIIlIll[8]) << llIIIIlIll[IllIIIlIll[16]].length() ^ (IllIIIlIll[32] ^ IllIIIlIll[52]) ^ -llIIIIlIll[IllIIIlIll[17]].length())) != 0;
            }
        } else {
            bl = IlIIIIlIll[IllIIIlIll[0]];
        }
        return bl;
    }

    private static boolean llIIIIllllIl(int n) {
        boolean bl;
        if (Main.llllIlllllIl(Main.lIIllIllllIl(n) ? 1 : 0)) {
            bl = IlIIIIlIll[IllIIIlIll[1]];
            llIIIIlIll[IllIIIlIll[18]].length();
            "".length();
            if (Main.IlIIllllllIl(llIIIIlIll[IllIIIlIll[19]].length() << llIIIIlIll[IllIIIlIll[20]].length())) {
                return ((IllIIIlIll[53] ^ IllIIIlIll[54] ^ (IllIIIlIll[55] ^ IllIIIlIll[46]) << (llIIIIlIll[IllIIIlIll[21]].length() << llIIIIlIll[IllIIIlIll[22]].length())) & (IllIIIlIll[56] ^ IllIIIlIll[4] ^ (IllIIIlIll[57] ^ IllIIIlIll[58]) << llIIIIlIll[IllIIIlIll[23]].length() ^ -llIIIIlIll[IllIIIlIll[24]].length())) != 0;
            }
        } else {
            bl = IlIIIIlIll[IllIIIlIll[0]];
        }
        return bl;
    }

    private static void llIIlIllllIl() {
        llllllIIll = new String[IlIIIIlIll[IllIIIlIll[9]]];
        Main.llllllIIll[Main.IlIIIIlIll[Main.IllIIIlIll[0]]] = Main.IllIIIllllIl(llIIIIlIll[IllIIIlIll[25]], llIIIIlIll[IllIIIlIll[26]]);
        Main.llllllIIll[Main.IlIIIIlIll[Main.IllIIIlIll[1]]] = Main.lllIIIllllIl(llIIIIlIll[IllIIIlIll[27]], llIIIIlIll[IllIIIlIll[28]]);
        Main.llllllIIll[Main.IlIIIIlIll[Main.IllIIIlIll[2]]] = Main.IllIIIllllIl(llIIIIlIll[IllIIIlIll[29]], llIIIIlIll[IllIIIlIll[30]]);
        Main.llllllIIll[Main.IlIIIIlIll[Main.IllIIIlIll[3]]] = Main.IllIIIllllIl(llIIIIlIll[IllIIIlIll[31]], llIIIIlIll[IllIIIlIll[32]]);
        Main.llllllIIll[Main.IlIIIIlIll[Main.IllIIIlIll[4]]] = Main.lllIIIllllIl(llIIIIlIll[IllIIIlIll[33]], llIIIIlIll[IllIIIlIll[34]]);
        Main.llllllIIll[Main.IlIIIIlIll[Main.IllIIIlIll[5]]] = Main.lllIIIllllIl(llIIIIlIll[IllIIIlIll[35]], llIIIIlIll[IllIIIlIll[59]]);
        Main.llllllIIll[Main.IlIIIIlIll[Main.IllIIIlIll[8]]] = Main.IIIlIIllllIl(llIIIIlIll[IllIIIlIll[51]], llIIIIlIll[IllIIIlIll[60]]);
        Main.llllllIIll[Main.IlIIIIlIll[Main.IllIIIlIll[12]]] = Main.lllIIIllllIl(llIIIIlIll[IllIIIlIll[61]], llIIIIlIll[IllIIIlIll[62]]);
        Main.llllllIIll[Main.IlIIIIlIll[Main.IllIIIlIll[13]]] = Main.IIIlIIllllIl(llIIIIlIll[IllIIIlIll[63]], llIIIIlIll[IllIIIlIll[64]]);
        Main.llllllIIll[Main.IlIIIIlIll[Main.IllIIIlIll[22]]] = Main.lllIIIllllIl(llIIIIlIll[IllIIIlIll[65]], llIIIIlIll[IllIIIlIll[66]]);
        Main.llllllIIll[Main.IlIIIIlIll[Main.IllIIIlIll[23]]] = Main.IIIlIIllllIl(llIIIIlIll[IllIIIlIll[67]], llIIIIlIll[IllIIIlIll[68]]);
        Main.llllllIIll[Main.IlIIIIlIll[Main.IllIIIlIll[24]]] = Main.lllIIIllllIl(llIIIIlIll[IllIIIlIll[69]], llIIIIlIll[IllIIIlIll[70]]);
        Main.llllllIIll[Main.IlIIIIlIll[Main.IllIIIlIll[25]]] = Main.lllIIIllllIl(llIIIIlIll[IllIIIlIll[71]], llIIIIlIll[IllIIIlIll[72]]);
        Main.llllllIIll[Main.IlIIIIlIll[Main.IllIIIlIll[26]]] = Main.IllIIIllllIl(llIIIIlIll[IllIIIlIll[73]], llIIIIlIll[IllIIIlIll[74]]);
        Main.llllllIIll[Main.IlIIIIlIll[Main.IllIIIlIll[33]]] = Main.IllIIIllllIl(llIIIIlIll[IllIIIlIll[75]], llIIIIlIll[IllIIIlIll[76]]);
        Main.llllllIIll[Main.IlIIIIlIll[Main.IllIIIlIll[34]]] = Main.IIIlIIllllIl(llIIIIlIll[IllIIIlIll[56]], llIIIIlIll[IllIIIlIll[77]]);
        Main.llllllIIll[Main.IlIIIIlIll[Main.IllIIIlIll[14]]] = Main.IIIlIIllllIl(llIIIIlIll[IllIIIlIll[78]], llIIIIlIll[IllIIIlIll[79]]);
        Main.llllllIIll[Main.IlIIIIlIll[Main.IllIIIlIll[35]]] = Main.lllIIIllllIl(llIIIIlIll[IllIIIlIll[80]], llIIIIlIll[IllIIIlIll[81]]);
    }

    private static String lllIIIllllIl(String IIIllllIllllIll, String lllIlllIllllIll) {
        try {
            SecretKeySpec IllIlllIllllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(llIIIIlIll[IllIIIlIll[82]]).digest(lllIlllIllllIll.getBytes(StandardCharsets.UTF_8)), IlIIIIlIll[IllIIIlIll[13]]), llIIIIlIll[IllIIIlIll[83]]);
            Cipher lIlIlllIllllIll = Cipher.getInstance(llIIIIlIll[IllIIIlIll[84]]);
            lIlIlllIllllIll.init(IlIIIIlIll[IllIIIlIll[2]], IllIlllIllllIll);
            return new String(lIlIlllIllllIll.doFinal(Base64.getDecoder().decode(IIIllllIllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIlIlllIllllIll) {
            IIlIlllIllllIll.printStackTrace();
            return null;
        }
    }

    private static String IIIlIIllllIl(String lllIIllIllllIll, String IllIIllIllllIll) {
        try {
            SecretKeySpec lIlIIllIllllIll = new SecretKeySpec(MessageDigest.getInstance(llIIIIlIll[IllIIIlIll[85]]).digest(IllIIllIllllIll.getBytes(StandardCharsets.UTF_8)), llIIIIlIll[IllIIIlIll[55]]);
            Cipher IIlIIllIllllIll = Cipher.getInstance(llIIIIlIll[IllIIIlIll[86]]);
            IIlIIllIllllIll.init(IlIIIIlIll[IllIIIlIll[2]], lIlIIllIllllIll);
            return new String(IIlIIllIllllIll.doFinal(Base64.getDecoder().decode(lllIIllIllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIllIllllIll) {
            llIIIllIllllIll.printStackTrace();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String IllIIIllllIl(String lIIIlIlIllllIll, String IIIIlIlIllllIll) {
        lIIIlIlIllllIll = new String(Base64.getDecoder().decode(lIIIlIlIllllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        llllIIlIllllIll = new StringBuilder();
        IlllIIlIllllIll = IIIIlIlIllllIll.toCharArray();
        lIllIIlIllllIll = Main.IlIIIIlIll[Main.IllIIIlIll[0]];
        llIIIIlIllllIll = lIIIlIlIllllIll.toCharArray();
        IIlIIIlIllllIll = llIIIIlIllllIll.length;
        lIlIIIlIllllIll = Main.IlIIIIlIll[Main.IllIIIlIll[0]];
        Main.llIIIIlIll[Main.IllIIIlIll[52]].length();
        "".length();
        if (!Main.IIIIllllllIl(Main.llIIIIlIll[Main.IllIIIlIll[87]].length() << (Main.llIIIIlIll[Main.IllIIIlIll[45]].length() << Main.llIIIIlIll[Main.IllIIIlIll[88]].length()))) ** GOTO lbl21
        return null;
lbl-1000:
        // 1 sources

        {
            IIllIIlIllllIll = llIIIIlIllllIll[lIlIIIlIllllIll];
            llllIIlIllllIll.append((char)(IIllIIlIllllIll ^ IlllIIlIllllIll[lIllIIlIllllIll % IlllIIlIllllIll.length]));
            Main.llIIIIlIll[Main.IllIIIlIll[89]].length();
            ++lIllIIlIllllIll;
            ++lIlIIIlIllllIll;
lbl21:
            // 2 sources

            ** while (!Main.llllIlllllIl((int)Main.IlIllIllllIl((int)lIlIIIlIllllIll, (int)IIlIIIlIllllIll)))
        }
lbl22:
        // 1 sources

        return String.valueOf(llllIIlIllllIll);
    }

    private static void IIlIlIllllIl() {
        IlIIIIlIll = new int[IllIIIlIll[59]];
        Main.IlIIIIlIll[Main.IllIIIlIll[0]] = (IllIIIlIll[90] ^ IllIIIlIll[91] ^ (IllIIIlIll[18] ^ IllIIIlIll[21]) << llIIIIlIll[IllIIIlIll[90]].length()) & (IllIIIlIll[3] ^ IllIIIlIll[92] ^ (IllIIIlIll[72] ^ IllIIIlIll[69]) << (llIIIIlIll[IllIIIlIll[93]].length() << llIIIIlIll[IllIIIlIll[46]].length()) ^ -llIIIIlIll[IllIIIlIll[94]].length());
        Main.IlIIIIlIll[Main.IllIIIlIll[1]] = llIIIIlIll[IllIIIlIll[95]].length();
        Main.IlIIIIlIll[Main.IllIIIlIll[2]] = llIIIIlIll[IllIIIlIll[96]].length() << llIIIIlIll[IllIIIlIll[97]].length();
        Main.IlIIIIlIll[Main.IllIIIlIll[3]] = llIIIIlIll[IllIIIlIll[98]].length();
        Main.IlIIIIlIll[Main.IllIIIlIll[4]] = llIIIIlIll[IllIIIlIll[99]].length() << (llIIIIlIll[IllIIIlIll[100]].length() << llIIIIlIll[IllIIIlIll[101]].length());
        Main.IlIIIIlIll[Main.IllIIIlIll[5]] = IllIIIlIll[24] ^ IllIIIlIll[29];
        Main.IlIIIIlIll[Main.IllIIIlIll[6]] = IllIIIlIll[102] ^ IllIIIlIll[103];
        Main.IlIIIIlIll[Main.IllIIIlIll[7]] = llIIIIlIll[IllIIIlIll[104]].length() << (llIIIIlIll[IllIIIlIll[105]].length() << (llIIIIlIll[IllIIIlIll[50]].length() << llIIIIlIll[IllIIIlIll[92]].length()));
        Main.IlIIIIlIll[Main.IllIIIlIll[8]] = llIIIIlIll[IllIIIlIll[106]].length() << llIIIIlIll[IllIIIlIll[107]].length();
        Main.IlIIIIlIll[Main.IllIIIlIll[9]] = (IllIIIlIll[108] ^ IllIIIlIll[109]) << llIIIIlIll[IllIIIlIll[110]].length();
        Main.IlIIIIlIll[Main.IllIIIlIll[10]] = IllIIIlIll[111] ^ IllIIIlIll[112];
        Main.IlIIIIlIll[Main.IllIIIlIll[11]] = -llIIIIlIll[IllIIIlIll[113]].length();
        Main.IlIIIIlIll[Main.IllIIIlIll[12]] = IllIIIlIll[114] ^ IllIIIlIll[115];
        Main.IlIIIIlIll[Main.IllIIIlIll[13]] = llIIIIlIll[IllIIIlIll[116]].length() << llIIIIlIll[IllIIIlIll[117]].length();
        Main.IlIIIIlIll[Main.IllIIIlIll[14]] = llIIIIlIll[IllIIIlIll[118]].length() << (llIIIIlIll[IllIIIlIll[119]].length() << (llIIIIlIll[IllIIIlIll[120]].length() << llIIIIlIll[IllIIIlIll[121]].length()));
        Main.IlIIIIlIll[Main.IllIIIlIll[15]] = (IllIIIlIll[117] ^ IllIIIlIll[116]) << (llIIIIlIll[IllIIIlIll[122]].length() << llIIIIlIll[IllIIIlIll[123]].length()) ^ (IllIIIlIll[116] ^ IllIIIlIll[101]);
        Main.IlIIIIlIll[Main.IllIIIlIll[16]] = (IllIIIlIll[97] ^ IllIIIlIll[15]) << llIIIIlIll[IllIIIlIll[124]].length();
        Main.IlIIIIlIll[Main.IllIIIlIll[17]] = (IllIIIlIll[103] ^ IllIIIlIll[125]) << llIIIIlIll[IllIIIlIll[49]].length();
        Main.IlIIIIlIll[Main.IllIIIlIll[18]] = ((IllIIIlIll[42] ^ IllIIIlIll[68]) << llIIIIlIll[IllIIIlIll[126]].length() ^ IllIIIlIll[68] + IllIIIlIll[63] - IllIIIlIll[127] + IllIIIlIll[11]) << llIIIIlIll[IllIIIlIll[111]].length();
        Main.IlIIIIlIll[Main.IllIIIlIll[19]] = IllIIIlIll[128] + IllIIIlIll[129] - IllIIIlIll[130] + IllIIIlIll[38] ^ (IllIIIlIll[131] ^ IllIIIlIll[132]) << llIIIIlIll[IllIIIlIll[91]].length();
        Main.IlIIIIlIll[Main.IllIIIlIll[20]] = IllIIIlIll[60] ^ IllIIIlIll[25];
        Main.IlIIIIlIll[Main.IllIIIlIll[21]] = (llIIIIlIll[IllIIIlIll[133]].length() ^ (IllIIIlIll[1] ^ IllIIIlIll[6]) << llIIIIlIll[IllIIIlIll[134]].length()) << (llIIIIlIll[IllIIIlIll[135]].length() << llIIIIlIll[IllIIIlIll[42]].length());
        Main.IlIIIIlIll[Main.IllIIIlIll[22]] = IllIIIlIll[10] ^ IllIIIlIll[3];
        Main.IlIIIIlIll[Main.IllIIIlIll[23]] = (IllIIIlIll[136] + IllIIIlIll[134] - IllIIIlIll[137] + IllIIIlIll[22] ^ (IllIIIlIll[70] ^ IllIIIlIll[138]) << llIIIIlIll[IllIIIlIll[139]].length()) << llIIIIlIll[IllIIIlIll[140]].length();
        Main.IlIIIIlIll[Main.IllIIIlIll[24]] = IllIIIlIll[68] ^ IllIIIlIll[51];
        Main.IlIIIIlIll[Main.IllIIIlIll[25]] = llIIIIlIll[IllIIIlIll[141]].length() << (llIIIIlIll[IllIIIlIll[142]].length() << llIIIIlIll[IllIIIlIll[143]].length());
        Main.IlIIIIlIll[Main.IllIIIlIll[26]] = (IllIIIlIll[144] ^ IllIIIlIll[145]) & (IllIIIlIll[146] ^ IllIIIlIll[147] ^ IllIIIlIll[40]) ^ (IllIIIlIll[140] ^ IllIIIlIll[121]);
        Main.IlIIIIlIll[Main.IllIIIlIll[27]] = llIIIIlIll[IllIIIlIll[112]].length() << (IllIIIlIll[24] ^ IllIIIlIll[29]);
        Main.IlIIIIlIll[Main.IllIIIlIll[28]] = IllIIIlIll[148] + IllIIIlIll[11] - IllIIIlIll[59] + IllIIIlIll[76] + ((IllIIIlIll[24] ^ IllIIIlIll[15]) << llIIIIlIll[IllIIIlIll[149]].length()) - ((IllIIIlIll[0] ^ IllIIIlIll[65]) << (llIIIIlIll[IllIIIlIll[150]].length() << llIIIIlIll[IllIIIlIll[151]].length())) + ((IllIIIlIll[152] ^ IllIIIlIll[153]) << llIIIIlIll[IllIIIlIll[137]].length());
        Main.IlIIIIlIll[Main.IllIIIlIll[29]] = IllIIIlIll[23] + IllIIIlIll[24] - IllIIIlIll[127] + IllIIIlIll[45] + (IllIIIlIll[120] ^ IllIIIlIll[72]) - (IllIIIlIll[154] + IllIIIlIll[55] - IllIIIlIll[18] + IllIIIlIll[76]) + ((IllIIIlIll[143] ^ IllIIIlIll[31]) << llIIIIlIll[IllIIIlIll[41]].length());
        Main.IlIIIIlIll[Main.IllIIIlIll[30]] = IllIIIlIll[73] + IllIIIlIll[155] - IllIIIlIll[115] + IllIIIlIll[156];
        Main.IlIIIIlIll[Main.IllIIIlIll[31]] = IllIIIlIll[45] ^ IllIIIlIll[0];
        Main.IlIIIIlIll[Main.IllIIIlIll[32]] = (IllIIIlIll[24] ^ IllIIIlIll[78] ^ (IllIIIlIll[157] ^ IllIIIlIll[158]) << llIIIIlIll[IllIIIlIll[159]].length()) << llIIIIlIll[IllIIIlIll[160]].length();
        Main.IlIIIIlIll[Main.IllIIIlIll[33]] = ((IllIIIlIll[0] ^ IllIIIlIll[21]) << llIIIIlIll[IllIIIlIll[161]].length() ^ IllIIIlIll[16] + IllIIIlIll[64] - IllIIIlIll[162] + IllIIIlIll[22]) << llIIIIlIll[IllIIIlIll[163]].length();
        Main.IlIIIIlIll[Main.IllIIIlIll[34]] = (IllIIIlIll[92] ^ IllIIIlIll[94]) << (llIIIIlIll[IllIIIlIll[138]].length() << llIIIIlIll[IllIIIlIll[164]].length()) ^ (IllIIIlIll[141] ^ IllIIIlIll[21]);
        Main.IlIIIIlIll[Main.IllIIIlIll[35]] = IllIIIlIll[110] ^ IllIIIlIll[68] ^ (IllIIIlIll[22] ^ IllIIIlIll[51]) << llIIIIlIll[IllIIIlIll[165]].length();
    }

    private static boolean IlIllIllllIl(int n, int n2) {
        boolean bl;
        if (Main.llIIllllllIl(n, n2)) {
            bl = IllIIIlIll[1];
            "".length();
            if ((" ".length() << (0x75 ^ 0x70) & ~(" ".length() << (9 ^ 0xC))) != 0) {
                return ((0x7E ^ 0x23) & ~(0x64 ^ 0x39)) != 0;
            }
        } else {
            bl = IllIIIlIll[0];
        }
        return bl;
    }

    private static boolean IllIlIllllIl(int n, int n2) {
        boolean bl;
        if (Main.IIlIllllllIl(n, n2)) {
            bl = IllIIIlIll[1];
            "".length();
            if (((200 + 204 - 207 + 44 ^ "   ".length() << ("   ".length() << " ".length())) & ((0xDC ^ 0x8D) << " ".length() ^ 107 + 28 - 16 + 28 ^ -" ".length())) != 0) {
                return (("   ".length() << (" ".length() << " ".length()) ^ (0x54 ^ 0x11)) & (0x89 ^ 0xBC ^ (0x31 ^ 0x2E) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
            }
        } else {
            bl = IllIIIlIll[0];
        }
        return bl;
    }

    private static boolean IIIllIllllIl(int n, int n2) {
        boolean bl;
        if (Main.lIlIllllllIl(n, n2)) {
            bl = IllIIIlIll[1];
            "".length();
            if (-"  ".length() > 0) {
                return ((76 + 35 - -30 + 42 ^ (0x4F ^ 0x12) << " ".length()) & (0xA0 ^ 0xB3 ^ (0xAA ^ 0xA5) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = IllIIIlIll[0];
        }
        return bl;
    }

    private static boolean lIlIlIllllIl(int n) {
        boolean bl;
        if (Main.llllIlllllIl(n)) {
            bl = IllIIIlIll[1];
            "".length();
            if ("   ".length() < 0) {
                return ((0x94 ^ 0x9F) << "   ".length() & ~((0x68 ^ 0x63) << "   ".length())) != 0;
            }
        } else {
            bl = IllIIIlIll[0];
        }
        return bl;
    }

    private static boolean lllIlIllllIl(int n) {
        boolean bl;
        if (Main.IllIllllllIl(n)) {
            bl = IllIIIlIll[1];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) != " ".length() << (" ".length() << " ".length())) {
                return ((0xD ^ 0x28) << " ".length() & ~((0x3A ^ 0x1F) << " ".length())) != 0;
            }
        } else {
            bl = IllIIIlIll[0];
        }
        return bl;
    }

    private static boolean lIIllIllllIl(int n) {
        boolean bl;
        if (Main.IIIIllllllIl(n)) {
            bl = IllIIIlIll[1];
            "".length();
            if ("   ".length() == 0) {
                return (((0x5C ^ 0x59) << " ".length() ^ (0x8E ^ 0xA7)) << " ".length() & ((12 + 128 - 130 + 151 ^ (0xCF ^ 0x8E) << " ".length()) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = IllIIIlIll[0];
        }
        return bl;
    }

    private static void lIllIlllllIl() {
        llIIIIlIll = new String[IllIIIlIll[148]];
        Main.llIIIIlIll[Main.IllIIIlIll[0]] = Main.llIllIllllIl("N53byjTvOIo=", "mdvtl");
        Main.llIIIIlIll[Main.IllIIIlIll[1]] = Main.llIllIllllIl("VziJWsyA6Wc=", "owPrK");
        Main.llIIIIlIll[Main.IllIIIlIll[2]] = Main.IIlllIllllIl("", "wiziJ");
        Main.llIIIIlIll[Main.IllIIIlIll[3]] = Main.llIllIllllIl("CgUu50i0peU=", "YaHxn");
        Main.llIIIIlIll[Main.IllIIIlIll[4]] = Main.llIllIllllIl("mn67/ne5rQ0=", "DMHHQ");
        Main.llIIIIlIll[Main.IllIIIlIll[5]] = Main.llIllIllllIl("o3XDUUgTKtw=", "nFZUX");
        Main.llIIIIlIll[Main.IllIIIlIll[6]] = Main.IIlllIllllIl("", "RMSvP");
        Main.llIIIIlIll[Main.IllIIIlIll[7]] = Main.IIlllIllllIl("bg==", "NiPmq");
        Main.llIIIIlIll[Main.IllIIIlIll[8]] = Main.IIlllIllllIl("bQ==", "MjzlO");
        Main.llIIIIlIll[Main.IllIIIlIll[9]] = Main.IIlllIllllIl("Qg==", "bTYHp");
        Main.llIIIIlIll[Main.IllIIIlIll[10]] = Main.llIllIllllIl("7NDCEQnq3qI=", "PFjbX");
        Main.llIIIIlIll[Main.IllIIIlIll[11]] = Main.lIlllIllllIl("pVfnRU33b1M=", "aJgQG");
        Main.llIIIIlIll[Main.IllIIIlIll[12]] = Main.lIlllIllllIl("zPOGMfPWumY=", "BKrsq");
        Main.llIIIIlIll[Main.IllIIIlIll[13]] = Main.llIllIllllIl("5scSZQuYW/k=", "KYaTv");
        Main.llIIIIlIll[Main.IllIIIlIll[14]] = Main.lIlllIllllIl("xY6bMTzAQdo=", "wXKaX");
        Main.llIIIIlIll[Main.IllIIIlIll[15]] = Main.llIllIllllIl("8p5eHiXndYY=", "FJYNx");
        Main.llIIIIlIll[Main.IllIIIlIll[16]] = Main.lIlllIllllIl("//r6gOFvRBM=", "vyUlU");
        Main.llIIIIlIll[Main.IllIIIlIll[17]] = Main.IIlllIllllIl("eg==", "ZzItG");
        Main.llIIIIlIll[Main.IllIIIlIll[18]] = Main.llIllIllllIl("jYKrBU9xbVo=", "iePlr");
        Main.llIIIIlIll[Main.IllIIIlIll[19]] = Main.lIlllIllllIl("w2ejxkR8VDc=", "rGORq");
        Main.llIIIIlIll[Main.IllIIIlIll[20]] = Main.IIlllIllllIl("dg==", "VVAQR");
        Main.llIIIIlIll[Main.IllIIIlIll[21]] = Main.llIllIllllIl("MvZedvCnfGQ=", "TVDED");
        Main.llIIIIlIll[Main.IllIIIlIll[22]] = Main.lIlllIllllIl("pN+wHKHx1Ng=", "HYEnf");
        Main.llIIIIlIll[Main.IllIIIlIll[23]] = Main.IIlllIllllIl("ZA==", "DRDwx");
        Main.llIIIIlIll[Main.IllIIIlIll[24]] = Main.lIlllIllllIl("ExpuMy6lRng=", "QXAmP");
        Main.llIIIIlIll[Main.IllIIIlIll[25]] = Main.llIllIllllIl("rXgDJFR0ZFg=", "BJnaE");
        Main.llIIIIlIll[Main.IllIIIlIll[26]] = Main.lIlllIllllIl("R1UTzKtNS1E=", "nXzNv");
        Main.llIIIIlIll[Main.IllIIIlIll[27]] = Main.llIllIllllIl("W/HzGpXFC6Ht5DGt3nO5aA==", "lBOAZ");
        Main.llIIIIlIll[Main.IllIIIlIll[28]] = Main.llIllIllllIl("hmUQkWI2t9U=", "eIlVo");
        Main.llIIIIlIll[Main.IllIIIlIll[29]] = Main.IIlllIllllIl("NgxKWg==", "SkwgF");
        Main.llIIIIlIll[Main.IllIIIlIll[30]] = Main.lIlllIllllIl("GQjqunuwAe8=", "rZvVF");
        Main.llIIIIlIll[Main.IllIIIlIll[31]] = Main.IIlllIllllIl("IxRVdA==", "tshIW");
        Main.llIIIIlIll[Main.IllIIIlIll[32]] = Main.lIlllIllllIl("ubazPrVEWDw=", "OuJBX");
        Main.llIIIIlIll[Main.IllIIIlIll[33]] = Main.llIllIllllIl("Xq1i4HacY2pDKiU17bvVHg==", "yxAHY");
        Main.llIIIIlIll[Main.IllIIIlIll[34]] = Main.lIlllIllllIl("axxXIwQh5nU=", "IVYMv");
        Main.llIIIIlIll[Main.IllIIIlIll[35]] = Main.llIllIllllIl("FWXL+2mOu+2fOwcrjfRWnQ==", "zCQYT");
        Main.llIIIIlIll[Main.IllIIIlIll[59]] = Main.llIllIllllIl("HU43rISZ5fw=", "CCqLA");
        Main.llIIIIlIll[Main.IllIIIlIll[51]] = Main.lIlllIllllIl("N1SGz/p9IM3oHlOlPph9BQ==", "nSPHC");
        Main.llIIIIlIll[Main.IllIIIlIll[60]] = Main.IIlllIllllIl("PTA3PBc=", "NJnVU");
        Main.llIIIIlIll[Main.IllIIIlIll[61]] = Main.lIlllIllllIl("+akApwiormyc7vRNqZzftA==", "ypQuQ");
        Main.llIIIIlIll[Main.IllIIIlIll[62]] = Main.lIlllIllllIl("VGi0p8W1PDY=", "BPmjx");
        Main.llIIIIlIll[Main.IllIIIlIll[63]] = Main.llIllIllllIl("TCtnmdZteu7cnMCJeGMQLA==", "udTSt");
        Main.llIIIIlIll[Main.IllIIIlIll[64]] = Main.IIlllIllllIl("EjsMCTQ=", "ykifq");
        Main.llIIIIlIll[Main.IllIIIlIll[65]] = Main.lIlllIllllIl("NP7LfWpuN9KBb4326kj6pA==", "BpsWV");
        Main.llIIIIlIll[Main.IllIIIlIll[66]] = Main.IIlllIllllIl("Bhk5Kj8=", "UTtrr");
        Main.llIIIIlIll[Main.IllIIIlIll[67]] = Main.IIlllIllllIl("fj41aR8+HRY1H35H", "FzcPY");
        Main.llIIIIlIll[Main.IllIIIlIll[68]] = Main.IIlllIllllIl("GxAIAxs=", "CslAZ");
        Main.llIIIIlIll[Main.IllIIIlIll[69]] = Main.llIllIllllIl("vESSt+3gMoQGsU1U3PvM6Q==", "NGnXV");
        Main.llIIIIlIll[Main.IllIIIlIll[70]] = Main.lIlllIllllIl("+Qhpbfltb5I=", "kmPwC");
        Main.llIIIIlIll[Main.IllIIIlIll[71]] = Main.IIlllIllllIl("PSkAfSR4EA42NnxM", "HqJRq");
        Main.llIIIIlIll[Main.IllIIIlIll[72]] = Main.IIlllIllllIl("IxQ9OCA=", "ldXBC");
        Main.llIIIIlIll[Main.IllIIIlIll[73]] = Main.llIllIllllIl("wsrilIFx7C8=", "WInSy");
        Main.llIIIIlIll[Main.IllIIIlIll[74]] = Main.lIlllIllllIl("0+3AeYtD8pg=", "jmlVm");
        Main.llIIIIlIll[Main.IllIIIlIll[75]] = Main.IIlllIllllIl("EB5NcQ==", "rOpLf");
        Main.llIIIIlIll[Main.IllIIIlIll[76]] = Main.lIlllIllllIl("2i/4YOpTo1M=", "VlRtC");
        Main.llIIIIlIll[Main.IllIIIlIll[56]] = Main.lIlllIllllIl("AW4jgL+WSFdVqMhkGQQwZg==", "Fbrog");
        Main.llIIIIlIll[Main.IllIIIlIll[77]] = Main.llIllIllllIl("imgZ8t8XvKU=", "kQYtH");
        Main.llIIIIlIll[Main.IllIIIlIll[78]] = Main.llIllIllllIl("zivyY9K2kS5yj9AVOcbkFA==", "blMZR");
        Main.llIIIIlIll[Main.IllIIIlIll[79]] = Main.llIllIllllIl("F4dacEemydc=", "iBRhj");
        Main.llIIIIlIll[Main.IllIIIlIll[80]] = Main.lIlllIllllIl("cdi7kqWUG6aiiUHNMbJPUA==", "XktIa");
        Main.llIIIIlIll[Main.IllIIIlIll[81]] = Main.lIlllIllllIl("wz5zlqSLjj4=", "IFCvz");
        Main.llIIIIlIll[Main.IllIIIlIll[82]] = Main.IIlllIllllIl("ACNR", "MgdAq");
        Main.llIIIIlIll[Main.IllIIIlIll[83]] = Main.llIllIllllIl("7zRKYmjb35c=", "HtKee");
        Main.llIIIIlIll[Main.IllIIIlIll[84]] = Main.IIlllIllllIl("BiI6", "BgiuW");
        Main.llIIIIlIll[Main.IllIIIlIll[85]] = Main.IIlllIllllIl("NDxQ", "yxeID");
        Main.llIIIIlIll[Main.IllIIIlIll[55]] = Main.IIlllIllllIl("FCQfIhE/Oxg=", "VHpUw");
        Main.llIIIIlIll[Main.IllIIIlIll[86]] = Main.lIlllIllllIl("k3AwJk/zgyVrP1BYUamrNA==", "zxAtU");
        Main.llIIIIlIll[Main.IllIIIlIll[52]] = Main.IIlllIllllIl("", "SIRvk");
        Main.llIIIIlIll[Main.IllIIIlIll[87]] = Main.IIlllIllllIl("dw==", "WpOSr");
        Main.llIIIIlIll[Main.IllIIIlIll[45]] = Main.llIllIllllIl("NJXBtVD08Z4=", "soTsB");
        Main.llIIIIlIll[Main.IllIIIlIll[88]] = Main.IIlllIllllIl("VA==", "tEPFT");
        Main.llIIIIlIll[Main.IllIIIlIll[89]] = Main.IIlllIllllIl("", "TDLfw");
        Main.llIIIIlIll[Main.IllIIIlIll[90]] = Main.IIlllIllllIl("Rw==", "gNgYr");
        Main.llIIIIlIll[Main.IllIIIlIll[93]] = Main.lIlllIllllIl("9JFp/x1CRRo=", "VJbDN");
        Main.llIIIIlIll[Main.IllIIIlIll[46]] = Main.IIlllIllllIl("Yw==", "ChFwz");
        Main.llIIIIlIll[Main.IllIIIlIll[94]] = Main.IIlllIllllIl("WA==", "xkplB");
        Main.llIIIIlIll[Main.IllIIIlIll[95]] = Main.IIlllIllllIl("Yg==", "BRWRR");
        Main.llIIIIlIll[Main.IllIIIlIll[96]] = Main.llIllIllllIl("NDfXlXRoOqM=", "LQGhv");
        Main.llIIIIlIll[Main.IllIIIlIll[97]] = Main.lIlllIllllIl("LTDfsoPXPKE=", "ttahm");
        Main.llIIIIlIll[Main.IllIIIlIll[98]] = Main.lIlllIllllIl("DXtusRk3G0w=", "BHCyi");
        Main.llIIIIlIll[Main.IllIIIlIll[99]] = Main.IIlllIllllIl("Sw==", "kRunV");
        Main.llIIIIlIll[Main.IllIIIlIll[100]] = Main.lIlllIllllIl("e8IT0IngQ/c=", "eQjQH");
        Main.llIIIIlIll[Main.IllIIIlIll[101]] = Main.llIllIllllIl("m9IT26DyAGY=", "JaMdV");
        Main.llIIIIlIll[Main.IllIIIlIll[104]] = Main.llIllIllllIl("MDypf2k7wHo=", "XGlhe");
        Main.llIIIIlIll[Main.IllIIIlIll[105]] = Main.llIllIllllIl("4/RaQscVKG8=", "OELto");
        Main.llIIIIlIll[Main.IllIIIlIll[50]] = Main.llIllIllllIl("XL6qf0cekUU=", "CysaG");
        Main.llIIIIlIll[Main.IllIIIlIll[92]] = Main.IIlllIllllIl("Rg==", "fTfjW");
        Main.llIIIIlIll[Main.IllIIIlIll[106]] = Main.llIllIllllIl("Td1Pogfa1a0=", "ZxTrM");
        Main.llIIIIlIll[Main.IllIIIlIll[107]] = Main.llIllIllllIl("wii7NulhELU=", "ihhHM");
        Main.llIIIIlIll[Main.IllIIIlIll[110]] = Main.llIllIllllIl("wfltu5ywG6s=", "pLYSk");
        Main.llIIIIlIll[Main.IllIIIlIll[113]] = Main.IIlllIllllIl("VQ==", "uAAzE");
        Main.llIIIIlIll[Main.IllIIIlIll[116]] = Main.IIlllIllllIl("RQ==", "eaEkR");
        Main.llIIIIlIll[Main.IllIIIlIll[117]] = Main.IIlllIllllIl("a0hI", "KhhSd");
        Main.llIIIIlIll[Main.IllIIIlIll[118]] = Main.lIlllIllllIl("++r2nNEuf8o=", "nuWRX");
        Main.llIIIIlIll[Main.IllIIIlIll[119]] = Main.lIlllIllllIl("xwQu/xV6zSs=", "HUmWy");
        Main.llIIIIlIll[Main.IllIIIlIll[120]] = Main.llIllIllllIl("l5VZ1vc9Qg4=", "RlPMy");
        Main.llIIIIlIll[Main.IllIIIlIll[121]] = Main.lIlllIllllIl("uDUdRIxZ3rM=", "CjsnI");
        Main.llIIIIlIll[Main.IllIIIlIll[122]] = Main.lIlllIllllIl("705vh7In/TE=", "RAKMQ");
        Main.llIIIIlIll[Main.IllIIIlIll[123]] = Main.IIlllIllllIl("Ug==", "rxKrf");
        Main.llIIIIlIll[Main.IllIIIlIll[124]] = Main.lIlllIllllIl("Ea2lMlR/+Y8=", "ahVmc");
        Main.llIIIIlIll[Main.IllIIIlIll[49]] = Main.llIllIllllIl("9a5rTIbtNa4=", "bFuTq");
        Main.llIIIIlIll[Main.IllIIIlIll[126]] = Main.lIlllIllllIl("/uZkDUSH+Bk=", "yhmPM");
        Main.llIIIIlIll[Main.IllIIIlIll[111]] = Main.llIllIllllIl("GUUDjIVn/ug=", "zBJFk");
        Main.llIIIIlIll[Main.IllIIIlIll[91]] = Main.IIlllIllllIl("UHJY", "pRxFP");
        Main.llIIIIlIll[Main.IllIIIlIll[133]] = Main.lIlllIllllIl("3gFxrvnPfFY=", "mfcXS");
        Main.llIIIIlIll[Main.IllIIIlIll[134]] = Main.llIllIllllIl("zJgAui1IXL4=", "swonb");
        Main.llIIIIlIll[Main.IllIIIlIll[135]] = Main.lIlllIllllIl("OF+p8THdav4=", "jflZc");
        Main.llIIIIlIll[Main.IllIIIlIll[42]] = Main.lIlllIllllIl("VKZ2N9g2xhA=", "rxBWf");
        Main.llIIIIlIll[Main.IllIIIlIll[139]] = Main.llIllIllllIl("b7PwU3HDHkg=", "gEJup");
        Main.llIIIIlIll[Main.IllIIIlIll[140]] = Main.lIlllIllllIl("gfgLMcP74aA=", "YSpcS");
        Main.llIIIIlIll[Main.IllIIIlIll[141]] = Main.llIllIllllIl("6e2qQkAauKo=", "BdtmO");
        Main.llIIIIlIll[Main.IllIIIlIll[142]] = Main.lIlllIllllIl("xiHDEsMEZSk=", "OfSCU");
        Main.llIIIIlIll[Main.IllIIIlIll[143]] = Main.IIlllIllllIl("Vg==", "vtPJQ");
        Main.llIIIIlIll[Main.IllIIIlIll[112]] = Main.IIlllIllllIl("TUNn", "mcGRo");
        Main.llIIIIlIll[Main.IllIIIlIll[149]] = Main.IIlllIllllIl("Yw==", "ChpKh");
        Main.llIIIIlIll[Main.IllIIIlIll[150]] = Main.IIlllIllllIl("cw==", "SeWKK");
        Main.llIIIIlIll[Main.IllIIIlIll[151]] = Main.IIlllIllllIl("TA==", "lzqOD");
        Main.llIIIIlIll[Main.IllIIIlIll[137]] = Main.lIlllIllllIl("7uZnmQNbvjE=", "TkgmE");
        Main.llIIIIlIll[Main.IllIIIlIll[41]] = Main.IIlllIllllIl("RQ==", "eAJIc");
        Main.llIIIIlIll[Main.IllIIIlIll[159]] = Main.lIlllIllllIl("K28nhmlHwhk=", "mVfps");
        Main.llIIIIlIll[Main.IllIIIlIll[160]] = Main.lIlllIllllIl("zze9IydgVwI=", "UOmdn");
        Main.llIIIIlIll[Main.IllIIIlIll[161]] = Main.IIlllIllllIl("R1Fo", "gqHoW");
        Main.llIIIIlIll[Main.IllIIIlIll[163]] = Main.IIlllIllllIl("bA==", "LrFga");
        Main.llIIIIlIll[Main.IllIIIlIll[138]] = Main.lIlllIllllIl("/zd7ov3Bjuw=", "orajI");
        Main.llIIIIlIll[Main.IllIIIlIll[164]] = Main.lIlllIllllIl("qVZiYBKA3/8=", "ZWPCW");
        Main.llIIIIlIll[Main.IllIIIlIll[165]] = Main.IIlllIllllIl("WQ==", "yqAYc");
    }

    private static String lIlllIllllIl(String IlIllIIIllllIll, String lIIllIIIllllIll) {
        try {
            SecretKeySpec IIIllIIIllllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIllIIIllllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIlIIIllllIll = Cipher.getInstance("Blowfish");
            lllIlIIIllllIll.init(IllIIIlIll[2], IIIllIIIllllIll);
            return new String(lllIlIIIllllIll.doFinal(Base64.getDecoder().decode(IlIllIIIllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllIlIIIllllIll) {
            IllIlIIIllllIll.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIlllIllllIl(String IIIlIIIIllllIll, String lllIIIIIllllIll) {
        IIIlIIIIllllIll = new String(Base64.getDecoder().decode(IIIlIIIIllllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder IllIIIIIllllIll = new StringBuilder();
        char[] lIlIIIIIllllIll = lllIIIIIllllIll.toCharArray();
        int IIlIIIIIllllIll = IllIIIlIll[0];
        char[] IlIlllllIlllIll = IIIlIIIIllllIll.toCharArray();
        int llIlllllIlllIll = IlIlllllIlllIll.length;
        int IIllllllIlllIll = IllIIIlIll[0];
        "".length();
        while (!Main.llIIllllllIl(IIllllllIlllIll, llIlllllIlllIll)) {
            char llIIIIIIllllIll = IlIlllllIlllIll[IIllllllIlllIll];
            IllIIIIIllllIll.append((char)(llIIIIIIllllIll ^ lIlIIIIIllllIll[IIlIIIIIllllIll % lIlIIIIIllllIll.length]));
            "".length();
            ++IIlIIIIIllllIll;
            ++IIllllllIlllIll;
        }
        return String.valueOf(IllIIIIIllllIll);
    }

    private static String llIllIllllIl(String lIlIllllIlllIll, String IIlIllllIlllIll) {
        try {
            SecretKeySpec llIIllllIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIlIllllIlllIll.getBytes(StandardCharsets.UTF_8)), IllIIIlIll[8]), "DES");
            Cipher IlIIllllIlllIll = Cipher.getInstance("DES");
            IlIIllllIlllIll.init(IllIIIlIll[2], llIIllllIlllIll);
            return new String(IlIIllllIlllIll.doFinal(Base64.getDecoder().decode(lIlIllllIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIllllIlllIll) {
            lIIIllllIlllIll.printStackTrace();
            return null;
        }
    }

    private static void IlllIlllllIl() {
        IllIIIlIll = new int[166];
        Main.IllIIIlIll[0] = ((0x3E ^ 7) << (" ".length() << " ".length()) ^ 5 + 160 - 20 + 18) & (0xD1 ^ 0xA4 ^ (0x54 ^ 0x4D) << " ".length() ^ -" ".length());
        Main.IllIIIlIll[1] = " ".length();
        Main.IllIIIlIll[2] = " ".length() << " ".length();
        Main.IllIIIlIll[3] = "   ".length();
        Main.IllIIIlIll[4] = " ".length() << (" ".length() << " ".length());
        Main.IllIIIlIll[5] = 0xC0 ^ 0xC5;
        Main.IllIIIlIll[6] = "   ".length() << " ".length();
        Main.IllIIIlIll[7] = 0x8E ^ 0x89;
        Main.IllIIIlIll[8] = " ".length() << "   ".length();
        Main.IllIIIlIll[9] = 0x5C ^ 0x27 ^ (0x4E ^ 0x77) << " ".length();
        Main.IllIIIlIll[10] = (0x12 ^ 0x17) << " ".length();
        Main.IllIIIlIll[11] = 0x98 ^ 0x93;
        Main.IllIIIlIll[12] = "   ".length() << (" ".length() << " ".length());
        Main.IllIIIlIll[13] = 0x80 ^ 0x85 ^ " ".length() << "   ".length();
        Main.IllIIIlIll[14] = (0x26 ^ 0x21) << " ".length();
        Main.IllIIIlIll[15] = 0xA ^ 5;
        Main.IllIIIlIll[16] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        Main.IllIIIlIll[17] = 0x30 ^ 0x21;
        Main.IllIIIlIll[18] = (0x78 ^ 0x71) << " ".length();
        Main.IllIIIlIll[19] = 0xA8 ^ 0xBB;
        Main.IllIIIlIll[20] = (0x7B ^ 0x48 ^ (0xA4 ^ 0xBF) << " ".length()) << (" ".length() << " ".length());
        Main.IllIIIlIll[21] = 0x59 ^ 0x4C;
        Main.IllIIIlIll[22] = (0x7B ^ 0x5E ^ (0x27 ^ 0x30) << " ".length()) << " ".length();
        Main.IllIIIlIll[23] = 68 + 7 - -132 + 8 ^ "   ".length() << ("   ".length() << " ".length());
        Main.IllIIIlIll[24] = "   ".length() << "   ".length();
        Main.IllIIIlIll[25] = 0x53 ^ 0x4A;
        Main.IllIIIlIll[26] = (49 + 126 - 30 + 0 ^ (0x2E ^ 9) << (" ".length() << " ".length())) << " ".length();
        Main.IllIIIlIll[27] = (0x84 ^ 0x9B) << " ".length() ^ (0xA1 ^ 0x84);
        Main.IllIIIlIll[28] = (0x38 ^ 0x3F) << (" ".length() << " ".length());
        Main.IllIIIlIll[29] = 0xA8 ^ 0xB5;
        Main.IllIIIlIll[30] = (0xC9 ^ 0xC6) << " ".length();
        Main.IllIIIlIll[31] = 0x6A ^ 0x75;
        Main.IllIIIlIll[32] = " ".length() << (43 + 81 - 110 + 159 ^ (0x64 ^ 0x71) << "   ".length());
        Main.IllIIIlIll[33] = (0x5C ^ 0x45) << " ".length() ^ (0x9A ^ 0x89);
        Main.IllIIIlIll[34] = (0x44 ^ 0x55) << " ".length();
        Main.IllIIIlIll[35] = 0x96 ^ 0xB5;
        Main.IllIIIlIll[36] = ((0x23 ^ 0x32) << (" ".length() << " ".length())) + (0x44 ^ 0x79) - (0xC8 ^ 0x81) + (0x2B ^ 0x4C);
        Main.IllIIIlIll[37] = (0x11 ^ 0x44) << " ".length();
        Main.IllIIIlIll[38] = (0x70 ^ 0x61) << "   ".length();
        Main.IllIIIlIll[39] = 37 + 121 - 36 + 67;
        Main.IllIIIlIll[40] = -" ".length();
        Main.IllIIIlIll[41] = (0x1B ^ 0x20) << " ".length();
        Main.IllIIIlIll[42] = 60 + 188 - 56 + 27 ^ (7 ^ 0xC) << (" ".length() << (" ".length() << " ".length()));
        Main.IllIIIlIll[43] = 160 + 225 - 316 + 160;
        Main.IllIIIlIll[44] = (0xDE ^ 0xBD ^ (0xF ^ 0x10) << " ".length()) << " ".length();
        Main.IllIIIlIll[45] = 0x2E ^ 0x6B;
        Main.IllIIIlIll[46] = (0x9B ^ 0xBE) << " ".length();
        Main.IllIIIlIll[47] = (84 + 71 - 87 + 73 ^ (0x6E ^ 0xF) << " ".length()) << " ".length();
        Main.IllIIIlIll[48] = 74 + 56 - -35 + 32;
        Main.IllIIIlIll[49] = ((0x41 ^ 0x58) << (" ".length() << " ".length()) ^ (0x37 ^ 0x4A)) << (" ".length() << " ".length());
        Main.IllIIIlIll[50] = 0x5E ^ 0xB;
        Main.IllIIIlIll[51] = 0x33 ^ 0x16;
        Main.IllIIIlIll[52] = 0x80 ^ 0xC3;
        Main.IllIIIlIll[53] = ("   ".length() << (" ".length() << " ".length()) ^ (0x44 ^ 0x7B)) << (" ".length() << " ".length());
        Main.IllIIIlIll[54] = ((0x73 ^ 0x7A) << (" ".length() << " ".length())) + (0xA ^ 0x25) - (0x51 ^ 0x18) + (152 + 121 - 173 + 59);
        Main.IllIIIlIll[55] = 0x6B ^ 0x2A;
        Main.IllIIIlIll[56] = 0x17 ^ 0x20;
        Main.IllIIIlIll[57] = 88 + 46 - 93 + 114;
        Main.IllIIIlIll[58] = (0xC ^ 0x5F) << " ".length();
        Main.IllIIIlIll[59] = (0x8C ^ 0x85) << (" ".length() << " ".length());
        Main.IllIIIlIll[60] = ((0 ^ 0x1F) << (" ".length() << " ".length()) ^ (0xF1 ^ 0x9E)) << " ".length();
        Main.IllIIIlIll[61] = (0xB8 ^ 0xAF) << (" ".length() << " ".length()) ^ (0x31 ^ 0x4A);
        Main.IllIIIlIll[62] = (0x66 ^ 0x63) << "   ".length();
        Main.IllIIIlIll[63] = 0x35 ^ 0x1C;
        Main.IllIIIlIll[64] = ((0x10 ^ 0x5B) << " ".length() ^ 27 + 127 - 117 + 94) << " ".length();
        Main.IllIIIlIll[65] = 0x89 ^ 0xA2;
        Main.IllIIIlIll[66] = (0x59 ^ 0x52) << (" ".length() << " ".length());
        Main.IllIIIlIll[67] = 0xB9 ^ 0x94;
        Main.IllIIIlIll[68] = ((0x98 ^ 0x97) << " ".length() ^ (7 ^ 0xE)) << " ".length();
        Main.IllIIIlIll[69] = 0x9C ^ 0xB3;
        Main.IllIIIlIll[70] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        Main.IllIIIlIll[71] = 0x17 ^ 0x3A ^ (0x76 ^ 0x71) << (" ".length() << " ".length());
        Main.IllIIIlIll[72] = (0x9A ^ 0x83) << " ".length();
        Main.IllIIIlIll[73] = 0x35 ^ 6;
        Main.IllIIIlIll[74] = (0xC7 ^ 0x9E ^ (0x5C ^ 0x49) << (" ".length() << " ".length())) << (" ".length() << " ".length());
        Main.IllIIIlIll[75] = 0x64 ^ 0x51;
        Main.IllIIIlIll[76] = (0x3D ^ 0x26) << " ".length();
        Main.IllIIIlIll[77] = (0x73 ^ 0x52 ^ (0xB6 ^ 0xA5) << " ".length()) << "   ".length();
        Main.IllIIIlIll[78] = 0x49 ^ 0x70;
        Main.IllIIIlIll[79] = (0x84 ^ 0x99) << " ".length();
        Main.IllIIIlIll[80] = 0x9D ^ 0xA6;
        Main.IllIIIlIll[81] = (0x3A ^ 0x35) << (" ".length() << " ".length());
        Main.IllIIIlIll[82] = (0xBF ^ 0xBA) << (" ".length() << (" ".length() << " ".length())) ^ (0x5B ^ 0x36);
        Main.IllIIIlIll[83] = (0xA ^ 0x15) << " ".length();
        Main.IllIIIlIll[84] = "   ".length() ^ (0x9F ^ 0x90) << (" ".length() << " ".length());
        Main.IllIIIlIll[85] = " ".length() << ("   ".length() << " ".length());
        Main.IllIIIlIll[86] = (0x4B ^ 0x6A) << " ".length();
        Main.IllIIIlIll[87] = (0xFA ^ 0xBF ^ (0x29 ^ 0x3C) << (" ".length() << " ".length())) << (" ".length() << " ".length());
        Main.IllIIIlIll[88] = (0x10 ^ 0x7D ^ (0x4F ^ 0x68) << " ".length()) << " ".length();
        Main.IllIIIlIll[89] = 8 ^ 0x4F;
        Main.IllIIIlIll[90] = (2 ^ 0x1D ^ (0x61 ^ 0x6A) << " ".length()) << "   ".length();
        Main.IllIIIlIll[91] = 0x66 ^ 1;
        Main.IllIIIlIll[92] = (0x59 ^ 0x18 ^ (0x5A ^ 0x6F) << " ".length()) << " ".length();
        Main.IllIIIlIll[93] = 0x2A ^ 0x63;
        Main.IllIIIlIll[94] = 0x66 ^ 0x2D;
        Main.IllIIIlIll[95] = (0x54 ^ 0x47) << (" ".length() << " ".length());
        Main.IllIIIlIll[96] = 0x31 ^ 0x7C;
        Main.IllIIIlIll[97] = ((0xAB ^ 0xB0) << " ".length() ^ (0xD1 ^ 0xC0)) << " ".length();
        Main.IllIIIlIll[98] = 0xEA ^ 0x8B ^ (0xB1 ^ 0xA6) << " ".length();
        Main.IllIIIlIll[99] = ((0x4B ^ 0x2A) << " ".length() ^ 67 + 134 - 87 + 85) << (" ".length() << (" ".length() << " ".length()));
        Main.IllIIIlIll[100] = 0x45 ^ 0x2A ^ (0x85 ^ 0x9A) << " ".length();
        Main.IllIIIlIll[101] = (0x5F ^ 0x76) << " ".length();
        Main.IllIIIlIll[102] = (8 ^ 0x71 ^ (0x97 ^ 0x9A) << (" ".length() << " ".length())) << " ".length();
        Main.IllIIIlIll[103] = (" ".length() << "   ".length()) + (0x26 ^ 0x45) - ("   ".length() << (" ".length() << " ".length())) + ((0x85 ^ 0x80) << (" ".length() << (" ".length() << " ".length())));
        Main.IllIIIlIll[104] = (0x9F ^ 0x80) << " ".length() ^ (0x75 ^ 0x18);
        Main.IllIIIlIll[105] = ((0x8A ^ 0x9D) << " ".length() ^ (0x3B ^ 0)) << (" ".length() << " ".length());
        Main.IllIIIlIll[106] = 0x2C ^ 0x7B;
        Main.IllIIIlIll[107] = (0x48 ^ 0x1B ^ (0xAA ^ 0xA1) << "   ".length()) << "   ".length();
        Main.IllIIIlIll[108] = (0x69 ^ 0x56) + (4 + 80 - 16 + 85) - (112 + 22 - -43 + 30) + ((0x18 ^ 0x79) << " ".length());
        Main.IllIIIlIll[109] = ((0x52 ^ 0x6F) << (" ".length() << " ".length()) ^ 91 + 136 - 221 + 143) << " ".length();
        Main.IllIIIlIll[110] = " ".length() << " ".length() ^ (0x59 ^ 2);
        Main.IllIIIlIll[111] = (0x47 ^ 0x74) << " ".length();
        Main.IllIIIlIll[112] = 0x2B ^ 0x5A;
        Main.IllIIIlIll[113] = ((0x22 ^ 0xD) << (" ".length() << " ".length()) ^ 5 + 44 - -43 + 53) << " ".length();
        Main.IllIIIlIll[114] = ((0x63 ^ 0x4C) << " ".length()) + (0x66 ^ 0x13) - (89 + 27 - -36 + 25) + (85 + 127 - 163 + 116);
        Main.IllIIIlIll[115] = "   ".length() << ("   ".length() << " ".length());
        Main.IllIIIlIll[116] = 47 + 182 - 129 + 111 ^ (0x23 ^ 0x32) << "   ".length();
        Main.IllIIIlIll[117] = ((0xB4 ^ 0xBF) << (" ".length() << " ".length()) ^ (0x29 ^ 0x12)) << (" ".length() << " ".length());
        Main.IllIIIlIll[118] = 0x99 ^ 0xC4;
        Main.IllIIIlIll[119] = (0x7B ^ 0x5C ^ " ".length() << "   ".length()) << " ".length();
        Main.IllIIIlIll[120] = 2 ^ 0x5D;
        Main.IllIIIlIll[121] = "   ".length() << (107 + 86 - 121 + 73 ^ (0x35 ^ 0x10) << (" ".length() << " ".length()));
        Main.IllIIIlIll[122] = 0x67 ^ 6;
        Main.IllIIIlIll[123] = (39 + 6 - 20 + 138 ^ (0x8D ^ 0xC4) << " ".length()) << " ".length();
        Main.IllIIIlIll[124] = 14 + 41 - -77 + 95 ^ " ".length() << (0x36 ^ 0x31);
        Main.IllIIIlIll[125] = (0xAB ^ 0xB8 ^ (0x61 ^ 0x6C) << " ".length()) << (" ".length() << (" ".length() << " ".length()));
        Main.IllIIIlIll[126] = 0x6D ^ 8;
        Main.IllIIIlIll[127] = -((0x2A ^ 0x17) << " ".length() ^ (0x43 ^ 0x5A));
        Main.IllIIIlIll[128] = 57 + 115 - 142 + 175;
        Main.IllIIIlIll[129] = ((0x96 ^ 0xB7) << (" ".length() << " ".length())) + ((0xD9 ^ 0x8A) << " ".length()) - (165 + 171 - 230 + 97) + ((0x2E ^ 0x3D) << (" ".length() << " ".length()));
        Main.IllIIIlIll[130] = 109 + 135 - 92 + 109;
        Main.IllIIIlIll[131] = (127 + 13 - 133 + 132 ^ (0x20 ^ 0x67) << " ".length()) << (" ".length() << (" ".length() << " ".length()) ^ " ".length());
        Main.IllIIIlIll[132] = 129 + 63 - 151 + 140;
        Main.IllIIIlIll[133] = (0x91 ^ 0x9C) << "   ".length();
        Main.IllIIIlIll[134] = 3 ^ 0x48 ^ (0x4C ^ 0x5D) << " ".length();
        Main.IllIIIlIll[135] = (0x79 ^ 0x4C) << " ".length();
        Main.IllIIIlIll[136] = 91 + 47 - 81 + 80;
        Main.IllIIIlIll[137] = (0xBE ^ 0x8F) << " ".length() ^ (0x77 ^ 0x60);
        Main.IllIIIlIll[138] = 0x10 ^ 0x6B;
        Main.IllIIIlIll[139] = ((0x59 ^ 0x70) << (" ".length() << " ".length()) ^ 176 + 170 - 256 + 101) << (" ".length() << " ".length());
        Main.IllIIIlIll[140] = 0x4A ^ 7 ^ " ".length() << (0x1F ^ 0x1A);
        Main.IllIIIlIll[141] = (0xA5 ^ 0x92) << " ".length();
        Main.IllIIIlIll[142] = 0xD6 ^ 0xB9;
        Main.IllIIIlIll[143] = (0x1A ^ 0x1D) << (" ".length() << (" ".length() << " ".length()));
        Main.IllIIIlIll[144] = 206 + 54 - 208 + 165;
        Main.IllIIIlIll[145] = (0x1F ^ 0x5E) << " ".length();
        Main.IllIIIlIll[146] = 242 + 175 - 184 + 14;
        Main.IllIIIlIll[147] = ((0x3B ^ 0x7C) << " ".length() ^ 152 + 152 - 141 + 2) << (" ".length() << " ".length());
        Main.IllIIIlIll[148] = ((0xCB ^ 0xC0) << "   ".length() ^ (0x42 ^ 0x25)) << " ".length();
        Main.IllIIIlIll[149] = (0x3C ^ 5) << " ".length();
        Main.IllIIIlIll[150] = 0x6A ^ 0x19;
        Main.IllIIIlIll[151] = ((8 ^ 0x21) << " ".length() ^ (0xD2 ^ 0x9D)) << (" ".length() << " ".length());
        Main.IllIIIlIll[152] = ((0xDD ^ 0xC4) << " ".length() ^ (0x56 ^ 0x5D)) << (" ".length() << " ".length());
        Main.IllIIIlIll[153] = 79 + 61 - -9 + 24;
        Main.IllIIIlIll[154] = (0x67 ^ 0x3E) << " ".length();
        Main.IllIIIlIll[155] = (0x10 ^ 0x41 ^ (0x70 ^ 0x53) << " ".length()) << "   ".length();
        Main.IllIIIlIll[156] = ((0xB6 ^ 0xB3) << (" ".length() << (" ".length() << " ".length())) ^ (0xC3 ^ 0xB6)) << (" ".length() << " ".length());
        Main.IllIIIlIll[157] = 129 + 115 - 96 + 9;
        Main.IllIIIlIll[158] = ((0x2C ^ 0x23) << " ".length() ^ (0x6D ^ 0x52)) << (" ".length() << " ".length());
        Main.IllIIIlIll[159] = (0x52 ^ 0x5B) << (" ".length() << " ".length()) ^ (0xC1 ^ 0x92);
        Main.IllIIIlIll[160] = (164 + 142 - 137 + 12 ^ (0x7A ^ 0x27) << " ".length()) << "   ".length();
        Main.IllIIIlIll[161] = 0x61 ^ 0x18;
        Main.IllIIIlIll[162] = -(0x11 ^ 0x4E);
        Main.IllIIIlIll[163] = (0x17 ^ 0x2A) << " ".length();
        Main.IllIIIlIll[164] = (0x6C ^ 0x2F ^ (0x5A ^ 0x4D) << (" ".length() << " ".length())) << (" ".length() << " ".length());
        Main.IllIIIlIll[165] = 0xC5 ^ 0xB8;
    }

    private static boolean llIIllllllIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIlIllllllIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lIlIllllllIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean lIIIllllllIl(int n, int n2) {
        return n > n2;
    }

    private static boolean llllIlllllIl(int n) {
        return n != 0;
    }

    private static boolean IlIIllllllIl(int n) {
        return n == 0;
    }

    private static boolean IllIllllllIl(int n) {
        return n >= 0;
    }

    private static boolean IIIIllllllIl(int n) {
        return n < 0;
    }

    static class FastScanner {
        Reader input;
        private static String[] IIIIIIlIll;
        private static int[] lIIIIIlIll;
        private static String[] IIlIIIlIll;
        private static int[] lIlIIIlIll;

        FastScanner() {
            IIlllllIIIIIlll(System.in);
            FastScanner IIlllllIIIIIlll;
        }

        FastScanner(InputStream lllIlllIIIIIlll) {
            FastScanner IIIllllIIIIIlll;
            IIIllllIIIIIlll.input = new BufferedReader(new InputStreamReader(lllIlllIIIIIlll));
        }

        int nextInt() {
            FastScanner llIIlllIIIIIlll;
            return (int)llIIlllIIIIIlll.nextLong();
        }

        long nextLong() {
            try {
                FastScanner lIllIllIIIIIlll;
                int IIllIllIIIIIlll = lIIIIIlIll[lIlIIIlIll[0]];
                int llIlIllIIIIIlll = lIllIllIIIIIlll.input.read();
                while ((!FastScanner.llIIIlllllIl(FastScanner.IIllIIllllIl(llIlIllIIIIIlll, lIIIIIlIll[lIlIIIlIll[1]]) ? 1 : 0) || FastScanner.llIIIlllllIl(FastScanner.lIllIIllllIl(lIIIIIlIll[lIlIIIlIll[2]], llIlIllIIIIIlll) ? 1 : 0)) && FastScanner.llIIIlllllIl(FastScanner.IlllIIllllIl(llIlIllIIIIIlll, lIIIIIlIll[lIlIIIlIll[3]]) ? 1 : 0) && FastScanner.llIIIlllllIl(FastScanner.IlllIIllllIl(llIlIllIIIIIlll, lIIIIIlIll[lIlIIIlIll[4]]) ? 1 : 0)) {
                    llIlIllIIIIIlll = lIllIllIIIIIlll.input.read();
                    IIlIIIlIll[lIlIIIlIll[0]].length();
                    "".length();
                    if (!FastScanner.IIlIIlllllIl(-(lIlIIIlIll[5] ^ lIlIIIlIll[6]))) continue;
                    return 0L;
                }
                if (FastScanner.llIIIlllllIl(FastScanner.llllIIllllIl(llIlIllIIIIIlll, lIIIIIlIll[lIlIIIlIll[3]]) ? 1 : 0)) {
                    IIllIllIIIIIlll = lIIIIIlIll[lIlIIIlIll[7]];
                    llIlIllIIIIIlll = lIllIllIIIIIlll.input.read();
                    IIlIIIlIll[lIlIIIlIll[1]].length();
                    "".length();
                    if (FastScanner.lIlIIlllllIl(-IIlIIIlIll[lIlIIIlIll[2]].length(), IIlIIIlIll[lIlIIIlIll[3]].length())) {
                        return 0L;
                    }
                } else if (FastScanner.llIIIlllllIl(FastScanner.llllIIllllIl(llIlIllIIIIIlll, lIIIIIlIll[lIlIIIlIll[4]]) ? 1 : 0)) {
                    llIlIllIIIIIlll = lIllIllIIIIIlll.input.read();
                }
                long IlIlIllIIIIIlll = llIlIllIIIIIlll - lIIIIIlIll[lIlIIIlIll[1]];
                do {
                    if (!FastScanner.llIIIlllllIl(FastScanner.IIllIIllllIl(llIlIllIIIIIlll = lIllIllIIIIIlll.input.read(), lIIIIIlIll[lIlIIIlIll[1]]) ? 1 : 0) || FastScanner.llIIIlllllIl(FastScanner.lIllIIllllIl(lIIIIIlIll[lIlIIIlIll[2]], llIlIllIIIIIlll) ? 1 : 0)) {
                        return IlIlIllIIIIIlll * (long)IIllIllIIIIIlll;
                    }
                    IlIlIllIIIIIlll *= 10L;
                    IlIlIllIIIIIlll += (long)(llIlIllIIIIIlll - lIIIIIlIll[lIlIIIlIll[1]]);
                    IIlIIIlIll[lIlIIIlIll[4]].length();
                    "".length();
                } while (!FastScanner.IllIIlllllIl(null));
                return 0L;
            }
            catch (IOException IIllIllIIIIIlll) {
                IIllIllIIIIIlll.printStackTrace();
                return -1L;
            }
        }

        double nextDouble() {
            try {
                FastScanner IIIIIllIIIIIlll;
                double lllllIlIIIIIlll = 1.0;
                int IllllIlIIIIIlll = IIIIIllIIIIIlll.input.read();
                while ((!FastScanner.llIIIlllllIl(FastScanner.IIllIIllllIl(IllllIlIIIIIlll, lIIIIIlIll[lIlIIIlIll[1]]) ? 1 : 0) || FastScanner.llIIIlllllIl(FastScanner.lIllIIllllIl(lIIIIIlIll[lIlIIIlIll[2]], IllllIlIIIIIlll) ? 1 : 0)) && FastScanner.llIIIlllllIl(FastScanner.IlllIIllllIl(IllllIlIIIIIlll, lIIIIIlIll[lIlIIIlIll[3]]) ? 1 : 0) && FastScanner.llIIIlllllIl(FastScanner.IlllIIllllIl(IllllIlIIIIIlll, lIIIIIlIll[lIlIIIlIll[4]]) ? 1 : 0)) {
                    IllllIlIIIIIlll = IIIIIllIIIIIlll.input.read();
                    IIlIIIlIll[lIlIIIlIll[7]].length();
                    "".length();
                    if (!FastScanner.llIIIlllllIl(((lIlIIIlIll[8] ^ lIlIIIlIll[9]) << (IIlIIIlIll[lIlIIIlIll[10]].length() << IIlIIIlIll[lIlIIIlIll[11]].length()) ^ (lIlIIIlIll[12] ^ lIlIIIlIll[13])) & (lIlIIIlIll[14] ^ lIlIIIlIll[15] ^ (lIlIIIlIll[16] ^ lIlIIIlIll[17]) << IIlIIIlIll[lIlIIIlIll[18]].length() ^ -IIlIIIlIll[lIlIIIlIll[19]].length()))) continue;
                    return 0.0;
                }
                if (FastScanner.llIIIlllllIl(FastScanner.llllIIllllIl(IllllIlIIIIIlll, lIIIIIlIll[lIlIIIlIll[3]]) ? 1 : 0)) {
                    lllllIlIIIIIlll = -1.0;
                    IllllIlIIIIIlll = IIIIIllIIIIIlll.input.read();
                    IIlIIIlIll[lIlIIIlIll[20]].length();
                    "".length();
                    if (FastScanner.lIlIIlllllIl(-IIlIIIlIll[lIlIIIlIll[21]].length(), IIlIIIlIll[lIlIIIlIll[22]].length())) {
                        return 0.0;
                    }
                } else if (FastScanner.llIIIlllllIl(FastScanner.llllIIllllIl(IllllIlIIIIIlll, lIIIIIlIll[lIlIIIlIll[4]]) ? 1 : 0)) {
                    IllllIlIIIIIlll = IIIIIllIIIIIlll.input.read();
                }
                double lIlllIlIIIIIlll = IllllIlIIIIIlll - lIIIIIlIll[lIlIIIlIll[1]];
                while (FastScanner.llIIIlllllIl(FastScanner.IIllIIllllIl(IllllIlIIIIIlll = IIIIIllIIIIIlll.input.read(), lIIIIIlIll[lIlIIIlIll[1]]) ? 1 : 0)) {
                    if (FastScanner.llIIIlllllIl(FastScanner.lIllIIllllIl(lIIIIIlIll[lIlIIIlIll[2]], IllllIlIIIIIlll) ? 1 : 0)) {
                        IIlIIIlIll[lIlIIIlIll[23]].length();
                        "".length();
                        if (!FastScanner.lllIIlllllIl(IIlIIIlIll[lIlIIIlIll[24]].length() << IIlIIIlIll[lIlIIIlIll[25]].length(), -IIlIIIlIll[lIlIIIlIll[26]].length())) break;
                        return 0.0;
                    }
                    lIlllIlIIIIIlll *= 10.0;
                    lIlllIlIIIIIlll += (double)(IllllIlIIIIIlll - lIIIIIlIll[lIlIIIlIll[1]]);
                    IIlIIIlIll[lIlIIIlIll[27]].length();
                    "".length();
                    if (!FastScanner.IIIlIlllllIl(IIlIIIlIll[lIlIIIlIll[28]].length(), IIlIIIlIll[lIlIIIlIll[29]].length() << (IIlIIIlIll[lIlIIIlIll[30]].length() << IIlIIIlIll[lIlIIIlIll[31]].length()))) continue;
                    return 0.0;
                }
                if (FastScanner.llIIIlllllIl(FastScanner.IlllIIllllIl(IllllIlIIIIIlll, lIIIIIlIll[lIlIIIlIll[10]]) ? 1 : 0)) {
                    return lllllIlIIIIIlll * lIlllIlIIIIIlll;
                }
                double IIlllIlIIIIIlll = 1.0;
                IllllIlIIIIIlll = IIIIIllIIIIIlll.input.read();
                while (FastScanner.llIIIlllllIl(FastScanner.IIIIlIllllIl(lIIIIIlIll[lIlIIIlIll[1]], IllllIlIIIIIlll) ? 1 : 0) && FastScanner.llIIIlllllIl(FastScanner.IIIIlIllllIl(IllllIlIIIIIlll, lIIIIIlIll[lIlIIIlIll[2]]) ? 1 : 0)) {
                    lIlllIlIIIIIlll *= 10.0;
                    lIlllIlIIIIIlll += (double)(IllllIlIIIIIlll - lIIIIIlIll[lIlIIIlIll[1]]);
                    IIlllIlIIIIIlll *= 10.0;
                    IllllIlIIIIIlll = IIIIIllIIIIIlll.input.read();
                    IIlIIIlIll[lIlIIIlIll[32]].length();
                    "".length();
                    if (!FastScanner.llIIIlllllIl(((lIlIIIlIll[33] ^ lIlIIIlIll[16]) << (IIlIIIlIll[lIlIIIlIll[34]].length() << IIlIIIlIll[lIlIIIlIll[35]].length()) ^ (lIlIIIlIll[11] ^ lIlIIIlIll[36])) << (IIlIIIlIll[lIlIIIlIll[37]].length() << IIlIIIlIll[lIlIIIlIll[38]].length()) & ((lIlIIIlIll[18] + lIlIIIlIll[39] - lIlIIIlIll[40] + lIlIIIlIll[41] ^ (lIlIIIlIll[42] ^ lIlIIIlIll[43]) << IIlIIIlIll[lIlIIIlIll[44]].length()) << (IIlIIIlIll[lIlIIIlIll[45]].length() << IIlIIIlIll[lIlIIIlIll[46]].length()) ^ -IIlIIIlIll[lIlIIIlIll[47]].length()))) continue;
                    return 0.0;
                }
                return lllllIlIIIIIlll * lIlllIlIIIIIlll / IIlllIlIIIIIlll;
            }
            catch (IOException lllllIlIIIIIlll) {
                lllllIlIIIIIlll.printStackTrace();
                return Double.NaN;
            }
        }

        char nextChar() {
            try {
                FastScanner IIlIlIlIIIIIlll;
                int llIIlIlIIIIIlll = IIlIlIlIIIIIlll.input.read();
                while (FastScanner.llIIIlllllIl(FastScanner.lIIIlIllllIl(Character.isWhitespace(llIIlIlIIIIIlll) ? 1 : 0) ? 1 : 0)) {
                    llIIlIlIIIIIlll = IIlIlIlIIIIIlll.input.read();
                    IIlIIIlIll[lIlIIIlIll[48]].length();
                    "".length();
                    if (!FastScanner.IIIlIlllllIl(IIlIIIlIll[lIlIIIlIll[49]].length(), IIlIIIlIll[lIlIIIlIll[50]].length())) continue;
                    return (char)(((lIlIIIlIll[47] ^ lIlIIIlIll[51]) << IIlIIIlIll[lIlIIIlIll[5]].length() ^ lIlIIIlIll[52] + lIlIIIlIll[2] - lIlIIIlIll[46] + lIlIIIlIll[43]) & (lIlIIIlIll[53] ^ lIlIIIlIll[54] ^ (lIlIIIlIll[36] ^ lIlIIIlIll[55]) << IIlIIIlIll[lIlIIIlIll[56]].length() ^ -IIlIIIlIll[lIlIIIlIll[57]].length()));
                }
                return (char)llIIlIlIIIIIlll;
            }
            catch (IOException llIIlIlIIIIIlll) {
                llIIlIlIIIIIlll.printStackTrace();
                return lIIIIIlIll[lIlIIIlIll[11]];
            }
        }

        String nextStr() {
            try {
                FastScanner lIllIIlIIIIIlll;
                StringBuilder IIllIIlIIIIIlll = new StringBuilder();
                int llIlIIlIIIIIlll = lIllIIlIIIIIlll.input.read();
                while (FastScanner.llIIIlllllIl(FastScanner.lIIIlIllllIl(Character.isWhitespace(llIlIIlIIIIIlll) ? 1 : 0) ? 1 : 0)) {
                    llIlIIlIIIIIlll = lIllIIlIIIIIlll.input.read();
                    IIlIIIlIll[lIlIIIlIll[58]].length();
                    "".length();
                    if (!FastScanner.lIIlIlllllIl(IIlIIIlIll[lIlIIIlIll[6]].length() << (IIlIIIlIll[lIlIIIlIll[59]].length() << IIlIIIlIll[lIlIIIlIll[60]].length()), IIlIIIlIll[lIlIIIlIll[61]].length() << IIlIIIlIll[lIlIIIlIll[62]].length())) continue;
                    return null;
                }
                while (FastScanner.llIIIlllllIl(FastScanner.IlllIIllllIl(llIlIIlIIIIIlll, lIIIIIlIll[lIlIIIlIll[7]]) ? 1 : 0) && FastScanner.llIIIlllllIl(FastScanner.IlIIlIllllIl(Character.isWhitespace(llIlIIlIIIIIlll) ? 1 : 0) ? 1 : 0)) {
                    IIllIIlIIIIIlll.append((char)llIlIIlIIIIIlll);
                    IIlIIIlIll[lIlIIIlIll[63]].length();
                    llIlIIlIIIIIlll = lIllIIlIIIIIlll.input.read();
                    IIlIIIlIll[lIlIIIlIll[64]].length();
                    "".length();
                    if (!FastScanner.IlIlIlllllIl(IIlIIIlIll[lIlIIIlIll[39]].length(), IIlIIIlIll[lIlIIIlIll[65]].length())) continue;
                    return null;
                }
                return String.valueOf(IIllIIlIIIIIlll);
            }
            catch (IOException IIllIIlIIIIIlll) {
                IIllIIlIIIIIlll.printStackTrace();
                return IIIIIIlIll[lIIIIIlIll[lIlIIIlIll[11]]];
            }
        }

        static {
            FastScanner.IlIIIlllllIl();
            FastScanner.lIIIIlllllIl();
            FastScanner.llIlIIllllIl();
            FastScanner.IlIlIIllllIl();
        }

        private static void IlIlIIllllIl() {
            IIIIIIlIll = new String[lIIIIIlIll[lIlIIIlIll[0]]];
            FastScanner.IIIIIIlIll[FastScanner.lIIIIIlIll[FastScanner.lIlIIIlIll[11]]] = FastScanner.lIIlIIllllIl(IIlIIIlIll[lIlIIIlIll[55]], IIlIIIlIll[lIlIIIlIll[66]]);
        }

        /*
         * Unable to fully structure code
         */
        private static String lIIlIIllllIl(String IlllllIIIIIIlll, String lIllllIIIIIIlll) {
            IlllllIIIIIIlll = new String(Base64.getDecoder().decode(IlllllIIIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            IIllllIIIIIIlll = new StringBuilder();
            llIlllIIIIIIlll = lIllllIIIIIIlll.toCharArray();
            IlIlllIIIIIIlll = FastScanner.lIIIIIlIll[FastScanner.lIlIIIlIll[11]];
            IIIIllIIIIIIlll = IlllllIIIIIIlll.toCharArray();
            lIIIllIIIIIIlll = IIIIllIIIIIIlll.length;
            IlIIllIIIIIIlll = FastScanner.lIIIIIlIll[FastScanner.lIlIIIlIll[11]];
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[40]].length();
            "".length();
            if (!FastScanner.llIlIlllllIl(FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[67]].length())) ** GOTO lbl21
            return null;
lbl-1000:
            // 1 sources

            {
                lIIlllIIIIIIlll = IIIIllIIIIIIlll[IlIIllIIIIIIlll];
                IIllllIIIIIIlll.append((char)(lIIlllIIIIIIlll ^ llIlllIIIIIIlll[IlIlllIIIIIIlll % llIlllIIIIIIlll.length]));
                FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[68]].length();
                ++IlIlllIIIIIIlll;
                ++IlIIllIIIIIIlll;
lbl21:
                // 2 sources

                ** while (!FastScanner.llIIIlllllIl((int)FastScanner.IIllIIllllIl((int)IlIIllIIIIIIlll, (int)lIIIllIIIIIIlll)))
            }
lbl22:
            // 1 sources

            return String.valueOf(IIllllIIIIIIlll);
        }

        private static void llIlIIllllIl() {
            lIIIIIlIll = new int[lIlIIIlIll[18]];
            FastScanner.lIIIIIlIll[FastScanner.lIlIIIlIll[0]] = IIlIIIlIll[lIlIIIlIll[69]].length();
            FastScanner.lIIIIIlIll[FastScanner.lIlIIIlIll[1]] = IIlIIIlIll[lIlIIIlIll[70]].length() << (IIlIIIlIll[lIlIIIlIll[71]].length() << (IIlIIIlIll[lIlIIIlIll[52]].length() << IIlIIIlIll[lIlIIIlIll[72]].length()));
            FastScanner.lIIIIIlIll[FastScanner.lIlIIIlIll[2]] = lIlIIIlIll[36] ^ lIlIIIlIll[7];
            FastScanner.lIIIIIlIll[FastScanner.lIlIIIlIll[3]] = lIlIIIlIll[73] ^ lIlIIIlIll[74];
            FastScanner.lIIIIIlIll[FastScanner.lIlIIIlIll[4]] = lIlIIIlIll[75] ^ lIlIIIlIll[76] ^ (lIlIIIlIll[77] ^ lIlIIIlIll[78]) << (IIlIIIlIll[lIlIIIlIll[79]].length() << IIlIIIlIll[lIlIIIlIll[80]].length()) & ((lIlIIIlIll[81] ^ lIlIIIlIll[82]) << (IIlIIIlIll[lIlIIIlIll[83]].length() << IIlIIIlIll[lIlIIIlIll[36]].length()) ^ lIlIIIlIll[84]);
            FastScanner.lIIIIIlIll[FastScanner.lIlIIIlIll[7]] = -IIlIIIlIll[lIlIIIlIll[85]].length();
            FastScanner.lIIIIIlIll[FastScanner.lIlIIIlIll[10]] = (lIlIIIlIll[31] + lIlIIIlIll[43] - lIlIIIlIll[86] + lIlIIIlIll[87] ^ (lIlIIIlIll[88] ^ lIlIIIlIll[71]) << IIlIIIlIll[lIlIIIlIll[89]].length()) << IIlIIIlIll[lIlIIIlIll[90]].length();
            FastScanner.lIIIIIlIll[FastScanner.lIlIIIlIll[11]] = (lIlIIIlIll[45] ^ lIlIIIlIll[25] ^ (lIlIIIlIll[14] ^ lIlIIIlIll[91]) << IIlIIIlIll[lIlIIIlIll[92]].length()) & (lIlIIIlIll[61] ^ lIlIIIlIll[74] ^ (lIlIIIlIll[93] ^ lIlIIIlIll[94]) << (IIlIIIlIll[lIlIIIlIll[95]].length() << IIlIIIlIll[lIlIIIlIll[76]].length()) ^ -IIlIIIlIll[lIlIIIlIll[16]].length());
        }

        private static boolean llllIIllllIl(int n, int n2) {
            boolean bl;
            if (FastScanner.IIIlIlllllIl(n, n2)) {
                bl = lIlIIIlIll[1];
                "".length();
                if ((" ".length() << (3 ^ 6) & ~(" ".length() << (0x9F ^ 0x9A))) != 0) {
                    return ((0x40 ^ 0x57) << " ".length() & ~((0xAA ^ 0xBD) << " ".length())) != 0;
                }
            } else {
                bl = lIlIIIlIll[0];
            }
            return bl;
        }

        private static boolean IIllIIllllIl(int n, int n2) {
            boolean bl;
            if (FastScanner.IlIlIlllllIl(n, n2)) {
                bl = lIlIIIlIll[1];
                "".length();
                if (" ".length() << " ".length() <= 0) {
                    return ((0x23 ^ 0x10 ^ " ".length() << (" ".length() << (" ".length() << " ".length()))) << " ".length() & ((83 + 93 - 66 + 65 ^ (0x9F ^ 0xBC) << (" ".length() << " ".length())) << " ".length() ^ -" ".length())) != 0;
                }
            } else {
                bl = lIlIIIlIll[0];
            }
            return bl;
        }

        private static boolean lIllIIllllIl(int n, int n2) {
            boolean bl;
            if (FastScanner.lllIIlllllIl(n, n2)) {
                bl = lIlIIIlIll[1];
                "".length();
                if (" ".length() <= 0) {
                    return ((0x81 ^ 0xA4) << " ".length() & ~((0x53 ^ 0x76) << " ".length())) != 0;
                }
            } else {
                bl = lIlIIIlIll[0];
            }
            return bl;
        }

        private static boolean IIIIlIllllIl(int n, int n2) {
            boolean bl;
            if (FastScanner.lIIlIlllllIl(n, n2)) {
                bl = lIlIIIlIll[1];
                "".length();
                if (" ".length() >= " ".length() << " ".length()) {
                    return (((0xB3 ^ 0xB4) << (" ".length() << (" ".length() << " ".length())) ^ (0x35 ^ 0x6E)) & ((0x74 ^ 0x3F) << " ".length() ^ 62 + 162 - 179 + 144 ^ -" ".length())) != 0;
                }
            } else {
                bl = lIlIIIlIll[0];
            }
            return bl;
        }

        private static boolean lIIIlIllllIl(int n) {
            boolean bl;
            if (FastScanner.llIIIlllllIl(n)) {
                bl = lIlIIIlIll[1];
                "".length();
                if (-" ".length() != -" ".length()) {
                    return ((0x40 ^ 0x1F ^ (0xB3 ^ 0x96) << " ".length()) << " ".length() & ((0x37 ^ 0x52 ^ (0x22 ^ 0x25) << (" ".length() << (" ".length() << " ".length()))) << " ".length() ^ -" ".length())) != 0;
                }
            } else {
                bl = lIlIIIlIll[0];
            }
            return bl;
        }

        private static boolean IlIIlIllllIl(int n) {
            boolean bl;
            if (FastScanner.llIlIlllllIl(n)) {
                bl = lIlIIIlIll[1];
                "".length();
                if (" ".length() << " ".length() < " ".length() << " ".length()) {
                    return ((0x11 ^ 0x30) & ~(0x36 ^ 0x17)) != 0;
                }
            } else {
                bl = lIlIIIlIll[0];
            }
            return bl;
        }

        private static boolean IlllIIllllIl(int n, int n2) {
            boolean bl;
            if (FastScanner.IIllIlllllIl(n, n2)) {
                bl = lIlIIIlIll[1];
                "".length();
                if (" ".length() << " ".length() < " ".length()) {
                    return ((0xB1 ^ 0xBE) & ~(0x4C ^ 0x43)) != 0;
                }
            } else {
                bl = lIlIIIlIll[0];
            }
            return bl;
        }

        private static void lIIIIlllllIl() {
            IIlIIIlIll = new String[lIlIIIlIll[96]];
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[0]] = FastScanner.IllllIllllIl("MHULXMp7fJU=", "GdUEV");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[1]] = FastScanner.IllllIllllIl("ph7rkleHjYs=", "zlOHX");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[2]] = FastScanner.lllllIllllIl("TN2xARZ5OwM=", "zgRXD");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[3]] = FastScanner.IllllIllllIl("FfH9SH4sQxg=", "ZpBJI");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[4]] = FastScanner.IIIIIlllllIl("", "VILqW");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[7]] = FastScanner.lllllIllllIl("7viExOhmRmQ=", "OYSbq");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[10]] = FastScanner.lllllIllllIl("SANBtpOSltU=", "RvlOq");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[11]] = FastScanner.lllllIllllIl("9+BoVRcB2Yc=", "ANoLU");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[18]] = FastScanner.lllllIllllIl("sE/4X6gti6o=", "GaBAl");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[19]] = FastScanner.lllllIllllIl("AGMTNX8r1VE=", "omxuh");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[20]] = FastScanner.IIIIIlllllIl("", "SXUyB");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[21]] = FastScanner.lllllIllllIl("t+JMYigfG5E=", "ZOpMj");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[22]] = FastScanner.lllllIllllIl("4qV+CFSBgsM=", "TeTtQ");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[23]] = FastScanner.IIIIIlllllIl("", "TAPCW");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[24]] = FastScanner.IllllIllllIl("T/xImvlVQWg=", "JbPiM");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[25]] = FastScanner.lllllIllllIl("7e3dq3Yqz6o=", "YRXVh");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[26]] = FastScanner.lllllIllllIl("dvaAUAdo1yI=", "VpVOj");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[27]] = FastScanner.lllllIllllIl("8MSyYbsTnDo=", "nBSEZ");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[28]] = FastScanner.IIIIIlllllIl("dW5S", "UNrSd");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[29]] = FastScanner.lllllIllllIl("cLJo9mQ8TWM=", "NPHYC");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[30]] = FastScanner.IllllIllllIl("u+4OHrj0Z+s=", "gvHqv");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[31]] = FastScanner.IIIIIlllllIl("eA==", "XPWZo");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[32]] = FastScanner.IIIIIlllllIl("", "eZXFy");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[34]] = FastScanner.IIIIIlllllIl("cw==", "SgCvy");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[35]] = FastScanner.IIIIIlllllIl("eA==", "XluEt");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[37]] = FastScanner.lllllIllllIl("gUkAMcVz0/Y=", "OwebN");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[38]] = FastScanner.IllllIllllIl("HOljhWRCns0=", "iGmnx");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[44]] = FastScanner.IllllIllllIl("U4gsPSUjL7Y=", "XutqV");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[45]] = FastScanner.IIIIIlllllIl("bg==", "NiajF");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[46]] = FastScanner.lllllIllllIl("tpyEM1L0JyM=", "EHjhl");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[47]] = FastScanner.lllllIllllIl("WLo1D/oZ5Eo=", "BwgBM");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[48]] = FastScanner.IIIIIlllllIl("", "YrFmr");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[49]] = FastScanner.lllllIllllIl("2ButYrpT824=", "GoNzF");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[50]] = FastScanner.lllllIllllIl("V4CuCgDABUo=", "uaAnF");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[5]] = FastScanner.IIIIIlllllIl("Rw==", "gObbb");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[56]] = FastScanner.IIIIIlllllIl("UA==", "pVfiN");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[57]] = FastScanner.lllllIllllIl("lKPfRqamyuo=", "LEYeV");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[58]] = FastScanner.lllllIllllIl("LitdGWJ73kc=", "jfHuh");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[6]] = FastScanner.IIIIIlllllIl("eg==", "ZfGQk");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[59]] = FastScanner.IIIIIlllllIl("Tg==", "nelps");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[60]] = FastScanner.IIIIIlllllIl("cQ==", "QgyYA");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[61]] = FastScanner.IIIIIlllllIl("Tw==", "ouAaR");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[62]] = FastScanner.lllllIllllIl("S8ZEP0v1Ios=", "WktjZ");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[63]] = FastScanner.lllllIllllIl("vu+BfV+YDfo=", "aBNkR");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[64]] = FastScanner.lllllIllllIl("ksKpX71Auuk=", "jXwiz");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[39]] = FastScanner.IIIIIlllllIl("dA==", "TBOul");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[65]] = FastScanner.IIIIIlllllIl("ek9m", "ZoFib");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[55]] = FastScanner.IllllIllllIl("hkWEDzTI6Ys=", "DlIGH");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[66]] = FastScanner.IIIIIlllllIl("JxYLHDA=", "JlRiy");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[40]] = FastScanner.IIIIIlllllIl("", "vHyVI");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[67]] = FastScanner.lllllIllllIl("nOlD9lpwgYc=", "NsGnH");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[68]] = FastScanner.IIIIIlllllIl("", "nqVVz");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[69]] = FastScanner.lllllIllllIl("Vr8TTwJlxMI=", "YrzOB");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[70]] = FastScanner.IIIIIlllllIl("clJI", "RrhXp");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[71]] = FastScanner.IIIIIlllllIl("cA==", "PssDA");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[52]] = FastScanner.lllllIllllIl("ViUXUiCvv2Q=", "uVXGk");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[72]] = FastScanner.lllllIllllIl("SraE0sHhBnY=", "eRCBz");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[79]] = FastScanner.IIIIIlllllIl("aw==", "KmHWz");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[80]] = FastScanner.IIIIIlllllIl("Qw==", "ctnzb");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[83]] = FastScanner.IllllIllllIl("SSqnmOrdmbE=", "ANDnh");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[36]] = FastScanner.lllllIllllIl("9FJ7OT+IOAY=", "gpIps");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[85]] = FastScanner.IIIIIlllllIl("Wg==", "zhEuV");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[89]] = FastScanner.IllllIllllIl("z1/K5qZkAEo=", "qzlNZ");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[90]] = FastScanner.lllllIllllIl("aV36z1vgVB8=", "BRMWO");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[92]] = FastScanner.IIIIIlllllIl("cQ==", "QOLjJ");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[95]] = FastScanner.IllllIllllIl("Nqr7gj7KUOY=", "EsilK");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[76]] = FastScanner.IIIIIlllllIl("dw==", "WZczH");
            FastScanner.IIlIIIlIll[FastScanner.lIlIIIlIll[16]] = FastScanner.lllllIllllIl("w/jMwqT4I7o=", "yKhTy");
        }

        /*
         * Unable to fully structure code
         */
        private static String IIIIIlllllIl(String lIIlllllllllIll, String IIIlllllllllIll) {
            lIIlllllllllIll = new String(Base64.getDecoder().decode(lIIlllllllllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            lllIllllllllIll = new StringBuilder();
            IllIllllllllIll = IIIlllllllllIll.toCharArray();
            lIlIllllllllIll = FastScanner.lIlIIIlIll[0];
            llIlIlllllllIll = lIIlllllllllIll.toCharArray();
            IIllIlllllllIll = llIlIlllllllIll.length;
            lIllIlllllllIll = FastScanner.lIlIIIlIll[0];
            "".length();
            if (("   ".length() << (43 ^ 46) & ~("   ".length() << (172 ^ 169))) <= 0) ** GOTO lbl19
            return null;
lbl-1000:
            // 1 sources

            {
                IIlIllllllllIll = llIlIlllllllIll[lIllIlllllllIll];
                lllIllllllllIll.append((char)(IIlIllllllllIll ^ IllIllllllllIll[lIlIllllllllIll % IllIllllllllIll.length]));
                "".length();
                ++lIlIllllllllIll;
                ++lIllIlllllllIll;
lbl19:
                // 2 sources

                ** while (!FastScanner.IlIlIlllllIl((int)lIllIlllllllIll, (int)IIllIlllllllIll))
            }
lbl20:
            // 1 sources

            return String.valueOf(lllIllllllllIll);
        }

        private static String lllllIllllIl(String IllIIlllllllIll, String lIlIIlllllllIll) {
            try {
                SecretKeySpec IIlIIlllllllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIlllllllIll.getBytes(StandardCharsets.UTF_8)), lIlIIIlIll[18]), "DES");
                Cipher llIIIlllllllIll = Cipher.getInstance("DES");
                llIIIlllllllIll.init(lIlIIIlIll[2], IIlIIlllllllIll);
                return new String(llIIIlllllllIll.doFinal(Base64.getDecoder().decode(IllIIlllllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception IlIIIlllllllIll) {
                IlIIIlllllllIll.printStackTrace();
                return null;
            }
        }

        private static String IllllIllllIl(String lIIllIllllllIll, String IIIllIllllllIll) {
            try {
                SecretKeySpec lllIlIllllllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIIllIllllllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                Cipher IllIlIllllllIll = Cipher.getInstance("Blowfish");
                IllIlIllllllIll.init(lIlIIIlIll[2], lllIlIllllllIll);
                return new String(IllIlIllllllIll.doFinal(Base64.getDecoder().decode(lIIllIllllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lIlIlIllllllIll) {
                lIlIlIllllllIll.printStackTrace();
                return null;
            }
        }

        private static void IlIIIlllllIl() {
            lIlIIIlIll = new int[97];
            FastScanner.lIlIIIlIll[0] = "   ".length() & ("   ".length() ^ -" ".length());
            FastScanner.lIlIIIlIll[1] = " ".length();
            FastScanner.lIlIIIlIll[2] = " ".length() << " ".length();
            FastScanner.lIlIIIlIll[3] = "   ".length();
            FastScanner.lIlIIIlIll[4] = " ".length() << (" ".length() << " ".length());
            FastScanner.lIlIIIlIll[5] = (4 ^ 0x15) << " ".length();
            FastScanner.lIlIIIlIll[6] = ((0x23 ^ 0x2A) << "   ".length() ^ (0x65 ^ 0x3E)) << " ".length();
            FastScanner.lIlIIIlIll[7] = 0xB ^ 0xE;
            FastScanner.lIlIIIlIll[8] = ((0x1F ^ 0xA) << "   ".length()) + ((0x1F ^ 0x10) << " ".length()) - (0x2C ^ 0x77) + ((0x2D ^ 0x3E) << (" ".length() << " ".length()));
            FastScanner.lIlIIIlIll[9] = (0xE7 ^ 0xBE) << " ".length();
            FastScanner.lIlIIIlIll[10] = "   ".length() << " ".length();
            FastScanner.lIlIIIlIll[11] = (0x63 ^ 0x6C) << " ".length() ^ (0x16 ^ 0xF);
            FastScanner.lIlIIIlIll[12] = 196 + 89 - 121 + 57;
            FastScanner.lIlIIIlIll[13] = (0xBD ^ 0x9C) << (" ".length() << " ".length());
            FastScanner.lIlIIIlIll[14] = 107 + 21 - 119 + 146;
            FastScanner.lIlIIIlIll[15] = (0xAF ^ 0x9E) << (" ".length() << " ".length());
            FastScanner.lIlIIIlIll[16] = 0x5C ^ 0x67 ^ (0xA2 ^ 0xAD) << "   ".length();
            FastScanner.lIlIIIlIll[17] = (0xAB ^ 0x8E) << " ".length();
            FastScanner.lIlIIIlIll[18] = " ".length() << "   ".length();
            FastScanner.lIlIIIlIll[19] = (0x88 ^ 0x9B) << (" ".length() << " ".length()) ^ (1 ^ 0x44);
            FastScanner.lIlIIIlIll[20] = (0xB ^ 0xE) << " ".length();
            FastScanner.lIlIIIlIll[21] = 0x3E ^ 0x7D ^ (4 ^ 0xD) << "   ".length();
            FastScanner.lIlIIIlIll[22] = "   ".length() << (" ".length() << " ".length());
            FastScanner.lIlIIIlIll[23] = 105 + 23 - 97 + 106 ^ (0x24 ^ 5) << (" ".length() << " ".length());
            FastScanner.lIlIIIlIll[24] = (0x12 ^ 0x21 ^ (0x98 ^ 0x95) << (" ".length() << " ".length())) << " ".length();
            FastScanner.lIlIIIlIll[25] = 5 ^ 0xA;
            FastScanner.lIlIIIlIll[26] = " ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.lIlIIIlIll[27] = 0x19 ^ 0x72 ^ (0xB1 ^ 0x8C) << " ".length();
            FastScanner.lIlIIIlIll[28] = ("   ".length() << "   ".length() ^ (0x43 ^ 0x52)) << " ".length();
            FastScanner.lIlIIIlIll[29] = 0x2B ^ 0x1E ^ (0x50 ^ 0x43) << " ".length();
            FastScanner.lIlIIIlIll[30] = (78 + 142 - 60 + 23 ^ (0x64 ^ 0x3D) << " ".length()) << (" ".length() << " ".length());
            FastScanner.lIlIIIlIll[31] = 0x7D ^ 0x68;
            FastScanner.lIlIIIlIll[32] = (0x20 ^ 0x2B) << " ".length();
            FastScanner.lIlIIIlIll[33] = (152 + 26 - 124 + 137 ^ (0x16 ^ 5) << "   ".length()) << " ".length();
            FastScanner.lIlIIIlIll[34] = 0x87 ^ 0x82 ^ (0xBD ^ 0xB4) << " ".length();
            FastScanner.lIlIIIlIll[35] = "   ".length() << "   ".length();
            FastScanner.lIlIIIlIll[36] = (0x1F ^ 0x10) << (" ".length() << " ".length());
            FastScanner.lIlIIIlIll[37] = 0xA0 ^ 0xB9;
            FastScanner.lIlIIIlIll[38] = (0xD0 ^ 0xB1 ^ (0x36 ^ 0x2D) << (" ".length() << " ".length())) << " ".length();
            FastScanner.lIlIIIlIll[39] = 25 + 9 - -92 + 3 ^ (0x9D ^ 0xB6) << (" ".length() << " ".length());
            FastScanner.lIlIIIlIll[40] = 0x11 ^ 0x20;
            FastScanner.lIlIIIlIll[41] = ((0xA6 ^ 0x91) << " ".length()) + (0x38 ^ 0x2D) - ((0x14 ^ 9) << (" ".length() << " ".length())) + ((0x81 ^ 0xB8) << " ".length());
            FastScanner.lIlIIIlIll[42] = (120 + 99 - 150 + 86 ^ (0x24 ^ 3) << (" ".length() << " ".length())) << ((0x45 ^ 0x56) << (" ".length() << " ".length()) ^ (0xDF ^ 0x96));
            FastScanner.lIlIIIlIll[43] = 26 + 30 - 31 + 140;
            FastScanner.lIlIIIlIll[44] = 0xB7 ^ 0xAC;
            FastScanner.lIlIIIlIll[45] = (0x7F ^ 0x78) << (" ".length() << " ".length());
            FastScanner.lIlIIIlIll[46] = 0xB8 ^ 0xA5;
            FastScanner.lIlIIIlIll[47] = (131 + 77 - 166 + 99 ^ (0x4F ^ 0xE) << " ".length()) << " ".length();
            FastScanner.lIlIIIlIll[48] = (0x8F ^ 0x94) << (" ".length() << " ".length()) ^ (0x7A ^ 9);
            FastScanner.lIlIIIlIll[49] = " ".length() << (0x6D ^ 0x68);
            FastScanner.lIlIIIlIll[50] = 120 + 91 - 144 + 72 ^ (0x71 ^ 0x24) << " ".length();
            FastScanner.lIlIIIlIll[51] = 0x2F ^ 0x38 ^ (3 ^ 0x26) << " ".length();
            FastScanner.lIlIIIlIll[52] = 0x1D ^ 0x2A;
            FastScanner.lIlIIIlIll[53] = 3 + 97 - -58 + 55;
            FastScanner.lIlIIIlIll[54] = (4 ^ 0x29) << (" ".length() << " ".length());
            FastScanner.lIlIIIlIll[55] = 0xE8 ^ 0xC7;
            FastScanner.lIlIIIlIll[56] = 0xF2 ^ 0xB5 ^ (0x16 ^ 0xF) << (" ".length() << " ".length());
            FastScanner.lIlIIIlIll[57] = (0x86 ^ 0x8F) << (" ".length() << " ".length());
            FastScanner.lIlIIIlIll[58] = 0x12 ^ 0x37;
            FastScanner.lIlIIIlIll[59] = 0x40 ^ 0x67;
            FastScanner.lIlIIIlIll[60] = (61 + 117 - 172 + 155 ^ (0x4F ^ 0x66) << (" ".length() << " ".length())) << "   ".length();
            FastScanner.lIlIIIlIll[61] = 0x23 ^ 0xA;
            FastScanner.lIlIIIlIll[62] = (0xE4 ^ 0xBF ^ (0x56 ^ 0x71) << " ".length()) << " ".length();
            FastScanner.lIlIIIlIll[63] = (0x91 ^ 0xBC) << " ".length() ^ (0xFE ^ 0x8F);
            FastScanner.lIlIIIlIll[64] = (0x3F ^ 0x34) << (" ".length() << " ".length());
            FastScanner.lIlIIIlIll[65] = (0xC4 ^ 0xBD ^ (0x88 ^ 0xBF) << " ".length()) << " ".length();
            FastScanner.lIlIIIlIll[66] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.lIlIIIlIll[67] = (38 + 11 - -27 + 85 ^ (0x60 ^ 0x77) << "   ".length()) << " ".length();
            FastScanner.lIlIIIlIll[68] = (0x1C ^ 0x17) << (" ".length() << " ".length()) ^ (0x9A ^ 0x85);
            FastScanner.lIlIIIlIll[69] = (0x62 ^ 0x6F) << (" ".length() << " ".length());
            FastScanner.lIlIIIlIll[70] = 0x6D ^ 0x58;
            FastScanner.lIlIIIlIll[71] = ((0xBB ^ 0xB4) << (" ".length() << " ".length()) ^ (6 ^ 0x21)) << " ".length();
            FastScanner.lIlIIIlIll[72] = (3 + 153 - -41 + 2 ^ "   ".length() << ("   ".length() << " ".length())) << "   ".length();
            FastScanner.lIlIIIlIll[73] = 94 + 5 - -75 + 45 ^ (0x24 ^ 0x73) << " ".length();
            FastScanner.lIlIIIlIll[74] = (0x2A ^ 0x21) << "   ".length();
            FastScanner.lIlIIIlIll[75] = 188 + 91 - 215 + 145 ^ (0x51 ^ 0x46) << "   ".length();
            FastScanner.lIlIIIlIll[76] = (0x61 ^ 0x40) << " ".length();
            FastScanner.lIlIIIlIll[77] = (0x46 ^ 9) + ("   ".length() << (" ".length() << (" ".length() << " ".length()))) - -(0x6C ^ 0x71) + (0xA6 ^ 0xB5);
            FastScanner.lIlIIIlIll[78] = (" ".length() << "   ".length() ^ (0x4C ^ 0x15)) << " ".length();
            FastScanner.lIlIIIlIll[79] = 0xB2 ^ 0xC7 ^ (8 ^ 0x1B) << (" ".length() << " ".length());
            FastScanner.lIlIIIlIll[80] = (0x9B ^ 0x86) << " ".length();
            FastScanner.lIlIIIlIll[81] = (0x5E ^ 0x6D) << (" ".length() << " ".length());
            FastScanner.lIlIIIlIll[82] = 83 + 22 - -79 + 9;
            FastScanner.lIlIIIlIll[83] = (0x1A ^ 0x37) << " ".length() ^ (0x6B ^ 0xA);
            FastScanner.lIlIIIlIll[84] = -" ".length();
            FastScanner.lIlIIIlIll[85] = (0x43 ^ 0x4C) << " ".length() ^ (0x71 ^ 0x52);
            FastScanner.lIlIIIlIll[86] = 6 ^ 0x43;
            FastScanner.lIlIIIlIll[87] = "   ".length() << (0x36 ^ 0x33);
            FastScanner.lIlIIIlIll[88] = 0x58 ^ 0xF;
            FastScanner.lIlIIIlIll[89] = ((0xE2 ^ 0xB7) << " ".length() ^ 168 + 85 - 222 + 150) << " ".length();
            FastScanner.lIlIIIlIll[90] = (0xB7 ^ 0xB2) << (" ".length() << (" ".length() << " ".length())) ^ (0xD8 ^ 0xB7);
            FastScanner.lIlIIIlIll[91] = (0xB2 ^ 0xA3) << "   ".length();
            FastScanner.lIlIIIlIll[92] = " ".length() << ("   ".length() << " ".length());
            FastScanner.lIlIIIlIll[93] = (1 ^ 0x16) << "   ".length();
            FastScanner.lIlIIIlIll[94] = 51 + 17 - -33 + 68;
            FastScanner.lIlIIIlIll[95] = " ".length() << ("   ".length() << " ".length()) ^ " ".length();
            FastScanner.lIlIIIlIll[96] = ((0x9C ^ 0x85) << (" ".length() << " ".length()) ^ (0xE9 ^ 0x9C)) << (" ".length() << " ".length());
        }

        private static boolean IIIlIlllllIl(int n, int n2) {
            return n == n2;
        }

        private static boolean IlIlIlllllIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean lllIIlllllIl(int n, int n2) {
            return n < n2;
        }

        private static boolean lIIlIlllllIl(int n, int n2) {
            return n <= n2;
        }

        private static boolean lIlIIlllllIl(int n, int n2) {
            return n > n2;
        }

        private static boolean IllIIlllllIl(Object object) {
            return object != null;
        }

        private static boolean llIIIlllllIl(int n) {
            return n != 0;
        }

        private static boolean llIlIlllllIl(int n) {
            return n == 0;
        }

        private static boolean IIlIIlllllIl(int n) {
            return n > 0;
        }

        private static boolean IIllIlllllIl(int n, int n2) {
            return n != n2;
        }
    }
}

