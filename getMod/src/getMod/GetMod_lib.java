package getMod;

public class GetMod_lib {
	private int m,n;
	
	public GetMod_lib(int m , int n){
		this.m = m;
		this.n = n;
		
	}
	
	public int getMod(){
		return m % n;
  }
}