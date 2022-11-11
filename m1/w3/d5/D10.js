/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Se sei in difficoltà puoi chiedere aiuto a un Teaching Assistant
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per farlo puoi utilizzare il terminale Bash, quello di VSCode o quello del tuo sistema operativo (se utilizzi macOS o Linux)
*/

// JS Basics

/* ESERCIZIO A
  Crea una variabile chiamata "sum" e assegnaci il risultato della somma tra i valori 10 e 20.
*/

let sum = 10+20;      //variabile in cui si somma
console.log(sum);     //verifica somma

/* ESERCIZIO B
  Crea una variabile chiamata "random" e assegnaci un numero casuale tra 0 e 20 (deve essere generato dinamicamente a ogni esecuzione).
*/

let random = Math.floor(Math.random()*21);  //variabile random da 0 a 20
console.log(random);                        //verifica numero random

/* ESERCIZIO C
  Crea una variabile chiamata "me" e assegnaci un oggetto contenente le seguenti proprietà: name = il tuo nome, surname = il tuo cognome, age = la tua età.
*/

let object = {            //costruzione oggetto
  name: 'Matteo',         //assegnazione parametri
  cognome: 'Mengarelli',
  age: 22
}
let me = object;          //assegnazione alla variabile
console.log(me);          //verifica variabile

/* ESERCIZIO D
  Crea del codice per rimuovere programmaticamente la proprietà "age" dall'oggetto precedentemente creato.
*/

delete object.age;      //cancellazione proprietà age
console.log(object);    //verifica cancellazione

/* ESERCIZIO E
  Crea del codice per aggiungere programmaticamente all'oggetto precedentemente creato un array chiamato "skills", contenente i linguaggi di programmazione che conosci.
*/

object.skills = ['C', 'HTML', 'CSS', 'Javascript'];     //aggiunta array
console.log(object);                                    //controllo oggetto

/* ESERCIZIO F
  Crea un pezzo di codice per aggiungere un nuovo elemento all'array "skills" contenuto nell'oggetto "me".
*/

me.skills.push('Dormire');             //aggiunta elemento ad array in oggetto
console.log(me);                       //verifica oggetto

/* ESERCIZIO G
  Crea un pezzo di codice per rimuovere programmaticamente l'ultimo elemento dall'array "skills" contenuto nell'oggetto "me".
*/

function removeSkill(){
  me.skills.splice(me.skills.length - 1, 1)     //rimozione ultimo elemento array in oggetto
}
removeSkill()
console.log(me)                                 //controllo oggetto

/* ESERCIZIO 1
  Crea una funzione chiamata "dice": deve generare un numero casuale tra 1 e 6.
*/

function dice(){
  let random = Math.floor(Math.random() * 6) + 1;   //numero random tra 1 e 5
  console.log(random);                              //verifica numero random
  return random;
}
dice()                                              //lancio funzione

/* ESERCIZIO 2
  Crea una funzione chiamata "whoIsBigger" che riceve due numeri come parametri e ritorna il maggiore dei due.
*/

function whoIsBigger(valore1, valore2){
  console.log(valore1)
  if(valore1 > valore2){                                  //verifica valori
    console.log(valore1 + ' è maggiore di ' + valore2);   //output numero maggiore
    return valore1
  }else{
    console.log(valore2 + ' è maggiore di ' + valore1)    //output numero maggiore
    return valore2  
  }
}
whoIsBigger(4, 3)

/* ESERCIZIO 3
  Crea una funzione chiamata "splitMe" che riceve una stringa come parametro e ritorna un'array contenente ogni parola della stringa.

  Es.: splitMe("I love coding") => ritorna ["I", "Love", "Coding"]
*/

function splitMe(string){
  let stringArr = string.split(' ')     //divide le parole in string, fosse solo '' dividerebbe le lettere
  console.log(stringArr)                //verifica array
}
splitMe('ciao come stai')

/* ESERCIZIO 4
  Crea una funzione chiamata "deleteOne" che riceve una stringa e un booleano come parametri.
  Se il valore booleano è true la funzione deve ritornare la stringa senza il primo carattere, altrimenti la deve ritornare senza l'ultimo.
*/

