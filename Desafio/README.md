# Desafio POO

## Modelagem e Diagramação de um Componente iPhone

Desafio realizado ao final da trila de JAVA básico da plataforma DIO:

- O desafio consiste em utilizar uma ferramenta UML para criar o diagrama das classes e interfaces do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.
  
- [Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)

- ### Diagrama UML (Mermaid)
```mermaid
classDiagram
    class ReprodutorMusical {
        +encontrarMusica(String musica)
        +encontrarArtista(String artista)
        +escutarMusica()
        +diminuirVolume()
        +aumentarVolume()
    }

    class AparelhoTelefonico {
        +ligar(Int numero)
        +procurarContato(String contato)
        +deletarContato(String contato)
        +adicionarContato(String contato)
        +enviarSMS(String mensagem, String contato);
    }

    class NavegadorInternet {
        +abrirSite(String site)
        +enviarEmail(String email, String mensagem)
        +abrirPrevisaoDoTempo()
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```
