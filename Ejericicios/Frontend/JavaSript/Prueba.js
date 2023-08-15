var variable;

var precio1 = 5;
var precio2 = 6;
var precioTotal = precio1 + precio2;

function varPrueba() {
  var x = 31;
  if (true) {
    var x = 71; // Misma variable!
    console.log(x); // Imprime el valor 71
  }
  console.log(x); // Imprime el valor 71
}
function letPrueba() {
  let x = 31;
  if (true) {
    let x = 71; // variable diferente
    console.log(x); // Imprime el valor 71
  }
  console.log(x); // Imprime el valor 31
}
