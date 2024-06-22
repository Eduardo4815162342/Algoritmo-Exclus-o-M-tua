
# Exclusão Mútua Centralizada

Este projeto implementa um algoritmo de coordenação com exclusão mútua centralizada em Java. O algoritmo contempla as fases de Requisição, Concessão e Liberação, com o processo coordenador mantendo uma fila de espera para tratar as requisições simultâneas.

## Estrutura do Projeto

- **Processo.java**: Classe que representa um processo que deseja acessar o recurso.
- **Coordenador.java**: Classe que coordena o acesso ao recurso, mantendo uma fila de espera e gerenciando a concessão e liberação do recurso.
- **ExclusaoMutuaCentralizada.java**: Classe principal que inicia a aplicação, criando e gerenciando vários processos que solicitam o recurso.
- **Teste.java**: Classe opcional para realizar testes adicionais, criando e gerenciando um conjunto maior de processos.

## Como Executar

### Pré-requisitos

- JDK instalado (Java Development Kit)
- NetBeans IDE (ou qualquer outro ambiente de desenvolvimento Java de sua preferência)

### Passos para Compilar e Executar

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/Eduardo4815162342/exclusao-mutua-centralizada.git
   cd exclusao-mutua-centralizada
   ```

2. **Abra o projeto no NetBeans:**

   - Abra o NetBeans IDE.
   - Vá em `File > Open Project` e selecione a pasta do projeto `exclusao-mutua-centralizada`.

3. **Compile e execute a classe principal:**

   - Clique com o botão direito no nome do projeto no painel `Projects`.
   - Selecione `Properties`.
   - Em `Run`, defina a `Main Class` como `ExclusaoMutuaCentralizada`.
   - Clique com o botão direito na classe `ExclusaoMutuaCentralizada.java` e selecione `Run File`.

4. **(Opcional) Execute os testes:**

   - Clique com o botão direito na classe `Teste.java` e selecione `Run File`.

### Estrutura do Projeto

```
/exclusao-mutua-centralizada
|-- Processo.java
|-- Coordenador.java
|-- ExclusaoMutuaCentralizada.java
|-- Teste.java (opcional)
```

## Explicação do Código

- **Processo.java**: Representa um processo que deseja acessar o recurso. Armazena os tempos de requisição, concessão e liberação do recurso.
  
- **Coordenador.java**: Coordena o acesso ao recurso. Mantém uma fila de espera e gerencia a concessão e liberação do recurso. Inclui métodos para requisitar e liberar o recurso, além de simular o uso do recurso.

- **ExclusaoMutuaCentralizada.java**: Contém o método `main` que cria e inicia os processos que solicitam o recurso.

- **Teste.java**: Permite realizar testes adicionais criando e iniciando um conjunto maior de processos para validar o comportamento do algoritmo.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests.

## Licença

Este projeto está licenciado sob a MIT License. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## Contato

- Autor: Eduardo
- Email: eduardo.superhouse@gmail.com
- GitHub: [Eduardo4815162342](https://github.com/Eduardo4815162342)
