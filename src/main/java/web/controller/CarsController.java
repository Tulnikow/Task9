package web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.services.ServiceCarImpl;


import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {


    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        ServiceCarImpl carService = new ServiceCarImpl();
        ServiceCarImpl service = new ServiceCarImpl();
        List<Car> cars = service.getCar(count);
        model.addAttribute("list", cars);
        return "cars";
    }
}
