import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.ejecutar();
    }

    public void ejecutar() {
        Random rand = new Random();
        for(int i=0; i < 4; i++) {
            // Hilos Thread
            HiloT ht = new HiloT("Hilo (Thread)");
            ht.start();
            // Hilos Runnable
            int iteracion = rand.nextInt(31) + 10;
            int demora = rand.nextInt(950) + 50;
            HiloR hr_implements = new HiloR("Hilo (Runnable)", iteracion, demora);
            Thread hr = new Thread(hr_implements);
            hr.start();
        }
    }
}
