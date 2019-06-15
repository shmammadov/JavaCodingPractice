package day0522;

public class Device { int serialNum; 

public Device() {

  System.out.println("Device COnstructor");

}

public Device(int serialNum) {
  System.out.println("1 arg consructor");
  this.serialNum = serialNum; 
}

}
