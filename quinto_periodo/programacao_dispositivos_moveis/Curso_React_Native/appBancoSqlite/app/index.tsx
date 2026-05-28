import { SQLiteDatabase } from 'expo-sqlite'
import {View, Text, StyleSheet, Alert, ActivityIndicator} from 'react-native'
import React, {useEffect, useState} from 'react'
import { getDB } from '../app/database'
import { listarAlunos, adicionarAlunoDB, removerAlunoDB } from '../src/repositories/AlunoRepository'
import { AlunoForm } from '../src/components/AlunoForm'
import { AlunoList } from '../src/components/AlunoList'
import { Aluno } from '../src/types/Aluno'

export default function HomeScreen(){
    const [db, setDB] = useState<SQLiteDatabase | null>(null)
    const [alunos, setAlunos] = useState<Aluno[]>([])
    const [nome, setNome] = useState('')
    const [email, setEmail] = useState('')
    const [loading, setLoading] = useState(true)

    useEffect(() => {
        getDB()
        .then((banco)=> {setDB(banco)
            return listarAlunos(banco).then(setAlunos)
        })

        .finally(() => setLoading(false))
    }, [])

    async function carregarAlunos(banco:SQLiteDatabase) {
        const resultado = await listarAlunos(banco)
        setAlunos(resultado)
    }

    async function adicionarAluno() {
        if(!db) return
        if(!nome || !email) {
            Alert.alert("Campos Vazios")
            return
        }

        await adicionarAlunoDB(db, nome, email)
        setNome('')
        setEmail('')
        await carregarAlunos(db)
    }

    async function removerAluno(id:number) {
        if(!db) return
        await removerAlunoDB(db, id)
        await carregarAlunos(db)
    }

    if (loading) {
        return(
            <View style = {styles.center}>
                <ActivityIndicator size = "large"/>
                <Text>Carregando...</Text>
            </View>
        )
    }

    return(
        <View style = {styles.container}>
            <Text style = {styles.titulo}>Cadastro de Alunos</Text>
            <AlunoForm
                nome = {nome}
                email = {email}
                onChangeNome={setNome}
                onChangeEmail={setEmail}
                onSubmit={adicionarAluno}
            />
            <AlunoList alunos={alunos} onRemover={removerAluno}/>
        </View>
    )
}
 
const styles = StyleSheet.create({
    container: {
        flex: 1,
        padding: 20,
        backgroundColor: "#f1f1f1"
    },

    center: {
        flex: 1,
        justifyContent: "center",
        alignItems: "center"
    },

    titulo: {
        fontSize: 22,
        fontWeight: "bold",
        marginBottom: 20
    }
})