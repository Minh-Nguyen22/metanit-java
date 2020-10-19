package oop.inner_and_nested_classes;

public class Person {

    private String name;
    Account account;

    public Person(String name, String password) {
        this.name = name;
        account = new Account(password);
    }

    public void displayPerson(){
        System.out.printf("Person \t Name: \t Password: %s \n", name, account.password);
    }

    public class Account{

        private String password;

        Account(String password){
            this.password = password;
        }

        void displayAccount() {
            System.out.printf("Account Login: %s \t Password: %s \n", Person.this.name, password);
        }
    }
}
