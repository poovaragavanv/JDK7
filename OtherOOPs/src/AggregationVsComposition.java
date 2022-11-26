public class AggregationVsComposition {
 
    public static void main(String[] args) {
        People people = new People();
        people.setId(1);
        people.setName("Rahul");
        Accounts accounts = new Accounts();
        accounts.setType(1);
        accounts.setName("Company-Accounts");
        accounts.setBalance(100000);
        Organization organization = new Organization();
        organization.setName("KCE");
        organization.setCaption("AggregationVsComposition");
        organization.setAccounts(accounts);
        organization.setPeople(people);
        System.out.println("Organisation : "+organization);
    }
}
 
class Organization {
 
    private String name;
    private String caption;
    People people;  // uses People
    Accounts accounts; // owns Accounts
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getCaption() {
        return caption;
    }
 
    public void setCaption(String caption) {
        this.caption = caption;
    }
 
    public People getPeople() {
        return people;
    }
 
    public void setPeople(People people) {
        this.people = people;
    }
 
    public Accounts getAccounts() {
        return accounts;
    }
 
    public void setAccounts(Accounts accounts) {
        this.accounts = accounts;
    }
 
    @Override
    public String toString() {
        return "Organization{" + "name=" + name + ", caption=" + caption + ", people=" + people + ", accounts=" + accounts + '}';
    }
 
}
 
class People {
 
    private int id;
    private String name;
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    @Override
    public String toString() {
        return "People{" + "id=" + id + ", name=" + name + '}';
    }
 
}
 
class Accounts {
 
    private int type;
    private String name;
    private double balance;
 
    public int getType() {
        return type;
    }
 
    public void setType(int type) {
        this.type = type;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public double getBalance() {
        return balance;
    }
 
    public void setBalance(double balance) {
        this.balance = balance;
    }
 
    @Override
    public String toString() {
        return "Accounts{" + "type=" + type + ", name=" + name + ", balance=" + balance + '}';
    }
 
}