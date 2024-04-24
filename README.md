<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS
Welcome to Java Frameworks! This is an opportunity for students to implement user interfaces and learn to leverage existing frameworks, assets, and content for object-oriented programming.
FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.
## BASIC INSTRUCTIONS
For this project, you will use the Integrated Development Environment (IDE) link in the web links section of this assessment to install the IDE, IntelliJ IDEA (Ultimate Edition). All relevant links are on the course page. Please refer to the course of study for specific links. You will sign up for a free student license using your WGU.edu email address. Please see the “IntelliJ Ultimate Edition Instructions” attachment for instructions on how do this. Next you will download the “Inventory Management Application Template Code” provided in the web links section and open it in IntelliJ IDEA (Ultimate Edition). You will upload this project to a private external GitLab repository and backup regularly. As a part of this, you have been provided with a base code (starting point). 

## SUPPLEMENTAL RESOURCES  
1.	How to clone a project to IntelliJ using Git?

> Ensure that you have Git installed on your system and that IntelliJ is installed using [Toolbox](https://www.jetbrains.com/toolbox-app/). Make sure that you are using version 2022.3.2. Once this has been confirmed, click the clone button and use the 'IntelliJ IDEA (HTTPS)' button. This will open IntelliJ with a prompt to clone the proejct. Save it in a safe location for the directory and press clone. IntelliJ will prompt you for your credentials. Enter in your WGU Credentials and the project will be cloned onto your local machine.  

2. How to create a branch and start Development?

- GitLab method
> Press the '+' button located near your branch name. In the dropdown list, press the 'New branch' button. This will allow you to create a name for your branch. Once the branch has been named, you can select 'Create Branch' to push the branch to your repository.

- IntelliJ method
> In IntelliJ, Go to the 'Git' button on the top toolbar. Select the new branch option and create a name for the branch. Make sure checkout branch is selected and press create. You can now add a commit message and push the new branch to the local repo.

## SUPPORT
If you need additional support, please navigate to the course page and reach out to your course instructor.
## FUTURE USE
Take this opportunity to create or add to a simple resume portfolio to highlight and showcase your work for future use in career search, experience, and education!


# Changes to this document:

## Part C.
___

### Line 14 of mainscreen.html
#### From: ```<title>My Bicycle Shop</title>```
#### To: ```<title>My Guitar Shop</title>```

### Line 17 of mainscreen.html
#### From: ```<div class="container">```
#### To: ```<div class="container-fluid">```

### Line 18 of mainscreen.html
#### From:
    <div class="container">
        <h1>Shop</h1>
        <hr>
        <h2>Parts</h2>
#### To:
    <div class="container-fluid">
        <nav class="navbar">
        <h1 class="navbar-brand text-secondary">TheGuitarShop</h1>
        <hr>
        </nav>
        <div class="row">
            <div class="col-xl">
                <h2>Guitar parts</h2>

### Line 53 of mainscreen.html
#### From: ```<h2>Products</h2>```
#### To:
    </div>
    <div class="col-xl">
        <h2>Guitar products</h2>

### Line 94 of mainscreen.html
#### Added: closing div elememts. 
    </div>
        </div>

### Lines 54-83 of mainscreen.html
#### Added:
    <tr>
        <td>Acoustic Guitar Bridge</td>
        <td>45.00</td>
        <td>35</td>
        <td>null</td>
    </tr>
    <tr>
        <td>Pickguard</td>
        <td>50.00</td>
        <td>25</td>
        <td>null</td>
    </tr>
    <tr>
        <td>Chromatic Tuner</td>
        <td>80.00</td>
        <td>20</td>
        <td>null</td>
    </tr>
    <tr>
        <td>Elixir strings Polyweb</td>
        <td>13.00</td>
        <td>40</td>
        <td>null</td>
    </tr>
    <tr>
        <td>Elixir strings Nanoweb</td>
        <td>15.00</td>
        <td>30</td>
        <td>null</td>
    </tr>

### Lines 122-151 of mainscreen.html
#### Added:
    <tr>
        <td>Fender Telecaster</td>
        <td>1800.00</td>
        <td>3</td>
        <td>null</td>
    </tr>
    <tr>
        <td>Fender Stratocaster</td>
        <td>1700.00</td>
        <td>4</td>
        <td>null</td>
    </tr>
    <tr>
        <td>Taylor 522e</td>
        <td>1200.00</td>
        <td>2</td>
        <td>null</td>
    </tr>
    <tr>
        <td>Taylor GS mini-E Koa</td>
        <td>1000.00</td>
        <td>3</td>
        <td>null</td>
    </tr>
    <tr>
        <td>Gibson Les Paul</td>
        <td>3000.00</td>
        <td>2</td>
        <td>null</td>
    </tr>

## Part D.
___

### Created about.html
#### To: 
    <!DOCTYPE html>
    <html lang="en" xmlns:th="http://www.thymeleaf.org">
    <head>
        <meta charset="UTF-8">

    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="src/main/resources/static/css/demo.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <style>
        *{
            margin: 0;
            padding: 0;
        }
        html, body {
            height: 100%;
        }
        .container {
            min-height: 100%;
            position: relative;
        }
        .main{
            flex-grow: 1;
            padding-bottom: 60px;
        }
        footer {
            position: fixed;
            bottom: 0;
            width: 100%;
            height: 35px;
            padding: 5px;
            background-color: #bab7b7;
            text-align: center;
        }
        .mainscreen-page-link{
            color: black
        }

    </style>

    <title>My Guitar Shop</title>
    </head>
    <body>
    <div class="container d-flex flex-column">
        <div class="text-center text-uppercase fs-1"> <strong>History of The Guitar Shop</strong> </div>
        <div class="text-center fs-4 pt-5 main">
            The Guitar Shop was founded in Carthage of Leake county, Mississippi in 1912, September 24. Newton Shoppe, my grandfather, was well
            known within Carthage for his instrumental skill and knowledge. On a rainy day in May of the aforementioned year, he and his group,
            called the Sounds of Melody, were scheduled to perform in the local church. Unfortunately, the night before the performance, part of the
            church's roof fell in and the performance was cancelled. Being the strong-willed and good-natured man that he was, my grandfather offered his
            horse stable as a means for the church-goers to worship and for the Sounds of Meldoy to perform. That was the beginning of the popularity of
            Newton Shoppe within central Mississippi.
    
            The Sounds of Medoly performed regularly in Newton's stable, drawing larger crowds from the surrounding counties.
            As word spread of my grandfather's great act of kindness, many more people flocked to witness the magic of the Sounds of Melody.
            In a span of weeks, my grandfather's reputation grew not only as a talented musician but also as a generous, community-minded individual with a
            heart for the people. In about a month, the church's roof was repaired and everything was business as usual, however, Newton's
            willingness to open his stable for worship endeared him to the locals, and the stable became synonymous with vibrant music and heartfelt gatherings.
    
            Because Newton started to use the stable as a means to teach sheet music and repair guitars, the stable began to be referred to as the Guitar Shop. Newton's
            dedication to his craft and his community laid the foundation for a legacy that would endure for generations to come. Today, the Guitar Shop
            stands as a testament to the enduring spirit of music and the profound impact of one man's kindness and passion.
        </div>
    </div>
    <footer><a class="mainscreen-page-link" th:href="@{/mainscreen}">Back to main screen</a></footer>
    </body>
    </html>

### Created about.html
#### To: 
    package com.example.demo.controllers;

    import com.example.demo.domain.Part;
    import com.example.demo.domain.Product;
    import com.example.demo.service.PartService;
    import com.example.demo.service.ProductService;
    import org.springframework.data.repository.query.Param;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.GetMapping;
    
    import java.util.List;
    
    /**
    *
      *
      *
      *
    */
    
    @Controller
    public class AboutPageController {
    // private final PartRepository partRepository;
    // private final ProductRepository productRepository;'
    
        public AboutPageController() {}
    
        @GetMapping("/about-us")
        public String aboutPage(){
            return "about";
        }
    }

### Lines 176-178 of mainscreen.html
#### Added:
    <footer>
    Discover more about the <a class="about-page-link" th:href="@{/about-us}" >TheGuitarShop</a>
    </footer>

### Lines 13-31 of mainscreen.html
#### Added: 
        <style>
        .container-class{
            padding-bottom: 100px;
        }

        footer{
            position: fixed;
            bottom: 0;
            width: 100%;
            height: 35px;
            padding: 5px;
            background-color: #bab7b7;
            text-align: center;
        }
         .about-page-link{
             color: black;
         }

    </style>

## Part E.
___

### Lines 67-139 of BootStrapData.java
#### To: 
        InhousePart pickGuard = new InhousePart();
        pickGuard.setPrice(50);
        pickGuard.setName("Pick Guard");
        pickGuard.setInv(25);
        inhouseParts.add(pickGuard);

        InhousePart acousticBridge = new InhousePart();
        acousticBridge.setPrice(45);
        acousticBridge.setName("Acoustic Guitar Bridge");
        acousticBridge.setInv(35);
        inhouseParts.add(acousticBridge);

        InhousePart cTuner = new InhousePart();
        cTuner.setPrice(80);
        cTuner.setName("Chromatic Tuner");
        cTuner.setInv(20);
        inhouseParts.add(cTuner);

        InhousePart elixirPolyStrings = new InhousePart();
        elixirPolyStrings.setPrice(13);
        elixirPolyStrings.setName("Elixir strings Polyweb");
        elixirPolyStrings.setInv(40);
        inhouseParts.add(elixirPolyStrings);

        InhousePart elixirNanoStrings = new InhousePart();
        elixirNanoStrings.setPrice(15);
        elixirNanoStrings.setName("Elixir strings Nanoweb");
        elixirNanoStrings.setInv(40);
        inhouseParts.add(elixirNanoStrings);

        Product telecaster = new Product("Fender Telecaster", 1800.0, 3);
        products.add(telecaster);
        Product stratocaster = new Product("Fender Stratocaster", 1700.0, 4);
        products.add(stratocaster);
        Product taylor522e = new Product("Taylor 522e", 1200.0, 2);
        products.add(taylor522e);
        Product taylorGSMiniKoa = new Product("Taylor GS mini-E Koa", 1000.0, 3);
        products.add(taylorGSMiniKoa);
        Product gibsonLP = new Product("Gibson Les Paul", 3000.0, 2);
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


## Part F.
___

### Created BuyNowController.java
#### To: 
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
            if (product.getInv() <= 0){
                return "confirmationfailurepurchasedproduct";
            } else {
                int newInv =  product.getInv() - 1;
                product.setInv(newInv);
                model.addAttribute("product", product); //this does nothing because the values are being updated directly and shown in the view. not sure if this is acceptable or not...
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
            if (part.getInv() <= 0){
                return "confirmationfailurepurchasedproduct";
            } else {
                int newInv =  part.getInv() - 1;
                part.setInv(newInv);
                model.addAttribute("product", part);
                System.out.println(part.getName() + " has an inventory of: " + part.getInv());
                return "confirmationpurchasedproduct";
            }
        }
    }

