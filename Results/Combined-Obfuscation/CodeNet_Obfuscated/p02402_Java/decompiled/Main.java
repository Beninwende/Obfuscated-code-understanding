/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private static String[] lIIIlIIlll;
    private static int[] IIlIlIIlll;
    private static String[] lIlIlIIlll;
    private static int[] IllIlIIlll;

    public Main() {
        Main IIlIIllllIIIIll;
    }

    public static void main(String[] stringArray) {
        BufferedReader lIlIlIlllIIIIll = new BufferedReader(new InputStreamReader(System.in));
        try {
            String IIlIlIlllIIIIll = lIlIlIlllIIIIll.readLine();
            int llIIlIlllIIIIll = Integer.parseInt(IIlIlIlllIIIIll);
            String IlIIlIlllIIIIll = lIlIlIlllIIIIll.readLine();
            String[] lIIIlIlllIIIIll = IlIIlIlllIIIIll.split(lIIIlIIlll[IIlIlIIlll[IllIlIIlll[0]]], IIlIlIIlll[IllIlIIlll[1]]);
            int[] IIIIlIlllIIIIll = new int[llIIlIlllIIIIll];
            int llllIIlllIIIIll = IIlIlIIlll[IllIlIIlll[0]];
            while (Main.lIlIlIlIlIll(Main.lIllIIlIlIll(llllIIlllIIIIll, llIIlIlllIIIIll) ? 1 : 0)) {
                IIIIlIlllIIIIll[llllIIlllIIIIll] = Integer.parseInt(lIIIlIlllIIIIll[llllIIlllIIIIll]);
                ++llllIIlllIIIIll;
                lIlIlIIlll[IllIlIIlll[0]].length();
                "".length();
                if (!Main.IllIlIlIlIll(null)) continue;
                return;
            }
            llllIIlllIIIIll = IIlIlIIlll[IllIlIIlll[0]];
            int IlllIIlllIIIIll = IIlIlIIlll[IllIlIIlll[0]];
            while (Main.lIlIlIlIlIll(Main.lIllIIlIlIll(llllIIlllIIIIll, llIIlIlllIIIIll - IIlIlIIlll[IllIlIIlll[2]]) ? 1 : 0) && Main.lIlIlIlIlIll(Main.lIllIIlIlIll(IlllIIlllIIIIll, llIIlIlllIIIIll - IIlIlIIlll[IllIlIIlll[2]]) ? 1 : 0)) {
                if (!Main.lIlIlIlIlIll(Main.IlllIIlIlIll(IIIIlIlllIIIIll[llllIIlllIIIIll], IIIIlIlllIIIIll[++IlllIIlllIIIIll]) ? 1 : 0)) continue;
                llllIIlllIIIIll = IlllIIlllIIIIll;
                lIlIlIIlll[IllIlIIlll[1]].length();
                "".length();
                if (!Main.lllIlIlIlIll((IllIlIIlll[3] ^ IllIlIIlll[4] ^ (IllIlIIlll[5] ^ IllIlIIlll[6]) << lIlIlIIlll[IllIlIIlll[2]].length()) << (lIlIlIIlll[IllIlIIlll[7]].length() << lIlIlIIlll[IllIlIIlll[8]].length()) & ((IllIlIIlll[9] ^ IllIlIIlll[10] ^ (IllIlIIlll[11] ^ IllIlIIlll[12]) << lIlIlIIlll[IllIlIIlll[13]].length()) << (lIlIlIIlll[IllIlIIlll[14]].length() << lIlIlIIlll[IllIlIIlll[15]].length()) ^ -lIlIlIIlll[IllIlIIlll[16]].length()), lIlIlIIlll[IllIlIIlll[17]].length() << lIlIlIIlll[IllIlIIlll[18]].length())) continue;
                return;
            }
            int lIllIIlllIIIIll = IIlIlIIlll[IllIlIIlll[0]];
            int IIllIIlllIIIIll = IIlIlIIlll[IllIlIIlll[0]];
            while (Main.lIlIlIlIlIll(Main.lIllIIlIlIll(lIllIIlllIIIIll, llIIlIlllIIIIll - IIlIlIIlll[IllIlIIlll[2]]) ? 1 : 0) && Main.lIlIlIlIlIll(Main.lIllIIlIlIll(IIllIIlllIIIIll, llIIlIlllIIIIll - IIlIlIIlll[IllIlIIlll[2]]) ? 1 : 0)) {
                if (!Main.lIlIlIlIlIll(Main.lIllIIlIlIll(IIIIlIlllIIIIll[lIllIIlllIIIIll], IIIIlIlllIIIIll[++IIllIIlllIIIIll]) ? 1 : 0)) continue;
                lIllIIlllIIIIll = IIllIIlllIIIIll;
                lIlIlIIlll[IllIlIIlll[19]].length();
                "".length();
                if (!Main.IllIlIlIlIll(null)) continue;
                return;
            }
            long[] llIlIIlllIIIIll = new long[llIIlIlllIIIIll + IIlIlIIlll[IllIlIIlll[2]]];
            long[] IlIlIIlllIIIIll = new long[llIIlIlllIIIIll];
            int lIIlIIlllIIIIll = IIlIlIIlll[IllIlIIlll[0]];
            while (Main.lIlIlIlIlIll(Main.lIllIIlIlIll(lIIlIIlllIIIIll, llIIlIlllIIIIll) ? 1 : 0)) {
                IlIlIIlllIIIIll[lIIlIIlllIIIIll] = IIIIlIlllIIIIll[lIIlIIlllIIIIll];
                ++lIIlIIlllIIIIll;
                lIlIlIIlll[IllIlIIlll[20]].length();
                "".length();
                if (!Main.IIIllIlIlIll(lIlIlIIlll[IllIlIIlll[21]].length() << lIlIlIIlll[IllIlIIlll[22]].length(), lIlIlIIlll[IllIlIIlll[23]].length() << (lIlIlIIlll[IllIlIIlll[24]].length() << lIlIlIIlll[IllIlIIlll[25]].length()))) continue;
                return;
            }
            llIlIIlllIIIIll[Main.IIlIlIIlll[Main.IllIlIIlll[0]]] = 0L;
            lIIlIIlllIIIIll = IIlIlIIlll[IllIlIIlll[2]];
            while (Main.lIlIlIlIlIll(Main.llllIIlIlIll(lIIlIIlllIIIIll, llIIlIlllIIIIll) ? 1 : 0)) {
                llIlIIlllIIIIll[lIIlIIlllIIIIll] = IlIlIIlllIIIIll[lIIlIIlllIIIIll - IIlIlIIlll[IllIlIIlll[2]]] + llIlIIlllIIIIll[lIIlIIlllIIIIll - IIlIlIIlll[IllIlIIlll[2]]];
                ++lIIlIIlllIIIIll;
                lIlIlIIlll[IllIlIIlll[26]].length();
                "".length();
                if (!Main.lIIllIlIlIll(-lIlIlIIlll[IllIlIIlll[27]].length())) continue;
                return;
            }
            System.out.println(IIIIlIlllIIIIll[llllIIlllIIIIll] + " " + IIIIlIlllIIIIll[lIllIIlllIIIIll] + " " + llIlIIlllIIIIll[llIIlIlllIIIIll]);
        }
        catch (IOException IIlIlIlllIIIIll) {
            System.out.println(IIlIlIlllIIIIll);
            lIlIlIIlll[IllIlIIlll[34]].length();
            "".length();
            if (Main.IIIllIlIlIll(((IllIlIIlll[35] ^ IllIlIIlll[34]) << (lIlIlIIlll[IllIlIIlll[36]].length() << lIlIlIIlll[IllIlIIlll[37]].length()) ^ IllIlIIlll[11] + IllIlIIlll[38] - IllIlIIlll[39] + IllIlIIlll[40]) & (IllIlIIlll[23] + IllIlIIlll[41] - IllIlIIlll[42] + IllIlIIlll[43] ^ (IllIlIIlll[44] ^ IllIlIIlll[45]) << (lIlIlIIlll[IllIlIIlll[46]].length() << lIlIlIIlll[IllIlIIlll[47]].length()) ^ -lIlIlIIlll[IllIlIIlll[48]].length()), lIlIlIIlll[IllIlIIlll[49]].length())) {
                return;
            }
        }
        catch (NumberFormatException IIlIlIlllIIIIll) {
            System.out.println(lIIIlIIlll[IIlIlIIlll[IllIlIIlll[2]]]);
        }
        lIlIlIIlll[IllIlIIlll[28]].length();
        "".length();
        if (Main.lIlIlIlIlIll(lIlIlIIlll[IllIlIIlll[29]].length() << lIlIlIIlll[IllIlIIlll[30]].length() & (lIlIlIIlll[IllIlIIlll[31]].length() << lIlIlIIlll[IllIlIIlll[32]].length() ^ -lIlIlIIlll[IllIlIIlll[33]].length()))) {
            return;
        }
    }

    static {
        Main.IIlIlIlIlIll();
        Main.llIIlIlIlIll();
        Main.IIllIIlIlIll();
        Main.IlllllIIlIll();
    }

    private static void IlllllIIlIll() {
        lIIIlIIlll = new String[IIlIlIIlll[IllIlIIlll[7]]];
        Main.lIIIlIIlll[Main.IIlIlIIlll[Main.IllIlIIlll[0]]] = Main.lIllllIIlIll(lIlIlIIlll[IllIlIIlll[50]], lIlIlIIlll[IllIlIIlll[51]]);
        Main.lIIIlIIlll[Main.IIlIlIIlll[Main.IllIlIIlll[2]]] = Main.lIllllIIlIll(lIlIlIIlll[IllIlIIlll[12]], lIlIlIIlll[IllIlIIlll[52]]);
    }

    private static String lIllllIIlIll(String lllIllIllIIIIll, String IllIllIllIIIIll) {
        try {
            SecretKeySpec lIlIllIllIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(lIlIlIIlll[IllIlIIlll[53]]).digest(IllIllIllIIIIll.getBytes(StandardCharsets.UTF_8)), IIlIlIIlll[IllIlIIlll[8]]), lIlIlIIlll[IllIlIIlll[54]]);
            Cipher IIlIllIllIIIIll = Cipher.getInstance(lIlIlIIlll[IllIlIIlll[55]]);
            IIlIllIllIIIIll.init(IIlIlIIlll[IllIlIIlll[7]], lIlIllIllIIIIll);
            return new String(IIlIllIllIIIIll.doFinal(Base64.getDecoder().decode(lllIllIllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIllIllIIIIll) {
            llIIllIllIIIIll.printStackTrace();
            return null;
        }
    }

    private static void IIllIIlIlIll() {
        IIlIlIIlll = new int[IllIlIIlll[13]];
        Main.IIlIlIIlll[Main.IllIlIIlll[0]] = (IllIlIIlll[56] ^ IllIlIIlll[57]) << lIlIlIIlll[IllIlIIlll[58]].length() & ((IllIlIIlll[59] ^ IllIlIIlll[44]) << lIlIlIIlll[IllIlIIlll[60]].length() ^ IllIlIIlll[61]);
        Main.IIlIlIIlll[Main.IllIlIIlll[1]] = -lIlIlIIlll[IllIlIIlll[62]].length();
        Main.IIlIlIIlll[Main.IllIlIIlll[2]] = lIlIlIIlll[IllIlIIlll[63]].length();
        Main.IIlIlIIlll[Main.IllIlIIlll[7]] = lIlIlIIlll[IllIlIIlll[64]].length() << lIlIlIIlll[IllIlIIlll[65]].length();
        Main.IIlIlIIlll[Main.IllIlIIlll[8]] = lIlIlIIlll[IllIlIIlll[66]].length() << lIlIlIIlll[IllIlIIlll[67]].length();
    }

    private static boolean lIllIIlIlIll(int n, int n2) {
        boolean bl;
        if (Main.IlIllIlIlIll(n, n2)) {
            bl = IllIlIIlll[1];
            "".length();
            if (" ".length() << " ".length() != " ".length() << " ".length()) {
                return ((9 ^ 0x1A) & ~(0xA7 ^ 0xB4)) != 0;
            }
        } else {
            bl = IllIlIIlll[0];
        }
        return bl;
    }

    private static boolean llllIIlIlIll(int n, int n2) {
        boolean bl;
        if (Main.llIllIlIlIll(n, n2)) {
            bl = IllIlIIlll[1];
            "".length();
            if (-" ".length() != -" ".length()) {
                return ((0x22 ^ 0x2F) & ~(0x42 ^ 0x4F)) != 0;
            }
        } else {
            bl = IllIlIIlll[0];
        }
        return bl;
    }

    private static boolean IlllIIlIlIll(int n, int n2) {
        boolean bl;
        if (Main.IIlllIlIlIll(n, n2)) {
            bl = IllIlIIlll[1];
            "".length();
            if (" ".length() != " ".length()) {
                return (((0x92 ^ 0x95) << " ".length() ^ (0xDA ^ 0x83)) & ((0x25 ^ 0x4A) << " ".length() ^ 124 + 81 - 137 + 69 ^ -" ".length())) != 0;
            }
        } else {
            bl = IllIlIIlll[0];
        }
        return bl;
    }

    private static void llIIlIlIlIll() {
        lIlIlIIlll = new String[IllIlIIlll[68]];
        Main.lIlIlIIlll[Main.IllIlIIlll[0]] = Main.IIIIlIlIlIll("", "rwojB");
        Main.lIlIlIIlll[Main.IllIlIIlll[1]] = Main.lIIIlIlIlIll("gGQOUlOPmyc=", "HmQbC");
        Main.lIlIlIIlll[Main.IllIlIIlll[2]] = Main.IIIIlIlIlIll("cQ==", "QMDgH");
        Main.lIlIlIIlll[Main.IllIlIIlll[7]] = Main.lIIIlIlIlIll("FL9/uNVYw1g=", "YSBFf");
        Main.lIlIlIIlll[Main.IllIlIIlll[8]] = Main.lIIIlIlIlIll("/tzi/cwmcrc=", "uzdSp");
        Main.lIlIlIIlll[Main.IllIlIIlll[13]] = Main.IIIIlIlIlIll("Rg==", "fTUpm");
        Main.lIlIlIIlll[Main.IllIlIIlll[14]] = Main.lIIIlIlIlIll("6RvS5bz5wnE=", "VlcIt");
        Main.lIlIlIIlll[Main.IllIlIIlll[15]] = Main.IlIIlIlIlIll("fLgvXCB7ip8=", "ftWPp");
        Main.lIlIlIIlll[Main.IllIlIIlll[16]] = Main.IIIIlIlIlIll("cw==", "SJvBZ");
        Main.lIlIlIIlll[Main.IllIlIIlll[17]] = Main.lIIIlIlIlIll("XizhORTgX8w=", "DPheB");
        Main.lIlIlIIlll[Main.IllIlIIlll[18]] = Main.IIIIlIlIlIll("eQ==", "YxLSf");
        Main.lIlIlIIlll[Main.IllIlIIlll[19]] = Main.lIIIlIlIlIll("crYaGnQ7KDQ=", "nngAF");
        Main.lIlIlIIlll[Main.IllIlIIlll[20]] = Main.lIIIlIlIlIll("/uPBvNuW9AU=", "EtPWM");
        Main.lIlIlIIlll[Main.IllIlIIlll[21]] = Main.IIIIlIlIlIll("RA==", "dCIUv");
        Main.lIlIlIIlll[Main.IllIlIIlll[22]] = Main.IlIIlIlIlIll("GgQ55/LLPBI=", "fRkqa");
        Main.lIlIlIIlll[Main.IllIlIIlll[23]] = Main.IIIIlIlIlIll("Vg==", "vfbFC");
        Main.lIlIlIIlll[Main.IllIlIIlll[24]] = Main.IIIIlIlIlIll("Ug==", "rocGY");
        Main.lIlIlIIlll[Main.IllIlIIlll[25]] = Main.lIIIlIlIlIll("oUabWHzjZYU=", "vDDqJ");
        Main.lIlIlIIlll[Main.IllIlIIlll[26]] = Main.lIIIlIlIlIll("4+rlP9+tYzk=", "XGeGk");
        Main.lIlIlIIlll[Main.IllIlIIlll[27]] = Main.lIIIlIlIlIll("31/wyh9ntEs=", "tyHOa");
        Main.lIlIlIIlll[Main.IllIlIIlll[28]] = Main.IlIIlIlIlIll("wcJ8IeEAhiM=", "pksMN");
        Main.lIlIlIIlll[Main.IllIlIIlll[29]] = Main.IlIIlIlIlIll("qI5nF1tLtuI=", "ICwpa");
        Main.lIlIlIIlll[Main.IllIlIIlll[30]] = Main.IlIIlIlIlIll("5zTujcYwlPI=", "nczKF");
        Main.lIlIlIIlll[Main.IllIlIIlll[31]] = Main.IIIIlIlIlIll("SQ==", "iPRRE");
        Main.lIlIlIIlll[Main.IllIlIIlll[32]] = Main.lIIIlIlIlIll("Fqr4tmdcKs4=", "itUTR");
        Main.lIlIlIIlll[Main.IllIlIIlll[33]] = Main.IIIIlIlIlIll("Yg==", "BhCeO");
        Main.lIlIlIIlll[Main.IllIlIIlll[34]] = Main.IIIIlIlIlIll("", "WphcR");
        Main.lIlIlIIlll[Main.IllIlIIlll[36]] = Main.lIIIlIlIlIll("/TpgbcIyjfc=", "XaEqC");
        Main.lIlIlIIlll[Main.IllIlIIlll[37]] = Main.IIIIlIlIlIll("Wg==", "zumCo");
        Main.lIlIlIIlll[Main.IllIlIIlll[46]] = Main.IlIIlIlIlIll("+jIk42oLygI=", "SAdKf");
        Main.lIlIlIIlll[Main.IllIlIIlll[47]] = Main.IlIIlIlIlIll("vP6l3Z0Uzhs=", "CecJo");
        Main.lIlIlIIlll[Main.IllIlIIlll[48]] = Main.lIIIlIlIlIll("YGQ4Q6hC1ec=", "UuGMi");
        Main.lIlIlIIlll[Main.IllIlIIlll[49]] = Main.IlIIlIlIlIll("ScRKntTZXxA=", "xdpdt");
        Main.lIlIlIIlll[Main.IllIlIIlll[50]] = Main.lIIIlIlIlIll("QcPLUAOwHgsC3ID5vbqbBg==", "GNypR");
        Main.lIlIlIIlll[Main.IllIlIIlll[51]] = Main.IIIIlIlIlIll("HAMlCx4=", "vesJH");
        Main.lIlIlIIlll[Main.IllIlIIlll[12]] = Main.lIIIlIlIlIll("WjS6hLXwitOg8tlW1LMJWw==", "sFlBH");
        Main.lIlIlIIlll[Main.IllIlIIlll[52]] = Main.lIIIlIlIlIll("H4AOElb5Drw=", "mHkNb");
        Main.lIlIlIIlll[Main.IllIlIIlll[53]] = Main.IlIIlIlIlIll("fr4a55t9+Ss=", "FHcpu");
        Main.lIlIlIIlll[Main.IllIlIIlll[54]] = Main.lIIIlIlIlIll("sTtfYGVQmEA=", "SMClc");
        Main.lIlIlIIlll[Main.IllIlIIlll[55]] = Main.IlIIlIlIlIll("uwSEUEb97yU=", "WqoWn");
        Main.lIlIlIIlll[Main.IllIlIIlll[58]] = Main.IIIIlIlIlIll("Sw==", "kYwAN");
        Main.lIlIlIIlll[Main.IllIlIIlll[60]] = Main.lIIIlIlIlIll("h5n0jFzO1AY=", "dEbXz");
        Main.lIlIlIIlll[Main.IllIlIIlll[62]] = Main.IIIIlIlIlIll("dA==", "TwvQo");
        Main.lIlIlIIlll[Main.IllIlIIlll[63]] = Main.lIIIlIlIlIll("CvT0hMk8UI8=", "WXNIV");
        Main.lIlIlIIlll[Main.IllIlIIlll[64]] = Main.IlIIlIlIlIll("fREV9Azdhec=", "mXAcd");
        Main.lIlIlIIlll[Main.IllIlIIlll[65]] = Main.IIIIlIlIlIll("UA==", "pyfrq");
        Main.lIlIlIIlll[Main.IllIlIIlll[66]] = Main.IIIIlIlIlIll("Sg==", "jtThC");
        Main.lIlIlIIlll[Main.IllIlIIlll[67]] = Main.IlIIlIlIlIll("hykhYNynJHE=", "USyuS");
    }

    /*
     * Unable to fully structure code
     */
    private static String IIIIlIlIlIll(String llllIIIllIIIIll, String IlllIIIllIIIIll) {
        llllIIIllIIIIll = new String(Base64.getDecoder().decode(llllIIIllIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        lIllIIIllIIIIll = new StringBuilder();
        IIllIIIllIIIIll = IlllIIIllIIIIll.toCharArray();
        llIlIIIllIIIIll = Main.IllIlIIlll[0];
        lIIIIIIllIIIIll = llllIIIllIIIIll.toCharArray();
        IlIIIIIllIIIIll = lIIIIIIllIIIIll.length;
        llIIIIIllIIIIll = Main.IllIlIIlll[0];
        "".length();
        if (((103 + 29 - 71 + 108 ^ (226 ^ 187) << " ".length()) << " ".length() & (((19 ^ 94) << " ".length() ^ 93 + 69 - 106 + 73) << " ".length() ^ -" ".length())) == 0) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            IlIlIIIllIIIIll = lIIIIIIllIIIIll[llIIIIIllIIIIll];
            lIllIIIllIIIIll.append((char)(IlIlIIIllIIIIll ^ IIllIIIllIIIIll[llIlIIIllIIIIll % IIllIIIllIIIIll.length]));
            "".length();
            ++llIlIIIllIIIIll;
            ++llIIIIIllIIIIll;
lbl19:
            // 2 sources

            ** while (!Main.IIIllIlIlIll((int)llIIIIIllIIIIll, (int)IlIIIIIllIIIIll))
        }
lbl20:
        // 1 sources

        return String.valueOf(lIllIIIllIIIIll);
    }

    private static String IlIIlIlIlIll(String IIlllllIlIIIIll, String llIllllIlIIIIll) {
        try {
            SecretKeySpec IlIllllIlIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllllIlIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIllllIlIIIIll = Cipher.getInstance("Blowfish");
            lIIllllIlIIIIll.init(IllIlIIlll[2], IlIllllIlIIIIll);
            return new String(lIIllllIlIIIIll.doFinal(Base64.getDecoder().decode(IIlllllIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIllllIlIIIIll) {
            IIIllllIlIIIIll.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIlIlIll(String llllIllIlIIIIll, String IlllIllIlIIIIll) {
        try {
            SecretKeySpec lIllIllIlIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlllIllIlIIIIll.getBytes(StandardCharsets.UTF_8)), IllIlIIlll[16]), "DES");
            Cipher IIllIllIlIIIIll = Cipher.getInstance("DES");
            IIllIllIlIIIIll.init(IllIlIIlll[2], lIllIllIlIIIIll);
            return new String(IIllIllIlIIIIll.doFinal(Base64.getDecoder().decode(llllIllIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIllIlIIIIll) {
            llIlIllIlIIIIll.printStackTrace();
            return null;
        }
    }

    private static void IIlIlIlIlIll() {
        IllIlIIlll = new int[69];
        Main.IllIlIIlll[0] = (0x86 ^ 0x97) & ~(0x68 ^ 0x79);
        Main.IllIlIIlll[1] = " ".length();
        Main.IllIlIIlll[2] = " ".length() << " ".length();
        Main.IllIlIIlll[3] = 52 + 163 - 88 + 42 + ((0x20 ^ 0x67) << " ".length()) - ((0x34 ^ 0x2F) << "   ".length()) + ((2 ^ 0x1B) << (" ".length() << " ".length()));
        Main.IllIlIIlll[4] = (0x3C ^ 0x37) << (" ".length() << (" ".length() << " ".length()));
        Main.IllIlIIlll[5] = ((0x4C ^ 0xD) << " ".length() ^ 86 + 128 - 124 + 79) << " ".length();
        Main.IllIlIIlll[6] = 0x6D ^ 0;
        Main.IllIlIIlll[7] = "   ".length();
        Main.IllIlIIlll[8] = " ".length() << (" ".length() << " ".length());
        Main.IllIlIIlll[9] = (220 + 129 - 189 + 91 ^ (0x4F ^ 0x1A) << " ".length()) << " ".length();
        Main.IllIlIIlll[10] = 139 + 43 - 38 + 9;
        Main.IllIlIIlll[11] = (35 + 59 - -68 + 13 ^ (0x68 ^ 0x6D) << (0xAF ^ 0xAA)) << (" ".length() << " ".length());
        Main.IllIlIIlll[12] = 54 + 166 - 158 + 127 ^ (0xF ^ 0x40) << " ".length();
        Main.IllIlIIlll[13] = 0xC5 ^ 0xC0;
        Main.IllIlIIlll[14] = "   ".length() << " ".length();
        Main.IllIlIIlll[15] = 0x41 ^ 0x46;
        Main.IllIlIIlll[16] = " ".length() << "   ".length();
        Main.IllIlIIlll[17] = (0x13 ^ 2) << (" ".length() << " ".length()) ^ (0x5B ^ 0x16);
        Main.IllIlIIlll[18] = (168 + 145 - 201 + 83 ^ (0xF5 ^ 0x96) << " ".length()) << " ".length();
        Main.IllIlIIlll[19] = (0x64 ^ 0x57) << (" ".length() << " ".length()) ^ 28 + 194 - 24 + 1;
        Main.IllIlIIlll[20] = "   ".length() << (" ".length() << " ".length());
        Main.IllIlIIlll[21] = 102 + 78 - 167 + 190 ^ (0x26 ^ 0x45) << " ".length();
        Main.IllIlIIlll[22] = (0x9A ^ 0xA7 ^ (0x47 ^ 0x5A) << " ".length()) << " ".length();
        Main.IllIlIIlll[23] = 48 + 47 - 68 + 110 ^ (0xEE ^ 0xAD) << " ".length();
        Main.IllIlIIlll[24] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        Main.IllIlIIlll[25] = 0x1E ^ 0xF;
        Main.IllIlIIlll[26] = (0x57 ^ 0x76 ^ (0x9B ^ 0x9E) << "   ".length()) << " ".length();
        Main.IllIlIIlll[27] = 70 + 4 - -111 + 2 ^ (0x12 ^ 7) << "   ".length();
        Main.IllIlIIlll[28] = (0x20 ^ 0x25) << (" ".length() << " ".length());
        Main.IllIlIIlll[29] = 0x2F ^ 0x46 ^ (0xD9 ^ 0xC6) << (" ".length() << " ".length());
        Main.IllIlIIlll[30] = (0x29 ^ 0x22) << " ".length();
        Main.IllIlIIlll[31] = 0xFA ^ 0xAB ^ (0xAE ^ 0x8D) << " ".length();
        Main.IllIlIIlll[32] = "   ".length() << "   ".length();
        Main.IllIlIIlll[33] = (0xAD ^ 0xBC) << " ".length() ^ (0x9E ^ 0xA5);
        Main.IllIlIIlll[34] = (0x6B ^ 0x28 ^ (0x27 ^ 0) << " ".length()) << " ".length();
        Main.IllIlIIlll[35] = 0x79 ^ 0x4E;
        Main.IllIlIIlll[36] = (0x5D ^ 8) << " ".length() ^ 153 + 80 - 58 + 2;
        Main.IllIlIIlll[37] = (0x41 ^ 0x46) << (" ".length() << " ".length());
        Main.IllIlIIlll[38] = (0xE ^ 7) << "   ".length();
        Main.IllIlIIlll[39] = (6 + 107 - 83 + 107 ^ (0xDA ^ 0x91) << " ".length()) << " ".length();
        Main.IllIlIIlll[40] = 200 + 129 - 166 + 64 ^ (0x85 ^ 0x8E) << (" ".length() << (" ".length() << " ".length()));
        Main.IllIlIIlll[41] = (0x9F ^ 0x98) << (" ".length() << (" ".length() << " ".length())) ^ (0x6E ^ 0x21);
        Main.IllIlIIlll[42] = -(9 ^ 0);
        Main.IllIlIIlll[43] = (37 + 62 - 11 + 47 ^ (0x78 ^ 0x29) << " ".length()) << " ".length();
        Main.IllIlIIlll[44] = (0x46 ^ 0x55 ^ (0xC7 ^ 0xC0) << " ".length()) << (" ".length() << " ".length());
        Main.IllIlIIlll[45] = (0x93 ^ 0x82) << " ".length() ^ (0x32 ^ 0x47);
        Main.IllIlIIlll[46] = 0x54 ^ 0x49;
        Main.IllIlIIlll[47] = ((0x3D ^ 0x38) << (0x52 ^ 0x57) ^ 101 + 153 - 243 + 164) << " ".length();
        Main.IllIlIIlll[48] = 0x96 ^ 0x89;
        Main.IllIlIIlll[49] = " ".length() << (0xAA ^ 0x8F ^ " ".length() << (0x70 ^ 0x75));
        Main.IllIlIIlll[50] = 0x77 ^ 0x56;
        Main.IllIlIIlll[51] = (0x39 ^ 0x4E ^ (0x59 ^ 0x6A) << " ".length()) << " ".length();
        Main.IllIlIIlll[52] = (0x52 ^ 0x71 ^ (0x85 ^ 0x90) << " ".length()) << (" ".length() << " ".length());
        Main.IllIlIIlll[53] = " ".length() << " ".length() ^ (0x15 ^ 0x32);
        Main.IllIlIIlll[54] = (64 + 103 - 108 + 70 ^ (0xD ^ 0x44) << " ".length()) << " ".length();
        Main.IllIlIIlll[55] = 0x58 ^ 0x7F;
        Main.IllIlIIlll[56] = ((0x37 ^ 0x20) << "   ".length() ^ 67 + 107 - 166 + 127) << " ".length();
        Main.IllIlIIlll[57] = 0x12 ^ 9 ^ (0x1A ^ 0x25) << " ".length();
        Main.IllIlIIlll[58] = (0xB4 ^ 0xB1) << "   ".length();
        Main.IllIlIIlll[59] = 0x5D ^ 0x32;
        Main.IllIlIIlll[60] = "   ".length() << " ".length() ^ (0x55 ^ 0x7A);
        Main.IllIlIIlll[61] = -" ".length();
        Main.IllIlIIlll[62] = (0xD0 ^ 0xC5) << " ".length();
        Main.IllIlIIlll[63] = 0x34 ^ 0x1F;
        Main.IllIlIIlll[64] = (0x9D ^ 0x96) << (" ".length() << " ".length());
        Main.IllIlIIlll[65] = 0x3D ^ 0x10;
        Main.IllIlIIlll[66] = (0xDE ^ 0xAB ^ (0x43 ^ 0x72) << " ".length()) << " ".length();
        Main.IllIlIIlll[67] = 93 + 26 - 85 + 125 ^ (0x40 ^ 0x4B) << (" ".length() << (" ".length() << " ".length()));
        Main.IllIlIIlll[68] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
    }

    private static boolean lllIlIlIlIll(int n, int n2) {
        return n == n2;
    }

    private static boolean IIIllIlIlIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean IlIllIlIlIll(int n, int n2) {
        return n < n2;
    }

    private static boolean llIllIlIlIll(int n, int n2) {
        return n <= n2;
    }

    private static boolean IIlllIlIlIll(int n, int n2) {
        return n > n2;
    }

    private static boolean IllIlIlIlIll(Object object) {
        return object != null;
    }

    private static boolean lIlIlIlIlIll(int n) {
        return n != 0;
    }

    private static boolean lIIllIlIlIll(int n) {
        return n >= 0;
    }
}

