package replit;

public class CameraPhone{
	  int imageSize; //megabytes
	  int memorySize; //gigabytes  1 gigabyte==1000 megabytes
	  
	  public CameraPhone(int imageSize, int memorySize){
	    this.imageSize = imageSize;
	    this.memorySize = memorySize;
	    
	  }
	  
	  public int numPictures(){
	    
	    return imageSize/memorySize*1000; 
	  }
}
