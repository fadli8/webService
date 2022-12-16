package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import ws.Compte;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {
@WebMethod(operationName = "Convert")
    public double converstion(@WebParam(name = "montant") double mt){

        return mt*11.12;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){

        return new Compte(1,Math.random()*5000);
    }
    @WebMethod
   public List<Compte> listComptes(){
      return List.of(
              new Compte(2,Math.random()*4000),
              new Compte(3,Math.random()*6000)
      );
   }
}