package fabricadeboloFactory;

public class  BoloFactory implements InterfaceBolo {
    public enum Bolos {
        ABACAXI, CHOCONINHO, FLORESTANEGRA, PRESTIGIO;
    }

    @Override
    public Bolo getBolo(Bolos b) {
        Bolo bolo = null;

        switch (b) {
            case ABACAXI:
                bolo = new Abacaxi();
                break;
            case CHOCONINHO:
                bolo = new Choconinho();
                break;
            case FLORESTANEGRA:
                bolo = new FlorestaNegra();
                break;
            case PRESTIGIO:
                bolo = new Prestigio();
                break;

        }
        return bolo;
    }
}
