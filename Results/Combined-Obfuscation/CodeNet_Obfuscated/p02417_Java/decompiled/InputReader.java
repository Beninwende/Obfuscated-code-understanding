/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.StringTokenizer;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class InputReader
extends BufferedReader {
    StringTokenizer tokenizer;
    private static int[] IllIIl;
    private static String[] lIIlIl;
    private static int[] IIIIll;
    private static int[] IIlIll;
    private static String[] Illlll;
    private static int[] llllll;

    public InputReader(InputStream lllIllllIllIlIl) {
        super(new InputStreamReader(lllIllllIllIlIl), IllIIl[IIIIll[IIlIll[llllll[0]]]]);
        InputReader IIIlllllIllIlIl;
    }

    public InputReader(String lIllIlllIllIlIl) {
        super(new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream(lIllIlllIllIlIl)));
        InputReader IlllIlllIllIlIl;
    }

    public String next() {
        InputReader IIlIIlllIllIlIl;
        while (!InputReader.IIllIlIl(InputReader.IIIIIIIl(InputReader.IIlIlll(InputReader.lIllIll(IIlIIlllIllIlIl.tokenizer) ? 1 : 0) ? 1 : 0) ? 1 : 0) || InputReader.IIllIlIl(InputReader.IIIIIIIl(InputReader.IIlIlll(InputReader.IlllIll(IIlIIlllIllIlIl.tokenizer.hasMoreTokens() ? 1 : 0) ? 1 : 0) ? 1 : 0) ? 1 : 0)) {
            try {
                IIlIIlllIllIlIl.tokenizer = new StringTokenizer(IIlIIlllIllIlIl.readLine());
                lIIlIl[IIIIll[IIlIll[llllll[0]]]].length();
                Illlll[llllll[0]].length();
            }
            catch (IOException llIIIlllIllIlIl) {
                throw new RuntimeException();
            }
            if (!InputReader.IIllIlIl(InputReader.IIIIIIIl(InputReader.lIlIlll(lIIlIl[IIIIll[IIlIll[llllll[1]]]].length() << lIIlIl[IIIIll[IIlIll[llllll[2]]]].length()) ? 1 : 0) ? 1 : 0)) continue;
            return null;
        }
        return this.tokenizer.nextToken();
    }

    public Integer nextInt() {
        InputReader llIllIllIllIlIl;
        return Integer.valueOf(llIllIllIllIlIl.next());
    }

    public Long nextLong() {
        InputReader IllIlIllIllIlIl;
        return Long.valueOf(IllIlIllIllIlIl.next());
    }

    static {
        InputReader.llIlIlIl();
        InputReader.IlIlIlIl();
        InputReader.lllllll();
        InputReader.IIIllll();
        InputReader.llIIlll();
        InputReader.IIllIll();
    }

    private static void IIllIll() {
        IllIIl = new int[IIIIll[IIlIll[llllll[1]]]];
        InputReader.IllIIl[InputReader.IIIIll[InputReader.IIlIll[InputReader.llllll[0]]]] = lIIlIl[IIIIll[IIlIll[llllll[3]]]].length() << ((IIIIll[IIlIll[llllll[4]]] ^ IIIIll[IIlIll[llllll[5]]]) << lIIlIl[IIIIll[IIlIll[llllll[6]]]].length() ^ IIIIll[IIlIll[llllll[7]]] + IIIIll[IIlIll[llllll[8]]] - IIIIll[IIlIll[llllll[9]]] + IIIIll[IIlIll[llllll[10]]]);
    }

    private static boolean lIllIll(Object object) {
        boolean bl;
        if (InputReader.IIllIlIl(InputReader.IIIIIIIl(InputReader.IllIlll(object) ? 1 : 0) ? 1 : 0)) {
            bl = IIIIll[IIlIll[llllll[1]]];
            Illlll[llllll[1]].length();
            Illlll[llllll[2]].length();
            if (InputReader.IIllIlIl(InputReader.lIIIIIIl(-Illlll[llllll[3]].length()) ? 1 : 0)) {
                return ((IIlIll[llllll[11]] + IIlIll[llllll[12]] - IIlIll[llllll[13]] + IIlIll[llllll[14]] ^ (IIlIll[llllll[15]] ^ IIlIll[llllll[16]]) << (Illlll[llllll[4]].length() << Illlll[llllll[5]].length())) << (Illlll[llllll[6]].length() << Illlll[llllll[7]].length()) & (((IIlIll[llllll[1]] ^ IIlIll[llllll[17]]) << Illlll[llllll[8]].length() ^ (IIlIll[llllll[18]] ^ IIlIll[llllll[19]])) << (Illlll[llllll[9]].length() << Illlll[llllll[10]].length()) ^ -Illlll[llllll[11]].length())) != 0;
            }
        } else {
            bl = IIIIll[IIlIll[llllll[0]]];
        }
        return bl;
    }

    private static boolean IlllIll(int n) {
        boolean bl;
        if (InputReader.IIllIlIl(InputReader.IIIIIIIl(InputReader.lIlIlll(n) ? 1 : 0) ? 1 : 0)) {
            bl = IIIIll[IIlIll[llllll[1]]];
            Illlll[llllll[12]].length();
            Illlll[llllll[13]].length();
            if (InputReader.IIllIlIl(InputReader.IlIIIIIl(-Illlll[llllll[14]].length()) ? 1 : 0)) {
                return (Illlll[llllll[15]].length() << Illlll[llllll[16]].length() & (Illlll[llllll[17]].length() << Illlll[llllll[18]].length() ^ -Illlll[llllll[19]].length())) != 0;
            }
        } else {
            bl = IIIIll[IIlIll[llllll[0]]];
        }
        return bl;
    }

    private static void llIIlll() {
        IIIIll = new int[IIlIll[llllll[20]]];
        InputReader.IIIIll[InputReader.IIlIll[InputReader.llllll[0]]] = ((IIlIll[llllll[21]] ^ IIlIll[llllll[22]]) << (Illlll[llllll[20]].length() << Illlll[llllll[21]].length()) ^ IIlIll[llllll[23]] + IIlIll[llllll[9]] - IIlIll[llllll[24]] + IIlIll[llllll[25]]) << Illlll[llllll[22]].length() & ((IIlIll[llllll[26]] + IIlIll[llllll[27]] - IIlIll[llllll[28]] + IIlIll[llllll[29]] ^ (IIlIll[llllll[30]] ^ IIlIll[llllll[0]]) << Illlll[llllll[23]].length()) << Illlll[llllll[24]].length() ^ -Illlll[llllll[25]].length());
        InputReader.IIIIll[InputReader.IIlIll[InputReader.llllll[1]]] = Illlll[llllll[26]].length();
        InputReader.IIIIll[InputReader.IIlIll[InputReader.llllll[2]]] = Illlll[llllll[27]].length() << Illlll[llllll[28]].length();
        InputReader.IIIIll[InputReader.IIlIll[InputReader.llllll[3]]] = Illlll[llllll[29]].length();
        InputReader.IIIIll[InputReader.IIlIll[InputReader.llllll[4]]] = (IIlIll[llllll[11]] ^ IIlIll[llllll[31]]) << (Illlll[llllll[30]].length() << Illlll[llllll[31]].length());
        InputReader.IIIIll[InputReader.IIlIll[InputReader.llllll[5]]] = IIlIll[llllll[32]] ^ IIlIll[llllll[33]];
        InputReader.IIIIll[InputReader.IIlIll[InputReader.llllll[6]]] = Illlll[llllll[32]].length() << (Illlll[llllll[33]].length() << Illlll[llllll[34]].length());
        InputReader.IIIIll[InputReader.IIlIll[InputReader.llllll[7]]] = (IIlIll[llllll[34]] ^ IIlIll[llllll[35]] ^ (IIlIll[llllll[36]] ^ IIlIll[llllll[37]]) << Illlll[llllll[35]].length()) << (Illlll[llllll[36]].length() << Illlll[llllll[37]].length());
        InputReader.IIIIll[InputReader.IIlIll[InputReader.llllll[8]]] = ((IIlIll[llllll[38]] ^ IIlIll[llllll[39]]) << Illlll[llllll[38]].length() ^ Illlll[llllll[39]].length()) << Illlll[llllll[40]].length();
        InputReader.IIIIll[InputReader.IIlIll[InputReader.llllll[9]]] = ((IIlIll[llllll[40]] ^ IIlIll[llllll[41]]) << Illlll[llllll[41]].length() ^ (IIlIll[llllll[36]] ^ IIlIll[llllll[42]])) << (Illlll[llllll[42]].length() << Illlll[llllll[43]].length());
        InputReader.IIIIll[InputReader.IIlIll[InputReader.llllll[10]]] = IIlIll[llllll[43]] ^ IIlIll[llllll[44]];
    }

    private static boolean IllIlll(Object object) {
        boolean bl;
        if (InputReader.IIllIlIl(InputReader.llIIIIIl(object) ? 1 : 0)) {
            bl = IIlIll[llllll[1]];
            Illlll[llllll[44]].length();
            "".length();
            if (InputReader.lIllIlIl(Illlll[llllll[45]].length() << (Illlll[llllll[46]].length() << Illlll[llllll[47]].length()), Illlll[llllll[48]].length() << (Illlll[llllll[49]].length() << Illlll[llllll[50]].length()))) {
                return ((llllll[51] + llllll[52] - llllll[53] + llllll[54] ^ (llllll[25] ^ llllll[55]) << Illlll[llllll[56]].length()) << Illlll[llllll[57]].length() & (((llllll[58] ^ llllll[21]) << (Illlll[llllll[59]].length() << Illlll[llllll[60]].length()) ^ llllll[54] + llllll[61] - llllll[62] + llllll[55]) << Illlll[llllll[63]].length() ^ -Illlll[llllll[64]].length())) != 0;
            }
        } else {
            bl = IIlIll[llllll[0]];
        }
        return bl;
    }

    private static boolean IIlIlll(int n) {
        boolean bl;
        if (InputReader.IIllIlIl(InputReader.IIIIIIIl(n) ? 1 : 0)) {
            bl = IIlIll[llllll[1]];
            Illlll[llllll[65]].length();
            "".length();
            if (InputReader.IlllIlIl(Illlll[llllll[66]].length())) {
                return ((llllll[67] + llllll[68] - llllll[69] + llllll[27] ^ (llllll[37] ^ llllll[2]) << (Illlll[llllll[70]].length() << Illlll[llllll[58]].length())) << Illlll[llllll[71]].length() & (((llllll[72] ^ llllll[73]) << Illlll[llllll[74]].length() ^ Illlll[llllll[75]].length()) << Illlll[llllll[76]].length() ^ -Illlll[llllll[77]].length())) != 0;
            }
        } else {
            bl = IIlIll[llllll[0]];
        }
        return bl;
    }

    private static boolean lIlIlll(int n) {
        boolean bl;
        if (InputReader.IIllIlIl(InputReader.IIlIIIIl(n) ? 1 : 0)) {
            bl = IIlIll[llllll[1]];
            Illlll[llllll[55]].length();
            "".length();
            if (InputReader.llllIlIl(llllll[78] + llllll[79] - llllll[80] + llllll[33] ^ (llllll[25] ^ llllll[81]) << Illlll[llllll[82]].length())) {
                return ((llllll[75] + llllll[60] - llllll[5] + llllll[45] ^ (llllll[83] ^ llllll[80]) << (Illlll[llllll[84]].length() << Illlll[llllll[85]].length())) & ((llllll[86] ^ llllll[87]) << (Illlll[llllll[88]].length() << Illlll[llllll[89]].length()) ^ llllll[26] + llllll[41] - llllll[90] + llllll[47] ^ -Illlll[llllll[91]].length())) != 0;
            }
        } else {
            bl = IIlIll[llllll[0]];
        }
        return bl;
    }

    private static void IIIllll() {
        lIIlIl = new String[IIlIll[llllll[5]]];
        InputReader.lIIlIl[InputReader.IIlIll[InputReader.llllll[0]]] = InputReader.llllIll(Illlll[llllll[92]], Illlll[llllll[93]]);
        InputReader.lIIlIl[InputReader.IIlIll[InputReader.llllll[1]]] = InputReader.llllIll(Illlll[llllll[94]], Illlll[llllll[95]]);
        InputReader.lIIlIl[InputReader.IIlIll[InputReader.llllll[2]]] = InputReader.lIIIlll(Illlll[llllll[83]], Illlll[llllll[96]]);
        InputReader.lIIlIl[InputReader.IIlIll[InputReader.llllll[3]]] = InputReader.IlIIlll(Illlll[llllll[97]], Illlll[llllll[98]]);
        InputReader.lIIlIl[InputReader.IIlIll[InputReader.llllll[4]]] = InputReader.llllIll(Illlll[llllll[99]], Illlll[llllll[100]]);
    }

    private static String llllIll(String IIIlllIlIllIlIl, String lllIllIlIllIlIl) {
        try {
            SecretKeySpec IllIllIlIllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(Illlll[llllll[101]]).digest(lllIllIlIllIlIl.getBytes(StandardCharsets.UTF_8)), IIlIll[llllll[8]]), Illlll[llllll[102]]);
            Cipher lIlIllIlIllIlIl = Cipher.getInstance(Illlll[llllll[103]]);
            lIlIllIlIllIlIl.init(IIlIll[llllll[2]], IllIllIlIllIlIl);
            return new String(lIlIllIlIllIlIl.doFinal(Base64.getDecoder().decode(IIIlllIlIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIlIllIlIllIlIl) {
            IIlIllIlIllIlIl.printStackTrace();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String lIIIlll(String IlIIIlIlIllIlIl, String lIIIIlIlIllIlIl) {
        IlIIIlIlIllIlIl = new String(Base64.getDecoder().decode(IlIIIlIlIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        IIIIIlIlIllIlIl = new StringBuilder();
        lllllIIlIllIlIl = lIIIIlIlIllIlIl.toCharArray();
        IllllIIlIllIlIl = InputReader.IIlIll[InputReader.llllll[0]];
        IIlIlIIlIllIlIl = IlIIIlIlIllIlIl.toCharArray();
        lIlIlIIlIllIlIl = IIlIlIIlIllIlIl.length;
        IllIlIIlIllIlIl = InputReader.IIlIll[InputReader.llllll[0]];
        InputReader.Illlll[InputReader.llllll[104]].length();
        "".length();
        if (!InputReader.IIIIllIl(InputReader.Illlll[InputReader.llllll[105]].length(), InputReader.Illlll[InputReader.llllll[106]].length() << InputReader.Illlll[InputReader.llllll[107]].length())) ** GOTO lbl21
        return null;
lbl-1000:
        // 1 sources

        {
            lIlllIIlIllIlIl = IIlIlIIlIllIlIl[IllIlIIlIllIlIl];
            IIIIIlIlIllIlIl.append((char)(lIlllIIlIllIlIl ^ lllllIIlIllIlIl[IllllIIlIllIlIl % lllllIIlIllIlIl.length]));
            InputReader.Illlll[InputReader.llllll[81]].length();
            ++IllllIIlIllIlIl;
            ++IllIlIIlIllIlIl;
lbl21:
            // 2 sources

            ** while (!InputReader.IIllIlIl((int)InputReader.lIlIIIIl((int)IllIlIIlIllIlIl, (int)lIlIlIIlIllIlIl)))
        }
lbl22:
        // 1 sources

        return String.valueOf(IIIIIlIlIllIlIl);
    }

    private static String IlIIlll(String IllIIIIlIllIlIl, String lIlIIIIlIllIlIl) {
        try {
            SecretKeySpec IIlIIIIlIllIlIl = new SecretKeySpec(MessageDigest.getInstance(Illlll[llllll[108]]).digest(lIlIIIIlIllIlIl.getBytes(StandardCharsets.UTF_8)), Illlll[llllll[109]]);
            Cipher llIIIIIlIllIlIl = Cipher.getInstance(Illlll[llllll[110]]);
            llIIIIIlIllIlIl.init(IIlIll[llllll[2]], IIlIIIIlIllIlIl);
            return new String(llIIIIIlIllIlIl.doFinal(Base64.getDecoder().decode(IllIIIIlIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIIIIIlIllIlIl) {
            IlIIIIIlIllIlIl.printStackTrace();
            return null;
        }
    }

    private static void lllllll() {
        IIlIll = new int[llllll[45]];
        InputReader.IIlIll[InputReader.llllll[0]] = ((llllll[81] ^ llllll[111]) << Illlll[llllll[112]].length() ^ (llllll[87] ^ llllll[113])) & ((llllll[20] ^ llllll[114]) << Illlll[llllll[115]].length() ^ llllll[116] + llllll[9] - llllll[14] + llllll[57] ^ -Illlll[llllll[79]].length());
        InputReader.IIlIll[InputReader.llllll[1]] = Illlll[llllll[117]].length();
        InputReader.IIlIll[InputReader.llllll[2]] = Illlll[llllll[116]].length() << Illlll[llllll[118]].length();
        InputReader.IIlIll[InputReader.llllll[3]] = Illlll[llllll[119]].length();
        InputReader.IIlIll[InputReader.llllll[4]] = Illlll[llllll[120]].length() << (Illlll[llllll[80]].length() << Illlll[llllll[121]].length());
        InputReader.IIlIll[InputReader.llllll[5]] = llllll[100] ^ llllll[105];
        InputReader.IIlIll[InputReader.llllll[6]] = Illlll[llllll[78]].length() << Illlll[llllll[122]].length();
        InputReader.IIlIll[InputReader.llllll[7]] = (llllll[96] ^ llllll[118]) << Illlll[llllll[123]].length() ^ (llllll[124] ^ llllll[125]);
        InputReader.IIlIll[InputReader.llllll[8]] = Illlll[llllll[126]].length() << Illlll[llllll[127]].length();
        InputReader.IIlIll[InputReader.llllll[9]] = llllll[128] ^ llllll[73];
        InputReader.IIlIll[InputReader.llllll[10]] = ((llllll[107] ^ llllll[30]) << Illlll[llllll[129]].length() ^ llllll[29] + llllll[56] - llllll[130] + llllll[46]) << Illlll[llllll[131]].length();
        InputReader.IIlIll[InputReader.llllll[11]] = (llllll[132] ^ llllll[106]) << (Illlll[llllll[54]].length() << Illlll[llllll[67]].length());
        InputReader.IIlIll[InputReader.llllll[12]] = (llllll[133] ^ llllll[134] ^ (llllll[62] ^ llllll[135]) << Illlll[llllll[136]].length()) << (Illlll[llllll[137]].length() << Illlll[llllll[73]].length());
        InputReader.IIlIll[InputReader.llllll[13]] = (llllll[138] ^ llllll[61]) << Illlll[llllll[139]].length();
        InputReader.IIlIll[InputReader.llllll[14]] = ((llllll[140] ^ llllll[141]) << (Illlll[llllll[68]].length() << Illlll[llllll[142]].length())) + ((llllll[143] ^ llllll[144]) << Illlll[llllll[69]].length()) - ((llllll[67] ^ llllll[126]) << (Illlll[llllll[72]].length() << Illlll[llllll[114]].length())) + (llllll[79] ^ llllll[97]);
        InputReader.IIlIll[InputReader.llllll[15]] = Illlll[llllll[128]].length() << (Illlll[llllll[132]].length() << (Illlll[llllll[51]].length() << Illlll[llllll[111]].length()));
        InputReader.IIlIll[InputReader.llllll[16]] = llllll[145] ^ llllll[146];
        InputReader.IIlIll[InputReader.llllll[17]] = (llllll[147] ^ llllll[87] ^ (llllll[74] ^ llllll[65]) << (Illlll[llllll[148]].length() << (Illlll[llllll[149]].length() << Illlll[llllll[150]].length()))) << Illlll[llllll[141]].length();
        InputReader.IIlIll[InputReader.llllll[18]] = (llllll[134] ^ llllll[151]) << (Illlll[llllll[113]].length() << Illlll[llllll[125]].length());
        InputReader.IIlIll[InputReader.llllll[19]] = llllll[30] + llllll[22] - llllll[152] + llllll[117] ^ (llllll[26] ^ llllll[65]) << (Illlll[llllll[153]].length() << Illlll[llllll[154]].length());
        InputReader.IIlIll[InputReader.llllll[20]] = llllll[155] ^ llllll[87];
        InputReader.IIlIll[InputReader.llllll[21]] = ((llllll[156] ^ llllll[157]) << Illlll[llllll[52]].length() ^ (llllll[58] ^ llllll[136])) << Illlll[llllll[87]].length();
        InputReader.IIlIll[InputReader.llllll[22]] = ((llllll[144] ^ llllll[158]) << Illlll[llllll[159]].length()) + (llllll[80] ^ llllll[1]) - (llllll[74] ^ llllll[97]) + (llllll[59] ^ llllll[55]);
        InputReader.IIlIll[InputReader.llllll[23]] = (llllll[60] ^ llllll[15]) << (Illlll[llllll[160]].length() << Illlll[llllll[161]].length()) ^ llllll[141] + llllll[131] - llllll[162] + llllll[98];
        InputReader.IIlIll[InputReader.llllll[24]] = llllll[163] ^ llllll[86];
        InputReader.IIlIll[InputReader.llllll[25]] = ((llllll[128] ^ llllll[111]) << Illlll[llllll[164]].length() ^ (llllll[165] ^ llllll[166])) << Illlll[llllll[155]].length();
        InputReader.IIlIll[InputReader.llllll[26]] = (llllll[154] ^ llllll[150]) << (llllll[167] ^ llllll[168]);
        InputReader.IIlIll[InputReader.llllll[27]] = (llllll[58] ^ llllll[149]) << Illlll[llllll[169]].length();
        InputReader.IIlIll[InputReader.llllll[28]] = (llllll[170] ^ llllll[52]) + ((llllll[75] ^ llllll[32]) << (Illlll[llllll[133]].length() << Illlll[llllll[145]].length())) - (llllll[30] ^ llllll[70]) + (llllll[171] ^ llllll[172]);
        InputReader.IIlIll[InputReader.llllll[29]] = (llllll[173] + llllll[68] - llllll[159] + llllll[70] ^ (llllll[174] ^ llllll[175]) << Illlll[llllll[140]].length()) << (Illlll[llllll[176]].length() << Illlll[llllll[167]].length());
        InputReader.IIlIll[InputReader.llllll[30]] = llllll[177] ^ llllll[178];
        InputReader.IIlIll[InputReader.llllll[31]] = llllll[12] + llllll[45] - llllll[179] + llllll[94] + (llllll[180] ^ llllll[52]) - ((llllll[46] ^ llllll[35]) << Illlll[llllll[181]].length()) + (llllll[32] ^ llllll[47]);
        InputReader.IIlIll[InputReader.llllll[32]] = (llllll[182] ^ llllll[183]) << (Illlll[llllll[184]].length() << Illlll[llllll[185]].length());
        InputReader.IIlIll[InputReader.llllll[33]] = (llllll[36] ^ llllll[19]) << (Illlll[llllll[157]].length() << Illlll[llllll[168]].length()) ^ llllll[142] + llllll[164] - llllll[186] + llllll[139];
        InputReader.IIlIll[InputReader.llllll[34]] = (llllll[123] ^ llllll[103]) << (Illlll[llllll[187]].length() << Illlll[llllll[61]].length());
        InputReader.IIlIll[InputReader.llllll[35]] = llllll[34] + llllll[48] - llllll[4] + llllll[94];
        InputReader.IIlIll[InputReader.llllll[36]] = (Illlll[llllll[188]].length() << (llllll[80] ^ llllll[117])) + (llllll[136] + llllll[58] - llllll[150] + llllll[78]) - (llllll[189] ^ llllll[140]) + (llllll[25] ^ llllll[30]);
        InputReader.IIlIll[InputReader.llllll[37]] = ((llllll[154] ^ llllll[190]) << Illlll[llllll[191]].length() ^ (llllll[79] ^ llllll[19])) << (Illlll[llllll[165]].length() << (Illlll[llllll[192]].length() << Illlll[llllll[193]].length()));
        InputReader.IIlIll[InputReader.llllll[38]] = llllll[171] ^ llllll[194];
        InputReader.IIlIll[InputReader.llllll[39]] = ((llllll[120] ^ llllll[131]) << (Illlll[llllll[156]].length() << Illlll[llllll[183]].length()) ^ (llllll[12] ^ llllll[21])) << Illlll[llllll[173]].length();
        InputReader.IIlIll[InputReader.llllll[40]] = llllll[163] ^ llllll[184];
        InputReader.IIlIll[InputReader.llllll[41]] = ((llllll[134] ^ llllll[187]) << Illlll[llllll[195]].length() ^ (llllll[196] ^ llllll[125])) << (Illlll[llllll[197]].length() << Illlll[llllll[158]].length());
        InputReader.IIlIll[InputReader.llllll[42]] = (llllll[95] ^ llllll[41] ^ (llllll[61] ^ llllll[159]) << Illlll[llllll[198]].length()) << Illlll[llllll[199]].length();
        InputReader.IIlIll[InputReader.llllll[43]] = ((llllll[14] ^ llllll[1]) << (Illlll[llllll[175]].length() << (Illlll[llllll[86]].length() << Illlll[llllll[62]].length())) ^ llllll[127] + llllll[140] - llllll[138] + llllll[122]) << Illlll[llllll[194]].length();
        InputReader.IIlIll[InputReader.llllll[44]] = (Illlll[llllll[200]].length() << (Illlll[llllll[201]].length() << Illlll[llllll[202]].length())) + ((llllll[6] ^ llllll[43]) << Illlll[llllll[203]].length() & ((llllll[52] ^ llllll[200]) << Illlll[llllll[166]].length() ^ llllll[204])) - -(llllll[205] ^ llllll[200]) + (llllll[10] ^ llllll[23]);
    }

    private static boolean lIlIIIIl(int n, int n2) {
        boolean bl;
        if (InputReader.lIIIllIl(n, n2)) {
            bl = llllll[1];
            "".length();
            if ("   ".length() < " ".length() << " ".length()) {
                return ((0x28 ^ 0xB ^ (0x36 ^ 0x3F) << (" ".length() << " ".length())) << "   ".length() & (((0x16 ^ 0x31) << (" ".length() << " ".length()) ^ 41 + 40 - -33 + 41) << "   ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = llllll[0];
        }
        return bl;
    }

    private static boolean llIIIIIl(Object object) {
        boolean bl;
        if (InputReader.IlIIllIl(object)) {
            bl = llllll[1];
            "".length();
            if (" ".length() << " ".length() != " ".length() << " ".length()) {
                return ((0x97 ^ 0x80 ^ (0x6D ^ 0x70) << " ".length()) & (0x7A ^ 0x41 ^ (0xA4 ^ 0xAF) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = llllll[0];
        }
        return bl;
    }

    private static boolean IIIIIIIl(int n) {
        boolean bl;
        if (InputReader.IIllIlIl(n)) {
            bl = llllll[1];
            "".length();
            if (-"   ".length() > 0) {
                return ((0x40 ^ 0x4B) << " ".length() & ~((0x43 ^ 0x48) << " ".length())) != 0;
            }
        } else {
            bl = llllll[0];
        }
        return bl;
    }

    private static boolean IIlIIIIl(int n) {
        boolean bl;
        if (InputReader.llllIlIl(n)) {
            bl = llllll[1];
            "".length();
            if ("   ".length() == " ".length() << (" ".length() << " ".length())) {
                return ("   ".length() << (" ".length() << (" ".length() << " ".length())) & ("   ".length() << (" ".length() << (" ".length() << " ".length())) ^ -" ".length())) != 0;
            }
        } else {
            bl = llllll[0];
        }
        return bl;
    }

    private static boolean lIIIIIIl(int n) {
        boolean bl;
        if (InputReader.llIIllIl(n)) {
            bl = llllll[1];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) <= "   ".length()) {
                return ((0x6A ^ 0x61) << " ".length() & ~((0x57 ^ 0x5C) << " ".length())) != 0;
            }
        } else {
            bl = llllll[0];
        }
        return bl;
    }

    private static boolean IlIIIIIl(int n) {
        boolean bl;
        if (InputReader.IIlIllIl(n)) {
            bl = llllll[1];
            "".length();
            if ("   ".length() == ((0 ^ 0x11) << (" ".length() << " ".length()) & ~((0x57 ^ 0x46) << (" ".length() << " ".length())))) {
                return ((0x4B ^ 0x5A) << " ".length() & ~((0x19 ^ 8) << " ".length())) != 0;
            }
        } else {
            bl = llllll[0];
        }
        return bl;
    }

    private static void IlIlIlIl() {
        Illlll = new String[llllll[162]];
        InputReader.Illlll[InputReader.llllll[0]] = InputReader.lllIIlIl("", "LRNWc");
        InputReader.Illlll[InputReader.llllll[1]] = InputReader.IIIlIlIl("NkxWlWgk3bg=", "egjYo");
        InputReader.Illlll[InputReader.llllll[2]] = InputReader.IIIlIlIl("8JwSpVgwbtE=", "vaiFD");
        InputReader.Illlll[InputReader.llllll[3]] = InputReader.lllIIlIl("bmk=", "NIrBV");
        InputReader.Illlll[InputReader.llllll[4]] = InputReader.IIIlIlIl("mK3NGmpk/Uw=", "vgbUW");
        InputReader.Illlll[InputReader.llllll[5]] = InputReader.lllIIlIl("Rg==", "fjEBk");
        InputReader.Illlll[InputReader.llllll[6]] = InputReader.lIIlIlIl("NL09xpmxCwA=", "ZrJWI");
        InputReader.Illlll[InputReader.llllll[7]] = InputReader.IIIlIlIl("LCVvB3j5F6I=", "MBMhA");
        InputReader.Illlll[InputReader.llllll[8]] = InputReader.lIIlIlIl("HsV3wobALOU=", "QmYum");
        InputReader.Illlll[InputReader.llllll[9]] = InputReader.lIIlIlIl("aWBGSFGOnG8=", "sYQol");
        InputReader.Illlll[InputReader.llllll[10]] = InputReader.lllIIlIl("cw==", "SSxri");
        InputReader.Illlll[InputReader.llllll[11]] = InputReader.lIIlIlIl("/JegGLzFZ0k=", "Kjjyr");
        InputReader.Illlll[InputReader.llllll[12]] = InputReader.lIIlIlIl("LqGBXbiFwzU=", "fifMx");
        InputReader.Illlll[InputReader.llllll[13]] = InputReader.lIIlIlIl("lhZv5ubalAM=", "ZKhDG");
        InputReader.Illlll[InputReader.llllll[14]] = InputReader.lIIlIlIl("y/QruU2UhVw=", "bDKrm");
        InputReader.Illlll[InputReader.llllll[15]] = InputReader.lIIlIlIl("u0RlZv/U3+A=", "ZjQkX");
        InputReader.Illlll[InputReader.llllll[16]] = InputReader.lIIlIlIl("v83/3gf8Czs=", "dDUgp");
        InputReader.Illlll[InputReader.llllll[17]] = InputReader.lllIIlIl("Vw==", "wgEAU");
        InputReader.Illlll[InputReader.llllll[18]] = InputReader.lIIlIlIl("LYd1SZWIy7E=", "eXJBR");
        InputReader.Illlll[InputReader.llllll[19]] = InputReader.lIIlIlIl("RokIQl2GNTs=", "CTvts");
        InputReader.Illlll[InputReader.llllll[20]] = InputReader.lIIlIlIl("XxJbfqspwQI=", "qDqSo");
        InputReader.Illlll[InputReader.llllll[21]] = InputReader.lllIIlIl("Yg==", "BmXSl");
        InputReader.Illlll[InputReader.llllll[22]] = InputReader.IIIlIlIl("+rR/whlTmRw=", "lWBiT");
        InputReader.Illlll[InputReader.llllll[23]] = InputReader.IIIlIlIl("07fNuGQY4pA=", "lHndk");
        InputReader.Illlll[InputReader.llllll[24]] = InputReader.IIIlIlIl("bq62x5Hy0Aw=", "jHYwG");
        InputReader.Illlll[InputReader.llllll[25]] = InputReader.IIIlIlIl("t8XkSwxmbS8=", "MTrzI");
        InputReader.Illlll[InputReader.llllll[26]] = InputReader.lllIIlIl("aQ==", "IBecS");
        InputReader.Illlll[InputReader.llllll[27]] = InputReader.IIIlIlIl("w+Y4KmBXx0o=", "nsfao");
        InputReader.Illlll[InputReader.llllll[28]] = InputReader.IIIlIlIl("oLUSxP2PgM0=", "jucha");
        InputReader.Illlll[InputReader.llllll[29]] = InputReader.lllIIlIl("Smto", "jKHVL");
        InputReader.Illlll[InputReader.llllll[30]] = InputReader.IIIlIlIl("f/18zCHHS7c=", "xoroD");
        InputReader.Illlll[InputReader.llllll[31]] = InputReader.lllIIlIl("Sg==", "jnlpF");
        InputReader.Illlll[InputReader.llllll[32]] = InputReader.lllIIlIl("ag==", "JBEkC");
        InputReader.Illlll[InputReader.llllll[33]] = InputReader.lllIIlIl("Qw==", "cTTwU");
        InputReader.Illlll[InputReader.llllll[34]] = InputReader.IIIlIlIl("VB5RkcKBkvI=", "iZREG");
        InputReader.Illlll[InputReader.llllll[35]] = InputReader.IIIlIlIl("3mDHGwIOy0g=", "rvUdN");
        InputReader.Illlll[InputReader.llllll[36]] = InputReader.IIIlIlIl("zSCb9fOl7OE=", "dMAhM");
        InputReader.Illlll[InputReader.llllll[37]] = InputReader.lllIIlIl("Qg==", "bMDQM");
        InputReader.Illlll[InputReader.llllll[38]] = InputReader.lllIIlIl("TQ==", "mItYL");
        InputReader.Illlll[InputReader.llllll[39]] = InputReader.lIIlIlIl("QPGt657kIRA=", "qnsxa");
        InputReader.Illlll[InputReader.llllll[40]] = InputReader.lllIIlIl("Tg==", "nOIxm");
        InputReader.Illlll[InputReader.llllll[41]] = InputReader.IIIlIlIl("WLXR8kGx6i8=", "eJBLG");
        InputReader.Illlll[InputReader.llllll[42]] = InputReader.lllIIlIl("VA==", "tQLDJ");
        InputReader.Illlll[InputReader.llllll[43]] = InputReader.lllIIlIl("eA==", "Xudyk");
        InputReader.Illlll[InputReader.llllll[44]] = InputReader.lllIIlIl("", "BqEOA");
        InputReader.Illlll[InputReader.llllll[45]] = InputReader.lllIIlIl("Wg==", "zBCYz");
        InputReader.Illlll[InputReader.llllll[46]] = InputReader.lIIlIlIl("a8ny84L7lkE=", "IYxsP");
        InputReader.Illlll[InputReader.llllll[47]] = InputReader.IIIlIlIl("VpkzC+4rNe0=", "QblGr");
        InputReader.Illlll[InputReader.llllll[48]] = InputReader.lllIIlIl("cg==", "RGBaF");
        InputReader.Illlll[InputReader.llllll[49]] = InputReader.lllIIlIl("Rw==", "gqddE");
        InputReader.Illlll[InputReader.llllll[50]] = InputReader.IIIlIlIl("dNttqW6FMwc=", "lbRvB");
        InputReader.Illlll[InputReader.llllll[56]] = InputReader.lllIIlIl("SA==", "hsoZZ");
        InputReader.Illlll[InputReader.llllll[57]] = InputReader.lllIIlIl("aw==", "KSvMr");
        InputReader.Illlll[InputReader.llllll[59]] = InputReader.IIIlIlIl("yM3gwIAN5To=", "KEbvx");
        InputReader.Illlll[InputReader.llllll[60]] = InputReader.lIIlIlIl("v58a9cAHF4I=", "xRimu");
        InputReader.Illlll[InputReader.llllll[63]] = InputReader.IIIlIlIl("E5AmM6VSOL8=", "ykmGV");
        InputReader.Illlll[InputReader.llllll[64]] = InputReader.lllIIlIl("dg==", "VtGOI");
        InputReader.Illlll[InputReader.llllll[65]] = InputReader.IIIlIlIl("D0/n8B+OCtA=", "efLzp");
        InputReader.Illlll[InputReader.llllll[66]] = InputReader.lllIIlIl("WmZm", "zFFMs");
        InputReader.Illlll[InputReader.llllll[70]] = InputReader.IIIlIlIl("I4Oyr2mNxac=", "Tvjtx");
        InputReader.Illlll[InputReader.llllll[58]] = InputReader.IIIlIlIl("zERfPp3isvk=", "UEyrz");
        InputReader.Illlll[InputReader.llllll[71]] = InputReader.IIIlIlIl("+lW4s+36MCM=", "cPJTV");
        InputReader.Illlll[InputReader.llllll[74]] = InputReader.lIIlIlIl("UQ9HOgGs8KM=", "cBHZs");
        InputReader.Illlll[InputReader.llllll[75]] = InputReader.lllIIlIl("SldH", "jwgYy");
        InputReader.Illlll[InputReader.llllll[76]] = InputReader.IIIlIlIl("8EuvdFheoJY=", "UsgYt");
        InputReader.Illlll[InputReader.llllll[77]] = InputReader.lllIIlIl("SQ==", "itqXt");
        InputReader.Illlll[InputReader.llllll[55]] = InputReader.lllIIlIl("", "uWfhU");
        InputReader.Illlll[InputReader.llllll[82]] = InputReader.lllIIlIl("aQ==", "IlSAw");
        InputReader.Illlll[InputReader.llllll[84]] = InputReader.IIIlIlIl("qwNQoyAO3Wg=", "AzJGK");
        InputReader.Illlll[InputReader.llllll[85]] = InputReader.IIIlIlIl("/xq+DgG8IJ4=", "WwaXI");
        InputReader.Illlll[InputReader.llllll[88]] = InputReader.IIIlIlIl("jzcMtbZA6rs=", "NCEnj");
        InputReader.Illlll[InputReader.llllll[89]] = InputReader.lIIlIlIl("rpiIowWg2yw=", "GRcPm");
        InputReader.Illlll[InputReader.llllll[91]] = InputReader.lllIIlIl("QQ==", "aXRmj");
        InputReader.Illlll[InputReader.llllll[92]] = InputReader.lllIIlIl("Ywl+dRd4GjlrJwZN", "SpNDO");
        InputReader.Illlll[InputReader.llllll[93]] = InputReader.lllIIlIl("JhIoNxo=", "KwAtC");
        InputReader.Illlll[InputReader.llllll[94]] = InputReader.lIIlIlIl("FKG5y/Y/aojSQFSjFJoQFg==", "XKNlJ");
        InputReader.Illlll[InputReader.llllll[95]] = InputReader.lllIIlIl("PysjBiQ=", "KDqJF");
        InputReader.Illlll[InputReader.llllll[83]] = InputReader.IIIlIlIl("DwvmwUSB2pU=", "UIpRZ");
        InputReader.Illlll[InputReader.llllll[96]] = InputReader.IIIlIlIl("VWRt7Uqbjl0=", "HqcNd");
        InputReader.Illlll[InputReader.llllll[97]] = InputReader.lllIIlIl("WkooMyteOWQ0ARpF", "qxPwG");
        InputReader.Illlll[InputReader.llllll[98]] = InputReader.IIIlIlIl("9viJvkIAYIg=", "lewMP");
        InputReader.Illlll[InputReader.llllll[99]] = InputReader.IIIlIlIl("pUMM3PKgz3GYTbvzAP3SZw==", "eVqPr");
        InputReader.Illlll[InputReader.llllll[100]] = InputReader.lIIlIlIl("SVItcTu6Wgg=", "jmEwj");
        InputReader.Illlll[InputReader.llllll[101]] = InputReader.IIIlIlIl("mBx1d1fnrjQ=", "dgNQL");
        InputReader.Illlll[InputReader.llllll[102]] = InputReader.IIIlIlIl("Zw8KsTj/pCA=", "XBjoN");
        InputReader.Illlll[InputReader.llllll[103]] = InputReader.lllIIlIl("HA0Z", "XHJpR");
        InputReader.Illlll[InputReader.llllll[104]] = InputReader.lllIIlIl("", "EvPwX");
        InputReader.Illlll[InputReader.llllll[105]] = InputReader.IIIlIlIl("0FPsmY6xJ1E=", "VAnXZ");
        InputReader.Illlll[InputReader.llllll[106]] = InputReader.IIIlIlIl("tbZ2sYdtqlc=", "liXoW");
        InputReader.Illlll[InputReader.llllll[107]] = InputReader.lIIlIlIl("nNqvzDLsi3c=", "cUDeQ");
        InputReader.Illlll[InputReader.llllll[81]] = InputReader.lIIlIlIl("mLP55mLiGt4=", "ObJxk");
        InputReader.Illlll[InputReader.llllll[108]] = InputReader.IIIlIlIl("yQ25LcAXDEM=", "JdBtH");
        InputReader.Illlll[InputReader.llllll[109]] = InputReader.lIIlIlIl("MmjIi0v2YDpFq1ynO9BI/g==", "yomDV");
        InputReader.Illlll[InputReader.llllll[110]] = InputReader.lllIIlIl("MAEGBD4bHgE=", "rmisX");
        InputReader.Illlll[InputReader.llllll[112]] = InputReader.lllIIlIl("bQ==", "Mxwgs");
        InputReader.Illlll[InputReader.llllll[115]] = InputReader.IIIlIlIl("TEaiE8Ilgkg=", "EQWtn");
        InputReader.Illlll[InputReader.llllll[79]] = InputReader.lllIIlIl("dw==", "WXnhY");
        InputReader.Illlll[InputReader.llllll[117]] = InputReader.IIIlIlIl("6DByiyMl4oI=", "tmJhn");
        InputReader.Illlll[InputReader.llllll[116]] = InputReader.lIIlIlIl("ueZ2gko7lxQ=", "rJxXH");
        InputReader.Illlll[InputReader.llllll[118]] = InputReader.IIIlIlIl("GDrcJ00LXbo=", "HTypH");
        InputReader.Illlll[InputReader.llllll[119]] = InputReader.IIIlIlIl("LSw5aWpZizU=", "vHEat");
        InputReader.Illlll[InputReader.llllll[120]] = InputReader.lIIlIlIl("tcC5MueoU8w=", "HjQxP");
        InputReader.Illlll[InputReader.llllll[80]] = InputReader.lllIIlIl("QQ==", "aZsJS");
        InputReader.Illlll[InputReader.llllll[121]] = InputReader.lllIIlIl("QQ==", "aPcoo");
        InputReader.Illlll[InputReader.llllll[78]] = InputReader.IIIlIlIl("CGegkl7rmXw=", "vZkua");
        InputReader.Illlll[InputReader.llllll[122]] = InputReader.lllIIlIl("Ug==", "rtPeX");
        InputReader.Illlll[InputReader.llllll[123]] = InputReader.IIIlIlIl("0tKnmBPnkGw=", "JoEii");
        InputReader.Illlll[InputReader.llllll[126]] = InputReader.lllIIlIl("dQ==", "UbRnu");
        InputReader.Illlll[InputReader.llllll[127]] = InputReader.IIIlIlIl("KEOmAtTnUnI=", "WKyck");
        InputReader.Illlll[InputReader.llllll[129]] = InputReader.lllIIlIl("bg==", "NQJHO");
        InputReader.Illlll[InputReader.llllll[131]] = InputReader.IIIlIlIl("NhvfItntMRw=", "AVRPQ");
        InputReader.Illlll[InputReader.llllll[54]] = InputReader.lIIlIlIl("HUWLAyEiTaw=", "eoXJn");
        InputReader.Illlll[InputReader.llllll[67]] = InputReader.lllIIlIl("dQ==", "UtVxA");
        InputReader.Illlll[InputReader.llllll[136]] = InputReader.lIIlIlIl("mFixUSBUxTw=", "OkeFJ");
        InputReader.Illlll[InputReader.llllll[137]] = InputReader.lllIIlIl("ZQ==", "EFXgD");
        InputReader.Illlll[InputReader.llllll[73]] = InputReader.IIIlIlIl("6nGEZme9dFQ=", "BeFsq");
        InputReader.Illlll[InputReader.llllll[139]] = InputReader.IIIlIlIl("XkJD1X1sXRU=", "stZiC");
        InputReader.Illlll[InputReader.llllll[68]] = InputReader.lIIlIlIl("BtRqsXy1YaU=", "OApoj");
        InputReader.Illlll[InputReader.llllll[142]] = InputReader.IIIlIlIl("nnXduZdDP1M=", "TPjbi");
        InputReader.Illlll[InputReader.llllll[69]] = InputReader.lllIIlIl("dA==", "TCHZp");
        InputReader.Illlll[InputReader.llllll[72]] = InputReader.lIIlIlIl("aRdd95m4Sgc=", "tqvav");
        InputReader.Illlll[InputReader.llllll[114]] = InputReader.lIIlIlIl("ReYVaw9KL8I=", "VPkfA");
        InputReader.Illlll[InputReader.llllll[128]] = InputReader.lIIlIlIl("0t5ejBjTAO8=", "ylxCe");
        InputReader.Illlll[InputReader.llllll[132]] = InputReader.lIIlIlIl("fi+Vm4Ipets=", "ZqsTM");
        InputReader.Illlll[InputReader.llllll[51]] = InputReader.lllIIlIl("WQ==", "yxDCa");
        InputReader.Illlll[InputReader.llllll[111]] = InputReader.lllIIlIl("Tg==", "nPBzi");
        InputReader.Illlll[InputReader.llllll[148]] = InputReader.lllIIlIl("Rw==", "gZnSc");
        InputReader.Illlll[InputReader.llllll[149]] = InputReader.IIIlIlIl("SbC3r/tAgnw=", "wvwch");
        InputReader.Illlll[InputReader.llllll[150]] = InputReader.lllIIlIl("eg==", "ZuTDD");
        InputReader.Illlll[InputReader.llllll[141]] = InputReader.lIIlIlIl("4S6TVJRE0Js=", "HZzly");
        InputReader.Illlll[InputReader.llllll[113]] = InputReader.lIIlIlIl("Z4ye4CGxg3U=", "Zqlyl");
        InputReader.Illlll[InputReader.llllll[125]] = InputReader.IIIlIlIl("scQfX7SaM74=", "dZAgM");
        InputReader.Illlll[InputReader.llllll[153]] = InputReader.lllIIlIl("ZA==", "DnXKV");
        InputReader.Illlll[InputReader.llllll[154]] = InputReader.lIIlIlIl("pjM/gieX8nk=", "YlHOZ");
        InputReader.Illlll[InputReader.llllll[52]] = InputReader.lIIlIlIl("qfKonU/YAiE=", "APaXi");
        InputReader.Illlll[InputReader.llllll[87]] = InputReader.lIIlIlIl("HMSRD2o3ugw=", "nqwoz");
        InputReader.Illlll[InputReader.llllll[159]] = InputReader.IIIlIlIl("M94PBlscQ2w=", "kQDPS");
        InputReader.Illlll[InputReader.llllll[160]] = InputReader.IIIlIlIl("xrFFZR3FCZs=", "dMstq");
        InputReader.Illlll[InputReader.llllll[161]] = InputReader.IIIlIlIl("fUcn+Up9qL4=", "mCOVk");
        InputReader.Illlll[InputReader.llllll[164]] = InputReader.IIIlIlIl("MIMlTlB1gc4=", "HgDAb");
        InputReader.Illlll[InputReader.llllll[155]] = InputReader.lIIlIlIl("dJnZsLHoWrc=", "KBgwR");
        InputReader.Illlll[InputReader.llllll[169]] = InputReader.lIIlIlIl("U8SG1iDsfZo=", "SEKlI");
        InputReader.Illlll[InputReader.llllll[133]] = InputReader.lllIIlIl("ZQ==", "EbZWg");
        InputReader.Illlll[InputReader.llllll[145]] = InputReader.lIIlIlIl("VcdSVdXpQ8k=", "gNHav");
        InputReader.Illlll[InputReader.llllll[140]] = InputReader.lIIlIlIl("npDAzqMmy1c=", "sFlFv");
        InputReader.Illlll[InputReader.llllll[176]] = InputReader.lIIlIlIl("1WSuZ6SKXhQ=", "EUKdR");
        InputReader.Illlll[InputReader.llllll[167]] = InputReader.lllIIlIl("cg==", "RJRIc");
        InputReader.Illlll[InputReader.llllll[181]] = InputReader.lllIIlIl("VWNI", "uChUa");
        InputReader.Illlll[InputReader.llllll[184]] = InputReader.IIIlIlIl("QHI8msJfVo4=", "lcSxC");
        InputReader.Illlll[InputReader.llllll[185]] = InputReader.lIIlIlIl("xaBeN2Xtkc0=", "NBfRH");
        InputReader.Illlll[InputReader.llllll[157]] = InputReader.lllIIlIl("SQ==", "idkJj");
        InputReader.Illlll[InputReader.llllll[168]] = InputReader.lIIlIlIl("qlWjJcYcvuk=", "JHRrd");
        InputReader.Illlll[InputReader.llllll[187]] = InputReader.lIIlIlIl("OHXMlo9V2sY=", "HNDkX");
        InputReader.Illlll[InputReader.llllll[61]] = InputReader.IIIlIlIl("piort1KzUjk=", "FUixH");
        InputReader.Illlll[InputReader.llllll[188]] = InputReader.IIIlIlIl("x4gByRgGuj0=", "CdGQI");
        InputReader.Illlll[InputReader.llllll[191]] = InputReader.IIIlIlIl("RUoq2yPeptU=", "KCPZX");
        InputReader.Illlll[InputReader.llllll[165]] = InputReader.lllIIlIl("Vg==", "vunQA");
        InputReader.Illlll[InputReader.llllll[192]] = InputReader.lllIIlIl("WQ==", "yaUpM");
        InputReader.Illlll[InputReader.llllll[193]] = InputReader.lIIlIlIl("pip6maccXjs=", "hImfO");
        InputReader.Illlll[InputReader.llllll[156]] = InputReader.lIIlIlIl("Kl7RB7d6MLI=", "YSgMH");
        InputReader.Illlll[InputReader.llllll[183]] = InputReader.lIIlIlIl("kXGtXaWy/Bo=", "WcnmX");
        InputReader.Illlll[InputReader.llllll[173]] = InputReader.IIIlIlIl("8iw33ZRTa7Q=", "zPRll");
        InputReader.Illlll[InputReader.llllll[195]] = InputReader.IIIlIlIl("WEVpOkTfTP0=", "Nhubq");
        InputReader.Illlll[InputReader.llllll[197]] = InputReader.IIIlIlIl("T09t51DLKDg=", "qgESM");
        InputReader.Illlll[InputReader.llllll[158]] = InputReader.IIIlIlIl("BTdg7GbeF6E=", "mgCxi");
        InputReader.Illlll[InputReader.llllll[198]] = InputReader.IIIlIlIl("27OAzpa7SDM=", "rPuff");
        InputReader.Illlll[InputReader.llllll[199]] = InputReader.lllIIlIl("eQ==", "YLaoC");
        InputReader.Illlll[InputReader.llllll[175]] = InputReader.lllIIlIl("bw==", "OhhPc");
        InputReader.Illlll[InputReader.llllll[86]] = InputReader.lIIlIlIl("q00pBApiC3U=", "PYvHw");
        InputReader.Illlll[InputReader.llllll[62]] = InputReader.IIIlIlIl("HA0SdRU/PUI=", "wYTkH");
        InputReader.Illlll[InputReader.llllll[194]] = InputReader.IIIlIlIl("uUzA9iu5p14=", "WUuCq");
        InputReader.Illlll[InputReader.llllll[200]] = InputReader.lIIlIlIl("vQoHGfLBOVs=", "unVVs");
        InputReader.Illlll[InputReader.llllll[201]] = InputReader.IIIlIlIl("p2F8SWpnyfM=", "FvEsA");
        InputReader.Illlll[InputReader.llllll[202]] = InputReader.IIIlIlIl("qqZ/CoUbSbM=", "LInsn");
        InputReader.Illlll[InputReader.llllll[203]] = InputReader.lIIlIlIl("ZNBFpenRMs0=", "XFgGq");
        InputReader.Illlll[InputReader.llllll[166]] = InputReader.lllIIlIl("Wg==", "zqpnF");
    }

    /*
     * Unable to fully structure code
     */
    private static String lllIIlIl(String llIllIlIIllIlIl, String IlIllIlIIllIlIl) {
        llIllIlIIllIlIl = new String(Base64.getDecoder().decode(llIllIlIIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        lIIllIlIIllIlIl = new StringBuilder();
        IIIllIlIIllIlIl = IlIllIlIIllIlIl.toCharArray();
        lllIlIlIIllIlIl = InputReader.llllll[0];
        lIllIIlIIllIlIl = llIllIlIIllIlIl.toCharArray();
        IlllIIlIIllIlIl = lIllIIlIIllIlIl.length;
        llllIIlIIllIlIl = InputReader.llllll[0];
        "".length();
        if (-" ".length() <= 0) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            IllIlIlIIllIlIl = lIllIIlIIllIlIl[llllIIlIIllIlIl];
            lIIllIlIIllIlIl.append((char)(IllIlIlIIllIlIl ^ IIIllIlIIllIlIl[lllIlIlIIllIlIl % IIIllIlIIllIlIl.length]));
            "".length();
            ++lllIlIlIIllIlIl;
            ++llllIIlIIllIlIl;
lbl19:
            // 2 sources

            ** while (!InputReader.lIIIllIl((int)llllIIlIIllIlIl, (int)IlllIIlIIllIlIl))
        }
lbl20:
        // 1 sources

        return String.valueOf(lIIllIlIIllIlIl);
    }

    private static String IIIlIlIl(String IIIlIIlIIllIlIl, String lllIIIlIIllIlIl) {
        try {
            SecretKeySpec IllIIIlIIllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIIlIIllIlIl.getBytes(StandardCharsets.UTF_8)), llllll[8]), "DES");
            Cipher lIlIIIlIIllIlIl = Cipher.getInstance("DES");
            lIlIIIlIIllIlIl.init(llllll[2], IllIIIlIIllIlIl);
            return new String(lIlIIIlIIllIlIl.doFinal(Base64.getDecoder().decode(IIIlIIlIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIlIIIlIIllIlIl) {
            IIlIIIlIIllIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIIlIlIl(String llIlllIIIllIlIl, String IlIlllIIIllIlIl) {
        try {
            SecretKeySpec lIIlllIIIllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlIlllIIIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IIIlllIIIllIlIl = Cipher.getInstance("Blowfish");
            IIIlllIIIllIlIl.init(llllll[2], lIIlllIIIllIlIl);
            return new String(IIIlllIIIllIlIl.doFinal(Base64.getDecoder().decode(llIlllIIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIllIIIllIlIl) {
            lllIllIIIllIlIl.printStackTrace();
            return null;
        }
    }

    private static void llIlIlIl() {
        llllll = new int[206];
        InputReader.llllll[0] = "   ".length() << (" ".length() << " ".length()) & ~("   ".length() << (" ".length() << " ".length()));
        InputReader.llllll[1] = " ".length();
        InputReader.llllll[2] = " ".length() << " ".length();
        InputReader.llllll[3] = "   ".length();
        InputReader.llllll[4] = " ".length() << (" ".length() << " ".length());
        InputReader.llllll[5] = 0x1A ^ 0x1F;
        InputReader.llllll[6] = "   ".length() << " ".length();
        InputReader.llllll[7] = 0xAA ^ 0xAD;
        InputReader.llllll[8] = " ".length() << "   ".length();
        InputReader.llllll[9] = 37 + 112 - 36 + 58 ^ (0x7F ^ 0x2E) << " ".length();
        InputReader.llllll[10] = (0x6F ^ 0x6A) << " ".length();
        InputReader.llllll[11] = (0x9A ^ 0x91) << (" ".length() << " ".length()) ^ (0xB9 ^ 0x9E);
        InputReader.llllll[12] = "   ".length() << (" ".length() << " ".length());
        InputReader.llllll[13] = 0x98 ^ 0x8D ^ "   ".length() << "   ".length();
        InputReader.llllll[14] = ((2 ^ 0x33) << " ".length() ^ (0x15 ^ 0x70)) << " ".length();
        InputReader.llllll[15] = "   ".length() << (0x9B ^ 0x9E) ^ (0x51 ^ 0x3E);
        InputReader.llllll[16] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        InputReader.llllll[17] = 0xD9 ^ 0x86 ^ (0x53 ^ 0x74) << " ".length();
        InputReader.llllll[18] = (0x10 ^ 0x19) << " ".length();
        InputReader.llllll[19] = 0x5E ^ 0x4D;
        InputReader.llllll[20] = (0xB4 ^ 0xB1) << (" ".length() << " ".length());
        InputReader.llllll[21] = 152 + 146 - 145 + 24 ^ (0x93 ^ 0xBA) << (" ".length() << " ".length());
        InputReader.llllll[22] = (0x25 ^ 0x2E) << " ".length();
        InputReader.llllll[23] = 0xBD ^ 0xAA ^ (0x18 ^ 0x1F) & ~(0x7D ^ 0x7A);
        InputReader.llllll[24] = "   ".length() << "   ".length();
        InputReader.llllll[25] = 0x92 ^ 0x8B;
        InputReader.llllll[26] = ((0x3F ^ 0x62) << " ".length() ^ 35 + 103 - 33 + 78) << " ".length();
        InputReader.llllll[27] = 48 + 187 - 215 + 197 ^ (0xE0 ^ 0x81) << " ".length();
        InputReader.llllll[28] = (99 + 84 - 23 + 5 ^ (0xDA ^ 0x8B) << " ".length()) << (" ".length() << " ".length());
        InputReader.llllll[29] = (0x4A ^ 0xB) << " ".length() ^ 117 + 130 - 109 + 21;
        InputReader.llllll[30] = (0x8C ^ 0x83) << " ".length();
        InputReader.llllll[31] = 0x84 ^ 0x9B;
        InputReader.llllll[32] = " ".length() << (0x5E ^ 0x5B);
        InputReader.llllll[33] = 0x4A ^ 0x59 ^ (0xB1 ^ 0xA8) << " ".length();
        InputReader.llllll[34] = (0x34 ^ 0x25) << " ".length();
        InputReader.llllll[35] = " ".length() << (" ".length() << " ".length()) ^ (0x23 ^ 4);
        InputReader.llllll[36] = (0x3A ^ 0x33) << (" ".length() << " ".length());
        InputReader.llllll[37] = 0x1E ^ 0x3B;
        InputReader.llllll[38] = (0x43 ^ 0x50) << " ".length();
        InputReader.llllll[39] = (0xAE ^ 0xB7) << (" ".length() << " ".length()) ^ (0x1F ^ 0x5C);
        InputReader.llllll[40] = (0x46 ^ 0x43) << "   ".length();
        InputReader.llllll[41] = 156 + 57 - 176 + 134 ^ (0x2C ^ 0x6D) << " ".length();
        InputReader.llllll[42] = (12 + 29 - 27 + 125 ^ (0x6A ^ 0x25) << " ".length()) << " ".length();
        InputReader.llllll[43] = 0x33 ^ 0x18;
        InputReader.llllll[44] = (0xE0 ^ 0xBB ^ (0x37 ^ 0x32) << (" ".length() << (" ".length() << " ".length()))) << (" ".length() << " ".length());
        InputReader.llllll[45] = 0xF ^ 0x22;
        InputReader.llllll[46] = ((0 ^ 0x37) << " ".length() ^ (8 ^ 0x71)) << " ".length();
        InputReader.llllll[47] = (0xB ^ 0xC) << " ".length() ^ (0xD ^ 0x2C);
        InputReader.llllll[48] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        InputReader.llllll[49] = (0x63 ^ 0x42) << " ".length() ^ (0x5A ^ 0x29);
        InputReader.llllll[50] = (" ".length() << ("   ".length() << " ".length()) ^ (0xD4 ^ 0x8D)) << " ".length();
        InputReader.llllll[51] = (0x1A ^ 5) << (" ".length() << " ".length());
        InputReader.llllll[52] = (80 + 128 - 51 + 40 ^ (0x29 ^ 0x6A) << " ".length()) << " ".length();
        InputReader.llllll[53] = (0x2D ^ 0x72) << " ".length();
        InputReader.llllll[54] = 0x3E ^ 0x51;
        InputReader.llllll[55] = ((0x52 ^ 0x45) << "   ".length() ^ 98 + 1 - 98 + 152) << " ".length();
        InputReader.llllll[56] = 176 + 166 - 321 + 170 ^ (0x65 ^ 0x46) << (" ".length() << " ".length());
        InputReader.llllll[57] = (0x4D ^ 0x1A ^ (0x43 ^ 0x6E) << " ".length()) << (" ".length() << " ".length());
        InputReader.llllll[58] = (0x86 ^ 0x89) << (" ".length() << " ".length());
        InputReader.llllll[59] = 100 + 34 - 42 + 65 ^ (0x8E ^ 0x9B) << "   ".length();
        InputReader.llllll[60] = ((0xD7 ^ 0xC2) << " ".length() ^ (0xB0 ^ 0x81)) << " ".length();
        InputReader.llllll[61] = 88 + 126 - 123 + 62;
        InputReader.llllll[62] = ((0x28 ^ 0x25) << " ".length()) + (" ".length() << ("   ".length() << " ".length())) - (0x3B ^ 0x10) + ((0xB8 ^ 0x85) << " ".length());
        InputReader.llllll[63] = 0x3E ^ 0x1F ^ (0x53 ^ 0x58) << " ".length();
        InputReader.llllll[64] = ((0xC4 ^ 0x85) << " ".length() ^ 52 + 107 - 58 + 32) << "   ".length();
        InputReader.llllll[65] = 0x5B ^ 0x62;
        InputReader.llllll[66] = (0xB1 ^ 0xAC) << " ".length();
        InputReader.llllll[67] = ((0xB6 ^ 0x9B) << " ".length() ^ (0xF6 ^ 0xAB)) << (" ".length() << (" ".length() << " ".length()));
        InputReader.llllll[68] = 0xF1 ^ 0x84;
        InputReader.llllll[69] = 0x63 ^ 0x14;
        InputReader.llllll[70] = 0xEB ^ 0xBC ^ (0x2A ^ 0x31) << (" ".length() << " ".length());
        InputReader.llllll[71] = 0x22 ^ 0x2F ^ "   ".length() << (" ".length() << (" ".length() << " ".length()));
        InputReader.llllll[72] = (0xCF ^ 0xC0) << "   ".length();
        InputReader.llllll[73] = 0x7F ^ 0xC;
        InputReader.llllll[74] = (0x3C ^ 0x23) << " ".length();
        InputReader.llllll[75] = 32 + 50 - 6 + 113 ^ (0xDD ^ 0x9C) << " ".length();
        InputReader.llllll[76] = " ".length() << ("   ".length() << " ".length());
        InputReader.llllll[77] = 0x3E ^ 0x7F;
        InputReader.llllll[78] = (0x88 ^ 0x85) << "   ".length();
        InputReader.llllll[79] = "   ".length() << (0 ^ 5);
        InputReader.llllll[80] = (0x75 ^ 0x46) << " ".length();
        InputReader.llllll[81] = (0x47 ^ 0xE ^ (0x7F ^ 0x66) << (" ".length() << " ".length())) << " ".length();
        InputReader.llllll[82] = 0xC8 ^ 0x9D ^ (0x27 ^ 0x2C) << " ".length();
        InputReader.llllll[83] = 4 ^ 0x49;
        InputReader.llllll[84] = (26 + 112 - 48 + 99 ^ (0xB9 ^ 0x92) << (" ".length() << " ".length())) << (" ".length() << " ".length());
        InputReader.llllll[85] = 0x27 ^ 0x4C ^ (0xA8 ^ 0xBF) << " ".length();
        InputReader.llllll[86] = (0x42 ^ 0x57) << "   ".length();
        InputReader.llllll[87] = 83 + 38 - 0 + 14;
        InputReader.llllll[88] = (0x85 ^ 0xA6) << " ".length();
        InputReader.llllll[89] = 0x35 ^ 0x72;
        InputReader.llllll[90] = -(0x7E ^ 0x71 ^ (0x73 ^ 0x76) << (" ".length() << " ".length()));
        InputReader.llllll[91] = (0x24 ^ 0x2D) << "   ".length();
        InputReader.llllll[92] = 0x79 ^ 0x30;
        InputReader.llllll[93] = (0x44 ^ 0x5F ^ (0xDD ^ 0xC2) << " ".length()) << " ".length();
        InputReader.llllll[94] = (0x90 ^ 0x95) << " ".length() ^ (0x4D ^ 0xC);
        InputReader.llllll[95] = (0x3D ^ 0x4A ^ (0x38 ^ 0x21) << (" ".length() << " ".length())) << (" ".length() << " ".length());
        InputReader.llllll[96] = (0xF ^ 0x28) << " ".length();
        InputReader.llllll[97] = 0x3B ^ 0x5E ^ (0x42 ^ 0x57) << " ".length();
        InputReader.llllll[98] = (0x58 ^ 0x5D) << (" ".length() << (" ".length() << " ".length()));
        InputReader.llllll[99] = 0x22 ^ 0x73;
        InputReader.llllll[100] = (0xEF ^ 0xC6) << " ".length();
        InputReader.llllll[101] = 0x44 ^ 0x17;
        InputReader.llllll[102] = (0x6D ^ 0x78) << (" ".length() << " ".length());
        InputReader.llllll[103] = (0x7A ^ 0x7F) << (" ".length() << (" ".length() << " ".length())) ^ (0x4A ^ 0x4F);
        InputReader.llllll[104] = (171 + 141 - 226 + 153 ^ (0xBB ^ 0x8A) << (" ".length() << " ".length())) << " ".length();
        InputReader.llllll[105] = 0xCF ^ 0x98;
        InputReader.llllll[106] = (136 + 161 - 186 + 54 ^ (0x7C ^ 0x2B) << " ".length()) << "   ".length();
        InputReader.llllll[107] = (0x3F ^ 6) << " ".length() ^ (0x51 ^ 0x7A);
        InputReader.llllll[108] = 164 + 197 - 217 + 93 ^ (0x2D ^ 0x76) << " ".length();
        InputReader.llllll[109] = ((0xC ^ 9) << " ".length() ^ (0xB6 ^ 0xAB)) << (" ".length() << " ".length());
        InputReader.llllll[110] = 0x3C ^ 0x61;
        InputReader.llllll[111] = (0x67 ^ 0x7A) << " ".length() ^ (0xF7 ^ 0xB0);
        InputReader.llllll[112] = (0x26 ^ 9) << " ".length();
        InputReader.llllll[113] = (0xDF ^ 0x9E) << " ".length();
        InputReader.llllll[114] = 0x20 ^ 0x59;
        InputReader.llllll[115] = 0x5B ^ 4;
        InputReader.llllll[116] = ((0x8B ^ 0xA6) << (" ".length() << " ".length()) ^ 78 + 54 - 4 + 5) << " ".length();
        InputReader.llllll[117] = (0xD7 ^ 0xC2) << (" ".length() << " ".length()) ^ (0x7D ^ 0x48);
        InputReader.llllll[118] = (0x7A ^ 0x75) << (" ".length() << " ".length()) ^ (0xD1 ^ 0x8E);
        InputReader.llllll[119] = (0x98 ^ 0x81) << (" ".length() << " ".length());
        InputReader.llllll[120] = 0x28 ^ 0x4D;
        InputReader.llllll[121] = 0x29 ^ 0x4E;
        InputReader.llllll[122] = 0x6D ^ 4;
        InputReader.llllll[123] = (0xB ^ 0x4E ^ (0x48 ^ 0x4F) << (" ".length() << (" ".length() << " ".length()))) << " ".length();
        InputReader.llllll[124] = (0x78 ^ 0x17) << " ".length();
        InputReader.llllll[125] = ("   ".length() << (0x32 ^ 0x37)) + ((0x58 ^ 0x4D) << (" ".length() << " ".length())) - ((0x10 ^ 0x39) << " ".length()) + (3 ^ 0x22);
        InputReader.llllll[126] = " ".length() ^ (0x35 ^ 0) << " ".length();
        InputReader.llllll[127] = (0xA8 ^ 0xB3) << (" ".length() << " ".length());
        InputReader.llllll[128] = (0x67 ^ 6 ^ (0x45 ^ 0x52) << (" ".length() << " ".length())) << " ".length();
        InputReader.llllll[129] = 185 + 209 - 196 + 21 ^ (0x47 ^ 0x1C) << " ".length();
        InputReader.llllll[130] = -((0xAD ^ 0xA2) << "   ".length() ^ (0xC3 ^ 0xB6));
        InputReader.llllll[131] = (0x41 ^ 0x76) << " ".length();
        InputReader.llllll[132] = 0x34 ^ 0x4F;
        InputReader.llllll[133] = (0xF8 ^ 0xBF) << " ".length();
        InputReader.llllll[134] = 23 + 13 - -98 + 47;
        InputReader.llllll[135] = ((0xBC ^ 0x8D) << (" ".length() << " ".length()) ^ 31 + 61 - 89 + 154) << " ".length();
        InputReader.llllll[136] = 0x62 ^ 0x39 ^ (0x8C ^ 0x99) << " ".length();
        InputReader.llllll[137] = ((0x42 ^ 0x55) << (" ".length() << " ".length()) ^ (0x3F ^ 0x5A)) << " ".length();
        InputReader.llllll[138] = (0x8B ^ 0xBE) << (" ".length() << " ".length());
        InputReader.llllll[139] = ((0xB4 ^ 0xB1) << (" ".length() << (" ".length() << " ".length())) ^ (0xCE ^ 0x83)) << (" ".length() << " ".length());
        InputReader.llllll[140] = (0x6D ^ 0x64) << (" ".length() << (" ".length() << " ".length()));
        InputReader.llllll[141] = ((0x31 ^ 0x3A) << (" ".length() << " ".length())) + (0x2A ^ 0x4F) - ((0x80 ^ 0x89) << " ".length()) + (" ".length() << " ".length());
        InputReader.llllll[142] = (84 + 2 - -92 + 73 ^ "   ".length() << ("   ".length() << " ".length())) << " ".length();
        InputReader.llllll[143] = (0x81 ^ 0xBE) << (" ".length() << " ".length());
        InputReader.llllll[144] = ((0x9B ^ 0xB8) << " ".length()) + (0x1B ^ 0x2A) - ((0xBF ^ 0xA4) << (" ".length() << " ".length())) + ((0x4F ^ 0x62) << (" ".length() << " ".length()));
        InputReader.llllll[145] = 23 + 45 - 57 + 132;
        InputReader.llllll[146] = ((0x4B ^ 0x58) << " ".length() ^ (0xD0 ^ 0xAD)) << " ".length();
        InputReader.llllll[147] = (0x4C ^ 0x3D) << " ".length();
        InputReader.llllll[148] = (0xFE ^ 0xC1) << " ".length();
        InputReader.llllll[149] = 61 + 54 - 58 + 70;
        InputReader.llllll[150] = " ".length() << (0x9B ^ 0x9C);
        InputReader.llllll[151] = (6 ^ 0x29) << (" ".length() << " ".length());
        InputReader.llllll[152] = -((0x15 ^ 0x78) << " ".length() ^ (0x3B ^ 0x7C) << " ".length());
        InputReader.llllll[153] = ((0xA6 ^ 0x9F) << (" ".length() << " ".length()) ^ 2 + 4 - -104 + 87) << (" ".length() << " ".length());
        InputReader.llllll[154] = (0x27 ^ 6) + ((0x31 ^ 0x20) << (" ".length() << " ".length())) - -(3 ^ 4) + (0x6E ^ 0x77);
        InputReader.llllll[155] = (0x8D ^ 0xAE) << (" ".length() << " ".length());
        InputReader.llllll[156] = (0x90 ^ 0xA3) + (11 + 91 - 79 + 124) - (146 + 108 - 149 + 44) + ((0x51 ^ 0x66) << " ".length());
        InputReader.llllll[157] = (" ".length() ^ (2 ^ 0x27) << " ".length()) << " ".length();
        InputReader.llllll[158] = ((0xC8 ^ 0xC5) << " ".length() ^ (0xF ^ 0x3C)) << (" ".length() << " ".length());
        InputReader.llllll[159] = ((3 ^ 6) << (" ".length() << " ".length()) ^ (0x3D ^ 0x38)) << "   ".length();
        InputReader.llllll[160] = 136 + 43 - 178 + 136;
        InputReader.llllll[161] = (0x3F ^ 0x7A) << " ".length();
        InputReader.llllll[162] = (0x4C ^ 0x23 ^ (0x22 ^ 0x3B) << (" ".length() << " ".length())) << (" ".length() << (" ".length() << " ".length()));
        InputReader.llllll[163] = (0x22 ^ 0x4D) + ((0xB7 ^ 0x96) << (" ".length() << " ".length())) - (149 + 101 - 210 + 123) + (0xD6 ^ 0xA1);
        InputReader.llllll[164] = (0xB7 ^ 0x96) + (0x76 ^ 0x3D) - ("   ".length() << (" ".length() << " ".length())) + (0x68 ^ 0x43);
        InputReader.llllll[165] = ((3 ^ 0xC) << (" ".length() << " ".length()) ^ (0x63 ^ 0x78)) << (" ".length() << " ".length());
        InputReader.llllll[166] = 7 + 135 - 108 + 141;
        InputReader.llllll[167] = (0xF ^ 0x46) << " ".length();
        InputReader.llllll[168] = ((0xDD ^ 0xC2) << (" ".length() << " ".length())) + (110 + 123 - 109 + 19) - (96 + 145 - 45 + 9) + (0x3A ^ 0x63);
        InputReader.llllll[169] = 126 + 114 - 108 + 9;
        InputReader.llllll[170] = 121 + 62 - 70 + 80;
        InputReader.llllll[171] = (0xB5 ^ 0x98) + (" ".length() << (" ".length() << (" ".length() << " ".length()))) - -(0x74 ^ 0x3F) + (0x3F ^ 0x74);
        InputReader.llllll[172] = "   ".length() << ("   ".length() << " ".length());
        InputReader.llllll[173] = 74 + 40 - 59 + 106;
        InputReader.llllll[174] = (0x2A ^ 0x1B) << (" ".length() << " ".length());
        InputReader.llllll[175] = 120 + 143 - 159 + 63;
        InputReader.llllll[176] = 51 + 36 - -54 + 4;
        InputReader.llllll[177] = (126 + 88 - 77 + 10 ^ (0x10 ^ 0x45) << " ".length()) << (" ".length() << " ".length());
        InputReader.llllll[178] = 26 + 151 - 29 + 37;
        InputReader.llllll[179] = -(141 + 24 - 130 + 116 ^ (0x96 ^ 0xB7) << (" ".length() << " ".length()));
        InputReader.llllll[180] = 95 + 112 - 61 + 1 + (90 + 129 - 212 + 146) - ((0x28 ^ 0x6D) << " ".length()) + (0xFE ^ 0xC7);
        InputReader.llllll[181] = 84 + 139 - 203 + 127;
        InputReader.llllll[182] = 0 + 139 - 21 + 61;
        InputReader.llllll[183] = (0x43 ^ 0x46) << (0x45 ^ 0x40);
        InputReader.llllll[184] = (0xBA ^ 0x9F) << (" ".length() << " ".length());
        InputReader.llllll[185] = 100 + 122 - 145 + 72;
        InputReader.llllll[186] = (" ".length() << " ".length() ^ (0x2C ^ 0x35)) << "   ".length();
        InputReader.llllll[187] = (0x72 ^ 0x61) << "   ".length();
        InputReader.llllll[188] = (0xCD ^ 0x80) << " ".length();
        InputReader.llllll[189] = ((0x8A ^ 0x93) << " ".length()) + (119 + 101 - 180 + 211) - ((0xC3 ^ 0xA6) << " ".length()) + ((0x83 ^ 0xA4) << (" ".length() << " ".length()));
        InputReader.llllll[190] = ((0x9F ^ 0x94) << " ".length() ^ " ".length()) << "   ".length();
        InputReader.llllll[191] = (0xCA ^ 0xAD) + (" ".length() << " ".length()) - (0x44 ^ 0x51) + (0x79 ^ 0x3E);
        InputReader.llllll[192] = 99 + 132 - 177 + 103;
        InputReader.llllll[193] = (0xCA ^ 0x85) << " ".length();
        InputReader.llllll[194] = ((0x49 ^ 0x56) << " ".length() ^ (0x2B ^ 0x40)) << " ".length();
        InputReader.llllll[195] = (8 ^ 0x53 ^ (0xBB ^ 0xBE) << " ".length()) << " ".length();
        InputReader.llllll[196] = (0xB7 ^ 0x84) << (" ".length() << " ".length());
        InputReader.llllll[197] = 57 + 49 - 67 + 120 + ((0xBD ^ 0xAE) << "   ".length()) - (51 + 59 - 100 + 181) + (0x70 ^ 0x5B);
        InputReader.llllll[198] = ((0x2D ^ 0x62) << " ".length()) + (78 + 106 - 66 + 31) - ((0x3D ^ 0x28) << "   ".length()) + ((2 ^ 0xF) << " ".length());
        InputReader.llllll[199] = (0x9D ^ 0xA6 ^ (0xA7 ^ 0xAA) << "   ".length()) << " ".length();
        InputReader.llllll[200] = 94 + 27 - 15 + 65;
        InputReader.llllll[201] = (97 + 144 - 72 + 12 ^ (0xF ^ 0x40) << " ".length()) << (" ".length() << " ".length());
        InputReader.llllll[202] = 24 + 115 - 72 + 106;
        InputReader.llllll[203] = (0x76 ^ 0x21) << " ".length();
        InputReader.llllll[204] = -" ".length();
        InputReader.llllll[205] = 135 + 122 - 114 + 52;
    }

    private static boolean IIIIllIl(int n, int n2) {
        return n == n2;
    }

    private static boolean lIIIllIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IlIIllIl(Object object) {
        return object != null;
    }

    private static boolean IIllIlIl(int n) {
        return n != 0;
    }

    private static boolean llllIlIl(int n) {
        return n == 0;
    }

    private static boolean llIIllIl(int n) {
        return n >= 0;
    }

    private static boolean IlllIlIl(int n) {
        return n <= 0;
    }

    private static boolean IIlIllIl(int n) {
        return n > 0;
    }

    private static boolean lIllIlIl(int n, int n2) {
        return n != n2;
    }

    static class OutputWriter
    extends PrintWriter {
        public OutputWriter(OutputStream IlIllIIIlllIlIl) {
            super(IlIllIIIlllIlIl);
            OutputWriter llIllIIIlllIlIl;
        }

        public OutputWriter(Writer IIIIlIIIlllIlIl) {
            super(IIIIlIIIlllIlIl);
            OutputWriter lIIIlIIIlllIlIl;
        }

        public OutputWriter(String IllIIIIIlllIlIl) throws FileNotFoundException {
            super(IllIIIIIlllIlIl);
            OutputWriter lllIIIIIlllIlIl;
        }

        @Override
        public void close() {
            OutputWriter IlllllllIllIlIl;
            super.close();
        }
    }
}

