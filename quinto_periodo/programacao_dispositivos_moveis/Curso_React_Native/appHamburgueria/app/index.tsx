import { router } from 'expo-router'
import { Image, StyleSheet, TouchableOpacity, View, ScrollView } from 'react-native'

export default function Index() {
    return (
        <ScrollView>
            <View style = {styles.container}>
                <TouchableOpacity
                onPress = {() => router.push('/lista')}>
                    <Image style = {styles.imagem}
                    source = {require('../assets/images/bannerPrincipal.jpg')}/>
                </TouchableOpacity>

                <TouchableOpacity
                onPress = {() => router.push('/listaPizza')}>
                    <Image style = {styles.imagem}
                    source = {require('../assets/images/bannerPizza.jpg')}/>
                </TouchableOpacity>

                <TouchableOpacity
                onPress = {() => router.push('/listaBebida')}>
                    <Image style = {styles.imagem}
                    source = {require('../assets/images/bannerBebida.jpg')}/>
                </TouchableOpacity>

                <TouchableOpacity
                onPress = {() => router.push('/listaDoce')}>
                    <Image style = {styles.imagem}
                    source = {require('../assets/images/bannerDoces.webp')}/>
                </TouchableOpacity>

                <TouchableOpacity
                onPress = {() => router.push('/listaOutro')}>
                    <Image style = {styles.imagem}
                    source = {require('../assets/images/bannerOutro.jpg')}/>
                </TouchableOpacity>
            </View>
        </ScrollView>
    )
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        alignItems: "center",
    },

    imagem: {
        width: 480,
        height: 180,
        borderRadius: 20,
        marginTop: 10,
    }
})