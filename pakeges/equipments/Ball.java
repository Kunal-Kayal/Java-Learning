package pakeges.equipments;

public class Ball {
     String name,colour;
     float weight;
     public Ball(String colour,float weight) {
    	 this.colour = colour;
    	 this.weight = weight;
     }
    private Ball(String name){
    	 this.name=name;
    	 System.out.println("This ball is only for "+ name);
     }
    
}
