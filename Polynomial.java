public class Polynomial{
    double[] coefficients;

    public Polynomial(){
        this.coefficients = new double[0];
    }

    public Polynomial(double[] coefficients){
        this.coefficients = coefficients;
    }

    public Polynomial add(Polynomial other){

        int length = other.coefficients.length;

        if (this.coefficients.length > length){
            length = this.coefficients.length;
        }

        double[] newPoly = new double[length];

        for(int i = 0; i < this.coefficients.length; i++)
        {
            newPoly[i] = this.coefficients[i];
        }

        for(int i = 0; i < other.coefficients.length; i++)
        {
            newPoly[i]+= other.coefficients[i];
        }

        return new Polynomial(newPoly);
    }

    public double evaluate(double x){
        double returnVal = 0;
        double scalingx = 1;

        for(double item: this.coefficients){
            returnVal += scalingx * item;
            scalingx = scalingx * x;
        }

        return returnVal;
    }

    public boolean hasRoot(double x){
        if (evaluate(x) == 0){
            return true;
        }
        else{
            return false;
        }
    }
}