package biblioteca.models.adm;



public class EventosBiblioteca{
    private int dataEvento;
    private String localEvento;
    private int maxLotacao;
    private int horario;
    private ReservaSala reserva;
    private String topico;

    public EventosBiblioteca(int dataEvento, String localEvento, int maxLotacao, int horario, String topico) {
        this.dataEvento = dataEvento;
        this.localEvento = localEvento;
        this.maxLotacao = maxLotacao;
        this.horario = horario;
        this.topico = topico;
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
    public String getTopico() {
        return topico;
    }
    public void setTopico(String topico) {
        this.topico = topico;
    }

    

    
    class Palestra{
        public void InformacoesPalestra(){
            private String palestrante;
 
            
            public InformacoesPalestra(int dataEvento, String localEvento, int maxLotacao, int horario, String palestrante, String topico) {
                this.palestrante = palestrante;

            }
        
            public String getPalestrante() {
                return palestrante;
            }
            public void setPalestrante(String palestrante) {
                this.palestrante = palestrante;
            }            
        }

    }

    class Workshop{
        public void InformacoesWorkshop(){
            private String instrutor;
            private String material;
            
            public InformacoesWorkshop(int dataEvento, String localEvento, int maxLotacao, int horario, String instrutor, String material) {
                this.instrutor = instrutor;
                this.material = material;
            }
        
            public String getInstrutor() {
                return instrutor;
            }
            public void setInstrutor(String instrutor) {
                this.instrutor = instrutor;
            }

            public String getMaterial() {
                return material;
            }
            public void setMaterial(String material) {
                this.material = material;
            }
        }

    }





    //arrumar 
    private enum ReservaSala{
        PENDENTE, CONFIRMADA, CANCELADA
 
    }
}