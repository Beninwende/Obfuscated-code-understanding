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

    public InputReader(InputStream IllIIIIllIIlIll) {
        super(new InputStreamReader(IllIIIIllIIlIll), IIllIllIll[0]);
        InputReader lllIIIIllIIlIll;
    }

    public InputReader(String IlIIIIIllIIlIll) {
        super(new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream(IlIIIIIllIIlIll)));
        InputReader llIIIIIllIIlIll;
    }

    public String next() {
        InputReader lllllllIlIIlIll;
        while (!InputReader.IIlIlIIlIIll(lllllllIlIIlIll.tokenizer) || InputReader.lIlIlIIlIIll(lllllllIlIIlIll.tokenizer.hasMoreTokens() ? 1 : 0)) {
            try {
                lllllllIlIIlIll.tokenizer = new StringTokenizer(lllllllIlIIlIll.readLine());
                "".length();
            }
            catch (IOException IllllllIlIIlIll) {
                throw new RuntimeException();
            }
            if ((((0x57 ^ 0x6A) << (" ".length() << " ".length()) ^ 62 + 116 - 158 + 143) & ((0x75 ^ 0x6C) << (" ".length() << " ".length()) ^ (0x85 ^ 0xB6) ^ -" ".length())) > -" ".length()) continue;
            return null;
        }
        return this.tokenizer.nextToken();
    }

    public Integer nextInt() {
        InputReader llIllllIlIIlIll;
        return Integer.valueOf(llIllllIlIIlIll.next());
    }

    public Long nextLong() {
        InputReader lIIllllIlIIlIll;
        return Long.valueOf(lIIllllIlIIlIll.next());
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
        return object != null;
    }

    private static boolean lIlIlIIlIIll(int n) {
        return n == 0;
    }
}

