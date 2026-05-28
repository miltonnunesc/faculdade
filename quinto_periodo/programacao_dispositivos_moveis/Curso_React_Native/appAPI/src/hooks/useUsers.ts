import {useState, useEffect} from 'react'
import {User} from '../types/User'
import { fetchUsers } from '../services/api'

interface UseUserReturn {
    users: User[]
    loading: boolean
    error: string | null
    refetch: () => void
}

export function useUsers(): UseUserReturn {
    const [users, setUser] = useState<User[]>([])
    const [loading, setLoading] = useState(true)
    const [error, setError] = useState<string | null>(null)

    async function load() {
        setLoading(true)
        setError(null)
        try {
            const data = await fetchUsers()
            setUser(data)
        } catch (err) {
            setError(err instanceof Error ? err.message: "Erro desconhecido")
        } finally {
            setLoading(false)
        }
    }

    useEffect(() => {
        load();
    }, [])

    return{users, loading, error, refetch: load}
}