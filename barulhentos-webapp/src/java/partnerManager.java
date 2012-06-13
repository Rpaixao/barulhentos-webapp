
import barulhentos.javaapi.Partner;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import services.ServiceManager;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rubenpaixao
 */
@ManagedBean(name = "partnerManager")
public class partnerManager implements Serializable{
    
    LinkedList<Partner> partners ;

    public LinkedList<Partner> getPartners() {
        return partners;
    }
    ServiceManager manager;
    
    public partnerManager(){
        try {
            System.out.println("Entrei no partnerManager");
            this.partners = new LinkedList<Partner>();
            manager = new ServiceManager();
            partners = manager.userService().getSocios();
            
            for(Partner p : partners){
                System.out.println(p.getName());
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(partnerManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(partnerManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(partnerManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(partnerManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String load(){
        return "success";
    }

}
