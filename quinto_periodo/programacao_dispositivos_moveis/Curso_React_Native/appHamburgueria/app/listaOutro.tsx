import { FlatList, View, ScrollView } from 'react-native'
import OutroCard from '../components/outroCard'
import { outro } from '../data/arrayOutros'

export default function Lista() {
    return (
        <ScrollView>
            <View>
                <FlatList
                data = {outro}
                keyExtractor = {(item) => item.id.toString()}
                renderItem = {({item}) => (
                <OutroCard outro = {item}/>)}/>
            </View>
        </ScrollView>
    )
}