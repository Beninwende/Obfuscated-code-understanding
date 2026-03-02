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

    public Main() {
        Main lllIIlllIIIIlll;
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
    private static int f(int lIIIIlllIIIIlll, int IIIIIlllIIIIlll) {
        void var2_2;
        if (Main.lIlIlIllllIl(Main.llIIIIllllIl(lIIIIlllIIIIlll) ? 1 : 0)) {
            return IlllllIIll[IlIIIIlIll[0]];
        }
        int lllllIllIIIIlll = IlllllIIll[IlIIIIlIll[0]];
        int IllllIllIIIIlll = IlllllIIll[IlIIIIlIll[0]];
        while (Main.lIlIlIllllIl(Main.IIlIIIllllIl(IllllIllIIIIlll, IIIIIlllIIIIlll) ? 1 : 0)) {
            if (Main.lIlIlIllllIl(Main.IIlIIIllllIl(lIIIIlllIIIIlll - IllllIllIIIIlll, IIIIIlllIIIIlll) ? 1 : 0) && Main.lIlIlIllllIl(Main.lIlIIIllllIl(lIIIIlllIIIIlll - IllllIllIIIIlll) ? 1 : 0)) {
                ++lllllIllIIIIlll;
            }
            ++IllllIllIIIIlll;
            llllllIIll[IlIIIIlIll[0]].length();
            "".length();
            if (!Main.IllIlIllllIl(llllllIIll[IlIIIIlIll[1]].length() << (llllllIIll[IlIIIIlIll[2]].length() << llllllIIll[IlIIIIlIll[3]].length()), llllllIIll[IlIIIIlIll[4]].length())) continue;
            return llllllIIll[IlIIIIlIll[5]].length() << (IlIIIIlIll[6] ^ IlIIIIlIll[7]) & (llllllIIll[IlIIIIlIll[8]].length() << (IlIIIIlIll[9] ^ IlIIIIlIll[10]) ^ IlIIIIlIll[11]);
        }
        return (int)var2_2;
    }

    /*
     * WARNING - void declaration
     */
    private static int g(int lIlIlIllIIIIlll, int IIlIlIllIIIIlll) {
        void var2_2;
        int llIIlIllIIIIlll = IlllllIIll[IlIIIIlIll[0]];
        int IlIIlIllIIIIlll = IlllllIIll[IlIIIIlIll[0]];
        while (Main.lIlIlIllllIl(Main.IIlIIIllllIl(IlIIlIllIIIIlll, IIlIlIllIIIIlll) ? 1 : 0)) {
            llIIlIllIIIIlll += Main.f(lIlIlIllIIIIlll - IlIIlIllIIIIlll, IIlIlIllIIIIlll);
            ++IlIIlIllIIIIlll;
            llllllIIll[IlIIIIlIll[12]].length();
            "".length();
            if (!Main.lllIlIllllIl(-llllllIIll[IlIIIIlIll[13]].length())) continue;
            return (IlIIIIlIll[14] ^ IlIIIIlIll[6]) & (IlIIIIlIll[15] ^ IlIIIIlIll[7] ^ IlIIIIlIll[11]);
        }
        return (int)var2_2;
    }

    static {
        Main.IIlIlIllllIl();
        Main.llIIlIllllIl();
        Main.IlIIIIllllIl();
        sc = new FastScanner(System.in);
        writer = new PrintWriter(System.out);
    }

    private static void IlIIIIllllIl() {
        IlllllIIll = new int[IlIIIIlIll[1]];
        Main.IlllllIIll[Main.IlIIIIlIll[0]] = (IlIIIIlIll[16] + IlIIIIlIll[17] - IlIIIIlIll[18] + IlIIIIlIll[19] ^ (IlIIIIlIll[20] ^ IlIIIIlIll[21]) << (llllllIIll[IlIIIIlIll[22]].length() << (llllllIIll[IlIIIIlIll[23]].length() << llllllIIll[IlIIIIlIll[24]].length()))) << (llllllIIll[IlIIIIlIll[25]].length() << llllllIIll[IlIIIIlIll[26]].length()) & ((IlIIIIlIll[27] + IlIIIIlIll[28] - IlIIIIlIll[29] + IlIIIIlIll[30] ^ (IlIIIIlIll[31] ^ IlIIIIlIll[32]) << llllllIIll[IlIIIIlIll[33]].length()) << (llllllIIll[IlIIIIlIll[34]].length() << llllllIIll[IlIIIIlIll[14]].length()) ^ -llllllIIll[IlIIIIlIll[35]].length());
    }

    private static boolean IIlIIIllllIl(int n, int n2) {
        boolean bl;
        if (Main.IIIllIllllIl(n, n2)) {
            bl = IlIIIIlIll[1];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) < 0) {
                return ((0x9F ^ 0xAA) & ~(0x88 ^ 0xBD)) != 0;
            }
        } else {
            bl = IlIIIIlIll[0];
        }
        return bl;
    }

    private static boolean lIlIIIllllIl(int n) {
        boolean bl;
        if (Main.lllIlIllllIl(n)) {
            bl = IlIIIIlIll[1];
            "".length();
            if ((((0x76 ^ 0x6B) << (" ".length() << " ".length()) ^ (0xE5 ^ 0xBA)) << " ".length() & (((0x45 ^ 0x4A) << (" ".length() << " ".length()) ^ (0x88 ^ 0x9F)) << " ".length() ^ -" ".length())) > " ".length()) {
                return ((0x9E ^ 0xC5 ^ (0x64 ^ 0x55) << " ".length()) & ((0x25 ^ 8) << " ".length() ^ (0x20 ^ 0x43) ^ -" ".length())) != 0;
            }
        } else {
            bl = IlIIIIlIll[0];
        }
        return bl;
    }

    private static boolean llIIIIllllIl(int n) {
        boolean bl;
        if (Main.lIIllIllllIl(n)) {
            bl = IlIIIIlIll[1];
            "".length();
            if (" ".length() << " ".length() == 0) {
                return ((0xCC ^ 0xA9 ^ (0x41 ^ 0x4A) << (" ".length() << " ".length())) & (0x37 ^ 4 ^ (0x9B ^ 0xA6) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = IlIIIIlIll[0];
        }
        return bl;
    }

    private static void llIIlIllllIl() {
        llllllIIll = new String[IlIIIIlIll[9]];
        Main.llllllIIll[Main.IlIIIIlIll[0]] = Main.IllIIIllllIl("", "dDOhh");
        Main.llllllIIll[Main.IlIIIIlIll[1]] = Main.lllIIIllllIl("yHj8ukL9rTw=", "CBbbA");
        Main.llllllIIll[Main.IlIIIIlIll[2]] = Main.IllIIIllllIl("eg==", "ZIrlt");
        Main.llllllIIll[Main.IlIIIIlIll[3]] = Main.IllIIIllllIl("Wg==", "zzVPK");
        Main.llllllIIll[Main.IlIIIIlIll[4]] = Main.lllIIIllllIl("3+c2o8dwUlQ=", "ADdYu");
        Main.llllllIIll[Main.IlIIIIlIll[5]] = Main.lllIIIllllIl("Nwary7mt1Pg=", "pqZTU");
        Main.llllllIIll[Main.IlIIIIlIll[8]] = Main.IIIlIIllllIl("GEzmoipVYGI=", "szYjB");
        Main.llllllIIll[Main.IlIIIIlIll[12]] = Main.lllIIIllllIl("+/MMj+3/BCc=", "SnUIZ");
        Main.llllllIIll[Main.IlIIIIlIll[13]] = Main.IIIlIIllllIl("VeWmp3t/FjY=", "kPeoE");
        Main.llllllIIll[Main.IlIIIIlIll[22]] = Main.lllIIIllllIl("jlhUUXkxdzg=", "SMMXM");
        Main.llllllIIll[Main.IlIIIIlIll[23]] = Main.IIIlIIllllIl("8DV9FxgueF8=", "XcdBA");
        Main.llllllIIll[Main.IlIIIIlIll[24]] = Main.lllIIIllllIl("207CmQ13NOk=", "EYASM");
        Main.llllllIIll[Main.IlIIIIlIll[25]] = Main.lllIIIllllIl("uXJ/U0aDdG4=", "Opezc");
        Main.llllllIIll[Main.IlIIIIlIll[26]] = Main.IllIIIllllIl("Uw==", "sTzTQ");
        Main.llllllIIll[Main.IlIIIIlIll[33]] = Main.IllIIIllllIl("bQ==", "MyCPH");
        Main.llllllIIll[Main.IlIIIIlIll[34]] = Main.IIIlIIllllIl("CDIYFsLd9Hc=", "IJvzI");
        Main.llllllIIll[Main.IlIIIIlIll[14]] = Main.IIIlIIllllIl("sLv5CANXZ3E=", "dSOVy");
        Main.llllllIIll[Main.IlIIIIlIll[35]] = Main.lllIIIllllIl("9fryB6rTLAM=", "nplqk");
    }

    private static String lllIIIllllIl(String lIllllIlIIIIlll, String IIllllIlIIIIlll) {
        try {
            SecretKeySpec llIlllIlIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIllllIlIIIIlll.getBytes(StandardCharsets.UTF_8)), IlIIIIlIll[13]), "DES");
            Cipher IlIlllIlIIIIlll = Cipher.getInstance("DES");
            IlIlllIlIIIIlll.init(IlIIIIlIll[2], llIlllIlIIIIlll);
            return new String(IlIlllIlIIIIlll.doFinal(Base64.getDecoder().decode(lIllllIlIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlllIlIIIIlll) {
            lIIlllIlIIIIlll.printStackTrace();
            return null;
        }
    }

    private static String IIIlIIllllIl(String IIIIllIlIIIIlll, String llllIlIlIIIIlll) {
        try {
            SecretKeySpec IlllIlIlIIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIlIlIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIlIlIIIIlll = Cipher.getInstance("Blowfish");
            lIllIlIlIIIIlll.init(IlIIIIlIll[2], IlllIlIlIIIIlll);
            return new String(lIllIlIlIIIIlll.doFinal(Base64.getDecoder().decode(IIIIllIlIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIllIlIlIIIIlll) {
            IIllIlIlIIIIlll.printStackTrace();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String IllIIIllllIl(String IllllIIlIIIIlll, String lIlllIIlIIIIlll) {
        IllllIIlIIIIlll = new String(Base64.getDecoder().decode(IllllIIlIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        IIlllIIlIIIIlll = new StringBuilder();
        llIllIIlIIIIlll = lIlllIIlIIIIlll.toCharArray();
        IlIllIIlIIIIlll = Main.IlIIIIlIll[0];
        IIIIlIIlIIIIlll = IllllIIlIIIIlll.toCharArray();
        lIIIlIIlIIIIlll = IIIIlIIlIIIIlll.length;
        IlIIlIIlIIIIlll = Main.IlIIIIlIll[0];
        "".length();
        if (" ".length() << (" ".length() << " ".length()) >= 0) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            lIIllIIlIIIIlll = IIIIlIIlIIIIlll[IlIIlIIlIIIIlll];
            IIlllIIlIIIIlll.append((char)(lIIllIIlIIIIlll ^ llIllIIlIIIIlll[IlIllIIlIIIIlll % llIllIIlIIIIlll.length]));
            "".length();
            ++IlIllIIlIIIIlll;
            ++IlIIlIIlIIIIlll;
lbl19:
            // 2 sources

            ** while (!Main.IlIllIllllIl((int)IlIIlIIlIIIIlll, (int)lIIIlIIlIIIIlll))
        }
lbl20:
        // 1 sources

        return String.valueOf(IIlllIIlIIIIlll);
    }

    private static void IIlIlIllllIl() {
        IlIIIIlIll = new int[36];
        Main.IlIIIIlIll[0] = (0x48 ^ 0x67 ^ (0x12 ^ 0x15) << " ".length()) & (3 ^ 0x56 ^ (0x32 ^ 0x2F) << (" ".length() << " ".length()) ^ -" ".length());
        Main.IlIIIIlIll[1] = " ".length();
        Main.IlIIIIlIll[2] = " ".length() << " ".length();
        Main.IlIIIIlIll[3] = "   ".length();
        Main.IlIIIIlIll[4] = " ".length() << (" ".length() << " ".length());
        Main.IlIIIIlIll[5] = 0x18 ^ 0x1D;
        Main.IlIIIIlIll[6] = 0x9A ^ 0xAF;
        Main.IlIIIIlIll[7] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        Main.IlIIIIlIll[8] = "   ".length() << " ".length();
        Main.IlIIIIlIll[9] = (0xCB ^ 0xC2) << " ".length();
        Main.IlIIIIlIll[10] = 0x66 ^ 0x71;
        Main.IlIIIIlIll[11] = -" ".length();
        Main.IlIIIIlIll[12] = 0xC7 ^ 0xC0;
        Main.IlIIIIlIll[13] = " ".length() << "   ".length();
        Main.IlIIIIlIll[14] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        Main.IlIIIIlIll[15] = (0x5C ^ 0x5B) << (" ".length() << " ".length()) ^ (0x5B ^ 0x52);
        Main.IlIIIIlIll[16] = (0x4E ^ 0xF) << " ".length();
        Main.IlIIIIlIll[17] = (0xAF ^ 0x90) << " ".length();
        Main.IlIIIIlIll[18] = ((0x6B ^ 0x2E) << " ".length() ^ 46 + 41 - -99 + 11) << " ".length();
        Main.IlIIIIlIll[19] = 205 + 171 - 261 + 136 ^ (0xA0 ^ 0xB5) << "   ".length();
        Main.IlIIIIlIll[20] = 0x26 ^ 0x19;
        Main.IlIIIIlIll[21] = ("   ".length() ^ (1 ^ 6) << " ".length()) << (" ".length() << " ".length());
        Main.IlIIIIlIll[22] = 0xA ^ 3;
        Main.IlIIIIlIll[23] = (137 + 105 - 117 + 22 ^ (0x30 ^ 0x7B) << " ".length()) << " ".length();
        Main.IlIIIIlIll[24] = 0x2E ^ 0x25;
        Main.IlIIIIlIll[25] = "   ".length() << (" ".length() << " ".length());
        Main.IlIIIIlIll[26] = (0xD9 ^ 0x82) & ~(0xF7 ^ 0xAC) ^ (0x6D ^ 0x60);
        Main.IlIIIIlIll[27] = "   ".length() << (0x18 ^ 0x1D);
        Main.IlIIIIlIll[28] = 126 + 11 - 36 + 54 + ((0x18 ^ 0xF) << " ".length()) - ((0 ^ 0x2B) << (" ".length() << " ".length())) + ((0xE4 ^ 0xAD) << " ".length());
        Main.IlIIIIlIll[29] = 23 + 24 - -99 + 69 + (0x5F ^ 0x32) - (178 + 65 - 18 + 54) + ((0x70 ^ 0x1F) << " ".length());
        Main.IlIIIIlIll[30] = 51 + 184 - 192 + 148;
        Main.IlIIIIlIll[31] = 0x45 ^ 0;
        Main.IlIIIIlIll[32] = (0x18 ^ 0x39 ^ (0x9D ^ 0x84) << " ".length()) << " ".length();
        Main.IlIIIIlIll[33] = ((0 ^ 0x15) << "   ".length() ^ 16 + 42 - -95 + 22) << " ".length();
        Main.IlIIIIlIll[34] = (0x56 ^ 0x4B) << (" ".length() << " ".length()) ^ (0x6E ^ 0x15);
        Main.IlIIIIlIll[35] = 0x59 ^ 0x2E ^ (0x16 ^ 0x25) << " ".length();
    }

    private static boolean IlIllIllllIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IllIlIllllIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IIIllIllllIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean lIlIlIllllIl(int n) {
        return n != 0;
    }

    private static boolean lllIlIllllIl(int n) {
        return n >= 0;
    }

    private static boolean lIIllIllllIl(int n) {
        return n < 0;
    }

    static class FastScanner {
        Reader input;
        private static String[] IIIIIIlIll;
        private static int[] lIIIIIlIll;

        FastScanner() {
            llIlllIIlIIIlll(System.in);
            FastScanner llIlllIIlIIIlll;
        }

        FastScanner(InputStream lllIllIIlIIIlll) {
            FastScanner IIIlllIIlIIIlll;
            IIIlllIIlIIIlll.input = new BufferedReader(new InputStreamReader(lllIllIIlIIIlll));
        }

        int nextInt() {
            FastScanner lIlIllIIlIIIlll;
            return (int)lIlIllIIlIIIlll.nextLong();
        }

        long nextLong() {
            try {
                FastScanner IIIIllIIlIIIlll;
                int llllIlIIlIIIlll = lIIIIIlIll[0];
                int IlllIlIIlIIIlll = IIIIllIIlIIIlll.input.read();
                while ((!FastScanner.IIllIIllllIl(IlllIlIIlIIIlll, lIIIIIlIll[1]) || FastScanner.lIllIIllllIl(lIIIIIlIll[2], IlllIlIIlIIIlll)) && FastScanner.IlllIIllllIl(IlllIlIIlIIIlll, lIIIIIlIll[3]) && FastScanner.IlllIIllllIl(IlllIlIIlIIIlll, lIIIIIlIll[4])) {
                    IlllIlIIlIIIlll = IIIIllIIlIIIlll.input.read();
                    "".length();
                    if (-(0x22 ^ 0x26) <= 0) continue;
                    return 0L;
                }
                if (FastScanner.llllIIllllIl(IlllIlIIlIIIlll, lIIIIIlIll[3])) {
                    llllIlIIlIIIlll = lIIIIIlIll[5];
                    IlllIlIIlIIIlll = IIIIllIIlIIIlll.input.read();
                    "".length();
                    if (-" ".length() > " ".length()) {
                        return 0L;
                    }
                } else if (FastScanner.llllIIllllIl(IlllIlIIlIIIlll, lIIIIIlIll[4])) {
                    IlllIlIIlIIIlll = IIIIllIIlIIIlll.input.read();
                }
                long lIllIlIIlIIIlll = IlllIlIIlIIIlll - lIIIIIlIll[1];
                do {
                    if (!FastScanner.IIllIIllllIl(IlllIlIIlIIIlll = IIIIllIIlIIIlll.input.read(), lIIIIIlIll[1]) || FastScanner.lIllIIllllIl(lIIIIIlIll[2], IlllIlIIlIIIlll)) {
                        return lIllIlIIlIIIlll * (long)llllIlIIlIIIlll;
                    }
                    lIllIlIIlIIIlll *= 10L;
                    lIllIlIIlIIIlll += (long)(IlllIlIIlIIIlll - lIIIIIlIll[1]);
                    "".length();
                } while (null == null);
                return 0L;
            }
            catch (IOException llllIlIIlIIIlll) {
                llllIlIIlIIIlll.printStackTrace();
                return -1L;
            }
        }

        double nextDouble() {
            try {
                FastScanner lllIIlIIlIIIlll;
                double IllIIlIIlIIIlll = 1.0;
                int lIlIIlIIlIIIlll = lllIIlIIlIIIlll.input.read();
                while ((!FastScanner.IIllIIllllIl(lIlIIlIIlIIIlll, lIIIIIlIll[1]) || FastScanner.lIllIIllllIl(lIIIIIlIll[2], lIlIIlIIlIIIlll)) && FastScanner.IlllIIllllIl(lIlIIlIIlIIIlll, lIIIIIlIll[3]) && FastScanner.IlllIIllllIl(lIlIIlIIlIIIlll, lIIIIIlIll[4])) {
                    lIlIIlIIlIIIlll = lllIIlIIlIIIlll.input.read();
                    "".length();
                    if ((((0xB7 ^ 0xB2) << (" ".length() << " ".length()) ^ (0xDD ^ 0x84)) & (0x9B ^ 0xC4 ^ (0x43 ^ 0x4A) << " ".length() ^ -" ".length())) == 0) continue;
                    return 0.0;
                }
                if (FastScanner.llllIIllllIl(lIlIIlIIlIIIlll, lIIIIIlIll[3])) {
                    IllIIlIIlIIIlll = -1.0;
                    lIlIIlIIlIIIlll = lllIIlIIlIIIlll.input.read();
                    "".length();
                    if (-" ".length() > " ".length()) {
                        return 0.0;
                    }
                } else if (FastScanner.llllIIllllIl(lIlIIlIIlIIIlll, lIIIIIlIll[4])) {
                    lIlIIlIIlIIIlll = lllIIlIIlIIIlll.input.read();
                }
                double IIlIIlIIlIIIlll = lIlIIlIIlIIIlll - lIIIIIlIll[1];
                while (FastScanner.IIllIIllllIl(lIlIIlIIlIIIlll = lllIIlIIlIIIlll.input.read(), lIIIIIlIll[1])) {
                    if (FastScanner.lIllIIllllIl(lIIIIIlIll[2], lIlIIlIIlIIIlll)) {
                        "".length();
                        if (" ".length() << " ".length() >= -" ".length()) break;
                        return 0.0;
                    }
                    IIlIIlIIlIIIlll *= 10.0;
                    IIlIIlIIlIIIlll += (double)(lIlIIlIIlIIIlll - lIIIIIlIll[1]);
                    "".length();
                    if ("   ".length() != " ".length() << (" ".length() << " ".length())) continue;
                    return 0.0;
                }
                if (FastScanner.IlllIIllllIl(lIlIIlIIlIIIlll, lIIIIIlIll[6])) {
                    return IllIIlIIlIIIlll * IIlIIlIIlIIIlll;
                }
                double llIIIlIIlIIIlll = 1.0;
                lIlIIlIIlIIIlll = lllIIlIIlIIIlll.input.read();
                while (FastScanner.IIIIlIllllIl(lIIIIIlIll[1], lIlIIlIIlIIIlll) && FastScanner.IIIIlIllllIl(lIlIIlIIlIIIlll, lIIIIIlIll[2])) {
                    IIlIIlIIlIIIlll *= 10.0;
                    IIlIIlIIlIIIlll += (double)(lIlIIlIIlIIIlll - lIIIIIlIll[1]);
                    llIIIlIIlIIIlll *= 10.0;
                    lIlIIlIIlIIIlll = lllIIlIIlIIIlll.input.read();
                    "".length();
                    if ((((0x4E ^ 0x43) << (" ".length() << " ".length()) ^ (7 ^ 0x3C)) << (" ".length() << " ".length()) & ((8 + 45 - 49 + 129 ^ (0xE0 ^ 0xA5) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length())) == 0) continue;
                    return 0.0;
                }
                return IllIIlIIlIIIlll * IIlIIlIIlIIIlll / llIIIlIIlIIIlll;
            }
            catch (IOException IllIIlIIlIIIlll) {
                IllIIlIIlIIIlll.printStackTrace();
                return Double.NaN;
            }
        }

        char nextChar() {
            try {
                FastScanner IIIIIlIIlIIIlll;
                int lllllIIIlIIIlll = IIIIIlIIlIIIlll.input.read();
                while (FastScanner.lIIIlIllllIl(Character.isWhitespace(lllllIIIlIIIlll) ? 1 : 0)) {
                    lllllIIIlIIIlll = IIIIIlIIlIIIlll.input.read();
                    "".length();
                    if (" ".length() != "   ".length()) continue;
                    return (char)(((0x1E ^ 0x5D) << " ".length() ^ 55 + 2 - 29 + 165) & (0xD5 ^ 0xB4 ^ (0x3C ^ 0x2F) << " ".length() ^ -" ".length()));
                }
                return (char)lllllIIIlIIIlll;
            }
            catch (IOException lllllIIIlIIIlll) {
                lllllIIIlIIIlll.printStackTrace();
                return lIIIIIlIll[7];
            }
        }

        String nextStr() {
            try {
                FastScanner llIllIIIlIIIlll;
                StringBuilder IlIllIIIlIIIlll = new StringBuilder();
                int lIIllIIIlIIIlll = llIllIIIlIIIlll.input.read();
                while (FastScanner.lIIIlIllllIl(Character.isWhitespace(lIIllIIIlIIIlll) ? 1 : 0)) {
                    lIIllIIIlIIIlll = llIllIIIlIIIlll.input.read();
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) > " ".length() << " ".length()) continue;
                    return null;
                }
                while (FastScanner.IlllIIllllIl(lIIllIIIlIIIlll, lIIIIIlIll[5]) && FastScanner.IlIIlIllllIl(Character.isWhitespace(lIIllIIIlIIIlll) ? 1 : 0)) {
                    IlIllIIIlIIIlll.append((char)lIIllIIIlIIIlll);
                    "".length();
                    lIIllIIIlIIIlll = llIllIIIlIIIlll.input.read();
                    "".length();
                    if (" ".length() < "   ".length()) continue;
                    return null;
                }
                return String.valueOf(IlIllIIIlIIIlll);
            }
            catch (IOException IlIllIIIlIIIlll) {
                IlIllIIIlIIIlll.printStackTrace();
                return IIIIIIlIll[lIIIIIlIll[7]];
            }
        }

        static {
            FastScanner.llIlIIllllIl();
            FastScanner.IlIlIIllllIl();
        }

        private static void IlIlIIllllIl() {
            IIIIIIlIll = new String[lIIIIIlIll[0]];
            FastScanner.IIIIIIlIll[FastScanner.lIIIIIlIll[7]] = FastScanner.lIIlIIllllIl("", "mzYuI");
        }

        /*
         * Unable to fully structure code
         */
        private static String lIIlIIllllIl(String llllIIIIlIIIlll, String IlllIIIIlIIIlll) {
            llllIIIIlIIIlll = new String(Base64.getDecoder().decode(llllIIIIlIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            lIllIIIIlIIIlll = new StringBuilder();
            IIllIIIIlIIIlll = IlllIIIIlIIIlll.toCharArray();
            llIlIIIIlIIIlll = FastScanner.lIIIIIlIll[7];
            lIIIIIIIlIIIlll = llllIIIIlIIIlll.toCharArray();
            IlIIIIIIlIIIlll = lIIIIIIIlIIIlll.length;
            llIIIIIIlIIIlll = FastScanner.lIIIIIlIll[7];
            "".length();
            if (" ".length() != 0) ** GOTO lbl19
            return null;
lbl-1000:
            // 1 sources

            {
                IlIlIIIIlIIIlll = lIIIIIIIlIIIlll[llIIIIIIlIIIlll];
                lIllIIIIlIIIlll.append((char)(IlIlIIIIlIIIlll ^ IIllIIIIlIIIlll[llIlIIIIlIIIlll % IIllIIIIlIIIlll.length]));
                "".length();
                ++llIlIIIIlIIIlll;
                ++llIIIIIIlIIIlll;
lbl19:
                // 2 sources

                ** while (!FastScanner.IIllIIllllIl((int)llIIIIIIlIIIlll, (int)IlIIIIIIlIIIlll))
            }
lbl20:
            // 1 sources

            return String.valueOf(lIllIIIIlIIIlll);
        }

        private static void llIlIIllllIl() {
            lIIIIIlIll = new int[8];
            FastScanner.lIIIIIlIll[0] = " ".length();
            FastScanner.lIIIIIlIll[1] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
            FastScanner.lIIIIIlIll[2] = 0x3C ^ 5;
            FastScanner.lIIIIIlIll[3] = 0x75 ^ 0x58;
            FastScanner.lIIIIIlIll[4] = 0x69 ^ 0x42 ^ (0xAF ^ 0xA2) << (" ".length() << " ".length()) & ~((0xCC ^ 0xC1) << (" ".length() << " ".length()));
            FastScanner.lIIIIIlIll[5] = -" ".length();
            FastScanner.lIIIIIlIll[6] = (21 + 165 - 69 + 96 ^ (0x57 ^ 0x36) << " ".length()) << " ".length();
            FastScanner.lIIIIIlIll[7] = (0x1C ^ 0xF ^ (0x9B ^ 0x88) << " ".length()) & (0x29 ^ 0x58 ^ (0xB8 ^ 0xA9) << (" ".length() << " ".length()) ^ -" ".length());
        }

        private static boolean llllIIllllIl(int n, int n2) {
            return n == n2;
        }

        private static boolean IIllIIllllIl(int n, int n2) {
            return n >= n2;
        }

        private static boolean lIllIIllllIl(int n, int n2) {
            return n < n2;
        }

        private static boolean IIIIlIllllIl(int n, int n2) {
            return n <= n2;
        }

        private static boolean lIIIlIllllIl(int n) {
            return n != 0;
        }

        private static boolean IlIIlIllllIl(int n) {
            return n == 0;
        }

        private static boolean IlllIIllllIl(int n, int n2) {
            return n != n2;
        }
    }
}

