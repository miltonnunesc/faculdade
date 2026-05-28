import { FlatList, View, ScrollView } from 'react-native'
import PizzaCard from '../components/pizzaCard'
import { pizza } from '../data/arrayPizzas'

export default function Lista() {
    return (
        <ScrollView>
            <View>
                <FlatList
                data = {pizza}
                keyExtractor = {(item) => item.id.toString()}
                renderItem = {({item}) => (
                <PizzaCard pizza = {item}/>)}/>
            </View>
        </ScrollView>
    )
}