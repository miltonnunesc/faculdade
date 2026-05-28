import { FlatList, View, ScrollView } from 'react-native'
import BebidaCard from '../components/bebidaCard'
import { bebida } from '@/data/arrayBebidas'

export default function Lista() {
    return (
        <ScrollView>
            <View>
                <FlatList
                data = {bebida}
                keyExtractor = {(item) => item.id.toString()}
                renderItem = {({item}) => (
                <BebidaCard bebida = {item}/>)}/>
            </View>
        </ScrollView>
    )
}