import { router } from 'expo-router'
import { Image, StyleSheet, Text, TouchableOpacity, View } from 'react-native'
import { prodType } from '../types/prodType'

type Props = {outro: prodType}

export default function OutroCard({outro}: Props) {

    return(
        <TouchableOpacity style = {styles.card}
        onPress = {()=> router.push(`/produtoOutro/${outro.id}`)}>
            <View style = {styles.info}>
                <Text style = {styles.titulo}>{outro.titulo}</Text>
                <Text style = {styles.preco}>{outro.preco}</Text>
            </View>
            <Image style = {styles.imagem} source = {outro.imagem} resizeMode = 'cover'/>
        </TouchableOpacity>
    )
}

const styles = StyleSheet.create({
    card: {
        backgroundColor: "#f1f1f1",
        borderRadius: 16,
        marginHorizontal: 16,
        marginVertical: 8,
        elevation: 3,
        shadowColor: "#000000",
        shadowOpacity: 0.08,
        shadowRadius: 8,
        flexDirection: "row",
        alignItems: "center",
        paddingHorizontal: 16,
        paddingVertical: 12,
    },

    info: {
        flex: 1,
        gap: 6,
    },

    titulo: {
        fontSize: 18, 
        fontWeight: "700", 
        color: "#1a1a1a",
    },

    preco: {
        fontSize: 16,
        color: "#e63946",
        fontWeight: "600",
    },

    imagem: {
        width: 110,
        height: 110,
        borderRadius: 12,
        marginLeft: 12,
    }
})