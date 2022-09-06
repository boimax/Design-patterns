/*
 * BUILDER PATTERN: separate the construction of a complex object from its representation so that the same construction process can create different representations.
 * 
 * 4 MAIN PARTS: 
 * 
 * 1. Product class: object with many attributes that we want to build
 * 
 * 2. Builder interface: 
 * - contains all abstract product's attribute method with return value: Builder interface 
 * - 1 abstract build() method with return value: Product()
 * 
 * 3. Concrete Builder: 
 * - implement specifically each product's attribute method with return value: Builder interface (return this;)
 * - implement build() method with return value: Product()
 * 
 * 4. Client:
 * - Use Builder interface to create new Concrete Builder class.set(attributes)
 * - product.build()
 */
public class StudentBuilderPattern {
    static class Student { // 1. PRODUCT
        private String id;
        private String firstName;
        private String lastName;
        private String dateOfBirth;
        private String currentClass;
        private String phone;

        public Student(String id, String firstName, String lastName, String dateOfBirth, String currentClass,
                String phone) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.dateOfBirth = dateOfBirth;
            this.currentClass = currentClass;
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "Student [currentClass=" + currentClass + ", dateOfBirth=" + dateOfBirth + ", firstName=" + firstName
                    + ", id=" + id + ", lastName=" + lastName + ", phone=" + phone + "]";
        }

    }

    public interface StudentBuilder { // 2. BUILDER INTERFACE
        StudentBuilder setID(String id);

        StudentBuilder setFirstName(String firstName); // MOST IMPORTANT 1: return value StudentBuilder

        StudentBuilder setLastName(String lastName);

        StudentBuilder setDateOfBirth(String dateOfBirth);

        StudentBuilder setCurrentClass(String currentClass);

        StudentBuilder setPhone(String phone);

        Student build(); // MOST IMPORTANT 2: return value Student() when build()

    }

    static class StudentConcreteBuilder implements StudentBuilder { // 3. CONCRETE BUILDER
        private String id;
        private String firstName;
        private String lastName;
        private String dateOfBirth;
        private String currentClass;
        private String phone;

        @Override
        public StudentBuilder setID(String id) {
            this.id = id;
            return this; // MOST IMPORTANT 3
        }

        @Override
        public StudentBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        @Override
        public StudentBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        @Override
        public StudentBuilder setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        @Override
        public StudentBuilder setCurrentClass(String currentClass) {
            this.currentClass = currentClass;
            return this;
        }

        @Override
        public StudentBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        @Override
        public Student build() { // MOST IMPORTANT 2.2
            return new Student(id, firstName, lastName, dateOfBirth, currentClass, phone);
        }

    }

    public static void main(String[] args) { // 4. DIRECTOR: CLIENT
        StudentBuilder studentBuilder = new StudentConcreteBuilder().setID("15996").setFirstName("Tuong")
                .setLastName("Ho").setCurrentClass("CS2019"); // MOST IMPORTANT 5
        System.out.println(studentBuilder.build());// MOST IMPORTANT 6
    }
}
