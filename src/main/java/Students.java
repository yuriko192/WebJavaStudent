import lombok.Getter;

public class Students {
    @Getter private Integer id;
    @Getter private String nim;
    @Getter private String fullname;
    @Getter private String address;

    public Students(Integer id, String nim, String fullanem, String address) {
        this.id = id;
        this.nim = nim;
        this.fullname = fullanem;
        this.address = address;
    }
}
