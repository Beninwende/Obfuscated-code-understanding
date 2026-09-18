public class FloatConverter {
    public static float[] floatToTuple(String testStr) {
        String[] parts = testStr.split(",\\s*");
        float[] tuple = new float[parts.length];
        for (int i = 0; i < parts.length; i++) {
            tuple[i] = Float.parseFloat(parts[i]);
        }
        return tuple;
    }
}
