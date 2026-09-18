'use strict'

function main (s) {
  let start = 0
  let end = s.length - 1
  let sArray = s.split('')
  while (sArray[start] !== 'A') {
    start++
  }
  while (sArray[end] !== 'Z') {
    end--
  }
  let len = end - start + 1
  console.log(len)
}

function doMain () {
  let input = ''
  process.stdin.resume()
  process.stdin.setEncoding('utf8')
  process.stdin.on('data', (chunk) => {
    input += chunk
  })
  process.stdin.on('end', () => {
    input = input.trim()
    main(input)
  })
}

doMain()
