var numeroUno = 65;
var numeroDue = 46;
var numeroCasuale = Math.floor(Math.random() * (100 - 1) + 1);
var differenzaUno = numeroCasuale - numeroUno;
var differenzaDue = numeroCasuale - numeroDue;
if (differenzaUno < differenzaDue) {
    if (differenzaUno == 0) {
        console.log("Il numero randomico è " + numeroCasuale + ". Il primo giocatore ha indovinato");
    }
    else {
        console.log("Il numero randomico è " + numeroCasuale + ". Il primo giocatore si è avvicinato di più");
    }
}
else if (differenzaDue < differenzaUno) {
    if (differenzaDue == 0) {
        console.log("Il numero randomico è " + numeroCasuale + ". Il secondo giocatore ha indovinato");
    }
    else {
        console.log("Il numero randomico è " + numeroCasuale + ". Il secondo giocatore si è avvicinato di più");
    }
}
