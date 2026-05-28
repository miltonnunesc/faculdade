import { FlatList, StyleSheet, Text, View } from 'react-native'

export default function Index(){
    return (
        <FlatList
            data = {frutas}
            keyExtractor = {}
            renderItem = {}
        />

        /*
        <View style = {styles.container}>
            <Text style = {styles.texto}>
                Texto
            </Text>
        </View>
        */
    )
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: "center",
        alignItems: "center",
        backgroundColor: "#17c0ef"
    },

    texto: {
        fontSize: 20,
        color: "#80084e"
    }
})