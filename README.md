### Diagrama UML do Iphone (Mermaid)
```mermaid
classDiagram
    Iphone --|> ReprodutorMusical
    Iphone --|> AparelhoTelefonico
    Iphone --|> NavegadorInternet
    class ReprodutorMusical{
      +String musica
      +tocar()
      +pausar()
      +selecionarMusica(String musica)
    }
    class AparelhoTelefonico{
      +String numero
      +ligar(String numero)
      +atender()
      +iniciarCorreioVoz()
    }
    class NavegadorInternet{
      +String url
      +exibirPagina(String url)
      +adicionarNovaAba()
      +atualizarPagina()
    }
```
