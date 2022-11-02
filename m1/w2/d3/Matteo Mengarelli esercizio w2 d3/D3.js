/* ESERCIZIO 1
 Scrivi un algoritmo per trovare il più grande tra due numeri interi.
*/

let a = 11;
let b = 5;
if(a > b){
  console.log(a,'>',b)
}else if(b > a){
  console.log(b,'','>','',a)
}else{
  console.log(a,'','e','',b,' sono uguali')
}

/* ESERCIZIO 2
  Scrivi un algoritmo che mostri "not equal" in console se un numero intero fornito è diverso da 5.
*/

let c = 10;
if(c == 5){
  console.log('equal')
}else{
  console.log('not equal')
}

/* ESERCIZIO 3
  Scrivi un algoritmo che mostri "divisibile per 5" in console se un numero fornito è perfettamente divisibile per 5 (suggerimento: cerca l'operatore modulo su un motore di ricerca)
*/

let d = 15;
if((d % 5) == 0){
  console.log('divisibile')
}else{
  console.log('non divisibile')
}

/* ESERCIZIO 4
  Scrivi un algoritmo per verificare che, dati due numeri interi, il valore di uno di essi sia 8 oppure se la loro addizione/sottrazione sia uguale a 8.
*/

let e = 2;
let f = 8;
if((e == 8) || (f == 8 ) || ((e + f) == 8)){
  console.log(true)
}else{
  console.log(false)
}

/* ESERCIZIO 5
  Stai lavorando su un sito di e-commerce. Stai salvando il saldo totale del carrello dell'utente in una variabile "totalShoppingCart".
  C'è una promozione in corso: se il totale del carrello supera 50, l'utente ha diritto alla spedizione gratuita (altrimenti la spedizione ha un costo fisso pari a 10).
  Crea un algoritmo che determini l'ammontare totale che deve essere addebitato all'utente per il checkout.
*/

let carrello = {
    prodotto1: 20,
    prodotto2: 1,
    prodotto3: 22
}
let prezzo = carrello.prodotto1 + carrello.prodotto2 + carrello.prodotto3
if(prezzo > 50){
  console.log('SPEDIZIONE GRATUITA')
}else{
  console.log('Il costo totale è ',prezzo,' più 10 di spedizione')
}

/* ESERCIZIO 6
  Stai lavorando su un sito di e-commerce. Oggi è il Black Friday e viene applicato il 20% su ogni prodotto.
  Modifica la risposta precedente includendo questa nuova promozione nell'algoritmo, determinando come prima se le spedizioni sono gratuite oppure no e e calcolando il totale.
*/

let sconto = 0.8;
let carrelloScontato = {
  prodotto1: 200 * sconto,
  prodotto2: 1 * sconto,
  prodotto3: 22 * sconto
}
let prezzoScontato = carrelloScontato.prodotto1 + carrelloScontato.prodotto2 + carrelloScontato.prodotto3
if(prezzoScontato > 50){
console.log('SPEDIZIONE GRATUITA')
}else{
console.log('Il costo totale è ',prezzoScontato,' più 10 di spedizione')
}

/* ESERCIZIO 7
  Crea tre variabili, e assegna un valore numerico a ciascuna di esse.
  Utilizzando un blocco condizionale, crea un algoritmo per ordinarle secondo il loro valore, dal più alto al più basso.
  Alla fine mostra il risultato in console.
*/

let x = 10;
let y = 19;
let z = 25;
if((x > y) && (x > z) && (y > z)){
  console.log(x,'>',y,'>',z)
}else if((x > y) && (x > z) && (z > y)){
  console.log(x,'>',z,'>',y)
}else if((y > x) && (y > z) && (x > z)){
  console.log(y,'>',x,'>',z)
}else if((y > x) && (y > z) && (z > x)){
  console.log(y,">",z,'>',x)
}else if((z > x) && (z > y) && (x > y)){
  console.log(z,'>',x,'>',y)
}else{
  console.log(z,'>',y,'>',x)
}

/* ESERCIZIO 8
  Crea un algoritmo per verificare che un valore fornito sia un numero oppure no (suggerimento: cerca su un motore di ricerca "typeof").
*/

let p = 23;
if(typeof p == 'number'){
  console.log('numero')
}else{
  console.log('non è un numero')
}

/* ESERCIZIO 9
  Crea un algoritmo per controllare se un numero fornito sia pari o dispari (suggerimento: cerca l'operatore modulo su un motore di ricerca)
*/

let t = 5;
if((t % 2) == 0){
  console.log('numero pari')
}else{
  console.log('numero dispari')
}

/* ESERCIZIO 10
  Modifica la logica del seguente algoritmo in modo che mostri in console il messaggio corretto in ogni circostanza.
  let val = 7
  if (val < 10) {
      console.log("Meno di 10");
    } else if (val < 5) {
      console.log("Meno di 5");
    } else {
      console.log("Uguale a 10 o maggiore");
    }
*/

let val = 10
if ((val < 10) && (val >= 5)) {
    console.log("Meno di 10");
  } else if (val < 5) {
    console.log("Meno di 5");
  } else {
    console.log("Uguale a 10 o maggiore");
  }

/* ESERCIZIO 11
  Fornito il seguente oggetto, scrivi del codice per aggiungere una proprietà "city", il cui valore sarà "Toronto".
*/

const me = {
  name: 'John',
  lastName: 'Doe',
  skills: ['javascript', 'html', 'css'],
}
me.city = 'Toronto';
console.log(me)

/* ESERCIZIO 12
  Lavorando sempre sull'oggetto precedentemente fornito, scrivi del codice per rimuovere la proprietà "lastName".
*/

const me1 = {
  name: 'John',
  lastName: 'Doe',
  skills: ['javascript', 'html', 'css'],
}
me1.city = 'Toronto';
delete me1.lastName;
console.log(me1)

/* ESERCIZIO 13
  Lavorando sempre sull'oggetto precedentemente fornito, scrivi del codice per rimuovere l'ultimo elemento della proprietà "skills".
*/

const me2 = {
  name: 'John',
  lastName: 'Doe',
  skills: ['javascript', 'html', 'css'],
}
me2.city = 'Toronto';
delete me2.lastName;
me2.skills.splice(2,1)
console.log(me2)

/* ESERCIZIO 14
  Scrivi del codice per creare un array inizialmente vuoto. Riempilo successivamente con i numeri da 1 a 10.
*/

let arr = []
arr.push('1')
arr.push('2')
arr.push('3')
arr.push('4')
arr.push('5')
arr.push('6')
arr.push('7')
arr.push('8')
arr.push('9')
arr.push('10')
console.log(arr)

/* ESERCIZIO 15
  Scrivi del codice per sostituire l'ultimo elemento dell'array, ovvero il valore 10, con il valore 100.
*/

let arr1 = []
arr1.push('1')
arr1.push('2')
arr1.push('3')
arr1.push('4')
arr1.push('5')
arr1.push('6')
arr1.push('7')
arr1.push('8')
arr1.push('9')
arr1.push('10')
arr1.splice(9,1,'100')
console.log(arr1)
