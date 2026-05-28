import { FlatList, View, ScrollView } from 'react-native'
import DoceCard from '../components/doceCard'
import { doce } from '../data/arrayDoces'

export default function Lista() {
    return (
        <ScrollView>
            <View>
                <FlatList
                data = {doce}
                keyExtractor = {(item) => item.id.toString()}
                renderItem = {({item}) => (
                <DoceCard doce = {item}/>)}/>
            </View>
        </ScrollView>
    )
}