package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.services.ServiceCar;


@Controller
public class CarsController {
    private final ServiceCar service;

    @Autowired
    public CarsController(ServiceCar service) {
        this.service = service;
    }

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("list", service.getCarByCount(count));
        return "cars";
    }
}