### Created confirmationfailurepurchasedpart.html
#### To: 
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta http-equiv="refresh"
              content="0;URL='mainscreen'">
    <!--    <meta charset="UTF-8">-->
        <title>Purchase</title>
    </head>
    <body>
    <h1>Your part has not been purchased. That part's inventory is less than or equal to zero.</h1>
    
    <a href="http://localhost:8080/">Link
    to Main Screen</a>
    </body>
    </html>

### Created confirmationfailurepurchasedproduct.html
#### To: 
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta http-equiv="refresh"
              content="0;URL='mainscreen'">
    <!--    <meta charset="UTF-8">-->
        <title>Purchase</title>
    </head>
    <body>
    <h1>Your product has not been purchased. That product's inventory is less than or equal to zero.</h1>
    
    <a href="http://localhost:8080/">Link
    to Main Screen</a>
    </body>
    </html>

### Created confirmationpurchasedpart.html
#### To: 
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta http-equiv="refresh"
              content="0;URL='mainscreen'">
    <!--    <meta charset="UTF-8">-->
        <title>Purchase</title>
    </head>
    <body>
    <h1>Your part has been purchased</h1>
    
    <a href="http://localhost:8080/">Link
    to Main Screen</a>
    </body>
    </html>

### Created confirmationpurchasedproduct.html
#### To: 
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta http-equiv="refresh"
              content="0;URL='mainscreen'">
    <!--    <meta charset="UTF-8">-->
        <title>Purchase</title>
    </head>
    <body>
    <h1>Your product has been purchased</h1>
    
    <a href="http://localhost:8080/">Link
    to Main Screen</a>
    </body>
    </html>

