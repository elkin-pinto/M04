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
    console.log(atributs)
}

function insertarFila() {
    document.getElementById("Taula").appendChild(document.createElement("tr"))
}

