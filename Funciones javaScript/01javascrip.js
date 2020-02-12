var json1={nombre1:"Edwin",edad:22,mascota:['Yogui'],colegio:{mobrecolegio:'salle'}};
console.log('hola');
console.log(json1.colegio.mobrecolegio);
var a='aaa';
let b=12;
console.log(a);
a=true
console.log(a);

var arreglo=['aa','aa','aaa',1,true,{asd:'ake'},25];
console.log(arreglo);
var json2={nombre1:"Jonathan",edad:10,mascota:['Yogui'],colegio:{mobrecolegio:'sucre'}};
console.log(json1+json2);
var nu=null;
console.log(typeof nu); 
console.log(typeof a); 
var numero=1;
console.log(json1+numero)
var booleano=true
console.log(booleano + numero)
console.log(null+numero);
console.log(undefined+numero);
console.log(undefined + ' the king ');

//funciones
var mifuncion=function(n1,n2){

//console.log('funcion 1');
return n1+n2;
};
//funciones flecha gorda
mifuncion();
console.log(mifuncion(5,25));
var miFuncionn= (n1,n2) => {

return n1+n2;

};

console.log(miFuncionn(1,2));
var jsonFunciones={
suma: () =>{

    return 2+4;

},
resta:() =>{
    return 10-5;
    
},
multiplicacion:() =>{
    return 10*5;
},
division:() =>{
    return 20/2;
}

};

console.log(jsonFunciones.suma());
console.log(jsonFunciones.resta());
console.log(jsonFunciones.multiplicacion());
console.log(jsonFunciones.division());

var num1=10;
var num2=15;
var numeroMenor = num2 > num1; 
var esIgual= num2===num1;
console.log('1'==1);
console.log(typeof numeroMenor);
 
if (!numeroMenor) {
    
} else {
    
}
