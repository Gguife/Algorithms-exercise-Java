# Palindrome Number
x é um número inteiro.
Verificaremos se x é um PALÍNDROMO.

***OBS: Palíndromo = números que são iguais de trás para frente e de frente para trás.***
- Exemplos:
  ```
   121
   11
  ```
    - Números negativos não são palíndromos como por exemplo: (-121) não é um palíndromo.
    - Devemos criar uma função para descobrir se x é um palíndromo. Se sim,
      ***return true*** ; caso contrário, ***return false***.


## Principal ideia para resolução
  ```java
 public static boolean palindromeNumber(int x) {
    String numStr = Integer.toString(x);
    StringBuilder reverseNum = new StringBuilder();
    
    //Method to integer reverse
    for(int i = numStr.length() - 1; i >= 0; i--) {
      reverseNum.append(numStr.charAt(i));
    }
    
    return numStr.equals(reverseNum.toString());
}
  ```
- Esta função `palindromeNumber` verifica se um número inteiro `x` é um palíndromo. 
Primeiro, converte o número para uma string usando `toString()`, permitindo manipulação de caracteres. 
Em seguida, itera sobre a string reversa, construindo `reverseNumberStr`. 
Se a string original e a string reversa forem iguais, retorna `true`, indicando que o número é um palíndromo; 
caso contrário, retorna `false`.