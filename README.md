# Cadastro de Veiculos OO
Projeto desenvolvido em Java para praticar conceitos de Programacao Orientada a Objetos (POO), incluindo classes, atributos, metodos, objetos, encapsulamento e colecoes.

## Objetivo

Desenvolver um sistema de cadastro de veiculos que permita:
- cadastrar veiculos;
- listar os veiculos cadastrados;
- consultar um veiculo pela placa;
- impedir placas duplicadas;
- validar o ano de fabricacao.
Os dados sao armazenados somente em memoria durante a execucao do programa.

## Estrutura do projeto

```text
CadastroVeiculosOO/
|-- Main.java
|-- Veiculo.java
|-- Input.java
`-- README.md
```

## Classe Veiculo

A classe `Veiculo` representa cada veiculo cadastrado no sistema.
Atributos:
- `marca` - String;
- `modelo` - String;
- `ano` - int;
- `placa` - String.
Os atributos sao privados e sao acessados por metodos getters e setters.

## Armazenamento

Os veiculos sao armazenados em uma lista:
```java
List<Veiculo> veiculos = new ArrayList<>();
```
Como nao existe banco de dados, os dados sao perdidos quando o programa e encerrado.

## Menu

```text
======= Cadastro de Veiculos OO =======
1 - Cadastrar Veiculo
2 - Listar Veiculos
3 - Consultar Veiculo
0 - Sair
```
O programa continua executando ate que o usuario escolha a opcao `0`.

## Funcionalidades

### 1 - Cadastrar Veiculo
Solicita marca, modelo, ano e placa.
O ano deve estar entre 1900 e o ano atual + 1. O ano atual e obtido com:
```java
LocalDate.now().getYear()
```
Antes de cadastrar, o sistema tambem verifica se ja existe outro veiculo com a mesma placa.

### 2 - Listar Veiculos
Exibe marca, modelo, ano e placa de todos os veiculos cadastrados.
Caso a lista esteja vazia, informa que nenhum veiculo foi cadastrado.

### 3 - Consultar Veiculo
Solicita uma placa e percorre a lista procurando o veiculo correspondente.
Se encontrar, exibe os dados do veiculo. Caso contrario, informa que nenhum veiculo foi encontrado.

### 0 - Sair
Encerra o sistema.

## Conceitos utilizados
- classe e objeto;
- atributos;
- construtor;
- encapsulamento;
- getters e setters;
- metodos;
- `List`;
- `ArrayList`;
- `if`;
- `switch`;
- `for`;
- `while`;
- `do...while`;
- `LocalDate`.
```

## GRUPO
RA: 1102339 - Kélen Camargo dos Santos
RA: 1140047 - Caroline Russo Zilio
RA: 1139410 - Vitória Drechsler

Atividade desenvolvida para a disciplina de Programação Orientada a Objetos.
