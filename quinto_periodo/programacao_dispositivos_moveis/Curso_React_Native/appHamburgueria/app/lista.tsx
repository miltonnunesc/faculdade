import { FlatList, View, ScrollView } from 'react-native'
import ProdutoCard from '../components/produtoCard'
import { sandubas } from '../data/arrayProdutos'

export default function Lista() {
    return (
        <ScrollView>
            <View>
                <FlatList
                data = {sandubas}
                keyExtractor = {(item) => item.id.toString()}
                renderItem = {({item}) => (
                <ProdutoCard produto = {item}/>)}/>
            </View>
        </ScrollView>
    )
}