function deleteOne(string, boolean){
  let output = string.split('')           //divide le lettere nella stringa e le mette in un array
  if(boolean == true){                    //verifica se true o false
    output.splice(0, 1)                   //cancellazione prima lettera
    output = output.join('')              //accorpamento array
    console.log(output)                   //verifica se manca la prima lettera
    return output
  }else{
    output.splice(output.length - 1, 1)   //cancellazione ultima lettera
    output = output.join('')              //accorpamento array
    console.log(output)                   //verifica se manca l'ultima lettera
    return output
  }
}
deleteOne('gatto', true)

/* ESERCIZIO 5
  Crea una funzione chiamata "onlyLetters" che riceve una stringa come parametro e la ritorna eliminando tutte le cifre numeriche.

  Es.: onlyLetters("I have 4 dogs") => ritorna "I have dogs"
*/

function onlyLetters(string){
  string = string.replace(/[0-9]/g, '');     //cancellazione numeri nella stringa
  string = string.replace('  ', ' ');        //rimpiazzo doppio spazio vuoto
  console.log(string);                       //verifica stringa senza numeri
  return string;
}
onlyLetters('ho 22 anni')

/* ESERCIZIO 6
  Crea una funzione chiamata "isThisAnEmail" che riceve una stringa come parametro e ritorna true se la stringa è un valido indirizzo email.
*/

function isThisAnEmail(mail){
  if(mail.indexOf('@') > -1){       //verifica se c'è la @
    console.log(true);              //la chiocciola c'è
    return true;
  }else{
    console.log(false);             //la chiocciola non c'è
    return false;
  }
}
isThisAnEmail('matteomengarelli@libero.it')

/* ESERCIZIO 7
  Scrivi una funzione chiamata "whatDayIsIt" che ritorna il giorno della settimana corrente.
*/

function whatDayIsIt(){
  let data = new Date();            //assegnazione data
  let giorno = data.getDay();       //ottenimento numero corrispondente al giorno
  switch(true){
    case giorno == 0:               //verifica se è domenica
      console.log('domenica');      //output domenica
      break;
    case giorno == 1:               //verifica se è lunedì
      console.log('lunedì');        //output domenica
      break;
    case giorno == 2:               //verifica se è martedì
      console.log('martedì');       //output martedì
      break;
    case giorno == 3:               //verifica se è mercoledì
      console.log('mercoledì');     //output mercoledì
      break;
    case giorno == 4:               //verifica se è giovedì
      console.log('giovedì');       //output giovedì
      break;
    case giorno == 5:               //verifica se è venerdì
      console.log('venerdì');       //output venerdì
      break;
    case giorno == 6:               //verifica se è sabato
      console.log('sabato');        //output sabato
      break;
  }
  return giorno;
}
whatDayIsIt()

/* ESERCIZIO 8
  Scrivi una funzione chiamata "rollTheDices" che riceve un numero come parametro.
  Deve invocare la precedente funzione dice() il numero di volte specificato nel parametro, e deve tornare un oggetto contenente una proprietà "sum":
  il suo valore deve rappresentare il totale di tutti i valori estratti con le invocazioni di dice().
  L'oggetto ritornato deve anche contenere una proprietà "values", contenente un array con tutti i valori estratti dalle invocazioni di dice().

  Example:
  rollTheDices(3) => ritorna {
      sum: 10
      values: [3, 3, 4]
  }
*/

function rollTheDices(tiri){
  let i = 0;                          //assegnazione indice
  let values = [];                    //creazione array contenente i numeri estratti
  let sum = 0;                        //creazione somma
  while(i < tiri){
    values[i] = dice();               //assegnazione valori estratti nell'array
    sum += values[i];                 //continua addizione valori estratti
    i++;
  }
  console.log(values);                //verifica valori estratti
  console.log(sum);                   //verifica somma
  return sum;
}
rollTheDices(4)

/* ESERCIZIO 9
  Scrivi una funzione chiamata "howManyDays" che riceve una data come parametro e ritorna il numero di giorni trascorsi da tale data.
*/

function howManyDays(){
  let date1 = new Date();                                                                                   //assegnazione prima data
  let date2 = new Date(2019, 6, 3);                                                                         //assegnazione seconda data
  let y1 = date1.getFullYear();                                                                             //estrapolazione anno dalla prima data
  let y2 = date2.getFullYear();                                                                             //estrapolazione anno dalla seconda data
  let m1 = date1.getMonth();                                                                                //estrapolazione mese dalla prima data
  let m2 = date2.getMonth();                                                                                //estrapolazione mese dalla seconda data
  let d1 = date1.getDate();                                                                                 //estrapolazione giorno dalla prima data
  let d2 = date2.getDate();                                                                                 //estrapolazione giorno dalla seconda data
  let years = Math.abs(y1 - y2);                                                                            //differenza assoluta tra gli anni
  let months = Math.abs(m1 - m2);                                                                           //differenza assoluta tra i mesi
  let days = Math.abs(d1 - d2);                                                                             //differenza assoluta tra i giorni
  console.log('sono passati ' + years + ' anni, ' + months + ' mesi e ' + days + ' giorni');                //output differenza
  return;
}
howManyDays()

