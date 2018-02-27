public class Generator 
{
   
   public void move()
   {
      while(true)
      {
         int x = (int) (Math.random() * 9 + 1);
         int y = (int) (Math.random() * 9 + 1);
         int k = (int) (Math.random() * 9 + 1);
         int l = (int) (Math.random() * 9 + 1);
         System.out.println("Im the Rabbit and im standing on: " + x + ", " + y + "\n");
         System.out.println("Im the Snake and im standing on: " + k + ", " + l + "\n");
         if(((x + 1) == k || (x - 1) == k) && ((y + 1) == l || (y - 1) == l))
         {
         System.out.println("Rabbit: Nooo please dont eat me!");
         }
         if((x != k) && (y != l)){
         System.out.println("Moving around again");
         }
         if((x == k) && (y == l)){
         
            break;
         }
      
      
      }
   
      System.out.println("Snake: Ahhrrrr im going to eat you ha ha!");
   }
   
   



}