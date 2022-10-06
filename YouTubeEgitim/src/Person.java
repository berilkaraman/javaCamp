public class Person extends Customer{
    private String NationalIdentity;
    private String FirstName;
    private String LasName;
    public String getNationalIdentity() {
        return NationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        NationalIdentity = nationalIdentity;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLasName() {
        return LasName;
    }

    public void setLasName(String lasName) {
        LasName = lasName;
    }

}
