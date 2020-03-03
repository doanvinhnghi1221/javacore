public class ĐóngGói {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Test {
    public static void main(String[] args) {
        ĐóngGói s = new ĐóngGói();
        s.setName("Hai");
        System.out.println(s.getName());
    }
}
