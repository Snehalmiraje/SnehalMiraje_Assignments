package assignment5;

public class trasaction {
		int year,value;
		trader t;
		public trasaction(int year, int value, trader t) {
			super();
			this.year = year;
			this.value = value;
			this.t = t;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		public trader getT() {
			return t;
		}
		
		@Override
		public String toString() {
			return "trasaction [year=" + year + ", value=" + value + ", t=" + t + "]";
		}
		public void setT(trader t) {
			this.t = t;
		}
		
	

}
