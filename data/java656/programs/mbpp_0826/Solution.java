public class TriangleType {
    public static String checkTypeOfTriangle(double a, double b, double c) {
        double sqa = Math.pow(a, 2);
        double sqb = Math.pow(b, 2);
        double sqc = Math.pow(c, 2);
        if (sqa == sqa + sqb || sqb == sqa + sqc || sqc == sqa + sqb) {
            return "Right-angled Triangle";
        } else if (sqa > sqc + sqb || sqb > sqa + sqc || sqc > sqa + sqb) {
            return "Obtuse-angled Triangle";
        } else {
            return "Acute-angled Triangle";
        }
    }
}
