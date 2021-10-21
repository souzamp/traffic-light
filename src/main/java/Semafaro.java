public class Semafaro {
    public void exibirCor(int tempo, String cor){
        for (int i =0; i < tempo; i++){
            try {
                System.out.println(cor + "(-^--^-)");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
