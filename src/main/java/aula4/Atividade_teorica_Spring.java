package aula4;

public class Atividade_teorica_Spring {
    //Atividade 1: O que é uma API?
    // R: API é a porta de comunicação entre o codico e o servidor permitindo que dois sistemas conversem entre si como por exemplo: um sistema fosse o garçom a comanda fosse a API e o cozinheiro fosse o outro sistema.

    //Atividade 2: O que é JSON?
    // R: jSON é uma linguagem de programação organizada padrao usada para estruturar dados e sistemas ele roda em todas as linguagens de programação como Phyton, Java e JavaScript.

    //Atividade 3: O que é HTTP?
    // R: HTTP é a linguagem usada na web para  que o navegador se comunique com os servidores na internet.

    //Atividade 4: O que é Controller?
    //R: É a classe que recebe o que o usuário pediu, chama as regras de negócio para resolver o problema, e decide qual resposta devolver de volta.

    //Atividade 5: O que é um verbo HTTP?
    // R: É a "intenção" ou a ação principal que você quer fazer na requisição por exemplo: se você quer ler algo, criar algo, atualizar ou apagar, você usa um verbo diferente para indicar isso.

    //Atividade 6: O que é um Recurso?
    // R: É a entidade principal do sistema no caso  e o que estamos manipulando na aplicação sendo sempre escrito no plural.

    //Atividade 7: O que é um PATH(id)?
    //R: É aquela parte do caminho na URL que aponta para um registro específico e único dizendo exatamente o que alterar ou buscar.

    //Atividade 8: O que é um Querry Parameter?
    // R: São  filtros que nos colocamos no final da URL depois de uma interrogação.

    // Atividade 9: O que é REST?
    // R: É um  conjunto de boas regras e padrões para criar APIs usando  os recursos do protocolo HTTP, mantendo tudo organizado e padronizado.

    // Atividade 10: O que é um endpoint?
    //R: É o endereço exato (a combinação de URL + Verbo HTTP) onde a aplicação está pronta para receber requisições e realizar uma tarefa específica.

    // Atividade 11: Quais são as partes de uma URL?
    // R: Protocolo (HTTP), porta(8080) e  caminho(o que procurar).

    //Atividade 12: O que é um status code? O que significam o 200 e o 404?
    // R: São códigos  que o servidor devolve para dizer o resultado da requisição. O 200 significa que deu tudo certo (OK, gatinho dando joinha), e o 404 significa que o servidor não encontrou o que você pediu (Not Found, gatinho sumiu).

    //Atividade 13: O que é o corpo (body) de uma requisição?
    //R:É  o pacote de dados que você envia junto com a mensagem para o servidor

    //Atividade 14: O que é MVC? O que faz cada letra?
    // R: É um padrão  para organizar o código em três partes: Model (cuida dos dados e regras de negócio), View (a interface visual que o usuário vê) e Controller (o meio-campo que conecta a tela com os dados).

    //Atividade 15:O que é o Spring Boot?
    // R: É um  framework para Java que auxilia a parte  da configuração inicial, permitindo que a gente crie aplicações web e APIs de forma  mais rápida e automatizada.

    //Atividade 16: O que é uma anotação no Spring? Dê um exemplo.
    //R: É uma etiqueta que começa com @ colocada no código para dar instruções especiais ao framework sobre o comportamento daquela classe ou método. (Exemplo: @RestController)

    //Atividade 17: O que faz o @RestController
    //R: Avisa ao Spring que aquela classe vai funcionar como um controlador de API, fazendo com que os dados retornados pelos métodos sejam convertidos diretamente para o cliente que se escreve em JSON.

    //Atividade 18: O que faz o @GetMapping?
    // R: Associa um método Java a uma URL específica, dizendo para o Spring: Sempre que alguém fizer uma requisição

    //Atividade 19: Quais são os verbos HTTP?
    // R: GET, POST, PUT, PATCH E DELETE.

    //Atividade 20:O que faz o @PathVariable?
    //R: É a ferramenta do Spring usada para capturar um valor que está embutido direto no caminho da URL e jogar dentro da variavel do JAVA.

    //Atividade 21: O que faz o @RequestParam?
    //R: Serve para capturar os parâmetros que vêm colados no final da URL após o ponto de interrogação

    //Atividade 22: O que significam os status 201 e 204?
    //R: O 201 (Created) avisa que o recurso foi criado com sucesso (gatinho filhote). O 204 (No Content) avisa que a operação deu certo, mas que a resposta não tem conteúdo ou corpo para devolver (gatinho gasparzinho).

    //Atividade 23: O que é um Repository?
    //R: É a interface responsável por fazer a ponte direta com o banco de dados

}
