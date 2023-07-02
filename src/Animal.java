import java.util.Random;

public class Animal {
    private String name;
    private int age;
    private int weight;
    private int length;
    protected static int number;
    protected static Random r;

    private int distance;
    private  int food;

    static {
        Animal.number = 0;
        Animal.r = new Random();
    }

    public Animal(String name, int age, int weight, int length) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.length = length;
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getInfo() {
        return String.format("Type: %s Name: %s Age: %d Weight: %d Length: %d",
                this.getClass().getSimpleName(), this.name, this.age, this.weight, this.length);
    }

    public String voice() {
        return  String.format("%s �������: ", this.name);
    }

    public String run(String name){
        int sprint = r.nextInt(10,1000);
        this.distance += sprint;
        return  String.format("%s ��������(�): %s. ����� ��������(�): %d",
//                this.getClass().getSimpleName(),
                name,    /** ��� ����� ����� �� ��������� ���-�� ����� ������ ������������� ���� */
                sprint,
                this.distance);
    }

    public void eat (){
        int ate = r.nextInt(10,100);
        this.food -= ate;
//      System.out.println(String.format("%s ���� %d ���, ����� ���� ��������: %d �����",
        System.out.println(String.format("%s ���� %d ���",
                this.name,
                ate));
//                this.food));
    }             /** �� ���� ���������� ��� ��������� ������������ �������� ��� ���, �����
                        ����� ���� ��������� ��� � ��������� ������� �������� � ����� */

}
