/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

class Pair {
    public int x;
    public int y;
    private static int[] lIlIlllIll;

    public Pair(int lIlIIIIIIIIlIll, int IIlIIIIIIIIlIll) {
        Pair IllIIIIIIIIlIll;
        IllIIIIIIIIlIll.x = lIlIIIIIIIIlIll;
        IllIIIIIIIIlIll.y = IIlIIIIIIIIlIll;
    }

    public boolean equals(Object lllllllllllIIll) {
        int n;
        Pair IIIIIIIIIIIlIll;
        if (Pair.lIllllIlIIll(lllllllllllIIll, IIIIIIIIIIIlIll)) {
            return lIlIlllIll[0];
        }
        if (Pair.IlllllIlIIll(lllllllllllIIll instanceof Pair)) {
            return lIlIlllIll[1];
        }
        Pair IllllllllllIIll = (Pair)lllllllllllIIll;
        if (Pair.llllllIlIIll(IIIIIIIIIIIlIll.x, IllllllllllIIll.x) && Pair.llllllIlIIll(IIIIIIIIIIIlIll.y, IllllllllllIIll.y)) {
            n = lIlIlllIll[0];
            "".length();
            if (-"  ".length() >= 0) {
                return (((0xCC ^ 0xC3) << " ".length() ^ (0x45 ^ 0x14)) & (0x50 ^ 0x1B ^ " ".length() << (" ".length() << " ".length()) ^ -" ".length())) != 0;
            }
        } else {
            n = lIlIlllIll[1];
        }
        return n != 0;
    }

    public int hashCode() {
        int[] nArray = new int[lIlIlllIll[2]];
        nArray[Pair.lIlIlllIll[1]] = this.x;
        nArray[Pair.lIlIlllIll[0]] = this.y;
        return Arrays.hashCode(nArray);
    }

    public String toString() {
        Pair IlIllllllllIIll;
        return "(" + IlIllllllllIIll.x + ", " + this.y + ")";
    }

    static {
        Pair.IIllllIlIIll();
    }

    private static void IIllllIlIIll() {
        lIlIlllIll = new int[3];
        Pair.lIlIlllIll[0] = " ".length();
        Pair.lIlIlllIll[1] = "   ".length() << "   ".length() & ("   ".length() << "   ".length() ^ -" ".length());
        Pair.lIlIlllIll[2] = " ".length() << " ".length();
    }

    private static boolean llllllIlIIll(int n, int n2) {
        return n == n2;
    }

    private static boolean lIllllIlIIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean IlllllIlIIll(int n) {
        return n == 0;
    }
}

