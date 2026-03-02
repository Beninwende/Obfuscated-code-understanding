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

    public InputReader(InputStream lIIllllllIIllIl) {
        super(new InputStreamReader(lIIllllllIIllIl), IllIIl[IIIIll[IIlIll[0]]]);
        InputReader IlIllllllIIllIl;
    }

    public InputReader(String lIIIlllllIIllIl) {
        super(new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream(lIIIlllllIIllIl)));
        InputReader IlIIlllllIIllIl;
    }

    public String next() {
        InputReader IlIlIllllIIllIl;
        while (!InputReader.IIIIIIIl(InputReader.IIlIlll(InputReader.lIllIll(IlIlIllllIIllIl.tokenizer) ? 1 : 0) ? 1 : 0) || InputReader.IIIIIIIl(InputReader.IIlIlll(InputReader.IlllIll(IlIlIllllIIllIl.tokenizer.hasMoreTokens() ? 1 : 0) ? 1 : 0) ? 1 : 0)) {
            try {
                IlIlIllllIIllIl.tokenizer = new StringTokenizer(IlIlIllllIIllIl.readLine());
                lIIlIl[IIIIll[IIlIll[0]]].length();
                "".length();
            }
            catch (IOException lIIlIllllIIllIl) {
                throw new RuntimeException();
            }
            if (!InputReader.IIIIIIIl(InputReader.lIlIlll(lIIlIl[IIIIll[IIlIll[1]]].length() << lIIlIl[IIIIll[IIlIll[2]]].length()) ? 1 : 0)) continue;
            return null;
        }
        return this.tokenizer.nextToken();
    }

    public Integer nextInt() {
        InputReader llIIIllllIIllIl;
        return Integer.valueOf(llIIIllllIIllIl.next());
    }

    public Long nextLong() {
        InputReader lllllIlllIIllIl;
        return Long.valueOf(lllllIlllIIllIl.next());
    }

    static {
        InputReader.lllllll();
        InputReader.IIIllll();
        InputReader.llIIlll();
        InputReader.IIllIll();
    }

    private static void IIllIll() {
        IllIIl = new int[IIIIll[IIlIll[1]]];
        InputReader.IllIIl[InputReader.IIIIll[InputReader.IIlIll[0]]] = lIIlIl[IIIIll[IIlIll[3]]].length() << ((IIIIll[IIlIll[4]] ^ IIIIll[IIlIll[5]]) << lIIlIl[IIIIll[IIlIll[6]]].length() ^ IIIIll[IIlIll[7]] + IIIIll[IIlIll[8]] - IIIIll[IIlIll[9]] + IIIIll[IIlIll[10]]);
    }

    private static boolean lIllIll(Object object) {
        boolean bl;
        if (InputReader.IIIIIIIl(InputReader.IllIlll(object) ? 1 : 0)) {
            bl = IIIIll[IIlIll[1]];
            "".length();
            "".length();
            if (InputReader.lIIIIIIl(-"  ".length())) {
                return ((IIlIll[11] + IIlIll[12] - IIlIll[13] + IIlIll[14] ^ (IIlIll[15] ^ IIlIll[16]) << (" ".length() << " ".length())) << (" ".length() << " ".length()) & (((IIlIll[1] ^ IIlIll[17]) << " ".length() ^ (IIlIll[18] ^ IIlIll[19])) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
            }
        } else {
            bl = IIIIll[IIlIll[0]];
        }
        return bl;
    }

    private static boolean IlllIll(int n) {
        boolean bl;
        if (InputReader.IIIIIIIl(InputReader.lIlIlll(n) ? 1 : 0)) {
            bl = IIIIll[IIlIll[1]];
            "".length();
            "".length();
            if (InputReader.IlIIIIIl(-"  ".length())) {
                return (" ".length() << " ".length() & (" ".length() << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = IIIIll[IIlIll[0]];
        }
        return bl;
    }

    private static void llIIlll() {
        IIIIll = new int[IIlIll[20]];
        InputReader.IIIIll[InputReader.IIlIll[0]] = ((IIlIll[21] ^ IIlIll[22]) << (" ".length() << " ".length()) ^ IIlIll[23] + IIlIll[9] - IIlIll[24] + IIlIll[25]) << "   ".length() & ((IIlIll[26] + IIlIll[27] - IIlIll[28] + IIlIll[29] ^ (IIlIll[30] ^ IIlIll[0]) << " ".length()) << "   ".length() ^ -" ".length());
        InputReader.IIIIll[InputReader.IIlIll[1]] = " ".length();
        InputReader.IIIIll[InputReader.IIlIll[2]] = " ".length() << " ".length();
        InputReader.IIIIll[InputReader.IIlIll[3]] = "   ".length();
        InputReader.IIIIll[InputReader.IIlIll[4]] = (IIlIll[11] ^ IIlIll[31]) << (" ".length() << " ".length());
        InputReader.IIIIll[InputReader.IIlIll[5]] = IIlIll[32] ^ IIlIll[33];
        InputReader.IIIIll[InputReader.IIlIll[6]] = " ".length() << (" ".length() << " ".length());
        InputReader.IIIIll[InputReader.IIlIll[7]] = (IIlIll[34] ^ IIlIll[35] ^ (IIlIll[36] ^ IIlIll[37]) << " ".length()) << (" ".length() << " ".length());
        InputReader.IIIIll[InputReader.IIlIll[8]] = ((IIlIll[38] ^ IIlIll[39]) << " ".length() ^ "   ".length()) << " ".length();
        InputReader.IIIIll[InputReader.IIlIll[9]] = ((IIlIll[40] ^ IIlIll[41]) << "   ".length() ^ (IIlIll[36] ^ IIlIll[42])) << (" ".length() << " ".length());
        InputReader.IIIIll[InputReader.IIlIll[10]] = IIlIll[43] ^ IIlIll[44];
    }

    private static boolean IllIlll(Object object) {
        boolean bl;
        if (InputReader.llIIIIIl(object)) {
            bl = IIlIll[1];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) != " ".length() << (" ".length() << " ".length())) {
                return ((124 + 134 - 190 + 111 ^ (0x19 ^ 0x42) << " ".length()) << " ".length() & (((0x3C ^ 0x15) << (" ".length() << " ".length()) ^ 111 + 153 - 169 + 66) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = IIlIll[0];
        }
        return bl;
    }

    private static boolean IIlIlll(int n) {
        boolean bl;
        if (InputReader.IIIIIIIl(n)) {
            bl = IIlIll[1];
            "".length();
            if ("   ".length() <= 0) {
                return ((112 + 117 - 119 + 27 ^ (0x25 ^ 2) << (" ".length() << " ".length())) << " ".length() & (((0x78 ^ 0x73) << " ".length() ^ "   ".length()) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = IIlIll[0];
        }
        return bl;
    }

    private static boolean lIlIlll(int n) {
        boolean bl;
        if (InputReader.IIlIIIIl(n)) {
            bl = IIlIll[1];
            "".length();
            if ((104 + 96 - 102 + 33 ^ (0x19 ^ 0x5A) << " ".length()) == 0) {
                return ((63 + 54 - 5 + 45 ^ (0x4D ^ 0x66) << (" ".length() << " ".length())) & ((0xA8 ^ 0x87) << (" ".length() << " ".length()) ^ 26 + 41 - -27 + 47 ^ -" ".length())) != 0;
            }
        } else {
            bl = IIlIll[0];
        }
        return bl;
    }

    private static void IIIllll() {
        lIIlIl = new String[IIlIll[5]];
        InputReader.lIIlIl[InputReader.IIlIll[0]] = InputReader.llllIll("0y01X+jw/hU=", "meiCY");
        InputReader.lIIlIl[InputReader.IIlIll[1]] = InputReader.llllIll("aDFDyn0goIA=", "toRLb");
        InputReader.lIIlIl[InputReader.IIlIll[2]] = InputReader.lIIIlll("Zw==", "GJzGA");
        InputReader.lIIlIl[InputReader.IIlIll[3]] = InputReader.IlIIlll("+2xDl/A4CFk=", "Mrhbv");
        InputReader.lIIlIl[InputReader.IIlIll[4]] = InputReader.llllIll("nuOcSD3VAnU=", "PzvGp");
    }

    private static String llllIll(String lllIIIlllIIllIl, String IllIIIlllIIllIl) {
        try {
            SecretKeySpec lIlIIIlllIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IllIIIlllIIllIl.getBytes(StandardCharsets.UTF_8)), IIlIll[8]), "DES");
            Cipher IIlIIIlllIIllIl = Cipher.getInstance("DES");
            IIlIIIlllIIllIl.init(IIlIll[2], lIlIIIlllIIllIl);
            return new String(IIlIIIlllIIllIl.doFinal(Base64.getDecoder().decode(lllIIIlllIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIIlllIIllIl) {
            llIIIIlllIIllIl.printStackTrace();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String lIIIlll(String lIlIllIllIIllIl, String IIlIllIllIIllIl) {
        lIlIllIllIIllIl = new String(Base64.getDecoder().decode(lIlIllIllIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        llIIllIllIIllIl = new StringBuilder();
        IlIIllIllIIllIl = IIlIllIllIIllIl.toCharArray();
        lIIIllIllIIllIl = InputReader.IIlIll[0];
        lllIIlIllIIllIl = lIlIllIllIIllIl.toCharArray();
        IIIlIlIllIIllIl = lllIIlIllIIllIl.length;
        lIIlIlIllIIllIl = InputReader.IIlIll[0];
        "".length();
        if (" ".length() != " ".length() << " ".length()) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            IIIIllIllIIllIl = lllIIlIllIIllIl[lIIlIlIllIIllIl];
            llIIllIllIIllIl.append((char)(IIIIllIllIIllIl ^ IlIIllIllIIllIl[lIIIllIllIIllIl % IlIIllIllIIllIl.length]));
            "".length();
            ++lIIIllIllIIllIl;
            ++lIIlIlIllIIllIl;
lbl19:
            // 2 sources

            ** while (!InputReader.lIlIIIIl((int)lIIlIlIllIIllIl, (int)IIIlIlIllIIllIl))
        }
lbl20:
        // 1 sources

        return String.valueOf(llIIllIllIIllIl);
    }

    private static String IlIIlll(String IlIIIlIllIIllIl, String lIIIIlIllIIllIl) {
        try {
            SecretKeySpec IIIIIlIllIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIlIllIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllIIllIIllIl = Cipher.getInstance("Blowfish");
            lllllIIllIIllIl.init(IIlIll[2], IIIIIlIllIIllIl);
            return new String(lllllIIllIIllIl.doFinal(Base64.getDecoder().decode(IlIIIlIllIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllllIIllIIllIl) {
            IllllIIllIIllIl.printStackTrace();
            return null;
        }
    }

    private static void lllllll() {
        IIlIll = new int[45];
        InputReader.IIlIll[0] = ((0x5A ^ 0x7D) << " ".length() ^ (0x87 ^ 0x82)) & ((0x14 ^ 0x79) << " ".length() ^ 98 + 9 - 14 + 52 ^ -" ".length());
        InputReader.IIlIll[1] = " ".length();
        InputReader.IIlIll[2] = " ".length() << " ".length();
        InputReader.IIlIll[3] = "   ".length();
        InputReader.IIlIll[4] = " ".length() << (" ".length() << " ".length());
        InputReader.IIlIll[5] = 0x52 ^ 0x57;
        InputReader.IIlIll[6] = "   ".length() << " ".length();
        InputReader.IIlIll[7] = (0x4E ^ 0x63) << " ".length() ^ (0xDE ^ 0x83);
        InputReader.IIlIll[8] = " ".length() << "   ".length();
        InputReader.IIlIll[9] = 0x7A ^ 0x73;
        InputReader.IIlIll[10] = ((0x59 ^ 0x1E) << " ".length() ^ 29 + 51 - -13 + 46) << " ".length();
        InputReader.IIlIll[11] = (0x7B ^ 0x58) << (" ".length() << " ".length());
        InputReader.IIlIll[12] = (0x8E ^ 0xB5 ^ (0xA9 ^ 0xB2) << " ".length()) << (" ".length() << " ".length());
        InputReader.IIlIll[13] = (0xD4 ^ 0x99) << " ".length();
        InputReader.IIlIll[14] = ((0x90 ^ 0x81) << (" ".length() << " ".length())) + ((0xFC ^ 0xBF) << " ".length()) - ((0x70 ^ 0x6B) << (" ".length() << " ".length())) + (0x60 ^ 0x4F);
        InputReader.IIlIll[15] = " ".length() << (" ".length() << (" ".length() << " ".length()));
        InputReader.IIlIll[16] = 0x8F ^ 0xB6;
        InputReader.IIlIll[17] = (0xE2 ^ 0x87 ^ (0x3E ^ 0x39) << (" ".length() << (" ".length() << " ".length()))) << " ".length();
        InputReader.IIlIll[18] = (0xB5 ^ 0xBC) << (" ".length() << " ".length());
        InputReader.IIlIll[19] = 30 + 22 - -84 + 97 ^ (0x1A ^ 0x39) << (" ".length() << " ".length());
        InputReader.IIlIll[20] = 0x8C ^ 0x87;
        InputReader.IIlIll[21] = ((0x9F ^ 0x96) << " ".length() ^ (0x3C ^ 0x71)) << " ".length();
        InputReader.IIlIll[22] = ((0xBF ^ 0xA4) << " ".length()) + (0x66 ^ 1) - (0x3E ^ 0x4F) + (0x35 ^ 0x42);
        InputReader.IIlIll[23] = (0x36 ^ 0xF) << (" ".length() << " ".length()) ^ 129 + 110 - 176 + 80;
        InputReader.IIlIll[24] = 0xC7 ^ 0xA8;
        InputReader.IIlIll[25] = ((0x7A ^ 0x7D) << " ".length() ^ (0x9C ^ 0xAF)) << " ".length();
        InputReader.IIlIll[26] = (0x85 ^ 0x80) << (0x92 ^ 0x97);
        InputReader.IIlIll[27] = (0x3C ^ 0x7F) << " ".length();
        InputReader.IIlIll[28] = (0xC1 ^ 0x86) + ((0x3F ^ 0x20) << (" ".length() << " ".length())) - (0x1E ^ 0x3B) + (0xD3 ^ 0xC0);
        InputReader.IIlIll[29] = (161 + 117 - 136 + 59 ^ (0xC4 ^ 0xA7) << " ".length()) << (" ".length() << " ".length());
        InputReader.IIlIll[30] = 0xE4 ^ 0xB9;
        InputReader.IIlIll[31] = 12 + 45 - -19 + 75 + (0xDB ^ 0x86) - ((0x2E ^ 0x23) << "   ".length()) + (0x20 ^ 0x2F);
        InputReader.IIlIll[32] = (0xB3 ^ 0xA0) << (" ".length() << " ".length());
        InputReader.IIlIll[33] = (0x24 ^ 0x13) << (" ".length() << " ".length()) ^ 118 + 139 - 216 + 116;
        InputReader.IIlIll[34] = (0x6A ^ 0x55) << (" ".length() << " ".length());
        InputReader.IIlIll[35] = 34 + 48 - 4 + 75;
        InputReader.IIlIll[36] = (" ".length() << (0x66 ^ 0x61)) + (113 + 60 - 128 + 104) - (0xFF ^ 0x90) + (0x19 ^ 0x1E);
        InputReader.IIlIll[37] = ((0x85 ^ 0xB8) << " ".length() ^ (0x60 ^ 0x13)) << (" ".length() << (" ".length() << " ".length()));
        InputReader.IIlIll[38] = 0xD3 ^ 0xAA;
        InputReader.IIlIll[39] = ((0x65 ^ 0x6E) << (" ".length() << " ".length()) ^ (0xC ^ 0x15)) << " ".length();
        InputReader.IIlIll[40] = 0xC7 ^ 0x94;
        InputReader.IIlIll[41] = ((0xB5 ^ 0x98) << " ".length() ^ (0xCC ^ 0x83)) << (" ".length() << " ".length());
        InputReader.IIlIll[42] = (0x4C ^ 0x29 ^ (0x99 ^ 0x88) << " ".length()) << " ".length();
        InputReader.IIlIll[43] = ((0xE ^ 1) << (" ".length() << (" ".length() << " ".length())) ^ 108 + 144 - 212 + 105) << " ".length();
        InputReader.IIlIll[44] = ("   ".length() << (" ".length() << " ".length())) + ((6 ^ 0x2B) << " ".length() & ~((0x86 ^ 0xAB) << " ".length())) - -(0xC3 ^ 0xAB) + (0xA ^ 0x17);
    }

    private static boolean lIlIIIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean llIIIIIl(Object object) {
        return object != null;
    }

    private static boolean IIIIIIIl(int n) {
        return n != 0;
    }

    private static boolean IIlIIIIl(int n) {
        return n == 0;
    }

    private static boolean lIIIIIIl(int n) {
        return n >= 0;
    }

    private static boolean IlIIIIIl(int n) {
        return n > 0;
    }

    static class OutputWriter
    extends PrintWriter {
        public OutputWriter(OutputStream lIlIllIlIlIllIl) {
            super(lIlIllIlIlIllIl);
            OutputWriter IllIllIlIlIllIl;
        }

        public OutputWriter(Writer lIIIllIlIlIllIl) {
            super(lIIIllIlIlIllIl);
            OutputWriter IlIIllIlIlIllIl;
        }

        public OutputWriter(String lIllIlIlIlIllIl) throws FileNotFoundException {
            super(lIllIlIlIlIllIl);
            OutputWriter IlllIlIlIlIllIl;
        }

        @Override
        public void close() {
            OutputWriter llIlIlIlIlIllIl;
            super.close();
        }
    }
}

