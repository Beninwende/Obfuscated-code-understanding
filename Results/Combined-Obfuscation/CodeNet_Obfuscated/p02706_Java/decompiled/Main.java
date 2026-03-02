/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.InputMismatchException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = IlIIlIllIl[llIIlIllIl[0]];
    private byte[] inbuf = new byte[llIIlIllIl[1]];
    public int lenbuf = llIIlIllIl[0];
    public int ptrbuf = llIIlIllIl[0];
    private static String[] IlIIlIllIl;
    private static int[] llIIlIllIl;

    public Main() {
        Main lIllIIIIl;
    }

    void solve() {
        Main llIIIIIIl;
        int IlIIIIIIl = llIIIIIIl.ni();
        int lIIIIIIIl = llIIIIIIl.ni();
        int[] IIIIIIIIl = llIIIIIIl.na(lIIIIIIIl);
        int llllllll = llIIlIllIl[0];
        int[] Illlllll = IIIIIIIIl;
        int lIllllll = Illlllll.length;
        int IIllllll = llIIlIllIl[0];
        while (Main.lIIIllIIIlIl(IIllllll, lIllllll)) {
            int llIlllll = Illlllll[IIllllll];
            llllllll += llIlllll;
            ++IIllllll;
            "".length();
            if (" ".length() << " ".length() == " ".length() << " ".length()) continue;
            return;
        }
        if (Main.IlIIllIIIlIl(llllllll, IlIIIIIIl)) {
            llIIIIIIl.out.println(llIIlIllIl[2]);
            "".length();
            if ("   ".length() < ((3 + 38 - -60 + 44 ^ (0x4B ^ 0) << " ".length()) << "   ".length() & (((0x9B ^ 0xA2) << " ".length() ^ (5 ^ 0x70)) << "   ".length() ^ -" ".length()))) {
                return;
            }
        } else {
            llIIIIIIl.out.println(IlIIIIIIl - llllllll);
        }
    }

    void run() throws Exception {
        InputStream inputStream;
        Main IIIlllll;
        if (Main.llIIllIIIlIl(IIIlllll.INPUT.isEmpty() ? 1 : 0)) {
            inputStream = System.in;
            "".length();
            if (-" ".length() > " ".length()) {
                return;
            }
        } else {
            inputStream = new ByteArrayInputStream(IIIlllll.INPUT.getBytes());
        }
        IIIlllll.is = inputStream;
        IIIlllll.out = new PrintWriter(System.out);
        long lllIllll = System.currentTimeMillis();
        IIIlllll.solve();
        IIIlllll.out.flush();
        if (Main.IIlIllIIIlIl(IIIlllll.INPUT.isEmpty() ? 1 : 0)) {
            Object[] objectArray = new Object[llIIlIllIl[3]];
            objectArray[Main.llIIlIllIl[0]] = System.currentTimeMillis() - lllIllll + "ms";
            Main.tr(objectArray);
        }
    }

    public static void main(String[] stringArray) throws Exception {
        new Main().run();
    }

    private int readByte() {
        block5: {
            Main IIlIllll;
            if (Main.lIlIllIIIlIl(IIlIllll.lenbuf, llIIlIllIl[2])) {
                throw new InputMismatchException();
            }
            if (!Main.IllIllIIIlIl(IIlIllll.ptrbuf, IIlIllll.lenbuf)) break block5;
            IIlIllll.ptrbuf = llIIlIllIl[0];
            try {
                IIlIllll.lenbuf = IIlIllll.is.read(IIlIllll.inbuf);
                "".length();
            }
            catch (IOException llIIllll) {
                throw new InputMismatchException();
            }
            if ("   ".length() <= " ".length()) {
                return (" ".length() << ("   ".length() << " ".length()) ^ (0x29 ^ 0x48)) << " ".length() & (("   ".length() << (" ".length() << " ".length()) ^ (0x56 ^ 0x7B)) << " ".length() ^ -" ".length());
            }
            if (Main.lllIllIIIlIl(IIlIllll.lenbuf)) {
                return llIIlIllIl[2];
            }
        }
        int n = this.ptrbuf;
        this.ptrbuf = n + llIIlIllIl[3];
        return this.inbuf[n];
    }

    private boolean isSpaceChar(int lIIIllll) {
        boolean bl;
        if (!Main.IllIllIIIlIl(lIIIllll, llIIlIllIl[4]) || Main.IlIIllIIIlIl(lIIIllll, llIIlIllIl[5])) {
            bl = llIIlIllIl[3];
            "".length();
            if ("   ".length() <= " ".length()) {
                return (((7 ^ 0xA) << (" ".length() << " ".length()) ^ (0x58 ^ 0x41)) & ((0x25 ^ 0x2A) << "   ".length() ^ (0x42 ^ 0x17) ^ -" ".length())) != 0;
            }
        } else {
            bl = llIIlIllIl[0];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private int skip() {
        void var1_1;
        Main IlllIlll;
        int lIllIlll;
        while (Main.IIIlllIIIlIl(lIllIlll = IlllIlll.readByte(), llIIlIllIl[2]) && Main.llIIllIIIlIl(IlllIlll.isSpaceChar(lIllIlll) ? 1 : 0)) {
            "".length();
            if (" ".length() << (" ".length() << " ".length()) >= 0) continue;
            return ((0xE7 ^ 0xB6) << " ".length() ^ 113 + 2 - 86 + 142) << (" ".length() << " ".length()) & ((0xF7 ^ 0x80 ^ (0xAA ^ 0x95) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length());
        }
        return (int)var1_1;
    }

    private double nd() {
        Main llIlIlll;
        return Double.parseDouble(llIlIlll.ns());
    }

    private char nc() {
        Main lIIlIlll;
        return (char)lIIlIlll.skip();
    }

    /*
     * WARNING - void declaration
     */
    private String ns() {
        void var2_2;
        Main lIlIIlll;
        int IIlIIlll = lIlIIlll.skip();
        StringBuilder llIIIlll = new StringBuilder();
        while (Main.IIlIllIIIlIl(lIlIIlll.isSpaceChar(IIlIIlll) ? 1 : 0)) {
            llIIIlll.appendCodePoint(IIlIIlll);
            "".length();
            IIlIIlll = lIlIIlll.readByte();
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(var2_2);
    }

    private char[] ns(int IIlllIll) {
        char[] cArray;
        Main lIlllIll;
        char[] llIllIll = new char[IIlllIll];
        int IlIllIll = lIlllIll.skip();
        int lIIllIll = llIIlIllIl[0];
        while (Main.lIIIllIIIlIl(lIIllIll, IIlllIll) && Main.IIlIllIIIlIl(lIlllIll.isSpaceChar(IlIllIll) ? 1 : 0)) {
            llIllIll[lIIllIll++] = (char)IlIllIll;
            IlIllIll = lIlllIll.readByte();
            "".length();
            if (" ".length() << (" ".length() << " ".length()) >= (((0x43 ^ 0x6A) << (" ".length() << " ".length()) ^ 14 + 138 - -8 + 13) & (0x47 ^ 0x3E ^ (0x4E ^ 0x49) << (" ".length() << (" ".length() << " ".length())) ^ -" ".length()))) continue;
            return null;
        }
        if (Main.lIlIllIIIlIl(IIlllIll, lIIllIll)) {
            cArray = llIllIll;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        } else {
            cArray = Arrays.copyOf(llIllIll, lIIllIll);
        }
        return cArray;
    }

    /*
     * WARNING - void declaration
     */
    private char[][] nm(int IlIIlIll, int lIIIlIll) {
        void var3_3;
        char[][] IIIIlIll = new char[IlIIlIll][];
        int llllIIll = llIIlIllIl[0];
        while (Main.lIIIllIIIlIl(llllIIll, IlIIlIll)) {
            Main llIIlIll;
            IIIIlIll[llllIIll] = llIIlIll.ns(lIIIlIll);
            ++llllIIll;
            "".length();
            if (((0xDE ^ 0xC3) << " ".length() & ~((0x2D ^ 0x30) << " ".length())) == 0) continue;
            return null;
        }
        return var3_3;
    }

    /*
     * WARNING - void declaration
     */
    private int[] na(int lIIlIIll) {
        void var2_2;
        int[] IIIlIIll = new int[lIIlIIll];
        int lllIIIll = llIIlIllIl[0];
        while (Main.lIIIllIIIlIl(lllIIIll, lIIlIIll)) {
            Main IlIlIIll;
            IIIlIIll[lllIIIll] = IlIlIIll.ni();
            ++lllIIIll;
            "".length();
            if (((0x5F ^ 0x48) & ~(0x31 ^ 0x26)) <= 0) continue;
            return null;
        }
        return var2_2;
    }

    private int ni() {
        Main IlIIIIll;
        int IIIIIIll;
        int lIIIIIll = llIIlIllIl[0];
        int llllllIl = llIIlIllIl[0];
        while (Main.IIIlllIIIlIl(IIIIIIll = IlIIIIll.readByte(), llIIlIllIl[2]) && (!Main.IllIllIIIlIl(IIIIIIll, llIIlIllIl[6]) || Main.IlIIllIIIlIl(IIIIIIll, llIIlIllIl[7])) && Main.IIIlllIIIlIl(IIIIIIll, llIIlIllIl[8])) {
            "".length();
            if (" ".length() << " ".length() != (((0x6D ^ 0x52) << " ".length() ^ (0x83 ^ 0xC6)) & (0xBA ^ 0xA1 ^ " ".length() << (0x96 ^ 0x93) ^ -" ".length()))) continue;
            return (157 + 95 - 116 + 89 ^ (0x75 ^ 0x60) << "   ".length()) & (70 + 52 - 96 + 213 ^ (0x71 ^ 0x22) << " ".length() ^ -" ".length());
        }
        if (Main.lIlIllIIIlIl(IIIIIIll, llIIlIllIl[8])) {
            llllllIl = llIIlIllIl[3];
            IIIIIIll = IlIIIIll.readByte();
        }
        do {
            if (Main.IllIllIIIlIl(IIIIIIll, llIIlIllIl[6]) && Main.lIIlllIIIlIl(IIIIIIll, llIIlIllIl[7])) {
                lIIIIIll = lIIIIIll * llIIlIllIl[9] + (IIIIIIll - llIIlIllIl[6]);
                "".length();
                if (" ".length() << " ".length() == -" ".length()) {
                    return " ".length() << (" ".length() << " ".length()) & ~(" ".length() << (" ".length() << " ".length()));
                }
            } else {
                int n;
                if (Main.llIIllIIIlIl(llllllIl)) {
                    n = -lIIIIIll;
                    "".length();
                    if (" ".length() << " ".length() <= 0) {
                        return (0xDF ^ 0xB4 ^ (0x38 ^ 0x17) << " ".length()) & (0xA8 ^ 0xAD ^ "   ".length() << (" ".length() << (" ".length() << " ".length())) ^ -" ".length());
                    }
                } else {
                    n = lIIIIIll;
                }
                return n;
            }
            int n = this.readByte();
            "".length();
        } while (((0x5F ^ 0x6E) << " ".length() & ~((0x49 ^ 0x78) << " ".length())) == 0);
        return " ".length() << (0xF ^ 0xA) & ~(" ".length() << (0x21 ^ 0x24));
    }

    private long nl() {
        Main IlIlllIl;
        int IIIlllIl;
        long lIIlllIl = 0L;
        int lllIllIl = llIIlIllIl[0];
        while (Main.IIIlllIIIlIl(IIIlllIl = IlIlllIl.readByte(), llIIlIllIl[2]) && (!Main.IllIllIIIlIl(IIIlllIl, llIIlIllIl[6]) || Main.IlIIllIIIlIl(IIIlllIl, llIIlIllIl[7])) && Main.IIIlllIIIlIl(IIIlllIl, llIIlIllIl[8])) {
            "".length();
            if (" ".length() << " ".length() != "   ".length()) continue;
            return 0L;
        }
        if (Main.lIlIllIIIlIl(IIIlllIl, llIIlIllIl[8])) {
            lllIllIl = llIIlIllIl[3];
            IIIlllIl = IlIlllIl.readByte();
        }
        do {
            if (Main.IllIllIIIlIl(IIIlllIl, llIIlIllIl[6]) && Main.lIIlllIIIlIl(IIIlllIl, llIIlIllIl[7])) {
                lIIlllIl = lIIlllIl * 10L + (long)(IIIlllIl - llIIlIllIl[6]);
                "".length();
                if (" ".length() << (" ".length() << " ".length()) <= "   ".length()) {
                    return 0L;
                }
            } else {
                long l;
                if (Main.llIIllIIIlIl(lllIllIl)) {
                    l = -lIIlllIl;
                    "".length();
                    if (" ".length() << (" ".length() << " ".length()) < " ".length() << " ".length()) {
                        return 0L;
                    }
                } else {
                    l = lIIlllIl;
                }
                return l;
            }
            int n = this.readByte();
            "".length();
        } while (" ".length() << " ".length() >= 0);
        return 0L;
    }

    private static void tr(Object ... lIlIllIl) {
        System.out.println(Arrays.deepToString(lIlIllIl));
    }

    static {
        Main.IIIIllIIIlIl();
        Main.llllIlIIIlIl();
    }

    private static void llllIlIIIlIl() {
        IlIIlIllIl = new String[llIIlIllIl[3]];
        Main.IlIIlIllIl[Main.llIIlIllIl[0]] = Main.IlllIlIIIlIl("IFL22uZvFtM=", "JqWpb");
    }

    private static String IlllIlIIIlIl(String IIIIllIl, String llllIlIl) {
        try {
            SecretKeySpec IlllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIlIl.getBytes(StandardCharsets.UTF_8)), llIIlIllIl[10]), "DES");
            Cipher lIllIlIl = Cipher.getInstance("DES");
            lIllIlIl.init(llIIlIllIl[11], IlllIlIl);
            return new String(lIllIlIl.doFinal(Base64.getDecoder().decode(IIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIllIlIl) {
            IIllIlIl.printStackTrace();
            return null;
        }
    }

    private static void IIIIllIIIlIl() {
        llIIlIllIl = new int[12];
        Main.llIIlIllIl[0] = (0x63 ^ 0x2C ^ (0x3D ^ 0x1C) << " ".length()) << " ".length() & ((0x36 ^ 0x23 ^ "   ".length() << "   ".length()) << " ".length() ^ -" ".length());
        Main.llIIlIllIl[1] = " ".length() << ((0xA5 ^ 0xA0) << " ".length());
        Main.llIIlIllIl[2] = -" ".length();
        Main.llIIlIllIl[3] = " ".length();
        Main.llIIlIllIl[4] = 0x3B ^ 0x1A;
        Main.llIIlIllIl[5] = (0x44 ^ 0x53 ^ (0x2B ^ 0x2E) << "   ".length()) << " ".length();
        Main.llIIlIllIl[6] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        Main.llIIlIllIl[7] = 0x64 ^ 0x21 ^ (0x21 ^ 0x3E) << (" ".length() << " ".length());
        Main.llIIlIllIl[8] = 0xA6 ^ 0x8B;
        Main.llIIlIllIl[9] = (0x9D ^ 0x92 ^ (0x7D ^ 0x78) << " ".length()) << " ".length();
        Main.llIIlIllIl[10] = " ".length() << "   ".length();
        Main.llIIlIllIl[11] = " ".length() << " ".length();
    }

    private static boolean lIlIllIIIlIl(int n, int n2) {
        return n == n2;
    }

    private static boolean IllIllIIIlIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIIIllIIIlIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIlllIIIlIl(int n, int n2) {
        return n <= n2;
    }

    private static boolean IlIIllIIIlIl(int n, int n2) {
        return n > n2;
    }

    private static boolean llIIllIIIlIl(int n) {
        return n != 0;
    }

    private static boolean IIlIllIIIlIl(int n) {
        return n == 0;
    }

    private static boolean lllIllIIIlIl(int n) {
        return n <= 0;
    }

    private static boolean IIIlllIIIlIl(int n, int n2) {
        return n != n2;
    }
}

