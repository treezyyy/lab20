public class SimpleTransportFactory {
    public LogisticX createTransport(LogistType Type){
        LogisticX logisticX = null;

        switch (Type) {
            case TRUCKS:
                logisticX = new Trucks();
                break;
            case VESSELS:
                logisticX = new Vessels();
                break;
            case AIRCRAFT:
                logisticX = new Aircraft();
                break;
        }
        return logisticX;
    }
}
