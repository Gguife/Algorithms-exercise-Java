# Median of two sorted arrays

Dado dois arrays ordenados `nums1` e `nums2`, 
devemos combinar e encontrar a mediana dos arrays combinados.

A mediana é:
- O número do meio se a quantidade de elementos for impar;
- A média dos dois números centrais caso a quantidade de elemetnos for par;

---

### Exemplo 
```java
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int[] merged = new int[nums1.length + nums2.length];
    int i = 0; //nums1 value
    int j = 0; //nums2 value
    int k = 0; //merge value

    while(i < nums1.length && j < nums2.length) {
        if(nums1[i] < nums2[j]) {
            merged[k] = nums1[i];
            k++; i++;
        }else {
            merged[k] = nums2[j];
            k++; j++;
        }
    }

    while(i < nums1.length) {
        merged[k] = nums1[i];
        k++; i++;
    }

    while(j < nums2.length) {
        merged[k] = nums2[j];
        k++; j++;
    }

    int n = merged.length;
    if(n % 2 != 0) {
        return merged[n / 2];
    }else {
        return (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
    }
}
```
---

## Explicacão
**Passo 1:** Criar o merged
```java
    int[] merged = new int[nums1.length + nums2.length];
    int i = 0; int j = 0; int k = 0;
```
**Passo 2:** Comparar e preencher a matriz merged ordenadamente
```java
   while(i < nums1.length && j < nums2.length) {
        if(nums1[i] < nums2[j]) {
            merged[k] = nums1[i];
            k++; i++;
        }else {
            merged[k] = nums2[j];
            k++; j++;
        }
    }
```
**Passo 3:** Inserir em merged os elementos que sobrar em nums1 ou nums2
```java
    while(i < nums1.length) {
        merged[k] = nums1[i];
        k++; i++;
    }

    while(j < nums2.length) {
        merged[k] = nums2[j];
        k++; j++;
    }
```

**Passo 4:** Calculamos a mediana
```java
    int n = merged.length;
    if(n % 2 != 0) {
        return merged[n / 2];
    }else {
        return (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
    }
```