/* ESERCIZIO 10
  Scrivi una funzione chiamata "isTodayMyBirthday" che deve ritornare true se oggi è il tuo compleanno, falso negli altri casi.
*/

function isTodayMyBirthday(mese, giorno){
  let birthMonth = 5;                                     //assegnazione mese compleanno
  let birthDay = 26;                                      //assegnazione giorno compleanno
  if(birthMonth == mese && birthDay == giorno){           //verifica se mese e giorno combaciano con i dati forniti
    console.log('BUON COMPLEANNO');                       //output se la condizione è verificata
    return true;
  }else{
    console.log('Non è il tuo compleanno')                //output se la condizione non è verificata
    return false;
  }
}
let today = new Date(2022, 5, 26);                        //assegnazione data moderna
isTodayMyBirthday(today.getMonth(), today.getDate());     //assegnazione mese e giorno da controllare

// Arrays & Oggetti

// NOTA: l'array "movies" usato in alcuni esercizi è definito alla fine di questo file

/* ESERCIZIO 11
  Scrivi una funzione chiamata "deleteProp" che riceve un oggetto e una stringa come parametri; deve ritornare l'oggetto fornito dopo aver eliminato
  in esso la proprietà chiamata come la stringa passata come secondo parametro.
*/

function deleteProp(object, string){
  let length = Object.keys(object).length;                  //calcolo lunghezza oggetto
  let property = Object.getOwnPropertyNames(object);        //estrapolazione nomi proprietà dell'oggetto
  for(let i = 0; i < length; i++){                          //verifica di ogni proprietà
    if(property[i] == string){                              //condizione per vedere se la proprietà è da cancellare
      delete object[property[i]];                           //cancellazione della proprietà
    }
  }
  console.log(object);                                      //verifica oggetto
  return object;
}
let obj11 = {                                               //creazione oggetto su cui lavorare
  nome: 'Matteo',
  cognome: 'Mengarelli',
}
deleteProp(obj11, 'cognome')                                //assegnazione parametri, tutte le funzioni che utilizzano l'array movies sono lanciate in fondo

/* ESERCIZIO 12
  Scrivi una funzione chiamata "newestMovie" che trova il film più recente nell'array "movies" fornito.
*/

function newestMovie(){                                                 
  let anno = 0;                                                       //inizializzazione variabile per il controllo degli anni
  let nome;                                                           //inizializzazione variabile col nome del film, serve per l'output
  for(let i = 0; i < movies.length; i++){                             //verifica di tutto l'array movies
    if(movies[i].Year > anno){                                        //verifica se l'anno di uscita è più recente
      anno = movies[i].Year;                                          //asseganzione valori alle variabili
      nome = movies[i].Title;
    }
  }
  console.log('Il film più recente è ' + nome + ' del' + anno);       //output con titolo e anno del film più recente
  return;
}

/* ESERCIZIO 13
  Scrivi una funzione chiamata countMovies che ritorna il numero di film contenuti nell'array "movies" fornito.
*/

function countMovies(){
  let num = movies.length;                            //calcolo lunghezza array
  console.log('Il numero di film è ' + num)           //output con numero di film
  return num;
}

/* ESERCIZIO 14
  Scrivi una funzione chiamata "onlyTheYears" che crea un array con solamente gli anni di uscita dei film contenuti nell'array "movies" fornito.
*/

function onlyTheYears(){
  let anni = [];                                        //creazione array con gli anni dei film
  for(let i = 0; i < movies.length; i++){               //verifica di tutto l'array movies
    anni.push(movies[i].Year);                          //push degli anni dei film nell'array anni
  }
  console.log(anni);                                    //verifica dell'array creato
  return anni;
}

/* ESERCIZIO 15
  Scrivi una funzione chiamata "onlyInLastMillennium" che ritorna solamente i film prodotto nel millennio scorso contenuti nell'array "movies" fornito.
*/

