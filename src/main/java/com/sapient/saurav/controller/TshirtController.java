package com.sapient.saurav.controller;

        import com.sapient.saurav.domain.Tshirt;
        import com.sapient.saurav.repository.TshirtRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.List;

@RestController
@RequestMapping("/tshirt-factory")
public class TshirtController {

    private final TshirtRepository tshirtRepository ;
    @Autowired
    public TshirtController(TshirtRepository tshirtRepository) {
        this.tshirtRepository = tshirtRepository;
    }
    @GetMapping(value = "/alltshirts")
    public List<Tshirt> getAllTshirts(){
        return (List<Tshirt>)tshirtRepository.findAll();
    }
}
