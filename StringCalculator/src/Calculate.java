
public class Calculate {

	private final String delimiter=",|\n";
	public int calculate(String input) throws Exception {
		String[] numbers=input.split(delimiter);
		if(isEmpty(input)) {
			return 0;
		}
		if(input.length()==1) {
			return toInteger(input);
		}
		else{
			return getsum(numbers);
		}
	}
	private int getsum(String[] numbers) throws Exception{
		finddangerousinp(numbers);
		int sum=0;
		for(String current:numbers) {
			if(toInteger(current)>1000) {
				continue;
			}
			sum+=toInteger(current);
		}
		return sum;
	}
	private void finddangerousinp(String[]numbers) throws Exception {
		for(String current:numbers) {
			if(toInteger(current)<0) {
				throw new Exception("Negative number entered!!");
			}
		}
	}
	
	private boolean isEmpty(String input) {
		return input.isEmpty();
	}
	
private int toInteger(String input) {
	return Integer.parseInt(input);
}
}
