package com.company.DSA.OOPS.DPolynomialClass;

public class Polynomial {

    int coefficients[];
    int degree;

    public Polynomial(){
        coefficients = new int[5];
        degree = 0;
    }

    /* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
     *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
     *  is already present in the polynomial then previous coefficient is replaced by
     *  new coefficient value passed as function argument
     */
    public void setCoefficient(int degree, int coeff){

        if (degree >= coefficients.length){
            restructureCoefficients(degree);
        }
        coefficients[degree] = coeff;
        if (this.degree < degree){
            this.degree = degree;
        }
    }

    // Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree.
    public void print(){

        for (int i = 0; i < coefficients.length; i++){
            if (coefficients[i] != 0){
                System.out.print(coefficients[i] + "x" + i + " ");
            }
        }
    }


    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial p){

        Polynomial ans = new Polynomial();
        int i = 0, j = 0, k = 0;
        while (i < this.coefficients.length && j < p.coefficients.length){
            ans.setCoefficient(k, this.coefficients[i] + p.coefficients[j]);
            i++;
            j++;
            k++;
        }

        while (i < this.coefficients.length){
            ans.setCoefficient(k, this.coefficients[i]);
            i++;
            k++;
        }

        while (j < p.coefficients.length){
            ans.setCoefficient(k, p.coefficients[j]);
            j++;
            k++;
        }

        return ans;

    }

    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p){

        Polynomial ans = new Polynomial();
        int i = 0, j = 0, k = 0;
        while (i < this.coefficients.length && j < p.coefficients.length){
            ans.setCoefficient(k, this.coefficients[i] - p.coefficients[j]);
            i++;
            j++;
            k++;
        }

        while (i < this.coefficients.length){
            ans.setCoefficient(k, this.coefficients[i]);
            i++;
            k++;
        }

        while (j < p.coefficients.length){
            ans.setCoefficient(k, -p.coefficients[j]);
            j++;
            k++;
        }

        return ans;

    }

    // Multiply two polynomials and returns a new polynomial which has result
    public Polynomial multiply(Polynomial p){

        Polynomial ans = new Polynomial();

        for (int i = 0; i < this.coefficients.length; i++){
            if (this.coefficients[i] != 0) {
                for (int j = 0; j < p.coefficients.length; j++) {
                    if (p.coefficients[j] != 0) {
                        if (i + j <= ans.degree) { // if degree already exists in ans array then change value at degree
                            ans.setCoefficient(i + j, ans.coefficients[i+j] + this.coefficients[i] * p.coefficients[j]);
                        }else{ // if not exists then create new degree
                            ans.setCoefficient(i + j, this.coefficients[i] * p.coefficients[j]);
                        }
                    }
                }
            }
        }

        /*  or we can write our code like below :
        for (int i = 0; i < this.coefficients.length; i++) {
            for (int j = 0; j < p.coefficients.length; j++) {
                if (i + j <= ans.degree) { // if degree already exists in ans array then change value at degree
                    ans.setCoefficient(i + j, ans.coefficients[i + j] + this.coefficients[i] * p.coefficients[j]);
                } else { // if not exists then create new degree
                    ans.setCoefficient(i + j, this.coefficients[i] * p.coefficients[j]);
                }
            }
        }
        */

        return ans;
    }

    public void restructureCoefficients(int degree){

        int[] temp = coefficients;
        coefficients = new int[degree+1]; // change the length of coefficients array
        // now add old elements to new coefficient array
        for (int i = 0; i < temp.length; i++){
            coefficients[i] = temp[i];
        }

    }

}
