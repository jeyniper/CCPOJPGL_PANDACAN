
public class MyClasslist {

	public static void main(String[] args) {

		Person she = new Person();
		she.setName("Angelique");
		she.setGender("Female");
		she.setWeight(65.7);
		she.setJowa(1);

		Person me = new Person();
		me.setName("Jennifer");
		me.setGender("Female");
		me.setWeight(71.4);
		me.setJowa(1);

		System.out.println(me.getName());
		System.out.println(me.getGender());
		System.out.println(me.getWeight());
		System.out.println(me.getJowa());
		System.out.println("******************");

		System.out.println(she.getName());
		System.out.println(she.getGender());
		System.out.println(she.getWeight());
		System.out.println(she.getJowa());

	}

}
