// // Variáveis 
// const nome = "João";
// let idade = 11;

// // console.log(nome);
// // console.log(idade);

// let contador = 0
// contador++;

// // console.log(contador);

// // Array com const
// const frutas = ["Maca", "Banana", "Morango"];
// console.log(frutas);

// frutas.push("Goiaba");
// console.log(frutas)

// // frutas = ["Uva"];
// // console.log(frutas);

// // Objeto com const
// const pessoa = {
//     nome2 : "Jóse",
//     idade2 : 24
// }

// pessoa.cidade = "Belo Horizonte";s
// pessoa.nome2 = "Maria";
// pessoa.idade2 = 12;
// // pessoa = {nome2 : "Joao"};

// console.log(pessoa.nome2);
// console.log(pessoa.idade2);
// console.log(pessoa.cidade);

// Função
function somar(a,b) {
    return a + b;
}
console.log(somar(2,2.5));

//
const somar2 = (a,b) =>{
    return a + b;
}
console.log(somar2(3,3));

const somar3 = (a,b) => a + b;
console.log(somar3 (4,6));

//

const usuario = {
    nome3 : "Saulo",
    idade3 : 22,
    cidade3 : "Belo Horizonte"
}

const {nome3, idade3, cidade3} = usuario;
console.log(nome3);
console.log(cidade3);

const cores = ["Azul", "Branco", "Preto"];
const [primeiro, segundo, terceiro] = cores;

console.log(primeiro);