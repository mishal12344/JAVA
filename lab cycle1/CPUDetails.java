class CPU{
double price;
class Processor{
double cores;
String manufacturer;

double getCache(){
return 4.3;
}
}

protected class RAM{
double memory;
String manufacturer;

double getClockSpeed(){
return 5.5;
}
}
}

public class CPUDetails{
public static void main(String[] args){
 System.out.println("Name:THASNI NOUFAL\nRoll:No:57\nDate-14/02/2024\nprogram-5 Create CPU with attribute price. Create inner class Processor");
 
CPU cpu = new CPU();
CPU.Processor processor=cpu.new Processor();

CPU.RAM ram=cpu.new RAM();
System.out.println("Processor Cache:"+processor.getCache());
System.out.println("Ram Clock speed:"+ram.getClockSpeed());
}
}
