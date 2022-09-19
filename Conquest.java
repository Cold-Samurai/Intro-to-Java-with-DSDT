public class Conquest {
   boolean isOn;
   
   void turnKey(){
    isOn = true;
    System.out.println("Engine on" );

   }
public static void main(String[] args) {

    Conquest key = new Conquest();

      key.turnKey();

 
}
}