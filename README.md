# Aprendizado de Fluxo de Trabalho com Git e GitHub
Este README documenta o aprendizado que eu tive sobre o fluxo de trabalho com Git e GitHub, simulando um projeto real de uma empresa.
O objetivo é aplicar conhecimentos em versionamento de código, incluindo criação de branches, commits, pull requests (PRs) e merge.

---

## Introdução

Neste projeto, aprendi a usar Git e GitHub para gerenciar versões de códigos.
Isso inclui trabalhar com branches específicas para funcionalidades ou correções, comitar mudanças de forma organizada, e usar pull requests para revisar e mesclar código de forma colaborativa.

## Objetivos

- Compreender o fluxo de trabalho básico com Git e GitHub em empresas e projetos reais.
- Praticar a criação e gerenciamento de branches.
- Aprender a fazer commits significativos.
- Criar e gerenciar pull requests.
- Realizar o merge de código após revisão.

## Conceitos Aprendidos

### 1. Branches

- **Criação de uma nova Branches:**
  Criei uma nova branch para cada funcionalidade ou correção específica para isolar o desenvolvimento e evitar conflitos.

  ```sh
  git checkout -b develop

### 2. Commits
- **Adicionar Arquivos:**
  Adicionei todas as alterações a area antes de fazer o commit.

  ```sh
  git add .
  
- **Commits Descritivos:**
  -Fiz commits com mensagens claras e descritivas para documentar o que foi alterado.
  
  ```sh
  git commit -m "Descrição detalhada do que foi alterado"

### 3. Push e Pull Requests
- **Push para o Repositório Remoto:**
Enviei minhas alterações para o repositório remoto para que outras pessoas pudessem acessá-las.

  ```sh
  git push origin nome-da-branch
  
- Criar Pull Request:
Criei um PR no GitHub para que minhas alterações pudessem ser revisadas antes de serem mescladas na branch principal.

1. Fui ate o repositório no GitHub.
2. Cliquei no campo "Compare & pull request" onde eu posso comparar minhas alterações com o codigo original do projeto.
3. Selecione a base main (ou master) e a branch nome-da-branch.
4. Insirei um título e uma descrição detalhada do que eu fiz para que meus superiores podesse avaliar minhas alterações.
5. lique em "Create pull request".
6. Revisei e Mesclei as alterações
7. Meu lider irá revisar o código no PR e, se tudo estive correto, ele ira fazer o merge para incorporar as alterações na branch principal.

## Conclusão
Esse processo de aprendizado me ensinou a importância de um fluxo de trabalho organizado com Git e GitHub.
Utilizar branches para isolar mudanças, fazer commits descritivos, e usar pull requests para revisão de código são algumas práticas essenciais para manter a qualidade do código em projetos colaborativos.
