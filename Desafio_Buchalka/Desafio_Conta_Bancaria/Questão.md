## Desafio: Classe Conta Bancária

### Instruções

#### 1. Criar a Classe da Conta Bancária
- Crie uma nova classe para uma **conta bancária**.

#### 2. Criar os Atributos (Campos)
Inclua os seguintes campos:
- `número da conta`
- `saldo da conta`
- `nome do cliente`
- `e-mail`
- `número de telefone`

#### 3. Criar os Getters e Setters
- Crie **métodos getters e setters** para cada campo criado.

#### 4. Criar Métodos Comportamentais
Crie dois métodos adicionais:
- Um método para **depositar fundos** na conta.
- Um método para **sacar fundos** da conta.

> ⚠️ **Regra importante:** o cliente **não pode sacar** valores que deixem o saldo **negativo**.

---

### Projeto Principal

#### 5. Criar o Projeto
- Crie um novo projeto chamado `ClassesChallenge`.

#### 6. Classe Main
- Crie a classe `Main` com o método `main` usual.

#### 7. Instanciar e Testar
- Crie pelo menos **uma instância** da classe de conta bancária.
- Teste os métodos de **depósito** e **saque**.
- Imprima no console o **saldo atual** após cada operação.

---

### Requisitos de Encapsulamento
- Todos os campos devem ser **privados**.
- Utilize **getters e setters** para acessar e modificar os campos.

### Comportamento Esperado
- Métodos para **depositar** e **sacar** devem ser funcionais e validar o saldo antes de permitir saque.
