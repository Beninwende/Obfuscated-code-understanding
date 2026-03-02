/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
    private final byte[] buffer = new byte[IIllIIIIl[0]];
    private int ptr = IIllIIIIl[1];
    private int buflen = IIllIIIIl[1];
    private static String[] llIlIIIIl;
    private static int[] IIllIIIIl;

    public Main() {
        Main lIIlIIIIllIlll;
    }

    public static void main(String[] stringArray) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        Main IllIIIIIllIlll;
        try {
            IllIIIIIllIlll.solveB();
        }
        catch (Throwable lIlIIIIIllIlll) {
            if (Main.lIlIlIIlll(IllIIIIIllIlll.in)) {
                IllIIIIIllIlll.in.close();
            }
            if (Main.lIlIlIIlll(IllIIIIIllIlll.out)) {
                IllIIIIIllIlll.out.flush();
                IllIIIIIllIlll.out.close();
            }
            throw lIlIIIIIllIlll;
        }
        if (Main.lIlIlIIlll(IllIIIIIllIlll.in)) {
            IllIIIIIllIlll.in.close();
        }
        if (Main.lIlIlIIlll(IllIIIIIllIlll.out)) {
            IllIIIIIllIlll.out.flush();
            IllIIIIIllIlll.out.close();
            "".length();
            if ((((0x2D ^ 0x22) << (" ".length() << " ".length()) ^ (0xAF ^ 0x9E)) << " ".length() & (((0x34 ^ 0x2B) << (" ".length() << " ".length()) ^ (0xE5 ^ 0x94)) << " ".length() ^ -" ".length())) != 0) {
                return;
            }
        }
    }

    private void solveA() {
        Main lIIIIIIIllIlll;
        int IIIIIIIIllIlll = Integer.parseInt(lIIIIIIIllIlll.next());
        int llllllllIlIlll = Integer.parseInt(lIIIIIIIllIlll.next());
        lIIIIIIIllIlll.out.print(IIIIIIIIllIlll + llllllllIlIlll / IIllIIIIl[2]);
        lIIIIIIIllIlll.out.println(llIlIIIIl[IIllIIIIl[1]]);
    }

    private void solveB() {
        Main IllIllllIlIlll;
        int lIlIllllIlIlll = Integer.parseInt(IllIllllIlIlll.next());
        int IIlIllllIlIlll = Integer.parseInt(IllIllllIlIlll.next());
        int llIIllllIlIlll = Integer.parseInt(IllIllllIlIlll.next());
        double[][] IlIIllllIlIlll = new double[lIlIllllIlIlll][IIllIIIIl[2]];
        int lIIIllllIlIlll = IIllIIIIl[1];
        double IIIIllllIlIlll = 9.99999999E8;
        int llllIlllIlIlll = IIllIIIIl[1];
        while (Main.lllIlIIlll(llllIlllIlIlll, IlIIllllIlIlll.length)) {
            IlIIllllIlIlll[llllIlllIlIlll][Main.IIllIIIIl[1]] = IllIllllIlIlll.nextInt();
            IlIIllllIlIlll[llllIlllIlIlll][Main.IIllIIIIl[3]] = (double)IIlIllllIlIlll - IlIIllllIlIlll[llllIlllIlIlll][IIllIIIIl[1]] * 0.006;
            if (Main.IIIllIIlll(Main.IllIlIIlll(Math.abs((double)llIIllllIlIlll - IlIIllllIlIlll[llllIlllIlIlll][IIllIIIIl[3]]), IIIIllllIlIlll))) {
                IIIIllllIlIlll = Math.abs((double)llIIllllIlIlll - IlIIllllIlIlll[llllIlllIlIlll][IIllIIIIl[3]]);
                lIIIllllIlIlll = llllIlllIlIlll;
            }
            ++llllIlllIlIlll;
            "".length();
            if (" ".length() != 0) continue;
            return;
        }
        IllIllllIlIlll.out.println(lIIIllllIlIlll + IIllIIIIl[3]);
    }

    private void solveC() {
        Main IIllIlllIlIlll;
        int llIlIlllIlIlll = Integer.parseInt(IIllIlllIlIlll.next());
        IIllIlllIlIlll.out.println(llIlIIIIl[IIllIIIIl[3]]);
    }

    private void solveD() {
        Main IIIlIlllIlIlll;
        int lllIIlllIlIlll = Integer.parseInt(IIIlIlllIlIlll.next());
        IIIlIlllIlIlll.out.println(llIlIIIIl[IIllIIIIl[2]]);
    }

    private void solveE() {
        Main IIlIIlllIlIlll;
        int llIIIlllIlIlll = Integer.parseInt(IIlIIlllIlIlll.next());
        IIlIIlllIlIlll.out.println(llIlIIIIl[IIllIIIIl[4]]);
    }

    private void solveF() {
        Main IIIIIlllIlIlll;
        int lllllIllIlIlll = Integer.parseInt(IIIIIlllIlIlll.next());
        IIIIIlllIlIlll.out.println(llIlIIIIl[IIllIIIIl[5]]);
    }

    private boolean hasNextByte() {
        Main IIlllIllIlIlll;
        if (Main.lllIlIIlll(IIlllIllIlIlll.ptr, IIlllIllIlIlll.buflen)) {
            return IIllIIIIl[3];
        }
        IIlllIllIlIlll.ptr = IIllIIIIl[1];
        try {
            IIlllIllIlIlll.buflen = IIlllIllIlIlll.in.read(IIlllIllIlIlll.buffer);
            "".length();
        }
        catch (IOException llIllIllIlIlll) {
            llIllIllIlIlll.printStackTrace();
        }
        if (((0x93 ^ 0x9A) << (" ".length() << " ".length()) & ~((0x94 ^ 0x9D) << (" ".length() << " ".length()))) != 0) {
            return (" ".length() << ("   ".length() << " ".length()) & ~(" ".length() << ("   ".length() << " ".length()))) != 0;
        }
        if (Main.lIIllIIlll(IIlllIllIlIlll.buflen)) {
            return IIllIIIIl[1];
        }
        return IIllIIIIl[3];
    }

    private int readByte() {
        Main lIIllIllIlIlll;
        if (Main.IlIllIIlll(lIIllIllIlIlll.hasNextByte() ? 1 : 0)) {
            int n = lIIllIllIlIlll.ptr;
            lIIllIllIlIlll.ptr = n + IIllIIIIl[3];
            return lIIllIllIlIlll.buffer[n];
        }
        return IIllIIIIl[6];
    }

    private static boolean isPrintableChar(int lllIlIllIlIlll) {
        int n;
        if (Main.llIllIIlll(IIllIIIIl[7], lllIlIllIlIlll) && Main.llIllIIlll(lllIlIllIlIlll, IIllIIIIl[8])) {
            n = IIllIIIIl[3];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) <= 0) {
                return (((0x12 ^ 0x79) << " ".length() ^ 10 + 49 - -56 + 30) & (" ".length() ^ (0x47 ^ 0x64) << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            n = IIllIIIIl[1];
        }
        return n != 0;
    }

    private void skipUnprintable() {
        Main lIlIlIllIlIlll;
        while (Main.IlIllIIlll(lIlIlIllIlIlll.hasNextByte() ? 1 : 0) && Main.IIlllIIlll(Main.isPrintableChar(lIlIlIllIlIlll.buffer[lIlIlIllIlIlll.ptr]) ? 1 : 0)) {
            lIlIlIllIlIlll.ptr += IIllIIIIl[3];
            "".length();
            if ("   ".length() >= "   ".length()) continue;
            return;
        }
    }

    public boolean hasNext() {
        Main llIIlIllIlIlll;
        llIIlIllIlIlll.skipUnprintable();
        return this.hasNextByte();
    }

    public int nextInt() {
        Main lIIIlIllIlIlll;
        return Integer.parseInt(lIIIlIllIlIlll.next());
    }

    /*
     * WARNING - void declaration
     */
    public String next() {
        void var1_1;
        Main lIllIIllIlIlll;
        if (Main.IIlllIIlll(lIllIIllIlIlll.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        StringBuilder IIllIIllIlIlll = new StringBuilder();
        int llIlIIllIlIlll = lIllIIllIlIlll.readByte();
        while (Main.IlIllIIlll(Main.isPrintableChar(llIlIIllIlIlll) ? 1 : 0)) {
            IIllIIllIlIlll.appendCodePoint(llIlIIllIlIlll);
            "".length();
            llIlIIllIlIlll = lIllIIllIlIlll.readByte();
            "".length();
            if (-((0xC7 ^ 0x88) << " ".length() ^ (0xC1 ^ 0x8C) << " ".length()) < 0) continue;
            return null;
        }
        return String.valueOf(var1_1);
    }

    public long nextLong() {
        Main IllIIIllIlIlll;
        if (Main.IIlllIIlll(IllIIIllIlIlll.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        long lIlIIIllIlIlll = 0L;
        int IIlIIIllIlIlll = IIllIIIIl[1];
        int llIIIIllIlIlll = IllIIIllIlIlll.readByte();
        if (Main.lIlllIIlll(llIIIIllIlIlll, IIllIIIIl[9])) {
            IIlIIIllIlIlll = IIllIIIIl[3];
            llIIIIllIlIlll = IllIIIllIlIlll.readByte();
        }
        if (!Main.IllllIIlll(llIIIIllIlIlll, IIllIIIIl[10]) || Main.lllIlIIlll(IIllIIIIl[11], llIIIIllIlIlll)) {
            throw new NumberFormatException();
        }
        do {
            if (Main.llIllIIlll(IIllIIIIl[10], llIIIIllIlIlll) && Main.llIllIIlll(llIIIIllIlIlll, IIllIIIIl[11])) {
                lIlIIIllIlIlll *= 10L;
                lIlIIIllIlIlll += (long)(llIIIIllIlIlll - IIllIIIIl[10]);
                "".length();
                if (-" ".length() >= "   ".length()) {
                    return 0L;
                }
            } else {
                if (!Main.lllllIIlll(llIIIIllIlIlll, IIllIIIIl[6]) || Main.IIlllIIlll(Main.isPrintableChar(llIIIIllIlIlll) ? 1 : 0)) {
                    long l;
                    if (Main.IlIllIIlll(IIlIIIllIlIlll)) {
                        l = -lIlIIIllIlIlll;
                        "".length();
                        if (null != null) {
                            return 0L;
                        }
                    } else {
                        l = lIlIIIllIlIlll;
                    }
                    return l;
                }
                throw new NumberFormatException();
            }
            int n = this.readByte();
            "".length();
        } while (null == null);
        return 0L;
    }

    static {
        Main.IIlIlIIlll();
        Main.llIIlIIlll();
    }

    private static void llIIlIIlll() {
        llIlIIIIl = new String[IIllIIIIl[12]];
        Main.llIlIIIIl[Main.IIllIIIIl[1]] = Main.lIIIlIIlll("", "Spzpd");
        Main.llIlIIIIl[Main.IIllIIIIl[3]] = Main.lIIIlIIlll("", "QNrVq");
        Main.llIlIIIIl[Main.IIllIIIIl[2]] = Main.IlIIlIIlll("gX64wx5avDs=", "mRhGp");
        Main.llIlIIIIl[Main.IIllIIIIl[4]] = Main.lIIIlIIlll("", "TuKwP");
        Main.llIlIIIIl[Main.IIllIIIIl[5]] = Main.IlIIlIIlll("le8QgGr1Ies=", "tLAsw");
    }

    /*
     * Unable to fully structure code
     */
    private static String lIIIlIIlll(String lIIlllIlIlIlll, String IIIlllIlIlIlll) {
        lIIlllIlIlIlll = new String(Base64.getDecoder().decode(lIIlllIlIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        lllIllIlIlIlll = new StringBuilder();
        IllIllIlIlIlll = IIIlllIlIlIlll.toCharArray();
        lIlIllIlIlIlll = Main.IIllIIIIl[1];
        llIlIlIlIlIlll = lIIlllIlIlIlll.toCharArray();
        IIllIlIlIlIlll = llIlIlIlIlIlll.length;
        lIllIlIlIlIlll = Main.IIllIIIIl[1];
        "".length();
        if ("   ".length() != 0) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            IIlIllIlIlIlll = llIlIlIlIlIlll[lIllIlIlIlIlll];
            lllIllIlIlIlll.append((char)(IIlIllIlIlIlll ^ IllIllIlIlIlll[lIlIllIlIlIlll % IllIllIlIlIlll.length]));
            "".length();
            ++lIlIllIlIlIlll;
            ++lIllIlIlIlIlll;
lbl19:
            // 2 sources

            ** while (!Main.IllllIIlll((int)lIllIlIlIlIlll, (int)IIllIlIlIlIlll))
        }
lbl20:
        // 1 sources

        return String.valueOf(lllIllIlIlIlll);
    }

    private static String IlIIlIIlll(String IllIIlIlIlIlll, String lIlIIlIlIlIlll) {
        try {
            SecretKeySpec IIlIIlIlIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIlIlIlIlll.getBytes(StandardCharsets.UTF_8)), IIllIIIIl[13]), "DES");
            Cipher llIIIlIlIlIlll = Cipher.getInstance("DES");
            llIIIlIlIlIlll.init(IIllIIIIl[2], IIlIIlIlIlIlll);
            return new String(llIIIlIlIlIlll.doFinal(Base64.getDecoder().decode(IllIIlIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIIIlIlIlIlll) {
            IlIIIlIlIlIlll.printStackTrace();
            return null;
        }
    }

    private static void IIlIlIIlll() {
        IIllIIIIl = new int[14];
        Main.IIllIIIIl[0] = " ".length() << ((122 + 100 - 110 + 59 ^ (0x97 ^ 0xC0) << " ".length()) << " ".length());
        Main.IIllIIIIl[1] = (0xF ^ 0x58 ^ (0xA3 ^ 0xAC) << "   ".length()) & (0x70 ^ 0x13 ^ (0xD5 ^ 0xC6) << (" ".length() << " ".length()) ^ -" ".length());
        Main.IIllIIIIl[2] = " ".length() << " ".length();
        Main.IIllIIIIl[3] = " ".length();
        Main.IIllIIIIl[4] = "   ".length();
        Main.IIllIIIIl[5] = " ".length() << (" ".length() << " ".length());
        Main.IIllIIIIl[6] = -" ".length();
        Main.IIllIIIIl[7] = 0x4C ^ 9 ^ (0x73 ^ 0x6A) << (" ".length() << " ".length());
        Main.IIllIIIIl[8] = (0xA7 ^ 0x98) << " ".length();
        Main.IIllIIIIl[9] = 69 + 154 - 157 + 93 ^ (0x2E ^ 0x77) << " ".length();
        Main.IIllIIIIl[10] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
        Main.IIllIIIIl[11] = 0x12 ^ 0x2B;
        Main.IIllIIIIl[12] = 0x13 ^ 0x16;
        Main.IIllIIIIl[13] = " ".length() << "   ".length();
    }

    private static boolean lIlllIIlll(int n, int n2) {
        return n == n2;
    }

    private static boolean IllllIIlll(int n, int n2) {
        return n >= n2;
    }

    private static boolean lllIlIIlll(int n, int n2) {
        return n < n2;
    }

    private static boolean llIllIIlll(int n, int n2) {
        return n <= n2;
    }

    private static boolean lIlIlIIlll(Object object) {
        return object != null;
    }

    private static boolean IlIllIIlll(int n) {
        return n != 0;
    }

    private static boolean IIlllIIlll(int n) {
        return n == 0;
    }

    private static boolean IIIllIIlll(int n) {
        return n < 0;
    }

    private static boolean lIIllIIlll(int n) {
        return n <= 0;
    }

    private static boolean lllllIIlll(int n, int n2) {
        return n != n2;
    }

    private static int IllIlIIlll(double d, double d2) {
        return d == d2 ? 0 : (d < d2 ? -1 : 1);
    }
}

