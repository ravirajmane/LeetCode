
interface Age {

    void getAge();
}

// Main class
class AnonymousDemo {

    // Main driver method
    public static void main(String[] args) {
        int x = 213;
        // Myclass is hidden inner class of Age interface
        // whose name is not written but an object to it
        // is created.
        Age oj1 = new Age() {

            @Override
            public void getAge() {
                // printing age
                System.out.print("Age is " + x);
            }
        };

        oj1.getAge();
    }
}