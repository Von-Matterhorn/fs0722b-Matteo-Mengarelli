fetch("assets/abbigliamento.json")
    .then(function (response) {
    return response.json();
})
    .then(function (myJson) {
    var principale = document.getElementById('principale');
    console.log(principale);
    for (var i = 0; i < myJson.length; i++) {
        var vestito = new Vestito(myJson[i].id, myJson[i].codprod, myJson[i].collezione, myJson[i].capo, myJson[i].modello, myJson[i].quantità, myJson[i].colore, myJson[i].prezzoivaesclusa, myJson[i].prezzoivainclusa, myJson[i].disponibile, myJson[i].saldo);
        principale.innerHTML += "\n                    <div class=\"col-5 text-center border border-dark rounded m-4\">\n                        <h1>".concat(vestito.capo, "</h1>\n                        <p>Collezione ").concat(vestito.collezione, "</p>\n                        <p>").concat(vestito.disponibile, "</p>\n                        <p>").concat(vestito.colore, "</p>\n                        <p>").concat(vestito.saldo, "% di sconto</p>                    \n                        <p>Totale: ").concat(vestito.getAcquistoCapo(), "\u20AC</p>\n                    </div>\n                ");
    }
});
var Vestito = /** @class */ (function () {
    function Vestito(id, codprod, collezione, capo, modello, quantità, colore, prezzoivaesclusa, prezzoivainclusa, disponibile, saldo) {
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
    Vestito.prototype.getSaldoCapo = function () {
        return this.prezzoivainclusa * this.saldo / 100;
    };
    Vestito.prototype.getAcquistoCapo = function () {
        return JSON.parse(parseFloat(JSON.stringify(this.prezzoivainclusa - this.getSaldoCapo())).toPrecision(3));
    };
    return Vestito;
}());
