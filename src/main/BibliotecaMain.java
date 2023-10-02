package main;

import biblioteca.controllers.*;
import biblioteca.models.itens.*;
import biblioteca.models.membro.*;
import biblioteca.models.membro.Professor;
import biblioteca.views.*;
import biblioteca.models.membro.Administradores;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BibliotecaMain {
    private static BibliotecaController bibliotecaController;
    private static MembroController membroController;
    private static RelatorioController relatorioController;
    private static int tomboAtual;

    public static void main(String[] args) {
        bibliotecaController = new BibliotecaControllerImpl();
        membroController = new MembroControllerImpl();
        relatorioController = new RelatorioControllerImpl();

        tomboAtual = 1;
        BibliotecaView bibliotecaView = new BibliotecaViewImpl(bibliotecaController);
        MembroView membroView = new MembroViewImpl(membroController);
        RelatorioView relatorioView = new RelatorioViewImpl(relatorioController);

        //Usuário e item de teste para facilitar testagem
        Administradores testeadm = new Administradores("Novaes",1,123,"casa",'1');
        Administradores testeadm2 = new Administradores("Giovani",2,123,"casa",'1');
        Livro livro = new Livro(0,"Livro Teste", "Autor teste", "Editora teste", "Genero teste", 0, "Sinopse teste", 0, 0,"Conservacao teste", "Localizacao Teste");
        ItemBiblioteca<Livro> livroteste = new ItemBiblioteca<>(livro);

        bibliotecaController.adicionarItem(0,livroteste);
        membroController.addMembro(testeadm);
        membroController.addMembro(testeadm2);

        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("---- Menu Biblioteca ----");
            System.out.println();
            System.out.println("1. Gerenciamento de Itens");
            System.out.println("2. Gerenciamento de Membros");
            System.out.println("3. Geração de Relatórios e Estatísticas");
            System.out.println("4. Administração de Funcionários");
            System.out.println("5. Sair");
            System.out.println();
            System.out.println();
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    // Menu de Gerenciamento de Itens
                    menuGerenciamentoItens(scanner, bibliotecaView);
                    break;
                case 2:
                    // Menu de Gerenciamento de Membros
                    menuGerenciamentoMembros(scanner, membroView);
                    break;
                case 3:
                    // Menu de Geração de Relatórios e Estatísticas
                    menuRelatoriosEstatisticas(scanner, relatorioView);
                    break;
                case 4:
                    // Menu de Administração de Funcionários
                    menuAdministracaoFuncionarios(scanner);
                    break;
                case 5:
                    System.out.println("Saindo do menu. Até logo!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }

    private static void menuGerenciamentoItens(Scanner scanner, BibliotecaView bibliotecaView) {
        while (true) {
            System.out.println("---- Menu Gerenciamento de Itens ----");
            System.out.println();
            System.out.println("1. Listar Itens Disponíveis");
            System.out.println("2. Consultar item específico");
            System.out.println("3. Adicionar Item");
            System.out.println("4. Editar Item");
            System.out.println("5. Remover Item");
            System.out.println("6. Empréstimo de Itens");
            System.out.println("7. Devolução de Itens");
            System.out.println("8. Renovação de Empréstimos");
            System.out.println("9. Reservas de Itens");
            System.out.println("10. Voltar");
            System.out.println();
            System.out.println();
            System.out.print("Escolha uma opção: ");

            int opcaoItens = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoItens) {
                case 1:
                    Map itens = bibliotecaController.consultarItensDisponiveis();
                    bibliotecaView.mostrarItensDisponiveis(itens);
                    break;
                case 2:
                    System.out.println("Insira o id do item: ");
                    int idItem = scanner.nextInt();
                    scanner.nextLine();
                    bibliotecaView.mostrarItemEspecifico(bibliotecaController.buscaItemPorId(idItem));
                    break;
                case 3:
                    adicionarItem(scanner);
                    break;
                case 4:
                    editarItem(scanner);
                    break;
                case 5:
                    removerItem(scanner);
                    break;
                case 6:
                    realizarEmprestimo(scanner);
                    break;
                case 7:
                    realizarDevolucao(scanner);
                    break;
                case 8:
                    realizarRenovacao(scanner);
                    break;
                case 9:
                    fazerReserva(scanner);  
                    break;
                case 10:
                    return;  
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }

    private static void menuGerenciamentoMembros(Scanner scanner, MembroView membroView) {
        while (true) {
            System.out.println("---- Menu Gerenciamento de Membros ----");
            System.out.println();
            System.out.println("1. Listar Membros");
            System.out.println("2. Detalhar Membro Específico");
            System.out.println("3. Adicionar Membro");
            System.out.println("4. Editar Membro");
            System.out.println("5. Remover Membro");
            System.out.println("6. Voltar");
            System.out.println();
            System.out.println();
            System.out.print("Escolha uma opção: ");

            int opcaoMembros = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoMembros) {
                case 1:
                    List<Membro> membros = membroController.listarMembros();
                    membroView.mostrarListaMembros(membros);
                    break;
                case 2:
                    System.out.println("Insira ID do Membro: ");
                    int idMembro = scanner.nextInt();
                    scanner.nextLine();
                    membroView.mostrarDetalhesMembro(membroController.buscarMembroPorIdentificacao(idMembro));
                    break;
                case 3:
                    adicionarMembro(scanner);
                    break;
                case 4:
                    editarMembro(scanner);
                    break;
                case 5:
                    removerMembro(scanner);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }

    private static void menuRelatoriosEstatisticas(Scanner scanner, RelatorioView relatorioView) {
        while (true) {
            System.out.println("---- Menu Relatórios e Estatísticas ----");
            System.out.println();
            System.out.println("1. Gerar Relatório de Atividades de Membros");
            System.out.println("2. Gerar Relatório de Uso de Itens Multimídia");
            System.out.println("3. Gerar Relatório de Multas e Pagamentos");
            System.out.println("4. Gerar Relatório de Disponibilidade de Itens");
            System.out.println("5. Gerar Estatísticas de Uso por Perfil de Membro");
            System.out.println("6. Gerar Relatório de Itens Mais Populares");
            System.out.println("7. Voltar");
            System.out.println();
            System.out.println();
            System.out.print("Escolha uma opção: ");

            int opcaoRelatorios = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoRelatorios) {
                case 1:
                    gerarRelatorioAtividadesMembros();
                    break;
                case 2:
                    gerarRelatorioUsoItens();
                    break;
                case 3:
                    gerarRelatorioMultas();
                    break;
                case 4:
                    gerarRelatorioDisponibilidadeItens();
                    break;
                case 5:
                    gerarEstatisticasUsoPorPerfil();
                    break;
                case 6:
                    gerarRelatorioItensPopulares();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }

    private static void menuAdministracaoFuncionarios(Scanner scanner) {
        while (true) {
            System.out.println("---- Menu Administração de Funcionários ----");
            System.out.println();
            System.out.println("1. Administradores");
            System.out.println("2. Atendentes");
            System.out.println("3. Gerentes");
            System.out.println("4. Voltar");
            System.out.println();
            System.out.println();
            System.out.print("Escolha uma opção: ");

            int opcaoFuncionarios = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoFuncionarios) {
                case 1:
                    // Menu de Administração de Administradores
                    menuAdministradores(scanner);
                    break;
                case 2:
                    // Menu de Administração de Atendentes
                    menuAtendentes(scanner);
                    break;
                case 3:
                    // Menu de Administração de Gerentes
                    menuGerentes(scanner);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }

    private static void menuAdministradores(Scanner scanner) {
        // Lógica para administração de administradores
    }

    private static void menuAtendentes(Scanner scanner) {
        // Lógica para administração de atendentes
    }

    private static void menuGerentes(Scanner scanner) {
        // Lógica para administração de gerentes
    }

    // Métodos para realizar empréstimo, renovação e reserva
    private static void realizarEmprestimo(Scanner scanner) {
        // Lógica para realizar um empréstimo
        System.out.println("Operação de Empréstimo de Itens");
        System.out.println("Insira o ID do membro: ");
        int idMembro = scanner.nextInt();
        System.out.println("Insira o ID do item: ");
        int idItem = scanner.nextInt();
        System.out.println("Insira a data de hoje: "); //Ainda vai mudar pra obter a data do sistema
        int data = scanner.nextInt();
        bibliotecaController.buscaItemPorId(idItem).emprestar(membroController.buscarMembroPorIdentificacao(idMembro), data, bibliotecaController);
    }
    private static void realizarDevolucao(Scanner scanner) {
        // Lógica para realizar um empréstimo
        System.out.println("Operação de Devolucao de Itens");
        System.out.println("Insira o ID do membro: ");
        int idMembro = scanner.nextInt();
        System.out.println("Insira o ID do item: ");
        int idItem = scanner.nextInt();
        System.out.println("Insira a data de hoje: "); //Ainda vai mudar pra obter a nota do sistema
        int data = scanner.nextInt();
        System.out.println("Insira o ID do empréstimo: ");
        int idEmprestimo = scanner.nextInt();
        bibliotecaController.buscaItemPorId(idItem).devolver(membroController.buscarMembroPorIdentificacao(idMembro), data,idEmprestimo, bibliotecaController);
    }

    private static void realizarRenovacao(Scanner scanner) {
        // Lógica para realizar uma renovação de empréstimo
        System.out.println("Operação de Renovação de Empréstimos");
    }

    private static void fazerReserva(Scanner scanner) {
        // Lógica para fazer uma reserva de item
        System.out.println("Operação de Reserva de Itens");
        System.out.println("Insira o ID do membro: ");
        int idMembro = scanner.nextInt();
        System.out.println("Insira o ID do item: ");
        int idItem = scanner.nextInt();
        System.out.println("Insira a data de hoje: "); //Ainda vai mudar pra obter a nota do sistema
        int data = scanner.nextInt();
        bibliotecaController.buscaItemPorId(idItem).reservar(idMembro,data, bibliotecaController);
    }

    // Métodos para adicionar, editar e remover itens e membros
    private static boolean adicionarItem(Scanner scanner) {
        // Lógica para adicionar um novo itemata
        while (true) {
            System.out.println("Operação de Adição de Item");
            System.out.println("Que tipo de item deseja cadastrar?");
            System.out.println();
            System.out.println("1. Livro");
            System.out.println("2. Ebook");
            System.out.println("3. Multimidia");
            System.out.println("4. Equipamento");
            System.out.println();
            System.out.println();
            System.out.print("Escolha uma opção: ");

            int opcaoItens = scanner.nextInt();
            scanner.nextLine();

 
            switch (opcaoItens) {
                case 1:
                    System.out.println("Insira o numero do tombo: ");
                    String tombo = scanner.nextInt();
                    System.out.println("Insira o título do item: ");
                    String titulo = scanner.next();
                    System.out.println("Insira o autor do item: ");
                    String autor = scanner.next();
                    System.out.println("Insira a editora do item: ");
                    String editora = scanner.next();
                    System.out.println("Insira o genero do item: ");
                    String genero = scanner.next();
                    System.out.println("Insira o anoPub do item: ");
                    int anoPub = scanner.nextInt();
                    System.out.println("Insira a sinopse do item: ");
                    String sinopse = scanner.next();
                    System.out.println("Insira o ISBN do item: ");
                    int ISBN = scanner.nextInt();
                    System.out.println("Insira a edicao do item: ");
                    int edicao = scanner.nextInt();
                    System.out.println("Insira a conservacao do item: ");
                    String conservacao = scanner.next();
                    System.out.println("Insira a localizacao do item: ");
                    String localizacao = scanner.next();
                    Livro livro = new Livro(tombo, titulo, autor, editora, genero, anoPub, sinopse, ISBN, edicao, conservacao, localizacao);
                    ItemBiblioteca addL =  new ItemBiblioteca<Livro>(livro);
                    bibliotecaController.adicionarItem(tombo, addL);
                    return true;
                case 2:
                    System.out.println("Insira o numero do tombo: ");
                    String tombo = scanner.nextInt();
                    System.out.println("Insira o título do item: ");
                    titulo = scanner.next();
                    System.out.println("Insira o autor do item: ");
                    autor = scanner.next();
                    System.out.println("Insira a editora do item: ");
                    editora = scanner.next();
                    System.out.println("Insira o genero do item: ");
                    genero = scanner.next();
                    System.out.println("Insira o anoPub do item: ");
                    anoPub = scanner.nextInt();
                    System.out.println("Insira a sinopse do item: ");
                    sinopse = scanner.next();
                    System.out.println("Qual o formato do livro? ");
                    System.out.println("1. epub; 2. pdf; 3. mobi");
                    int formato = scanner.nextInt();
                    Ebook.formatoEbook formatoE = null;
                    switch (formato) {
                            case 1:
                                formatoE = Ebook.formatoEbook.epub;
                                break;
                            case 2:
                                formatoE = Ebook.formatoEbook.pdf;
                                break;
                            case 3:
                                formatoE = Ebook.formatoEbook.mobi;
                                break;
                            default:
                                System.out.println("Opção inválida. Por favor, escolha novamente.");
                                return false;
                    }
                    System.out.println("Insira o link de acesso do item: ");
                    String link = scanner.next();
                    System.out.println("Insira os requisitos de leitura do item: ");
                    String reqLeitura = scanner.next();
                    Ebook ebook = new Ebook(tombo, titulo, autor, editora, genero, anoPub, sinopse, formatoE, link, reqLeitura);
                    ItemBiblioteca addE =  new ItemBiblioteca<Ebook>(ebook);
                    bibliotecaController.adicionarItem(tombo, addE);
                    return true;
                case 3:
                    System.out.println("Insira o numero do tombo: ");
                    String tombo = scanner.nextInt();
                    System.out.println("Insira o título do item: ");
                    titulo = scanner.next();
                    System.out.println("Insira o autor do item: ");
                    autor = scanner.next();
                    System.out.println("Insira a editora do item: ");
                    editora = scanner.next();
                    System.out.println("Insira o genero do item: ");
                    genero = scanner.next();
                    System.out.println("Insira o anoPub do item: ");
                    anoPub = scanner.nextInt();
                    System.out.println("Insira a sinopse do item: ");
                    sinopse = scanner.next();
                    System.out.println("Selecione o tipo de item multimidia: ");
                    System.out.println("1. Audio; 2. Video; 3. Software");
                    int formatoM = scanner.nextInt();
                    scanner.nextLine();
                    switch (formatoM){
                        case 1:
                            System.out.println("Insira a duracao: ");
                            int duracao = scanner.nextInt();
                            System.out.println("Insira as faixas: ");
                            String listaFaixas = scanner.next();
                            ItemBiblioteca cd =  new ItemBiblioteca<CD>(new CD(tombo, titulo, autor, editora, genero, anoPub, sinopse,duracao, listaFaixas));
                            bibliotecaController.adicionarItem(tombo, cd);

                            break;
                        case 2:
                            System.out.println("Insira a duracao: ");
                            int duracaov = scanner.nextInt();
                            System.out.println("Insira o elenco: ");
                            String elenco = scanner.next();
                            ItemBiblioteca dvd =  new ItemBiblioteca<DVD>( new DVD(tombo, titulo, autor, editora, genero, anoPub, sinopse,duracaov, elenco));
                            bibliotecaController.adicionarItem(tombo, dvd);
                            break;
                        case 3:
                            System.out.println("Insira a finalidade: ");
                            String finalidade = scanner.next();
                            System.out.println("Insira os requisitos necessários: ");
                            String requisitos = scanner.next();
                            System.out.println("Insira o armazenamento necessario: ");
                            String armazenamento = scanner.next();
                            new Software(tombo, titulo, autor, editora, genero, anoPub, sinopse,finalidade,requisitos,armazenamento);
                            ItemBiblioteca software =  new ItemBiblioteca<Software>(new Software(tombo, titulo, autor, editora, genero, anoPub, sinopse,finalidade,requisitos,armazenamento));
                            bibliotecaController.adicionarItem(tombo, software);
                            break;
                        default:
                            System.out.println("Opção inválida. Por favor, escolha novamente.");
                            return false;
                    }
                    return true;
                case 4:
                    System.out.println("Insira o numero do tombo: ");
                    String tombo = scanner.nextInt();
                    System.out.println("Qual o tipo de equipamento? ");
                    System.out.println("1. Informatica; 2. Audiovisual; 3. Impressao");
                    int formatoEq = scanner.nextInt();
                    Equipamento.CategoriaEquipamento formatoEquip;
                    switch (formatoEq){
                        case 1:
                            formatoEquip = Equipamento.CategoriaEquipamento.INFORMATICA;
                            break;
                        case 2:
                            formatoEquip = Equipamento.CategoriaEquipamento.AUDIOVISUAL;
                            break;
                        case 3:
                            formatoEquip = Equipamento.CategoriaEquipamento.IMPRESSAO;
                            break;
                        default:
                            System.out.println("Opção inválida. Por favor, escolha novamente.");
                            return false;
                    }
                    ItemBiblioteca item = new ItemBiblioteca<>(new Equipamento(formatoEquip, tombo)) ;
                    bibliotecaController.adicionarItem(tombo,item);
                    default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    return false;
            }
        }
    }

    private static void editarItem(Scanner scanner) {
        // Lógica para editar um item existente
        System.out.println("Operação de Edição de Item");
    }

    private static void removerItem(Scanner scanner) {
        // Lógica para remover um item
        System.out.println("Operação de Remoção de Item");
    }

    private static void adicionarMembro(Scanner scanner) {
        // Lógica para adicionar um novo membro
        System.out.println("Operação de Adição de Membro");
        System.out.println("Que tipo de Usuário deseja cadastrar?");
        System.out.println();
        System.out.println("1. Admnistrador");
        System.out.println("2. Gerente");
        System.out.println("3. Atendente");
        System.out.println("4. Professor");
        System.out.println("5. Estudante Pós Graduação");
        System.out.println("6. Estudante Graduação");
        System.out.println();
        System.out.println();
        System.out.print("Escolha uma opção: ");
        System.out.println();
        int nivel = scanner.nextInt();
        System.out.println("Instira o RA do membro");
        int RA = scanner.nextInt();
        if (membroController.buscarMembroPorIdentificacao(RA) != null){
            System.out.println("RA ja em uso, insira outro número:");
            RA = scanner.nextInt();
        }
        System.out.println("Insira o nome do membro");
        String nome = scanner.next();
        System.out.println("Insira o telefone do membro:");
        int telegone = scanner.nextInt();
        System.out.println("Insira o endereço do membro:");
        String endereco = scanner.next();
        System.out.println("Insira a data de hoje: ");
        int data = scanner.nextInt();
        switch (nivel){
            case 1:
                Administradores adm = new Administradores(nome,RA,telegone,endereco,data);
                membroController.addMembro(adm);
                break;
            case 2:
                Gerente ger = new Gerente(nome,RA,telegone,endereco,data);
                membroController.addMembro(ger);
                break;
            case 3:
                Atendente atendente = new Atendente(nome,RA,telegone,endereco,data);
                membroController.addMembro(atendente);
                break;
            case 4:
                Professor professor = new Professor(nome,RA,telegone,endereco,data);
                membroController.addMembro(professor);
                break;
            case 5:
                EstudantePosGraduacao pos = new EstudantePosGraduacao(nome,RA,telegone,endereco,data);
                membroController.addMembro(pos);
                break;
            case 6:
                EstudanteGraduacao grad = new EstudanteGraduacao(nome,RA,telegone,endereco,data);
                membroController.addMembro(grad);
                break;
        }
    }

    private static void editarMembro(Scanner scanner) {
        // Lógica para editar um membro existente
        System.out.println("Operação de Edição de Membro");
    }

    private static void removerMembro(Scanner scanner) {
        // Lógica para remover um membro
        System.out.println("Operação de Remoção de Membro");
    }

    // Métodos para gerar relatórios e estatísticas
    private static void gerarRelatorioAtividadesMembros() {
        // Lógica para gerar o Relatório de Atividades de Membros
        System.out.println("Gerando Relatório de Atividades de Membros");
    }

    private static void gerarRelatorioUsoItens() {
        // Lógica para gerar o Relatório de Uso de Itens Multimídia
        System.out.println("Gerando Relatório de Uso de Itens Multimídia");
    }

    private static void gerarRelatorioMultas() {
        // Lógica para gerar o Relatório de Multas e Pagamentos
        System.out.println("Gerando Relatório de Multas e Pagamentos");
    }

    private static void gerarRelatorioDisponibilidadeItens() {
        // Lógica para gerar o Relatório de Disponibilidade de Itens
        System.out.println("Gerando Relatório de Disponibilidade de Itens");
    }

    private static void gerarEstatisticasUsoPorPerfil() {
        // Lógica para gerar as Estatísticas de Uso por Perfil de Membro
        System.out.println("Gerando Estatísticas de Uso por Perfil de Membro");
    }

    private static void gerarRelatorioItensPopulares() {
        // Lógica para gerar o Relatório de Itens Mais Populares
        System.out.println("Gerando Relatório de Itens Mais Populares");
    }
}