function onlyInLastMillennium(){
  let film = [];                                    //creazione array con i titoli dei film
  for(let i = 0; i < movies.length; i++){           //verifica di tutto l'array movies
    if(movies[i].Year > 2000){                      //verifica se l'anno d'uscita è nel nuovo millennio
      film.push(movies[i].Title);                   //push dei titoli nell'array film
    }
  }
  console.log(film);                                //verifica array con film usciti dopo il 2000
  return film;
}

/* ESERCIZIO 16
  Scrivi una funzione chiamata "sumAllTheYears" che ritorna la somma di tutti gli anni in cui sono stati prodotti i film contenuti nell'array "movies" fornito.
*/

function sumAllTheYears(){
  let somma = 0;                                    //inizializzazione variabile per la somma
  let anno;                                         //variabile vhe conterrà l'anno d'uscita di ogni film
  for(let i = 0; i < movies.length; i++){           //verifica array movies
    anno = parseInt(movies[i].Year);                //trasfoemazione in numero la stringa contenente l'anno s'uscita
    somma += anno;                                  //somma cumulativa degli anni
  }
  console.log(somma)                                //verifica totale anni
  return somma;
}

/* ESERCIZIO 17
  Scrivi una funzione chiamata "searchByTitle" che riceve una stringa come parametro e ritorna i film nell'array "movies" fornito che la contengono nel titolo.
*/

function searchByTitle(titolo){
  let film = [];                                //array che conterrà i film cercati
  for(let i = 0; i < movies.length; i++){       //verifica array movies
    if(movies[i].Title.includes(titolo)){       //verifica se la proprietà Title contiene il titolo cercato
      film.push(movies[i].Title);
    }
  }
  console.log(film)                             //output array con i film cercati
  return film;
}

/* ESERCIZIO 18
  Scrivi una funzione chiamata "searchAndDivide" che riceve una stringa come parametro e ritorna un oggetto contenente due array: "match" e "unmatch".
  "match" deve includere tutti i film dell'array "movies" fornito che contengono la stringa fornita all'interno del proprio titolo, mentre "unmatch" deve includere tutti i rimanenti.
*/

function searchAndDivide(title){
  let match = [];                               //array con film cercati
  let unmatch = [];                             //array con i restanti film
  for(let i = 0; i < movies.length; i++){       //verifica array movies
    if(movies[i].Title.includes(title)){        //verifica se la proprietà Title contiene il titolo cercato
      match.push(movies[i].Title);              //se la contiene il film verrà messo nell'array match
    }else{
      unmatch.push(movies[i].Title);            //altrimenti verrà messo nell'array unmatch
    }
  }
  return {                                      //la funzione ritornerà un oggetto contenente i due array match e unmatch
    'match': match,
    'unmatch': unmatch
  };
}

/* ESERCIZIO 19
  Scrivi una funzione chiamata "removeIndex" che riceve un numero come parametro e ritorna l'array "movies" fornito privo dell'elemento nella posizione ricevuta come parametro.
*/

function removeIndex(num){
  delete movies[num];                 //cancellazione elemento desiderato
  console.log(movies);                //verifica della cancellazione
  return movies;                      //ritorno array senza l'elemento
}

// DOM (nota: gli elementi che selezionerai non si trovano realmente nella pagina)

/* ESERCIZIO 20
  Scrivi una funzione per selezionare l'elemento dotato di id "container" all'interno della pagina.
*/

function searchId(){
  let id = document.getElementById('container');          //seleziono l'elemento con id container
  id.style.backgroundColor = 'blue';                      //far vedere che è selezionato
}
searchId()

/* ESERCIZIO 21
  Scrivi una funzione per selezionare ogni tag <td> all'interno della pagina.
*/

function modTd(){
  let allTd = document.querySelectorAll('td');          //seleziono ogni td, verrà creato un array con tutti i td
  for(let i = 0; i < allTd.length; i++){
    allTd[i].style.backgroundColor = 'green';           //far vedere che sono selezionate
  }
}  
modTd()

/* ESERCIZIO 22
  Scrivi una funzione che, tramite un ciclo, stampa in console il testo contenuto in ogni tag <td> all'interno della pagina.
*/

function textTd(){
  let allTd = document.querySelectorAll('td');            //seleziono ogni td, verrà creato un array con tutti i td
  for(let i = 0; i < allTd.length; i++){                  
    console.log(allTd[i].textContent);                    //stampa in console il loro testo
  }
}  
textTd()

