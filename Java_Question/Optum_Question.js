// // Q1
// const person = {
//   name: "Jack",
//   hobbies: ["Music", "Cricket", "Travelling"], //

//   showHobbies() {
//     this.hobbies.forEach(function (hobby) {
//       console.log(`${this.name} likes ${hobby}`);
//     });
//   },
// };

// person.showHobbies();
// // Q2
// const obj = {
//   name: "jack",
//   age: 20,
//   print: () => {
//     console.log(this.name);
//   },
// };

// obj.print();

// // Q3
// console.log(undefined == null);
// typeof typeof null; // string

// // Q4
// // event propogation/capture/bubbling

// // Q5
// var addSix = test(6);
// function test(_data) {
//   return function (_test) {
//     return _test + _data;
//   };
// }
// console.log(addSix(10)); // returns 16
// console.log(addSix(21)); // returns 27

// // Q6
// let subject = new Subject();
// subject.next("b");
// subject.subscribe((value) => {
//   console.log("Subscription got", value);
// });
// subject.next("c");
// subject.next("d");

// // Q7
// let bSubject = new BehaviorSubject("a");
// bSubject.next("b");
// bSubject.subscribe((value) => {
//   console.log("Subscription got", value);
// });
// bSubject.next("c");
// bSubject.next("d");

// // Q8
// /*
// (Best way to load module in angular)
//  module 1 - 10mb 
//  module 2 - 10mb
//  module 3 - 10mb
//  module 4 - 100mb
//  */

// // Q9
// // bug first / error first

// // Q10
// let a = true;
// setTimeout(() => {
//   a = false;
// }, 2000);
// while (a) {
//   console.log("Welcome");
// }

// // Q11
// function test() {
//   setTimeout(() => {
//     console.log(x);
//     console.log(y);
//   }, 3000);

//   var x = 2;
//   let y = 12;
// }
// test();

// // Q12 - try the function without async await
// async function check(req, res) {
//   try {
//     const a = await someOtherFunction();
//     const b = await somethingElseFunction();
//     res.send("result");
//   } catch (error) {
//     res.send(error.stack);
//   }
// }
