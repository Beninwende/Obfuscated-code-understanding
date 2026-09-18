function adjac(ele, sub = []) {
  if (ele.length === 0) {
    return [sub];
  } else {
    let results = [];
    for (let j = ele[0] - 1; j <= ele[0] + 1; j++) {
      results = results.concat(adjac(ele.slice(1), sub.concat(j)));
    }
    return results;
  }
}

function getCoordinates(testTup) {
  return adjac(testTup);
}
