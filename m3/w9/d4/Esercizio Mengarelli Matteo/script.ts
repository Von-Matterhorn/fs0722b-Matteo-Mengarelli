fetch("assets/abbigliamento.json")
    .then(function (response) {
        return response.json();
    })
    .then(function (myJson) {
        let principale = document.getElementById('principale');
        console.log(principale)
        for (let i = 0; i < myJson.length; i++) {
            let vestito = new Vestito(myJson[i].id, myJson[i].codprod, myJson[i].collezione, myJson[i].capo, myJson[i].modello, myJson[i].quantità, myJson[i].colore, myJson[i].prezzoivaesclusa, myJson[i].prezzoivainclusa, myJson[i].disponibile, myJson[i].saldo)
            principale.innerHTML += `
                    <div class="col-5 text-center border border-dark rounded m-4">
                        <h1>${vestito.capo}</h1>
                        <p>Collezione ${vestito.collezione}</p>
                        <p>${vestito.disponibile}</p>
                        <p>${vestito.colore}</p>
                        <p>${vestito.saldo}% di sconto</p>                    
                        <p>Totale: ${vestito.getAcquistoCapo()}€</p>
                    </div>
                `
        }
    })

class Vestito {
    id: number;
    codprod: number;
    collezione: string;
    capo: string;
    modello: number;
    quantità: number;
    colore: string;
    prezzoivaesclusa: number;
    prezzoivainclusa: number;
    disponibile: string;
    saldo: number;
    constructor(id: number, codprod: number, collezione: string, capo: string, modello: number, quantità: number, colore: string, prezzoivaesclusa: number, prezzoivainclusa: number, disponibile: string, saldo: number) {
        this.id = id;
        this.codprod = codprod;
        this.collezione = collezione;
        this.capo = capo;
        this.modello = modello;
        this.quantità = quantità;
        this.colore = colore;
        this.prezzoivaesclusa = prezzoivaesclusa;
        this.prezzoivainclusa = prezzoivainclusa;
        this.disponibile = disponibile;
        this.saldo = saldo;
    }
    getSaldoCapo() {
        return this.prezzoivainclusa * this.saldo / 100;
    }
    getAcquistoCapo() {
        return JSON.parse(parseFloat(JSON.stringify(this.prezzoivainclusa - this.getSaldoCapo())).toPrecision(3))
    }
}