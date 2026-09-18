"use strict"
const YES = 'Yes'
const NO = 'No'
Object.entries = function (object) {
  return Object.keys(object).map(key => [key, object[key]])
}
const countChars = str =>
  Object.entries(str.split('')
    .reduce((c, curr, i) => {
      c[curr] = c[curr] || []
      c[curr].push(i)
      return c
    }, {})
  ).sort((a,b) => a[1].length - b[1].length || a[0].charCodeAt()-b[0].charCodeAt())

    
;(stdin => {
  const input = stdin.split('\n')
  const S = input[0]
  const T = input[1]
  if (S === T) return console.log(YES);
  const charsS = countChars(S)
  const charsT = countChars(T)
  if (charsS.length !== charsT.length) return console.log(NO)
  const startS = charsS.splice(0, 1)[0]
  const startT = charsT.splice(0, 1)[0]
  const startCharS = startS[0]
  const startCharT = startT[0]
  const startIndexesS = startS[1]
  const startIndexesT = startT[1]
  if (startCharS !== startCharT) return console.log(NO)
  if (startIndexesS.length !== startIndexesT.length) return console.log(NO)
  const rotations = []
  const len = S.length
  for (const iS of startIndexesS) {
    for (const iT of startIndexesT) {
      const gap = (iT - iS + len) % len
      if (rotations.indexOf(gap) !== -1) continue;
      rotations.push(gap)
    }
  }
  
  for (let i = 0; i<charsS.length; i++) {
    const charS = charsS[i][0]
    const indexesS = charsS[i][1]
    const charT = charsT[i][0]
    const indexesT = charsT[i][1]
    if (charS !== charT) return console.log(NO)
    if (indexesS.length !== indexesT.length) return console.log(NO)
    for (const iS of indexesS) {
      for (let i=0; i<rotations.length; i++) {
        const rotated = (iS + rotations[i]) % len
        if (indexesT.indexOf(rotated) !== -1) continue;
        rotations.splice(i--, 1)
      }
      if (!rotations.length) return console.log(NO)
    }
  }
  console.log(YES)
})(require('fs').readFileSync('/dev/stdin', 'utf-8'))
