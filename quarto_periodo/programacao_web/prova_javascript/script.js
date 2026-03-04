// Variáveis

var i;
j = 10;
var k = 2;
var x, y;

/* 
var estado = window.prompt ("Digite a sigla do seu estado", "RJ");
var capital = "";
*/

// Comando IF

/*
if (estado == "RJ") capital = "Rio de Janeiro";
if (estado == "SP") capital = "São Paulo";
if (estado == "MG") capital = "Belo Horizonte";
document.write ("estado: ", estado," capital: ", capital);
*/

// Comando IF-ELSE
/*
if (estado == "RJ") {
    capital = "Rio de Janeiro";
} else {
    capital = "Não sei";
}
document.write ("estado: ", estado," capital: ", capital);
*/

// Comando SWITCH

/*
var a = parseInt(window.prompt ("Digite o primeiro operando",""));
var b = parseInt(window.prompt ("Digite o segundo operando",""));
var op = window.prompt ("Digite o operado (+, -, * ou /)","");
var resultado;

switch (op) {
    case "+": resultado = a + b;
    break;

    case "-": resultado = a -b;
    break;

    case "*": resultado = a * b;
    break;

    case "/": resultado = a / b;
    break;

    default: resultado = "Operador inválido";
}
document.write (a, op, b, " = ", resultado);
*/

// FOR

/*
var i;

for (i=0; i<=10; i++) {
    document.write ("i=", i, "<br>")
}
*/

// WHILE

/*
var i = 0;
while (i <= 10) {
    document.write (i, "<br>");
    i++;
}
*/

// DO-WHILE

/*
var i = 5;
do {
    document.write (i, "<br>");
    i++;
} while (i <= 10);
*/

// FUNÇÕES
var telefone = "12345678";

function validTelefone() {
    if (telefone.length != 8) {
        alert ("Telefone inválido");
    } else {
        alert ("Telefone válido");
    }
}

// FUNÇÕES COM PARÃMETROS
/*
let telefone1 = "12345678";
let telefone2 = "1234";

function validTelefone(t) {
    if (t.length != 8) {
        alert ("Telefone inválido");
    } else {
        alert ("Telefone válido");
    }
}

validTelefone(telefone1);
validTelefone(telefone2);
*/

// FUNÇÕES COM RETORNO DE VALORES

/* 
function validTelefone(t) {
    if (t.length != 8) {
        return false;
    } else {
        return true;
    }
}

function verificar() {
    let t = document.getElementById("t").value;

    if (! validTelefone(t)) {
        alert ("Telefone inválido");
    } else {
        alert ("Telefone válido");
    }
}
*/

// CAIXAS DE DIALOGO
/*
alert ("Mensagem de alerta");
*/

/*
var resultado = confirm ("Aperte um botão:");
if (resultado == true) {
    alert ("Ok");
} else {
    alert ("Cancelar");
}
*/
/*
var resultado = prompt("Digite seu nome:", "fulano");
if (resultado != null && resultado != "") {
    document.write ("Bom dia " + resultado + "!");
}

window.location.href = "https://www.facebook.com";
*/

function MinhaPagina()
{
	document.images[0].src = "imagens/MinhaPagina.gif";
	document.forms[0].elements[0].value = "Maria";
	document.forms[0].elements[1].value = "maria@hotmail.com";
	document.forms[0].elements[2].value = "Manda";
	document.images[1].src = "imagens/BarMp.gif";
	document.links[0].href = "http://www.una.br";
	document.links[0].innerHTML = "Equipe da UNA";
	document.links[1].href = "javascript:HomePage();";
	document.links[1].innerHTML = "Home Page";
}