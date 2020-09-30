public class Main {
    public static void main(String[] args) {
        double es = (0.5 * Math.pow(10,-6)) * 100;
        double xi = 1.7;
        double xo = 1.8;
        double ea = 0;
        double fxi, fxo, fxr;
        int cont = 0;
        double xr = 0;
        do {
            fxi=(Math.pow(xi,2)-Math.pow(Math.E,-2 *xi)-3);
            fxo=(Math.pow(xo,2)-Math.pow(Math.E,-2 *xo)-3);
            xr=xi-(fxi*(xo-xi))/(fxo-fxi);
            ea=Math.abs((xr-xo)/xr)*100;
            fxr=(Math.pow(xr, 2)-Math.pow(Math.E,-2*xr)-3);
            cont++;
            System.out.println("----------------ITERACION NUMERO "+cont+" ---------------------------");
            System.out.println("xi es:" + xi);
            System.out.println("xo es: " + xo);
            System.out.println("xr es: " + xr);
            System.out.println("f(xi) es: " + fxi);
            System.out.println("f(xo) es: " + fxo);
            System.out.println("f(xr) es: " + fxr);
            System.out.println("Ea es: " + ea);
            xi = xo;
            xo = xr;
        } while (ea > es);
        System.out.println("\n");
        System.out.println("********************** METODO SECANTE************************");
        System.out.println("El valor de Xr es:" + xr);
        System.out.println("f(x)=x^2-e^-2x-3 = "+fxr);
        System.out.println("El numero de iteraciones es " + cont);
        System.out.println("El error aproximado es " + ea);
    }

}
