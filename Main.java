public static void main(String[] args) {
 
    ModArrayList person1 = new ModArrayList();

    person1.add("John");   
    person1.add("Doe");
    person1.add("Smith");

    System.out.println(person1.getUsingMod(1000256)); // John

}