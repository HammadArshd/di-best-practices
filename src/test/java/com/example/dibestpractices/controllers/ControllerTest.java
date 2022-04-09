package com.example.dibestpractices.controllers;

import com.example.dibestpractices.controllers.bp.BpFinalConstructorWithLLombokController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ControllerTest {


//    Not working
//    java.lang.NullPointerException: Cannot invoke "com.example.dibestpractices.controllers.FieldController.saySomething()" because "this.fieldController" is null

    @Autowired
    FieldController fieldController;

    @Autowired
    PrivateFieldController privateFieldController;

    @Autowired
    SetterController setterController;

    @Autowired
    ConstructorController constructorController;

    @Autowired
    BpFinalConstructorWithLLombokController bpFinalConstructorWithLLombokController;

    @Test
    public void testDIController() {
        System.out.println("A field Controller says: " + fieldController.saySomething());

        System.out.println("A private field Controller says: " + privateFieldController.saySomething());

        System.out.println("A Setter Controller says: " + setterController.saySomething());

        System.out.println("A Constructor Controller says: " + constructorController.saySomething());

        System.out.println("Best Practice Controller says: " + bpFinalConstructorWithLLombokController.saySomething());

    }
}
