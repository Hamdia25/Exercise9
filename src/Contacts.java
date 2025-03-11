abstract public class Contacts {
    private String name;

    public Contacts(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                '}';
    }
    public void contact(){

    }
}
class Email extends Contacts{
    private String email;

    public Email(String name, String email) {
        super(name);
        this.email = email;
    }
    public void contact(){
        System.out.println("Emailing " + email);
    }
}
class Phone extends Email{
    private String phone;

    public Phone(String name, String email, String phone) {
        super(name, email);
        this.phone = phone;
    }

    public void contact(){
        System.out.println("Calling " + phone);
    }
}
