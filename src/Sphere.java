 
public class Sphere extends Thread implements ISubscriber{
 
    private int input;
    public void sphereArea(){
       System.out.println("input is the radius of sphere");
       int Area = (4*22*input*input)/(7);
       
       System.out.println(" the Area SurfaceArea Of sphere is " +Area); 
    }

    @Override
    
    public void run(){
     sphereArea();
      }
    
    public void notifySubscriber(Topic topic) {
        input=(int)topic.getValue();
        this.start();
    }


    
    
  
    
}
