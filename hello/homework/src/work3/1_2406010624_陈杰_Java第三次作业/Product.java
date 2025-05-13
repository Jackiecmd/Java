package work3.work1;

//父类Product
public class Product {
    public double calculateShippingFree(){
        return 0;
    }
}

//子类DigitalProduct
class DigitalProduct extends Product{
    @Override
    public double calculateShippingFree() {
        return 0;
    }
}

//子类PhysicalProduct
class PhysicalProduct extends Product{
    private double weight;
    public PhysicalProduct(double weight){
        this.weight=weight;
    }

    @Override
    public double calculateShippingFree() {
        return weight*5+10;
    }
}


