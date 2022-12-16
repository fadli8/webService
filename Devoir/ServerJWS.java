
import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args){

        Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());
        System.out.println("déploiment du WebService dans http://0.0.0.0:9191/");
    }

}
