package edu.ib.MoonLander;

import edu.ib.MoonLander.MoonLander;
import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;

import java.util.Arrays;


public class MoonLanderTester {

    public static void main(String[] args) {



        MoonLander apollo11= new MoonLander();
        apollo11.setU(0);
        FirstOrderIntegrator rk= new ClassicalRungeKuttaIntegrator(0.001);
        double [] x = {50000,-150,2010.51+719.63};

        System.out.println("FREE FALL");
        System.out.println(Arrays.toString(x));
        rk.integrate(apollo11,0,x,124.2716,x);
        System.out.println(Arrays.toString(x));

        System.out.println("FULL THRUST");
        apollo11.setU(16.5);
        rk.integrate(apollo11,0,x,89.98,x);
        System.out.println(Arrays.toString(x));


    }


}
