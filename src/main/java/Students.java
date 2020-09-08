
/**
 *
 * @author A
 */
public class Students {
   private String cycle;
   private String car;
    private String walk;
   
     
    public Students(String walk, String car, String cycle) {
        this.walk=walk;
        this.car=car;
        this.cycle=cycle;
    }

    public String getCycle() {
        return cycle;
    }

    public String getCar() {
        return car;
    }

    public String getWalk() {
        return walk;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public void setWalk(String walk) {
        this.walk = walk;
    }
   
    
public String toString(){
    return ("students' walk"+ walk) +
            ("students' car"+car)+
            ("student's cycle"+cycle);
    
}
    
    
    
}
