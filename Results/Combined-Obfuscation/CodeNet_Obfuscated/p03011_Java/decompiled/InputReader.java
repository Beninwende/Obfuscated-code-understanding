/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.StringTokenizer;

class InputReader
extends BufferedReader {
    StringTokenizer tokenizer;
    private static int[] IllIIl;

    public InputReader(InputStream lIIlIIllIlIllIl) {
        super(new InputStreamReader(lIIlIIllIlIllIl), IllIIl[0]);
        InputReader IlIlIIllIlIllIl;
    }

    public InputReader(String lIlIIIllIlIllIl) {
        super(new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream(lIlIIIllIlIllIl)));
        InputReader IllIIIllIlIllIl;
    }

    public String next() {
        InputReader IlIIIIllIlIllIl;
        while (!InputReader.lIllIll(IlIIIIllIlIllIl.tokenizer) || InputReader.IlllIll(IlIIIIllIlIllIl.tokenizer.hasMoreTokens() ? 1 : 0)) {
            try {
                IlIIIIllIlIllIl.tokenizer = new StringTokenizer(IlIIIIllIlIllIl.readLine());
                "".length();
            }
            catch (IOException lIIIIIllIlIllIl) {
                throw new RuntimeException();
            }
            if (" ".length() << " ".length() != 0) continue;
            return null;
        }
        return this.tokenizer.nextToken();
    }

    public Integer nextInt() {
        InputReader llllllIlIlIllIl;
        return Integer.valueOf(llllllIlIlIllIl.next());
    }

    public Long nextLong() {
        InputReader lIllllIlIlIllIl;
        return Long.valueOf(lIllllIlIlIllIl.next());
    }

    static {
        InputReader.IIllIll();
    }

    private static void IIllIll() {
        IllIIl = new int[1];
        InputReader.IllIIl[0] = " ".length() << ((0x5C ^ 0xD) << " ".length() ^ 124 + 74 - 108 + 83);
    }

    private static boolean lIllIll(Object object) {
        return object != null;
    }

    private static boolean IlllIll(int n) {
        return n == 0;
    }

    static class OutputWriter
    extends PrintWriter {
        public OutputWriter(OutputStream IlIllIlIIlIllIl) {
            super(IlIllIlIIlIllIl);
            OutputWriter llIllIlIIlIllIl;
        }

        public OutputWriter(Writer IlIIlIlIIlIllIl) {
            super(IlIIlIlIIlIllIl);
            OutputWriter llIIlIlIIlIllIl;
        }

        public OutputWriter(String IlIlIIlIIlIllIl) throws FileNotFoundException {
            super(IlIlIIlIIlIllIl);
            OutputWriter llIlIIlIIlIllIl;
        }

        @Override
        public void close() {
            OutputWriter IIlIIIlIIlIllIl;
            super.close();
        }
    }
}

