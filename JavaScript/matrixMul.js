const multiplyMatrices = (a, b) => {
   if (!Array.isArray(a) || !Array.isArray(b) || !a.length || !b.length) {
      throw new Error('arguments should be in 2-dimensional array format');
   }
   let x = a.length,
   z = a[0].length,
   y = b[0].length;
   if (b.length !== z) {
      throw new Error('number of columns in the first matrix should be
      the same as the number of rows in the second');
   }
   let productRow = Array.apply(null, new Array(y)).map(Number.prototype.valueOf, 0);
   let product = new Array(x);
   for (let p = 0; p < x; p++) {
      product[p] = productRow.slice();
   }
   for (let i = 0; i < x; i++) {
      for (let j = 0; j < y; j++) {
         for (let k = 0; k < z; k++) {
            product[i][j] += a[i][k] * b[k][j];
         }
      }
   }
   return product;
}
let a = [
   [1, 2, 1],
   [4, 5, 1],
   [1, 1, 1],
   [5, 7, 6]
];
let b = [
   [1, 4, 6],
   [2, 3, 2],
   [3, 7, 8],
   [1, 3, 6]
];

console.log(multiplyMatrices(a, b));