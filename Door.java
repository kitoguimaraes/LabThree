
public class Door {
	
	private String state;
	private String name;

	public Door(String n, String s){		
		this.name = n;
		this.state = s;
	}
	
	public void close() {
		state = "close";
	}
	
	public void open() {
		state = "open";
	}
	
	public String getState(){
		return state;		
	}
	
	public String getName(){
		return name;
	}
	
	public void SetName(String newName){
		this.name = newName;
	}
	
	public void setState(String newState){
		this.state = newState;
	}
}

