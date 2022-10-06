public class Main {

    public static void main(String[] args) {
        //Referance referance= new Referance();
        // referance.sayi();
        //referance.array();
//
//        CreditManager creditManager = new CreditManager();
//        creditManager.Calculate();
//        creditManager.Save();
//
//        Customer customer = new Customer();//örneğini oluştumak, instance oluşturmak,instance creation
//        customer.setId(1);
//        customer.setCity("Ankara");
//
//
//        CustomerManager customerManager =new CustomerManager(customer);
//        customerManager.Save();
//        customerManager.Delete();
//
//        Company company =new Company();
//        company.setTaxNumber("10000");
//        company.setCompanyName("Arçelik");
//        company.setId(1000);
//
//        CustomerManager customerManager1 =new CustomerManager(new Person());
//
//        Person person =new Person();
//        person.setFirstName("Engin");
//        person.setLasName("Demiroğ");
//
//        Customer c1=new Customer();
//        Customer c2=new Person();
//        Customer c3=new Person();
//

        CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
        CustomerManager customerManager2 = new CustomerManager(new Customer(), new TeacherCreditManager());
        customerManager.GiveCredit();
        customerManager2.GiveCredit();


    }
}