import {SQLiteDatabase} from 'expo-sqlite'
import {Aluno} from '../types/Aluno'

export async function listarAlunos(db:SQLiteDatabase): Promise<Aluno[]> {
    return db.getAllAsync<Aluno>('SELECT * FROM alunos;')
}

export async function adicionarAlunoDB(
    db: SQLiteDatabase,
    nome: string,
    email: string
): Promise<void> {
    await db.runAsync(
        'INSERT INTO alunos (nome, email) VALUES (?, ?);',
        [nome, email],
    )
}

export async function removerAlunoDB(
    db: SQLiteDatabase,
    id: number,
    ): Promise<void>{
        await db.runAsync(
            'DELETE FROM alunos WHERE id = ?;',
            [id]
        )
}