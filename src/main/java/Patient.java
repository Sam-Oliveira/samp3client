import java.io.Serializable;

public class Patient implements Serializable {
    private String name;
    private int id;
    private int phoneNumber;

    public Patient(String name1,int id1, int phoneNumber1){
        name=name1;
        id=id1;
        phoneNumber=phoneNumber1;
    }
}
