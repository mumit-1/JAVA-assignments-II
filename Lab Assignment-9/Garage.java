public class Garage{
 public Car[] cars= new Car[0];
 public Bike[] bikes= new Bike[0];
 public int carLimit;
 public int bikeLimit;
 public int count;
 public int count2;
 public Garage(int a,int b){
    cars = new Car[a];
    bikes = new Bike[b];
    carLimit=a;
    bikeLimit=b;
    System.out.println("Welcome to the Garage!\nCar Capacity: "+a+"\nBike Capacity: "+b);
 }
public void addVehicle(Vehicle m){
    if(m instanceof Car){
        Car a = (Car)m;
 if(count<(carLimit)) {
    for(int i=0;i<cars.length;i++){
        if(cars[i]==null) {
            cars[i]=a;
            count++;
            System.out.println("A "+a.getBrand()+" CAR has been added to the Garage");
            break;
        }
    }
 }
 else{
    System.out.println("Can't add more Cars! Capacity: "+carLimit);
 }
    }
    else{
               Bike a = (Bike)m;
 if(count2<(bikeLimit)) {
    for(int i=0;i<bikes.length;i++){
        if(bikes[i]==null) {
            bikes[i]=a;
            count2++;
            System.out.println("A "+a.getBrand()+" BIKE has been added to the Garage");
            break;    
        }
    }
 }
 else{
    System.out.println("Can't add more bikes! Capacity: "+bikeLimit);
 }
    }
}
}