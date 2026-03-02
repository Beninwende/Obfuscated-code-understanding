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
    private static String[] lIIlIl;
    private static int[] IIIIll;

    public InputReader(InputStream IllllllIIlIllIl) {
        super(new InputStreamReader(IllllllIIlIllIl), IllIIl[IIIIll[0]]);
        InputReader lllllllIIlIllIl;
    }

    public InputReader(String IIIllllIIlIllIl) {
        super(new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream(IIIllllIIlIllIl)));
        InputReader lIIllllIIlIllIl;
    }

    public String next() {
        InputReader llIIlllIIlIllIl;
        while (!InputReader.IIlIlll(InputReader.lIllIll(llIIlllIIlIllIl.tokenizer) ? 1 : 0) || InputReader.IIlIlll(InputReader.IlllIll(llIIlllIIlIllIl.tokenizer.hasMoreTokens() ? 1 : 0) ? 1 : 0)) {
            try {
                llIIlllIIlIllIl.tokenizer = new StringTokenizer(llIIlllIIlIllIl.readLine());
                lIIlIl[IIIIll[0]].length();
                "".length();
            }
            catch (IOException IlIIlllIIlIllIl) {
                throw new RuntimeException();
            }
            if (!InputReader.lIlIlll(lIIlIl[IIIIll[1]].length() << lIIlIl[IIIIll[2]].length())) continue;
            return null;
        }
        return this.tokenizer.nextToken();
    }

    public Integer nextInt() {
        InputReader IlllIllIIlIllIl;
        return Integer.valueOf(IlllIllIIlIllIl.next());
    }

    public Long nextLong() {
        InputReader llIlIllIIlIllIl;
        return Long.valueOf(llIlIllIIlIllIl.next());
    }

    static {
        InputReader.llIIlll();
        InputReader.IIllIll();
    }

    private static void IIllIll() {
        IllIIl = new int[IIIIll[1]];
        InputReader.IllIIl[InputReader.IIIIll[0]] = lIIlIl[IIIIll[3]].length() << ((IIIIll[4] ^ IIIIll[5]) << lIIlIl[IIIIll[6]].length() ^ IIIIll[7] + IIIIll[8] - IIIIll[9] + IIIIll[10]);
    }

    private static boolean lIllIll(Object object) {
        boolean bl;
        if (InputReader.IllIlll(object)) {
            bl = IIIIll[1];
            "".length();
            if (-"  ".length() >= 0) {
                return ((140 + 52 - 154 + 141 ^ (0x10 ^ 0x39) << (" ".length() << " ".length())) << (" ".length() << " ".length()) & (((1 ^ 0x2A) << " ".length() ^ (0x24 ^ 0x65)) << (" ".length() << " ".length()) ^ -" ".length())) != 0;
            }
        } else {
            bl = IIIIll[0];
        }
        return bl;
    }

    private static boolean IlllIll(int n) {
        boolean bl;
        if (InputReader.lIlIlll(n)) {
            bl = IIIIll[1];
            "".length();
            if (-"  ".length() > 0) {
                return (" ".length() << " ".length() & (" ".length() << " ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = IIIIll[0];
        }
        return bl;
    }

    private static void llIIlll() {
        IIIIll = new int[11];
        InputReader.IIIIll[0] = ((0xBE ^ 0xA3) << (" ".length() << " ".length()) ^ 107 + 9 - 111 + 122) << "   ".length() & ((160 + 134 - 177 + 60 ^ (0x5D ^ 0) << " ".length()) << "   ".length() ^ -" ".length());
        InputReader.IIIIll[1] = " ".length();
        InputReader.IIIIll[2] = " ".length() << " ".length();
        InputReader.IIIIll[3] = "   ".length();
        InputReader.IIIIll[4] = (0x8C ^ 0x9B) << (" ".length() << " ".length());
        InputReader.IIIIll[5] = 0x4C ^ 0x41;
        InputReader.IIIIll[6] = " ".length() << (" ".length() << " ".length());
        InputReader.IIIIll[7] = (0xFC ^ 0x99 ^ (0xAD ^ 0x90) << " ".length()) << (" ".length() << " ".length());
        InputReader.IIIIll[8] = ((0x79 ^ 0x6A) << " ".length() ^ "   ".length()) << " ".length();
        InputReader.IIIIll[9] = ((0x53 ^ 0x54) << "   ".length() ^ (0xAD ^ 0x8E)) << (" ".length() << " ".length());
        InputReader.IIIIll[10] = 0xC2 ^ 0x91;
    }

    private static boolean IllIlll(Object object) {
        return object != null;
    }

    private static boolean IIlIlll(int n) {
        return n != 0;
    }

    private static boolean lIlIlll(int n) {
        return n == 0;
    }

    static class OutputWriter
    extends PrintWriter {
        public OutputWriter(OutputStream llIIlIIlIlIllIl) {
            super(llIIlIIlIlIllIl);
            OutputWriter IIlIlIIlIlIllIl;
        }

        public OutputWriter(Writer lIllIIIlIlIllIl) {
            super(lIllIIIlIlIllIl);
            OutputWriter IlllIIIlIlIllIl;
        }

        public OutputWriter(String lllIIIIlIlIllIl) throws FileNotFoundException {
            super(lllIIIIlIlIllIl);
            OutputWriter IIIlIIIlIlIllIl;
        }

        @Override
        public void close() {
            OutputWriter llIIIIIlIlIllIl;
            super.close();
        }
    }
}

