public class Bus{
  private String destination;
  private Person[] passengers;

  public Bus(String destination){
    this.destination = destination;
    this.passengers = new Person[10];
  }

  public String getDestination(){
    return this.destination;
  }

  public int personCount(){
    int count = 0;
    for(Person person : this.passengers){
      if(person != null){
        count++;
      }
    }
    return count;
  }

  public void pickup(Person person){
    if(this.isBusFull()) {
      return;
  }
    int personCount = personCount();
    passengers[personCount] = person;
  }

  public boolean isBusFull(){
    return this.personCount() == this.passengers.length;
  }

  public void arrival(){
    for(int i = 0; i < passengers.length; i++){
      passengers[i] = null;
    }
  }
}
