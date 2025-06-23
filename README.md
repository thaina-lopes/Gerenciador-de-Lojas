# 🏬 Projeto Gerenciador de Lojas - Laboratório I (Unisinos)

> 🚀 Projeto desenvolvido em **Java** para a disciplina **Laboratório I** do curso de Análise e Desenvolvimento de Sistemas da Unisinos.

## 📌 Status do Projeto

> **Finalizado**

- ✅ Etapa 1 | Criação de classes – Ok
- ✅ Etapa 2 | Associação entre classes – Ok
- ✅ Etapa 3 | Herança e Polimorfismo – Ok
- ✅ Etapa 4 | Arrays – Ok

---

Este sistema tem como objetivo aplicar os principais conceitos de **programação orientada a objetos (POO)** em Java, por meio do desenvolvimento de um **gerenciador de lojas de um shopping center**. Ao longo do semestre, as funcionalidades foram evoluindo por etapas, englobando desde a criação de classes até o uso de herança, polimorfismo e arrays.

## 🛠️ Funcionalidades implementadas

O sistema foi desenvolvido em etapas e contempla os seguintes recursos:

- **Modelagem orientada a objetos**, com as classes:
  - `Loja`
  - `Produto`
  - `Endereco`
  - `Data`
- **Encapsulamento**, utilizando construtores, getters e setters.
- **Validação de dados**, como verificação de datas válidas e anos bissextos.
- **Associação entre classes**:
  - Uma `Loja` contém `Endereco` e `Data` de fundação.
  - Um `Produto` possui uma `Data` de validade.
- **Herança e polimorfismo**, com subclasses específicas da classe `Loja`:
  - `Cosmetico`
  - `Vestuario`
  - `Bijuteria`
  - `Alimentacao`
  - `Informatica`
- **Arrays** para:
  - Gerenciar o estoque de produtos de cada loja.
  - Gerenciar a lista de lojas do shopping.
- **Menu interativo no terminal**, permitindo:
  - Criar lojas e produtos com entrada via teclado
  - Verificar se um produto está vencido
  - Exibir dados formatados usando `toString()`
- **Classe `Shopping`** com funcionalidades para:
  - Inserir e remover lojas
  - Contar lojas por tipo
  - Encontrar a loja de informática com maior valor de seguro eletrônico

## 📚 Conceitos aplicados

- Programação Orientada a Objetos (POO)
- Herança e sobrescrita de métodos
- Manipulação de arrays
- Entrada de dados via terminal
- Validação de regras de negócio
- Organização e boas práticas em Java
