/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

class AtCoder {
    final int H;
    final int N;
    final int[] A;
    private static String[] lIIlIlIlIl;
    private static int[] llIlIlIlIl;

    AtCoder(FastScanner IIlIIllIIIIl) {
        AtCoder lIlIIllIIIIl;
        lIlIIllIIIIl.H = IIlIIllIIIIl.nextInt();
        lIlIIllIIIIl.N = IIlIIllIIIIl.nextInt();
        lIlIIllIIIIl.A = new int[lIlIIllIIIIl.N];
        int llIIIllIIIIl = llIlIlIlIl[0];
        while (AtCoder.lIlllllIlIIl(llIIIllIIIIl, lIlIIllIIIIl.A.length)) {
            lIlIIllIIIIl.A[llIIIllIIIIl] = IIlIIllIIIIl.nextInt();
            ++llIIIllIIIIl;
            "".length();
            if (-" ".length() <= "   ".length()) continue;
            throw null;
        }
    }

    void solve(PrintWriter lIlllIlIIIIl) {
        AtCoder IllllIlIIIIl;
        int IIlllIlIIIIl = IllllIlIIIIl.H;
        int llIllIlIIIIl = llIlIlIlIl[0];
        while (AtCoder.lIlllllIlIIl(llIllIlIIIIl, IllllIlIIIIl.A.length)) {
            if (AtCoder.IllllllIlIIl(IIlllIlIIIIl -= IllllIlIIIIl.A[llIllIlIIIIl])) {
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
            } else {
                lIlllIlIIIIl.println(lIIlIlIlIl[llIlIlIlIl[0]]);
                "".length();
                if (((0xEE ^ 0xB9) & ~(0x78 ^ 0x2F)) == 0) break;
                return;
            }
            ++llIllIlIIIIl;
            "".length();
            if (null == null) continue;
            return;
        }
        if (AtCoder.IllllllIlIIl(IIlllIlIIIIl)) {
            lIlllIlIIIIl.println(lIIlIlIlIl[llIlIlIlIl[1]]);
        }
    }

    static {
        AtCoder.IIlllllIlIIl();
        AtCoder.IIIllllIlIIl();
    }

    private static void IIIllllIlIIl() {
        lIIlIlIlIl = new String[llIlIlIlIl[2]];
        AtCoder.lIIlIlIlIl[AtCoder.llIlIlIlIl[0]] = AtCoder.IIIIlllIlIIl("NyA4", "nEKDq");
        AtCoder.lIIlIlIlIl[AtCoder.llIlIlIlIl[1]] = AtCoder.IIIIlllIlIIl("LAI=", "bmKqD");
    }

    /*
     * Unable to fully structure code
     */
    private static String IIIIlllIlIIl(String lIIIlIlIIIIl, String IIIIlIlIIIIl) {
        lIIIlIlIIIIl = new String(Base64.getDecoder().decode(lIIIlIlIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        llllIIlIIIIl = new StringBuilder();
        IlllIIlIIIIl = IIIIlIlIIIIl.toCharArray();
        lIllIIlIIIIl = AtCoder.llIlIlIlIl[0];
        llIIIIlIIIIl = lIIIlIlIIIIl.toCharArray();
        IIlIIIlIIIIl = llIIIIlIIIIl.length;
        lIlIIIlIIIIl = AtCoder.llIlIlIlIl[0];
        "".length();
        if (-" ".length() != " ".length() << (" ".length() << " ".length())) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            IIllIIlIIIIl = llIIIIlIIIIl[lIlIIIlIIIIl];
            llllIIlIIIIl.append((char)(IIllIIlIIIIl ^ IlllIIlIIIIl[lIllIIlIIIIl % IlllIIlIIIIl.length]));
            "".length();
            ++lIllIIlIIIIl;
            ++lIlIIIlIIIIl;
lbl19:
            // 2 sources

            ** while (!AtCoder.lllllllIlIIl((int)lIlIIIlIIIIl, (int)IIlIIIlIIIIl))
        }
lbl20:
        // 1 sources

        return String.valueOf(llllIIlIIIIl);
    }

    private static void IIlllllIlIIl() {
        llIlIlIlIl = new int[3];
        AtCoder.llIlIlIlIl[0] = ((6 ^ 0x21) << " ".length() ^ (8 ^ 0x5F)) << " ".length() & ((0x1C ^ 0x55 ^ (0x3E ^ 0x3B) << (" ".length() << (" ".length() << " ".length()))) << " ".length() ^ -" ".length());
        AtCoder.llIlIlIlIl[1] = " ".length();
        AtCoder.llIlIlIlIl[2] = " ".length() << " ".length();
    }

    private static boolean lllllllIlIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIlllllIlIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IllllllIlIIl(int n) {
        return n > 0;
    }
}

