var arreglo=[1,2,3,4,5];
var palabraString='Edwin';
var arregloPalabra=palabraString.split('');
//var arregloDividido=arreglo.slice(2,4);
//console.log(arregloPalabra.reverse())
//console.log(arreglo.length);
//console.log(arreglo.shift());
//console.log(arreglo.unshift(3));
//arreglo.push(6);
//console.log(arreglo.length);
//for (let index = 0; index < arreglo.length; index++) {
//	var element = arreglo[index];
//	console.log(arreglo[index]);

//}
//console.log(arregloDividido);
//arreglo.splice(2,3);
//console.log(arreglo);

/*arregloPalabra.forEach((elemento,indice)=>{
	console.log(elemento,indice);
});

var arregloMutado = arreglo.map((elemento,indice)=>{
	return elemento*2;
}).forEach((e,i)=>{
	console.log(e,i);
}).map((e)=>{
	console.log(e);

});
console.log(arregloMutado);
*/
/*var metodoSome=arreglo.some((e,i)=>{
	return e==2;
});
console.log(metodoSome);

var arregloX2=arreglo.forEach((elemento,indice)=>{
	console.log(elemento);
return elemento*2;
}).some(e=>{
	return e%2===0;
});
*/
//var metodoFilter=arreglo.filter((elemento,indice)=>{
//	return elemento===2;
//});
//console.log(metodoFilter);
var arregloJson=[{

nombre:'dfds',edad:123
},{
	nombre:'ds',edad:13


},{
	nombre:'d',edad:1

}];
console.log(arregloJson);
var total=0;
arregloJson.forEach(function(obj){
	total+=parseInt(obj.edad);
});
console.log(" La Suma de sus Edades son : " + total);

//eventos
const EventEmitter=require('events');
class eventUno extends EventEmitter{}

var instanciarEventos=new eventUno();
instanciarEventos.on('Saludar',respuesta=>{
	console.log('hola');
	console.log(respuesta, respuesta);
console.log(`fasdasvcx czx  czx  hola     
    
    czxcz`);


});
instanciarEventos.emit('saludar', 'edwin');
