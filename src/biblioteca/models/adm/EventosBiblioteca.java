package biblioteca.models.adm;



public class EventosBiblioteca{
    private int dataEvento;
    private String localEvento;
    private int maxLotacao;
    private int horario;
    private ReservaSala reserva;

    public EventosBiblioteca(int dataEvento, String localEvento, int maxLotacao, int horario) {
        this.dataEvento = dataEvento;
        this.localEvento = localEvento;
        this.maxLotacao = maxLotacao;
        this.horario = horario;
    }

    public int getDataEvento() {
        return dataEvento;
    }
    public void setDataEvento(int dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getLocalEvento() {
        return dataEvento;
    }
    public void setLocalEvento(String localEvento) {
        this.localEvento = localEvento;
    }

    public int getMaxLotacao() {
        return maxLotacao;
    }
    public void setMaxLotacao(int maxLotacao) {
        this.maxLotacao = maxLotacao;
    }
    
    public int getHorario() {
        return horario;
    }
    public void setHorario(int horario) {
        this.horario = horario;
    }
    

    
    class Palestra{
        //criar getter e setter  palestrante, topico, data, horario e local
        public void InformacoesPalestra(){
            //implementar coleta de informação sobre o evento
            public EventosBiblioteca(int dataEvento, String localEvento, int maxLotacao, int horario) {
                this.dataEvento = dataEvento;
                this.localEvento = localEvento;
                this.maxLotacao = maxLotacao;
                this.horario = horario;
            }
        
            public int getDataEvento() {
                return dataEvento;
            }
            public void setDataEvento(int dataEvento) {
                this.dataEvento = dataEvento;
            }
            private String palestrante;


            System.out.print("Palestrante: "+ palestrante);

        }

    }






    //arrumar 
    private enum ReservaSala{
        PENDENTE, CONFIRMADA, CANCELADA
 
    }
}