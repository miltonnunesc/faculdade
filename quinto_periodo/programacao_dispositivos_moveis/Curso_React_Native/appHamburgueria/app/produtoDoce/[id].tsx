import { useLocalSearchParams } from 'expo-router'
import { Image, StyleSheet, Text, TouchableOpacity, View } from 'react-native'
import { doce } from '../../data/arrayDoces'

export default function Id() {
    const {id} = useLocalSearchParams<{id:string}>()
    const produto = doce.find((p)=> p.id === Number(id))
    
    if(!produto) return <Text>Esse produto não existe!</Text>
        return(
            <View style = {styles.container}>
                <Image style = {styles.image} source={produto.imagem} resizeMode='cover'/>

                <View style = {styles.info}>
                    <Text style = {styles.nome}>{produto.titulo}</Text>
                    <Text style = {styles.preco}> {produto.preco}</Text>
                    <Text style = {styles.descricao}>{produto.descricao}</Text>

                    <TouchableOpacity style = {styles.botaoComprar}>
                        <Text style = {styles.botaoComprarText}>Add Carrinho</Text>
                    </TouchableOpacity>
                    
                    <TouchableOpacity style = {styles.botaoVoltar}>
                        <Text style = {styles.botaoVoltarTexto}>Voltar</Text>
                    </TouchableOpacity>
                </View>
            </View>
        )
}

const styles = StyleSheet.create({
    container: {
        flex: 1, 
        backgroundColor: "#fff"
    },

    image: {
        width: "100%",
        height: 300
    },

    info: {
        padding: 20,
        gap: 12
    },

    nome: {
        fontSize: 24,
        fontWeight: "bold",
        color: "#222"
    },

    preco: {
        fontSize: 40,
        fontWeight: "600",
        color: "#8e0866",
    },

    descricao: {
        fontSize: 25,
        color: "#555",
        lineHeight: 22,
        marginTop: 8
    },

    botaoComprar: {
      backgroundColor: "#f10b0b",
      paddingVertical: 14,
      borderRadius: 10,
      alignItems: "center",
      marginTop: 16  
    },

    botaoComprarText: {
        fontSize: 24,
        fontWeight: "bold",
        color: "#fff"
    },

    botaoVoltar: {
        paddingVertical: 12,
        alignItems: "center",
        marginTop: 8
    },

    botaoVoltarTexto: {
        fontSize: 14,
        color: "#444"
    },

    errorTexto: {
        fontSize: 16,
        color: "#666",
        marginBottom: 16
    },
})