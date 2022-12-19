function start(){
    let player1=document.getElementById('first').value
    let player2=document.getElementById('second').value
    let random=Math.floor(Math.random()*(100-1)+1)
    let diff1=random-player1
    let diff2=random-player2
    let risultato=document.getElementById('risultato')
    if(diff1 < diff2){
        if(diff1 == 0){
            risultato.innerHTML="Il numero randomico è " + random + ".Il primo giocatore ha indovinato"
        } else{
            risultato.innerHTML="Il numero randomico è " + random + ".Il primo giocatore si è avvicinato di più"
        }
    } else if(diff2 < diff1){
        if(diff2 == 0){
            risultato.innerHTML="Il numero randomico è " + random + ".Il secondo giocatore ha indovinato"
        } else{
            risultato.innerHTML="Il numero randomico è " + random + ".Il secondo giocatore si è avvicinato di più"
        }    }
}