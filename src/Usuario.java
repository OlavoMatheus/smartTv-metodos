public class Usuario {
    
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();

        smartTv.passarCanal();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("volume atual? " + smartTv.volume);

        smartTv.ligar();

        smartTv.mudarCanal(38);

        System.out.println("Novo status -> Canal atual? " + smartTv.canal);
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);

    }

} 