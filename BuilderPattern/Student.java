package BuilderPattern;

public class Student {
    
    private final int id;
    private final int age;
    private final String name;
    private final int gradYear;
    private final String phoneNumber;
    private final String batchName;
    private final double psp;
    
    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getGradYear() {
        return gradYear;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBatchName() {
        return batchName;
    }

    public double getPsp() {
        return psp;
    }

    public static Builder builder() {
        return new Builder();
    }

    private Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.batchName = builder.batchName;
        this.age = builder.age;
        this.gradYear = builder.gradYear;
        this.phoneNumber = builder.phoneNumber;
        this.psp = builder.psp;
    }


    static class Builder {
        private int age;
        private String name;
        private int gradYear;
        private String phoneNumber;
        private int id;
        private String batchName;
        private double psp;

        public Builder Age(int age) {
            this.age = age;
            return this;
        }

        public Builder Name(String name) {
            this.name = name;
            return this;
        }

        public Builder GradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder PhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder Id(int id) {
            this.id = id;
            return this;
        }

        public Builder BatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }

        public Builder Psp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder() {}

        public Student build() {
            validate(this);
            return new Student(this);
        }

        private void validate(Builder builder) {
            if(builder.age < 20) {
                throw new InvalidAgeException("Age can not be les than 20");
            }
            if(builder.gradYear > 2024) {
                throw new InvalidGradYearException("Grad year can not be more than 2024");
            }
        }
    }
}



