let diceFormular = document.getElementById("diceFormular");
let cuboidFormular = document.getElementById("cuboidFormular");
let globeFormular = document.getElementById("globeFormular");
let pyramide4Formular = document.getElementById("pyramide4Formular");
let allFormulars = [diceFormular, cuboidFormular, globeFormular, pyramide4Formular];

let diceRadioButton = document.getElementById("dice");
let cuboidRadioButton = document.getElementById("cuboid");
let globeRadioButton = document.getElementById("globe");
let pyramide4RadioButton = document.getElementById("pyramide4");

function vanishFormulars() {
    allFormulars.forEach(displayNoFormular);
}

function displayNoFormular(item){
    item.style.display = "none";
}

function revealFormular(shapeFormular){
    shapeFormular.style.display = "block";
}

function changeFormular(shapeFormular){
    vanishFormulars();
    revealFormular(shapeFormular);
}

window.addEventListener("load", function() {changeFormular(diceFormular);});

diceRadioButton.addEventListener("change", function() {changeFormular(diceFormular);});
cuboidRadioButton.addEventListener("change", function() {changeFormular(cuboidFormular);});
globeRadioButton.addEventListener("change",  function() {changeFormular(globeFormular);});
pyramide4RadioButton.addEventListener("change",  function() {changeFormular(pyramide4Formular);});

