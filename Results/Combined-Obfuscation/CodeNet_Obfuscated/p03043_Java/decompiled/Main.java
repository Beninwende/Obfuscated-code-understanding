/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    private final PrintWriter out = new PrintWriter(System.out);
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[IllIIIlIIl[0]];
    private int ptr = IllIIIlIIl[1];
    private int buflen = IllIIIlIIl[1];
    private static String[] lIlIIIlIIl;
    private static int[] IllIIIlIIl;

    public Main() {
        Main lIlllIIIIIlIl;
    }

    public static void main(String[] stringArray) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        Main IlIllIIIIIlIl;
        try {
            IlIllIIIIIlIl.solveC();
        }
        catch (Throwable lIIllIIIIIlIl) {
            if (Main.IIIllIIIIIIl(IlIllIIIIIlIl.in)) {
                IlIllIIIIIlIl.in.close();
            }
            if (Main.IIIllIIIIIIl(IlIllIIIIIlIl.out)) {
                IlIllIIIIIlIl.out.flush();
                IlIllIIIIIlIl.out.close();
            }
            throw lIIllIIIIIlIl;
        }
        if (Main.IIIllIIIIIIl(IlIllIIIIIlIl.in)) {
            IlIllIIIIIlIl.in.close();
        }
        if (Main.IIIllIIIIIIl(IlIllIIIIIlIl.out)) {
            IlIllIIIIIlIl.out.flush();
            IlIllIIIIIlIl.out.close();
            "".length();
            if ("   ".length() > "   ".length()) {
                return;
            }
        }
    }

    private void solveA() {
        Main IlIIlIIIIIlIl;
        int lIIIlIIIIIlIl = IlIIlIIIIIlIl.nextInt();
        int IIIIlIIIIIlIl = IlIIlIIIIIlIl.nextInt();
        String[] llllIIIIIIlIl = IlIIlIIIIIlIl.next().split(lIlIIIlIIl[IllIIIlIIl[1]]);
        llllIIIIIIlIl[IIIIlIIIIIlIl - Main.IllIIIlIIl[2]] = llllIIIIIIlIl[IIIIlIIIIIlIl - IllIIIlIIl[2]].toLowerCase();
        StringBuilder IlllIIIIIIlIl = new StringBuilder();
        int lIllIIIIIIlIl = IllIIIlIIl[1];
        while (Main.lIIllIIIIIIl(lIllIIIIIIlIl, llllIIIIIIlIl.length)) {
            IlllIIIIIIlIl.append(llllIIIIIIlIl[lIllIIIIIIlIl]);
            "".length();
            ++lIllIIIIIIlIl;
            "".length();
            if ((" ".length() << (0x5C ^ 0x59) & ~(" ".length() << (0x70 ^ 0x75))) == 0) continue;
            return;
        }
        IlIIlIIIIIlIl.out.println(String.valueOf(IlllIIIIIIlIl));
    }

    private void solveB() {
        Main IIIlIIIIIIlIl;
        int lllIIIIIIIlIl = IIIlIIIIIIlIl.nextInt();
        int IllIIIIIIIlIl = lllIIIIIIIlIl / IllIIIlIIl[3];
        int lIlIIIIIIIlIl = lllIIIIIIIlIl % IllIIIlIIl[3];
        if (Main.lIIllIIIIIIl(IllIIIlIIl[1], IllIIIIIIIlIl) && Main.IlIllIIIIIIl(IllIIIIIIIlIl, IllIIIlIIl[4]) && (!Main.llIllIIIIIIl(lIlIIIIIIIlIl) || Main.IIlllIIIIIIl(lIlIIIIIIIlIl, IllIIIlIIl[4]))) {
            IIIlIIIIIIlIl.out.println(lIlIIIlIIl[IllIIIlIIl[2]]);
            "".length();
            if (-"  ".length() > 0) {
                return;
            }
        } else if (Main.lIIllIIIIIIl(IllIIIlIIl[1], lIlIIIIIIIlIl) && Main.IlIllIIIIIIl(lIlIIIIIIIlIl, IllIIIlIIl[4]) && (!Main.llIllIIIIIIl(IllIIIIIIIlIl) || Main.IIlllIIIIIIl(IllIIIIIIIlIl, IllIIIlIIl[4]))) {
            IIIlIIIIIIlIl.out.println(lIlIIIlIIl[IllIIIlIIl[5]]);
            "".length();
            if ("   ".length() >= " ".length() << (" ".length() << " ".length())) {
                return;
            }
        } else if (Main.lIIllIIIIIIl(IllIIIlIIl[1], IllIIIIIIIlIl) && Main.IlIllIIIIIIl(IllIIIIIIIlIl, IllIIIlIIl[4]) && Main.lIIllIIIIIIl(IllIIIlIIl[1], lIlIIIIIIIlIl) && Main.IlIllIIIIIIl(lIlIIIIIIIlIl, IllIIIlIIl[4])) {
            IIIlIIIIIIlIl.out.println(lIlIIIlIIl[IllIIIlIIl[6]]);
            "".length();
            if (((0x5E ^ 0x71) & ~(0x37 ^ 0x18)) >= " ".length() << " ".length()) {
                return;
            }
        } else {
            IIIlIIIIIIlIl.out.println(lIlIIIlIIl[IllIIIlIIl[7]]);
        }
    }

    private void solveC() {
        Main lIllllllllIIl;
        int IIllllllllIIl = lIllllllllIIl.nextInt();
        int llIlllllllIIl = lIllllllllIIl.nextInt();
        BigDecimal IlIlllllllIIl = new BigDecimal(lIlIIIlIIl[IllIIIlIIl[8]]);
        int lIIlllllllIIl = IllIIIlIIl[2];
        while (Main.IlIllIIIIIIl(lIIlllllllIIl, IIllllllllIIl)) {
            int IIIlllllllIIl = lIllllllllIIl.recursiveC(lIIlllllllIIl, llIlllllllIIl);
            BigDecimal lllIllllllIIl = new BigDecimal(lIlIIIlIIl[IllIIIlIIl[9]]).pow(IIIlllllllIIl);
            IlIlllllllIIl = IlIlllllllIIl.add(lllIllllllIIl);
            ++lIIlllllllIIl;
            "".length();
            if (" ".length() << " ".length() >= 0) continue;
            return;
        }
        lIllllllllIIl.out.println(IlIlllllllIIl.divide(new BigDecimal(IIllllllllIIl), IllIIIlIIl[10], RoundingMode.HALF_UP));
    }

    /*
     * WARNING - void declaration
     */
    private int recursiveC(int IlIIllllllIIl, int lIIIllllllIIl) {
        void var2_2;
        void var1_1;
        if (Main.lIlllIIIIIIl(IlIIllllllIIl, lIIIllllllIIl)) {
            return IllIIIlIIl[1];
        }
        return this.recursiveC((int)(var1_1 * IllIIIlIIl[5]), (int)var2_2) + IllIIIlIIl[2];
    }

    private void solveD() {
        Main IlllIlllllIIl;
        int lIllIlllllIIl = IlllIlllllIIl.nextInt();
        IlllIlllllIIl.out.println(lIlIIIlIIl[IllIIIlIIl[11]]);
    }

    private void solveE() {
        Main IlIlIlllllIIl;
        int lIIlIlllllIIl = IlIlIlllllIIl.nextInt();
        IlIlIlllllIIl.out.println(lIlIIIlIIl[IllIIIlIIl[12]]);
    }

    private void solveF() {
        Main IllIIlllllIIl;
        int lIlIIlllllIIl = IllIIlllllIIl.nextInt();
        IllIIlllllIIl.out.println(lIlIIIlIIl[IllIIIlIIl[13]]);
    }

    private boolean hasNextByte() {
        Main IlIIIlllllIIl;
        if (Main.lIIllIIIIIIl(IlIIIlllllIIl.ptr, IlIIIlllllIIl.buflen)) {
            return IllIIIlIIl[2];
        }
        IlIIIlllllIIl.ptr = IllIIIlIIl[1];
        try {
            IlIIIlllllIIl.buflen = IlIIIlllllIIl.in.read(IlIIIlllllIIl.buffer);
            "".length();
        }
        catch (IOException lIIIIlllllIIl) {
            lIIIIlllllIIl.printStackTrace();
        }
        if (null != null) {
            return ((0xD1 ^ 0x96) & ~(0xC3 ^ 0x84)) != 0;
        }
        if (Main.IllllIIIIIIl(IlIIIlllllIIl.buflen)) {
            return IllIIIlIIl[1];
        }
        return IllIIIlIIl[2];
    }

    private int readByte() {
        Main lllllIllllIIl;
        if (Main.lllllIIIIIIl(lllllIllllIIl.hasNextByte() ? 1 : 0)) {
            int n = lllllIllllIIl.ptr;
            lllllIllllIIl.ptr = n + IllIIIlIIl[2];
            return lllllIllllIIl.buffer[n];
        }
        return IllIIIlIIl[14];
    }

    private static boolean isPrintableChar(int lIlllIllllIIl) {
        int n;
        if (Main.IlIllIIIIIIl(IllIIIlIIl[15], lIlllIllllIIl) && Main.IlIllIIIIIIl(lIlllIllllIIl, IllIIIlIIl[16])) {
            n = IllIIIlIIl[2];
            "".length();
            if (" ".length() << " ".length() < ((0x79 ^ 0x1A) & ~(0xC1 ^ 0xA2))) {
                return ((0x5B ^ 0x76) & ~(0x65 ^ 0x48)) != 0;
            }
        } else {
            n = IllIIIlIIl[1];
        }
        return n != 0;
    }

    private void skipUnprintable() {
        Main llIllIllllIIl;
        while (Main.lllllIIIIIIl(llIllIllllIIl.hasNextByte() ? 1 : 0) && Main.IIIIIlIIIIIl(Main.isPrintableChar(llIllIllllIIl.buffer[llIllIllllIIl.ptr]) ? 1 : 0)) {
            llIllIllllIIl.ptr += IllIIIlIIl[2];
            "".length();
            if (-"   ".length() <= 0) continue;
            return;
        }
    }

    public boolean hasNext() {
        Main lIIllIllllIIl;
        lIIllIllllIIl.skipUnprintable();
        return this.hasNextByte();
    }

    public int nextInt() {
        Main lllIlIllllIIl;
        return Integer.parseInt(lllIlIllllIIl.next());
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        Main llIIlIllllIIl;
        if (Main.IIIIIlIIIIIl(llIIlIllllIIl.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IlIIlIllllIIl = new StringBuilder();
        int lIIIlIllllIIl = llIIlIllllIIl.readByte();
        while (Main.lllllIIIIIIl(Main.isPrintableChar(lIIIlIllllIIl) ? 1 : 0)) {
            IlIIlIllllIIl.appendCodePoint(lIIIlIllllIIl);
            "".length();
            lIIIlIllllIIl = llIIlIllllIIl.readByte();
            "".length();
            if (" ".length() == " ".length()) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        Main IIllIIllllIIl;
        if (Main.IIIIIlIIIIIl(IIllIIllllIIl.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long llIlIIllllIIl = 0L;
        int IlIlIIllllIIl = IllIIIlIIl[1];
        int lIIlIIllllIIl = IIllIIllllIIl.readByte();
        if (Main.lIIIIlIIIIIl(lIIlIIllllIIl, IllIIIlIIl[17])) {
            IlIlIIllllIIl = IllIIIlIIl[2];
            lIIlIIllllIIl = IIllIIllllIIl.readByte();
        }
        if (!Main.lIlllIIIIIIl(lIIlIIllllIIl, IllIIIlIIl[18]) || Main.lIIllIIIIIIl(IllIIIlIIl[19], lIIlIIllllIIl)) {
            throw new NumberFormatException();
        }
        do {
            if (Main.IlIllIIIIIIl(IllIIIlIIl[18], lIIlIIllllIIl) && Main.IlIllIIIIIIl(lIIlIIllllIIl, IllIIIlIIl[19])) {
                llIlIIllllIIl *= 10L;
                llIlIIllllIIl += (long)(lIIlIIllllIIl - IllIIIlIIl[18]);
                "".length();
                if (" ".length() << (" ".length() << " ".length()) < "   ".length()) {
                    return 0L;
                }
            } else {
                if (!Main.IlIIIlIIIIIl(lIIlIIllllIIl, IllIIIlIIl[14]) || Main.IIIIIlIIIIIl(Main.isPrintableChar(lIIlIIllllIIl) ? 1 : 0)) {
                    long l;
                    if (Main.lllllIIIIIIl(IlIlIIllllIIl)) {
                        l = -llIlIIllllIIl;
                        "".length();
                        if (" ".length() << " ".length() <= -" ".length()) {
                            return 0L;
                        }
                    } else {
                        l = llIlIIllllIIl;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            "".length();
        } while ("   ".length() > 0);
        return 0L;
    }

    static {
        Main.lllIlIIIIIIl();
        Main.IllIlIIIIIIl();
    }

    private static void IllIlIIIIIIl() {
        lIlIIIlIIl = new String[IllIIIlIIl[20]];
        Main.lIlIIIlIIl[Main.IllIIIlIIl[1]] = Main.llIIlIIIIIIl("", "iOdJE");
        Main.lIlIIIlIIl[Main.IllIIIlIIl[2]] = Main.llIIlIIIIIIl("OQcgKQ==", "tJypU");
        Main.lIlIIIlIIl[Main.IllIIIlIIl[5]] = Main.IIlIlIIIIIIl("WakKj6qV2Eo=", "bgiFc");
        Main.lIlIIIlIIl[Main.IllIIIlIIl[6]] = Main.IIlIlIIIIIIl("zgPKXd4adjKXoJfO7Km70w==", "IOGEX");
        Main.lIlIIIlIIl[Main.IllIIIlIIl[7]] = Main.IIlIlIIIIIIl("Ewl0YargKAQ=", "DVjHg");
        Main.lIlIIIlIIl[Main.IllIIIlIIl[8]] = Main.lIlIlIIIIIIl("t9ILJMn9TVI=", "HVlYV");
        Main.lIlIIIlIIl[Main.IllIIIlIIl[9]] = Main.IIlIlIIIIIIl("pBt3PpjMBLo=", "rNcfy");
        Main.lIlIIIlIIl[Main.IllIIIlIIl[11]] = Main.llIIlIIIIIIl("", "huVqf");
        Main.lIlIIIlIIl[Main.IllIIIlIIl[12]] = Main.llIIlIIIIIIl("", "ubYLR");
        Main.lIlIIIlIIl[Main.IllIIIlIIl[13]] = Main.lIlIlIIIIIIl("1IqdiaYByeI=", "pxmWU");
    }

    private static String lIlIlIIIIIIl(String IIlIIIllllIIl, String llIIIIllllIIl) {
        try {
            SecretKeySpec IlIIIIllllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIllllIIl.getBytes(StandardCharsets.UTF_8)), IllIIIlIIl[12]), "DES");
            Cipher lIIIIIllllIIl = Cipher.getInstance("DES");
            lIIIIIllllIIl.init(IllIIIlIIl[5], IlIIIIllllIIl);
            return new String(lIIIIIllllIIl.doFinal(Base64.getDecoder().decode(IIlIIIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIIIIllllIIl) {
            IIIIIIllllIIl.printStackTrace();
            return null;
        }
    }

    private static String IIlIlIIIIIIl(String lllIllIlllIIl, String IllIllIlllIIl) {
        try {
            SecretKeySpec lIlIllIlllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IllIllIlllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher IIlIllIlllIIl = Cipher.getInstance("Blowfish");
            IIlIllIlllIIl.init(IllIIIlIIl[5], lIlIllIlllIIl);
            return new String(IIlIllIlllIIl.doFinal(Base64.getDecoder().decode(lllIllIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIllIlllIIl) {
            llIIllIlllIIl.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String llIIlIIIIIIl(String lIlIIlIlllIIl, String IIlIIlIlllIIl) {
        lIlIIlIlllIIl = new String(Base64.getDecoder().decode(lIlIIlIlllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIIlIlllIIl = new StringBuilder();
        char[] IlIIIlIlllIIl = IIlIIlIlllIIl.toCharArray();
        int lIIIIlIlllIIl = IllIIIlIIl[1];
        char[] lllIlIIlllIIl = lIlIIlIlllIIl.toCharArray();
        int IIIllIIlllIIl = lllIlIIlllIIl.length;
        int lIIllIIlllIIl = IllIIIlIIl[1];
        "".length();
        while (!Main.lIlllIIIIIIl(lIIllIIlllIIl, IIIllIIlllIIl)) {
            char IIIIIlIlllIIl = lllIlIIlllIIl[lIIllIIlllIIl];
            llIIIlIlllIIl.append((char)(IIIIIlIlllIIl ^ IlIIIlIlllIIl[lIIIIlIlllIIl % IlIIIlIlllIIl.length]));
            "".length();
            ++lIIIIlIlllIIl;
            ++lIIllIIlllIIl;
        }
        return String.valueOf(llIIIlIlllIIl);
    }

    private static void lllIlIIIIIIl() {
        IllIIIlIIl = new int[21];
        Main.IllIIIlIIl[0] = " ".length() << (((0xCC ^ 0xC3) << (" ".length() << " ".length()) ^ (0xBB ^ 0x82)) << " ".length());
        Main.IllIIIlIIl[1] = (0x43 ^ 0x7E) & ~(0x45 ^ 0x78);
        Main.IllIIIlIIl[2] = " ".length();
        Main.IllIIIlIIl[3] = ((0xD1 ^ 0x9C) << " ".length() ^ 123 + 122 - 137 + 23) << (" ".length() << " ".length());
        Main.IllIIIlIIl[4] = "   ".length() << (" ".length() << " ".length());
        Main.IllIIIlIIl[5] = " ".length() << " ".length();
        Main.IllIIIlIIl[6] = "   ".length();
        Main.IllIIIlIIl[7] = " ".length() << (" ".length() << " ".length());
        Main.IllIIIlIIl[8] = 0xB1 ^ 0xB4;
        Main.IllIIIlIIl[9] = "   ".length() << " ".length();
        Main.IllIIIlIIl[10] = 0x69 ^ 0x62;
        Main.IllIIIlIIl[11] = 0x13 ^ 0x14;
        Main.IllIIIlIIl[12] = " ".length() << "   ".length();
        Main.IllIIIlIIl[13] = 0x6C ^ 0x65;
        Main.IllIIIlIIl[14] = -" ".length();
        Main.IllIIIlIIl[15] = 0xE0 ^ 0xC1;
        Main.IllIIIlIIl[16] = (0xA1 ^ 0x9E) << " ".length();
        Main.IllIIIlIIl[17] = 0xD4 ^ 0xAD ^ (0xA0 ^ 0xB5) << (" ".length() << " ".length());
        Main.IllIIIlIIl[18] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        Main.IllIIIlIIl[19] = 0x40 ^ 0x79;
        Main.IllIIIlIIl[20] = (0x3F ^ 0x3A) << " ".length();
    }

    private static boolean lIIIIlIIIIIl(int n, int n2) {
        return n == n2;
    }

    private static boolean lIlllIIIIIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIIllIIIIIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IlIllIIIIIIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean IIlllIIIIIIl(int n, int n2) {
        return n > n2;
    }

    private static boolean IIIllIIIIIIl(Object object) {
        return object != null;
    }

    private static boolean lllllIIIIIIl(int n) {
        return n != 0;
    }

    private static boolean IIIIIlIIIIIl(int n) {
        return n == 0;
    }

    private static boolean IllllIIIIIIl(int n) {
        return n <= 0;
    }

    private static boolean llIllIIIIIIl(int n) {
        return n > 0;
    }

    private static boolean IlIIIlIIIIIl(int n, int n2) {
        return n != n2;
    }
}

