package collections.ordered;

public class Month implements Comparable<Month>{

	private String name;
	private int number;
	
	public Month(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumber() {
		return number;
	}
	
	@Override
	public String toString() {
		return number + " - " + name;
	}

	@Override
	public int compareTo(Month m) {
		if(this.number < m.getNumber())
			return -1;
		else if (this.number > m.getNumber())
			return 1;
		
		return 0;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + number;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Month other = (Month) obj;
//		if (number != other.number)
//			return false;
//		return true;
//	}
	
	
}
