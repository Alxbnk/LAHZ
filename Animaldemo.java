public class Animaldemo {

   //Attributes (nouns)
   private String name;
   private String sound;
   
   private int x;
   private int y;
   
   
      //Metoder (verbs)
      public void setName(String name){
      
         this.name = name;
      
      }
       public void getName(){
       
         System.out.println(name);
       
       }
   
      public void tell(){
         
   
         System.out.println("I am the " + name + " and i am standing on square " + x + ", " + y);
            if (name == "Snake" && y > 8){
               System.out.println("Snake: I am the snake i want to eat the rabbit\n");
               }
               else if(name == "Rabbit" && x < 3){
                  System.out.println("Rabbit: I am the rabbit, dont let the snake get me\n");
                  }
             if (name == "Rabbit" && y > 2 && y < 5){
                  System.out.println("Rabbit: The snake is getting close, get me out of here\n");
                  }
              
            /*
               System.out.println("Hello i am the snake, i want to eat the rabbit\n");
               }else if(x > 4){
               System.out.println("hello i am the rabbit, dont let the snake get me\n");
               }
               */
         
       }
   
      public void setX(int x){
   
         this.x = x;
   
      }
      
      public void moveX(){
         
      
         double t = Math.random() * 9;
     
         x = (int) t;
   
      
      }
   
      public void setY(int y){
   
         this.y = y;
   
      }
      
     
      public void gety(){
      
         System.out.print(y);
      
      }
      
      public void setSound(String sound){
      
         this.sound = sound;
      
      }
     
      public void getSound(){
      
         System.out.println(sound);
      
      }
}