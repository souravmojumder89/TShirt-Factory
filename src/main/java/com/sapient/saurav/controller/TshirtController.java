package com.sapient.saurav.controller;

        import com.sapient.saurav.domain.Tshirt;
        import com.sapient.saurav.repository.TshirtRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.data.domain.Page;
        import org.springframework.data.domain.Pageable;
        import org.springframework.web.bind.annotation.*;

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
        return (List<Tshirt>) tshirtRepository.findAll();
    }
    @PostMapping(value="/cart")
    public List<Tshirt> addToCart(@RequestBody List<Tshirt> tshirts){
        tshirts.forEach(tshirt->tshirt.setAvailable(tshirt.getAvailable()-1));
        tshirtRepository.saveAll(tshirts);
        return tshirts ;
    }
    /*@GetMapping(value = "/buy/{id}")
    public List<Tshirt> getAllTshirts(){
        return (List<Tshirt>)tshirtRepository.findAll();
    }*/

}
