import {useState, useMemo} from 'react'
import {View, Text, StyleSheet, TextInput, FlatList, TouchableOpacity, ActivityIndicator, } from 'react-native' 
import { useUsers } from '../hooks/useUsers'
import { UseCard } from '../components/UserCard'

export function HomeScreen() {
    const {users, loading, error, refetch} = useUsers()
    const [query, setQuery] = useState('')
    const filtered = useMemo(() => {
        if(!query.trim()) return users;
        return users.filter((u) => 
            u.nome.toLowerCase().includes(query.toLowerCase())
        )
    }, [users,query])

    if(loading){
        return(
            <View>
                <ActivityIndicator size={"large"} color={"#a80865"}/>
            </View>
        )
    }

    if(error){
        return(
            <View>
                <Text>{error}</Text>
                <TouchableOpacity onPress={refetch}>
                    <Text>Tente Novamente</Text>
                </TouchableOpacity>
            </View>
        )
    }

    return(
        <View>
            <TextInput
                value={query}
                onChangeText={setQuery}
                placeholder="Buscar usuário..."
            />

            <FlatList
                data={filtered}
                keyExtractor={(item) => item.id}
                renderItem={({item}) => <UseCard user={item}/>}
                ListEmptyComponent={
                    <Text>Nenhum Aluno Listado</Text>
                }
            />
        </View>
    )
}

