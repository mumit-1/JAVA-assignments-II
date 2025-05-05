public class ComplexNumber extends RealNumber{
    public double imagine;
    public ComplexNumber(){
        super(1.0);
        imagine=1.0;
    }
    public ComplexNumber(double a,double b){
        super(a);
        imagine=b;
    }
    public String toString(){
        return super.toString()+"\nImaginaryPart: "+imagine;
    }
}