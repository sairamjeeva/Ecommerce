package common.Runner;

import common.login.Google;
import org.testng.annotations.Test;


public class Runner {
    @Test
    public void run(){
       Google google=new Google() ;
       google.Login("Chrome");
    }
}
