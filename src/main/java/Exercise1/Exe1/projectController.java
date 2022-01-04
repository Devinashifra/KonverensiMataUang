package Exercise1.Exe1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author HP
 */

@Controller
@ResponseBody
public class projectController {
      
    @RequestMapping("/dolarkerupiah")
    public String dolar (){
        float dolar = 1;
        float rupiah = 14000;
        float konversi = dolar*rupiah;
        return "Hasil konversi dolar ke rupiah" + dolar + "*" + rupiah + "=" + konversi;
    }
    
    @RequestMapping("/ringgitkerupiah")
    public String ringgit (){
        float ringgit = 1;
        float rupiah = 3500;
        float konversi2 = ringgit*rupiah;
        return "Hasil konversi ringgit ke rupiah" + ringgit + "*" + rupiah + "=" + konversi2;
    }
    
    @RequestMapping ("/dollarkeringgit")
    public String dolar2 (){
        float dolar = 1;
        float ringgit = 4;
        float konversi3 = dolar*ringgit;
        return "Hasil konversi dolar ke ringgit" + dolar + "*" + ringgit + "=" + konversi3;
    }

    @RequestMapping("/CountDown")
        public String getLoop () {
        String result = "";
        
        for (int kali = 5; kali <= 100; kali++){
            result += "Perulangan ke: " + kali + "<br>";
            if(kali==100){
                result+="<br>";
            }               
        }
   
        return result;  
    }

}
