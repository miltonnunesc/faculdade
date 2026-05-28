import {View, Text, StyleSheet, Image} from 'react-native'
import { User } from '../types/User'

interface Props{
    user: User
}

export function UseCard({user}: Props) {
    return(
        <View style = {styles.card}>
            <Image style = {styles.foto}/>
            <View style = {styles.info}>
                <Text style = {styles.nome}>{user.nome}</Text>
                <Text style = {styles.email}>{user.email}</Text>
            </View>
        </View>
    )
}

const styles = StyleSheet.create({
    card: {
        flexDirection: "row",
        alignItems: "center",
        backgroundColor: "#f5f5f5",
        borderRadius: 12,
        shadowColor: "#0f0e0e",
        elevation: 2
    },

    foto: {
        width: 50,
        height: 50,
    },

    info: {
        marginLeft: 12,
        flex: 1,
    },

    nome: {
        marginLeft: 16,
        fontWeight: "600",
        color: "#050000ee",
    },

    email: {
        fontSize: 14,
        fontWeight: "400",
        color: "#4e4d4dee"
    }
})