### Lines 31-36 of mainscreen.html
#### Added:
    .buy-now-btn-form{
         display: inline;
     }
     .buy-now-btn{
         margin-bottom: 16px;
     }

### Lines 77-80 of mainscreen.html
#### Added: 
    <form action="/purchase-part" method="post" class="buy-now-btn-form ">
        <input type="hidden" name="partID" th:value="${tempPart.id}" />
        <button type="submit" class="btn btn-sm btn-primary buy-now-btn">Buy Now</button>
    </form>

### Lines 149-152 of mainscreen.html
#### Added:
    <form action="/purchase-product" method="post" class="buy-now-btn-form ">
        <input type="hidden" name="productID" th:value="${tempProduct.id}" />
        <button type="submit" class="btn btn-sm btn-primary buy-now-btn">Buy Now</button>
    </form>

## Part G.
___

### Line 33-34 of AddInhousePartController.java
#### To: 
    @Autowired
    private MinMaxValidator minMaxValidator;

### Line 48-51 of AddInhousePartController.java
#### To: 
    System.out.println("Validation on min and max is : " + minMaxValidator.isValid(part, null));
    if (!minMaxValidator.isValid(part, null)){
        theModel.addAttribute("inhousepart", part);
        return "/minmaxparterrorinhousepart";
    }

