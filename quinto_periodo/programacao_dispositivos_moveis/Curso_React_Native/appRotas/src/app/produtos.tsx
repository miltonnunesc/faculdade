import {View, Text, StyleSheet} from 'react-native'
import {Link} from 'expo-router'

export default function Produtos() {
    return (

        <View style = {styles.container}>
            <Text style = {styles.titulo}>Crie seu Produto</Text>
            <Link style = {styles.voltar} href={"/"}>Voltar</Link>
        </View>
    )
}

const styles = StyleSheet.create({
    container : {
        flex: 1,
        justifyContent: "center",
        alignItems: "center",
        backgroundColor: "#f80606"
    },

    titulo : {
        fontSize: 42,
        color: "#1c08f8"
    },
    
    voltar : {
        fontSize: 32,
        color: "#eeeef5"
    }
})