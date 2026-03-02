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

class AtCoder {
    final int H;
    final int N;
    final int[] A;
    private static String[] lIIlIlIlIl;
    private static int[] llIlIlIlIl;
    private static String[] IlIIllIlIl;
    private static int[] lIlIllIlIl;
    private static String[] lIllllIlIl;
    private static int[] IIIIIIllIl;

    AtCoder(FastScanner IlllllllIIl) {
        AtCoder llllllllIIl;
        llllllllIIl.H = IlllllllIIl.nextInt();
        llllllllIIl.N = IlllllllIIl.nextInt();
        llllllllIIl.A = new int[llllllllIIl.N];
        int lIllllllIIl = llIlIlIlIl[lIlIllIlIl[IIIIIIllIl[0]]];
        while (AtCoder.llIllIlllIIl(AtCoder.lllIlIIllIIl(AtCoder.lIlllllIlIIl(lIllllllIIl, llllllllIIl.A.length) ? 1 : 0) ? 1 : 0)) {
            llllllllIIl.A[lIllllllIIl] = IlllllllIIl.nextInt();
            ++lIllllllIIl;
            IlIIllIlIl[lIlIllIlIl[IIIIIIllIl[0]]].length();
            lIllllIlIl[IIIIIIllIl[0]].length();
            if (!AtCoder.llIllIlllIIl(AtCoder.IIIllIIllIIl(-IlIIllIlIl[lIlIllIlIl[IIIIIIllIl[1]]].length(), IlIIllIlIl[lIlIllIlIl[IIIIIIllIl[2]]].length()) ? 1 : 0)) continue;
            throw null;
        }
    }

    void solve(PrintWriter lIIIllllIIl) {
        AtCoder IlIIllllIIl;
        int IIIIllllIIl = IlIIllllIIl.H;
        int llllIlllIIl = llIlIlIlIl[lIlIllIlIl[IIIIIIllIl[0]]];
        while (AtCoder.llIllIlllIIl(AtCoder.lllIlIIllIIl(AtCoder.lIlllllIlIIl(llllIlllIIl, IlIIllllIIl.A.length) ? 1 : 0) ? 1 : 0)) {
            if (AtCoder.llIllIlllIIl(AtCoder.lllIlIIllIIl(AtCoder.IllllllIlIIl(IIIIllllIIl -= IlIIllllIIl.A[llllIlllIIl]) ? 1 : 0) ? 1 : 0)) {
                IlIIllIlIl[lIlIllIlIl[IIIIIIllIl[3]]].length();
                lIllllIlIl[IIIIIIllIl[1]].length();
                if (AtCoder.llIllIlllIIl(AtCoder.lIIllIIllIIl(-IlIIllIlIl[lIlIllIlIl[IIIIIIllIl[4]]].length()) ? 1 : 0)) {
                    return;
                }
            } else {
                lIIIllllIIl.println(lIIlIlIlIl[llIlIlIlIl[lIlIllIlIl[IIIIIIllIl[0]]]]);
                IlIIllIlIl[lIlIllIlIl[IIIIIIllIl[5]]].length();
                lIllllIlIl[IIIIIIllIl[2]].length();
                if (!AtCoder.llIllIlllIIl(AtCoder.lllIlIIllIIl((lIlIllIlIl[IIIIIIllIl[6]] ^ lIlIllIlIl[IIIIIIllIl[7]]) & (lIlIllIlIl[IIIIIIllIl[8]] ^ lIlIllIlIl[IIIIIIllIl[9]] ^ lIlIllIlIl[IIIIIIllIl[10]])) ? 1 : 0)) break;
                return;
            }
            ++llllIlllIIl;
            IlIIllIlIl[lIlIllIlIl[IIIIIIllIl[11]]].length();
            lIllllIlIl[IIIIIIllIl[3]].length();
            if (!AtCoder.llIllIlllIIl(AtCoder.IlIllIIllIIl(null) ? 1 : 0)) continue;
            return;
        }
        if (AtCoder.llIllIlllIIl(AtCoder.lllIlIIllIIl(AtCoder.IllllllIlIIl(IIIIllllIIl) ? 1 : 0) ? 1 : 0)) {
            lIIIllllIIl.println(lIIlIlIlIl[llIlIlIlIl[lIlIllIlIl[IIIIIIllIl[1]]]]);
        }
    }

    static {
        AtCoder.IlIllIlllIIl();
        AtCoder.lIIllIlllIIl();
        AtCoder.IllIlIIllIIl();
        AtCoder.lIlIlIIllIIl();
        AtCoder.IIlllllIlIIl();
        AtCoder.IIIllllIlIIl();
    }

    private static void IIIllllIlIIl() {
        lIIlIlIlIl = new String[llIlIlIlIl[lIlIllIlIl[IIIIIIllIl[2]]]];
        AtCoder.lIIlIlIlIl[AtCoder.llIlIlIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[0]]]] = AtCoder.IIIIlllIlIIl(IlIIllIlIl[lIlIllIlIl[IIIIIIllIl[12]]], IlIIllIlIl[lIlIllIlIl[IIIIIIllIl[13]]]);
        AtCoder.lIIlIlIlIl[AtCoder.llIlIlIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[1]]]] = AtCoder.IIIIlllIlIIl(IlIIllIlIl[lIlIllIlIl[IIIIIIllIl[14]]], IlIIllIlIl[lIlIllIlIl[IIIIIIllIl[15]]]);
    }

    /*
     * Unable to fully structure code
     */
    private static String IIIIlllIlIIl(String lIlllIllIIl, String IIlllIllIIl) {
        lIlllIllIIl = new String(Base64.getDecoder().decode(lIlllIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        llIllIllIIl = new StringBuilder();
        IlIllIllIIl = IIlllIllIIl.toCharArray();
        lIIllIllIIl = AtCoder.llIlIlIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[0]]];
        llllIIllIIl = lIlllIllIIl.toCharArray();
        IIIIlIllIIl = llllIIllIIl.length;
        lIIIlIllIIl = AtCoder.llIlIlIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[0]]];
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[16]]].length();
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[4]].length();
        if (!AtCoder.llIllIlllIIl((int)AtCoder.llIllIIllIIl(-AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[17]]].length(), AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[18]]].length() << (AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[19]]].length() << AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[20]]].length())))) ** GOTO lbl21
        return null;
lbl-1000:
        // 1 sources

        {
            IIIllIllIIl = llllIIllIIl[lIIIlIllIIl];
            llIllIllIIl.append((char)(IIIllIllIIl ^ IlIllIllIIl[lIIllIllIIl % IlIllIllIIl.length]));
            AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[21]]].length();
            ++lIIllIllIIl;
            ++lIIIlIllIIl;
lbl21:
            // 2 sources

            ** while (!AtCoder.llIllIlllIIl((int)AtCoder.lllIlIIllIIl((int)AtCoder.lllllllIlIIl((int)lIIIlIllIIl, (int)IIIIlIllIIl))))
        }