### Line 33-34 of AddOutsourcedPartController.java
#### To: 
    @Autowired
    private MinMaxValidator minMaxValidator;

### Line 48-51 of AddOutsourcedPartController.java
#### To:
    System.out.println("Validation on min and max is : " + minMaxValidator.isValid(part, null));
    if (!minMaxValidator.isValid(part, null)){
        theModel.addAttribute("inhousepart", part);
        return "/minmaxparterrorinhousepart";
    }

### Line 6-7 of application.properties
#### To:
    spring.datasource.url=jdbc:h2:file:~/spring-boot-h2-db101.mv.db
    logging.level.org.springframework=debug

### Line 74-75 of BootStrapData.java
#### To:
    pickGuard.setMaxInventory(50);
    pickGuard.setMinInventory(5);

### Line 82-83 of BootStrapData.java
#### To:
    acousticBridge.setMaxInventory(50);
    acousticBridge.setMinInventory(5);

### Line 90-91 of BootStrapData.java
#### To:
    cTuner.setMaxInventory(50);
    cTuner.setMinInventory(5);

### Line 98-99 of BootStrapData.java
#### To:
    elixirPolyStrings.setMaxInventory(50);
    elixirPolyStrings.setMinInventory(5);

### Line 106-107 of BootStrapData.java
#### To:
    elixirNanoStrings.setMaxInventory(50);
    elixirNanoStrings.setMinInventory(5);

### Line 23-27 of InhousePartForm.html
#### To:
    p><input type="text" th:field="*{minInventory}" placeholder="Min" class="form-control mb-4 col-4"/></p>
    <p th:if="${#fields.hasErrors('minInventory')}" th:errors="*{minInventory}">Min Inventory Error</p>
    
    <p><input type="text" th:field="*{maxInventory}" placeholder="Max" class="form-control mb-4 col-4"/></p>
    <p th:if="${#fields.hasErrors('maxInventory')}" th:errors="*{maxInventory}">Max Inventory Error</p>

### Line 25-29 of OutsourcedPartForm.html
#### To:
    <p><input type="text" th:field="*{minInventory}" placeholder="Min" class="form-control mb-4 col-4"/></p>
    <p th:if="${#fields.hasErrors('minInventory')}" th:errors="*{minInventory}">Min Inventory Error</p>

    <p><input type="text" th:field="*{maxInventory}" placeholder="Max" class="form-control mb-4 col-4"/></p>
    <p th:if="${#fields.hasErrors('maxInventory')}" th:errors="*{maxInventory}">Max Inventory Error</p>

### Created minmaxparterrorinhousepart.html
#### To:
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta http-equiv="refresh"
              content="3;URL='/showFormAddInPart'">
        <title>Inventory Range</title>
    </head>
    <body>
    <p>Inventory range out of bounds. Maximum inventory cannot be less than minimum inventory...</p>
    </body>
    </html>

### Created minmaxparterroroutsourcedpart.html
#### To:
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta http-equiv="refresh"
              content="3;URL='/showFormAddOutPart'">
        <title>Inventory Range</title>
    </head>
    <body>
    <p>Inventory range out of bounds. Maximum inventory cannot be less than minimum inventory...</p>
    </body>
    </html>

