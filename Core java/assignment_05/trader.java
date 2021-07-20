package assignment5;

public class trader {

		String name,city;

		public trader(String name, String city) {
			super();
			this.name = name;
			this.city = city;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		@Override
		public String toString() {
			return "trader [name=" + name + ", city=" + city + "]";
		}


}
