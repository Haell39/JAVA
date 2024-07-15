package DSA.Space_Complexity;

//* Complexidade de Espaço

public class SpaceComplexityO1 {

    public static void greet(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        greet(5);  // Output: "Hello" 5 times
    }
}

/*
    Complexidade de espaço se refere à quantidade de memória que um algoritmo utiliza em relação ao tamanho de sua entrada.
    Exemplo de Complexidade de Espaço O(1)
    Um método que utiliza um "espaço constante", independentemente do tamanho da entrada:
*/


