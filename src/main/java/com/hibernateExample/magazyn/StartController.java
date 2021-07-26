package com.hibernateExample.magazyn;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//@Component
@RestController
@RestControllerAdvice
@RequestMapping(value = "formularzMagaz")
public class StartController {

           private List<Magazynierzy> listOfMagazynierzy;

          public StartController() {
        //  takeMagazynierzy();
        // listOfMagazynierzy = new ArrayList<>();
        // listOfMagazynierzy.add(new Magazynierzy("magazynierPrzykładowy", "00099"));
        //  listOfMagazynierzy = (List<Magazynierzy>) magazynierzyRepo.findAll();
    }

    public StartController(List<Magazynierzy> listOfMagazynierzy) {
        this.listOfMagazynierzy = listOfMagazynierzy;
    }

    private MagazynierzyRepo magazynierzyRepo;

    @Autowired
    public StartController(MagazynierzyRepo magazynierzyRepo) {
        this.magazynierzyRepo = magazynierzyRepo;
    }


    @EventListener(ApplicationReadyEvent.class)
    @GetMapping("/mag")
    public List<Magazynierzy> takeMagazynierzy() {
        listOfMagazynierzy = (List<Magazynierzy>) magazynierzyRepo.findAll();
        for (Magazynierzy ma : listOfMagazynierzy) {
            System.out.println("W liscie jest: " + ma);
        }
        return listOfMagazynierzy;
    }

  /*  @Autowired
public Magazynierzy ma;*/


  /*  @RequestMapping(value = "/getMagazynier", method = RequestMethod.GET)
    public String viewMagazynierzy(Model model) {   //   @ModelAttribute("magazMA") int id){
        //  Magazynierzy magazynierzyObj = (Magazynierzy) magazynierzyRepo.findAll();
       return  model.addAttribute("magazMA", new Magazynierzy("gupi", "2")).toString();
     //  return "form";
    }*/

//Magazynierzy m;

    private Map<Integer, Magazynierzy> magMap = new HashMap<>();

    @RequestMapping(value = "/getMagazynier", method = RequestMethod.GET)
    public String viewMagazynierzy(@ModelAttribute("magaziu") Magazynierzy ma, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "błąd";
        }
        magMap.put(ma.getMag_id(), ma);
        model.addAttribute("mag_nr", ma.getMag_nr());
        return model.addAttribute("mag_nazwisko", ma.getMag_nazwisko()).toString();
// return  "działa";
    }


/*@GetMapping("/getMagazynier")
public String getMagazynierzy(Model model){
        model.addAttribute("magazynier",new Magazynierzy());
        return "pozdrowienia";
}*/


    // @EventListener(ApplicationReadyEvent.class)
  /*  @Autowired
    @GetMapping("/mag")
    public Iterable<Magazynierzy> takeMagazynierzy() {
        Iterable<Magazynierzy> listOfMagaz = magazynierzyRepo.findAll();

        for (Magazynierzy magaz : listOfMagaz) {
            System.out.println(magaz);
            List.of(magaz.toString());
        }
        return listOfMagaz;
    }*/


    // @GetMapping("")
    // @EventListener(ApplicationReadyEvent.class)
    public void runExample() {


        // List<Magazynierzy> findMagazyniera = magazynierzyRepo.findById(mag_id);
    }



      /*  Magazynierzy magazynierzy = new Magazynierzy("BasierskiJan", "00013");
        magazynierzyRepo.save(magazynierzy);*/

      /*  Iterable<Magazynierzy> allMagazynierzy = magazynierzyRepo.findAll();
        //   allMagazynierzy.forEach(System.out::println); // Lambda dla foreacha poniżej.
        for (Magazynierzy maga : allMagazynierzy) {
            System.out.println(maga);
        }*/

    //  Iterable<Magazynierzy> allMagazynierzy = magazynierzyRepo.findAllByNazwa("Basierski");

}


