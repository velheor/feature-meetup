package com.intexsoft.meetup.examples;

public class Examples {
    public static void main(String[] args) {
        
        String helloProgram = """
            public class Hello {
                public static void main(String[] args) {
                    System.out.printIn("Hello World!");
                }
            }""";
        System.out.println(helloProgram);

        
        
        String longLineText = """
            Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt \
            ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco \
            laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in \
            voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat \
            non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.""";
        System.out.println(longLineText);

        String query = """
            INSERT INTO Person(age, name)
            Values(%d, '%s')""".formatted(23, "Vlad");
        System.out.println(query);
    }
}
