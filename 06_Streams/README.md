# Exercício: Registros de Vendas com Arquivos CSV

## Objetivo

Praticar:
- Leitura de arquivos CSV em Java
- Uso de coleções
- Associação entre objetos via chave (id)

## Arquivos de Entrada

Teremos dois arquivos de entrada, um para descrever os produtos, e outro para descrever vendas desses produtos. 

O cadastro de produtos (`produtos.csv`) tem este formato (codificado em ISO 8859-1):

```
id,nome,preco
1,Teclado,120.50
2,Mouse,60.00
3,Monitor de Alta Resolução,900.00
4,Cabo HDMI,25.00
```

O registro de vendas (`vendas.csv`) tem este formato (e faz referência ao `id` de um produto na coluna `idProduto`):

```
idVenda,idProduto,quantidade
101,1,2
102,3,1
103,2,3
104,4,5
```

## Tarefas

### 1. Criar as classes Java para representar produtos e vendas. 

Veja o diagrama UML no arquivo [loja.png](loja.png). (Adicione os atributos que forem necessários.)

`Loja` é uma factory de `Produto` e `Venda`.

Note que deve haver navegabilidade bidirecional entre produtos e vendas: ou seja, dado um produto, queremos saber suas vendas, e dada uma venda, queremos saber qual o produto vendido.

### 2. Ler os arquivos CSV. 

Crie uma classe para isso (`Leitor`). O leitor deve retornar uma `Loja` com os produtos e vendas dos arquivos.

Dica: ler antes o arquivo de produtos e depois o arquivo de vendas. Ao ler o arquivo de vendas, buscar o `Produto` correspondente pelo `idProduto` e criar a `Venda` deste produto.

### 3. Relatório: Exibir as vendas no console.

Para cada venda, exibir no seguinte formato:

```
Venda 101: 2x Teclado - Total: R$ 240.00
```

Em ordem crescente de valor da venda. 


### 4. Relatório: Exibir total:

Exibir ao final do relatório o total geral de todas as vendas:

```
Total geral: R$ 1,495.00
```

---

## Dicas

- Separe os pacotes "leitura" (somente leitura do arquivo), "loja" (classes de domínio) e "relatorios" (só saída no console).
- Use `BufferedReader` e `String.split(",")` para ler os arquivos linha a linha. 
- Converta valores com `Integer.parseInt()`, `Float.parseFloat()` ou `Double.parseDouble()`.
- Use `String.format()` ou `System.out.printf()` para formatar a saída.

- A formatação de números depende do `Locale` padrão da máquina: em um computador configurado em português, `%,.2f` produz `1.495,00` em vez de `1,495.00`. Para obter sempre o formato pedido (ponto decimal e vírgula separando os milhares), passe `Locale.US` explicitamente (com `import java.util.Locale;`):

  ```java
  System.out.println(String.format(Locale.US, "Total geral: R$ %,.2f", total));
  // ou 
  System.out.printf(Locale.US, "Venda %d: %dx %s - Total: R$ %,.2f%n", id, quantidade, nome, valor);
  ```

  No formato `%,.2f`, a vírgula liga o separador de milhares e `.2` fixa duas casas decimais. Outra opção é definir o padrão uma única vez no início do `main` com `Locale.setDefault(Locale.US);`.
