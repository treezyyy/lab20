public class Main {
    public static void main(String[] args) {
        SimpleTransportFactory Factory = new SimpleTransportFactory();
        TransportCompany Company = new TransportCompany(Factory);
        Company.NameTransport(LogistType.AIRCRAFT);
    }
}