/* ESERCIZIO 23
  Scrivi una funzione per aggiungere un background di colore rosso a ogni link all'interno della pagina.
*/

function modLink(){
  let link = document.querySelectorAll('a');            //selezione ogni a, verrà creato un array con tutte le a
  for(let i = 0; i < link.length; i++){
    link[i].style.backgroundColor = 'red';              //modifica del colore di sfondo
    link[i].style.color = 'white';                      //per leggere meglio
  }
}
modLink()

/* ESERCIZIO 24
  Scrivi una funzione per aggiungere un nuovo elemento alla lista non ordinata con id "myList".
*/

function addList(){
  let lista = document.getElementById('myList');          //selezione lista con id myList
  let li = document.createElement('li');                  //creazione di un nuovo li
  li.textContent = 'Elemento aggiunto';                   //crezione testo li
  lista.appendChild(li)                                   //mettere li dentro la lista presa in precedenza
}
addList()

/* ESERCIZIO 25
  Scrivi una funzione per svuotare la lista non ordinata con id "myList".
*/

/*function emptyList(){
  document.getElementById('myList').textContent = '';      //svuotamento ogni cosa scritta nella lista, se sivuole vedere il risultato rimuovere la sintassi del commento nella funzione
}
emptyList()*/

/* ESERCIZIO 26
  Scrivi una funzione per aggiungere ad ogni tag <tr> la classe CSS "test"
*/

function classTr(){
  let tr = document.querySelectorAll('tr');         //selezione ogni tr, verrà creato un array con tutti i tr
  for(let i = 0; i < tr.length; i++){
    tr[i].className = 'test';                       //assegnazione nuova classe a tutti i tr
  }
}
classTr()

// [EXTRA] JS Avanzato

/* ESERCIZIO 27
  Crea una funzione chiamata "halfTree" che riceve un numero come parametro e costruisce un mezzo albero di "*" (asterischi) dell'altezza fornita.

  Esempio:
  halfTree(3)

  *
  **
  ***

*/

function halfTree(num){                         
  let output = '';                              //assegnazione output inizialmente vuoto
  for(let i = 0; i < num; i++){
    output = output + '*';                      //aggiungere ogni volta un asterisco di seguito
    console.log(output);                        //output ogni volta dell'halftree
  }
}
halfTree(3)

/* ESERCIZIO 28
  Crea una funzione chiamata "tree" che riceve un numero come parametro e costruisce un albero di "*" (asterischi) dell'altezza fornita.

  Esempio:
  tree(3)

    *
   ***
  *****

*/

function tree(num){
  let output = '';                              //variabile output vuota
  let space = [];                               //array con gli spazi prima dehli asterischi
  let y = 1;                                    //contatore che servirà dopo                
  for(let i = 0; i < num; i++){                 //ciclo per creare gli spazi
    space.push('');                             //il primo elemento sarà vuoto
    if(i > 0){
      space[i] = space[i-1] + ' ';              //i successivi avranno sempre uno spazio in più
    }
  } let x = space.length - 1;                   //variabile indice per comodità, serve per andare a ritroso
  for(let i = 0; i < num; i++){
    if(i == 0){                                 //serve solo per il primo asterisco
      output = space[x] + '*' + space[x];       //il primo asterisco sarà al centro
      console.log(output)                       //print del primo asterisco
    }else{
      output = space[(x - i)]                   //si va a ritroso nell'array space per i successivi spazi
      y++                                       //contatore che aumenta
      for(let a = 0; a < i + y; a++){           
        output = output + '*'                   //aggiunta degli asterischi
      } 
      console.log(output)                       //print asterischi
    }
  }
}
tree(4)

/* ESERCIZIO 29
  Crea una funzione chiamata "isItPrime" che riceve un numero come parametro e ritorna true se il numero fornito è un numero primo.
*/

function isItPrime(num){
  let x = 0;                                            //variabile che serve per output
  let verifica;                                         //variabile che verifica un calcolo
  for(let i = 2; i< num / 2; i++){                      //i numeri primi sono divisibili solo per 1 e per se stessi, quindi si parte da 2 fino alla metà del numero da verificare
    verifica = num % i;                                 //calcolo il resto della divisione tra il numero da verificare e l'indice
    if(verifica == 0){                                  //verifica se il resto è 0
      x = 1;                                            //se s', allora il numero non è primo, quindi aumento il valore di x per l'output
    }
  }
  if(x == 1){
    console.log(num + ' non è un numero primo');        //output numero non primo
  }else{
    console.log(num + ' è un numero primo')             //output numero primo
  }
}
isItPrime(12)

