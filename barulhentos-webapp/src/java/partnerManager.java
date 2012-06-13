
import java.io.Serializable;
import javax.faces.bean.ManagedBean;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rubenpaixao
 */
@ManagedBean(name = "userManager")
public class partnerManager implements Serializable{
    
    
    public String load(){
        return "success";
    }
}
