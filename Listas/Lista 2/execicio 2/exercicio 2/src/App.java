import java.util.Scanner;

public class App {
    private static int NUMERO_PERGUTAS = 3;
    private static String[] RESPOSTAS = new String[NUMERO_PERGUTAS];
    private static String[] GABARITO = new String[NUMERO_PERGUTAS];
    private static Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) {

        String nomeParticipante = receberNomeParticipante();
        comecarQuiz(nomeParticipante);
        fazerPrimeiraPegunta(nomeParticipante);
        fazerSegundaPegunta(nomeParticipante);
        fazerTerceiraPegunta(nomeParticipante);
        apresentarResultado(nomeParticipante);
    }

    public static String receberNomeParticipante() {

        System.out.println(
                """
                          Boa Sorte em sua Jornada!!!
                          Digite seu nome para iniciar:
                        """);
        return formatarNome(SCAN.nextLine());
    }

    public static String formatarNome(String nome){
        if (nome.isBlank()) {
            return "NPC";
        }
        
        nome = nome.trim();
        String[] nomeCompleto = nome.split(" ");
        String primeiroNome = nomeCompleto[0];
        String primeiraLetraDoNome = String.valueOf(primeiroNome.charAt(0));
        String primeiroNomeSemInicial = primeiroNome.substring(1);
        String nomeFormatado = primeiraLetraDoNome.toUpperCase() + primeiroNomeSemInicial.toLowerCase();
        return nomeFormatado;

    }

    public static void comecarQuiz(String nomeParticipante){
        System.out.println(String.format(
            """
            Vamos começar %s!!! ?
             Jogador, se a letra da alternativa enviada for difenrentes da disponíveis, também será considerada como errado.
        
            Aperte ENTER para começar.
            
             """,
             nomeParticipante
        ));
        SCAN.nextLine();
    }

    public static void fazerPrimeiraPegunta(String nome){
        String resposta = "";

    do {
        System.out.println(
            """
                1 - Quem e o maior campeão do premio ballon d'or (bola de ouro) ?

                A) Ronaldinho Gaucho
                B) Cristiano Ronaldo
                C) David Beckham
                D) Lionel Messi
                    
            """
        );
        resposta =  SCAN.nextLine();
        
    } while (!ehUmaResposta(resposta)); 
    GABARITO[0] = "D";
    RESPOSTAS[0] = resposta;
    }

    public static void fazerSegundaPegunta(String nome){
        String resposta = "";

    do {
        System.out.println(
        """
            2 - Qual país sediou a Copa do Mundo de 1954?
          
            A) Suécia
            B) Brasil
            C) Alemanha Ocidental
            D) Suíça  

                """
        );
        resposta = SCAN.nextLine();
        
    } while (!ehUmaResposta(resposta));
        GABARITO[1] = "D";
        RESPOSTAS[1] = resposta;
    }

    public static void fazerTerceiraPegunta(String nome) {
        String resposta = "";
        do {
            System.out.println(
            """
            3 - Qual jogador marcou o famoso "gol do século" na Copa do Mundo de 1986?
          
            A) Diego Maradona
            B) Pelé
            C) Zinedine Zidane
            D) Ronaldo Nazário
            
             """
            );
            resposta = SCAN.nextLine();
            
        } while (!ehUmaResposta(resposta));
        GABARITO[2] = "A";
        RESPOSTAS[2] = resposta;
    }
         
        public static boolean ehUmaResposta(String resposta){
                    if(resposta.isBlank()){
                        System.out.println(
                            """
                              Sua resposta não pode ser vazia.
                              Vamos tentar de novo.      
                            """
                                
                );
                return false;      
            }
            return true;
        }

        public static void apresentarResultado(String nomeParticipante){
            System.out.println(String.format(
               """
                %s Veja quais pergutas você acertou:
                       
                 """,
                 nomeParticipante
            
            ));

            for(int i = 0; i < NUMERO_PERGUTAS; i++){
                System.out.println(String.format(
                     "%s - %s",
                     ( i + 1 ),
                     RESPOSTAS[i].equalsIgnoreCase(GABARITO[i]) ? "ACERTOU" : "ERROU"
                ));

            }
    }


    
}