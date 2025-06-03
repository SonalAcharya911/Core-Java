package dto;

public class RegistrationDto {
    private String name;
    private String password;
    private String email;
    private long contact;
    private long aadhar;
    private String address;
    private String country;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAadhar(long aadhar) {
        this.aadhar = aadhar;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public long getAadhar() {
        return aadhar;
    }

    public long getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }

    public String getCountry() {
        return country;
    }

    public String getPassword() {
        return password;
    }

}
