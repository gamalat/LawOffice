
package model;


public class lawyer {
    private String lawyer_id;
    private String first_name;
    private String last_name;
    private String phone;
    private String address;
    private String email;
    private int age;
    private String ssn ;
    private String password;

public lawyer(String lawyer_id, String first_name, String last_name,String ssn , String phone, String address, String email, int age , String password ) {
        this.lawyer_id = lawyer_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.ssn = ssn;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.age = age;
        this.password = password;
    
}

    public lawyer() {
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   

    public String getLawyer_id() {
        return lawyer_id;
    }

    public void setLawyer_id(String lawyer_id) {
        this.lawyer_id = lawyer_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String llast_name) {
        this.last_name = last_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    

}