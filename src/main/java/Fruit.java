/**
 * @author Hxin
 * @describe
 * @since 2018/3/27 上午9:49
 */
public class Fruit {
    public String name;
    public Integer id;

    public Fruit(){}

    public Fruit(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
