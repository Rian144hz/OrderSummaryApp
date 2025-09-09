# 🛒 OrderSummaryApp

Um sistema de pedidos em **Java**, simples e funcional, desenvolvido para prática de **Orientação a Objetos**, **listas**, **enums**, **formatação de datas** e valores monetários.  
O aplicativo permite cadastrar clientes, criar pedidos com múltiplos itens e exibir um **resumo completo do pedido** de forma clara e visualmente atraente com emojis.  

---

## 🚀 Funcionalidades do Projeto

- 👤 **Cadastro de Cliente**: Nome, email e data de nascimento  
- 📦 **Criação de Pedido**: Definição do status (PROCESSANDO, FINALIZADO, etc.)  
- 🛒 **Inclusão de Itens no Pedido**: Nome, preço e quantidade de cada produto  
- 🔢 **Cálculo automático de subtotais e total do pedido**  
- 🕒 **Registro do momento do pedido** com data e hora formatadas  
- 🎨 **Exibição visual no console** com emojis e formatação intuitiva  

---

## 🏗️ Conceitos aplicados

Este projeto permitiu praticar e aplicar diversos conceitos importantes de **Java e programação orientada a objetos**:

- **Classes e Objetos**: Cliente, Produto, Pedido, PedidoItem  
- **Encapsulamento**: Uso de getters e setters para proteger dados  
- **Enum**: StatusDoPedido para definir estados fixos de pedidos  
- **Listas (ArrayList)**: Armazenamento dinâmico de múltiplos itens no pedido  
- **Construtores**: Inicialização de objetos com dados obrigatórios  
- **Laços (for)**: Iteração para cadastro de múltiplos itens  
- **Formatação de datas**: `SimpleDateFormat` para datas legíveis  
- **Formatação monetária**: `String.format` para valores com duas casas decimais  
- **Métodos úteis**: `subTotal()` para cada item, `total()` para o pedido inteiro  

---

## 🎯 Aprendizados

Durante o desenvolvimento deste projeto, pude:

- Aplicar **POO na prática**, criando classes que se relacionam e encapsulam informações.  
- Trabalhar com **listas de objetos**, manipulando múltiplos itens dinamicamente.  
- Utilizar **enum para estados**, melhorando legibilidade e segurança do código.  
- Formatar **datas e valores monetários** para uma apresentação clara no console.  
- Aprender a **pensar na lógica de objetos**, separando produto, item e pedido corretamente.  
- Entender a importância de **adicionar objetos dentro de outros objetos** (Produto dentro de PedidoItem, PedidoItem dentro de Pedido).  

---

## 💻 Tecnologias e Ferramentas

- Java SE 21  
- IntelliJ IDEA Community Edition  
- Conceitos de Orientação a Objetos (POO)  
- Manipulação de listas (`ArrayList`)  
- Formatação de datas (`SimpleDateFormat`)  
- Formatação de valores (`String.format`)  

---

## ▶️ Como executar

1. Clone este repositório:
2. Abra no IntelliJ IDEA ou outra IDE Java
3. Siga as instruções no console

   ## 🖼️ Exemplo de saída
   
   📋 ================== RESUMO DO PEDIDO ==================
🕒 Momento da compra: 09/09/2025 14:22:29
📦 Status do pedido: PROCESSANDO

👤 Dados do cliente:
   🧑 Nome: Matheus
   📧 Email: rianmatheus669@gmail.com
   🎂 Data de nascimento: 02/04/2006

🛒 Itens do pedido:
   • TV | 💲 2000,00 | 📦 Quantidade: 1 | 🔢 Subtotal: $2000,00
   • Drone DJI | 💲 2000,00 | 📦 Quantidade: 1 | 🔢 Subtotal: $2000,00

💰 Preço total: $4000,00
=========================================================

   ##
   ```bash
   git clone <URL_DO_REPO>
