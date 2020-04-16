package jalil.demo.AOPDemo.Controller;

import jalil.demo.AOPDemo.Aspect.Loggable;
import jalil.demo.AOPDemo.Service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private final HomeService homeService;

    @Autowired
    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping("/home")
    public ResponseEntity<?> homePage(){
        homeService.homePage();
        return ResponseEntity.ok("Hello");
    }
}