/* Questo array viene usato per gli esercizi. Non modificarlo. */

const movies = [
  {
    Title: 'The Lord of the Rings: The Fellowship of the Ring',
    Year: '2001',
    imdbID: 'tt0120737',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BN2EyZjM3NzUtNWUzMi00MTgxLWI0NTctMzY4M2VlOTdjZWRiXkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_SX300.jpg',
  },

  {
    Title: 'The Lord of the Rings: The Return of the King',
    Year: '2003',
    imdbID: 'tt0167260',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNzA5ZDNlZWMtM2NhNS00NDJjLTk4NDItYTRmY2EwMWZlMTY3XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg',
  },
  {
    Title: 'The Lord of the Rings: The Two Towers',
    Year: '2002',
    imdbID: 'tt0167261',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNGE5MzIyNTAtNWFlMC00NDA2LWJiMjItMjc4Yjg1OWM5NzhhXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg',
  },
  {
    Title: 'Lord of War',
    Year: '2005',
    imdbID: 'tt0399295',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTYzZWE3MDAtZjZkMi00MzhlLTlhZDUtNmI2Zjg3OWVlZWI0XkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_SX300.jpg',
  },
  {
    Title: 'Lords of Dogtown',
    Year: '2005',
    imdbID: 'tt0355702',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNDBhNGJlOTAtM2ExNi00NmEzLWFmZTQtYTZhYTRlNjJjODhmXkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_SX300.jpg',
  },
  {
    Title: 'The Lord of the Rings',
    Year: '1978',
    imdbID: 'tt0077869',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BOGMyNWJhZmYtNGQxYi00Y2ZjLWJmNjktNTgzZWJjOTg4YjM3L2ltYWdlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SX300.jpg',
  },
  {
    Title: 'Lord of the Flies',
    Year: '1990',
    imdbID: 'tt0100054',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BOTI2NTQyODk0M15BMl5BanBnXkFtZTcwNTQ3NDk0NA@@._V1_SX300.jpg',
  },
  {
    Title: 'The Lords of Salem',
    Year: '2012',
    imdbID: 'tt1731697',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMjA2NTc5Njc4MV5BMl5BanBnXkFtZTcwNTYzMTcwOQ@@._V1_SX300.jpg',
  },
  {
    Title: 'Greystoke: The Legend of Tarzan, Lord of the Apes',
    Year: '1984',
    imdbID: 'tt0087365',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTM5MzcwOTg4MF5BMl5BanBnXkFtZTgwOTQwMzQxMDE@._V1_SX300.jpg',
  },
  {
    Title: 'Lord of the Flies',
    Year: '1963',
    imdbID: 'tt0057261',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BOGEwYTlhMTgtODBlNC00ZjgzLTk1ZmEtNmNkMTEwYTZiM2Y0XkEyXkFqcGdeQXVyMzU4Nzk4MDI@._V1_SX300.jpg',
  },
  {
    Title: 'The Avengers',
    Year: '2012',
    imdbID: 'tt0848228',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNDYxNjQyMjAtNTdiOS00NGYwLWFmNTAtNThmYjU5ZGI2YTI1XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_SX300.jpg',
  },
  {
    Title: 'Avengers: Infinity War',
    Year: '2018',
    imdbID: 'tt4154756',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMjMxNjY2MDU1OV5BMl5BanBnXkFtZTgwNzY1MTUwNTM@._V1_SX300.jpg',
  },
  {
    Title: 'Avengers: Age of Ultron',
    Year: '2015',
    imdbID: 'tt2395427',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTM4OGJmNWMtOTM4Ni00NTE3LTg3MDItZmQxYjc4N2JhNmUxXkEyXkFqcGdeQXVyNTgzMDMzMTg@._V1_SX300.jpg',
  },
  {
    Title: 'Avengers: Endgame',
    Year: '2019',
    imdbID: 'tt4154796',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTc5MDE2ODcwNV5BMl5BanBnXkFtZTgwMzI2NzQ2NzM@._V1_SX300.jpg',
  },
]

newestMovie()

countMovies()

onlyTheYears()

onlyInLastMillennium()

sumAllTheYears()

searchByTitle('Avengers')

searchAndDivide('Avengers')
console.log(searchAndDivide('Avengers'))   //verificare che la la funzione restituisca due array

removeIndex(8)