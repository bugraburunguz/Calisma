package data;

public class UserDTO {
    public int userID;
    public String userName;
    public String userSurname;
    public int age;

    public UserDTO(int userID, String userName, String userSurname, int age) {
        this.userID = userID;
        this.userName = userName;
        this.userSurname = userSurname;
        this.age = age;
    }

    public String getUserList() {

        return "adi= " + userName + '\'' +
                "Soyadı= " + userSurname + '\'' +
                "Id= " + userID;
    }
}