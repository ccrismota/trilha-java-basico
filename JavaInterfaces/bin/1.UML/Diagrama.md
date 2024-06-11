##  Modelando o iPhone com UML: Funções de Músicas, Chamadas e Internet

Este é um diagrama UML que representa a estrutura de classes e interfaces para um sistema que inclui a modelagem do iPhone, um dispositivo que incorpora funcionalidades de um reprodutor de música, um telefone e um navegador de internet. Este diagrama foi criado como parte do desafio de projeto do Santander Bootcamp - Backend com Java na DIO.me.

<a href="https://imgur.com/eBmWsjI"><img src="https://i.imgur.com/eBmWsjI.png" title="source: imgur.com" /></a>

## Descrição das Interfaces e Classes

### Reprodutor Musical (`ReprodutorMusical`)
A interface Reprodutor Musical é responsável por implementar a funcionalidade de reprodução de arquivos de áudio. Ela possui métodos como `tocar()`, `pausar()`, e `selecionarMusica()`.

### Aparelho Telefonico (`AparelhoTelefonico`)
A interface Aparelho Telefônico é responsável por implementar a funcionalidade de um telefone. Ela possui métodos como `ligar(numero : String)`, `atender()`, e `iniciarCorreioVoz()`.

### Navegador de Internet (`NavegadorInternet`)
A interface Navegador de Internet é responsável por implementar a funcionalidade de um navegador web. Ela possui os métodos `exibirPagina(url: String)`, `adicionarNovaAba()`, e `atualizarPagina()`.

As `Classes` ou `Entidades` representadas no diagrama, como `iPhone`,`Ipod`, `Nokia 2110`, `Motorola I205`, `Edge`,`Chrome`, que representam diferentes dispositivos ou aplicativos que podem usar as interfaces mencionadas acima.

### Este diagrama foi desenvolvido no Astah UML e para visualizá-lo você irá precisar instalar essa ferramenta [Astah](https://astah.net/downloads/).