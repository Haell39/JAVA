public class Functions {
    
    // Uma função é um pedaço de código que pode ser chamado de várias vezes
    // Ela é útil para evitar repetições de código
    
    // Função para somar dois números
    public static int sum(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        //* Exemplo de uso da função sum
        int result = sum(5, 10);
        System.out.println("A soma de 5 e 10 é: " + result);

        //* Usando denovo a função sum
        result = sum(15, 20);
        System.out.println("A soma de 15 e 20 é: " + result);
    }
}

