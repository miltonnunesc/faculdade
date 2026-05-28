import { prodType } from "../types/prodType";

export const bebida: prodType[] = [
    {
        id: 0, titulo: "Água Mineral", descricao: "O item mais básico e essencial.", 
        preco: "R$4.00", imagem: require('../assets/images/imagemBebida/agua.webp')
    },
    {
        id: 1, titulo: "Café Espresso", descricao: "Um clássico para qualquer hora do dia.", 
        preco: "R$7.00", imagem: require('../assets/images/imagemBebida/cafeexpresso.jpg')
    },
    {
        id: 2, titulo: "Suco de Laranja Natural (300ml)", descricao: "Refrescante e rico em vitamina C.", 
        preco: "R$12.00", imagem: require('../assets/images/imagemBebida/sucolaranja.jpg')
    },
    {
        id: 3, titulo: "Refrigerante em Lata", descricao: "A opção padrão para acompanhamentos.", 
        preco: "R$8.00", imagem: require('../assets/images/imagemBebida/refrigerante.webp')
    },
    {
        id: 4, titulo: "Soda Italiana", descricao: "Água gaseificada saborizada com xarope de frutas.", 
        preco: "R$15.00", imagem: require('../assets/images/imagemBebida/sodaitaliana.jpg')
    },
    {
        id: 5, titulo: "Cerveja Pilsen (600ml)", descricao: "A favorita para compartilhar em mesas de bar.", 
        preco: "R$15.00", imagem: require('../assets/images/imagemBebida/pilsen.webp')
    },
    {
        id: 6, titulo: "Caipirinha de Limão", descricao: "O coquetel mais tradicional do Brasil, feito com cachaça.", 
        preco: "R$22.00", imagem: require('../assets/images/imagemBebida/caipirinha.jpg')
    },
    {
        id: 7, titulo: "Taça de Vinho Tinto", descricao: "Ideal para acompanhar jantares e momentos especiais.", 
        preco: "R$32.00", imagem: require('../assets/images/imagemBebida/vinho.webp')
    },
    {
        id: 8, titulo: "Gin Tônica", descricao: "Uma opção leve e aromática que ganhou muita popularidade.", 
        preco: "R$35.00", imagem: require('../assets/images/imagemBebida/gin.webp')
    },
    {
        id: 9, titulo: "Drink Negroni", descricao: "Clássico italiano para quem prefere sabores intensos.", 
        preco: "R$40.00", imagem: require('../assets/images/imagemBebida/negroni.jpg')
    }
]