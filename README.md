# Missing Numbers

Olá, o intuito do programa é solucionar o seguinte problema:

**Dado um array de inteiros com elementos randomicos desordenado, e dois inteiros (min e max) implementar um método que retorne um array ordenado com os números entre min e max que não estão no array original**

Para solucionar a questão acima foi-se utilizado principalmente utilidades das Collections do Java, por exemplo utilizando o Set a fim de filtrar números repetidos.

## Como utilizar
Para poder utilizar o programa basta clonar os arquivos, abrir na sua IDE favorita e rodar a partir da classe Main.java, **porém** ao fazer desta forma você estará utilizando número mínimo, máximo e o array pré-definidos no programa, caso deseje existe a possibilidade de passar esses parâmetros de forma dinâmica.

Para passar os parâmetros de forma dinâmica é possível através de sua IDE, desde que respeite as seguintes condições:

- É necessário que hajam, no mínimo, três parâmetros
- O primeiro parâmetro deverá ser menor que o segundo obrigatoriamente (conforme explicado abaixo)

Esses três parâmetros serão passados de forma que o primeiro será considerado o valor mínimo, o segundo valor máximo e os demais serão parte do array para ser varrido.

> **Nota:** Parâmetros incorretos irão forçar o programa a setar valores default (tal ação é mostrada no console)

## Como passar parâmetros na IDE Eclipse

Após ter clonado e importado os dados no Eclipse, basta seguir os seguintes passos:

- Clicar na classe **Main.java** com o botão direito
- Selecionar "Run as..." e "Run Configurations..."
- Na janela que abrir, selecionar a aba "Arguments"
- Passar os argumentos separados por **"**, da seguinte forma: 
**"1" "10" "7" "8" "7"**
- No exemplo acima o número **1** é o número mínimo, o **10** é o máximo e os demais fazer parte do array.