lbl22:
        // 1 sources

        return String.valueOf(llIllIllIIl);
    }

    private static void IIlllllIlIIl() {
        llIlIlIlIl = new int[lIlIllIlIl[IIIIIIllIl[3]]];
        AtCoder.llIlIlIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[0]]] = ((lIlIllIlIl[IIIIIIllIl[11]] ^ lIlIllIlIl[IIIIIIllIl[22]]) << IlIIllIlIl[lIlIllIlIl[IIIIIIllIl[23]]].length() ^ (lIlIllIlIl[IIIIIIllIl[13]] ^ lIlIllIlIl[IIIIIIllIl[24]])) << IlIIllIlIl[lIlIllIlIl[IIIIIIllIl[25]]].length() & ((lIlIllIlIl[IIIIIIllIl[26]] ^ lIlIllIlIl[IIIIIIllIl[27]] ^ (lIlIllIlIl[IIIIIIllIl[28]] ^ lIlIllIlIl[IIIIIIllIl[29]]) << (IlIIllIlIl[lIlIllIlIl[IIIIIIllIl[30]]].length() << (IlIIllIlIl[lIlIllIlIl[IIIIIIllIl[31]]].length() << IlIIllIlIl[lIlIllIlIl[IIIIIIllIl[32]]].length()))) << IlIIllIlIl[lIlIllIlIl[IIIIIIllIl[33]]].length() ^ -IlIIllIlIl[lIlIllIlIl[IIIIIIllIl[34]]].length());
        AtCoder.llIlIlIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[1]]] = IlIIllIlIl[lIlIllIlIl[IIIIIIllIl[35]]].length();
        AtCoder.llIlIlIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[2]]] = IlIIllIlIl[lIlIllIlIl[IIIIIIllIl[36]]].length() << IlIIllIlIl[lIlIllIlIl[IIIIIIllIl[37]]].length();
    }

    private static boolean lllllllIlIIl(int n, int n2) {
        boolean bl;
        if (AtCoder.llIllIlllIIl(AtCoder.IIlllIIllIIl(n, n2) ? 1 : 0)) {
            bl = lIlIllIlIl[IIIIIIllIl[1]];
            lIllllIlIl[IIIIIIllIl[5]].length();
            "".length();
            if (AtCoder.IIlllIlllIIl(lIllllIlIl[IIIIIIllIl[6]].length() << (lIllllIlIl[IIIIIIllIl[7]].length() << lIllllIlIl[IIIIIIllIl[8]].length()), lIllllIlIl[IIIIIIllIl[9]].length() << lIllllIlIl[IIIIIIllIl[10]].length())) {
                return ((IIIIIIllIl[38] ^ IIIIIIllIl[26] ^ (IIIIIIllIl[19] ^ IIIIIIllIl[20]) << (lIllllIlIl[IIIIIIllIl[11]].length() << (lIllllIlIl[IIIIIIllIl[12]].length() << lIllllIlIl[IIIIIIllIl[13]].length()))) & ((IIIIIIllIl[39] ^ IIIIIIllIl[40]) << lIllllIlIl[IIIIIIllIl[14]].length() ^ IIIIIIllIl[41] + IIIIIIllIl[42] - IIIIIIllIl[43] + IIIIIIllIl[44] ^ -lIllllIlIl[IIIIIIllIl[15]].length())) != 0;
            }
        } else {
            bl = lIlIllIlIl[IIIIIIllIl[0]];
        }
        return bl;
    }

    private static boolean lIlllllIlIIl(int n, int n2) {
        boolean bl;
        if (AtCoder.llIllIlllIIl(AtCoder.lIlllIIllIIl(n, n2) ? 1 : 0)) {
            bl = lIlIllIlIl[IIIIIIllIl[1]];
            lIllllIlIl[IIIIIIllIl[16]].length();
            "".length();
            if (AtCoder.llIllIlllIIl((IIIIIIllIl[17] ^ IIIIIIllIl[45]) & (IIIIIIllIl[46] ^ IIIIIIllIl[47] ^ IIIIIIllIl[48]))) {
                return ((IIIIIIllIl[45] ^ IIIIIIllIl[25]) & (IIIIIIllIl[16] ^ IIIIIIllIl[33] ^ IIIIIIllIl[48])) != 0;
            }
        } else {
            bl = lIlIllIlIl[IIIIIIllIl[0]];
        }
        return bl;
    }

    private static boolean IllllllIlIIl(int n) {
        boolean bl;
        if (AtCoder.llIllIlllIIl(AtCoder.IllllIIllIIl(n) ? 1 : 0)) {
            bl = lIlIllIlIl[IIIIIIllIl[1]];
            lIllllIlIl[IIIIIIllIl[17]].length();
            "".length();
            if (AtCoder.lIlllIlllIIl(lIllllIlIl[IIIIIIllIl[18]].length(), lIllllIlIl[IIIIIIllIl[19]].length() << lIllllIlIl[IIIIIIllIl[20]].length())) {
                return ((IIIIIIllIl[44] + IIIIIIllIl[49] - IIIIIIllIl[50] + IIIIIIllIl[51] ^ (IIIIIIllIl[45] ^ IIIIIIllIl[52]) << lIllllIlIl[IIIIIIllIl[21]].length()) << lIllllIlIl[IIIIIIllIl[22]].length() & (((IIIIIIllIl[53] ^ IIIIIIllIl[54]) << (IIIIIIllIl[55] ^ IIIIIIllIl[56]) ^ IIIIIIllIl[57] + IIIIIIllIl[0] - IIIIIIllIl[28] + IIIIIIllIl[58]) << lIllllIlIl[IIIIIIllIl[23]].length() ^ -lIllllIlIl[IIIIIIllIl[24]].length())) != 0;
            }
        } else {
            bl = lIlIllIlIl[IIIIIIllIl[0]];
        }
        return bl;
    }

    private static void lIlIlIIllIIl() {
        IlIIllIlIl = new String[lIlIllIlIl[IIIIIIllIl[59]]];
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[0]]] = AtCoder.lllIIIIllIIl(lIllllIlIl[IIIIIIllIl[25]], lIllllIlIl[IIIIIIllIl[26]]);
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[1]]] = AtCoder.lllIIIIllIIl(lIllllIlIl[IIIIIIllIl[27]], lIllllIlIl[IIIIIIllIl[28]]);
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[2]]] = AtCoder.IlIIlIIllIIl(lIllllIlIl[IIIIIIllIl[29]], lIllllIlIl[IIIIIIllIl[30]]);
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[3]]] = AtCoder.lllIIIIllIIl(lIllllIlIl[IIIIIIllIl[31]], lIllllIlIl[IIIIIIllIl[32]]);
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[4]]] = AtCoder.lllIIIIllIIl(lIllllIlIl[IIIIIIllIl[33]], lIllllIlIl[IIIIIIllIl[34]]);
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[5]]] = AtCoder.llIIlIIllIIl(lIllllIlIl[IIIIIIllIl[35]], lIllllIlIl[IIIIIIllIl[36]]);
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[11]]] = AtCoder.IlIIlIIllIIl(lIllllIlIl[IIIIIIllIl[37]], lIllllIlIl[IIIIIIllIl[59]]);
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[12]]] = AtCoder.IlIIlIIllIIl(lIllllIlIl[IIIIIIllIl[60]], lIllllIlIl[IIIIIIllIl[45]]);
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[13]]] = AtCoder.IlIIlIIllIIl(lIllllIlIl[IIIIIIllIl[61]], lIllllIlIl[IIIIIIllIl[62]]);
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[14]]] = AtCoder.lllIIIIllIIl(lIllllIlIl[IIIIIIllIl[63]], lIllllIlIl[IIIIIIllIl[64]]);
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[15]]] = AtCoder.IlIIlIIllIIl(lIllllIlIl[IIIIIIllIl[65]], lIllllIlIl[IIIIIIllIl[66]]);
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[16]]] = AtCoder.llIIlIIllIIl(lIllllIlIl[IIIIIIllIl[67]], lIllllIlIl[IIIIIIllIl[68]]);
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[17]]] = AtCoder.lllIIIIllIIl(lIllllIlIl[IIIIIIllIl[69]], lIllllIlIl[IIIIIIllIl[70]]);
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[18]]] = AtCoder.lllIIIIllIIl(lIllllIlIl[IIIIIIllIl[71]], lIllllIlIl[IIIIIIllIl[72]]);
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[19]]] = AtCoder.llIIlIIllIIl(lIllllIlIl[IIIIIIllIl[73]], lIllllIlIl[IIIIIIllIl[74]]);
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[20]]] = AtCoder.lllIIIIllIIl(lIllllIlIl[IIIIIIllIl[75]], lIllllIlIl[IIIIIIllIl[76]]);
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[21]]] = AtCoder.IlIIlIIllIIl(lIllllIlIl[IIIIIIllIl[38]], lIllllIlIl[IIIIIIllIl[77]]);
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[23]]] = AtCoder.lllIIIIllIIl(lIllllIlIl[IIIIIIllIl[78]], lIllllIlIl[IIIIIIllIl[79]]);
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[25]]] = AtCoder.IlIIlIIllIIl(lIllllIlIl[IIIIIIllIl[80]], lIllllIlIl[IIIIIIllIl[81]]);
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[30]]] = AtCoder.llIIlIIllIIl(lIllllIlIl[IIIIIIllIl[82]], lIllllIlIl[IIIIIIllIl[83]]);
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[31]]] = AtCoder.IlIIlIIllIIl(lIllllIlIl[IIIIIIllIl[84]], lIllllIlIl[IIIIIIllIl[85]]);
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[32]]] = AtCoder.llIIlIIllIIl(lIllllIlIl[IIIIIIllIl[86]], lIllllIlIl[IIIIIIllIl[87]]);
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[33]]] = AtCoder.lllIIIIllIIl(lIllllIlIl[IIIIIIllIl[88]], lIllllIlIl[IIIIIIllIl[89]]);
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[34]]] = AtCoder.IlIIlIIllIIl(lIllllIlIl[IIIIIIllIl[90]], lIllllIlIl[IIIIIIllIl[91]]);
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[35]]] = AtCoder.IlIIlIIllIIl(lIllllIlIl[IIIIIIllIl[92]], lIllllIlIl[IIIIIIllIl[93]]);
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[36]]] = AtCoder.llIIlIIllIIl(lIllllIlIl[IIIIIIllIl[51]], lIllllIlIl[IIIIIIllIl[94]]);
        AtCoder.IlIIllIlIl[AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[37]]] = AtCoder.IlIIlIIllIIl(lIllllIlIl[IIIIIIllIl[95]], lIllllIlIl[IIIIIIllIl[96]]);
    }

    private static String lllIIIIllIIl(String IIlIIlIlIIl, String llIIIlIlIIl) {
        try {
            SecretKeySpec IlIIIlIlIIl = new SecretKeySpec(MessageDigest.getInstance(lIllllIlIl[IIIIIIllIl[97]]).digest(llIIIlIlIIl.getBytes(StandardCharsets.UTF_8)), lIllllIlIl[IIIIIIllIl[98]]);
            Cipher lIIIIlIlIIl = Cipher.getInstance(lIllllIlIl[IIIIIIllIl[99]]);
            lIIIIlIlIIl.init(lIlIllIlIl[IIIIIIllIl[2]], IlIIIlIlIIl);
            return new String(lIIIIlIlIIl.doFinal(Base64.getDecoder().decode(IIlIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIIIlIlIIl) {
            IIIIIlIlIIl.printStackTrace();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String llIIlIIllIIl(String IlllIIIlIIl, String lIllIIIlIIl) {
        IlllIIIlIIl = new String(Base64.getDecoder().decode(IlllIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        IIllIIIlIIl = new StringBuilder();
        llIlIIIlIIl = lIllIIIlIIl.toCharArray();
        IlIlIIIlIIl = AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[0]];
        IIIIIIIlIIl = IlllIIIlIIl.toCharArray();
        lIIIIIIlIIl = IIIIIIIlIIl.length;
        IlIIIIIlIIl = AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[0]];
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[100]].length();
        "".length();
        if (!AtCoder.IllllIlllIIl(null)) ** GOTO lbl21
        return null;
lbl-1000:
        // 1 sources

        {
            lIIlIIIlIIl = IIIIIIIlIIl[IlIIIIIlIIl];
            IIllIIIlIIl.append((char)(lIIlIIIlIIl ^ llIlIIIlIIl[IlIlIIIlIIl % llIlIIIlIIl.length]));
            AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[101]].length();
            ++IlIlIIIlIIl;
            ++IlIIIIIlIIl;
lbl21:
            // 2 sources

            ** while (!AtCoder.llIllIlllIIl((int)AtCoder.IIlllIIllIIl((int)IlIIIIIlIIl, (int)lIIIIIIlIIl)))
        }
lbl22:
        // 1 sources

        return String.valueOf(IIllIIIlIIl);
    }

    private static String IlIIlIIllIIl(String IlIIlllIIIl, String lIIIlllIIIl) {
        try {
            SecretKeySpec IIIIlllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(lIllllIlIl[IIIIIIllIl[102]]).digest(lIIIlllIIIl.getBytes(StandardCharsets.UTF_8)), lIlIllIlIl[IIIIIIllIl[13]]), lIllllIlIl[IIIIIIllIl[103]]);
            Cipher llllIllIIIl = Cipher.getInstance(lIllllIlIl[IIIIIIllIl[104]]);
            llllIllIIIl.init(lIlIllIlIl[IIIIIIllIl[2]], IIIIlllIIIl);
            return new String(llllIllIIIl.doFinal(Base64.getDecoder().decode(IlIIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlllIllIIIl) {
            IlllIllIIIl.printStackTrace();
            return null;
        }
    }

    private static void IllIlIIllIIl() {
        lIlIllIlIl = new int[IIIIIIllIl[60]];
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[0]] = ((IIIIIIllIl[1] ^ IIIIIIllIl[26]) << (lIllllIlIl[IIIIIIllIl[105]].length() << lIllllIlIl[IIIIIIllIl[106]].length()) ^ (IIIIIIllIl[24] ^ IIIIIIllIl[107])) & ((IIIIIIllIl[108] ^ IIIIIIllIl[109]) << (lIllllIlIl[IIIIIIllIl[46]].length() << lIllllIlIl[IIIIIIllIl[110]].length()) ^ (IIIIIIllIl[111] ^ IIIIIIllIl[112]) ^ -lIllllIlIl[IIIIIIllIl[113]].length());
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[1]] = lIllllIlIl[IIIIIIllIl[114]].length();
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[2]] = lIllllIlIl[IIIIIIllIl[115]].length() << lIllllIlIl[IIIIIIllIl[42]].length();
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[3]] = lIllllIlIl[IIIIIIllIl[116]].length();
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[4]] = lIllllIlIl[IIIIIIllIl[47]].length() << (lIllllIlIl[IIIIIIllIl[117]].length() << lIllllIlIl[IIIIIIllIl[118]].length());
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[5]] = IIIIIIllIl[85] ^ IIIIIIllIl[90];
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[6]] = ((IIIIIIllIl[12] ^ IIIIIIllIl[5]) << lIllllIlIl[IIIIIIllIl[119]].length() ^ (IIIIIIllIl[120] ^ IIIIIIllIl[121])) << lIllllIlIl[IIIIIIllIl[57]].length();
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[7]] = ((IIIIIIllIl[24] ^ IIIIIIllIl[13]) << lIllllIlIl[IIIIIIllIl[122]].length()) + (IIIIIIllIl[123] ^ IIIIIIllIl[111]) - (IIIIIIllIl[67] + IIIIIIllIl[124] - IIIIIIllIl[107] + IIIIIIllIl[125]) + (IIIIIIllIl[19] + IIIIIIllIl[115] - IIIIIIllIl[48] + IIIIIIllIl[30]);
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[8]] = (IIIIIIllIl[12] ^ IIIIIIllIl[3]) << lIllllIlIl[IIIIIIllIl[126]].length();
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[9]] = IIIIIIllIl[120] ^ IIIIIIllIl[127];
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[10]] = -lIllllIlIl[IIIIIIllIl[128]].length();
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[11]] = lIllllIlIl[IIIIIIllIl[129]].length() << lIllllIlIl[IIIIIIllIl[55]].length();
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[12]] = IIIIIIllIl[18] ^ IIIIIIllIl[21];
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[13]] = lIllllIlIl[IIIIIIllIl[41]].length() << lIllllIlIl[IIIIIIllIl[130]].length();
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[14]] = IIIIIIllIl[27] ^ IIIIIIllIl[28] ^ (IIIIIIllIl[68] ^ IIIIIIllIl[75]) << lIllllIlIl[IIIIIIllIl[56]].length();
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[15]] = ((IIIIIIllIl[131] ^ IIIIIIllIl[86]) << lIllllIlIl[IIIIIIllIl[132]].length() ^ (IIIIIIllIl[45] ^ IIIIIIllIl[97])) << lIllllIlIl[IIIIIIllIl[133]].length();
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[16]] = (IIIIIIllIl[41] ^ IIIIIIllIl[88]) << (lIllllIlIl[IIIIIIllIl[134]].length() << lIllllIlIl[IIIIIIllIl[135]].length()) ^ IIIIIIllIl[136] + IIIIIIllIl[67] - IIIIIIllIl[58] + IIIIIIllIl[137];
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[17]] = lIllllIlIl[IIIIIIllIl[58]].length() << (lIllllIlIl[IIIIIIllIl[131]].length() << lIllllIlIl[IIIIIIllIl[52]].length());
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[18]] = (IIIIIIllIl[33] ^ IIIIIIllIl[10]) << lIllllIlIl[IIIIIIllIl[138]].length() ^ (IIIIIIllIl[87] ^ IIIIIIllIl[31]);
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[19]] = (IIIIIIllIl[63] ^ IIIIIIllIl[64]) << lIllllIlIl[IIIIIIllIl[139]].length();
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[20]] = IIIIIIllIl[140] ^ IIIIIIllIl[141] ^ (IIIIIIllIl[142] ^ IIIIIIllIl[143]) << (lIllllIlIl[IIIIIIllIl[144]].length() << lIllllIlIl[IIIIIIllIl[44]].length());
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[21]] = lIllllIlIl[IIIIIIllIl[145]].length() << (lIllllIlIl[IIIIIIllIl[146]].length() << (lIllllIlIl[IIIIIIllIl[147]].length() << lIllllIlIl[IIIIIIllIl[148]].length()));
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[22]] = IIIIIIllIl[70] ^ IIIIIIllIl[19];
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[23]] = lIllllIlIl[IIIIIIllIl[137]].length() << lIllllIlIl[IIIIIIllIl[136]].length() ^ (IIIIIIllIl[126] ^ IIIIIIllIl[58]);
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[24]] = IIIIIIllIl[14] + IIIIIIllIl[98] - IIIIIIllIl[102] + IIIIIIllIl[149] ^ (IIIIIIllIl[123] ^ IIIIIIllIl[150]) << lIllllIlIl[IIIIIIllIl[151]].length();
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[25]] = (IIIIIIllIl[83] ^ IIIIIIllIl[92]) << lIllllIlIl[IIIIIIllIl[107]].length();
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[26]] = (IIIIIIllIl[143] ^ IIIIIIllIl[152]) << (lIllllIlIl[IIIIIIllIl[153]].length() << lIllllIlIl[IIIIIIllIl[154]].length());
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[27]] = IIIIIIllIl[155] ^ IIIIIIllIl[156];
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[28]] = ((IIIIIIllIl[114] ^ IIIIIIllIl[128]) << lIllllIlIl[IIIIIIllIl[157]].length() ^ (IIIIIIllIl[158] ^ IIIIIIllIl[159])) << lIllllIlIl[IIIIIIllIl[160]].length();
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[29]] = IIIIIIllIl[87] ^ IIIIIIllIl[107];
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[30]] = IIIIIIllIl[52] ^ IIIIIIllIl[151] ^ (IIIIIIllIl[161] ^ IIIIIIllIl[111]) << lIllllIlIl[IIIIIIllIl[162]].length();
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[31]] = (IIIIIIllIl[96] ^ IIIIIIllIl[51]) << (lIllllIlIl[IIIIIIllIl[125]].length() << lIllllIlIl[IIIIIIllIl[140]].length());
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[32]] = IIIIIIllIl[51] ^ IIIIIIllIl[42];
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[33]] = (IIIIIIllIl[163] ^ IIIIIIllIl[149]) << lIllllIlIl[IIIIIIllIl[121]].length();
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[34]] = (IIIIIIllIl[65] ^ IIIIIIllIl[76]) << (lIllllIlIl[IIIIIIllIl[156]].length() << lIllllIlIl[IIIIIIllIl[164]].length()) ^ (IIIIIIllIl[69] ^ IIIIIIllIl[131]);
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[35]] = lIllllIlIl[IIIIIIllIl[54]].length() << lIllllIlIl[IIIIIIllIl[165]].length();
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[36]] = (IIIIIIllIl[166] ^ IIIIIIllIl[150]) << lIllllIlIl[IIIIIIllIl[112]].length() ^ (IIIIIIllIl[4] ^ IIIIIIllIl[90]);
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[37]] = (IIIIIIllIl[80] ^ IIIIIIllIl[68]) << lIllllIlIl[IIIIIIllIl[167]].length();
        AtCoder.lIlIllIlIl[AtCoder.IIIIIIllIl[59]] = IIIIIIllIl[168] ^ IIIIIIllIl[154];
    }

    private static boolean llIllIIllIIl(int n, int n2) {
        boolean bl;
        if (AtCoder.lllllIlllIIl(n, n2)) {
            bl = IIIIIIllIl[1];
            "".length();
            if (null != null) {
                return (((0x68 ^ 0x67) << " ".length() ^ (0 ^ 9)) & ((0x13 ^ 0x3A) << " ".length() ^ (0x1D ^ 0x58) ^ -" ".length())) != 0;
            }
        } else {
            bl = IIIIIIllIl[0];
        }
        return bl;
    }

    private static boolean IIlllIIllIIl(int n, int n2) {
        boolean bl;
        if (AtCoder.lIlllIlllIIl(n, n2)) {
            bl = IIIIIIllIl[1];
            "".length();
            if (" ".length() << " ".length() < 0) {
                return ((0x46 ^ 0x41) << " ".length() & ~((0xA5 ^ 0xA2) << " ".length())) != 0;
            }
        } else {
            bl = IIIIIIllIl[0];
        }
        return bl;
    }

    private static boolean lIlllIIllIIl(int n, int n2) {
        boolean bl;
        if (AtCoder.IIIIIllllIIl(n, n2)) {
            bl = IIIIIIllIl[1];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) < (((0x43 ^ 0x28) << " ".length() ^ 123 + 125 - 65 + 16) << (" ".length() << " ".length()) & (((0x84 ^ 0xB3) << " ".length() ^ 114 + 9 - 94 + 98) << (" ".length() << " ".length()) ^ -" ".length()))) {
                return (" ".length() << ("   ".length() << " ".length()) & (" ".length() << ("   ".length() << " ".length()) ^ -" ".length())) != 0;
            }
        } else {
            bl = IIIIIIllIl[0];
        }
        return bl;
    }

    private static boolean IIIllIIllIIl(int n, int n2) {
        boolean bl;
        if (AtCoder.lIIIIllllIIl(n, n2)) {
            bl = IIIIIIllIl[1];
            "".length();
            if (-" ".length() > " ".length() << " ".length()) {
                return (((0x2A ^ 0x2D) << (" ".length() << " ".length()) ^ (0xA ^ 0x1F)) << " ".length() & (((0x42 ^ 7) << " ".length() ^ 117 + 7 - 94 + 101) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = IIIIIIllIl[0];
        }
        return bl;
    }

    private static boolean IlIllIIllIIl(Object object) {
        boolean bl;
        if (AtCoder.IllllIlllIIl(object)) {
            bl = IIIIIIllIl[1];
            "".length();
            if ("   ".length() < (" ".length() << "   ".length() & (" ".length() << "   ".length() ^ -" ".length()))) {
                return ((0x1E ^ 0xF ^ " ".length() << (" ".length() << " ".length())) << " ".length() & ((0x9B ^ 0xA6 ^ (0x9E ^ 0x9B) << "   ".length()) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = IIIIIIllIl[0];
        }
        return bl;
    }

    private static boolean lllIlIIllIIl(int n) {
        boolean bl;
        if (AtCoder.llIllIlllIIl(n)) {
            bl = IIIIIIllIl[1];
            "".length();
            if (null != null) {
                return ((0x45 ^ 0x70) & ~(0x91 ^ 0xA4)) != 0;
            }
        } else {
            bl = IIIIIIllIl[0];
        }
        return bl;
    }

    private static boolean lIIllIIllIIl(int n) {
        boolean bl;
        if (AtCoder.IlIIIllllIIl(n)) {
            bl = IIIIIIllIl[1];
            "".length();
            if (((0x56 ^ 0x47) & ~(0x68 ^ 0x79)) > " ".length()) {
                return ((0xA2 ^ 0x81) << " ".length() & ~((0x21 ^ 2) << " ".length())) != 0;
            }
        } else {
            bl = IIIIIIllIl[0];
        }
        return bl;
    }

    private static boolean IllllIIllIIl(int n) {
        boolean bl;
        if (AtCoder.llIIIllllIIl(n)) {
            bl = IIIIIIllIl[1];
            "".length();
            if (-("   ".length() << " ".length() ^ " ".length() << " ".length()) > 0) {
                return (((0xF4 ^ 0xB1) << " ".length() ^ 45 + 116 - 139 + 125) & (0x4B ^ 0x52 ^ " ".length() << (" ".length() << " ".length()) & ~(" ".length() << (" ".length() << " ".length())) ^ -" ".length())) != 0;
            }
        } else {
            bl = IIIIIIllIl[0];
        }
        return bl;
    }

    private static void lIIllIlllIIl() {
        lIllllIlIl = new String[IIIIIIllIl[169]];
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[0]] = AtCoder.lllIIIlllIIl("L61KoO9dLNM=", "LGGWh");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[1]] = AtCoder.llIlIIlllIIl("", "Mfmhb");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[2]] = AtCoder.IIllIIlllIIl("zZmvKms5pRs=", "wqaoa");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[3]] = AtCoder.IIllIIlllIIl("QTvZZhClHcc=", "RhBVT");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[4]] = AtCoder.llIlIIlllIIl("", "kxHAj");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[5]] = AtCoder.lllIIIlllIIl("J456f2KBsts=", "ldTqR");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[6]] = AtCoder.IIllIIlllIIl("4fd3Q3MVNfU=", "IEVTB");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[7]] = AtCoder.IIllIIlllIIl("+hbiS/ZCF90=", "eVSZy");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[8]] = AtCoder.lllIIIlllIIl("ogTdYV7HHAI=", "SgNbt");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[9]] = AtCoder.llIlIIlllIIl("Vg==", "vlYmE");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[10]] = AtCoder.IIllIIlllIIl("LO81GCuGW5Q=", "FNJca");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[11]] = AtCoder.IIllIIlllIIl("YbppwOdQ3y0=", "aOWUy");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[12]] = AtCoder.llIlIIlllIIl("Vw==", "wLoOL");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[13]] = AtCoder.llIlIIlllIIl("Zg==", "FjANV");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[14]] = AtCoder.llIlIIlllIIl("dA==", "TpCvQ");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[15]] = AtCoder.llIlIIlllIIl("eQ==", "YkHQc");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[16]] = AtCoder.lllIIIlllIIl("nzjmvrxH2/E=", "Tngju");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[17]] = AtCoder.IIllIIlllIIl("esekibyavyA=", "AtTxq");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[18]] = AtCoder.llIlIIlllIIl("YQ==", "ApCsC");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[19]] = AtCoder.lllIIIlllIIl("Td5OTe7dvwM=", "mIopk");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[20]] = AtCoder.IIllIIlllIIl("xIY08NMwVd8=", "GnYCp");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[21]] = AtCoder.lllIIIlllIIl("Jdim4Bd6mfw=", "YNqoG");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[22]] = AtCoder.IIllIIlllIIl("MSFMC9VbT30=", "lYmdi");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[23]] = AtCoder.llIlIIlllIIl("QQ==", "abXNf");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[24]] = AtCoder.IIllIIlllIIl("Do7+M1VclLo=", "Kfnsb");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[25]] = AtCoder.llIlIIlllIIl("KTJCJgIUAyU8OTBV", "yhwKC");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[26]] = AtCoder.lllIIIlllIIl("P22N1szhsUE=", "gVlvj");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[27]] = AtCoder.llIlIIlllIIl("LR4hCCkSDw1dAntl", "CXwiD");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[28]] = AtCoder.IIllIIlllIIl("SLlT4QrOHU8=", "alKjr");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[29]] = AtCoder.IIllIIlllIIl("Cx/6El0dvtnFKG3l6SOZ3A==", "rBfZP");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[30]] = AtCoder.llIlIIlllIIl("HBMLGAY=", "XcjAK");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[31]] = AtCoder.llIlIIlllIIl("Ch8IEBE7VXADKC9Q", "HmEBD");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[32]] = AtCoder.llIlIIlllIIl("DAEEDhI=", "nDuTx");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[33]] = AtCoder.lllIIIlllIIl("cnWkkFaTuTDI+Om1+jesSw==", "oHRjT");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[34]] = AtCoder.IIllIIlllIIl("d8mAZTwTLmA=", "gleYp");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[35]] = AtCoder.IIllIIlllIIl("HsATaZCv4R4=", "dowOb");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[36]] = AtCoder.IIllIIlllIIl("Fh/GM8mE6Rk=", "dwvqw");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[37]] = AtCoder.IIllIIlllIIl("huDsQ0qwKGj7zWqPvtc/1A==", "uYaAA");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[59]] = AtCoder.lllIIIlllIIl("8lblM+avTxw=", "nrEop");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[60]] = AtCoder.lllIIIlllIIl("8l+X+7VMmdR7edLYqKNvXw==", "Omufs");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[45]] = AtCoder.llIlIIlllIIl("Jgg0FA4=", "DnWlg");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[61]] = AtCoder.llIlIIlllIIl("Gxg7FSkRDBEuKGJ8", "ZARAB");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[62]] = AtCoder.llIlIIlllIIl("GzQ6BTU=", "lwkRw");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[63]] = AtCoder.llIlIIlllIIl("LTwEGCAlNiIeYTdY", "felsP");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[64]] = AtCoder.IIllIIlllIIl("kcpT+fyD8uM=", "thvfa");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[65]] = AtCoder.IIllIIlllIIl("Z+dpfpRFUZvYRuKjawWjWA==", "HmBWr");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[66]] = AtCoder.IIllIIlllIIl("g7d3hBxt2X4=", "HoDpp");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[67]] = AtCoder.IIllIIlllIIl("EU7L6JyY0x0=", "SWPSK");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[68]] = AtCoder.lllIIIlllIIl("P3v1CdjkEGY=", "UELNh");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[69]] = AtCoder.lllIIIlllIIl("l17ObjQk9Ajs4gjis7qP0Q==", "bkByE");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[70]] = AtCoder.lllIIIlllIIl("4zeho5tVfZc=", "NIUCV");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[71]] = AtCoder.IIllIIlllIIl("XXxJh1gx4jfb9aZBEnRpAw==", "RMzXh");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[72]] = AtCoder.lllIIIlllIIl("H8QV0g9BSVk=", "amqBd");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[73]] = AtCoder.IIllIIlllIIl("LIyAhf5We1Q=", "nZaVt");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[74]] = AtCoder.lllIIIlllIIl("vFxR+HCVsAA=", "JOxBB");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[75]] = AtCoder.lllIIIlllIIl("7kYK2jyhFheqo7ym1Uos9g==", "YEtEg");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[76]] = AtCoder.IIllIIlllIIl("h1vycpNbUOg=", "VyeYD");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[38]] = AtCoder.IIllIIlllIIl("5GnOq9b04cA3MB3pjDtl0Q==", "GQteN");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[77]] = AtCoder.llIlIIlllIIl("FQQnCCo=", "CPvof");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[78]] = AtCoder.llIlIIlllIIl("L0EJXX88QSYDeSJM", "MqgjI");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[79]] = AtCoder.llIlIIlllIIl("EwI8LDo=", "AuqxV");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[80]] = AtCoder.IIllIIlllIIl("5lLdYslhEgZOMdG1XoKTPw==", "vWCUL");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[81]] = AtCoder.lllIIIlllIIl("drK11ed2Em0=", "hSzWN");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[82]] = AtCoder.lllIIIlllIIl("BsmNYi/vfSs=", "WNLsz");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[83]] = AtCoder.llIlIIlllIIl("JwkrPC4=", "lPZvc");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[84]] = AtCoder.IIllIIlllIIl("HOcq2QoSfH/g1fQK2jKSJQ==", "XvoWt");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[85]] = AtCoder.lllIIIlllIIl("thOi6NFQCxE=", "zOAOo");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[86]] = AtCoder.lllIIIlllIIl("4ybkWVRI+OY=", "CSkGT");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[87]] = AtCoder.lllIIIlllIIl("xT6CSudeBmQ=", "kCKXn");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[88]] = AtCoder.IIllIIlllIIl("igKV6qZ0e2c2mA2RkcBr2A==", "EYBlJ");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[89]] = AtCoder.lllIIIlllIIl("RysM0EBDm78=", "Vqhti");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[90]] = AtCoder.IIllIIlllIIl("TH6Cz8qoQluYL8R40T01pg==", "hFSmG");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[91]] = AtCoder.llIlIIlllIIl("NCwvOxE=", "aVkrk");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[92]] = AtCoder.llIlIIlllIIl("HBUFUEkhOBNXOSRS", "iotdx");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[93]] = AtCoder.lllIIIlllIIl("H/D32LMCq5c=", "IcmgF");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[51]] = AtCoder.IIllIIlllIIl("YqXrAc9AGNM=", "KgGYs");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[94]] = AtCoder.IIllIIlllIIl("6KrbdF7DwIw=", "qFvnb");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[95]] = AtCoder.lllIIIlllIIl("98S+QnDK3QXdfqy0+lNP9A==", "WXLTJ");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[96]] = AtCoder.llIlIIlllIIl("KDQGNyI=", "yMJxG");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[97]] = AtCoder.llIlIIlllIIl("KBVS", "eQgZm");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[98]] = AtCoder.llIlIIlllIIl("BRQ6HhQuCz0=", "GxUir");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[99]] = AtCoder.lllIIIlllIIl("cIpVnYEKbsLbClOYTsDuNA==", "rxzRY");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[100]] = AtCoder.llIlIIlllIIl("", "rhkVj");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[101]] = AtCoder.llIlIIlllIIl("", "HQJmz");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[102]] = AtCoder.llIlIIlllIIl("IDVB", "mqtiX");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[103]] = AtCoder.IIllIIlllIIl("upBv0prdTPQ=", "aDHty");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[104]] = AtCoder.IIllIIlllIIl("ar13hWBquYA=", "qiyXT");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[105]] = AtCoder.llIlIIlllIIl("Vw==", "wJhBm");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[106]] = AtCoder.lllIIIlllIIl("3dkiDG32dx4=", "LioWv");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[46]] = AtCoder.lllIIIlllIIl("FUa7m9Ta6QA=", "fslIl");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[110]] = AtCoder.IIllIIlllIIl("B8I/yNB9p6g=", "bkqfl");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[113]] = AtCoder.IIllIIlllIIl("VBwTajqZX2Y=", "LMvlu");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[114]] = AtCoder.IIllIIlllIIl("2//yR6x11MY=", "KphJE");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[115]] = AtCoder.lllIIIlllIIl("GW2wryC8Je4=", "pBTUs");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[42]] = AtCoder.llIlIIlllIIl("cw==", "SvheV");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[116]] = AtCoder.llIlIIlllIIl("cFFo", "PqHkM");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[47]] = AtCoder.lllIIIlllIIl("TPPoZc8YsA8=", "VbINr");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[117]] = AtCoder.IIllIIlllIIl("pak+VNWKCYA=", "npFzN");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[118]] = AtCoder.IIllIIlllIIl("ZLgC7hy2SDY=", "uHVFr");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[119]] = AtCoder.IIllIIlllIIl("gfxolxHbvzU=", "HsqOE");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[57]] = AtCoder.IIllIIlllIIl("wnc4zR1/t48=", "gYBkY");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[122]] = AtCoder.IIllIIlllIIl("HwnA6vc0FJ4=", "bQUFz");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[126]] = AtCoder.lllIIIlllIIl("MXDnXlNmkLw=", "YyzWT");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[128]] = AtCoder.IIllIIlllIIl("81Ak8yKF/q4=", "Ekbwz");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[129]] = AtCoder.llIlIIlllIIl("emhH", "ZHgaC");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[55]] = AtCoder.IIllIIlllIIl("EOnB18vLCc4=", "wPuup");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[41]] = AtCoder.llIlIIlllIIl("Zg==", "FNlSr");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[130]] = AtCoder.IIllIIlllIIl("Zn6WkqVq6tA=", "vtuFc");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[56]] = AtCoder.llIlIIlllIIl("TQ==", "mwuQE");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[132]] = AtCoder.lllIIIlllIIl("QLy0WP5PMvo=", "Azivf");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[133]] = AtCoder.llIlIIlllIIl("Vw==", "wkouf");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[134]] = AtCoder.llIlIIlllIIl("cw==", "SYHIh");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[135]] = AtCoder.llIlIIlllIIl("Rw==", "gXYnB");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[58]] = AtCoder.IIllIIlllIIl("aaII6i+cgjs=", "aDYEB");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[131]] = AtCoder.llIlIIlllIIl("cw==", "Satyw");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[52]] = AtCoder.llIlIIlllIIl("VA==", "tLdqK");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[138]] = AtCoder.lllIIIlllIIl("8ik7hm9IFoQ=", "qSPmn");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[139]] = AtCoder.llIlIIlllIIl("Sw==", "krbGi");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[144]] = AtCoder.IIllIIlllIIl("bkvglQTeXzo=", "lqZVE");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[44]] = AtCoder.IIllIIlllIIl("53Veb8oEmoE=", "WnkNh");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[145]] = AtCoder.lllIIIlllIIl("uUEZsLDGXKk=", "EVALY");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[146]] = AtCoder.lllIIIlllIIl("USArumOtmeE=", "NXCkn");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[147]] = AtCoder.lllIIIlllIIl("QL/NYcM6rDE=", "yNvky");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[148]] = AtCoder.llIlIIlllIIl("cA==", "PAUYt");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[137]] = AtCoder.IIllIIlllIIl("coQN23atjCE=", "lJemA");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[136]] = AtCoder.IIllIIlllIIl("+FrvALzgnkI=", "PUaKm");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[151]] = AtCoder.llIlIIlllIIl("Yw==", "CozeJ");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[107]] = AtCoder.llIlIIlllIIl("WQ==", "yUNOU");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[153]] = AtCoder.llIlIIlllIIl("Qw==", "csTNn");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[154]] = AtCoder.lllIIIlllIIl("HGmOGUlmg5U=", "AcjHP");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[157]] = AtCoder.lllIIIlllIIl("6kvh3Weq7Xk=", "QoLPx");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[160]] = AtCoder.lllIIIlllIIl("MKmavp1hkLA=", "VBfND");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[162]] = AtCoder.llIlIIlllIIl("Vg==", "vNiWW");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[125]] = AtCoder.IIllIIlllIIl("nNzJVLG9fHI=", "tUWbT");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[140]] = AtCoder.IIllIIlllIIl("qkJDiWIw3wM=", "PDnOR");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[121]] = AtCoder.IIllIIlllIIl("DTZiRjG/yjY=", "tjHKD");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[156]] = AtCoder.llIlIIlllIIl("cg==", "RRjSw");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[164]] = AtCoder.lllIIIlllIIl("6j/hFcI15BI=", "fZOhK");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[54]] = AtCoder.llIlIIlllIIl("anRD", "JTcKk");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[165]] = AtCoder.llIlIIlllIIl("UnRt", "rTMrt");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[112]] = AtCoder.lllIIIlllIIl("WteWo64yEaM=", "hSnai");
        AtCoder.lIllllIlIl[AtCoder.IIIIIIllIl[167]] = AtCoder.IIllIIlllIIl("pkujaKsAFWY=", "fGyBp");
    }

    /*
     * Unable to fully structure code
     */
    private static String llIlIIlllIIl(String IIIlllIIIIl, String lllIllIIIIl) {
        IIIlllIIIIl = new String(Base64.getDecoder().decode(IIIlllIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        IllIllIIIIl = new StringBuilder();
        lIlIllIIIIl = lllIllIIIIl.toCharArray();
        IIlIllIIIIl = AtCoder.IIIIIIllIl[0];
        IlIlIlIIIIl = IIIlllIIIIl.toCharArray();
        llIlIlIIIIl = IlIlIlIIIIl.length;
        IIllIlIIIIl = AtCoder.IIIIIIllIl[0];
        "".length();
        if (" ".length() < "   ".length()) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            llIIllIIIIl = IlIlIlIIIIl[IIllIlIIIIl];
            IllIllIIIIl.append((char)(llIIllIIIIl ^ lIlIllIIIIl[IIlIllIIIIl % lIlIllIIIIl.length]));
            "".length();
            ++IIlIllIIIIl;
            ++IIllIlIIIIl;
lbl19:
            // 2 sources

            ** while (!AtCoder.lIlllIlllIIl((int)IIllIlIIIIl, (int)llIlIlIIIIl))
        }
lbl20:
        // 1 sources

        return String.valueOf(IllIllIIIIl);
    }

    private static String lllIIIlllIIl(String lIlIIlIIIIl, String IIlIIlIIIIl) {
        try {
            SecretKeySpec llIIIlIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIlIIlIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IlIIIlIIIIl = Cipher.getInstance("Blowfish");
            IlIIIlIIIIl.init(IIIIIIllIl[2], llIIIlIIIIl);
            return new String(IlIIIlIIIIl.doFinal(Base64.getDecoder().decode(lIlIIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIlIIIIl) {
            lIIIIlIIIIl.printStackTrace();
            return null;
        }
    }

    private static String IIllIIlllIIl(String IIIllIIIIIl, String lllIlIIIIIl) {
        try {
            SecretKeySpec IllIlIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlIIIIIl.getBytes(StandardCharsets.UTF_8)), IIIIIIllIl[8]), "DES");
            Cipher lIlIlIIIIIl = Cipher.getInstance("DES");
            lIlIlIIIIIl.init(IIIIIIllIl[2], IllIlIIIIIl);
            return new String(lIlIlIIIIIl.doFinal(Base64.getDecoder().decode(IIIllIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIlIlIIIIIl) {
            IIlIlIIIIIl.printStackTrace();
            return null;
        }
    }

    private static void IlIllIlllIIl() {
        IIIIIIllIl = new int[170];
        AtCoder.IIIIIIllIl[0] = ("   ".length() ^ (0x4B ^ 0x4C) << " ".length()) << " ".length() & (((0x57 ^ 0x44) << " ".length() ^ (8 ^ 0x23)) << " ".length() ^ -" ".length());
        AtCoder.IIIIIIllIl[1] = " ".length();
        AtCoder.IIIIIIllIl[2] = " ".length() << " ".length();
        AtCoder.IIIIIIllIl[3] = "   ".length();
        AtCoder.IIIIIIllIl[4] = " ".length() << (" ".length() << " ".length());
        AtCoder.IIIIIIllIl[5] = (0x56 ^ 0x7F) << (" ".length() << " ".length()) ^ 51 + 55 - 4 + 59;
        AtCoder.IIIIIIllIl[6] = "   ".length() << " ".length();
        AtCoder.IIIIIIllIl[7] = (0xD4 ^ 0xC7) << " ".length() ^ (0x2B ^ 0xA);
        AtCoder.IIIIIIllIl[8] = " ".length() << "   ".length();
        AtCoder.IIIIIIllIl[9] = " ".length() << ("   ".length() << " ".length()) ^ (0xEC ^ 0xA5);
        AtCoder.IIIIIIllIl[10] = ((0x2B ^ 0x48) << " ".length() ^ 163 + 193 - 342 + 181) << " ".length();
        AtCoder.IIIIIIllIl[11] = (0x8C ^ 0xA9) << (" ".length() << " ".length()) ^ 135 + 34 - 131 + 121;
        AtCoder.IIIIIIllIl[12] = "   ".length() << (" ".length() << " ".length());
        AtCoder.IIIIIIllIl[13] = 0xBA ^ 0xB7;
        AtCoder.IIIIIIllIl[14] = ((0x50 ^ 0x5B) << "   ".length() ^ (0xE8 ^ 0xB7)) << " ".length();
        AtCoder.IIIIIIllIl[15] = (0xA5 ^ 0xA0) << (0xE ^ 0xB) ^ 34 + 94 - 24 + 71;
        AtCoder.IIIIIIllIl[16] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        AtCoder.IIIIIIllIl[17] = 0xA4 ^ 0xB5;
        AtCoder.IIIIIIllIl[18] = ((0xBA ^ 0xA7) << " ".length() ^ (0x2E ^ 0x1D)) << " ".length();
        AtCoder.IIIIIIllIl[19] = 0x83 ^ 0x90;
        AtCoder.IIIIIIllIl[20] = (0x10 ^ 0x2D ^ (0x2E ^ 0x29) << "   ".length()) << (" ".length() << " ".length());
        AtCoder.IIIIIIllIl[21] = 0x26 ^ 0x33;
        AtCoder.IIIIIIllIl[22] = (0x9F ^ 0x94) << " ".length();
        AtCoder.IIIIIIllIl[23] = 8 ^ 0x1F;
        AtCoder.IIIIIIllIl[24] = "   ".length() << "   ".length();
        AtCoder.IIIIIIllIl[25] = 0x68 ^ 0x4D ^ (0x85 ^ 0x8A) << (" ".length() << " ".length());
        AtCoder.IIIIIIllIl[26] = (0x30 ^ 0x3D) << " ".length();
        AtCoder.IIIIIIllIl[27] = 0xDB ^ 0xC0;
        AtCoder.IIIIIIllIl[28] = (0x53 ^ 0x54) << (" ".length() << " ".length());
        AtCoder.IIIIIIllIl[29] = 0x9D ^ 0x80;
        AtCoder.IIIIIIllIl[30] = (3 ^ 0xC) << " ".length();
        AtCoder.IIIIIIllIl[31] = (0x22 ^ 0x13) << " ".length() ^ (0x5E ^ 0x23);
        AtCoder.IIIIIIllIl[32] = " ".length() << (0x70 ^ 0x75);
        AtCoder.IIIIIIllIl[33] = 11 + 92 - 75 + 145 ^ (0xA8 ^ 0x8B) << (" ".length() << " ".length());
        AtCoder.IIIIIIllIl[34] = ((0x73 ^ 0x7A) << " ".length() ^ "   ".length()) << " ".length();
        AtCoder.IIIIIIllIl[35] = 0x4A ^ 0x69;
        AtCoder.IIIIIIllIl[36] = (0x78 ^ 0x71) << (" ".length() << " ".length());
        AtCoder.IIIIIIllIl[37] = 87 + 131 - 136 + 73 ^ (0x47 ^ 0x18) << " ".length();
        AtCoder.IIIIIIllIl[38] = 0x8A ^ 0xB3;
        AtCoder.IIIIIIllIl[39] = (0x9E ^ 0x85) << "   ".length();
        AtCoder.IIIIIIllIl[40] = 114 + 49 - 36 + 60;
        AtCoder.IIIIIIllIl[41] = (0x73 ^ 0x46) << " ".length();
        AtCoder.IIIIIIllIl[42] = (0x30 ^ 0x1F) << " ".length();
        AtCoder.IIIIIIllIl[43] = (0xDA ^ 0x8F) << " ".length();
        AtCoder.IIIIIIllIl[44] = 0xD4 ^ 0xA3;
        AtCoder.IIIIIIllIl[45] = ((0x60 ^ 0x47) << " ".length() ^ (0x6B ^ 0x20)) << "   ".length();
        AtCoder.IIIIIIllIl[46] = 0x6A ^ 0x33;
        AtCoder.IIIIIIllIl[47] = "   ".length() << (0x4B ^ 0x4E);
        AtCoder.IIIIIIllIl[48] = -" ".length();
        AtCoder.IIIIIIllIl[49] = 59 + 48 - 59 + 97;
        AtCoder.IIIIIIllIl[50] = (20 + 111 - 81 + 89 ^ (0x30 ^ 0x61) << " ".length()) << (" ".length() << " ".length());
        AtCoder.IIIIIIllIl[51] = 0x29 ^ 0x62;
        AtCoder.IIIIIIllIl[52] = 0x19 ^ 0x6A;
        AtCoder.IIIIIIllIl[53] = (" ".length() << ("   ".length() << " ".length())) + (0x96 ^ 0xA1) - (" ".length() << "   ".length()) + (" ".length() << (0xB0 ^ 0xB5));
        AtCoder.IIIIIIllIl[54] = ((0xB3 ^ 0xB6) << (" ".length() << (" ".length() << " ".length())) ^ (0x38 ^ 0x2D)) << " ".length();
        AtCoder.IIIIIIllIl[55] = 0xD0 ^ 0xB9;
        AtCoder.IIIIIIllIl[56] = (0x83 ^ 0x98) << (" ".length() << " ".length());
        AtCoder.IIIIIIllIl[57] = (0x4B ^ 0x52) << (" ".length() << " ".length());
        AtCoder.IIIIIIllIl[58] = 0x30 ^ 0x41;
        AtCoder.IIIIIIllIl[59] = (9 ^ 0x1A) << " ".length();
        AtCoder.IIIIIIllIl[60] = (0x32 ^ 0x3B) << "   ".length() ^ (0x75 ^ 0x1A);
        AtCoder.IIIIIIllIl[61] = 0x54 ^ 0x3F ^ (0x90 ^ 0xB1) << " ".length();
        AtCoder.IIIIIIllIl[62] = (" ".length() << (" ".length() << " ".length()) ^ (0x3D ^ 0x2C)) << " ".length();
        AtCoder.IIIIIIllIl[63] = 0x50 ^ 0x7B;
        AtCoder.IIIIIIllIl[64] = (184 + 191 - 342 + 170 ^ "   ".length() << ("   ".length() << " ".length())) << (" ".length() << " ".length());
        AtCoder.IIIIIIllIl[65] = (0xD1 ^ 0xC4) << "   ".length() ^ 127 + 78 - 185 + 113;
        AtCoder.IIIIIIllIl[66] = (0x63 ^ 0x74) << " ".length();
        AtCoder.IIIIIIllIl[67] = 0x43 ^ 0x6C;
        AtCoder.IIIIIIllIl[68] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        AtCoder.IIIIIIllIl[69] = 0xF5 ^ 0xC4;
        AtCoder.IIIIIIllIl[70] = (0xAD ^ 0xB4) << " ".length();
        AtCoder.IIIIIIllIl[71] = 0x33 ^ 0;
        AtCoder.IIIIIIllIl[72] = (0x26 ^ 0x73 ^ (0x5C ^ 0x57) << "   ".length()) << (" ".length() << " ".length());
        AtCoder.IIIIIIllIl[73] = 131 + 50 - 82 + 80 ^ (0x17 ^ 0x54) << " ".length();
        AtCoder.IIIIIIllIl[74] = (0x1A ^ 1) << " ".length();
        AtCoder.IIIIIIllIl[75] = 0x18 ^ 0x2F;
        AtCoder.IIIIIIllIl[76] = (87 + 167 - 132 + 61 ^ (0x4F ^ 0x44) << (" ".length() << (" ".length() << " ".length()))) << "   ".length();
        AtCoder.IIIIIIllIl[77] = (0x31 ^ 0x2C) << " ".length();
        AtCoder.IIIIIIllIl[78] = "   ".length() << (" ".length() << (" ".length() << " ".length())) ^ (0xB8 ^ 0xB3);
        AtCoder.IIIIIIllIl[79] = (31 + 121 - 50 + 27 ^ (0xF0 ^ 0xB7) << " ".length()) << (" ".length() << " ".length());
        AtCoder.IIIIIIllIl[80] = (0x35 ^ 0x18) << " ".length() ^ (0xEB ^ 0x8C);
        AtCoder.IIIIIIllIl[81] = (0x1A ^ 0x11 ^ (0xBA ^ 0xBF) << (" ".length() << " ".length())) << " ".length();
        AtCoder.IIIIIIllIl[82] = (0xC6 ^ 0x8F) << " ".length() ^ 146 + 137 - 162 + 52;
        AtCoder.IIIIIIllIl[83] = " ".length() << ("   ".length() << " ".length());
        AtCoder.IIIIIIllIl[84] = " ".length() << " ".length() ^ (0xE2 ^ 0xA1);
        AtCoder.IIIIIIllIl[85] = ((0x46 ^ 0x53) << "   ".length() ^ 13 + 49 - 56 + 131) << " ".length();
        AtCoder.IIIIIIllIl[86] = (0x63 ^ 0x66) << "   ".length() ^ (0xF6 ^ 0x9D);
        AtCoder.IIIIIIllIl[87] = ((0x8E ^ 0xB7) << " ".length() ^ (0 ^ 0x63)) << (" ".length() << " ".length());
        AtCoder.IIIIIIllIl[88] = 0x39 ^ 0x7C;
        AtCoder.IIIIIIllIl[89] = (0x22 ^ 1) << " ".length();
        AtCoder.IIIIIIllIl[90] = 0x71 ^ 0x36;
        AtCoder.IIIIIIllIl[91] = (0x70 ^ 0x4F ^ (0x42 ^ 0x59) << " ".length()) << "   ".length();
        AtCoder.IIIIIIllIl[92] = 0x33 ^ 0x7A;
        AtCoder.IIIIIIllIl[93] = ((0x3E ^ 0x13) << " ".length() ^ 25 + 61 - 33 + 74) << " ".length();
        AtCoder.IIIIIIllIl[94] = (30 + 10 - 4 + 91 ^ (0 ^ 0x1B) << (" ".length() << " ".length())) << (" ".length() << " ".length());
        AtCoder.IIIIIIllIl[95] = 0xD ^ 0x40;
        AtCoder.IIIIIIllIl[96] = (0x90 ^ 0xB7) << " ".length();
        AtCoder.IIIIIIllIl[97] = 0x68 ^ 0x27;
        AtCoder.IIIIIIllIl[98] = ((0x2F ^ 0x28) << "   ".length() ^ (0xA1 ^ 0x9C)) << (" ".length() << (" ".length() << " ".length()));
        AtCoder.IIIIIIllIl[99] = (0x70 ^ 0x63) << " ".length() ^ (0xE6 ^ 0x91);
        AtCoder.IIIIIIllIl[100] = (0x5E ^ 0x77) << " ".length();
        AtCoder.IIIIIIllIl[101] = 0xF8 ^ 0xAB;
        AtCoder.IIIIIIllIl[102] = ((0x41 ^ 0x46) << (" ".length() << (" ".length() << " ".length())) ^ (0xF0 ^ 0x95)) << (" ".length() << " ".length());
        AtCoder.IIIIIIllIl[103] = 0x66 ^ 0x33;
        AtCoder.IIIIIIllIl[104] = (54 + 88 - 81 + 82 ^ (0xA6 ^ 0x8F) << (" ".length() << " ".length())) << " ".length();
        AtCoder.IIIIIIllIl[105] = (0x39 ^ 0x5A) << " ".length() ^ 96 + 0 - -17 + 32;
        AtCoder.IIIIIIllIl[106] = ((0xE ^ 0x17) << "   ".length() ^ 181 + 155 - 273 + 132) << "   ".length();
        AtCoder.IIIIIIllIl[107] = (0x1A ^ 0x55) + ((0x19 ^ 0x38) << " ".length()) - (0xEB ^ 0xB4) + (0xFC ^ 0xB1);
        AtCoder.IIIIIIllIl[108] = (0xA ^ 0x37 ^ (0x41 ^ 0x74) << " ".length()) << " ".length();
        AtCoder.IIIIIIllIl[109] = 27 + 67 - -53 + 22;
        AtCoder.IIIIIIllIl[110] = (0x11 ^ 0x3C) << " ".length();
        AtCoder.IIIIIIllIl[111] = 137 + 2 - 114 + 130;
        AtCoder.IIIIIIllIl[112] = (0xA3 ^ 0x80) << (" ".length() << " ".length());
        AtCoder.IIIIIIllIl[113] = 0x45 ^ 0x1E;
        AtCoder.IIIIIIllIl[114] = (0x56 ^ 0xB ^ (0x67 ^ 0x42) << " ".length()) << (" ".length() << " ".length());
        AtCoder.IIIIIIllIl[115] = 0x18 ^ 5 ^ " ".length() << ("   ".length() << " ".length());
        AtCoder.IIIIIIllIl[116] = 0x5B ^ 4;
        AtCoder.IIIIIIllIl[117] = 0x3B ^ 0x5A;
        AtCoder.IIIIIIllIl[118] = (0xE ^ 0x3F) << " ".length();
        AtCoder.IIIIIIllIl[119] = 0xF4 ^ 0x97;
        AtCoder.IIIIIIllIl[120] = (0x2C ^ 0x29 ^ (0x47 ^ 0x4E) << " ".length()) << "   ".length();
        AtCoder.IIIIIIllIl[121] = 54 + 119 - 65 + 27;
        AtCoder.IIIIIIllIl[122] = 133 + 35 - 46 + 79 ^ (0xA ^ 0x21) << (" ".length() << " ".length());
        AtCoder.IIIIIIllIl[123] = ((9 ^ 0x22) << (" ".length() << " ".length()) ^ 67 + 57 - 62 + 93) << (" ".length() << " ".length());
        AtCoder.IIIIIIllIl[124] = (0xDE ^ 0xB5 ^ (0x3E ^ 0xF) << " ".length()) << (" ".length() << (" ".length() << " ".length()));
        AtCoder.IIIIIIllIl[125] = (0x7D ^ 0x4C) + (0x20 ^ 0x77) - (0x29 ^ 0x2E) + (" ".length() << (" ".length() << " ".length()));
        AtCoder.IIIIIIllIl[126] = (0x64 ^ 0x57) << " ".length();
        AtCoder.IIIIIIllIl[127] = 135 + 24 - 53 + 45;
        AtCoder.IIIIIIllIl[128] = 0x6C ^ 0xB;
        AtCoder.IIIIIIllIl[129] = (0xA9 ^ 0xA4) << "   ".length();
        AtCoder.IIIIIIllIl[130] = 131 + 32 - 2 + 10 ^ "   ".length() << ("   ".length() << " ".length());
        AtCoder.IIIIIIllIl[131] = ((0x3A ^ 0x29) << (" ".length() << " ".length()) ^ (0x6E ^ 0x1B)) << " ".length();
        AtCoder.IIIIIIllIl[132] = (0x3D ^ 0x16) << " ".length() ^ (0x95 ^ 0xAE);
        AtCoder.IIIIIIllIl[133] = (0x93 ^ 0xB6 ^ (0x11 ^ 0x18) << " ".length()) << " ".length();
        AtCoder.IIIIIIllIl[134] = 0x37 ^ 0x58;
        AtCoder.IIIIIIllIl[135] = ((0x63 ^ 0x7C) << " ".length() ^ (0x75 ^ 0x4C)) << (" ".length() << (" ".length() << " ".length()));
        AtCoder.IIIIIIllIl[136] = 0x60 ^ 0x1D;
        AtCoder.IIIIIIllIl[137] = (0xDD ^ 0xC2) << (" ".length() << " ".length());
        AtCoder.IIIIIIllIl[138] = (0x8D ^ 0x90) << (" ".length() << " ".length());
        AtCoder.IIIIIIllIl[139] = 65 + 44 - 47 + 135 ^ (0xCE ^ 0xC5) << (" ".length() << (" ".length() << " ".length()));
        AtCoder.IIIIIIllIl[140] = (0x73 ^ 0x2E ^ (6 ^ 9) << " ".length()) << " ".length();
        AtCoder.IIIIIIllIl[141] = (0x21 ^ 0x40) + (0x68 ^ 0x67) - (0xB8 ^ 0xB1) + ((0x77 ^ 0x58) << " ".length());
        AtCoder.IIIIIIllIl[142] = (2 ^ 7 ^ "   ".length() << (" ".length() << (" ".length() << " ".length()))) << (" ".length() << " ".length());
        AtCoder.IIIIIIllIl[143] = 64 + 32 - 65 + 168;
        AtCoder.IIIIIIllIl[144] = (0x25 ^ 0x3E ^ " ".length() << (0xBB ^ 0xBE)) << " ".length();
        AtCoder.IIIIIIllIl[145] = ((0x86 ^ 0x8D) << (" ".length() << " ".length()) ^ (0x11 ^ 0x32)) << "   ".length();
        AtCoder.IIIIIIllIl[146] = 0x11 ^ 0x36 ^ (0x21 ^ 0xE) << " ".length();
        AtCoder.IIIIIIllIl[147] = (0xA6 ^ 0x9B) << " ".length();
        AtCoder.IIIIIIllIl[148] = 0x2A ^ 0x1D ^ (0x62 ^ 0x71) << (" ".length() << " ".length());
        AtCoder.IIIIIIllIl[149] = ((0x3B ^ 8) << " ".length()) + ("   ".length() << " ".length()) - ((0x84 ^ 0xB7) << " ".length()) + (31 + 91 - -53 + 2);
        AtCoder.IIIIIIllIl[150] = ((0x93 ^ 0x9E) << " ".length()) + (0x7A ^ 0x4D) - -(0x71 ^ 0x47) + ("   ".length() << (" ".length() << " ".length()));
        AtCoder.IIIIIIllIl[151] = ((0xC4 ^ 0x9B) << " ".length() ^ 101 + 119 - 116 + 25) << " ".length();
        AtCoder.IIIIIIllIl[152] = "   ".length() << ("   ".length() << " ".length());
        AtCoder.IIIIIIllIl[153] = " ".length() << ((0x9A ^ 0xAF) << " ".length() ^ (0x17 ^ 0x7A));
        AtCoder.IIIIIIllIl[154] = (0xE8 ^ 0xA9) + ((0x90 ^ 0x83) << (" ".length() << " ".length())) - (0x55 ^ 0x3E) + (0xD8 ^ 0x87);
        AtCoder.IIIIIIllIl[155] = 36 + 22 - -24 + 101 + ((0x26 ^ 0xD) << (" ".length() << " ".length())) - (154 + 69 - 222 + 168) + (0x79 ^ 0x5A);
        AtCoder.IIIIIIllIl[156] = ((0x1D ^ 0x14) << (" ".length() << (" ".length() << " ".length())) ^ 22 + 22 - 5 + 90) << "   ".length();
        AtCoder.IIIIIIllIl[157] = (0x17 ^ 0x56) << " ".length();
        AtCoder.IIIIIIllIl[158] = (0xB4 ^ 0x8B) << (" ".length() << " ".length());
        AtCoder.IIIIIIllIl[159] = 106 + 77 - 125 + 91;
        AtCoder.IIIIIIllIl[160] = (0xA3 ^ 0xAE) + ((0x41 ^ 0x7A) << " ".length()) - "   ".length() + "   ".length();
        AtCoder.IIIIIIllIl[161] = (0x19 ^ 0x3C) << (" ".length() << " ".length());
        AtCoder.IIIIIIllIl[162] = ((0x88 ^ 0x9F) << "   ".length() ^ 149 + 71 - 100 + 33) << (" ".length() << " ".length());
        AtCoder.IIIIIIllIl[163] = (0xBC ^ 0xAB ^ (0xA7 ^ 0xA0) << "   ".length()) << (" ".length() << " ".length());
        AtCoder.IIIIIIllIl[164] = ((0x6E ^ 0x71) << " ".length()) + (1 ^ 0x42) - ((0xA8 ^ 0x97) << " ".length()) + ((0xC2 ^ 0x81) << " ".length());
        AtCoder.IIIIIIllIl[165] = (" ".length() << " ".length()) + ((0x63 ^ 0x64) << "   ".length()) - ((0xAB ^ 0xA2) << " ".length()) + (0xE6 ^ 0x85);
        AtCoder.IIIIIIllIl[166] = (0x4F ^ 0x10) << " ".length();
        AtCoder.IIIIIIllIl[167] = (0xAE ^ 0x8F) + (0xBC ^ 0xAF) - -(0x59 ^ 0x76) + ((0x2F ^ 0x3A) << " ".length());
        AtCoder.IIIIIIllIl[168] = (0x28 ^ 0x65) << " ".length();
        AtCoder.IIIIIIllIl[169] = ((0x11 ^ 0x1E) << " ".length() ^ (0x49 ^ 0x10)) << " ".length();
    }

    private static boolean lllllIlllIIl(int n, int n2) {
        return n == n2;
    }

    private static boolean lIlllIlllIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIIIIllllIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IIlllIlllIIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean lIIIIllllIIl(int n, int n2) {
        return n > n2;
    }

    private static boolean IllllIlllIIl(Object object) {
        return object != null;
    }

    private static boolean llIllIlllIIl(int n) {
        return n != 0;
    }

    private static boolean IlIIIllllIIl(int n) {
        return n >= 0;
    }

    private static boolean llIIIllllIIl(int n) {
        return n > 0;
    }
}