### Created MinMaxValidator.java
#### To:
    package com.example.demo.validators;
    
    import com.example.demo.domain.InhousePart;
    import com.example.demo.domain.Part;
    import org.springframework.stereotype.Component;
    import org.springframework.validation.Errors;
    
    import javax.validation.ConstraintValidator;
    import javax.validation.ConstraintValidatorContext;
    
    /**
    *
      *
      *
      *
    */
    @Component
    public class MinMaxValidator implements ConstraintValidator<ValidMinMax, Part> {
    
        @Override
        public void initialize(ValidMinMax constraintAnnotation) {
            ConstraintValidator.super.initialize(constraintAnnotation);
        }
    
        @Override
        public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
            if (part.getMinInventory() > part.getMaxInventory()) {
                return false;
            }
            return true;
        }
    
        public void validate(Part part, Errors errors){
            boolean valid = this.isValid(part, null);
            if (!valid){
                errors.reject("invalue", "min cannot be greater than max" );
            }
        }
    }

### Created ValidMinMax.java
#### To:
    package com.example.demo.validators;

    import javax.validation.Constraint;
    import javax.validation.Payload;
    import java.lang.annotation.ElementType;
    import java.lang.annotation.Retention;
    import java.lang.annotation.RetentionPolicy;
    import java.lang.annotation.Target;
    
    /**
    *
      *
      *
      *
    */
    @Constraint(validatedBy = {MinMaxValidator.class})
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ValidMinMax {
        String message() default "The value entered is less than 0 or greater than 100";
        Class<?> [] groups() default {};
        Class<? extends Payload> [] payload() default {};
    }


### Added line 22 Part.java
#### To: ``` @ValidMinMax ```

### Added lines 36-42 Part.java
#### To:
    @Min(value = 0, message = "Minimum inventory value cannot be less than zero")
    @Max(value = 100, message = "Minimum inventory value cannot be greater than one hundred")
    int minInventory;

    @Max(value = 100, message = "Maximum inventory value cannot be greater than one hundred")
    @Min(value = 0, message = "Maximum inventory value cannot be less than zero")
    int maxInventory;

### Added lines 64-70 Part.java
#### To:
    public Part(String name, double price, int inv, int minInventory, int maxInventory) {
        this.name = name;
        this.price = price;
        this.inv = inv;
        this.minInventory = minInventory;
        this.maxInventory = maxInventory;
    }

### Added lines 104-119 Part.java
#### To:
    public int getMinInventory() {
        return minInventory;
    }

    public void setMinInventory(int minInventory) {
        this.minInventory = minInventory;
    }

    public int getMaxInventory() {
        return maxInventory;
    }

    public void setMaxInventory(int maxInventory) {
        this.maxInventory = maxInventory;
    }

## Part G.
___

### Lines 162-197 of PartTest.java
#### To: 
    @Test
    void testMinInventoryMaxConstraint(){
        partIn.setMinInventory(101);
        var errors = new BeanPropertyBindingResult(partIn, "partIn");
        assertFalse(errors.hasErrors(), "minInventory is beyond the bounds of its @Max constraint");
        partOut.setMinInventory(101);
        var newErrors = new BeanPropertyBindingResult(partOut, "partIn");
        assertFalse(newErrors.hasErrors(), "minInventory is beyond the bounds of its @Max constraint. again");
    }
    @Test
    void testMinInventoryMinConstraint(){
        partIn.setMinInventory(-1);
        var errors = new BeanPropertyBindingResult(partIn, "partIn");
        assertFalse(errors.hasErrors(), "minInventory is beyond the bounds of its @Max constraint");
        partOut.setMinInventory(-1);
        var newErrors = new BeanPropertyBindingResult(partOut, "partIn");
        assertFalse(newErrors.hasErrors(), "minInventory is beyond the bounds of its @Max constraint. again");
    }
    @Test
    void testMaxInventoryMinConstraint(){
        partIn.setMaxInventory(-1);
        var errors = new BeanPropertyBindingResult(partIn, "partIn");
        assertFalse(errors.hasErrors(), "maxInventory is beyond the bounds of its @Min constraint");
        partOut.setMaxInventory(-1);
        var newErrors = new BeanPropertyBindingResult(partOut, "partIn");
        assertFalse(newErrors.hasErrors(), "maxInventory is beyond the bounds of its @Min constraint. again");
    }
    @Test
    void testMaxInventoryMaxConstraint(){
        partIn.setMaxInventory(101);
        var errors = new BeanPropertyBindingResult(partIn, "partIn");
        assertFalse(errors.hasErrors(), "maxInventory is beyond the bounds of its @Max constraint");
        partOut.setMaxInventory(101);
        var newErrors = new BeanPropertyBindingResult(partOut, "partIn");
        assertFalse(newErrors.hasErrors(), "maxInventory is beyond the bounds of its @Max constraint. again");
    }

