/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Main$Foster
 */
import java.io.PrintWriter;

public class Main {
    private static int[] IlllIlIIll;

    public Main() {
        Main llIIllllIlIIlll;
    }

    /*
     * WARNING - void declaration
     */
    static int matched(String llIlIlllIlIIlll, String IlIlIlllIlIIlll) {
        void var2_2;
        int lIIlIlllIlIIlll = IlllIlIIll[0];
        char[] IIIlIlllIlIIlll = llIlIlllIlIIlll.toCharArray();
        char[] lllIIlllIlIIlll = IlIlIlllIlIIlll.toCharArray();
        int IllIIlllIlIIlll = lllIIlllIlIIlll.length;
        int lIlIIlllIlIIlll = IlllIlIIll[0];
        while (Main.IIIIlIIlllIl(lIlIIlllIlIIlll, IllIIlllIlIIlll)) {
            if (Main.lIIIlIIlllIl(IIIlIlllIlIIlll[lIlIIlllIlIIlll], lllIIlllIlIIlll[lIlIIlllIlIIlll])) {
                ++lIIlIlllIlIIlll;
            }
            ++lIlIIlllIlIIlll;
            "".length();
            if (" ".length() > -" ".length()) continue;
            return ((0x9C ^ 0x95) << "   ".length() ^ (0x4E ^ 0x21)) & (0x42 ^ 0x21 ^ (0x65 ^ 0x74) << (" ".length() << " ".length()) ^ -" ".length());
        }
        return (int)var2_2;
    }

    public static void main(String[] stringArray) throws Exception {
        Foster IIlllIllIlIIlll = new Foster();
        PrintWriter llIllIllIlIIlll = new PrintWriter(System.out);
        String IlIllIllIlIIlll = IIlllIllIlIIlll.next();
        Object lIIllIllIlIIlll = IIlllIllIlIIlll.next();
        int IIIllIllIlIIlll = IlIllIllIlIIlll.length();
        int lllIlIllIlIIlll = ((String)lIIllIllIlIIlll).length();
        int IllIlIllIlIIlll = Main.matched(IlIllIllIlIIlll, (String)lIIllIllIlIIlll);
        int lIlIlIllIlIIlll = IlllIlIIll[0];
        while (Main.IIIIlIIlllIl(lIlIlIllIlIIlll, IIIllIllIlIIlll - lllIlIllIlIIlll)) {
            lIIllIllIlIIlll = "?" + (String)lIIllIllIlIIlll;
            IllIlIllIlIIlll = Math.max(IllIlIllIlIIlll, Main.matched(IlIllIllIlIIlll, (String)lIIllIllIlIIlll));
            ++lIlIlIllIlIIlll;
            "".length();
            if (" ".length() << " ".length() < "   ".length()) continue;
            return;
        }
        llIllIllIlIIlll.println(lllIlIllIlIIlll - IllIlIllIlIIlll);
        llIllIllIlIIlll.close();
    }

    static {
        Main.llllIIIlllIl();
    }

    private static void llllIIIlllIl() {
        IlllIlIIll = new int[1];
        Main.IlllIlIIll[0] = (0x36 ^ 0x11) & ~(0x12 ^ 0x35);
    }

    private static boolean lIIIlIIlllIl(int n, int n2) {
        return n == n2;
    }

    private static boolean IIIIlIIlllIl(int n, int n2) {
        return n < n2;
    }
}

