function estiljs() {
    document.getElementById("text").style.color = "red";
}

function prenValorForm() {
    let inputs = document.getElementsByTagName("input")
    console.log(`${inputs[0].value} ${inputs[1].value}`)
}

function camviFons() {
    document.getElementsByTagName("p")[1].style.backgroundColor = "purple";
    document.getElementsByTagName("p")[2].style.backgroundColor = "purple";
}

function obtenirAtributs() {
    let atributs = document.getElementById("itb").getAttributeNames()
    // let atributs = document.getElementById("itb").attributes[0].name
    // let atributs = document.getElementById("itb").attributes[0].value
    console.log(atributs);
}

function insertarFila() {
    let table = document.getElementById("Taula");
    let trs = table.getElementsByTagName("tr").length;
    let tr = table.insertRow(-1)
    table.rows[trs].insertCell(-1);
    table.rows[trs].insertCell(-1);
    tr.cells[0].innerHTML = `fila ${trs + 1} cel·la 2`;
    tr.cells[1].innerHTML = `fila ${trs + 1} cel·la 2`;
}

function insertarFila_a() {
    let table = document.getElementById("Taula");
    let trs = table.getElementsByTagName("tr").length;
    table.insertRow(0)
    table.rows[0].insertCell(0);
    table.rows[0].insertCell(0);
    for (i = 0; i < (trs + 1); i++) {
        table.rows[i].cells[0].innerHTML = `fila ${i} cel·la 1`
        table.rows[i].cells[1].innerHTML = `fila ${i} cel·la 2`
    }
}

window.onload = function insertarFila_6_a() {
    let table = document.getElementById("Taula_6");
    table.rows[1].cells[1].innerHTML = "Cambio value"

}

function CambiarValor_6b() {
    let table = document.getElementById("Taula_6");
    let valores = document.getElementById("input_6b").value;
    let valores2 = document.getElementById("input_6b_2").value;
    let columna = valores % 10;
    let fila = (valores - columna) / 10;
    table.rows[fila-1].cells[columna-1].innerHTML = valores2;
}

function ponerFilasYColumnas() {
    let table = document.getElementById("Taula_7");
    let filas_table = table.getElementsByTagName("tr").length
    for (x = (filas_table - 1) ; x >= 0; x--) {
        table.removeChild(table.getElementsByTagName("tr")[x])
    }
    let valore_f = window.prompt("Cuantas filas?");
    let valore_c = window.prompt("Cuantas columnas?");
    let columna = valore_c;
    let fila = valore_f;
    for (i = 0; i < fila;i++) {
        let tr = document.createElement("tr");
        console.log("1")
        table.appendChild(tr);
        for (e = 0; e < columna;e++) {
            let td = document.createElement("td");
            table.getElementsByTagName("tr")[i].appendChild(td);
            table.rows[i].cells[e].innerHTML = `fila ${i+1} cel·la ${e+1}`;
        }
    }
}



function eliminarOpcion() {
    let select = document.getElementById("lista_opciones");
    select.removeChild(select.options[select.selectedIndex]);
}



function mostrarValor() {
    let select = document.getElementById("lista_opciones_2");
    let option = select.options[select.selectedIndex];
    alert(`Nombre: ${option.text} Value: ${option.value}`)
}



function calcularVolumen() {
    let altura = document.getElementById("altura_10").value;
    let radio = document.getElementById("radio_10").value;
    let resultado = document.getElementById("resultado_10");

    resultado.innerHTML = (`${altura * (radio**2 * 3.1416)} cm2`)
}




function resaltar() {
    let palabras = document.getElementsByTagName("strong")
    for (i = 0 ; i < palabras.length; i++) {
        palabras[i].style.color = "red";
        palabras[i].style.fontSize = "larger";
    }
}

function tornaNormal() {
    let palabras = document.getElementsByTagName("strong")
    for (i = 0 ; i < palabras.length; i++) {
        palabras[i].style.color = "black";
        palabras[i].style.fontSize = "medium";
    }
}