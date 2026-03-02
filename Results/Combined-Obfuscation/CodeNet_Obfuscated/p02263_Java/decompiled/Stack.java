/*
 * Decompiled with CFR 0.152.
 */
class Stack {
    private int top = llIllIIlIl[0];
    private int[] S = new int[llIllIIlIl[1]];
    private static final int MAX;
    private static int[] llIllIIlIl;

    Stack() {
        Stack llllIIlllIIl;
    }

    public void initialize() {
        lIllIIlllIIl.top = llIllIIlIl[0];
    }

    public boolean isEmpty() {
        boolean bl;
        Stack llIlIIlllIIl;
        if (Stack.IIllIIlIlIIl(llIlIIlllIIl.top)) {
            bl = llIllIIlIl[2];
            "".length();
            if (" ".length() <= 0) {
                return ((0 ^ 0x55) & ~(0x76 ^ 0x23)) != 0;
            }
        } else {
            bl = llIllIIlIl[0];
        }
        return bl;
    }

    public boolean isFull() {
        boolean bl;
        Stack lIIlIIlllIIl;
        if (Stack.lIllIIlIlIIl(lIIlIIlllIIl.top, llIllIIlIl[3])) {
            bl = llIllIIlIl[2];
            "".length();
            if (((9 ^ 0xC) << (0x14 ^ 0x11) ^ 89 + 36 - 24 + 64) == 0) {
                return ((" ".length() << (" ".length() << " ".length()) ^ (0x32 ^ 0x27)) & ((0x4B ^ 0x58) << "   ".length() ^ 23 + 4 - -83 + 27 ^ -" ".length())) != 0;
            }
        } else {
            bl = llIllIIlIl[0];
        }
        return bl;
    }

    public void push(int lIlIIIlllIIl) {
        IllIIIlllIIl.top += llIllIIlIl[2];
        IllIIIlllIIl.S[IllIIIlllIIl.top] = lIlIIIlllIIl;
    }

    public int pop() {
        llIIIIlllIIl.top -= llIllIIlIl[2];
        return this.S[this.top + llIllIIlIl[2]];
    }

    static {
        Stack.IIlIIIlIlIIl();
        MAX = llIllIIlIl[4];
    }

    private static void IIlIIIlIlIIl() {
        llIllIIlIl = new int[5];
        Stack.llIllIIlIl[0] = (0x3F ^ 0x76) & ~(0xDC ^ 0x95);
        Stack.llIllIIlIl[1] = (0x7E ^ 0x67) << "   ".length();
        Stack.llIllIIlIl[2] = " ".length();
        Stack.llIllIIlIl[3] = 0xAA ^ 0xA3;
        Stack.llIllIIlIl[4] = (9 ^ 0xC) << " ".length();
    }

    private static boolean lIllIIlIlIIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean IIllIIlIlIIl(int n) {
        return n == 0;
    }
}

