package edu.ib.MoonLander;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;

public class MoonLander implements FirstOrderDifferentialEquations {

    private double g; //acceleration due to gravity
    private double k; // relative velocity of the exhaust gases
    private double u; // rate of change of the mass


    public MoonLander() {

        g=1.63;
        k=636;
        u=16.5;

    }

    public MoonLander(double g, double k, double u) {
        this.g = g;
        this.k = k;
        this.u = u;
    }


    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }

    public double getU() {
        return u;
    }

    public void setU(double u) {
        this.u = u;
    }

    @Override
    public int getDimension() {
        return 3;
    }

    @Override
    public void computeDerivatives(double v, double[] x, double[] dxdt) throws MaxCountExceededException, DimensionMismatchException {

        dxdt[0]=x[1];          // height
        dxdt[1]=-g +k*u/x[2];  // velocity
        dxdt[2]=-u;             // mass

    }
}
