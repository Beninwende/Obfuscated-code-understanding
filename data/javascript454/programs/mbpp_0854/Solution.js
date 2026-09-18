function rawHeap(arr) {
  const n = arr.length
  for (let i = Math.floor(n / 2) - 1; i >= 0; i--) {
    siftDown(arr, i, n)
  }
  return arr
}

function siftDown(arr, i, n) {
  while (true) {
    let left = 2 * i + 1
    if (left >= n) break
    let right = left + 1
    let j = right < n && arr[right] < arr[left] ? right : left
    if (arr[j] < arr[i]) {
      [arr[i], arr[j]] = [arr[j], arr[i]]
      i = j
    } else break
  }
}
