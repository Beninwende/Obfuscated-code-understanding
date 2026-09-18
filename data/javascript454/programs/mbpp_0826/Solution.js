function checkTypeOfTriangle(a, b, c) {
  const sqa = Math.pow(a, 2);
  const sqb = Math.pow(b, 2);
  const sqc = Math.pow(c, 2);
  if (sqa === sqa + sqb || sqb === sqa + sqc || sqc === sqa + sqb) {
    return "Right-angled Triangle";
  } else if (sqa > sqc + sqb || sqb > sqa + sqc || sqc > sqa + sqb) {
    return "Obtuse-angled Triangle";
  } else {
    return "Acute-angled Triangle";
  }
}
