package jalil.demo.AOPDemo.Service;

import jalil.demo.AOPDemo.Aspect.Loggable;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    @Loggable
    public void homePage(){
        System.out.println("From Service");
    }
}
