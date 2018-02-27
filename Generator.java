public class Generator 
{
   
   public void move()
   {
      while(true)
      {
         int x = (int) (Math.random() * 9 + 1);
         int y = (int) (Math.random() * 9 + 1);
         System.out.println("Im the Rabbit and im standing on: " + x + ", " + x);
         System.out.println("Im the Snake and im standing on: " + y + ", " + y);
         if((x + 1) == y || (x - 1) == y)
         {
         System.out.println("Rabbit: Nooo please dont eat me!");
         }
         if(x != y){
         System.out.println("Moving around again");
         }
         if(x == y){
         
            break;
         }
      
      
      }
   
      System.out.println("Snake: Ahhrrrr im going to eat you ha ha!");
   }
   
   



}