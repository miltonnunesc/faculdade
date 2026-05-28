import {View, Text, Image, StyleSheet} from 'react-native'
import {Link} from 'expo-router'

export default function Index() {
    return (
        <View style = {styles.principal}>
            <View style = {styles.header}>
                <Text style = {styles.titulo}></Text>
                <View style = {styles.nav}>
                    <Link style = {styles.link} href={"/criar_conta"}>Criar Conta</Link>
                    <Link style = {styles.link} href={"/contatos"}>Contatos</Link>
                    <Link style = {styles.link} href={"/produtos"}>Produtos</Link>
                    <Link style = {styles.link} href={"/sobre"}>Sobre Nós</Link>
                </View>
            </View>

            <View style = {styles.body}>
                <Image style = {styles.imagem} source = {require("../../assets/images/gato.jpg")}/>
            </View>

            <View style = {styles.footer}>
                <Text style = {styles.titulo}>Copyright @2026</Text>
            </View>
        </View>
    )
}

const styles = StyleSheet.create({
    principal : {
        flex: 1
    },

    header : {
        height: 60,
        justifyContent: "center",
        alignItems: "center",
        backgroundColor: "#b67805"
    },

    titulo : {
        fontSize: 32,
        color: "#f1f1f1",
    },

    nav : {
        flexDirection: "row",
        gap: 36,
    },
    
    link : {
        fontSize: 22,
        color: "#f1f1f1"
    },

    body : {
        flex: 1,
        backgroundColor: "#252020",
        justifyContent: "center",
        alignItems: "center"

    },

    footer : {
        backgroundColor: "#b67805",
        justifyContent: "center",
        alignItems: "center"
    },

    imagem : {
        width: 400,
        height: 400,
        borderRadius: 20
    },
})