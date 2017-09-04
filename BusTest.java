import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Person person;
  // Person person2;
  // Person person3;
  BusStop busstop;

  @Before
  public void before() {
    bus = new Bus("Waverley");
    person = new Person();
    // person2 = new Person("Sally");
    // person3 = new Person("Ben");
    busstop = new BusStop("Waverley");
  }

  @Test
  public void hasDestination(){
    assertEquals("Waverley", bus.getDestination());
  }

  @Test
  public void hasName(){
    assertEquals("Waverley", busstop.getName());
  }

  @Test
  public void busStartsEmpty(){
    assertEquals(0, bus.personCount());
}

  @Test
    public void canPickupPeople(){
      bus.pickup(person);
      assertEquals(1, bus.personCount());
  }

  @Test
  public void busIsFull(){
    for(int i = 0; i<10; i++){
      bus.pickup(person);
    }
    assertEquals(true, bus.isBusFull());
  }

  @Test
  public void cannotPickupWhenBusFull(){
    for(int i = 0; i<15; i++){
      bus.pickup(person);
    }
    assertEquals(10, bus.personCount());
  }

  @Test
  public void shouldEmptyBusUponArrival(){
    bus.pickup(person);
    bus.arrival();
    assertEquals(0, bus.personCount());
  }

  @Test
    public void canJoinQueue(){
      busstop.joinQueue(person);
      assertEquals(1, busstop.personQueueCount());
  }

  @Test
  public void canPickupFromBusStop(){
    busstop.joinQueue(person);
    busstop.getOnBus(bus)
    assertEquals(0, busstop.personQueueCount());
    assertEquals(1, bus.personCount());
  }



}
