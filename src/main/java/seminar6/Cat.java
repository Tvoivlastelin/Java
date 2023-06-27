package seminar6;

import java.util.Objects;

public class Cat {
        private String name;
        private String color;
        private Double weight;
        private int age;

        public Cat(String name, String color, double weight, int age) {
            this.name = name;
            this.color = color;
            this.weight = weight;
            this.age = age;

        }

        public void printName() {
            System.out.println(this.name);
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    ", weight=" + weight + "Kg" +
                    ", age=" + age +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Cat cat = (Cat) o;
            return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(color, cat.color) && Objects.equals(weight, cat.weight);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, color, weight, age);
        }
    }


