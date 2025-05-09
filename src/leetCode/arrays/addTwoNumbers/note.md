# Add Two Numbers

Você recebe duas listas vinculadas não vazias que representam dois números inteiros não negativos.</br>
Os dígitos são armazenados em ordem inversa e cada um de seus nós contém um único dígito. </br>
Adicione os dois números e retorne a soma como uma lista vinculada.

Você pode assumir que os dois números não contêm nenhum zero à esquerda, exceto o próprio número 0.

- Entrada:
    - l1 = [2,4,3]
    - l2 = [5,6,4]
    - Saída: [7,0,8]
    - Explicação: 342 + 465 = 807.


## Principal ideia para resolução
  ```java
 public static int[] addTwoNumbers(int[] l1, int[] l2) {
       List<Integer> resultList = new ArrayList<>();
       int carry = 0;
       int i = 0, j = 0;
    
       while(i < l1.length || j < l2.length || carry > 0) {
          int sum = carry;
    
          if(i < l1.length) {
             sum += l1[i];
             i++;
          }
    
          if(j < l2.length) {
             sum += l2[j];
             j++;
          }
    
          carry = sum / 10;
          resultList.add(sum % 10);
       }
    
    
       //Convert the result list to an array
       return resultList.stream().mapToInt(Integer::intValue).toArray();
}
  ```
Esta função `addTwoNumbers` recebe duas listas vinculadas representando   números inteiros não negativos.
Cada nó contém um único dígito, e os números são armazenados em ordem inversa.
A função adiciona os dois números e retorna a soma como uma nova lista vinculada.

Durante a adição, a função percorre as duas listas, somando os valores dos nós correspondentes.
Se a soma de dois dígitos exceder 9, um valor de transporte é gerado para a próxima adição.
Os resultados são armazenados em uma nova lista vinculada.

A função continua a adição até que ambos os números tenham sido completamente percorridos e não haja mais transporte.
Em seguida, retorna a cabeça da nova lista vinculada contendo o resultado da adição.