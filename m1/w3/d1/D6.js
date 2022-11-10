/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Se sei in difficoltà puoi chiedere aiuto a un Teaching Assistant
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per farlo puoi utilizzare il terminale Bash, quello di VSCode o quello del tuo sistema operativo (se utilizzi macOS o Linux)
*/

/* ESERCIZIO 1
 Scrivi una funzione di nome "area", che riceve due parametri (l1, l2) e calcola l'area del rettangolo associato..
*/

function area(){
    let area = l1*l2;
    console.log(area);
}
l1 = 2;
l2 = 4;
area(l1,l2)

/* ESERCIZIO 2
 Scrivi una funzione di nome "crazySum", che riceve due numeri interi come parametri.
 La funzione deve ritornare la somma dei due parametri, ma se il valore dei due parametri è il medesimo deve invece tornare
 la loro somma moltiplicata per tre.
*/

function crazySum(){
    let somma;
    if(x == y){
        somma = (x + y)*3;
    }else{
        somma = x + y;
    }
    console.log(somma)
}
x = 3;
y = 3;
crazySum()

/* ESERCIZIO 3
 Scrivi una funzione di nome "crazyDiff" che calcola la differenza assoluta tra un numero fornito come parametro e 19.
 Deve inoltre tornare la differenza assoluta moltiplicata per tre qualora il numero fornito sia maggiore di 19.
*/

function crazyDiff(){
    let diff;
    if(a > 19){
        diff = Math.abs((a - 19)*3);
    }else{
        diff = Math.abs(a-19)
    }
    console.log(diff)
}
a = 20;
crazyDiff()

/* ESERCIZIO 4
 Scrivi una funzione di nome "boundary" che accetta un numero intero n come parametro, e ritorna true se n è compreso tra 20 e 100 (incluso) oppure
 se n è uguale a 400.
*/

function boundary(){
    if((b < 101 && b > 20) || b == 400){
        return true;
    }else{
        return false;
    }
}
b = 21;
boundary()

/* ESERCIZIO 5
 Scrivi una funzione di nome "epify" che accetta una stringa come parametro.
 La funzione deve aggiungere la parola "EPICODE" all'inizio della stringa fornita, ma se la stringa fornita comincia già con "EPICODE" allora deve
 ritornare la stringa originale senza alterarla.
*/

function epify(){
    let stringa = 'EPICODE ciao';
    if(stringa.includes('EPICODE')){
        console.log(stringa)
    }else{
        stringa = 'EPICODE ' + stringa;
        console.log(stringa)
    }
}
epify()

/* ESERCIZIO 6
 Scrivi una funzione di nome "check3and7" che accetta un numero positivo come parametro. La funzione deve controllare che il parametro sia un multiplo
 di 3 o di 7. (Suggerimento: usa l'operatore modulo)
*/

function check3and7(){
    let num = 21;
    if(num >= 0){
        if((num % 3)== 0 && (num % 7)== 0){
            console.log('multiplo di 3 e 7')
        }else if((num % 3)== 0){
            console.log('multiplo di 3')
        }else if((num % 7)== 0){
            console.log('multiplo di 7')
        }else{
            console.log('non multiplo')
        }
    }else{
        console.log('non è positivo')
    }
}
check3and7()

/* ESERCIZIO 7
 Scrivi una funzione di nome "reverseString", il cui scopo è invertire una stringa fornita come parametro (es. "EPICODE" --> "EDOCIPE")
*/

function reverseString(){
    let str = 'casa';
    let revStr = '';
    let i;
    for(i = str.length-1; i >= 0; i--){
        revStr += str[i];
    }
    console.log(revStr)
}
reverseString()

/* ESERCIZIO 8
 Scrivi una funzione di nome "upperFirst", che riceve come parametro una stringa formata da diverse parole.
 La funzione deve rendere maiuscola la prima lettera di ogni parola contenuta nella stringa.
*/

/* ESERCIZIO 9
 Scrivi una funzione di nome "cutString", che riceve come parametro una stringa. La funzione deve creare una nuova stringa senza il primo e l'ultimo carattere
 della stringa originale.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 10
 Scrivi una funzione di nome "giveMeRandom", che accetta come parametro un numero n e ritorna un'array contenente n numeri casuali inclusi tra 0 e 10.
*/

function giveMeRandom(){
    let arr = [];
    let rnd;
    let i;
    rnd = Math.round(Math.random() * 10)
    console.log(rnd)
    for(i = 0; i < rnd; i++){
        arr.push(Math.round(Math.random() * 10))
    }
    console.log(arr);
}
giveMeRandom()
