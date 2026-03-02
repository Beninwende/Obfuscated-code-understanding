/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class InputReader
extends BufferedReader {
    StringTokenizer tokenizer;
    private static int[] IIllIllIll;

    public InputReader(InputStream llIlllIIlIIlIll) {
        super(new InputStreamReader(llIlllIIlIIlIll), IIllIllIll[0]);
        InputReader IIllllIIlIIlIll;
    }

    public InputReader(String lIlIllIIlIIlIll) {
        super(new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream(lIlIllIIlIIlIll)));
        InputReader IllIllIIlIIlIll;
    }

    public String next() {
        InputReader IIIIllIIlIIlIll;
        while (!InputReader.IllllIIlIIll(InputReader.IIlIlIIlIIll(IIIIllIIlIIlIll.tokenizer) ? 1 : 0) || InputReader.IllllIIlIIll(InputReader.lIlIlIIlIIll(IIIIllIIlIIlIll.tokenizer.hasMoreTokens() ? 1 : 0) ? 1 : 0)) {
            try {
                IIIIllIIlIIlIll.tokenizer = new StringTokenizer(IIIIllIIlIIlIll.readLine());
                "".length();
                "".length();
            }
            catch (IOException llllIlIIlIIlIll) {
                throw new RuntimeException();
            }
            if (!InputReader.lllllIIlIIll(((0x57 ^ 0x6A) << (" ".length() << " ".length()) ^ 62 + 116 - 158 + 143) & ((0x75 ^ 0x6C) << (" ".length() << " ".length()) ^ (0x85 ^ 0xB6) ^ -" ".length()), -" ".length())) continue;
            return null;
        }
        return this.tokenizer.nextToken();
    }

    public Integer nextInt() {
        InputReader llIlIlIIlIIlIll;
        return Integer.valueOf(llIlIlIIlIIlIll.next());
    }

    public Long nextLong() {
        InputReader IIIlIlIIlIIlIll;
        return Long.valueOf(IIIlIlIIlIIlIll.next());
    }

    static {
        InputReader.IlIIlIIlIIll();
    }

    static {
    }

    private static void IlIIlIIlIIll() {
        IIllIllIll = new int[1];
        InputReader.IIllIllIll[0] = " ".length() << (0xCA ^ 0xC5);
    }

    private static boolean IIlIlIIlIIll(Object object) {
        boolean bl;
        if (InputReader.IIIIIlIlIIll(object)) {
            bl = true;
            "".length();
            if ((0x4E ^ 0x4B) == 0) {
                return ((0x3F ^ 0x34) << (" ".length() << " ".length()) & ~((0x54 ^ 0x5F) << (" ".length() << " ".length()))) != 0;
            }
        } else {
            bl = false;
        }
        return bl;
    }

    private static boolean lIlIlIIlIIll(int n) {
        boolean bl;
        if (InputReader.lIIIIlIlIIll(n)) {
            bl = true;
            "".length();
            if (-(0x30 ^ 0x35) >= 0) {
                return ("   ".length() & ~"   ".length()) != 0;
            }
        } else {
            bl = false;
        }
        return bl;
    }

    private static boolean lllllIIlIIll(int n, int n2) {
        return n <= n2;
    }

    private static boolean IIIIIlIlIIll(Object object) {
        return object != null;
    }

    private static boolean IllllIIlIIll(int n) {
        return n != 0;
    }

    private static boolean lIIIIlIlIIll(int n) {
        return n == 0;
    }
}

