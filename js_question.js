console.log('Start');
setTimeout(() => {
  console.log('Timeout');
}, 0);
Promise.resolve().then(() => {
  console.log('Promise');
});

(async () => {
  console.log('Async Start');
  await null;
  console.log('Async End');
})();

console.log('End');

// Second heighest salary in employee table



