export const square = (num) => {
  if (num < 1 || num > 64) {
    throw new Error("square must be between 1 and 64");
  }
  return BigInt(2 ** (num -1));
  // return 1n << BigInt(num - 1);
};

export const total = () => {
  let count = BigInt(0);
  for (let i = 1; i < 65; i++) {
    count += square(i);
  }
  return count;
};