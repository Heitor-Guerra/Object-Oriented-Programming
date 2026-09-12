# Laboratório 1 - Programação Orientada a Objetos

Este projeto contém um exemplo simples de um domínio bancário. Os arquivos-fonte Java ficam em `src` e os arquivos compilados serão gerados em `bin`.

## Antes de começar

É necessário instalar um **JDK** (Java Development Kit). O JDK inclui dois programas usados neste roteiro:

- `javac`: transforma os arquivos `.java` em arquivos `.class` que podem ser executados.
- `java`: executa uma classe compilada.

Abra um terminal e confirme que o JDK está disponível:

```text
java -version
javac -version
```

Os dois comandos devem mostrar uma versão. Se `javac` não for reconhecido, instale um JDK e configure-o no `PATH` do sistema antes de continuar.

## Linux

1. Abra o terminal.
2. Entre na pasta do projeto. Substitua o caminho pelo local em que você salvou o laboratório:

	```bash
	cd /caminho/para/lab1
	```

3. Compile todas as classes de `src`, enviando o resultado para `bin`:

	```bash
	javac -d bin src/*.java
	```

4. Execute a classe `App`:

	```bash
	java -cp bin App
	```

## Windows

Os comandos abaixo funcionam no **Prompt de Comando** (`cmd`). Abra-o pelo menu Iniciar.

1. Entre na pasta do projeto. Use aspas quando o caminho possuir espaços:

	```bat
	cd "C:\caminho\para\lab1"
	```

2. Compile todas as classes de `src`:

	```bat
	javac -d bin src\*.java
	```

3. Execute a classe `App`:

	```bat
	java -cp bin App
	```

## Entendendo os comandos

Em `javac -d bin src/*.java`, a opção `-d bin` indica que os arquivos compilados devem ser criados na pasta `bin`. O trecho `src/*.java` seleciona todos os arquivos Java da pasta `src`.

Em `java -cp bin App`, a opção `-cp bin` informa onde estão as classes compiladas e `App` é o nome da classe que possui o método `main`, ponto de início do programa. Não use a extensão `.java` nem `.class` nesse último comando.

Após alterar qualquer arquivo em `src`, repita os passos de compilação e execução.
