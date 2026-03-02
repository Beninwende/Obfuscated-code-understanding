/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.Iterator;
import java.util.Stack;

class Main {
    private static int[] IllIlIIlIl;

    Main() {
        Main lIIlIlIIIlIl;
    }

    public static void main(String[] stringArray) throws IOException {
        Scan lIIIIlIIIlIl = new Scan();
        char[] IIIIIlIIIlIl = lIIIIlIIIlIl.scanString().toCharArray();
        Stack<Character> lllllIIIIlIl = new Stack<Character>();
        Object IllllIIIIlIl = IIIIIlIIIlIl;
        int lIlllIIIIlIl22 = ((char[])IllllIIIIlIl).length;
        char IIlllIIIIlIl = IllIlIIlIl[0];
        while (Main.lllIllIIlIIl(IIlllIIIIlIl, lIlllIIIIlIl22)) {
            char llIllIIIIlIl = IllllIIIIlIl[IIlllIIIIlIl];
            if (Main.IIIlllIIlIIl(llIllIIIIlIl, IllIlIIlIl[1])) {
                lllllIIIIlIl.push(Character.valueOf(llIllIIIIlIl));
                "".length();
                "".length();
                if (" ".length() == " ".length() << " ".length()) {
                    return;
                }
            } else if (Main.lIIlllIIlIIl(lllllIIIIlIl.isEmpty() ? 1 : 0)) {
                lllllIIIIlIl.pop();
                "".length();
            }
            ++IIlllIIIIlIl;
            "".length();
            if (-"   ".length() < 0) continue;
            return;
        }
        IllllIIIIlIl = new StringBuilder();
        Iterator lIlllIIIIlIl22 = lllllIIIIlIl.iterator();
        while (Main.IlIlllIIlIIl(lIlllIIIIlIl22.hasNext() ? 1 : 0)) {
            IIlllIIIIlIl = ((Character)lIlllIIIIlIl22.next()).charValue();
            ((StringBuilder)IllllIIIIlIl).append(IIlllIIIIlIl);
            "".length();
            "".length();
            if (" ".length() << (" ".length() << " ".length()) > " ".length()) continue;
            return;
        }
        System.out.println(IllllIIIIlIl);
    }

    static {
        Main.IllIllIIlIIl();
    }

    private static void IllIllIIlIIl() {
        IllIlIIlIl = new int[2];
        Main.IllIlIIlIl[0] = ((0x60 ^ 0x51) << " ".length() ^ (0x81 ^ 0xC0)) & (0xA1 ^ 0x8A ^ " ".length() << "   ".length() ^ -" ".length());
        Main.IllIlIIlIl[1] = (0x7C ^ 0x5D) << " ".length();
    }

    private static boolean lllIllIIlIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean IlIlllIIlIIl(int n) {
        return n != 0;
    }

    private static boolean lIIlllIIlIIl(int n) {
        return n == 0;
    }

    private static boolean IIIlllIIlIIl(int n, int n2) {
        return n != n2;
    }
}

