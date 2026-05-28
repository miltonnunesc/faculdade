import { Stack } from 'expo-router'

export default function RootLayout() {
    return(
        <Stack>
            <Stack.Screen name = "index" options={{title: "Tela Inicial"}}/>
            <Stack.Screen name = "produto/[id]" options={{title: "Detalhe Sanduiche"}}/>
            <Stack.Screen name = "produtoPizza/[id]" options={{title: "Detalhe Pizza"}}/>
            <Stack.Screen name = "produtoBebida/[id]" options={{title: "Detalhe Bebida"}}/>
            <Stack.Screen name = "produtoDoce/[id]" options={{title: "Detalhe Doce"}}/>
            <Stack.Screen name = "produtoOutro/[id]" options={{title: "Detalhe Outro"}}/>
        </Stack>
    )
}