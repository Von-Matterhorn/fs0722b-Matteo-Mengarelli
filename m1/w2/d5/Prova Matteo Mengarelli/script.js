let n = 0; //serve per controllare le parentesi
let x = 0; //contiene i valori scritti
let p = 0; //risultato potenza
let r = 0; //risultato radice

function aggiungiCifra(bottone){
    x = document.getElementById("numeri").value += bottone.getAttribute('dato'); //trasferisco il valore del bottone nella casella di testo e contemporaneamente ad una variabile
    console.log(x);
    switch(true){ //verifico se ci sono segni vicini o due virgole di fila
        case x.includes('++'):
            alert('NON METTERE PIÚ SEGNI DI FILA'), //avvisa dell'errore
            document.getElementById('numeri').value = ''; //refresh schermo
            break;
        case x.includes('+-'):
            alert('NON METTERE PIÚ SEGNI DI FILA'),
            document.getElementById('numeri').value = '';
            break;
        case x.includes('+/'):
            alert('NON METTERE PIÚSEGNI DI FILA'),
            document.getElementById('numeri').value = '';
            break;
        case x.includes('+*'):
            alert('NON METTERE PIÚ SEGNI DI FILA'),
            document.getElementById('numeri').value = '';
            break;
        case x.includes('-+'):
            alert('NON METTERE PIÚ SEGNI DI FILA'),
            document.getElementById('numeri').value = '';
            break;
        case x.includes('--'):
            alert('NON METTERE PIÚ SEGNI DI FILA'),
            document.getElementById('numeri').value = '';
            break;
        case x.includes('-/'):
            alert('NON METTERE PIÚ SEGNI DI FILA'),
            document.getElementById('numeri').value = '';
            break;
        case x.includes('-*'):
            alert('NON METTERE PIÚ SEGNI DI FILA'),
            document.getElementById('numeri').value = '';
            break;
        case x.includes('/+'):
            alert('NON METTERE PIÚ SEGNI DI FILA'),
            document.getElementById('numeri').value = '';
            break;
        case x.includes('/-'):
            alert('NON METTERE PIÚ SEGNI DI FILA'),
            document.getElementById('numeri').value = '';
            break;
        case x.includes('//'):
            alert('NON METTERE PIÚ SEGNI DI FILA'),
            document.getElementById('numeri').value = '';
            break;
        case x.includes('/*'):
            alert('NON METTERE PIÚ SEGNI DI FILA'),
            document.getElementById('numeri').value = '';
            break;
        case x.includes('*+'):
            alert('NON METTERE PIÚ SEGNI DI FILA'),
            document.getElementById('numeri').value = '';
            break;
        case x.includes('*-'):
            alert('NON METTERE PIÚ SEGNI DI FILA'),
            document.getElementById('numeri').value = '';
            break;
        case x.includes('*/'):
            alert('NON METTERE PIÚ SEGNI DI FILA'),
            document.getElementById('numeri').value = '';
            break;
        case x.includes('**'):
            alert('NON METTERE PIÚ SEGNI DI FILA'),
            document.getElementById('numeri').value = '';
            break;
        case x.includes('..'): //verifica anche che non ci sia una doppia virgola
            alert('NON METTERE DUE VIRGOLE DI FILA'),
            document.getElementById('numeri').value = '';
            break;
    }
}

function tot(){
    if(n > 0){
        alert('NON HAI CHIUSO TUTTE LE PARENTESI');
        document.getElementById('numeri').value = '';
    }
    if(n < 0){
        alert('NON HAI APERTO TUTTE LE PARENTESI');
        document.getElementById('numeri').value = '';
    }
    let risultato = document.getElementById("numeri"); //mettere il risultato in una variabile
    risultato.value = eval(risultato.value); //far vedere il risultato
}

function cancella(){ //cancella tutto nella casella di testo
    document.getElementById('numeri').value = '';
    n = 0;
    x = 0;
    console.log(x);
}

function paraperta(bottone){ //verifica delle parentesi
    x = document.getElementById("numeri").value += bottone.getAttribute('dato');
    if(x.includes('(')){
        n++;
        console.log(n);
    }
}

function parchiusa(bottone){ //verifica delle parentesi
    x = document.getElementById("numeri").value += bottone.getAttribute('dato');
    if(x.includes(')')){
        n--;
        console.log(n);
    }
}

function potenza(){
    p = Math.pow(x,2);
    document.getElementById("numeri").value = p;
}

function radice(){
    r = Math.sqrt(x)
    document.getElementById("numeri").value = r;
}