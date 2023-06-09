

public class TransportCompany {
    private final SimpleTransportFactory transportFactory;

    public TransportCompany(SimpleTransportFactory transportFactory){
        this.transportFactory = transportFactory;
    }
    public LogisticX NameTransport(LogistType type){
        LogisticX logisticX = transportFactory.createTransport(type);
        System.out.println("Создан вид трансопрта: " + type);
        logisticX.movement();
        return logisticX;
    }
}
