package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
     Queen queen = new Queen();
     Worker worker = new Worker();
     Drone drone = new Drone();

     pollObj(queen);
     pollObj(worker);
     pollObj(drone);

    
    output("---------------------------------------");

    // Das sollte eigentlich nicht gehen! / HonayBee ist nur eine Abstraktion, existiert eigentlich nicht. Somit sollte Instanziierung nicht möglich sein.
    
    HoneyBee bee = new HoneyBee();
    pollObj(bee);
    }
     
    //  output(queen.doYourJob());
    //  output(worker.doYourJob());
    //  output(drone.doYourJob());

    //  output("---------------------------------------");
    
    //  output(queen.fly());
    //  output(worker.fly());
    //  output(drone.fly());


    // }


    // Polymorphie

   private static void pollObj(HoneyBee obj) {
         output(obj.doYourJob());
          output(obj.fly());
          
     output("---------------------------------------");
   }

   // Overloading 

//    private static void pollObj(Queen obj) {
//          output(obj.doYourJob());
//           output(obj.fly());
          
//      output("---------------------------------------");
//    }
//       private static void pollObj(Worker obj) {
//          output(obj.doYourJob());
//           output(obj.fly());
          
//      output("---------------------------------------");
//    }
//    private static void pollObj(Drone obj) {
//          output(obj.doYourJob());
//           output(obj.fly());
          
//      output("---------------------------------------");
//    }

   
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

