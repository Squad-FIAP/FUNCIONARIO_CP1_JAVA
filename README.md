# 🍽️ Sistema de Funcionários - Restaurante

Este projeto em Java simula o gerenciamento de funcionários de um restaurante, com foco em operações como controle de ponto, execução de tarefas específicas por cargo (Garçom, Cozinheiro, Gerente) e tratamento de erros com exceções personalizadas.

## 📁 Estrutura do Projeto

```
├── DB_RESTAURANTE.sql
├── README.md
└── src
    └── br
        └── com
            └── restaurante
                └── funcionarios
                    ├── connection
                    │   ├── ConnectionSQL.java
                    │   └── Integracao.java
                    ├── exception
                    │   └── PedidoInvalidoException.java
                    ├── IFuncionario.java
                    ├── main
                    │   └── Main.java
                    └── model
                        ├── Cozinheiro.java
                        ├── FichaCadastral.java
                        ├── Funcionario.java
                        ├── Garcom.java
                        └── Gerente.java
```

## 🧠 Descrição das Principais Classes

### 📌 `IFuncionario.java`
Interface que define os métodos básicos para os funcionários:
- `realizarTarefa()`: Executa a tarefa específica do cargo.
- `baterPonto()`: Registra o horário de entrada ou saída.

### 📌 `Funcionario.java`
Classe abstrata que implementa `IFuncionario` e serve como base para os cargos:
- Atributos: Nome, CPF, Idade, Cargo, Salário, Turno, Data de Admissão.
- Métodos: Validação de cargo, cálculo de salário e registro de ponto.

### 📌 `Garcom.java`
Extende `Funcionario` e implementa:
- Métodos específicos: `anotarPedido()`, `entregarPedido()`.

### 📌 `Cozinheiro.java`
Extende `Funcionario` e implementa:
- Métodos específicos: `prepararPedido()`, `notificarPedidoPronto()`.

### 📌 `Gerente.java`
Extende `Funcionario` e implementa:
- Métodos específicos: `contratarFuncionario()`, `emitirRelatorioVendas()`, `organizarEscala()`.

### 📌 `FichaCadastral.java`
Classe auxiliar para armazenar e gerenciar os dados cadastrais dos funcionários:
- Métodos para adicionar, buscar e listar funcionários.

### 📌 `ConnectionSQL.java` e `Integracao.java`
Gerenciam a conexão com o banco de dados e a integração com o sistema:
- `ConnectionSQL`: Configuração e gerenciamento da conexão.
- `Integracao`: Métodos para persistência e recuperação de dados.

---

## ❗ Exceção Personalizada

| Exceção                            | Quando é lançada |
|------------------------------------|------------------|
| `PedidoInvalidoException`          | Quando o pedido anotado é nulo ou vazio. |

---

## ▶️ Como Executar

1. Compile os arquivos:
```bash
javac br/com/restaurante/funcionarios/**/*.java
```

2. Execute o programa principal:
```bash
java br.com.restaurante.funcionarios.main.Main
```

3. Configure o banco de dados:
   - Certifique-se de que o Oracle Database está configurado e acessível.
   - Execute o script `DB_RESTAURANTE.sql` para criar as tabelas e inserir os dados iniciais:
     ```bash
     sqlplus <usuario>/<senha>@<host>:<porta>/<service_name> @DB_RESTAURANTE.sql
     ```

4. Defina as credenciais de acesso ao banco:
   - Abra o arquivo `ConnectionSQL.java` localizado em `src/br/com/restaurante/funcionarios/connection/`.
   - Atualize as variáveis de conexão com as credenciais corretas:
     ```java
     // filepath: src/br/com/restaurante/funcionarios/connection/ConnectionSQL.java
        private static final String user = "rm999999";  //RM apto a acessar o banco
		private static final String password = "super-strong-password"; //Senha do usuário
     ```

