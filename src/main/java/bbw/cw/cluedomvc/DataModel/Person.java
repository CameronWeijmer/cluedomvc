package bbw.cw.cluedomvc.DataModel;

public class Person {

    private String name;
    private String formOfAddress;
    private String age;
    private String hairColor;
    private String clothColor;

    public Person(String name, String formOfAddress, String age, String hairColor, String clothColor) {
        this.name = name;
        this.formOfAddress = formOfAddress;
        this.age = age;
        this.hairColor = hairColor;
        this.clothColor = clothColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormOfAddress() {
        return formOfAddress;
    }

    public void setFormOfAddress(String formOfAddress) {
        this.formOfAddress = formOfAddress;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getClothColor() {
        return clothColor;
    }

    public void setClothColor(String clothColor) {
        this.clothColor = clothColor;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", formOfAddress='" + formOfAddress + '\'' +
                ", age='" + age + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", clothColor='" + clothColor + '\'' +
                '}';
    }
}
