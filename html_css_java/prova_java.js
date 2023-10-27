window.alert("Intenta adivinar el numero secret. Tienes 10 intentos");
var te_mueres = false;
while(!te_mueres) {
    var num_random = Math.floor(Math.random()*101);
    var es_el_numero = false;
    var intentos = 10;
    do {
        if (intentos != 0) {
            var numero_usuari = window.prompt("Digues un numero");
            if (numero_usuari != null) {
                if (numero_usuari == num_random) {
                    es_el_numero = true;
                    window.alert("¡¡Enhorabona!!, has endivinat el numero");
                }
                else if (numero_usuari > num_random) {
                    intentos--;
                    window.alert("El numero es més petit. \n Intentos: " + intentos);
                }
                else {
                    intentos--;
                    window.alert("El numero es més gran. \n Intentos: " + intentos);
                }
            }
            else if (numero_usuari == null) {
                te_mueres = true;
            }
        }
    }while (!es_el_numero && te_mueres == false && intentos != 0)
    if (te_mueres == false) {
        if (intentos == 0) {
            window.alert("Bona sort la proxima vegada");
        }
        window.alert("Ara torna a intentar-ho");
    }
}
