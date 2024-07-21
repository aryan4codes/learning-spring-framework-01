package com.basictest.building_mario.examples.a1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//Buisness Class

@Component
class yourBuisnessClass{

    //1. injection using reflection -  Autowired

    //@Autowired
    Dependency1 dependency1;
    //@Autowired
    Dependency2 dependency2;
// -----------------------------------------------------

    //2. Injection using Setter

//    @Autowired
//    public void setDependency1(Dependency1 dependency1) {
//        System.out.println("Setter Inject - setDependency1");
//        this.dependency1 = dependency1;
//
//    }
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        System.out.println("Setter Inject - setDependency2");
//        this.dependency2 = dependency2;
//
//    }
// --------------------------------------------------

    //3. Using constructors

    @Autowired
    public yourBuisnessClass(Dependency1 dependency1, Dependency2 dependency2) {
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public String toString(){
        return "Using "+ dependency1 + "and " + dependency2;
    }
}
@Component
class Dependency1{ }
@Component
class Dependency2{}


@Configuration
@ComponentScan   // we have to tell spring to scan for components by providing package path
public class DepInjectionLauncherApplication {
//
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean("yourBuisnessClass"));
        }


    }
}
