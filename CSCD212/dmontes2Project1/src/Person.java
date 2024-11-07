public class Person {
    private String name;
    private String birthDay;
    private int height;
    private int weight;

    /**
     *
     * @param name
     * @param birthDay
     * @param height
     * @param weight
     */
    public Person(String name, String birthDay, int height, int weight){
        if(name == null || name.isBlank() || birthDay == null || birthDay.isBlank())
            throw new IllegalArgumentException("Strings are null or empty");
        this.name = name;
        this.birthDay = birthDay;
        this.height = height;
        this.weight = weight;
    }

    /**
     * person's name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * person's birthday
     * @return
     */
    public String getBirthDay() {
        return birthDay;
    }

    /**
     * height of person
     * @return
     */
    public int getHeight() {
        return height;
    }

    /**
     * get the weight of the person
     * @return
     */
    public int getWeight() {
        return weight;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Name of the passenger " + name + "\n" + "Birthdate: " + birthDay + "\n" + "Height: " + height + "\n" + "Weight: " + weight;
    }
}
