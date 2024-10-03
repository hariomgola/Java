/**
 * Scope Question
 */

let a1 = 10;
if (true) {
  let a1 = 20;
  function print_function() {
    console.log(">>>>>", a1);
  }
}

print_function();
console.log("Value of a - ", a1);

/**
 * another Scope Question (checking the difference b/w let and var)
 * Let - Give the error using the value before initialization
 * var - Gives the value as undefined for hosting
 */
if (true) {
  console.log(a, "---", b);
  let a = 20;
  let b = 30;
  function print_function() {
    console.log(">>>>>", a);
  }
}

if (true) {
  console.log(a, "---", b);
  var a = 20;
  var b = 30;
  function print_function() {
    console.log(">>>>>", a);
  }
}

/**
 * Prototyping in String
 */
console.clear();
String.prototype.removeDublicateValue = function (_data) {
  const _stringData = this.toString(); // get the data for the s
  const data = {};
  _stringData.split(" ").forEach((_str) => {
    data[_str.toLocaleLowerCase()] = _str;
  });
  return Object.keys(data).join(" ");
};

let s = "Hello this is Some string string";
s = s.removeDublicateValue();
console.log(">> ", s);

/**
 * Angular Questions
 * 1. Difference b/w structural and custom directives
 * 2. Fetch the data and show all data into the ui
 * 3. Difference b/w structural directive and behavioural Directive
 */
