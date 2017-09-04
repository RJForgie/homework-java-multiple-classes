public class BusStop{
  private String name;
  private Person[] queue;

  public BusStop(String name){
    this.name = name;
    this.queue = new Person[5];
  }

  public String getName(){
    return this.name;
  }

  public int personQueueCount(){
    int count = 0;
    for(Person person : this.queue){
      if(person != null){
        count++;
      }
    }
    return count;
  }

  public void joinQueue(Person person){
    int personQueueCount = personQueueCount();
    queue[personQueueCount] = person;
  }

  public void getOnBus(Bus bus){
    
  }
}
