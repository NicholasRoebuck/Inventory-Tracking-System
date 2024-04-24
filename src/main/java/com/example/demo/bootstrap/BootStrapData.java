package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Predicate;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository = outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for (OutsourcedPart part : outsourcedParts) {
            System.out.println(part.getName() + " " + part.getCompanyName());
        }

        ArrayList<InhousePart> inhouseParts = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();

        InhousePart pickGuard = new InhousePart();
        pickGuard.setPrice(50);
        pickGuard.setName("Pick Guard");
        pickGuard.setInv(25);
        pickGuard.setMaxInventory(50);
        pickGuard.setMinInventory(5);
        inhouseParts.add(pickGuard);

        InhousePart acousticBridge = new InhousePart();
        acousticBridge.setPrice(45);
        acousticBridge.setName("Acoustic Guitar Bridge");
        acousticBridge.setInv(35);
        acousticBridge.setMaxInventory(50);
        acousticBridge.setMinInventory(5);
        inhouseParts.add(acousticBridge);

        InhousePart cTuner = new InhousePart();
        cTuner.setPrice(80);
        cTuner.setName("Chromatic Tuner");
        cTuner.setInv(20);
        cTuner.setMaxInventory(50);
        cTuner.setMinInventory(5);
        inhouseParts.add(cTuner);

        InhousePart elixirPolyStrings = new InhousePart();
        elixirPolyStrings.setPrice(13);
        elixirPolyStrings.setName("Elixir strings Polyweb");
        elixirPolyStrings.setInv(40);
        elixirPolyStrings.setMaxInventory(50);
        elixirPolyStrings.setMinInventory(5);
        inhouseParts.add(elixirPolyStrings);

        InhousePart elixirNanoStrings = new InhousePart();
        elixirNanoStrings.setPrice(15);
        elixirNanoStrings.setName("Elixir strings Nanoweb");
        elixirNanoStrings.setInv(40);
        elixirNanoStrings.setMaxInventory(50);
        elixirNanoStrings.setMinInventory(5);
        inhouseParts.add(elixirNanoStrings);

        Product telecaster = new Product("Fender Telecaster", 1800.0, 6);
        products.add(telecaster);
        Product stratocaster = new Product("Fender Stratocaster", 1700.0, 8);
        products.add(stratocaster);
        Product taylor522e = new Product("Taylor 522e", 1200.0, 9);
        products.add(taylor522e);
        Product taylorGSMiniKoa = new Product("Taylor GS mini-E Koa", 1000.0, 5);
        products.add(taylorGSMiniKoa);
        Product gibsonLP = new Product("Gibson Les Paul", 3000.0, 4);
        products.add(gibsonLP);

        if (partRepository.count() == 0) {
            partRepository.saveAll(inhouseParts);
        } else {
            List<Part> existingParts = (List<Part>) partRepository.findAll();

            for (InhousePart p : inhouseParts) {
                String name = p.getName().toLowerCase();
                boolean exists = existingParts.stream().anyMatch(existingPart -> existingPart.getName().toLowerCase().equals(name));

                if (!exists) {
                    partRepository.save(p);
                }
            }
        }

        if (productRepository.count() == 0) {
            productRepository.saveAll(products);
        } else {
            List<Product> existingProducts = (List<Product>) productRepository.findAll();

            for (Product p : products) {
                String name = p.getName().toLowerCase();
                boolean exists = existingProducts.stream().anyMatch(existingProduct -> existingProduct.getName().toLowerCase().equals(name));

                if (!exists) {
                    productRepository.save(p);
                }
            }
        }
        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products" + productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts" + partRepository.count());
        System.out.println(partRepository.findAll());

    }
}

