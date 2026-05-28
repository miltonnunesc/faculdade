import { User } from '../types/User'
const BASE_URL = 'https://6a17753d1878294b597b653d.mockapi.io'

export async function fetchUsers():Promise<User[]> {
    const response = await fetch(`${BASE_URL}/dados`)
    if(!response.ok) {
        throw new Error('Erro ao chamar alunos')
    }

    const data: User[] = await response.json()

    return data
}