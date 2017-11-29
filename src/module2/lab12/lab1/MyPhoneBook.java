package module2.lab12.lab1;

import java.util.Arrays;
import java.util.Comparator;


public class MyPhoneBook {

    private PhoneNumbers[] phoneNumbers = new PhoneNumbers[10];
    private int counterOfArray;

    public void addPhoneNumbers(String name, String number) {
        phoneNumbers[counterOfArray] = new PhoneNumbers(name, number);
        counterOfArray++;
    }

    public void printPhoneBook() {
        for (PhoneNumbers p : phoneNumbers) {
            if (p != null)
                System.out.println(p);
        }
    }

    public void sortByName() {
        Arrays.sort(this.phoneNumbers, new Comparator<PhoneNumbers>() {
            @Override
            public int compare(PhoneNumbers o1, PhoneNumbers o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public void sortByNumber() {
        Arrays.sort(this.phoneNumbers, new Comparator<PhoneNumbers>() {
            @Override
            public int compare(PhoneNumbers o1, PhoneNumbers o2) {
                return o1.getPhone().compareTo(o2.getPhone());
            }
        });
    }


    static class PhoneNumbers {
        private String name;
        private String phone;

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        public PhoneNumbers(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "PhoneNumber: " +
                    "name - " + name +
                    ", phone - " + phone;
        }

    }
}