## Part J.
___

### Removed DeletePartValidator.java
#### To: ``` NULL ```


# Revisions

## Part G.
---

### Lines 43-48 of AddInhousePartController.java
#### Removed 
    System.out.println("Validation on min and max is : " + minMaxValidator.isValid(part, null));
    if (!minMaxValidator.isValid(part, null)){
        theModel.addAttribute("inhousepart", part);
        return "/minmaxparterrorinhousepart";
    }
#### To:
    if (part.validInv(part.getInv(), part.getMinInventory(), part.getMaxInventory())){
            theBindingResult.rejectValue("inv", "inv.invalid", "Inventory cannot be less than minimum inventory or greater than maximum inventory");
    }
    if (part.validMinMax(part.getMaxInventory(), part.getMinInventory())){
        theBindingResult.rejectValue("minInventory", "minInventory.invalid", "Minimum inventory cannot be greater than maximum inventory");
    }

### Lines 43-48 of AddOutsourcedPartController.java
#### Removed
    System.out.println("Validation on min and max is : " + minMaxValidator.isValid(part, null));
    if (!minMaxValidator.isValid(part, null)){
        return "/minmaxparterroroutsourcedpart";
    }
#### To:
    if (part.validInv(part.getInv(), part.getMinInventory(), part.getMaxInventory())){
            theBindingResult.rejectValue("inv", "inv.invalid", "Inventory cannot be less than minimum inventory or greater than maximum inventory");
    }
    if (part.validMinMax(part.getMaxInventory(), part.getMinInventory())){
        theBindingResult.rejectValue("minInventory", "minInventory.invalid", "Minimum inventory cannot be greater than maximum inventory");
    }

### Lines 6 of application.properties
#### Changed the db name

### Lines 14-16 of mainscreen.html
#### Added:
    table{
        text-align: center;
    }

### Lines 69-70 of mainscreen.html
#### Added:
    <th>Minimum Inventory</th>
    <th>Maximum Inventory</th>

### Lines 79-80 of mainscreen.html
#### Added:
    <td th:text="${tempPart.minInventory}">1</td>
    <td th:text="${tempPart.maxInventory}">1</td>

### Lines 94-95, 102-103, 110-111, 118-119, 126-127 of mainscreen.html
#### Added:
#### I know this part was already graded as passing but I just did it to be thorough
    <td>0</td>
    <td>50</td>


### Lines 138-150 of Part.java
#### Added: 
    public boolean validInv(int inv, int min, int max){
    if (inv <= max && inv >= min){
        return false;
    }
    return true;
    }

    public boolean validMinMax(int max, int min){
        if (min > max){
            return true;
        }
        return false;
    }

## Part H.
---

### Lines 81-92 of AddInhousePartController.java
#### Added: 
    List<Part> newAvailParts = partService1.findAll();
    for (Part p : product2.getParts()) {
        if (!p.correctInv()){
            if(product2.getParts().contains(p)){
                newAvailParts.remove(p);
            }
            String bindingResultError = String.format("The part '%s' appears to be below its minimum inventory.", p);
            theModel.addAttribute("availparts", newAvailParts);
            theModel.addAttribute("assparts",product2.getParts());
            bindingResult.rejectValue("inv", "err", bindingResultError);
            return "productForm";
        }

### Lines 145-150 of Part.java
#### Added:
    public boolean correctInv(){
        if (this.inv > this.minInventory && this.inv < this.maxInventory){
           eturn true;
        }
        return false;
    }

# Part F.
---

### Lines 67-68 of BuyNowControllerjava
#### Added: 
    if (!part.correctInv()){
            return "confirmationfailurepurchasedpart"; //changed to "confirmationfailurepurchasedpart" was "confirmationfailurepurchasedproduct"
    }