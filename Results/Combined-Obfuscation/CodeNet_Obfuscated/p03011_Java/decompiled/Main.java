/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Main$Foster
 */
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static String[] IIIIIl;
    private static int[] IIlIIl;
    private static String[] llIIll;
    private static int[] IlIlIl;
    private static String[] lllIll;
    private static int[] lIIlll;

    public Main() {
        Main lIIIlllIlIIllIl;
    }

    public static void main(String[] stringArray) throws Exception {
        Foster llIlIllIlIIllIl = new Foster();
        PrintWriter IlIlIllIlIIllIl = new PrintWriter(System.out);
        int lIIlIllIlIIllIl = llIlIllIlIIllIl.nextInt();
        if (Main.llllIIIl(Main.IlIllll(Main.IlIlIll(lIIlIllIlIIllIl, IIlIIl[IlIlIl[lIIlll[0]]]) ? 1 : 0) ? 1 : 0)) {
            IlIlIllIlIIllIl.println(IIIIIl[IIlIIl[IlIlIl[lIIlll[1]]]]);
            llIIll[lIIlll[0]].length();
            lllIll[lIIlll[0]].length();
            if (Main.llllIIIl(Main.llIllll(llIIll[lIIlll[1]].length() << llIIll[lIIlll[2]].length(), -llIIll[lIIlll[3]].length()) ? 1 : 0)) {
                return;
            }
        } else {
            IlIlIllIlIIllIl.println(IIIIIl[IIlIIl[IlIlIl[lIIlll[0]]]]);
        }
        IlIlIllIlIIllIl.close();
    }

    static long[] sort(long[] IIlllIlIlIIllIl) {
        long[] lArray;
        ArrayList<Long> llIllIlIlIIllIl = new ArrayList<Long>();
        long[] IlIllIlIlIIllIl22 = IIlllIlIlIIllIl;
        int lIIllIlIlIIllIl = IlIllIlIlIIllIl22.length;
        int IIIllIlIlIIllIl = IIlIIl[IlIlIl[lIIlll[1]]];
        while (Main.llllIIIl(Main.IlIllll(Main.llIlIll(IIIllIlIlIIllIl, lIIllIlIlIIllIl) ? 1 : 0) ? 1 : 0)) {
            long lllIlIlIlIIllIl = IlIllIlIlIIllIl22[IIIllIlIlIIllIl];
            llIllIlIlIIllIl.add(lllIlIlIlIIllIl);
            llIIll[lIIlll[4]].length();
            ++IIIllIlIlIIllIl;
            llIIll[lIIlll[5]].length();
            lllIll[lIIlll[1]].length();
            if (!Main.llllIIIl(Main.IIlllll(llIIll[lIIlll[6]].length() << llIIll[lIIlll[7]].length(), llIIll[lIIlll[8]].length()) ? 1 : 0)) continue;
            return null;
        }
        Collections.sort(llIllIlIlIIllIl);
        int IlIllIlIlIIllIl22 = IIlIIl[IlIlIl[lIIlll[1]]];
        while (Main.llllIIIl(Main.IlIllll(Main.llIlIll(IlIllIlIlIIllIl22, llIllIlIlIIllIl.size()) ? 1 : 0) ? 1 : 0)) {
            IIlllIlIlIIllIl[IlIllIlIlIIllIl22] = (Long)llIllIlIlIIllIl.get(IlIllIlIlIIllIl22);
            ++IlIllIlIlIIllIl22;
            llIIll[lIIlll[9]].length();
            lllIll[lIIlll[2]].length();
            if (!Main.llllIIIl(Main.lIlllll(llIIll[lIIlll[10]].length(), (IlIlIl[lIIlll[2]] ^ IlIlIl[lIIlll[3]]) & (IlIlIl[lIIlll[4]] ^ IlIlIl[lIIlll[5]] ^ IlIlIl[lIIlll[6]])) ? 1 : 0)) continue;
            return null;
        }
        return lArray;
    }

    static {
        Main.IlllIIIl();
        Main.lIllIIIl();
        Main.lIIllll();
        Main.IIIIlll();
        Main.lIIlIll();
    }

    private static void lIIlIll() {
        IIlIIl = new int[IlIlIl[lIIlll[7]]];
        Main.IIlIIl[Main.IlIlIl[Main.lIIlll[0]]] = llIIll[IlIlIl[lIIlll[8]]].length();
        Main.IIlIIl[Main.IlIlIl[Main.lIIlll[1]]] = ((IlIlIl[lIIlll[9]] ^ IlIlIl[lIIlll[10]]) << llIIll[IlIlIl[lIIlll[11]]].length() ^ (IlIlIl[lIIlll[12]] ^ IlIlIl[lIIlll[13]])) & (IlIlIl[lIIlll[14]] + IlIlIl[lIIlll[15]] - IlIlIl[lIIlll[16]] + IlIlIl[lIIlll[17]] ^ (IlIlIl[lIIlll[18]] ^ IlIlIl[lIIlll[19]]) << (llIIll[IlIlIl[lIIlll[20]]].length() << llIIll[IlIlIl[lIIlll[21]]].length()) ^ -llIIll[IlIlIl[lIIlll[22]]].length());
    }

    private static boolean IlIlIll(int n, int n2) {
        boolean bl;
        if (Main.llllIIIl(Main.lIlllll(n, n2) ? 1 : 0)) {
            bl = IlIlIl[lIIlll[1]];
            lllIll[lIIlll[3]].length();
            "".length();
            if (Main.IIIIlIIl(lllIll[lIIlll[4]].length(), -lllIll[lIIlll[5]].length())) {
                return ((lIIlll[23] ^ lIIlll[24]) & (lIIlll[25] ^ lIIlll[26] ^ lIIlll[27])) != 0;
            }
        } else {
            bl = IlIlIl[lIIlll[0]];
        }
        return bl;
    }

    private static boolean llIlIll(int n, int n2) {
        boolean bl;
        if (Main.llllIIIl(Main.llIllll(n, n2) ? 1 : 0)) {
            bl = IlIlIl[lIIlll[1]];
            lllIll[lIIlll[6]].length();
            "".length();
            if (Main.lIIIlIIl(lllIll[lIIlll[7]].length(), lllIll[lIIlll[8]].length() << (lllIll[lIIlll[9]].length() << lllIll[lIIlll[10]].length()))) {
                return ((lIIlll[28] ^ lIIlll[29]) & (lIIlll[30] ^ lIIlll[31] ^ lIIlll[27])) != 0;
            }
        } else {
            bl = IlIlIl[lIIlll[0]];
        }
        return bl;
    }

    private static void IIIIlll() {
        IIIIIl = new String[IlIlIl[lIIlll[7]]];
        Main.IIIIIl[Main.IlIlIl[Main.lIIlll[0]]] = Main.IIIlIll(llIIll[IlIlIl[lIIlll[32]]], llIIll[IlIlIl[lIIlll[33]]]);
        Main.IIIIIl[Main.IlIlIl[Main.lIIlll[1]]] = Main.IIIlIll(llIIll[IlIlIl[lIIlll[34]]], llIIll[IlIlIl[lIIlll[35]]]);
    }

    private static String IIIlIll(String IllIllIIlIIllIl, String lIlIllIIlIIllIl) {
        try {
            SecretKeySpec IIlIllIIlIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(llIIll[IlIlIl[lIIlll[36]]]).digest(lIlIllIIlIIllIl.getBytes(StandardCharsets.UTF_8)), IlIlIl[lIIlll[37]]), llIIll[IlIlIl[lIIlll[38]]]);
            Cipher llIIllIIlIIllIl = Cipher.getInstance(llIIll[IlIlIl[lIIlll[39]]]);
            llIIllIIlIIllIl.init(IlIlIl[lIIlll[7]], IIlIllIIlIIllIl);
            return new String(llIIllIIlIIllIl.doFinal(Base64.getDecoder().decode(IllIllIIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIIllIIlIIllIl) {
            IlIIllIIlIIllIl.printStackTrace();
            return null;
        }
    }

    private static void lIIllll() {
        IlIlIl = new int[lIIlll[40]];
        Main.IlIlIl[Main.lIIlll[0]] = ((lIIlll[41] ^ lIIlll[42]) << (lIIlll[1] ^ lIIlll[4]) ^ lIIlll[23] + lIIlll[43] - lIIlll[44] + lIIlll[45]) & ((lIIlll[46] ^ lIIlll[47]) << lllIll[lIIlll[11]].length() ^ lIIlll[24] + lIIlll[48] - lIIlll[39] + lIIlll[49] ^ -lllIll[lIIlll[12]].length());
        Main.IlIlIl[Main.lIIlll[1]] = lllIll[lIIlll[13]].length();
        Main.IlIlIl[Main.lIIlll[2]] = lIIlll[50] ^ lIIlll[51];
        Main.IlIlIl[Main.lIIlll[3]] = lllIll[lIIlll[14]].length() << lllIll[lIIlll[15]].length();
        Main.IlIlIl[Main.lIIlll[4]] = (lllIll[lIIlll[16]].length() << lllIll[lIIlll[17]].length() ^ (lIIlll[52] ^ lIIlll[53])) << lllIll[lIIlll[18]].length();
        Main.IlIlIl[Main.lIIlll[5]] = lIIlll[20] + lIIlll[54] - lIIlll[55] + lIIlll[56];
        Main.IlIlIl[Main.lIIlll[6]] = -lllIll[lIIlll[19]].length();
        Main.IlIlIl[Main.lIIlll[7]] = lllIll[lIIlll[20]].length() << lllIll[lIIlll[21]].length();
        Main.IlIlIl[Main.lIIlll[8]] = lIIlll[57] + lIIlll[58] - lIIlll[4] + lIIlll[11] ^ (lIIlll[41] ^ lIIlll[14]) << (lllIll[lIIlll[22]].length() << lllIll[lIIlll[32]].length());
        Main.IlIlIl[Main.lIIlll[9]] = (lIIlll[59] ^ lIIlll[60]) << lllIll[lIIlll[33]].length();
        Main.IlIlIl[Main.lIIlll[10]] = lIIlll[61] ^ lIIlll[62] ^ (lIIlll[63] ^ lIIlll[61]) << lllIll[lIIlll[34]].length();
        Main.IlIlIl[Main.lIIlll[11]] = lllIll[lIIlll[35]].length() << (lllIll[lIIlll[36]].length() << lllIll[lIIlll[37]].length());
        Main.IlIlIl[Main.lIIlll[12]] = (lIIlll[64] ^ lIIlll[59] ^ (lIIlll[7] ^ lIIlll[37]) << lllIll[lIIlll[38]].length()) << lllIll[lIIlll[39]].length();
        Main.IlIlIl[Main.lIIlll[13]] = lIIlll[65] + lIIlll[66] - lIIlll[51] + lIIlll[67];
        Main.IlIlIl[Main.lIIlll[14]] = (lIIlll[68] ^ lIIlll[56]) << (lllIll[lIIlll[40]].length() << lllIll[lIIlll[61]].length());
        Main.IlIlIl[Main.lIIlll[15]] = (lllIll[lIIlll[69]].length() << (lIIlll[36] ^ lIIlll[39]) ^ (lIIlll[70] ^ lIIlll[25])) << (lllIll[lIIlll[64]].length() << lllIll[lIIlll[71]].length());
        Main.IlIlIl[Main.lIIlll[16]] = lllIll[lIIlll[72]].length() << ((lIIlll[73] ^ lIIlll[74]) << lllIll[lIIlll[75]].length() ^ (lIIlll[76] ^ lIIlll[77]));
        Main.IlIlIl[Main.lIIlll[17]] = lIIlll[78] ^ lIIlll[79];
        Main.IlIlIl[Main.lIIlll[18]] = ((lIIlll[80] ^ lIIlll[81]) << (lllIll[lIIlll[82]].length() << lllIll[lIIlll[30]].length()) ^ (lIIlll[83] ^ lIIlll[5])) << lllIll[lIIlll[84]].length();
        Main.IlIlIl[Main.lIIlll[19]] = (lIIlll[85] ^ lIIlll[86]) + (lIIlll[74] ^ lIIlll[73]) - -(lIIlll[17] ^ lIIlll[13]) + (lIIlll[87] ^ lIIlll[88]);
        Main.IlIlIl[Main.lIIlll[20]] = lIIlll[15] ^ lIIlll[2];
        Main.IlIlIl[Main.lIIlll[21]] = (lIIlll[89] ^ lIIlll[90] ^ lllIll[lIIlll[91]].length() << (lIIlll[23] ^ lIIlll[31])) << lllIll[lIIlll[42]].length();
        Main.IlIlIl[Main.lIIlll[22]] = lIIlll[31] ^ lIIlll[92] ^ (lIIlll[93] ^ lIIlll[94]) << lllIll[lIIlll[57]].length();
        Main.IlIlIl[Main.lIIlll[32]] = lllIll[lIIlll[95]].length() << (lllIll[lIIlll[92]].length() << (lllIll[lIIlll[96]].length() << lllIll[lIIlll[41]].length()));
        Main.IlIlIl[Main.lIIlll[33]] = (lIIlll[35] ^ lIIlll[30]) << lllIll[lIIlll[97]].length() ^ (lIIlll[98] ^ lIIlll[88]);
        Main.IlIlIl[Main.lIIlll[34]] = (lIIlll[99] ^ lIIlll[100]) << lllIll[lIIlll[63]].length();
        Main.IlIlIl[Main.lIIlll[35]] = lIIlll[101] ^ lIIlll[102];
        Main.IlIlIl[Main.lIIlll[36]] = (lIIlll[103] ^ lIIlll[104]) << (lllIll[lIIlll[26]].length() << lllIll[lIIlll[90]].length());
        Main.IlIlIl[Main.lIIlll[37]] = lllIll[lIIlll[24]].length() << lllIll[lIIlll[105]].length();
        Main.IlIlIl[Main.lIIlll[38]] = lIIlll[30] ^ lIIlll[26];
        Main.IlIlIl[Main.lIIlll[39]] = (lIIlll[106] ^ lIIlll[107]) << lllIll[lIIlll[107]].length();
    }

    private static boolean lIlllll(int n, int n2) {
        boolean bl;
        if (Main.IlIIlIIl(n, n2)) {
            bl = lIIlll[1];
            "".length();
            if ((((0x71 ^ 0x52) << " ".length() ^ (0xFB ^ 0x9E)) << " ".length() & ((116 + 42 - 116 + 141 ^ (0x5E ^ 0x7B) << (" ".length() << " ".length())) << " ".length() ^ -" ".length())) >= " ".length() << (" ".length() << " ".length())) {
                return (((0xAD ^ 0xA0) << (" ".length() << " ".length()) ^ (0x55 ^ 0x58)) & (0x32 ^ 0x53 ^ (0xBD ^ 0xB6) << "   ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = lIIlll[0];
        }
        return bl;
    }

    private static boolean IIlllll(int n, int n2) {
        boolean bl;
        if (Main.lIIIlIIl(n, n2)) {
            bl = lIIlll[1];
            "".length();
            if (-" ".length() > " ".length()) {
                return ("   ".length() << " ".length() & ~("   ".length() << " ".length())) != 0;
            }
        } else {
            bl = lIIlll[0];
        }
        return bl;
    }

    private static boolean llIllll(int n, int n2) {
        boolean bl;
        if (Main.IIIIlIIl(n, n2)) {
            bl = lIIlll[1];
            "".length();
            if (-" ".length() > 0) {
                return (((0x6C ^ 0x4B) << " ".length() ^ (0x1E ^ 0x5B)) << (" ".length() << " ".length()) & ((0xB1 ^ 0x8C ^ (0x7D ^ 0x66) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
            }
        } else {
            bl = lIIlll[0];
        }
        return bl;
    }

    private static boolean IlIllll(int n) {
        boolean bl;
        if (Main.llllIIIl(n)) {
            bl = lIIlll[1];
            "".length();
            if (null != null) {
                return ((0x97 ^ 0x9A) & ~(0x54 ^ 0x59)) != 0;
            }
        } else {
            bl = lIIlll[0];
        }
        return bl;
    }

    private static void lIllIIIl() {
        llIIll = new String[lIIlll[32]];
        Main.llIIll[Main.lIIlll[0]] = Main.lllIlll("NDptpfwCsP0=", "jnrJj");
        Main.llIIll[Main.lIIlll[1]] = Main.Illllll("Zw==", "GFQIG");
        Main.llIIll[Main.lIIlll[2]] = Main.lllIlll("rCuPo4DGYzY=", "WFQyS");
        Main.llIIll[Main.lIIlll[3]] = Main.llIlIIIl("SXRsSsUq5wM=", "Ipbxb");
        Main.llIIll[Main.lIIlll[4]] = Main.llIlIIIl("iRA31SA8FKM=", "ryvzo");
        Main.llIIll[Main.lIIlll[5]] = Main.llIlIIIl("6SIwKSQRYtY=", "oZWMO");
        Main.llIIll[Main.lIIlll[6]] = Main.llIlIIIl("c7Fm+osCkfc=", "gUbki");
        Main.llIIll[Main.lIIlll[7]] = Main.Illllll("TA==", "lsEAH");
        Main.llIIll[Main.lIIlll[8]] = Main.Illllll("SmRk", "jDDRa");
        Main.llIIll[Main.lIIlll[9]] = Main.Illllll("", "AAOFD");
        Main.llIIll[Main.lIIlll[10]] = Main.llIlIIIl("YqtUrEqf0iY=", "KCTLW");
        Main.llIIll[Main.lIIlll[11]] = Main.llIlIIIl("3uySEXYNT8U=", "opxTU");
        Main.llIIll[Main.lIIlll[12]] = Main.lllIlll("cR8pMvdLYAI=", "pNaQv");
        Main.llIIll[Main.lIIlll[13]] = Main.llIlIIIl("9E4qJFhAMv8=", "fCcUB");
        Main.llIIll[Main.lIIlll[14]] = Main.Illllll("QQ==", "aSzvR");
        Main.llIIll[Main.lIIlll[15]] = Main.lllIlll("uZ79E42kz6E=", "rlKJC");
        Main.llIIll[Main.lIIlll[16]] = Main.Illllll("H1U9NRkuB1cARSde", "fceCp");
        Main.llIIll[Main.lIIlll[17]] = Main.lllIlll("i5ObXwDE4Xk=", "CzvEV");
        Main.llIIll[Main.lIIlll[18]] = Main.Illllll("Aj5uFjEFN30IAT9L", "LvEcT");
        Main.llIIll[Main.lIIlll[19]] = Main.llIlIIIl("YOl/c1zIr9Q=", "QjLrm");
        Main.llIIll[Main.lIIlll[20]] = Main.Illllll("OgxR", "wHdLg");
        Main.llIIll[Main.lIIlll[21]] = Main.Illllll("KwoJ", "oOZds");
        Main.llIIll[Main.lIIlll[22]] = Main.llIlIIIl("n//LsLu/2pU=", "WlPQB");
    }

    private static String lllIlll(String IIIIlIIIlIIllIl, String llllIIIIlIIllIl) {
        try {
            SecretKeySpec IlllIIIIlIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIIIIlIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIIIIlIIllIl = Cipher.getInstance("Blowfish");
            lIllIIIIlIIllIl.init(lIIlll[2], IlllIIIIlIIllIl);
            return new String(lIllIIIIlIIllIl.doFinal(Base64.getDecoder().decode(IIIIlIIIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIllIIIIlIIllIl) {
            IIllIIIIlIIllIl.printStackTrace();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String Illllll(String IlllllllIIIllIl, String lIllllllIIIllIl) {
        IlllllllIIIllIl = new String(Base64.getDecoder().decode(IlllllllIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        IIllllllIIIllIl = new StringBuilder();
        llIlllllIIIllIl = lIllllllIIIllIl.toCharArray();
        IlIlllllIIIllIl = Main.lIIlll[0];
        IIIIllllIIIllIl = IlllllllIIIllIl.toCharArray();
        lIIIllllIIIllIl = IIIIllllIIIllIl.length;
        IlIIllllIIIllIl = Main.lIIlll[0];
        "".length();
        if ("   ".length() > " ".length()) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            lIIlllllIIIllIl = IIIIllllIIIllIl[IlIIllllIIIllIl];
            IIllllllIIIllIl.append((char)(lIIlllllIIIllIl ^ llIlllllIIIllIl[IlIlllllIIIllIl % llIlllllIIIllIl.length]));
            "".length();
            ++IlIlllllIIIllIl;
            ++IlIIllllIIIllIl;
lbl19:
            // 2 sources

            ** while (!Main.lIIIlIIl((int)IlIIllllIIIllIl, (int)lIIIllllIIIllIl))
        }
lbl20:
        // 1 sources

        return String.valueOf(IIllllllIIIllIl);
    }

    private static String llIlIIIl(String llIlIlllIIIllIl, String IlIlIlllIIIllIl) {
        try {
            SecretKeySpec lIIlIlllIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlIlIlllIIIllIl.getBytes(StandardCharsets.UTF_8)), lIIlll[8]), "DES");
            Cipher IIIlIlllIIIllIl = Cipher.getInstance("DES");
            IIIlIlllIIIllIl.init(lIIlll[2], lIIlIlllIIIllIl);
            return new String(IIIlIlllIIIllIl.doFinal(Base64.getDecoder().decode(llIlIlllIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIlllIIIllIl) {
            lllIIlllIIIllIl.printStackTrace();
            return null;
        }
    }

    private static void IlllIIIl() {
        lIIlll = new int[108];
        Main.lIIlll[0] = (0x1A ^ 0xB) & ~(0xB ^ 0x1A);
        Main.lIIlll[1] = " ".length();
        Main.lIIlll[2] = " ".length() << " ".length();
        Main.lIIlll[3] = "   ".length();
        Main.lIIlll[4] = " ".length() << (" ".length() << " ".length());
        Main.lIIlll[5] = 0x68 ^ 0x6D;
        Main.lIIlll[6] = "   ".length() << " ".length();
        Main.lIIlll[7] = 0x27 ^ 0x36 ^ (0x7B ^ 0x70) << " ".length();
        Main.lIIlll[8] = " ".length() << "   ".length();
        Main.lIIlll[9] = 0x31 ^ 0x38;
        Main.lIIlll[10] = (0x11 ^ 0x14) << " ".length();
        Main.lIIlll[11] = 0x3C ^ 0x37;
        Main.lIIlll[12] = "   ".length() << (" ".length() << " ".length());
        Main.lIIlll[13] = 0x7C ^ 0x71;
        Main.lIIlll[14] = (0xAF ^ 0xA8) << " ".length();
        Main.lIIlll[15] = 0xCB ^ 0xC4;
        Main.lIIlll[16] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        Main.lIIlll[17] = (0x17 ^ 0x1C) << " ".length() ^ (0x58 ^ 0x5F);
        Main.lIIlll[18] = (0xB3 ^ 0xBA) << " ".length();
        Main.lIIlll[19] = "   ".length() << " ".length() ^ (0xB5 ^ 0xA0);
        Main.lIIlll[20] = (95 + 54 - 9 + 13 ^ (0x1F ^ 0x38) << (" ".length() << " ".length())) << (" ".length() << " ".length());
        Main.lIIlll[21] = 0xAC ^ 0xB9;
        Main.lIIlll[22] = ((0xC1 ^ 0x96) << " ".length() ^ 44 + 85 - 111 + 147) << " ".length();
        Main.lIIlll[23] = 93 + 114 - 162 + 82 ^ (0x51 ^ 0x5E) << " ".length();
        Main.lIIlll[24] = (0xC ^ 1) << (" ".length() << " ".length());
        Main.lIIlll[25] = 0x67 ^ 0;
        Main.lIIlll[26] = (0x44 ^ 1 ^ (0x79 ^ 0x6E) << (" ".length() << " ".length())) << " ".length();
        Main.lIIlll[27] = -" ".length();
        Main.lIIlll[28] = (0x13 ^ 0x26) << (" ".length() << " ".length());
        Main.lIIlll[29] = (0x68 ^ 0x45) + ((0xB4 ^ 0xA9) << (" ".length() << " ".length())) - (0x66 ^ 0x75) + (0xCB ^ 0xC2);
        Main.lIIlll[30] = 0x83 ^ 0xA4;
        Main.lIIlll[31] = (0xAF ^ 0xB6) << (" ".length() << " ".length());
        Main.lIIlll[32] = 0x75 ^ 0x62;
        Main.lIIlll[33] = "   ".length() << "   ".length();
        Main.lIIlll[34] = 0x46 ^ 0x5F;
        Main.lIIlll[35] = (9 ^ 4) << " ".length();
        Main.lIIlll[36] = 0x94 ^ 0x8F;
        Main.lIIlll[37] = ((0x39 ^ 0x32) << (" ".length() << " ".length()) ^ (0x40 ^ 0x6B)) << (" ".length() << " ".length());
        Main.lIIlll[38] = (0x27 ^ 0x20) << " ".length() ^ (0x5B ^ 0x48);
        Main.lIIlll[39] = (0x37 ^ 0x38) << " ".length();
        Main.lIIlll[40] = 47 + 95 - 22 + 9 ^ (0 ^ 0x4F) << " ".length();
        Main.lIIlll[41] = 0x4E ^ 0x61;
        Main.lIIlll[42] = (0x17 ^ 2) << " ".length();
        Main.lIIlll[43] = 0x32 ^ 9;
        Main.lIIlll[44] = ((0x9C ^ 0x89) << "   ".length() ^ 169 + 36 - 155 + 129) << (" ".length() << " ".length());
        Main.lIIlll[45] = 0xCF ^ 0x90;
        Main.lIIlll[46] = 22 + 70 - -68 + 89;
        Main.lIIlll[47] = (0xC5 ^ 0x82) << " ".length();
        Main.lIIlll[48] = 0xE ^ 0x5D;
        Main.lIIlll[49] = (0x1D ^ 0x16) << "   ".length();
        Main.lIIlll[50] = 52 + 99 - 140 + 150 + (0x4E ^ 0x69) - ((0xB ^ 0x52) << " ".length()) + (146 + 159 - 244 + 104);
        Main.lIIlll[51] = (0x57 ^ 0x18) << " ".length();
        Main.lIIlll[52] = (0x65 ^ 0x76) << (" ".length() << " ".length());
        Main.lIIlll[53] = "   ".length() << (" ".length() << (" ".length() << " ".length())) ^ (0x5B ^ 0x20);
        Main.lIIlll[54] = 30 + 105 - 68 + 126;
        Main.lIIlll[55] = 90 + 99 - 35 + 7;
        Main.lIIlll[56] = 18 + 17 - -15 + 95;
        Main.lIIlll[57] = 100 + 92 - 59 + 6 ^ (0xAE ^ 0xAB) << (0x5C ^ 0x59);
        Main.lIIlll[58] = 0xA ^ 0x57;
        Main.lIIlll[59] = (0x3F ^ 0x38) << (0x1D ^ 0x18) ^ 42 + 79 - 111 + 139;
        Main.lIIlll[60] = (0xC ^ 0x33) << " ".length();
        Main.lIIlll[61] = " ".length() << ((0xB4 ^ 0x8F) << " ".length() ^ (0x6B ^ 0x18));
        Main.lIIlll[62] = 0x1B ^ 0x78;
        Main.lIIlll[63] = 0x4C ^ 5 ^ (0x81 ^ 0x8E) << "   ".length();
        Main.lIIlll[64] = (3 ^ 0x54 ^ (0x19 ^ 0x3A) << " ".length()) << " ".length();
        Main.lIIlll[65] = (0x59 ^ 0x2C ^ " ".length() << ("   ".length() << " ".length())) << " ".length();
        Main.lIIlll[66] = 5 + 10 - -152 + 36 ^ (0x77 ^ 0x2E) << " ".length();
        Main.lIIlll[67] = (0 ^ 0x2D) << " ".length();
        Main.lIIlll[68] = (0x4A ^ 0xB) << " ".length();
        Main.lIIlll[69] = 0x9F ^ 0xBE;
        Main.lIIlll[70] = (33 + 173 - 102 + 75 ^ (0x52 ^ 0x77) << (" ".length() << " ".length())) << " ".length();
        Main.lIIlll[71] = 171 + 83 - 232 + 153 ^ (0xB1 ^ 0x92) << (" ".length() << " ".length());
        Main.lIIlll[72] = (26 + 56 - 59 + 184 ^ (0xD7 ^ 0xB4) << " ".length()) << (" ".length() << " ".length());
        Main.lIIlll[73] = (0x3F ^ 0 ^ (0x77 ^ 0x78) << " ".length()) << (" ".length() << " ".length());
        Main.lIIlll[74] = (0x57 ^ 0x24) + (" ".length() << (0x34 ^ 0x33)) - ((0x2F ^ 0x78) << " ".length()) + ((0x62 ^ 0x79) << (" ".length() << " ".length()));
        Main.lIIlll[75] = " ".length() << (0x3A ^ 0x3F) ^ (0x92 ^ 0x97);
        Main.lIIlll[76] = 154 + 40 - 100 + 75;
        Main.lIIlll[77] = ((0x6E ^ 0x5B) << " ".length() ^ (0x5A ^ 0x53)) << " ".length();
        Main.lIIlll[78] = (0x1B ^ 0xE) + (76 + 4 - -23 + 92) - (0xD6 ^ 0xB9) + ((0x18 ^ 0x2D) << " ".length());
        Main.lIIlll[79] = ((0x45 ^ 0x56) << " ".length() ^ (0x87 ^ 0xB0)) << "   ".length();
        Main.lIIlll[80] = 0xE4 ^ 0xBF ^ (0x7B ^ 0x7C) << (" ".length() << " ".length());
        Main.lIIlll[81] = (0x1B ^ 0x14 ^ "   ".length() << " ".length()) << "   ".length();
        Main.lIIlll[82] = (0x55 ^ 0x60 ^ (0x4F ^ 0x5C) << " ".length()) << " ".length();
        Main.lIIlll[83] = "   ".length() << (0xDC ^ 0xB3 ^ (0xA0 ^ 0x95) << " ".length());
        Main.lIIlll[84] = (0x96 ^ 0x93) << "   ".length();
        Main.lIIlll[85] = 29 + 118 - 86 + 104;
        Main.lIIlll[86] = (0x3E ^ 0x15) << (" ".length() << " ".length());
        Main.lIIlll[87] = (0x40 ^ 0x2F) + (0x2A ^ 0x2D) - (0xB5 ^ 0xBC) + (" ".length() << (0x1E ^ 0x1B));
        Main.lIIlll[88] = (0x62 ^ 0x4F) << (" ".length() << " ".length());
        Main.lIIlll[89] = (0xD1 ^ 0xC4) << (" ".length() << " ".length());
        Main.lIIlll[90] = 0xAB ^ 0x8E ^ (0xAA ^ 0xA1) << " ".length();
        Main.lIIlll[91] = 0x4D ^ 0x64;
        Main.lIIlll[92] = 0x1A ^ 0x37;
        Main.lIIlll[93] = (0xB1 ^ 0xA6) << (" ".length() << " ".length());
        Main.lIIlll[94] = 59 + 90 - 48 + 26;
        Main.lIIlll[95] = ((0x31 ^ 0xC) << " ".length() ^ (0x38 ^ 0x49)) << (" ".length() << " ".length());
        Main.lIIlll[96] = (0xB5 ^ 0xA2) << " ".length();
        Main.lIIlll[97] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        Main.lIIlll[98] = 208 + 69 - 147 + 93;
        Main.lIIlll[99] = (9 ^ 0xC) << (" ".length() << (" ".length() << " ".length()));
        Main.lIIlll[100] = (0x10 ^ 0xF) << "   ".length() ^ 51 + 85 - 114 + 139;
        Main.lIIlll[101] = (0x50 ^ 0x5D) << (" ".length() << (" ".length() << " ".length()));
        Main.lIIlll[102] = 18 + 81 - -88 + 8;
        Main.lIIlll[103] = " ".length() << ((3 ^ 6) << "   ".length() ^ (0x71 ^ 0x5E));
        Main.lIIlll[104] = 63 + 121 - 57 + 6;
        Main.lIIlll[105] = (0x2C ^ 0x6B) << " ".length() ^ 135 + 63 - 155 + 144;
        Main.lIIlll[106] = (0x3D ^ 0xC) << " ".length() ^ (0xD1 ^ 0x8E);
        Main.lIIlll[107] = (0xA2 ^ 0xB9) << " ".length();
    }

    private static boolean IlIIlIIl(int n, int n2) {
        return n == n2;
    }

    private static boolean lIIIlIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIIIlIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean llllIIIl(int n) {
        return n != 0;
    }
}

