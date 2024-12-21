package lab2;

public class User {
    private Integer id;
    private String name;
    private String post;
    private String experience;

    public User() {
    }

    public User(Integer id, String name, String post, String experience) {
        this.id = id;
        this.name = name;
        this.post = post;
        this.experience = experience;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }
}
