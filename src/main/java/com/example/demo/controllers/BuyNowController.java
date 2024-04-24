package com.example.demo.controllers;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

/**
 *
 *
 *
 *
 */
@Controller
public class BuyNowController {
    @Autowired
    private ApplicationContext context;

    private PartService partService;
    private ProductService productService;

    private List<Part> theParts;
    private List<Product> theProducts;

    public BuyNowController(PartService partService, ProductService productService) {
        this.partService = partService;
        this.productService = productService;
    }


    @PostMapping("/purchase-product")
    @Transactional
    public String purchaseProduct(@RequestParam("productID") int theId, Model model) {
        ProductService productService = context.getBean(ProductServiceImpl.class);
        Product product = productService.findById(theId);
        System.out.println(product.getName() + " has an inventory of: " + product.getInv());
        if (product.getInv() <= -0){
            return "confirmationfailurepurchasedproduct";
        } else {
            int newInv =  product.getInv() - 1;
            product.setInv(newInv);
            System.out.println(product.getName() + " has a new inventory of: " + product.getInv());
            return "confirmationpurchasedproduct";
        }
    }

    @PostMapping("/purchase-part")
    @Transactional
    public String purchasePart(@RequestParam("partID") int theId, Model model) {
        PartService partService = context.getBean(PartServiceImpl.class);
        Part part = partService.findById(theId);
        System.out.println(part.getName() + " has an inventory of: " + part.getInv());
        if (!part.correctInv()){
            return "confirmationfailurepurchasedpart"; //changed to "confirmationfailurepurchasedpart" was "confirmationfailurepurchasedproduct"
        } else {
            int newInv =  part.getInv() - 1;
            part.setInv(newInv);
            System.out.println(part.getName() + " has an inventory of: " + part.getInv());
            return "confirmationpurchasedpart";
        }
    }

}
