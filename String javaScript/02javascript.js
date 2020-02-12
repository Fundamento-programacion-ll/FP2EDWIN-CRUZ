var nombre='Edwin cq';
console.log(nombre.indexOf('n'));
console.log(nombre.substr(2,4));
String.prototype.reverse = function() {

	var x = this.length;
	var cadena = "";
	while (x>=0) {
        cadena = cadena + this.charAt(x);
		x--;
	}
	return cadena;
	
};
console.log("La cadena " + nombre + " invertida es " + nombre.reverse());

console.log(nombre.slice(1,6));
console.log(nombre.split(","));
var texto="Hola que hace";
console.log("Antes de Reemplazar" + texto);
console.log(texto.replace('que hace','khe'))
var ejemploTrin="                    Hola   ";
console.log(ejemploTrin.trim());
console.log(ejemploTrin.concat(" ",nombre));
console.log(texto.localeCompare("Hola"));
console.log(nombre.toUpperCase());
console.log(texto.toLowerCase());

//primera palabra,inicio,mitad ,final en mayuscula
//contar cuantos puntos y comas

var nombre2=["edwin", "cruz" ,"quelal"];
var primero=nombre2[0];
console.log("Pimera Palabra Convertida : " + primero.toUpperCase());
var ultimo = nombre2[nombre2.length - 1];
console.log("Ultima Palabra Convertida : "+ ultimo.toUpperCase());

nombre2.forEach(function (elemento, indice, array) {
    console.log(elemento, indice);
});

var lg = nombre2.length;
var notmod = "";
var acum = 0;
var acum2 = 0;
var acum3 = 0;
while (lg >= 0) {
    if (nombre2.charAt(lg) == ";") {
        acum++
    }
    if (nombre2.charAt(lg) == ",") {
        acum2++
    }
    if (nombre2.charAt(lg) == ".") {
        acum3++
    }
    lg--
}
while (lg >= 0) {
    if (nombre2.charAt(lg) == " ") {
        notmod = nombre2.replace(" ", "_");
    }

    lg--
}

console.log("el numero de ; es:", acum, "el numero de , es:", acum2, " el numero de . es", acum3);
console.log(notmod);