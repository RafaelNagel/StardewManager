# Stardew Manager

Projeto desenvolvido em Java para reforçar conceitos de **Programação Orientada a Objetos (POO)**, utilizando como temática o gerenciamento de animais de um curral inspirado em **Stardew Valley**.

A aplicação permite visualizar os animais presentes no curral e realizar operações relacionadas à coleta de produtos, utilizando conceitos como **interfaces, herança, polimorfismo e estruturas de dados**.

## Sobre o projeto

O **Stardew Manager** foi desenvolvido como uma atividade prática de reforço dos fundamentos de Programação Orientada a Objetos em Java.

O sistema representa diferentes tipos de animais, cada um com suas próprias características e comportamentos. Através da aplicação de **herança e polimorfismo**, diferentes animais podem ser tratados de maneira uniforme por meio da interface `Animal`.

Entre os animais representados estão vacas, galinhas e ovelhas, além de classes específicas para representar seus filhotes.

## Funcionalidades

* Visualização dos animais presentes no curral
* Exibição de informações dos animais
* Identificação por ID
* Nome, raça e idade dos animais
* Exibição do status de cada animal
* Emissão de sons específicos de cada animal
* Coleta de produtos produzidos pelos animais
* Menu interativo pelo terminal
* Representação de mães e filhotes através de herança
* Manipulação de diferentes tipos de animais utilizando polimorfismo

## Conceitos de POO aplicados

### Interface

A interface `Animal` define os comportamentos e informações que devem ser implementados pelos diferentes tipos de animais.

Entre os métodos definidos estão:

```java
void emitirSom();

void coletarProduto();
```

Além desses, a interface também define métodos para obter as informações dos animais, como nome, raça, idade e status.

### Herança

A herança é utilizada para representar a relação entre os animais adultos e seus filhotes.

Exemplo:

```text
VacaMae
    |
    └── Bezerro
```

```text
GalinhaMae
    |
    └── Pintinho
```

As classes `Bezerro` e `Pintinho` herdam características das respectivas classes-base e podem sobrescrever comportamentos específicos.

### Polimorfismo

Os animais são armazenados utilizando o tipo da interface `Animal`:

```java
List<Animal> animais = new ArrayList<>();
```

Isso permite armazenar diferentes implementações de `Animal` na mesma estrutura de dados.

Por exemplo:

```java
animais.add(new VacaMae(...));
animais.add(new GalinhaMae(...));
animais.add(new Ovelha(...));
```

Cada objeto mantém seu próprio comportamento ao executar métodos como:

```java
animal.emitirSom();
animal.coletarProduto();
```

### Encapsulamento

Os atributos dos animais são mantidos como `private`, sendo acessados através de métodos específicos, mantendo os dados protegidos dentro de suas respectivas classes.

### Sobrescrita de métodos

As subclasses utilizam `@Override` para modificar comportamentos herdados quando necessário.

Exemplo:

```java
@Override
public void coletarProduto() {
    System.out.println(getNome() + " ainda não produz leite.");
}
```

## Estrutura do projeto

```text
stardewManager/
│
├── Animal.java
│
├── VacaMae.java
├── Bezerro.java
│
├── GalinhaMae.java
├── Pintinho.java
│
├── Ovelha.java
│
└── stardewManager.java
```

## Exemplo de saída

Ao executar o projeto e selecionar a opção de visualizar os animais, o sistema apresenta uma saída semelhante a:

```text
--- MENU PRINCIPAL ---
1. Ver animais do curral
2. Comércio (Coletar/Retirar produtos)
3. Sair

Escolha uma opção: 1

--------------------------------------------------
                 ANIMAIS NO CURRAL:
--------------------------------------------------

[ID: 101] Mimosa (Vaca)
 - Raça: Holandesa
 - Idade: 7 anos | Status: Sem filhotes
 - Som: Muuu!

[ID: 102] Giselda (Galinha)
 - Raça: Caipira
 - Idade: 1 ano | Status: Botando ovos
 - Som: Có-có!

[ID: 103] Chiquinha (Ovelha)
 - Raça: Merino
 - Idade: 3 anos | Status: Pronta para tosquia
 - Som: Mééé!

--------------------------------------------------
```

## Tecnologias utilizadas

* **Java**
* **Programação Orientada a Objetos**
* **Java Collections**
* **IntelliJ IDEA**

## Como executar

### Pré-requisitos

Para executar o projeto, é necessário ter instalado:

* Java JDK 21 ou superior
* Uma IDE compatível com Java, como IntelliJ IDEA, Eclipse ou VS Code

### Clonando o repositório

```bash
git clone <URL_DO_REPOSITORIO>
```

Depois, abra o projeto na sua IDE.

### Executando

Localize a classe principal:

```text
stardewManager.java
```

Execute o método:

```java
public static void main(String[] args)
```

Após a execução, o menu será exibido no terminal.

## Objetivo do projeto

O principal objetivo deste projeto é praticar e consolidar conceitos fundamentais de **Programação Orientada a Objetos utilizando Java**.

Os principais conceitos trabalhados foram:

* Interfaces
* Herança
* Polimorfismo
* Encapsulamento
* Sobrescrita de métodos
* Classes e objetos
* Coleções
* Estruturação e organização de um projeto Java

## Contexto acadêmico

Projeto desenvolvido como atividade prática de reforço de **Programação Orientada a Objetos** durante o **Geração Caldeira 2026**, na trilha de **Programação Java**.

A temática baseada em Stardew Valley foi utilizada para tornar a aplicação dos conceitos de POO mais prática e próxima de um cenário de desenvolvimento.

## Autor

**Rafael Nagel de Souza**

Estudante de Ciência da Computação e participante do **Geração Caldeira 2026**, com foco em desenvolvimento backend utilizando **Java e Spring Boot**.
