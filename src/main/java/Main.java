public class Main {
    public  static void main(String []args){
        Semafaro semafaro = new Semafaro();
        while (1>0){
            semafaro.exibirCor(5, "verde");
            semafaro.exibirCor(3, "amarelo");
            semafaro.exibirCor(2, "vermelho");
        }
    }
}
