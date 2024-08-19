package ch.erzberger.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URL;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.tempuri.Add;
import org.tempuri.Calculator;
import org.tempuri.CalculatorSoap;
import org.tempuri.ObjectFactory;


public class Calc {
	Calculator service;
	CalculatorSoap port;

    ObjectFactory factory;

    @BeforeEach
    void setUp() throws Exception {
        service = new Calculator(new URL("http://www.dneonline.com/calculator.asmx"));
        //service = new HelloPortService();
        port = service.getCalculatorSoap();
        factory = new ObjectFactory();
    }

    @Test
    void helloService() {
        Add request = factory.createAdd();
        request.setIntA(11);
        request.setIntB(33);
        System.out.println("add---->"+ port.add(22, 44));
        assertEquals("resp :-", port.add(22, 44));
    }
}
